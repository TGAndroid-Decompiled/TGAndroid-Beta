package y9;

import java.io.InputStream;
import java.io.RandomAccessFile;
public final class h extends InputStream {
    public int f50144a;
    public int f50145b;
    public final j f50146c;

    public h(j jVar, g gVar) {
        this.f50146c = jVar;
        this.f50144a = jVar.d(gVar.f50142a + 4);
        this.f50145b = gVar.f50143b;
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        if (bArr != null) {
            if ((i10 | i11) >= 0 && i11 <= bArr.length - i10) {
                int i12 = this.f50145b;
                if (i12 > 0) {
                    if (i11 > i12) {
                        i11 = i12;
                    }
                    int i13 = this.f50144a;
                    j jVar = this.f50146c;
                    RandomAccessFile randomAccessFile = jVar.f50147a;
                    int d = jVar.d(i13);
                    int i14 = d + i11;
                    int i15 = jVar.f50148b;
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
                    this.f50144a = jVar.d(this.f50144a + i11);
                    this.f50145b -= i11;
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
        if (this.f50145b == 0) {
            return -1;
        }
        j jVar = this.f50146c;
        jVar.f50147a.seek(this.f50144a);
        int read = jVar.f50147a.read();
        this.f50144a = jVar.d(this.f50144a + 1);
        this.f50145b--;
        return read;
    }
}
