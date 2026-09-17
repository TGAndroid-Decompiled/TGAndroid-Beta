package x9;

import java.io.InputStream;
import java.io.RandomAccessFile;
public final class h extends InputStream {
    public int f45743a;
    public int f45744b;
    public final j f45745c;

    public h(j jVar, g gVar) {
        this.f45745c = jVar;
        this.f45743a = jVar.d(gVar.f45741a + 4);
        this.f45744b = gVar.f45742b;
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        if (bArr != null) {
            if ((i10 | i11) >= 0 && i11 <= bArr.length - i10) {
                int i12 = this.f45744b;
                if (i12 > 0) {
                    if (i11 > i12) {
                        i11 = i12;
                    }
                    int i13 = this.f45743a;
                    j jVar = this.f45745c;
                    RandomAccessFile randomAccessFile = jVar.f45746a;
                    int d = jVar.d(i13);
                    int i14 = d + i11;
                    int i15 = jVar.f45747b;
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
                    this.f45743a = jVar.d(this.f45743a + i11);
                    this.f45744b -= i11;
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
        if (this.f45744b == 0) {
            return -1;
        }
        j jVar = this.f45745c;
        jVar.f45746a.seek(this.f45743a);
        int read = jVar.f45746a.read();
        this.f45743a = jVar.d(this.f45743a + 1);
        this.f45744b--;
        return read;
    }
}
