package create;

public class Country extends ThucThe {
    private String thuDo;
    public Country() {
    }

    public Country(String thuDo, String m_DinhDanh, String m_NhanHienThi, String m_MoTa, NguonGoc m_NguonGoc) {
        super(m_DinhDanh, m_NhanHienThi, m_MoTa, m_NguonGoc);
        this.thuDo = thuDo;
    }

    public String getThuDo() {
        return thuDo;
    }

    public void setThuDo(String thuDo) {
        this.thuDo = thuDo;
    }

    @Override
    public void ThemVaoDB() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}