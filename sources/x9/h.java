package x9;

import java.io.InputStream;
import java.io.RandomAccessFile;
public final class h extends InputStream {
    public int f45716a;
    public int f45717b;
    public final j f45718c;

    public h(j jVar, g gVar) {
        this.f45718c = jVar;
        this.f45716a = jVar.d(gVar.f45714a + 4);
        this.f45717b = gVar.f45715b;
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        if (bArr != null) {
            if ((i10 | i11) >= 0 && i11 <= bArr.length - i10) {
                int i12 = this.f45717b;
                if (i12 > 0) {
                    if (i11 > i12) {
                        i11 = i12;
                    }
                    int i13 = this.f45716a;
                    j jVar = this.f45718c;
                    RandomAccessFile randomAccessFile = jVar.f45719a;
                    int d = jVar.d(i13);
                    int i14 = d + i11;
                    int i15 = jVar.f45720b;
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
                    this.f45716a = jVar.d(this.f45716a + i11);
                    this.f45717b -= i11;
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
        if (this.f45717b == 0) {
            return -1;
        }
        j jVar = this.f45718c;
        jVar.f45719a.seek(this.f45716a);
        int read = jVar.f45719a.read();
        this.f45716a = jVar.d(this.f45716a + 1);
        this.f45717b--;
        return read;
    }
}
