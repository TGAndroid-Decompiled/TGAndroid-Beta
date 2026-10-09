package x9;

import java.io.InputStream;
import java.io.RandomAccessFile;
public final class h extends InputStream {
    public int f51086a;
    public int f51087b;
    public final j f51088c;

    public h(j jVar, g gVar) {
        this.f51088c = jVar;
        this.f51086a = jVar.d(gVar.f51084a + 4);
        this.f51087b = gVar.f51085b;
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        if (bArr != null) {
            if ((i10 | i11) >= 0 && i11 <= bArr.length - i10) {
                int i12 = this.f51087b;
                if (i12 > 0) {
                    if (i11 > i12) {
                        i11 = i12;
                    }
                    int i13 = this.f51086a;
                    j jVar = this.f51088c;
                    RandomAccessFile randomAccessFile = jVar.f51089a;
                    int d = jVar.d(i13);
                    int i14 = d + i11;
                    int i15 = jVar.f51090b;
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
                    this.f51086a = jVar.d(this.f51086a + i11);
                    this.f51087b -= i11;
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
        if (this.f51087b == 0) {
            return -1;
        }
        j jVar = this.f51088c;
        jVar.f51089a.seek(this.f51086a);
        int read = jVar.f51089a.read();
        this.f51086a = jVar.d(this.f51086a + 1);
        this.f51087b--;
        return read;
    }
}
