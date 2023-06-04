import java.math.BigDecimal;
import java.math.RoundingMode;

public class TienNuoc {
    private double giaBanNuoc;
    private int soNuocSuDung = 0;

    public TienNuoc(int soNuocSuDung) {
        this.soNuocSuDung = soNuocSuDung;
        init();
    }

    private void init() {
        if (soNuocSuDung <= 10) {
            this.giaBanNuoc = 5973;
        }
        if (soNuocSuDung > 10 && soNuocSuDung <= 20) {
            this.giaBanNuoc = 7052;
        }
        if (soNuocSuDung > 20 && soNuocSuDung <= 30) {
            this.giaBanNuoc = 8669;
        }
        if (soNuocSuDung > 30) {
            this.giaBanNuoc = 15929;
        }
    }
    public String tinhTienNuoc(){
        double result = (this.giaBanNuoc * this.soNuocSuDung) * 1.15;
        BigDecimal bd = BigDecimal.valueOf(result);
        bd = bd.setScale(0, RoundingMode.UP);
        return String.valueOf(bd);
    }
}
