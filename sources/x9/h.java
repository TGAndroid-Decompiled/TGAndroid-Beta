package x9;

import java.io.InputStream;
import java.io.RandomAccessFile;
public final class h extends InputStream {
    public int f46018a;
    public int f46019b;
    public final j f46020c;

    public h(j jVar, g gVar) {
        this.f46020c = jVar;
        this.f46018a = jVar.d(gVar.f46016a + 4);
        this.f46019b = gVar.f46017b;
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        if (bArr != null) {
            if ((i10 | i11) >= 0 && i11 <= bArr.length - i10) {
                int i12 = this.f46019b;
                if (i12 > 0) {
                    if (i11 > i12) {
                        i11 = i12;
                    }
                    int i13 = this.f46018a;
                    j jVar = this.f46020c;
                    RandomAccessFile randomAccessFile = jVar.f46021a;
                    int d = jVar.d(i13);
                    int i14 = d + i11;
                    int i15 = jVar.f46022b;
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
                    this.f46018a = jVar.d(this.f46018a + i11);
                    this.f46019b -= i11;
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
        if (this.f46019b == 0) {
            return -1;
        }
        j jVar = this.f46020c;
        jVar.f46021a.seek(this.f46018a);
        int read = jVar.f46021a.read();
        this.f46018a = jVar.d(this.f46018a + 1);
        this.f46019b--;
        return read;
    }
}
