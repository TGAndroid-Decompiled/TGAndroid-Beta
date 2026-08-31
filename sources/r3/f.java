package r3;

import h5.d0;
import java.util.Arrays;
public final class f implements s {
    public final int f46543a;
    public final int[] f46544b;
    public final long[] f46545c;
    public final long[] d;
    public final long[] f46546e;
    public final long f46547f;

    public f(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f46544b = iArr;
        this.f46545c = jArr;
        this.d = jArr2;
        this.f46546e = jArr3;
        int length = iArr.length;
        this.f46543a = length;
        if (length > 0) {
            this.f46547f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f46547f = 0L;
        }
    }

    @Override
    public final boolean c() {
        return true;
    }

    @Override
    public final r f(long j10) {
        long[] jArr = this.f46546e;
        int e6 = d0.e(jArr, j10, true);
        long j11 = jArr[e6];
        long[] jArr2 = this.f46545c;
        t tVar = new t(j11, jArr2[e6]);
        if (j11 < j10 && e6 != this.f46543a - 1) {
            int i10 = e6 + 1;
            return new r(tVar, new t(jArr[i10], jArr2[i10]));
        }
        return new r(tVar, tVar);
    }

    @Override
    public final long g() {
        return this.f46547f;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.f46543a + ", sizes=" + Arrays.toString(this.f46544b) + ", offsets=" + Arrays.toString(this.f46545c) + ", timeUs=" + Arrays.toString(this.f46546e) + ", durationsUs=" + Arrays.toString(this.d) + ")";
    }
}
