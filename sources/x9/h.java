package x9;

import java.io.InputStream;
import java.io.RandomAccessFile;
public final class h extends InputStream {
    public int f51088a;
    public int f51089b;
    public final j f51090c;

    public h(j jVar, g gVar) {
        this.f51090c = jVar;
        this.f51088a = jVar.d(gVar.f51086a + 4);
        this.f51089b = gVar.f51087b;
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        if (bArr != null) {
            if ((i10 | i11) >= 0 && i11 <= bArr.length - i10) {
                int i12 = this.f51089b;
                if (i12 > 0) {
                    if (i11 > i12) {
                        i11 = i12;
                    }
                    int i13 = this.f51088a;
                    j jVar = this.f51090c;
                    RandomAccessFile randomAccessFile = jVar.f51091a;
                    int d = jVar.d(i13);
                    int i14 = d + i11;
                    int i15 = jVar.f51092b;
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
                    this.f51088a = jVar.d(this.f51088a + i11);
                    this.f51089b -= i11;
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
        if (this.f51089b == 0) {
            return -1;
        }
        j jVar = this.f51090c;
        jVar.f51091a.seek(this.f51088a);
        int read = jVar.f51091a.read();
        this.f51088a = jVar.d(this.f51088a + 1);
        this.f51089b--;
        return read;
    }
}
