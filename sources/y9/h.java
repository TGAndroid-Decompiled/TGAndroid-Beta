package y9;

import java.io.InputStream;
import java.io.RandomAccessFile;
public final class h extends InputStream {
    public int f54337a;
    public int f54338b;
    public final j f54339c;

    public h(j jVar, g gVar) {
        this.f54339c = jVar;
        this.f54337a = jVar.d(gVar.f54335a + 4);
        this.f54338b = gVar.f54336b;
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        if (bArr != null) {
            if ((i10 | i11) >= 0 && i11 <= bArr.length - i10) {
                int i12 = this.f54338b;
                if (i12 > 0) {
                    if (i11 > i12) {
                        i11 = i12;
                    }
                    int i13 = this.f54337a;
                    j jVar = this.f54339c;
                    RandomAccessFile randomAccessFile = jVar.f54340a;
                    int d = jVar.d(i13);
                    int i14 = d + i11;
                    int i15 = jVar.f54341b;
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
                    this.f54337a = jVar.d(this.f54337a + i11);
                    this.f54338b -= i11;
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
        if (this.f54338b == 0) {
            return -1;
        }
        j jVar = this.f54339c;
        jVar.f54340a.seek(this.f54337a);
        int read = jVar.f54340a.read();
        this.f54337a = jVar.d(this.f54337a + 1);
        this.f54338b--;
        return read;
    }
}
