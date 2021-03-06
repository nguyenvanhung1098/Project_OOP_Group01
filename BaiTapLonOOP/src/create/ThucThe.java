package create;

public abstract class ThucThe {
    protected String m_DinhDanh;
    protected String m_NhanHienThi;
    protected String m_MoTa;
    protected NguonGoc m_NguonGoc;

    public ThucThe() {
    }

    public ThucThe(String m_DinhDanh, String m_NhanHienThi, String m_MoTa, NguonGoc m_NguonGoc) {
        this.m_DinhDanh = m_DinhDanh;
        this.m_NhanHienThi = m_NhanHienThi;
        this.m_MoTa = m_MoTa;
        this.m_NguonGoc = m_NguonGoc;
    }

    public String getM_DinhDanh() {
        return m_DinhDanh;
    }

    public void setM_DinhDanh(String m_DinhDanh) {
        this.m_DinhDanh = m_DinhDanh;
    }

    public String getM_NhanHienThi() {
        return m_NhanHienThi;
    }

    public void setM_NhanHienThi(String m_NhanHienThi) {
        this.m_NhanHienThi = m_NhanHienThi;
    }

    public String getM_MoTa() {
        return m_MoTa;
    }

    public void setM_MoTa(String m_MoTa) {
        this.m_MoTa = m_MoTa;
    }

    public NguonGoc getM_NguonGoc() {
        return m_NguonGoc;
    }

    public abstract void ThemVaoDB();
    
}