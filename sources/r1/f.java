package r1;

import java.io.InputStream;
public final class f extends b {
    public f(byte[] bArr) {
        super(bArr);
        this.f47043a.mark(Integer.MAX_VALUE);
    }

    public final void b(long j3) {
        int i10 = this.f47045c;
        if (i10 > j3) {
            this.f47045c = 0;
            this.f47043a.reset();
        } else {
            j3 -= i10;
        }
        a((int) j3);
    }

    public f(InputStream inputStream) {
        super(inputStream);
        if (inputStream.markSupported()) {
            this.f47043a.mark(Integer.MAX_VALUE);
            return;
        }
        throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
    }
}
