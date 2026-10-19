package y9;

import java.io.InputStream;
import java.io.RandomAccessFile;
public final class h extends InputStream {
    public int f50096a;
    public int f50097b;
    public final j f50098c;

    public h(j jVar, g gVar) {
        this.f50098c = jVar;
        this.f50096a = jVar.d(gVar.f50094a + 4);
        this.f50097b = gVar.f50095b;
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        if (bArr != null) {
            if ((i10 | i11) >= 0 && i11 <= bArr.length - i10) {
                int i12 = this.f50097b;
                if (i12 > 0) {
                    if (i11 > i12) {
                        i11 = i12;
                    }
                    int i13 = this.f50096a;
                    j jVar = this.f50098c;
                    RandomAccessFile randomAccessFile = jVar.f50099a;
                    int d = jVar.d(i13);
                    int i14 = d + i11;
                    int i15 = jVar.f50100b;
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
                    this.f50096a = jVar.d(this.f50096a + i11);
                    this.f50097b -= i11;
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
        if (this.f50097b == 0) {
            return -1;
        }
        j jVar = this.f50098c;
        jVar.f50099a.seek(this.f50096a);
        int read = jVar.f50099a.read();
        this.f50096a = jVar.d(this.f50096a + 1);
        this.f50097b--;
        return read;
    }
}
