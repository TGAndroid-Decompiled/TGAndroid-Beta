package r1;

import java.io.IOException;
import java.io.InputStream;

public final class f extends b {
    public f(byte[] bArr) {
        super(bArr);
        this.f46661a.mark(Integer.MAX_VALUE);
    }

    public final void b(long j10) throws IOException {
        int i10 = this.f46663c;
        if (i10 > j10) {
            this.f46663c = 0;
            this.f46661a.reset();
        } else {
            j10 -= (long) i10;
        }
        a((int) j10);
    }

    public f(InputStream inputStream) {
        super(inputStream);
        if (inputStream.markSupported()) {
            this.f46661a.mark(Integer.MAX_VALUE);
            return;
        }
        throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
    }
}
