package r3;

import h5.d0;
import j3.l0;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;
public final class h implements l {
    public final g5.j f43221b;
    public final long f43222c;
    public long d;
    public int f43223f;
    public int h;
    public byte[] e = new byte[65536];
    public final byte[] f43220a = new byte[4096];

    static {
        l0.a("goog.exo.extractor");
    }

    public h(g5.j jVar, long j10, long j11) {
        this.f43221b = jVar;
        this.d = j10;
        this.f43222c = j11;
    }

    public final boolean a(int i10, boolean z4) {
        b(i10);
        int i11 = this.h - this.f43223f;
        while (i11 < i10) {
            int i12 = i10;
            boolean z10 = z4;
            i11 = e(this.e, this.f43223f, i12, i11, z10);
            if (i11 == -1) {
                return false;
            }
            this.h = this.f43223f + i11;
            i10 = i12;
            z4 = z10;
        }
        this.f43223f += i10;
        return true;
    }

    public final void b(int i10) {
        int i11 = this.f43223f + i10;
        byte[] bArr = this.e;
        if (i11 > bArr.length) {
            this.e = Arrays.copyOf(this.e, d0.h(bArr.length * 2, 65536 + i11, i11 + 524288));
        }
    }

    @Override
    public final void c(int i10, int i11, byte[] bArr) {
        h(bArr, i10, i11, false);
    }

    @Override
    public final boolean d(byte[] bArr, int i10, int i11, boolean z4) {
        int min;
        int i12 = this.h;
        if (i12 == 0) {
            min = 0;
        } else {
            min = Math.min(i12, i11);
            System.arraycopy(this.e, 0, bArr, i10, min);
            g(min);
        }
        int i13 = min;
        while (i13 < i11 && i13 != -1) {
            i13 = e(bArr, i10, i11, i13, z4);
        }
        if (i13 != -1) {
            this.d += i13;
        }
        if (i13 == -1) {
            return false;
        }
        return true;
    }

    public final int e(byte[] bArr, int i10, int i11, int i12, boolean z4) {
        if (!Thread.interrupted()) {
            int read = this.f43221b.read(bArr, i10 + i12, i11 - i12);
            if (read == -1) {
                if (i12 == 0 && z4) {
                    return -1;
                }
                throw new EOFException();
            }
            return i12 + read;
        }
        throw new InterruptedIOException();
    }

    @Override
    public final int f(int i10, int i11, byte[] bArr) {
        h hVar;
        int min;
        b(i11);
        int i12 = this.h;
        int i13 = this.f43223f;
        int i14 = i12 - i13;
        if (i14 == 0) {
            hVar = this;
            min = hVar.e(this.e, i13, i11, 0, true);
            if (min == -1) {
                return -1;
            }
            hVar.h += min;
        } else {
            hVar = this;
            min = Math.min(i11, i14);
        }
        System.arraycopy(hVar.e, hVar.f43223f, bArr, i10, min);
        hVar.f43223f += min;
        return min;
    }

    public final void g(int i10) {
        byte[] bArr;
        int i11 = this.h - i10;
        this.h = i11;
        this.f43223f = 0;
        byte[] bArr2 = this.e;
        if (i11 < bArr2.length - 524288) {
            bArr = new byte[65536 + i11];
        } else {
            bArr = bArr2;
        }
        System.arraycopy(bArr2, i10, bArr, 0, i11);
        this.e = bArr;
    }

    @Override
    public final long getLength() {
        return this.f43222c;
    }

    @Override
    public final long getPosition() {
        return this.d;
    }

    @Override
    public final boolean h(byte[] bArr, int i10, int i11, boolean z4) {
        if (!a(i11, z4)) {
            return false;
        }
        System.arraycopy(this.e, this.f43223f - i11, bArr, i10, i11);
        return true;
    }

    @Override
    public final long i() {
        return this.d + this.f43223f;
    }

    @Override
    public final void n(int i10) {
        a(i10, false);
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        h hVar;
        int i12 = this.h;
        int i13 = 0;
        if (i12 != 0) {
            int min = Math.min(i12, i11);
            System.arraycopy(this.e, 0, bArr, i10, min);
            g(min);
            i13 = min;
        }
        if (i13 == 0) {
            hVar = this;
            i13 = hVar.e(bArr, i10, i11, 0, true);
        } else {
            hVar = this;
        }
        if (i13 != -1) {
            hVar.d += i13;
        }
        return i13;
    }

    @Override
    public final void readFully(byte[] bArr, int i10, int i11) {
        d(bArr, i10, i11, false);
    }

    @Override
    public final int skip(int i10) {
        h hVar;
        int min = Math.min(this.h, i10);
        g(min);
        if (min == 0) {
            byte[] bArr = this.f43220a;
            hVar = this;
            min = hVar.e(bArr, 0, Math.min(i10, bArr.length), 0, true);
        } else {
            hVar = this;
        }
        if (min != -1) {
            hVar.d += min;
        }
        return min;
    }

    @Override
    public final void t() {
        this.f43223f = 0;
    }

    @Override
    public final void u(int i10) {
        int min = Math.min(this.h, i10);
        g(min);
        int i11 = min;
        while (i11 < i10 && i11 != -1) {
            byte[] bArr = this.f43220a;
            i11 = e(bArr, -i11, Math.min(i10, bArr.length + i11), i11, false);
        }
        if (i11 != -1) {
            this.d += i11;
        }
    }
}
