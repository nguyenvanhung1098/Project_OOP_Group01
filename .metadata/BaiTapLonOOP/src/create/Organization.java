package create;

public class Organization extends ThucThe {
    private String truSo;

    public Organization() {
        
    }

    public Organization(String truSo, String m_DinhDanh, String m_NhanHienThi, String m_MoTa, NguonGoc m_NguonGoc) {
        super(m_DinhDanh, m_NhanHienThi, m_MoTa, m_NguonGoc);
        this.setTruSo(truSo);
    }

	@Override
    public void ThemVaoDB() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

	public String getTruSo() {
		return truSo;
	}

	public void setTruSo(String truSo) {
		this.truSo = truSo;
	}
    
    
}

