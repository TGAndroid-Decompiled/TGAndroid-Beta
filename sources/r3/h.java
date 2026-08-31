package r3;

import h5.d0;
import j3.l0;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;
public final class h implements l {
    public final g5.j f46555b;
    public final long f46556c;
    public long d;
    public int f46558f;
    public int h;
    public byte[] f46557e = new byte[65536];
    public final byte[] f46554a = new byte[4096];

    static {
        l0.a("goog.exo.extractor");
    }

    public h(g5.j jVar, long j10, long j11) {
        this.f46555b = jVar;
        this.d = j10;
        this.f46556c = j11;
    }

    public final boolean a(int i10, boolean z4) {
        d(i10);
        int i11 = this.h - this.f46558f;
        while (i11 < i10) {
            int i12 = i10;
            boolean z10 = z4;
            i11 = h(this.f46557e, this.f46558f, i12, i11, z10);
            if (i11 == -1) {
                return false;
            }
            this.h = this.f46558f + i11;
            i10 = i12;
            z4 = z10;
        }
        this.f46558f += i10;
        return true;
    }

    @Override
    public final void b(int i10, int i11, byte[] bArr) {
        f(bArr, i10, i11, false);
    }

    @Override
    public final boolean c(byte[] bArr, int i10, int i11, boolean z4) {
        int min;
        int i12 = this.h;
        if (i12 == 0) {
            min = 0;
        } else {
            min = Math.min(i12, i11);
            System.arraycopy(this.f46557e, 0, bArr, i10, min);
            j(min);
        }
        int i13 = min;
        while (i13 < i11 && i13 != -1) {
            i13 = h(bArr, i10, i11, i13, z4);
        }
        if (i13 != -1) {
            this.d += i13;
        }
        if (i13 == -1) {
            return false;
        }
        return true;
    }

    public final void d(int i10) {
        int i11 = this.f46558f + i10;
        byte[] bArr = this.f46557e;
        if (i11 > bArr.length) {
            this.f46557e = Arrays.copyOf(this.f46557e, d0.h(bArr.length * 2, 65536 + i11, i11 + 524288));
        }
    }

    @Override
    public final int e(int i10, int i11, byte[] bArr) {
        h hVar;
        int min;
        d(i11);
        int i12 = this.h;
        int i13 = this.f46558f;
        int i14 = i12 - i13;
        if (i14 == 0) {
            hVar = this;
            min = hVar.h(this.f46557e, i13, i11, 0, true);
            if (min == -1) {
                return -1;
            }
            hVar.h += min;
        } else {
            hVar = this;
            min = Math.min(i11, i14);
        }
        System.arraycopy(hVar.f46557e, hVar.f46558f, bArr, i10, min);
        hVar.f46558f += min;
        return min;
    }

    @Override
    public final boolean f(byte[] bArr, int i10, int i11, boolean z4) {
        if (!a(i11, z4)) {
            return false;
        }
        System.arraycopy(this.f46557e, this.f46558f - i11, bArr, i10, i11);
        return true;
    }

    @Override
    public final long g() {
        return this.d + this.f46558f;
    }

    @Override
    public final long getLength() {
        return this.f46556c;
    }

    @Override
    public final long getPosition() {
        return this.d;
    }

    public final int h(byte[] bArr, int i10, int i11, int i12, boolean z4) {
        if (!Thread.interrupted()) {
            int read = this.f46555b.read(bArr, i10 + i12, i11 - i12);
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
    public final void i(int i10) {
        a(i10, false);
    }

    public final void j(int i10) {
        byte[] bArr;
        int i11 = this.h - i10;
        this.h = i11;
        this.f46558f = 0;
        byte[] bArr2 = this.f46557e;
        if (i11 < bArr2.length - 524288) {
            bArr = new byte[65536 + i11];
        } else {
            bArr = bArr2;
        }
        System.arraycopy(bArr2, i10, bArr, 0, i11);
        this.f46557e = bArr;
    }

    @Override
    public final void r() {
        this.f46558f = 0;
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        h hVar;
        int i12 = this.h;
        int i13 = 0;
        if (i12 != 0) {
            int min = Math.min(i12, i11);
            System.arraycopy(this.f46557e, 0, bArr, i10, min);
            j(min);
            i13 = min;
        }
        if (i13 == 0) {
            hVar = this;
            i13 = hVar.h(bArr, i10, i11, 0, true);
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
        c(bArr, i10, i11, false);
    }

    @Override
    public final void s(int i10) {
        int min = Math.min(this.h, i10);
        j(min);
        int i11 = min;
        while (i11 < i10 && i11 != -1) {
            byte[] bArr = this.f46554a;
            i11 = h(bArr, -i11, Math.min(i10, bArr.length + i11), i11, false);
        }
        if (i11 != -1) {
            this.d += i11;
        }
    }

    @Override
    public final int skip(int i10) {
        h hVar;
        int min = Math.min(this.h, i10);
        j(min);
        if (min == 0) {
            byte[] bArr = this.f46554a;
            hVar = this;
            min = hVar.h(bArr, 0, Math.min(i10, bArr.length), 0, true);
        } else {
            hVar = this;
        }
        if (min != -1) {
            hVar.d += min;
        }
        return min;
    }
}
