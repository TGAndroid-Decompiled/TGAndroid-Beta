package y9;

import java.io.InputStream;
import java.io.RandomAccessFile;
public final class h extends InputStream {
    public int f50098a;
    public int f50099b;
    public final j f50100c;

    public h(j jVar, g gVar) {
        this.f50100c = jVar;
        this.f50098a = jVar.d(gVar.f50096a + 4);
        this.f50099b = gVar.f50097b;
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        if (bArr != null) {
            if ((i10 | i11) >= 0 && i11 <= bArr.length - i10) {
                int i12 = this.f50099b;
                if (i12 > 0) {
                    if (i11 > i12) {
                        i11 = i12;
                    }
                    int i13 = this.f50098a;
                    j jVar = this.f50100c;
                    RandomAccessFile randomAccessFile = jVar.f50101a;
                    int d = jVar.d(i13);
                    int i14 = d + i11;
                    int i15 = jVar.f50102b;
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
                    this.f50098a = jVar.d(this.f50098a + i11);
                    this.f50099b -= i11;
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
        if (this.f50099b == 0) {
            return -1;
        }
        j jVar = this.f50100c;
        jVar.f50101a.seek(this.f50098a);
        int read = jVar.f50101a.read();
        this.f50098a = jVar.d(this.f50098a + 1);
        this.f50099b--;
        return read;
    }
}
