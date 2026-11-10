package z3;

import f3.b0;
import f3.c0;
import f3.d0;
public final class k implements c0 {
    public final long f59638a;
    public final l[] f59639b;
    public final int f59640c;

    public k(long j3, l[] lVarArr, int i7) {
        this.f59638a = j3;
        this.f59639b = lVarArr;
        this.f59640c = i7;
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
    public final b0 f(long j3) {
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        int b10;
        long j15 = j3;
        l[] lVarArr = this.f59639b;
        int length = lVarArr.length;
        d0 d0Var = d0.f11015c;
        if (length == 0) {
            return new b0(d0Var, d0Var);
        }
        int i7 = this.f59640c;
        int i10 = -1;
        if (i7 != -1) {
            u uVar = lVarArr[i7].f59642b;
            int a10 = uVar.a(j15);
            if (a10 == -1) {
                a10 = uVar.b(j15);
            }
            long[] jArr = uVar.f59708c;
            long[] jArr2 = uVar.f59710f;
            if (a10 == -1) {
                return new b0(d0Var, d0Var);
            }
            long j16 = jArr2[a10];
            j10 = jArr[a10];
            if (j16 < j15 && a10 < uVar.f59707b - 1 && (b10 = uVar.b(j15)) != -1 && b10 != a10) {
                j12 = jArr2[b10];
                j14 = jArr[b10];
            } else {
                j14 = -1;
                j12 = -9223372036854775807L;
            }
            j11 = j14;
            j15 = j16;
        } else {
            j10 = Long.MAX_VALUE;
            j11 = -1;
            j12 = -9223372036854775807L;
        }
        int i11 = 0;
        long j17 = j10;
        while (i11 < lVarArr.length) {
            if (i11 != i7) {
                u uVar2 = lVarArr[i11].f59642b;
                long[] jArr3 = uVar2.f59708c;
                int a11 = uVar2.a(j15);
                if (a11 == i10) {
                    a11 = uVar2.b(j15);
                }
                if (a11 == i10) {
                    j13 = j12;
                } else {
                    j13 = j12;
                    j17 = Math.min(jArr3[a11], j17);
                }
                if (j13 != -9223372036854775807L) {
                    long j18 = j13;
                    int a12 = uVar2.a(j18);
                    if (a12 == -1) {
                        a12 = uVar2.b(j18);
                    }
                    if (a12 == -1) {
                        j13 = j18;
                    } else {
                        j13 = j18;
                        j11 = Math.min(jArr3[a12], j11);
                    }
                }
            } else {
                j13 = j12;
            }
            i11++;
            j12 = j13;
            i10 = -1;
        }
        long j19 = j12;
        d0 d0Var2 = new d0(j15, j17);
        if (j19 == -9223372036854775807L) {
            return new b0(d0Var2, d0Var2);
        }
        return new b0(d0Var2, new d0(j19, j11));
    }

    @Override
    public final long h() {
        return this.f59638a;
    }
}
