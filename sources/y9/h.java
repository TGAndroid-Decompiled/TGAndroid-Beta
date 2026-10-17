package y9;

import java.io.InputStream;
import java.io.RandomAccessFile;
public final class h extends InputStream {
    public int f50119a;
    public int f50120b;
    public final j f50121c;

    public h(j jVar, g gVar) {
        this.f50121c = jVar;
        this.f50119a = jVar.d(gVar.f50117a + 4);
        this.f50120b = gVar.f50118b;
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        if (bArr != null) {
            if ((i10 | i11) >= 0 && i11 <= bArr.length - i10) {
                int i12 = this.f50120b;
                if (i12 > 0) {
                    if (i11 > i12) {
                        i11 = i12;
                    }
                    int i13 = this.f50119a;
                    j jVar = this.f50121c;
                    RandomAccessFile randomAccessFile = jVar.f50122a;
                    int d = jVar.d(i13);
                    int i14 = d + i11;
                    int i15 = jVar.f50123b;
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
                    this.f50119a = jVar.d(this.f50119a + i11);
                    this.f50120b -= i11;
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
        if (this.f50120b == 0) {
            return -1;
        }
        j jVar = this.f50121c;
        jVar.f50122a.seek(this.f50119a);
        int read = jVar.f50122a.read();
        this.f50119a = jVar.d(this.f50119a + 1);
        this.f50120b--;
        return read;
    }
}
