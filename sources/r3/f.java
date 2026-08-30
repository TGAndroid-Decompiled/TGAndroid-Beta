package r3;

import h5.d0;
import java.util.Arrays;
public final class f implements s {
    public final int f43211a;
    public final int[] f43212b;
    public final long[] f43213c;
    public final long[] d;
    public final long[] e;
    public final long f43214f;

    public f(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f43212b = iArr;
        this.f43213c = jArr;
        this.d = jArr2;
        this.e = jArr3;
        int length = iArr.length;
        this.f43211a = length;
        if (length > 0) {
            this.f43214f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f43214f = 0L;
        }
    }

    @Override
    public final boolean c() {
        return true;
    }

    @Override
    public final r f(long j10) {
        long[] jArr = this.e;
        int e = d0.e(jArr, j10, true);
        long j11 = jArr[e];
        long[] jArr2 = this.f43213c;
        t tVar = new t(j11, jArr2[e]);
        if (j11 < j10 && e != this.f43211a - 1) {
            int i10 = e + 1;
            return new r(tVar, new t(jArr[i10], jArr2[i10]));
        }
        return new r(tVar, tVar);
    }

    @Override
    public final long g() {
        return this.f43214f;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.f43211a + ", sizes=" + Arrays.toString(this.f43212b) + ", offsets=" + Arrays.toString(this.f43213c) + ", timeUs=" + Arrays.toString(this.e) + ", durationsUs=" + Arrays.toString(this.d) + ")";
    }
}
