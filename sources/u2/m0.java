package u2;

import a8.yb;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
public final class m0 implements e0, d0 {
    public final e0[] f49386a;
    public final boolean[] f49387b;
    public final IdentityHashMap f49388c;
    public final pa.d d;
    public final ArrayList e = new ArrayList();
    public final HashMap f49389f = new HashMap();
    public d0 h;
    public r1 f49390n;
    public e0[] f49391r;
    public n f49392s;

    public m0(pa.d dVar, long[] jArr, e0... e0VarArr) {
        this.d = dVar;
        this.f49386a = e0VarArr;
        dVar.getClass();
        f9.g0 g0Var = f9.i0.f10286b;
        f9.s1 s1Var = f9.s1.e;
        this.f49392s = new n(s1Var, s1Var);
        this.f49388c = new IdentityHashMap();
        this.f49391r = new e0[0];
        this.f49387b = new boolean[e0VarArr.length];
        for (int i10 = 0; i10 < e0VarArr.length; i10++) {
            long j10 = jArr[i10];
            if (j10 != 0) {
                this.f49387b[i10] = true;
                this.f49386a[i10] = new p1(e0VarArr[i10], j10);
            }
        }
    }

    @Override
    public final long b() {
        return this.f49392s.b();
    }

    @Override
    public final boolean c() {
        return this.f49392s.c();
    }

    @Override
    public final void g() {
        for (e0 e0Var : this.f49386a) {
            e0Var.g();
        }
    }

