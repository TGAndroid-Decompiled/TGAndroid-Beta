package u1;

import java.io.InputStream;
public final class f extends b {
    public f(byte[] bArr) {
        super(bArr);
        this.f58262a.mark(Integer.MAX_VALUE);
    }

    public final void b(long j3) {
        int i7 = this.f58264c;
        if (i7 > j3) {
            this.f58264c = 0;
            this.f58262a.reset();
        } else {
            j3 -= i7;
        }
        a((int) j3);
    }

    public f(InputStream inputStream) {
        super(inputStream);
        if (inputStream.markSupported()) {
            this.f58262a.mark(Integer.MAX_VALUE);
            return;
        }
        throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
    }
}
