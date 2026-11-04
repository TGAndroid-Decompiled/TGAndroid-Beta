package x7;

import java.io.DataInputStream;
public abstract class t5 {
    public static float[] a(DataInputStream dataInputStream) {
        int readInt = dataInputStream.readInt();
        float[] fArr = new float[readInt];
        for (int i3 = 0; i3 < readInt; i3++) {
            fArr[i3] = dataInputStream.readFloat();
        }
        return fArr;
    }
}
