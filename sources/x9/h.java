package x9;

import java.io.InputStream;
import java.io.RandomAccessFile;
public final class h extends InputStream {
    public int f46000a;
    public int f46001b;
    public final j f46002c;

    public h(j jVar, g gVar) {
        this.f46002c = jVar;
        this.f46000a = jVar.d(gVar.f45998a + 4);
        this.f46001b = gVar.f45999b;
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        if (bArr != null) {
            if ((i10 | i11) >= 0 && i11 <= bArr.length - i10) {
                int i12 = this.f46001b;
                if (i12 > 0) {
                    if (i11 > i12) {
                        i11 = i12;
                    }
                    int i13 = this.f46000a;
                    j jVar = this.f46002c;
                    RandomAccessFile randomAccessFile = jVar.f46003a;
                    int d = jVar.d(i13);
                    int i14 = d + i11;
                    int i15 = jVar.f46004b;
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
                    this.f46000a = jVar.d(this.f46000a + i11);
                    this.f46001b -= i11;
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
        if (this.f46001b == 0) {
            return -1;
        }
        j jVar = this.f46002c;
        jVar.f46003a.seek(this.f46000a);
        int read = jVar.f46003a.read();
        this.f46000a = jVar.d(this.f46000a + 1);
        this.f46001b--;
        return read;
    }
}
