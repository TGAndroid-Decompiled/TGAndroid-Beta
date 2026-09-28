package x9;

import java.io.InputStream;
import java.io.RandomAccessFile;
public final class h extends InputStream {
    public int f45999a;
    public int f46000b;
    public final j f46001c;

    public h(j jVar, g gVar) {
        this.f46001c = jVar;
        this.f45999a = jVar.d(gVar.f45997a + 4);
        this.f46000b = gVar.f45998b;
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        if (bArr != null) {
            if ((i10 | i11) >= 0 && i11 <= bArr.length - i10) {
                int i12 = this.f46000b;
                if (i12 > 0) {
                    if (i11 > i12) {
                        i11 = i12;
                    }
                    int i13 = this.f45999a;
                    j jVar = this.f46001c;
                    RandomAccessFile randomAccessFile = jVar.f46002a;
                    int d = jVar.d(i13);
                    int i14 = d + i11;
                    int i15 = jVar.f46003b;
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
                    this.f45999a = jVar.d(this.f45999a + i11);
                    this.f46000b -= i11;
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
        if (this.f46000b == 0) {
            return -1;
        }
        j jVar = this.f46001c;
        jVar.f46002a.seek(this.f45999a);
        int read = jVar.f46002a.read();
        this.f45999a = jVar.d(this.f45999a + 1);
        this.f46000b--;
        return read;
    }
}
