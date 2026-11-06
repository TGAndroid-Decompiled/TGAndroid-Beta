package uf;

import ab.d;
import java.io.InputStream;
public final class a extends d {
    public final long d;

    public a(InputStream inputStream, long j3, long j10) {
        super(inputStream, j3);
        this.d = j3 + j10;
    }

    public final long e() {
        return this.d - this.f915b;
    }

    @Override
    public final int read() {
        if (this.f915b == this.d) {
            return -1;
        }
        return super.read();
    }

    @Override
    public final long skip(long j3) {
        long j10 = this.f915b;
        long j11 = this.d;
        if (j10 + j3 > j11) {
            j3 = (int) (j11 - j10);
        }
        return super.skip(j3);
    }

    @Override
    public final int read(byte[] bArr, int i7, int i10) {
        long j3 = this.f915b;
        long j10 = this.d;
        if (i10 + j3 <= j10 || (i10 = (int) (j10 - j3)) != 0) {
            return super.read(bArr, i7, i10);
        }
        return -1;
    }
}
