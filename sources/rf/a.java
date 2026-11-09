package rf;

import android.graphics.Bitmap;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.RandomAccessFile;
import tf.l;
public abstract class a {
    public String f54527a;
    public long f54528b;
    public String f54529c;
    public String d;
    public String f54530e;
    public String f54531f;
    public short f54532g;
    public String h;
    public String f54533i;
    public short f54534j;
    public short f54535k;
    public String f54536l;
    public String f54537m;
    public String f54538n;
    public Bitmap f54539o;
    public Bitmap f54540p;
    public File f54541q;

    public static a a(File file) {
        byte b10;
        try {
            byte[] bArr = new byte[12];
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
            randomAccessFile.readFully(bArr, 0, 8);
            randomAccessFile.close();
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            if (bArr[4] == 102 && bArr[5] == 116 && bArr[6] == 121 && bArr[7] == 112) {
                return new sf.a(bufferedInputStream);
            }
            if (bArr[0] == 102 && bArr[1] == 76 && bArr[2] == 97 && bArr[3] == 99) {
                c cVar = new c(file);
                if (!cVar.f54543s) {
                    return cVar;
                }
                return null;
            }
            if (!file.getAbsolutePath().endsWith("mp3") && (((b10 = bArr[0]) != 73 || bArr[1] != 68 || bArr[2] != 51) && (b10 != 84 || bArr[1] != 65 || bArr[2] != 71))) {
                c cVar2 = new c(file);
                if (!cVar2.f54543s) {
                    return cVar2;
                }
                return null;
            }
            return new l(bufferedInputStream, file.length());
        } catch (Exception unused) {
            return null;
        }
    }
}
