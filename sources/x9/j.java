package x9;

import b2.p;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;
public final class j implements Closeable {
    public static final Logger h = Logger.getLogger(j.class.getName());
    public final RandomAccessFile f45063a;
    public final int f45064b;
    public final int f45065c;
    public final g d;
    public final g e;
    public final byte[] f45066f = new byte[16];

    public j(File file) {
        if (!file.exists()) {
            File file2 = new File(file.getPath() + ".tmp");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rwd");
            try {
                randomAccessFile.setLength(4096L);
                randomAccessFile.seek(0L);
                byte[] bArr = new byte[16];
                int[] iArr = {4096, 0, 0, 0};
                int i10 = 0;
                for (int i11 = 0; i11 < 4; i11++) {
                    int i12 = iArr[i11];
                    bArr[i10] = (byte) (i12 >> 24);
                    bArr[i10 + 1] = (byte) (i12 >> 16);
                    bArr[i10 + 2] = (byte) (i12 >> 8);
                    bArr[i10 + 3] = (byte) i12;
                    i10 += 4;
                }
                randomAccessFile.write(bArr);
                randomAccessFile.close();
                if (!file2.renameTo(file)) {
                    throw new IOException("Rename failed!");
                }
            } catch (Throwable th2) {
                randomAccessFile.close();
                throw th2;
            }
        }
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rwd");
        this.f45063a = randomAccessFile2;
        randomAccessFile2.seek(0L);
        byte[] bArr2 = this.f45066f;
        randomAccessFile2.readFully(bArr2);
        int c10 = c(0, bArr2);
        this.f45064b = c10;
        if (c10 <= randomAccessFile2.length()) {
            this.f45065c = c(4, bArr2);
            int c11 = c(8, bArr2);
            int c12 = c(12, bArr2);
            this.d = b(c11);
            this.e = b(c12);
            return;
        }
        throw new IOException("File is truncated. Expected length: " + this.f45064b + ", Actual length: " + randomAccessFile2.length());
    }

    public static int c(int i10, byte[] bArr) {
        return ((bArr[i10] & 255) << 24) + ((bArr[i10 + 1] & 255) << 16) + ((bArr[i10 + 2] & 255) << 8) + (bArr[i10 + 3] & 255);
    }

    public final synchronized void a(i iVar) {
        int i10 = this.d.f45058a;
        for (int i11 = 0; i11 < this.f45065c; i11++) {
            g b10 = b(i10);
            iVar.a(new h(this, b10), b10.f45059b);
            i10 = d(b10.f45058a + 4 + b10.f45059b);
        }
    }

    public final g b(int i10) {
        if (i10 == 0) {
            return g.f45057c;
        }
        RandomAccessFile randomAccessFile = this.f45063a;
        randomAccessFile.seek(i10);
        return new g(i10, randomAccessFile.readInt());
    }

    @Override
    public final synchronized void close() {
        this.f45063a.close();
    }

    public final int d(int i10) {
        int i11 = this.f45064b;
        if (i10 < i11) {
            return i10;
        }
        return (i10 + 16) - i11;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(j.class.getSimpleName());
        sb2.append("[fileLength=");
        sb2.append(this.f45064b);
        sb2.append(", size=");
        sb2.append(this.f45065c);
        sb2.append(", first=");
        sb2.append(this.d);
        sb2.append(", last=");
        sb2.append(this.e);
        sb2.append(", element lengths=[");
        try {
            a(new p(sb2));
        } catch (IOException e) {
            h.log(Level.WARNING, "read error", (Throwable) e);
        }
        sb2.append("]]");
        return sb2.toString();
    }
}
