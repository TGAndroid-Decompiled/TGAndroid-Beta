package x9;

import java.io.InputStream;
import java.io.RandomAccessFile;
public final class h extends InputStream {
    public int f51132a;
    public int f51133b;
    public final j f51134c;

    public h(j jVar, g gVar) {
        this.f51134c = jVar;
        this.f51132a = jVar.d(gVar.f51130a + 4);
        this.f51133b = gVar.f51131b;
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        if (bArr != null) {
            if ((i10 | i11) >= 0 && i11 <= bArr.length - i10) {
                int i12 = this.f51133b;
                if (i12 > 0) {
                    if (i11 > i12) {
                        i11 = i12;
                    }
                    int i13 = this.f51132a;
                    j jVar = this.f51134c;
                    RandomAccessFile randomAccessFile = jVar.f51135a;
                    int d = jVar.d(i13);
                    int i14 = d + i11;
                    int i15 = jVar.f51136b;
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
                    this.f51132a = jVar.d(this.f51132a + i11);
                    this.f51133b -= i11;
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
        if (this.f51133b == 0) {
            return -1;
        }
        j jVar = this.f51134c;
        jVar.f51135a.seek(this.f51132a);
        int read = jVar.f51135a.read();
        this.f51132a = jVar.d(this.f51132a + 1);
        this.f51133b--;
        return read;
    }
}
