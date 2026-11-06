package rf;

import android.graphics.Bitmap;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.RandomAccessFile;
import tf.l;
public abstract class a {
    public String f54398a;
    public long f54399b;
    public String f54400c;
    public String d;
    public String f54401e;
    public String f54402f;
    public short f54403g;
    public String h;
    public String f54404i;
    public short f54405j;
    public short f54406k;
    public String f54407l;
    public String f54408m;
    public String f54409n;
    public Bitmap f54410o;
    public Bitmap f54411p;
    public File f54412q;

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
                if (!cVar.f54414s) {
                    return cVar;
                }
                return null;
            }
            if (!file.getAbsolutePath().endsWith("mp3") && (((b10 = bArr[0]) != 73 || bArr[1] != 68 || bArr[2] != 51) && (b10 != 84 || bArr[1] != 65 || bArr[2] != 71))) {
                c cVar2 = new c(file);
                if (!cVar2.f54414s) {
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
