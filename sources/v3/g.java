package v3;

import f5.d0;
import o3.s;
import o3.u;
public final class g implements f {
    public final long[] f49352a;
    public final long[] f49353b;
    public final long f49354c;
    public final long d;

    public g(long[] jArr, long[] jArr2, long j10, long j11) {
        this.f49352a = jArr;
        this.f49353b = jArr2;
        this.f49354c = j10;
        this.d = j11;
    }

    @Override
    public final long a() {
        return this.d;
    }

    @Override
    public final long b(long j10) {
        return this.f49352a[d0.e(this.f49353b, j10, true)];
    }

    @Override
    public final boolean c() {
        return true;
    }

    @Override
    public final s g(long j10) {
        long[] jArr = this.f49352a;
        int e10 = d0.e(jArr, j10, true);
        long j11 = jArr[e10];
        long[] jArr2 = this.f49353b;
        u uVar = new u(j11, jArr2[e10]);
        if (j11 < j10 && e10 != jArr.length - 1) {
            int i10 = e10 + 1;
            return new s(uVar, new u(jArr[i10], jArr2[i10]));
        }
        return new s(uVar, uVar);
    }

    @Override
    public final long h() {
        return this.f49354c;
    }
}
