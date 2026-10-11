package x9;

import java.io.InputStream;
import java.io.RandomAccessFile;
public final class h extends InputStream {
    public int f51210a;
    public int f51211b;
    public final j f51212c;

    public h(j jVar, g gVar) {
        this.f51212c = jVar;
        this.f51210a = jVar.d(gVar.f51208a + 4);
        this.f51211b = gVar.f51209b;
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        if (bArr != null) {
            if ((i10 | i11) >= 0 && i11 <= bArr.length - i10) {
                int i12 = this.f51211b;
                if (i12 > 0) {
                    if (i11 > i12) {
                        i11 = i12;
                    }
                    int i13 = this.f51210a;
                    j jVar = this.f51212c;
                    RandomAccessFile randomAccessFile = jVar.f51213a;
                    int d = jVar.d(i13);
                    int i14 = d + i11;
                    int i15 = jVar.f51214b;
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
                    this.f51210a = jVar.d(this.f51210a + i11);
                    this.f51211b -= i11;
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
        if (this.f51211b == 0) {
            return -1;
        }
        j jVar = this.f51212c;
        jVar.f51213a.seek(this.f51210a);
        int read = jVar.f51213a.read();
        this.f51210a = jVar.d(this.f51210a + 1);
        this.f51211b--;
        return read;
    }
}
