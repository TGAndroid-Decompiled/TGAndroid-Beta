package y9;

import java.io.InputStream;
import java.io.RandomAccessFile;
public final class h extends InputStream {
    public int f54358a;
    public int f54359b;
    public final j f54360c;

    public h(j jVar, g gVar) {
        this.f54360c = jVar;
        this.f54358a = jVar.d(gVar.f54356a + 4);
        this.f54359b = gVar.f54357b;
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        if (bArr != null) {
            if ((i10 | i11) >= 0 && i11 <= bArr.length - i10) {
                int i12 = this.f54359b;
                if (i12 > 0) {
                    if (i11 > i12) {
                        i11 = i12;
                    }
                    int i13 = this.f54358a;
                    j jVar = this.f54360c;
                    RandomAccessFile randomAccessFile = jVar.f54361a;
                    int d = jVar.d(i13);
                    int i14 = d + i11;
                    int i15 = jVar.f54362b;
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
                    this.f54358a = jVar.d(this.f54358a + i11);
                    this.f54359b -= i11;
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
        if (this.f54359b == 0) {
            return -1;
        }
        j jVar = this.f54360c;
        jVar.f54361a.seek(this.f54358a);
        int read = jVar.f54361a.read();
        this.f54358a = jVar.d(this.f54358a + 1);
        this.f54359b--;
        return read;
    }
}
