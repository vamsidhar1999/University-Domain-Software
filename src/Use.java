/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author VAMSI
 */
class Use {
    private String REG_NO,NAME,PHONE_NO,CITY,DEPARTMENT_ID;
    public Use(String REG_NO,String NAME,String PHONE_NO,String CITY,String DEPARTMENT_ID){
        this.REG_NO=REG_NO;
        this.NAME=NAME;
        this.PHONE_NO=PHONE_NO;
        this.CITY=CITY;
        this.DEPARTMENT_ID=DEPARTMENT_ID;
    }
    public String getREG_NO()
    {
        return REG_NO;
    }
    public String getNAME()
    {
        return NAME;
    }
    public String getPHONE_NO()
    {
        return PHONE_NO;
    }
    public String getCITY()
    {
        return CITY;
    }
    public String getDepartment_id()
    {
        return DEPARTMENT_ID;
    }
}