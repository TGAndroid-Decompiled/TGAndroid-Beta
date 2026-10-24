package u2;

import e9.x1;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import v7.u6;
public final class o0 implements f0, e0 {
    public final f0[] f47825a;
    public final boolean[] f47826b;
    public final IdentityHashMap f47827c;
    public final oa.d d;
    public final ArrayList e = new ArrayList();
    public final HashMap f47828f = new HashMap();
    public e0 h;
    public t1 f47829n;
    public f0[] f47830r;
    public o f47831s;

    public o0(oa.d dVar, long[] jArr, f0... f0VarArr) {
        this.d = dVar;
        this.f47825a = f0VarArr;
        dVar.getClass();
        e9.l0 l0Var = e9.n0.f8481b;
        x1 x1Var = x1.e;
        this.f47831s = new o(x1Var, x1Var);
        this.f47827c = new IdentityHashMap();
        this.f47830r = new f0[0];
        this.f47826b = new boolean[f0VarArr.length];
        for (int i10 = 0; i10 < f0VarArr.length; i10++) {
            long j10 = jArr[i10];
            if (j10 != 0) {
                this.f47826b[i10] = true;
                this.f47825a[i10] = new r1(f0VarArr[i10], j10);
            }
        }
    }

    @Override
    public final void a(f0 f0Var) {
        ArrayList arrayList = this.e;
        arrayList.remove(f0Var);
        if (!arrayList.isEmpty()) {
            return;
        }
        f0[] f0VarArr = this.f47825a;
        int i10 = 0;
        for (f0 f0Var2 : f0VarArr) {
            i10 += f0Var2.r().f47887a;
        }
        b2.p1[] p1VarArr = new b2.p1[i10];
        int i11 = 0;
        for (int i12 = 0; i12 < f0VarArr.length; i12++) {
            t1 r10 = f0VarArr[i12].r();
            int i13 = r10.f47887a;
            int i14 = 0;
            while (i14 < i13) {
                b2.p1 a2 = r10.a(i14);
                int i15 = a2.f3907a;
                b2.w[] wVarArr = new b2.w[i15];
                int i16 = 0;
                while (i16 < i15) {
                    b2.w wVar = a2.d[i16];
                    b2.v a10 = wVar.a();
                    String str = wVar.f4129m;
                    f0[] f0VarArr2 = f0VarArr;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i12);
                    sb2.append(":");
                    String str2 = wVar.f4120a;
                    if (str2 == null) {
                        str2 = "";
                    }
                    sb2.append(str2);
                    a10.f4068a = sb2.toString();
                    if (str != null) {
                        a10.f4076l = i12 + ":" + str;
                    }
                    wVarArr[i16] = new b2.w(a10);
                    i16++;
                    f0VarArr = f0VarArr2;
                }
                f0[] f0VarArr3 = f0VarArr;
                b2.p1 p1Var = new b2.p1(i12 + ":" + a2.f3908b, wVarArr);
                this.f47828f.put(p1Var, a2);
                p1VarArr[i11] = p1Var;
                i14++;
                i11++;
                f0VarArr = f0VarArr3;
            }
        }
        this.f47829n = new t1(p1VarArr);
        e0 e0Var = this.h;
        e0Var.getClass();
        e0Var.a(this);
    }

    @Override
    public final void b(h1 h1Var) {
        f0 f0Var = (f0) h1Var;
        e0 e0Var = this.h;
        e0Var.getClass();
        e0Var.b(this);
    }

    @Override
    public final boolean c() {
        return this.f47831s.c();
    }

    @Override
    public final long d() {
        return this.f47831s.d();
    }

    @Override
    public final void h() {
        for (f0 f0Var : this.f47825a) {
            f0Var.h();
        }
    }

    @Override
    public final long i(long j10) {
        long i10 = this.f47830r[0].i(j10);
        int i11 = 1;
        while (true) {
            f0[] f0VarArr = this.f47830r;
            if (i11 < f0VarArr.length) {
                if (f0VarArr[i11].i(i10) == i10) {
                    i11++;
                } else {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else {
                return i10;
            }
        }
    }

    @Override
    public final void l(long j10) {
        for (f0 f0Var : this.f47830r) {
            f0Var.l(j10);
        }
    }

    @Override
    public final void n(e0 e0Var, long j10) {
        this.h = e0Var;
        ArrayList arrayList = this.e;
        f0[] f0VarArr = this.f47825a;
        Collections.addAll(arrayList, f0VarArr);
        for (f0 f0Var : f0VarArr) {
            f0Var.n(this, j10);
        }
    }

    @Override
    public final long o() {
        f0[] f0VarArr;
        f0[] f0VarArr2;
        long j10 = -9223372036854775807L;
        for (f0 f0Var : this.f47830r) {
            long o10 = f0Var.o();
            if (o10 != -9223372036854775807L) {
                if (j10 == -9223372036854775807L) {
                    for (f0 f0Var2 : this.f47830r) {
                        if (f0Var2 == f0Var) {
                            break;
                        } else if (f0Var2.i(o10) != o10) {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j10 = o10;
                } else if (o10 != j10) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (j10 != -9223372036854775807L && f0Var.i(j10) != j10) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j10;
    }

    @Override
    public final boolean p(i2.u0 u0Var) {
        ArrayList arrayList = this.e;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((f0) arrayList.get(i10)).p(u0Var);
            }
            return false;
        }
        return this.f47831s.p(u0Var);
    }

    @Override
    public final long q(x2.p[] pVarArr, boolean[] zArr, f1[] f1VarArr, boolean[] zArr2, long j10) {
        IdentityHashMap identityHashMap;
        f1 f1Var;
        int[] iArr;
        Integer num;
        int intValue;
        int[] iArr2 = new int[pVarArr.length];
        int[] iArr3 = new int[pVarArr.length];
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int length = pVarArr.length;
            identityHashMap = this.f47827c;
            if (i11 >= length) {
                break;
            }
            f1 f1Var2 = f1VarArr[i11];
            if (f1Var2 == null) {
                num = null;
            } else {
                num = (Integer) identityHashMap.get(f1Var2);
            }
            if (num == null) {
                intValue = -1;
            } else {
                intValue = num.intValue();
            }
            iArr2[i11] = intValue;
            x2.p pVar = pVarArr[i11];
            if (pVar != null) {
                String str = pVar.b().f3908b;
                iArr3[i11] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr3[i11] = -1;
            }
            i11++;
        }
        identityHashMap.clear();
        int length2 = pVarArr.length;
        f1[] f1VarArr2 = new f1[length2];
        f1[] f1VarArr3 = new f1[pVarArr.length];
        x2.p[] pVarArr2 = new x2.p[pVarArr.length];
        f0[] f0VarArr = this.f47825a;
        ArrayList arrayList = new ArrayList(f0VarArr.length);
        long j11 = j10;
        int i12 = 0;
        while (i12 < f0VarArr.length) {
            int i13 = i10;
            while (i13 < pVarArr.length) {
                if (iArr2[i13] == i12) {
                    f1Var = f1VarArr[i13];
                } else {
                    f1Var = null;
                }
                f1VarArr3[i13] = f1Var;
                if (iArr3[i13] == i12) {
                    x2.p pVar2 = pVarArr[i13];
                    pVar2.getClass();
                    iArr = iArr2;
                    b2.p1 p1Var = (b2.p1) this.f47828f.get(pVar2.b());
                    p1Var.getClass();
                    pVarArr2[i13] = new n0(pVar2, p1Var);
                } else {
                    iArr = iArr2;
                    pVarArr2[i13] = null;
                }
                i13++;
                iArr2 = iArr;
            }
            int[] iArr4 = iArr2;
            f0[] f0VarArr2 = f0VarArr;
            int i14 = i12;
            long q6 = f0VarArr2[i12].q(pVarArr2, zArr, f1VarArr3, zArr2, j11);
            if (i14 == 0) {
                j11 = q6;
            } else if (q6 != j11) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z10 = false;
            for (int i15 = 0; i15 < pVarArr.length; i15++) {
                boolean z11 = true;
                if (iArr3[i15] == i14) {
                    f1 f1Var3 = f1VarArr3[i15];
                    f1Var3.getClass();
                    f1VarArr2[i15] = f1VarArr3[i15];
                    identityHashMap.put(f1Var3, Integer.valueOf(i14));
                    z10 = true;
                } else if (iArr4[i15] == i14) {
                    if (f1VarArr3[i15] != null) {
                        z11 = false;
                    }
                    u6.p(z11);
                }
            }
            if (z10) {
                arrayList.add(f0VarArr2[i14]);
            }
            i12 = i14 + 1;
            f0VarArr = f0VarArr2;
            iArr2 = iArr4;
            i10 = 0;
        }
        int i16 = i10;
        System.arraycopy(f1VarArr2, i16, f1VarArr, i16, length2);
        this.f47830r = (f0[]) arrayList.toArray(new f0[i16]);
        AbstractList x10 = e9.s.x(arrayList, new s0.b(20));
        this.d.getClass();
        this.f47831s = new o(arrayList, x10);
        return j11;
    }

    @Override
    public final t1 r() {
        t1 t1Var = this.f47829n;
        t1Var.getClass();
        return t1Var;
    }

    @Override
    public final long s() {
        return this.f47831s.s();
    }

    @Override
    public final long t(long j10, i2.s1 s1Var) {
        f0 f0Var;
        f0[] f0VarArr = this.f47830r;
        if (f0VarArr.length > 0) {
            f0Var = f0VarArr[0];
        } else {
            f0Var = this.f47825a[0];
        }
        return f0Var.t(j10, s1Var);
    }

    @Override
    public final void u(long j10) {
        this.f47831s.u(j10);
    }
}
