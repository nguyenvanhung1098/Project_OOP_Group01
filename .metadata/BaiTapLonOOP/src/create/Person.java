package create;

public class Person extends ThucThe{
    private String chucVu;

    public Person() {
    }

    public Person(String chucVu, String m_DinhDanh, String m_NhanHienThi, String m_MoTa, NguonGoc m_NguonGoc) {
        super(m_DinhDanh, m_NhanHienThi, m_MoTa, m_NguonGoc);
        this.setChucVu(chucVu);
    }

    @Override
    public void ThemVaoDB() {
        //To change body of generated methods, choose Tools | Templates.
    }

	public String getChucVu() {
		return chucVu;
	}

	public void setChucVu(String chucVu) {
		this.chucVu = chucVu;
	}
    
    
}
