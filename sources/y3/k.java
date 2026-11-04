package y3;

import e3.a0;
import e3.b0;
import e3.c0;
public final class k implements b0 {
    public final long f58955a;
    public final l[] f58956b;
    public final int f58957c;

    public k(long j10, l[] lVarArr, int i3) {
        this.f58955a = j10;
        this.f58956b = lVarArr;
        this.f58957c = i3;
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
        l[] lVarArr = this.f58956b;
        int length = lVarArr.length;
        c0 c0Var = c0.f9436c;
        if (length == 0) {
            return new a0(c0Var, c0Var);
        }
        int i3 = this.f58957c;
        int i10 = -1;
        if (i3 != -1) {
            u uVar = lVarArr[i3].f58959b;
            int a10 = uVar.a(j16);
            if (a10 == -1) {
                a10 = uVar.b(j16);
            }
            long[] jArr = uVar.f59025c;
            long[] jArr2 = uVar.f59027f;
            if (a10 == -1) {
                return new a0(c0Var, c0Var);
            }
            long j17 = jArr2[a10];
            j11 = jArr[a10];
            if (j17 < j16 && a10 < uVar.f59024b - 1 && (b10 = uVar.b(j16)) != -1 && b10 != a10) {
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
        int i11 = 0;
        long j18 = j11;
        while (i11 < lVarArr.length) {
            if (i11 != i3) {
                u uVar2 = lVarArr[i11].f58959b;
                long[] jArr3 = uVar2.f59025c;
                int a11 = uVar2.a(j16);
                if (a11 == i10) {
                    a11 = uVar2.b(j16);
                }
                if (a11 == i10) {
                    j14 = j13;
                } else {
                    j14 = j13;
                    j18 = Math.min(jArr3[a11], j18);
                }
                if (j14 != -9223372036854775807L) {
                    long j19 = j14;
                    int a12 = uVar2.a(j19);
                    if (a12 == -1) {
                        a12 = uVar2.b(j19);
                    }
                    if (a12 == -1) {
                        j14 = j19;
                    } else {
                        j14 = j19;
                        j12 = Math.min(jArr3[a12], j12);
                    }
                }
            } else {
                j14 = j13;
            }
            i11++;
            j13 = j14;
            i10 = -1;
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
        return this.f58955a;
    }
}
