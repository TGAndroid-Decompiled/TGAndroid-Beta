package t1;

import java.io.InputStream;
public final class f extends b {
    public f(byte[] bArr) {
        super(bArr);
        this.f54776a.mark(Integer.MAX_VALUE);
    }

    public final void b(long j10) {
        int i3 = this.f54778c;
        if (i3 > j10) {
            this.f54778c = 0;
            this.f54776a.reset();
        } else {
            j10 -= i3;
        }
        a((int) j10);
    }

    public f(InputStream inputStream) {
        super(inputStream);
        if (inputStream.markSupported()) {
            this.f54776a.mark(Integer.MAX_VALUE);
            return;
        }
        throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
    }
}
