package x9;

import java.io.InputStream;
import java.io.RandomAccessFile;
public final class h extends InputStream {
    public int f51176a;
    public int f51177b;
    public final j f51178c;

    public h(j jVar, g gVar) {
        this.f51178c = jVar;
        this.f51176a = jVar.d(gVar.f51174a + 4);
        this.f51177b = gVar.f51175b;
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        if (bArr != null) {
            if ((i10 | i11) >= 0 && i11 <= bArr.length - i10) {
                int i12 = this.f51177b;
                if (i12 > 0) {
                    if (i11 > i12) {
                        i11 = i12;
                    }
                    int i13 = this.f51176a;
                    j jVar = this.f51178c;
                    RandomAccessFile randomAccessFile = jVar.f51179a;
                    int d = jVar.d(i13);
                    int i14 = d + i11;
                    int i15 = jVar.f51180b;
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
                    this.f51176a = jVar.d(this.f51176a + i11);
                    this.f51177b -= i11;
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
        if (this.f51177b == 0) {
            return -1;
        }
        j jVar = this.f51178c;
        jVar.f51179a.seek(this.f51176a);
        int read = jVar.f51179a.read();
        this.f51176a = jVar.d(this.f51176a + 1);
        this.f51177b--;
        return read;
    }
}
