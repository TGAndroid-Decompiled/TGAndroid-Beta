package x9;

import java.io.InputStream;
import java.io.RandomAccessFile;
public final class h extends InputStream {
    public int f49343a;
    public int f49344b;
    public final j f49345c;

    public h(j jVar, g gVar) {
        this.f49345c = jVar;
        this.f49343a = jVar.d(gVar.f49341a + 4);
        this.f49344b = gVar.f49342b;
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        if (bArr != null) {
            if ((i10 | i11) >= 0 && i11 <= bArr.length - i10) {
                int i12 = this.f49344b;
                if (i12 > 0) {
                    if (i11 > i12) {
                        i11 = i12;
                    }
                    int i13 = this.f49343a;
                    j jVar = this.f49345c;
                    RandomAccessFile randomAccessFile = jVar.f49346a;
                    int d = jVar.d(i13);
                    int i14 = d + i11;
                    int i15 = jVar.f49347b;
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
                    this.f49343a = jVar.d(this.f49343a + i11);
                    this.f49344b -= i11;
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
        if (this.f49344b == 0) {
            return -1;
        }
        j jVar = this.f49345c;
        jVar.f49346a.seek(this.f49343a);
        int read = jVar.f49346a.read();
        this.f49343a = jVar.d(this.f49343a + 1);
        this.f49344b--;
        return read;
    }
}
