package ue;

import android.graphics.Bitmap;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.RandomAccessFile;
import we.l;
public abstract class a {
    public String f49173a;
    public long f49174b;
    public String f49175c;
    public String d;
    public String f49176e;
    public String f49177f;
    public short f49178g;
    public String h;
    public String f49179i;
    public short f49180j;
    public short f49181k;
    public String f49182l;
    public String f49183m;
    public String f49184n;
    public Bitmap f49185o;
    public Bitmap f49186p;
    public File f49187q;

    public static a a(File file) {
        byte b10;
        try {
            byte[] bArr = new byte[12];
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
            randomAccessFile.readFully(bArr, 0, 8);
            randomAccessFile.close();
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            if (bArr[4] == 102 && bArr[5] == 116 && bArr[6] == 121 && bArr[7] == 112) {
                return new ve.a(bufferedInputStream);
            }
            if (bArr[0] == 102 && bArr[1] == 76 && bArr[2] == 97 && bArr[3] == 99) {
                b bVar = new b(file);
                if (!bVar.f49189s) {
                    return bVar;
                }
                return null;
            }
            if (!file.getAbsolutePath().endsWith("mp3") && (((b10 = bArr[0]) != 73 || bArr[1] != 68 || bArr[2] != 51) && (b10 != 84 || bArr[1] != 65 || bArr[2] != 71))) {
                b bVar2 = new b(file);
                if (!bVar2.f49189s) {
                    return bVar2;
                }
                return null;
            }
            return new l(bufferedInputStream, file.length());
        } catch (Exception unused) {
            return null;
        }
    }
}
