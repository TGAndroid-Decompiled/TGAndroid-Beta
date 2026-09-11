package x9;

import java.io.InputStream;
import java.io.RandomAccessFile;
public final class h extends InputStream {
    public int f49313a;
    public int f49314b;
    public final j f49315c;

    public h(j jVar, g gVar) {
        this.f49315c = jVar;
        this.f49313a = jVar.d(gVar.f49311a + 4);
        this.f49314b = gVar.f49312b;
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        if (bArr != null) {
            if ((i10 | i11) >= 0 && i11 <= bArr.length - i10) {
                int i12 = this.f49314b;
                if (i12 > 0) {
                    if (i11 > i12) {
                        i11 = i12;
                    }
                    int i13 = this.f49313a;
                    j jVar = this.f49315c;
                    RandomAccessFile randomAccessFile = jVar.f49316a;
                    int d = jVar.d(i13);
                    int i14 = d + i11;
                    int i15 = jVar.f49317b;
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
                    this.f49313a = jVar.d(this.f49313a + i11);
                    this.f49314b -= i11;
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
        if (this.f49314b == 0) {
            return -1;
        }
        j jVar = this.f49315c;
        jVar.f49316a.seek(this.f49313a);
        int read = jVar.f49316a.read();
        this.f49313a = jVar.d(this.f49313a + 1);
        this.f49314b--;
        return read;
    }
}
