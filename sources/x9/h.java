package x9;

import java.io.InputStream;
import java.io.RandomAccessFile;
public final class h extends InputStream {
    public int f45971a;
    public int f45972b;
    public final j f45973c;

    public h(j jVar, g gVar) {
        this.f45973c = jVar;
        this.f45971a = jVar.d(gVar.f45969a + 4);
        this.f45972b = gVar.f45970b;
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        if (bArr != null) {
            if ((i10 | i11) >= 0 && i11 <= bArr.length - i10) {
                int i12 = this.f45972b;
                if (i12 > 0) {
                    if (i11 > i12) {
                        i11 = i12;
                    }
                    int i13 = this.f45971a;
                    j jVar = this.f45973c;
                    RandomAccessFile randomAccessFile = jVar.f45974a;
                    int d = jVar.d(i13);
                    int i14 = d + i11;
                    int i15 = jVar.f45975b;
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
                    this.f45971a = jVar.d(this.f45971a + i11);
                    this.f45972b -= i11;
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
        if (this.f45972b == 0) {
            return -1;
        }
        j jVar = this.f45973c;
        jVar.f45974a.seek(this.f45971a);
        int read = jVar.f45974a.read();
        this.f45971a = jVar.d(this.f45971a + 1);
        this.f45972b--;
        return read;
    }
}
