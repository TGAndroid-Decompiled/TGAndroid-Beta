package xe;

import com.google.firebase.messaging.d;
import java.io.InputStream;
public final class a extends d {
    public final long d;

    public a(InputStream inputStream, long j10, long j11) {
        super(inputStream, j10);
        this.d = j10 + j11;
    }

    public final long e() {
        return this.d - this.f5149b;
    }

    @Override
    public final int read() {
        if (this.f5149b == this.d) {
            return -1;
        }
        return super.read();
    }

    @Override
    public final long skip(long j10) {
        long j11 = this.f5149b;
        long j12 = this.d;
        if (j11 + j10 > j12) {
            j10 = (int) (j12 - j11);
        }
        return super.skip(j10);
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        long j10 = this.f5149b;
        long j11 = this.d;
        if (i11 + j10 <= j11 || (i11 = (int) (j11 - j10)) != 0) {
            return super.read(bArr, i10, i11);
        }
        return -1;
    }
}
