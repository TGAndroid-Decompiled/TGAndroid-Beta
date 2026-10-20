package y9;

import java.io.InputStream;
import java.io.RandomAccessFile;
public final class h extends InputStream {
    public int f50103a;
    public int f50104b;
    public final j f50105c;

    public h(j jVar, g gVar) {
        this.f50105c = jVar;
        this.f50103a = jVar.d(gVar.f50101a + 4);
        this.f50104b = gVar.f50102b;
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        if (bArr != null) {
            if ((i10 | i11) >= 0 && i11 <= bArr.length - i10) {
                int i12 = this.f50104b;
                if (i12 > 0) {
                    if (i11 > i12) {
                        i11 = i12;
                    }
                    int i13 = this.f50103a;
                    j jVar = this.f50105c;
                    RandomAccessFile randomAccessFile = jVar.f50106a;
                    int d = jVar.d(i13);
                    int i14 = d + i11;
                    int i15 = jVar.f50107b;
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
                    this.f50103a = jVar.d(this.f50103a + i11);
                    this.f50104b -= i11;
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
        if (this.f50104b == 0) {
            return -1;
        }
        j jVar = this.f50105c;
        jVar.f50106a.seek(this.f50103a);
        int read = jVar.f50106a.read();
        this.f50103a = jVar.d(this.f50103a + 1);
        this.f50104b--;
        return read;
    }
}
