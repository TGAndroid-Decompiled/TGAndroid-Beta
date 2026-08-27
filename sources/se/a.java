package se;

import android.graphics.Bitmap;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.RandomAccessFile;
import ue.l;

public abstract class a {

    public String f47857a;

    public long f47858b;

    public String f47859c;
    public String d;

    public String f47860e;

    public String f47861f;

    public short f47862g;
    public String h;

    public String f47863i;

    public short f47864j;

    public short f47865k;

    public String f47866l;

    public String f47867m;

    public String f47868n;

    public Bitmap f47869o;

    public Bitmap f47870p;

    public File f47871q;

    public static a a(File file) {
        byte b10;
        try {
            byte[] bArr = new byte[12];
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
            randomAccessFile.readFully(bArr, 0, 8);
            randomAccessFile.close();
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            if (bArr[4] == 102 && bArr[5] == 116 && bArr[6] == 121 && bArr[7] == 112) {
                return new te.a(bufferedInputStream);
            }
            if (bArr[0] == 102 && bArr[1] == 76 && bArr[2] == 97 && bArr[3] == 99) {
                b bVar = new b(file);
                if (bVar.f47873s) {
                    return null;
                }
                return bVar;
            }
            if (!file.getAbsolutePath().endsWith("mp3") && (((b10 = bArr[0]) != 73 || bArr[1] != 68 || bArr[2] != 51) && (b10 != 84 || bArr[1] != 65 || bArr[2] != 71))) {
                b bVar2 = new b(file);
                if (bVar2.f47873s) {
                    return null;
                }
                return bVar2;
            }
            return new l(bufferedInputStream, file.length());
        } catch (Exception unused) {
            return null;
        }
    }
}
