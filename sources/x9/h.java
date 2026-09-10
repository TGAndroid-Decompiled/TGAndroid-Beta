package x9;

import java.io.InputStream;
import java.io.RandomAccessFile;
public final class h extends InputStream {
    public int f45060a;
    public int f45061b;
    public final j f45062c;

    public h(j jVar, g gVar) {
        this.f45062c = jVar;
        this.f45060a = jVar.d(gVar.f45058a + 4);
        this.f45061b = gVar.f45059b;
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        if (bArr != null) {
            if ((i10 | i11) >= 0 && i11 <= bArr.length - i10) {
                int i12 = this.f45061b;
                if (i12 > 0) {
                    if (i11 > i12) {
                        i11 = i12;
                    }
                    int i13 = this.f45060a;
                    j jVar = this.f45062c;
                    RandomAccessFile randomAccessFile = jVar.f45063a;
                    int d = jVar.d(i13);
                    int i14 = d + i11;
                    int i15 = jVar.f45064b;
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
                    this.f45060a = jVar.d(this.f45060a + i11);
                    this.f45061b -= i11;
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
        if (this.f45061b == 0) {
            return -1;
        }
        j jVar = this.f45062c;
        jVar.f45063a.seek(this.f45060a);
        int read = jVar.f45063a.read();
        this.f45060a = jVar.d(this.f45060a + 1);
        this.f45061b--;
        return read;
    }
}
