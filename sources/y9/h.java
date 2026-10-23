package y9;

import java.io.InputStream;
import java.io.RandomAccessFile;
public final class h extends InputStream {
    public int f50107a;
    public int f50108b;
    public final j f50109c;

    public h(j jVar, g gVar) {
        this.f50109c = jVar;
        this.f50107a = jVar.d(gVar.f50105a + 4);
        this.f50108b = gVar.f50106b;
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        if (bArr != null) {
            if ((i10 | i11) >= 0 && i11 <= bArr.length - i10) {
                int i12 = this.f50108b;
                if (i12 > 0) {
                    if (i11 > i12) {
                        i11 = i12;
                    }
                    int i13 = this.f50107a;
                    j jVar = this.f50109c;
                    RandomAccessFile randomAccessFile = jVar.f50110a;
                    int d = jVar.d(i13);
                    int i14 = d + i11;
                    int i15 = jVar.f50111b;
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
                    this.f50107a = jVar.d(this.f50107a + i11);
                    this.f50108b -= i11;
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
        if (this.f50108b == 0) {
            return -1;
        }
        j jVar = this.f50109c;
        jVar.f50110a.seek(this.f50107a);
        int read = jVar.f50110a.read();
        this.f50107a = jVar.d(this.f50107a + 1);
        this.f50108b--;
        return read;
    }
}
