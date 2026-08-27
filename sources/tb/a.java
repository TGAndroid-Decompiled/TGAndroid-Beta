package tb;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class a extends FilterInputStream {

    public int f48154a;

    public int f48155b;

    public a(InputStream inputStream) {
        super(inputStream);
        this.f48154a = -1;
        this.f48155b = -1;
    }

    @Override
    public final boolean markSupported() {
        return false;
    }

    @Override
    public final int read() throws IOException {
        int i10 = super.read();
        if (i10 == 3 && this.f48154a == 0 && this.f48155b == 0) {
            this.f48154a = -1;
            this.f48155b = -1;
            i10 = super.read();
        }
        this.f48154a = this.f48155b;
        this.f48155b = i10;
        return i10;
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        bArr.getClass();
        if (i10 < 0 || i11 < 0 || i11 > bArr.length - i10) {
            throw new IndexOutOfBoundsException();
        }
        if (i11 == 0) {
            return 0;
        }
        int i12 = read();
        if (i12 == -1) {
            return -1;
        }
        bArr[i10] = (byte) i12;
        int i13 = 1;
        while (i13 < i11) {
            try {
                int i14 = read();
                if (i14 == -1) {
                    break;
                }
                bArr[i10 + i13] = (byte) i14;
                i13++;
            } catch (IOException unused) {
            }
        }
        return i13;
    }
}
