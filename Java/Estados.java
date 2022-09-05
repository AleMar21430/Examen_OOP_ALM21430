public class Estados implements NewInterface{
    private boolean AM = false;
    private int Frequency_AM = 0;
    private float Frequency_FM = 0.0f;
    
    public void setAM(boolean new_AM) {
            AM = new_AM;
    }
    public void setFrequency_AM(int frequency_AM) {
            Frequency_AM = frequency_AM;
    }
    public void setFrequency_FM(float frequency_FM) {
            Frequency_FM = frequency_FM;
    }
    
    public boolean getAM(){
        return AM;
    }
    public int getAM_Frequency(){
        return Frequency_AM;
    }
    public float getFM_Frequency(){
        return Frequency_FM;
    }
}