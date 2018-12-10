package create;

import java.sql.Date;

public class NguonGoc {
    String m_Link;
    Date  m_NgayTRichRut;
    public NguonGoc() {
    }

    public NguonGoc(String m_Link, Date m_NgayTRichRut) {
        this.m_Link = m_Link;
        this.m_NgayTRichRut = m_NgayTRichRut;
    }

    public String getM_Link() {
        return m_Link;
    }

    public void setM_Link(String m_Link) {
        this.m_Link = m_Link;
    }

    public Date getM_NgayTRichRut() {
        return m_NgayTRichRut;
    }

    public void setM_NgayTRichRut(Date m_NgayTRichRut) {
        this.m_NgayTRichRut = m_NgayTRichRut;
    }
    
}

