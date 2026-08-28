package sb;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
public final class a extends FilterInputStream {
    public int f47505a;
    public int f47506b;

    public a(InputStream inputStream) {
        super(inputStream);
        this.f47505a = -1;
        this.f47506b = -1;
    }

    @Override
    public final boolean markSupported() {
        return false;
    }

    @Override
    public final int read() {
        int read = super.read();
        if (read == 3 && this.f47505a == 0 && this.f47506b == 0) {
            this.f47505a = -1;
            this.f47506b = -1;
            read = super.read();
        }
        this.f47505a = this.f47506b;
        this.f47506b = read;
        return read;
    }

    @Override
    public final int read(byte[] bArr, int i9, int i10) {
        bArr.getClass();
        if (i9 < 0 || i10 < 0 || i10 > bArr.length - i9) {
            throw new IndexOutOfBoundsException();
        }
        if (i10 == 0) {
            return 0;
        }
        int read = read();
        if (read == -1) {
            return -1;
        }
        bArr[i9] = (byte) read;
        int i11 = 1;
        while (true) {
            if (i11 < i10) {
                try {
                    int read2 = read();
                    if (read2 == -1) {
                        break;
                    }
                    bArr[i9 + i11] = (byte) read2;
                    i11++;
                } catch (IOException unused) {
                }
            }
            return i11;
        }
        return i11;
    }
}
