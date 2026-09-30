package x9;

import java.io.InputStream;
import java.io.RandomAccessFile;
public final class h extends InputStream {
    public int f46106a;
    public int f46107b;
    public final j f46108c;

    public h(j jVar, g gVar) {
        this.f46108c = jVar;
        this.f46106a = jVar.d(gVar.f46104a + 4);
        this.f46107b = gVar.f46105b;
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        if (bArr != null) {
            if ((i10 | i11) >= 0 && i11 <= bArr.length - i10) {
                int i12 = this.f46107b;
                if (i12 > 0) {
                    if (i11 > i12) {
                        i11 = i12;
                    }
                    int i13 = this.f46106a;
                    j jVar = this.f46108c;
                    RandomAccessFile randomAccessFile = jVar.f46109a;
                    int d = jVar.d(i13);
                    int i14 = d + i11;
                    int i15 = jVar.f46110b;
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
                    this.f46106a = jVar.d(this.f46106a + i11);
                    this.f46107b -= i11;
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
        if (this.f46107b == 0) {
            return -1;
        }
        j jVar = this.f46108c;
        jVar.f46109a.seek(this.f46106a);
        int read = jVar.f46109a.read();
        this.f46106a = jVar.d(this.f46106a + 1);
        this.f46107b--;
        return read;
    }
}
