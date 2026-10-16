package y9;

import java.io.InputStream;
import java.io.RandomAccessFile;
public final class h extends InputStream {
    public int f48714a;
    public int f48715b;
    public final j f48716c;

    public h(j jVar, g gVar) {
        this.f48716c = jVar;
        this.f48714a = jVar.d(gVar.f48712a + 4);
        this.f48715b = gVar.f48713b;
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        if (bArr != null) {
            if ((i10 | i11) >= 0 && i11 <= bArr.length - i10) {
                int i12 = this.f48715b;
                if (i12 > 0) {
                    if (i11 > i12) {
                        i11 = i12;
                    }
                    int i13 = this.f48714a;
                    j jVar = this.f48716c;
                    RandomAccessFile randomAccessFile = jVar.f48717a;
                    int d = jVar.d(i13);
                    int i14 = d + i11;
                    int i15 = jVar.f48718b;
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
                    this.f48714a = jVar.d(this.f48714a + i11);
                    this.f48715b -= i11;
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
        if (this.f48715b == 0) {
            return -1;
        }
        j jVar = this.f48716c;
        jVar.f48717a.seek(this.f48714a);
        int read = jVar.f48717a.read();
        this.f48714a = jVar.d(this.f48714a + 1);
        this.f48715b--;
        return read;
    }
}
