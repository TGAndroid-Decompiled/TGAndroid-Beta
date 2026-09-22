package x9;

import java.io.InputStream;
import java.io.RandomAccessFile;
public final class h extends InputStream {
    public int f46039a;
    public int f46040b;
    public final j f46041c;

    public h(j jVar, g gVar) {
        this.f46041c = jVar;
        this.f46039a = jVar.d(gVar.f46037a + 4);
        this.f46040b = gVar.f46038b;
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        if (bArr != null) {
            if ((i10 | i11) >= 0 && i11 <= bArr.length - i10) {
                int i12 = this.f46040b;
                if (i12 > 0) {
                    if (i11 > i12) {
                        i11 = i12;
                    }
                    int i13 = this.f46039a;
                    j jVar = this.f46041c;
                    RandomAccessFile randomAccessFile = jVar.f46042a;
                    int d = jVar.d(i13);
                    int i14 = d + i11;
                    int i15 = jVar.f46043b;
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
                    this.f46039a = jVar.d(this.f46039a + i11);
                    this.f46040b -= i11;
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
        if (this.f46040b == 0) {
            return -1;
        }
        j jVar = this.f46041c;
        jVar.f46042a.seek(this.f46039a);
        int read = jVar.f46042a.read();
        this.f46039a = jVar.d(this.f46039a + 1);
        this.f46040b--;
        return read;
    }
}
