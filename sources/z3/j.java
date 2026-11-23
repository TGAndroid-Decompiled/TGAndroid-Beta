package z3;

import f3.a0;
import f3.b0;
import f3.c0;
public final class j implements b0 {
    public final long f61448a;
    public final k[] f61449b;
    public final int f61450c;

    public j(long j3, k[] kVarArr, int i7) {
        this.f61448a = j3;
        this.f61449b = kVarArr;
        this.f61450c = i7;
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
    public final a0 f(long j3) {
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        int b10;
        long j15 = j3;
        k[] kVarArr = this.f61449b;
        int length = kVarArr.length;
        c0 c0Var = c0.f11158c;
        if (length == 0) {
            return new a0(c0Var, c0Var);
        }
        int i7 = this.f61450c;
        int i10 = -1;
        if (i7 != -1) {
            t tVar = kVarArr[i7].f61452b;
            int a10 = tVar.a(j15);
            if (a10 == -1) {
                a10 = tVar.b(j15);
            }
            long[] jArr = tVar.f61518c;
            long[] jArr2 = tVar.f61520f;
            if (a10 == -1) {
                return new a0(c0Var, c0Var);
            }
            long j16 = jArr2[a10];
            j10 = jArr[a10];
            if (j16 < j15 && a10 < tVar.f61517b - 1 && (b10 = tVar.b(j15)) != -1 && b10 != a10) {
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
        while (i11 < kVarArr.length) {
            if (i11 != i7) {
                t tVar2 = kVarArr[i11].f61452b;
                long[] jArr3 = tVar2.f61518c;
                int a11 = tVar2.a(j15);
                if (a11 == i10) {
                    a11 = tVar2.b(j15);
                }
                if (a11 == i10) {
                    j13 = j12;
                } else {
                    j13 = j12;
                    j17 = Math.min(jArr3[a11], j17);
                }
                if (j13 != -9223372036854775807L) {
                    long j18 = j13;
                    int a12 = tVar2.a(j18);
                    if (a12 == -1) {
                        a12 = tVar2.b(j18);
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
        c0 c0Var2 = new c0(j15, j17);
        if (j19 == -9223372036854775807L) {
            return new a0(c0Var2, c0Var2);
        }
        return new a0(c0Var2, new c0(j19, j11));
    }

    @Override
    public final long h() {
        return this.f61448a;
    }
}
