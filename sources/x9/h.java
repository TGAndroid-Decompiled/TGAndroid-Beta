package x9;

import java.io.InputStream;
import java.io.RandomAccessFile;
public final class h extends InputStream {
    public int f46044a;
    public int f46045b;
    public final j f46046c;

    public h(j jVar, g gVar) {
        this.f46046c = jVar;
        this.f46044a = jVar.d(gVar.f46042a + 4);
        this.f46045b = gVar.f46043b;
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        if (bArr != null) {
            if ((i10 | i11) >= 0 && i11 <= bArr.length - i10) {
                int i12 = this.f46045b;
                if (i12 > 0) {
                    if (i11 > i12) {
                        i11 = i12;
                    }
                    int i13 = this.f46044a;
                    j jVar = this.f46046c;
                    RandomAccessFile randomAccessFile = jVar.f46047a;
                    int d = jVar.d(i13);
                    int i14 = d + i11;
                    int i15 = jVar.f46048b;
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
                    this.f46044a = jVar.d(this.f46044a + i11);
                    this.f46045b -= i11;
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
        if (this.f46045b == 0) {
            return -1;
        }
        j jVar = this.f46046c;
        jVar.f46047a.seek(this.f46044a);
        int read = jVar.f46047a.read();
        this.f46044a = jVar.d(this.f46044a + 1);
        this.f46045b--;
        return read;
    }
}
