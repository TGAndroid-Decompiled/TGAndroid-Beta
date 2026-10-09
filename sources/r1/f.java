package r1;

import java.io.InputStream;
public final class f extends b {
    public f(byte[] bArr) {
        super(bArr);
        this.f46820a.mark(Integer.MAX_VALUE);
    }

    public final void b(long j3) {
        int i10 = this.f46822c;
        if (i10 > j3) {
            this.f46822c = 0;
            this.f46820a.reset();
        } else {
            j3 -= i10;
        }
        a((int) j3);
    }

    public f(InputStream inputStream) {
        super(inputStream);
        if (inputStream.markSupported()) {
            this.f46820a.mark(Integer.MAX_VALUE);
            return;
        }
        throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
    }
}
