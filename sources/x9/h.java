package x9;

import java.io.InputStream;
import java.io.RandomAccessFile;
public final class h extends InputStream {
    public int f49810a;
    public int f49811b;
    public final j f49812c;

    public h(j jVar, g gVar) {
        this.f49812c = jVar;
        this.f49810a = jVar.d(gVar.f49808a + 4);
        this.f49811b = gVar.f49809b;
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        if (bArr != null) {
            if ((i10 | i11) >= 0 && i11 <= bArr.length - i10) {
                int i12 = this.f49811b;
                if (i12 > 0) {
                    if (i11 > i12) {
                        i11 = i12;
                    }
                    int i13 = this.f49810a;
                    j jVar = this.f49812c;
                    RandomAccessFile randomAccessFile = jVar.f49813a;
                    int d = jVar.d(i13);
                    int i14 = d + i11;
                    int i15 = jVar.f49814b;
                    if (i14 <= i15) {
                        randomAccessFile.seek(d);
                        randomAccessFile.readFully(bArr, i10, i11);
                    } else {
                        int i16 = i15 - d;
                        randomAccessFile.seek(d);
                        randomAccessFile.readFully(bArr, i10, i16);
                        randomAccessFile.seek(16L);
                        randomAccessFile.readFully(bArr, i10 + i16, i11 - i16);
                    }
                    this.f49810a = jVar.d(this.f49810a + i11);
                    this.f49811b -= i11;
                    return i11;
                }
                return -1;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
        throw new NullPointerException("buffer");
    }

    @Override
    public final int read() {
        if (this.f49811b == 0) {
            return -1;
        }
        j jVar = this.f49812c;
        jVar.f49813a.seek(this.f49810a);
        int read = jVar.f49813a.read();
        this.f49810a = jVar.d(this.f49810a + 1);
        this.f49811b--;
        return read;
    }
}
