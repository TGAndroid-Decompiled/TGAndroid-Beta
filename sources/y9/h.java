package y9;

import java.io.InputStream;
import java.io.RandomAccessFile;
public final class h extends InputStream {
    public int f50097a;
    public int f50098b;
    public final j f50099c;

    public h(j jVar, g gVar) {
        this.f50099c = jVar;
        this.f50097a = jVar.d(gVar.f50095a + 4);
        this.f50098b = gVar.f50096b;
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        if (bArr != null) {
            if ((i10 | i11) >= 0 && i11 <= bArr.length - i10) {
                int i12 = this.f50098b;
                if (i12 > 0) {
                    if (i11 > i12) {
                        i11 = i12;
                    }
                    int i13 = this.f50097a;
                    j jVar = this.f50099c;
                    RandomAccessFile randomAccessFile = jVar.f50100a;
                    int d = jVar.d(i13);
                    int i14 = d + i11;
                    int i15 = jVar.f50101b;
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
                    this.f50097a = jVar.d(this.f50097a + i11);
                    this.f50098b -= i11;
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
        if (this.f50098b == 0) {
            return -1;
        }
        j jVar = this.f50099c;
        jVar.f50100a.seek(this.f50097a);
        int read = jVar.f50100a.read();
        this.f50097a = jVar.d(this.f50097a + 1);
        this.f50098b--;
        return read;
    }
}
