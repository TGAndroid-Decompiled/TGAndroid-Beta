package ve;

import android.graphics.Bitmap;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.RandomAccessFile;
import xe.m;
public abstract class a {
    public String f45736a;
    public long f45737b;
    public String f45738c;
    public String d;
    public String e;
    public String f45739f;
    public short f45740g;
    public String h;
    public String f45741i;
    public short f45742j;
    public short f45743k;
    public String f45744l;
    public String f45745m;
    public String f45746n;
    public Bitmap f45747o;
    public Bitmap f45748p;
    public File f45749q;

    public static a a(File file) {
        byte b10;
        try {
            byte[] bArr = new byte[12];
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
            randomAccessFile.readFully(bArr, 0, 8);
            randomAccessFile.close();
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            if (bArr[4] == 102 && bArr[5] == 116 && bArr[6] == 121 && bArr[7] == 112) {
                return new we.a(bufferedInputStream);
            }
            if (bArr[0] == 102 && bArr[1] == 76 && bArr[2] == 97 && bArr[3] == 99) {
                b bVar = new b(file);
                if (!bVar.f45751s) {
                    return bVar;
                }
                return null;
            }
            if (!file.getAbsolutePath().endsWith("mp3") && (((b10 = bArr[0]) != 73 || bArr[1] != 68 || bArr[2] != 51) && (b10 != 84 || bArr[1] != 65 || bArr[2] != 71))) {
                b bVar2 = new b(file);
                if (!bVar2.f45751s) {
                    return bVar2;
                }
                return null;
            }
            return new m(bufferedInputStream, file.length());
        } catch (Exception unused) {
            return null;
        }
    }
}
