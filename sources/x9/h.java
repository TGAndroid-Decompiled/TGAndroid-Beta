package x9;

import java.io.InputStream;
import java.io.RandomAccessFile;
public final class h extends InputStream {
    public int f49803a;
    public int f49804b;
    public final j f49805c;

    public h(j jVar, g gVar) {
        this.f49805c = jVar;
        this.f49803a = jVar.d(gVar.f49801a + 4);
        this.f49804b = gVar.f49802b;
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        if (bArr != null) {
            if ((i10 | i11) >= 0 && i11 <= bArr.length - i10) {
                int i12 = this.f49804b;
                if (i12 > 0) {
                    if (i11 > i12) {
                        i11 = i12;
                    }
                    int i13 = this.f49803a;
                    j jVar = this.f49805c;
                    RandomAccessFile randomAccessFile = jVar.f49806a;
                    int d = jVar.d(i13);
                    int i14 = d + i11;
                    int i15 = jVar.f49807b;
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
                    this.f49803a = jVar.d(this.f49803a + i11);
                    this.f49804b -= i11;
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
        if (this.f49804b == 0) {
            return -1;
        }
        j jVar = this.f49805c;
        jVar.f49806a.seek(this.f49803a);
        int read = jVar.f49806a.read();
        this.f49803a = jVar.d(this.f49803a + 1);
        this.f49804b--;
        return read;
    }
}
