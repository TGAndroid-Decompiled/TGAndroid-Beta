package x9;

import java.io.InputStream;
import java.io.RandomAccessFile;
public final class h extends InputStream {
    public int f45997a;
    public int f45998b;
    public final j f45999c;

    public h(j jVar, g gVar) {
        this.f45999c = jVar;
        this.f45997a = jVar.d(gVar.f45995a + 4);
        this.f45998b = gVar.f45996b;
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        if (bArr != null) {
            if ((i10 | i11) >= 0 && i11 <= bArr.length - i10) {
                int i12 = this.f45998b;
                if (i12 > 0) {
                    if (i11 > i12) {
                        i11 = i12;
                    }
                    int i13 = this.f45997a;
                    j jVar = this.f45999c;
                    RandomAccessFile randomAccessFile = jVar.f46000a;
                    int d = jVar.d(i13);
                    int i14 = d + i11;
                    int i15 = jVar.f46001b;
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
                    this.f45997a = jVar.d(this.f45997a + i11);
                    this.f45998b -= i11;
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
        if (this.f45998b == 0) {
            return -1;
        }
        j jVar = this.f45999c;
        jVar.f46000a.seek(this.f45997a);
        int read = jVar.f46000a.read();
        this.f45997a = jVar.d(this.f45997a + 1);
        this.f45998b--;
        return read;
    }
}
