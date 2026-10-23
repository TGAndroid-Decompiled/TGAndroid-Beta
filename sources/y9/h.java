package y9;

import java.io.InputStream;
import java.io.RandomAccessFile;
public final class h extends InputStream {
    public int f50547a;
    public int f50548b;
    public final j f50549c;

    public h(j jVar, g gVar) {
        this.f50549c = jVar;
        this.f50547a = jVar.d(gVar.f50545a + 4);
        this.f50548b = gVar.f50546b;
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        if (bArr != null) {
            if ((i10 | i11) >= 0 && i11 <= bArr.length - i10) {
                int i12 = this.f50548b;
                if (i12 > 0) {
                    if (i11 > i12) {
                        i11 = i12;
                    }
                    int i13 = this.f50547a;
                    j jVar = this.f50549c;
                    RandomAccessFile randomAccessFile = jVar.f50550a;
                    int d = jVar.d(i13);
                    int i14 = d + i11;
                    int i15 = jVar.f50551b;
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
                    this.f50547a = jVar.d(this.f50547a + i11);
                    this.f50548b -= i11;
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
        if (this.f50548b == 0) {
            return -1;
        }
        j jVar = this.f50549c;
        jVar.f50550a.seek(this.f50547a);
        int read = jVar.f50550a.read();
        this.f50547a = jVar.d(this.f50547a + 1);
        this.f50548b--;
        return read;
    }
}
