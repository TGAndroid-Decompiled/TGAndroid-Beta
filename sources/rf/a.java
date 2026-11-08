package rf;

import android.graphics.Bitmap;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.RandomAccessFile;
import tf.l;
public abstract class a {
    public String f54514a;
    public long f54515b;
    public String f54516c;
    public String d;
    public String f54517e;
    public String f54518f;
    public short f54519g;
    public String h;
    public String f54520i;
    public short f54521j;
    public short f54522k;
    public String f54523l;
    public String f54524m;
    public String f54525n;
    public Bitmap f54526o;
    public Bitmap f54527p;
    public File f54528q;

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
                if (!cVar.f54530s) {
                    return cVar;
                }
                return null;
            }
            if (!file.getAbsolutePath().endsWith("mp3") && (((b10 = bArr[0]) != 73 || bArr[1] != 68 || bArr[2] != 51) && (b10 != 84 || bArr[1] != 65 || bArr[2] != 71))) {
                c cVar2 = new c(file);
                if (!cVar2.f54530s) {
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
