package zadania.pierwszydzien;

public class SprawdzatorLiczbPierwszych {

    private int[] liczbyPierwsze;

    public SprawdzatorLiczbPierwszych(int[] liczbyPierwsze) {
        this.liczbyPierwsze = liczbyPierwsze;
    }

    public boolean czyPierwsza(int a){
        boolean isEqual = false;
        for (int i : liczbyPierwsze) {
            if(i==a){
                return true;
            }
        }
        return isEqual;
    }
}
