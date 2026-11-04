package rf;

import java.io.InputStream;
public final class b extends a {
    public final long d;

    public b(InputStream inputStream, long j10, long j11) {
        super(inputStream, j10);
        this.d = j10 + j11;
    }

    public final long e() {
        return this.d - this.f54501b;
    }

    @Override
    public final int read() {
        if (this.f54501b == this.d) {
            return -1;
        }
        return super.read();
    }

    @Override
    public final long skip(long j10) {
        long j11 = this.f54501b;
        long j12 = this.d;
        if (j11 + j10 > j12) {
            j10 = (int) (j12 - j11);
        }
        return super.skip(j10);
    }

    @Override
    public final int read(byte[] bArr, int i3, int i10) {
        long j10 = this.f54501b;
        long j11 = this.d;
        if (i10 + j10 <= j11 || (i10 = (int) (j11 - j10)) != 0) {
            return super.read(bArr, i3, i10);
        }
        return -1;
    }
}