    @Override
    public final long h(long j10) {
        long h = this.f49391r[0].h(j10);
        int i10 = 1;
        while (true) {
            e0[] e0VarArr = this.f49391r;
            if (i10 < e0VarArr.length) {
                if (e0VarArr[i10].h(h) == h) {
                    i10++;
                } else {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else {
                return h;
            }
        }
    }

    @Override
    public final void i(long j10) {
        for (e0 e0Var : this.f49391r) {
            e0Var.i(j10);
        }
    }

    @Override
    public final void k(d0 d0Var, long j10) {
        this.h = d0Var;
        ArrayList arrayList = this.e;
        e0[] e0VarArr = this.f49386a;
        Collections.addAll(arrayList, e0VarArr);
        for (e0 e0Var : e0VarArr) {
            e0Var.k(this, j10);
        }
    }

    @Override
    public final long l() {
        e0[] e0VarArr;
        e0[] e0VarArr2;
        long j10 = -9223372036854775807L;
        for (e0 e0Var : this.f49391r) {
            long l4 = e0Var.l();
            if (l4 != -9223372036854775807L) {
                if (j10 == -9223372036854775807L) {
                    for (e0 e0Var2 : this.f49391r) {
                        if (e0Var2 == e0Var) {
                            break;
                        } else if (e0Var2.h(l4) != l4) {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j10 = l4;
                } else if (l4 != j10) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (j10 != -9223372036854775807L && e0Var.h(j10) != j10) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j10;
    }

    @Override
    public final boolean m(i2.w0 w0Var) {
        ArrayList arrayList = this.e;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((e0) arrayList.get(i10)).m(w0Var);
            }
            return false;
        }
        return this.f49392s.m(w0Var);
    }

    @Override
    public final void n(e0 e0Var) {
        ArrayList arrayList = this.e;
        arrayList.remove(e0Var);
        if (!arrayList.isEmpty()) {
            return;
        }
        e0[] e0VarArr = this.f49386a;
        int i10 = 0;
        for (e0 e0Var2 : e0VarArr) {
            i10 += e0Var2.p().f49450a;
        }
        b2.q1[] q1VarArr = new b2.q1[i10];
        int i11 = 0;
        for (int i12 = 0; i12 < e0VarArr.length; i12++) {
            r1 p10 = e0VarArr[i12].p();
            int i13 = p10.f49450a;
            int i14 = 0;
            while (i14 < i13) {
                b2.q1 a2 = p10.a(i14);
                int i15 = a2.f3358a;
                b2.x[] xVarArr = new b2.x[i15];
                int i16 = 0;
                while (i16 < i15) {
                    b2.x xVar = a2.d[i16];
                    b2.w a10 = xVar.a();
                    String str = xVar.f3580m;
                    e0[] e0VarArr2 = e0VarArr;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i12);
                    sb2.append(":");
                    String str2 = xVar.f3571a;
                    if (str2 == null) {
                        str2 = "";
                    }
                    sb2.append(str2);
                    a10.f3519a = sb2.toString();
                    if (str != null) {
                        a10.f3527l = i12 + ":" + str;
                    }
                    xVarArr[i16] = new b2.x(a10);
                    i16++;
                    e0VarArr = e0VarArr2;
                }
                e0[] e0VarArr3 = e0VarArr;
                b2.q1 q1Var = new b2.q1(i12 + ":" + a2.f3359b, xVarArr);
                this.f49389f.put(q1Var, a2);
                q1VarArr[i11] = q1Var;
                i14++;
                i11++;
                e0VarArr = e0VarArr3;
            }
        }
        this.f49390n = new r1(q1VarArr);
        d0 d0Var = this.h;
        d0Var.getClass();
        d0Var.n(this);
    }

    @Override
    public final long o(x2.q[] qVarArr, boolean[] zArr, d1[] d1VarArr, boolean[] zArr2, long j10) {
        IdentityHashMap identityHashMap;
        d1 d1Var;
        int[] iArr;
        Integer num;
        int intValue;
        int[] iArr2 = new int[qVarArr.length];
        int[] iArr3 = new int[qVarArr.length];
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int length = qVarArr.length;
            identityHashMap = this.f49388c;
            if (i11 >= length) {
                break;
            }
            d1 d1Var2 = d1VarArr[i11];
            if (d1Var2 == null) {
                num = null;
            } else {
                num = (Integer) identityHashMap.get(d1Var2);
            }
            if (num == null) {
                intValue = -1;
            } else {
                intValue = num.intValue();
            }
            iArr2[i11] = intValue;
            x2.q qVar = qVarArr[i11];
            if (qVar != null) {
                String str = qVar.b().f3359b;
                iArr3[i11] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr3[i11] = -1;
            }
            i11++;
        }
        identityHashMap.clear();
        int length2 = qVarArr.length;
        d1[] d1VarArr2 = new d1[length2];
        d1[] d1VarArr3 = new d1[qVarArr.length];
        x2.q[] qVarArr2 = new x2.q[qVarArr.length];
        e0[] e0VarArr = this.f49386a;
        ArrayList arrayList = new ArrayList(e0VarArr.length);
        long j11 = j10;
        int i12 = 0;
        while (i12 < e0VarArr.length) {
            int i13 = i10;
            while (i13 < qVarArr.length) {
                if (iArr2[i13] == i12) {
                    d1Var = d1VarArr[i13];
                } else {
                    d1Var = null;
                }
                d1VarArr3[i13] = d1Var;
                if (iArr3[i13] == i12) {
                    x2.q qVar2 = qVarArr[i13];
                    qVar2.getClass();
                    iArr = iArr2;
                    b2.q1 q1Var = (b2.q1) this.f49389f.get(qVar2.b());
                    q1Var.getClass();
                    qVarArr2[i13] = new l0(qVar2, q1Var);
                } else {
                    iArr = iArr2;
                    qVarArr2[i13] = null;
                }
                i13++;
                iArr2 = iArr;
            }
            int[] iArr4 = iArr2;
            e0[] e0VarArr2 = e0VarArr;
            int i14 = i12;
            long o10 = e0VarArr2[i12].o(qVarArr2, zArr, d1VarArr3, zArr2, j11);
            if (i14 == 0) {
                j11 = o10;
            } else if (o10 != j11) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z10 = false;
            for (int i15 = 0; i15 < qVarArr.length; i15++) {
                boolean z11 = true;
                if (iArr3[i15] == i14) {
                    d1 d1Var3 = d1VarArr3[i15];
                    d1Var3.getClass();
                    d1VarArr2[i15] = d1VarArr3[i15];
                    identityHashMap.put(d1Var3, Integer.valueOf(i14));
                    z10 = true;
                } else if (iArr4[i15] == i14) {
                    if (d1VarArr3[i15] != null) {
                        z11 = false;
                    }
                    yb.p(z11);
                }
            }
            if (z10) {
                arrayList.add(e0VarArr2[i14]);
            }
            i12 = i14 + 1;
            e0VarArr = e0VarArr2;
            iArr2 = iArr4;
            i10 = 0;
        }
        int i16 = i10;
        System.arraycopy(d1VarArr2, i16, d1VarArr, i16, length2);
        this.f49391r = (e0[]) arrayList.toArray(new e0[i16]);
        AbstractList x9 = f9.o.x(arrayList, new s0.b(18));
        this.d.getClass();
        this.f49392s = new n(arrayList, x9);
        return j11;
    }

    @Override
    public final r1 p() {
        r1 r1Var = this.f49390n;
        r1Var.getClass();
        return r1Var;
    }

    @Override
    public final long q() {
        return this.f49392s.q();
    }

    @Override
    public final long r(long j10, i2.t1 t1Var) {
        e0 e0Var;
        e0[] e0VarArr = this.f49391r;
        if (e0VarArr.length > 0) {
            e0Var = e0VarArr[0];
        } else {
            e0Var = this.f49386a[0];
        }
        return e0Var.r(j10, t1Var);
    }

    @Override
    public final void s(long j10) {
        this.f49392s.s(j10);
    }

    @Override
    public final void u(f1 f1Var) {
        e0 e0Var = (e0) f1Var;
        d0 d0Var = this.h;
        d0Var.getClass();
        d0Var.u(this);
    }
}
