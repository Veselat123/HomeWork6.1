public class Weapon {
    private String laser;
    private String LA01;
    private String nuclear;
    private String NU01;
    private String signal;
    private String SI01;
    public String getLaser() {
        return laser;}
    public String getNuclear() {
        return nuclear;}
    public String getSignal() {
        return signal;}
    public String getLA01() {
        return LA01;}
    public String getNU01() {
        return NU01;}
    public String getSI01() {
        return SI01;}
    public void setLaser(String laser) {
        this.laser = laser;}
    public void setNuclear(String nuclear) {
        this.nuclear = nuclear;}
    public void setSignal(String signal) {
        this.signal = signal;}
    public void setLA01(String LA01) {
        this.LA01 = LA01;}
    public void setNU01(String NU01) {
        this.NU01 = NU01;}
    public void setSI01(String SI01) {
        this.SI01 = SI01;}
    String code;

    Weapon(String m1) {
        this.code =m1;
    }

    public String getM1() {
        return code;
    }

}
