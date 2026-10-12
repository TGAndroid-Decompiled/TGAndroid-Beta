package y9;

import java.io.InputStream;
import java.io.RandomAccessFile;
public final class h extends InputStream {
    public int f48715a;
    public int f48716b;
    public final j f48717c;

    public h(j jVar, g gVar) {
        this.f48717c = jVar;
        this.f48715a = jVar.d(gVar.f48713a + 4);
        this.f48716b = gVar.f48714b;
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        if (bArr != null) {
            if ((i10 | i11) >= 0 && i11 <= bArr.length - i10) {
                int i12 = this.f48716b;
                if (i12 > 0) {
                    if (i11 > i12) {
                        i11 = i12;
                    }
                    int i13 = this.f48715a;
                    j jVar = this.f48717c;
                    RandomAccessFile randomAccessFile = jVar.f48718a;
                    int d = jVar.d(i13);
                    int i14 = d + i11;
                    int i15 = jVar.f48719b;
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
                    this.f48715a = jVar.d(this.f48715a + i11);
                    this.f48716b -= i11;
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
        if (this.f48716b == 0) {
            return -1;
        }
        j jVar = this.f48717c;
        jVar.f48718a.seek(this.f48715a);
        int read = jVar.f48718a.read();
        this.f48715a = jVar.d(this.f48715a + 1);
        this.f48716b--;
        return read;
    }
}
