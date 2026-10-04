package x9;

import java.io.InputStream;
import java.io.RandomAccessFile;
public final class h extends InputStream {
    public int f49795a;
    public int f49796b;
    public final j f49797c;

    public h(j jVar, g gVar) {
        this.f49797c = jVar;
        this.f49795a = jVar.d(gVar.f49793a + 4);
        this.f49796b = gVar.f49794b;
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        if (bArr != null) {
            if ((i10 | i11) >= 0 && i11 <= bArr.length - i10) {
                int i12 = this.f49796b;
                if (i12 > 0) {
                    if (i11 > i12) {
                        i11 = i12;
                    }
                    int i13 = this.f49795a;
                    j jVar = this.f49797c;
                    RandomAccessFile randomAccessFile = jVar.f49798a;
                    int d = jVar.d(i13);
                    int i14 = d + i11;
                    int i15 = jVar.f49799b;
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
                    this.f49795a = jVar.d(this.f49795a + i11);
                    this.f49796b -= i11;
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
        if (this.f49796b == 0) {
            return -1;
        }
        j jVar = this.f49797c;
        jVar.f49798a.seek(this.f49795a);
        int read = jVar.f49798a.read();
        this.f49795a = jVar.d(this.f49795a + 1);
        this.f49796b--;
        return read;
    }
}
