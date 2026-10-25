package z9;

import java.io.InputStream;
import java.io.RandomAccessFile;
public final class h extends InputStream {
    public int f52824a;
    public int f52825b;
    public final j f52826c;

    public h(j jVar, g gVar) {
        this.f52826c = jVar;
        this.f52824a = jVar.d(gVar.f52822a + 4);
        this.f52825b = gVar.f52823b;
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        if (bArr != null) {
            if ((i10 | i11) >= 0 && i11 <= bArr.length - i10) {
                int i12 = this.f52825b;
                if (i12 > 0) {
                    if (i11 > i12) {
                        i11 = i12;
                    }
                    int i13 = this.f52824a;
                    j jVar = this.f52826c;
                    RandomAccessFile randomAccessFile = jVar.f52827a;
                    int d = jVar.d(i13);
                    int i14 = d + i11;
                    int i15 = jVar.f52828b;
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
                    this.f52824a = jVar.d(this.f52824a + i11);
                    this.f52825b -= i11;
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
        if (this.f52825b == 0) {
            return -1;
        }
        j jVar = this.f52826c;
        jVar.f52827a.seek(this.f52824a);
        int read = jVar.f52827a.read();
        this.f52824a = jVar.d(this.f52824a + 1);
        this.f52825b--;
        return read;
    }
}
