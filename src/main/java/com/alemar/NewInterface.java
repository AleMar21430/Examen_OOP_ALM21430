package com.alemar;
/**
 *
 * @author marti
 */
public interface NewInterface {
    public void setAM(boolean new_AM); 
    public void setFrequency_AM(int frequency_AM); 
    public void setFrequency_FM(float frequency_FM); 
    public boolean getAM();
    public int getAM_Frequency();
    public float getFM_Frequency();
}
