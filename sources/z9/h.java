package z9;

import java.io.InputStream;
import java.io.RandomAccessFile;
public final class h extends InputStream {
    public int f52885a;
    public int f52886b;
    public final j f52887c;

    public h(j jVar, g gVar) {
        this.f52887c = jVar;
        this.f52885a = jVar.d(gVar.f52883a + 4);
        this.f52886b = gVar.f52884b;
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        if (bArr != null) {
            if ((i10 | i11) >= 0 && i11 <= bArr.length - i10) {
                int i12 = this.f52886b;
                if (i12 > 0) {
                    if (i11 > i12) {
                        i11 = i12;
                    }
                    int i13 = this.f52885a;
                    j jVar = this.f52887c;
                    RandomAccessFile randomAccessFile = jVar.f52888a;
                    int d = jVar.d(i13);
                    int i14 = d + i11;
                    int i15 = jVar.f52889b;
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
                    this.f52885a = jVar.d(this.f52885a + i11);
                    this.f52886b -= i11;
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
        if (this.f52886b == 0) {
            return -1;
        }
        j jVar = this.f52887c;
        jVar.f52888a.seek(this.f52885a);
        int read = jVar.f52888a.read();
        this.f52885a = jVar.d(this.f52885a + 1);
        this.f52886b--;
        return read;
    }
}
