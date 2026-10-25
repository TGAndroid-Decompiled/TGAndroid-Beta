package w3;

import c3.a0;
import c3.b0;
import c3.c0;
public final class j implements b0 {
    public final long f50703a;
    public final k[] f50704b;
    public final int f50705c;

    public j(long j10, k[] kVarArr, int i10) {
        this.f50703a = j10;
        this.f50704b = kVarArr;
        this.f50705c = i10;
    }

    @Override
    public final boolean d() {
        return true;
    }

    @Override
    public final boolean e() {
        return false;
    }

    @Override
    public final a0 f(long j10) {
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        int b10;
        long j16 = j10;
        k[] kVarArr = this.f50704b;
        int length = kVarArr.length;
        c0 c0Var = c0.f6030c;
        if (length == 0) {
            return new a0(c0Var, c0Var);
        }
        int i10 = this.f50705c;
        int i11 = -1;
        if (i10 != -1) {
            t tVar = kVarArr[i10].f50707b;
            int a2 = tVar.a(j16);
            if (a2 == -1) {
                a2 = tVar.b(j16);
            }
            long[] jArr = tVar.f50767c;
            long[] jArr2 = tVar.f50768f;
            if (a2 == -1) {
                return new a0(c0Var, c0Var);
            }
            long j17 = jArr2[a2];
            j11 = jArr[a2];
            if (j17 < j16 && a2 < tVar.f50766b - 1 && (b10 = tVar.b(j16)) != -1 && b10 != a2) {
                j13 = jArr2[b10];
                j15 = jArr[b10];
            } else {
                j15 = -1;
                j13 = -9223372036854775807L;
            }
            j12 = j15;
            j16 = j17;
        } else {
            j11 = Long.MAX_VALUE;
            j12 = -1;
            j13 = -9223372036854775807L;
        }
        int i12 = 0;
        long j18 = j11;
        while (i12 < kVarArr.length) {
            if (i12 != i10) {
                t tVar2 = kVarArr[i12].f50707b;
                long[] jArr3 = tVar2.f50767c;
                int a10 = tVar2.a(j16);
                if (a10 == i11) {
                    a10 = tVar2.b(j16);
                }
                if (a10 == i11) {
                    j14 = j13;
                } else {
                    j14 = j13;
                    j18 = Math.min(jArr3[a10], j18);
                }
                if (j14 != -9223372036854775807L) {
                    long j19 = j14;
                    int a11 = tVar2.a(j19);
                    if (a11 == -1) {
                        a11 = tVar2.b(j19);
                    }
                    if (a11 == -1) {
                        j14 = j19;
                    } else {
                        j14 = j19;
                        j12 = Math.min(jArr3[a11], j12);
                    }
                }
            } else {
                j14 = j13;
            }
            i12++;
            j13 = j14;
            i11 = -1;
        }
        long j20 = j13;
        c0 c0Var2 = new c0(j16, j18);
        if (j20 == -9223372036854775807L) {
            return new a0(c0Var2, c0Var2);
        }
        return new a0(c0Var2, new c0(j20, j12));
    }

    @Override
    public final long h() {
        return this.f50703a;
    }
}
