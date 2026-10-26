package z9;

import java.io.InputStream;
import java.io.RandomAccessFile;
public final class h extends InputStream {
    public int f52827a;
    public int f52828b;
    public final j f52829c;

    public h(j jVar, g gVar) {
        this.f52829c = jVar;
        this.f52827a = jVar.d(gVar.f52825a + 4);
        this.f52828b = gVar.f52826b;
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        if (bArr != null) {
            if ((i10 | i11) >= 0 && i11 <= bArr.length - i10) {
                int i12 = this.f52828b;
                if (i12 > 0) {
                    if (i11 > i12) {
                        i11 = i12;
                    }
                    int i13 = this.f52827a;
                    j jVar = this.f52829c;
                    RandomAccessFile randomAccessFile = jVar.f52830a;
                    int d = jVar.d(i13);
                    int i14 = d + i11;
                    int i15 = jVar.f52831b;
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
                    this.f52827a = jVar.d(this.f52827a + i11);
                    this.f52828b -= i11;
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
        if (this.f52828b == 0) {
            return -1;
        }
        j jVar = this.f52829c;
        jVar.f52830a.seek(this.f52827a);
        int read = jVar.f52830a.read();
        this.f52827a = jVar.d(this.f52827a + 1);
        this.f52828b--;
        return read;
    }
}
