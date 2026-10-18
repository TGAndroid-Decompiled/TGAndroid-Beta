package u2;

import e9.x1;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import v7.u6;
public final class l0 implements d0, c0 {
    public final d0[] f47399a;
    public final boolean[] f47400b;
    public final IdentityHashMap f47401c;
    public final oa.d d;
    public final ArrayList e = new ArrayList();
    public final HashMap f47402f = new HashMap();
    public c0 h;
    public q1 f47403n;
    public d0[] f47404r;
    public n f47405s;

    public l0(oa.d dVar, long[] jArr, d0... d0VarArr) {
        this.d = dVar;
        this.f47399a = d0VarArr;
        dVar.getClass();
        e9.l0 l0Var = e9.n0.f8477b;
        x1 x1Var = x1.e;
        this.f47405s = new n(x1Var, x1Var);
        this.f47401c = new IdentityHashMap();
        this.f47404r = new d0[0];
        this.f47400b = new boolean[d0VarArr.length];
        for (int i10 = 0; i10 < d0VarArr.length; i10++) {
            long j10 = jArr[i10];
            if (j10 != 0) {
                this.f47400b[i10] = true;
                this.f47399a[i10] = new o1(d0VarArr[i10], j10);
            }
        }
    }

    @Override
    public final boolean c() {
        return this.f47405s.c();
    }

    @Override
    public final long d() {
        return this.f47405s.d();
    }

    @Override
    public final void g() {
        for (d0 d0Var : this.f47399a) {
            d0Var.g();
        }
    }

    @Override
    public final void h(d0 d0Var) {
        ArrayList arrayList = this.e;
        arrayList.remove(d0Var);
        if (!arrayList.isEmpty()) {
            return;
        }
        d0[] d0VarArr = this.f47399a;
        int i10 = 0;
        for (d0 d0Var2 : d0VarArr) {
            i10 += d0Var2.r().f47460a;
        }
        b2.p1[] p1VarArr = new b2.p1[i10];
        int i11 = 0;
        for (int i12 = 0; i12 < d0VarArr.length; i12++) {
            q1 r10 = d0VarArr[i12].r();
            int i13 = r10.f47460a;
            int i14 = 0;
            while (i14 < i13) {
                b2.p1 a2 = r10.a(i14);
                int i15 = a2.f3904a;
                b2.w[] wVarArr = new b2.w[i15];
                int i16 = 0;
                while (i16 < i15) {
                    b2.w wVar = a2.d[i16];
                    b2.v a10 = wVar.a();
                    String str = wVar.f4126m;
                    d0[] d0VarArr2 = d0VarArr;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i12);
                    sb2.append(":");
                    String str2 = wVar.f4117a;
                    if (str2 == null) {
                        str2 = "";
                    }
                    sb2.append(str2);
                    a10.f4065a = sb2.toString();
                    if (str != null) {
                        a10.f4073l = i12 + ":" + str;
                    }
                    wVarArr[i16] = new b2.w(a10);
                    i16++;
                    d0VarArr = d0VarArr2;
                }
                d0[] d0VarArr3 = d0VarArr;
                b2.p1 p1Var = new b2.p1(i12 + ":" + a2.f3905b, wVarArr);
                this.f47402f.put(p1Var, a2);
                p1VarArr[i11] = p1Var;
                i14++;
                i11++;
                d0VarArr = d0VarArr3;
            }
        }
        this.f47403n = new q1(p1VarArr);
        c0 c0Var = this.h;
        c0Var.getClass();
        c0Var.h(this);
    }

    @Override
    public final long i(long j10) {
        long i10 = this.f47404r[0].i(j10);
        int i11 = 1;
        while (true) {
            d0[] d0VarArr = this.f47404r;
            if (i11 < d0VarArr.length) {
                if (d0VarArr[i11].i(i10) == i10) {
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
    public final void k(long j10) {
        for (d0 d0Var : this.f47404r) {
            d0Var.k(j10);
        }
    }

    @Override
    public final void m(c0 c0Var, long j10) {
        this.h = c0Var;
        ArrayList arrayList = this.e;
        d0[] d0VarArr = this.f47399a;
        Collections.addAll(arrayList, d0VarArr);
        for (d0 d0Var : d0VarArr) {
            d0Var.m(this, j10);
        }
    }

    @Override
    public final long o() {
        d0[] d0VarArr;
        d0[] d0VarArr2;
        long j10 = -9223372036854775807L;
        for (d0 d0Var : this.f47404r) {
            long o10 = d0Var.o();
            if (o10 != -9223372036854775807L) {
                if (j10 == -9223372036854775807L) {
                    for (d0 d0Var2 : this.f47404r) {
                        if (d0Var2 == d0Var) {
                            break;
                        } else if (d0Var2.i(o10) != o10) {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j10 = o10;
                } else if (o10 != j10) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (j10 != -9223372036854775807L && d0Var.i(j10) != j10) {
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
                ((d0) arrayList.get(i10)).p(u0Var);
            }
            return false;
        }
        return this.f47405s.p(u0Var);
    }

    @Override
    public final long q(x2.p[] pVarArr, boolean[] zArr, c1[] c1VarArr, boolean[] zArr2, long j10) {
        IdentityHashMap identityHashMap;
        c1 c1Var;
        int[] iArr;
        Integer num;
        int intValue;
        int[] iArr2 = new int[pVarArr.length];
        int[] iArr3 = new int[pVarArr.length];
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int length = pVarArr.length;
            identityHashMap = this.f47401c;
            if (i11 >= length) {
                break;
            }
            c1 c1Var2 = c1VarArr[i11];
            if (c1Var2 == null) {
                num = null;
            } else {
                num = (Integer) identityHashMap.get(c1Var2);
            }
            if (num == null) {
                intValue = -1;
            } else {
                intValue = num.intValue();
            }
            iArr2[i11] = intValue;
            x2.p pVar = pVarArr[i11];
            if (pVar != null) {
                String str = pVar.b().f3905b;
                iArr3[i11] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr3[i11] = -1;
            }
            i11++;
        }
        identityHashMap.clear();
        int length2 = pVarArr.length;
        c1[] c1VarArr2 = new c1[length2];
        c1[] c1VarArr3 = new c1[pVarArr.length];
        x2.p[] pVarArr2 = new x2.p[pVarArr.length];
        d0[] d0VarArr = this.f47399a;
        ArrayList arrayList = new ArrayList(d0VarArr.length);
        long j11 = j10;
        int i12 = 0;
        while (i12 < d0VarArr.length) {
            int i13 = i10;
            while (i13 < pVarArr.length) {
                if (iArr2[i13] == i12) {
                    c1Var = c1VarArr[i13];
                } else {
                    c1Var = null;
                }
                c1VarArr3[i13] = c1Var;
                if (iArr3[i13] == i12) {
                    x2.p pVar2 = pVarArr[i13];
                    pVar2.getClass();
                    iArr = iArr2;
                    b2.p1 p1Var = (b2.p1) this.f47402f.get(pVar2.b());
                    p1Var.getClass();
                    pVarArr2[i13] = new k0(pVar2, p1Var);
                } else {
                    iArr = iArr2;
                    pVarArr2[i13] = null;
                }
                i13++;
                iArr2 = iArr;
            }
            int[] iArr4 = iArr2;
            d0[] d0VarArr2 = d0VarArr;
            int i14 = i12;
            long q6 = d0VarArr2[i12].q(pVarArr2, zArr, c1VarArr3, zArr2, j11);
            if (i14 == 0) {
                j11 = q6;
            } else if (q6 != j11) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z10 = false;
            for (int i15 = 0; i15 < pVarArr.length; i15++) {
                boolean z11 = true;
                if (iArr3[i15] == i14) {
                    c1 c1Var3 = c1VarArr3[i15];
                    c1Var3.getClass();
                    c1VarArr2[i15] = c1VarArr3[i15];
                    identityHashMap.put(c1Var3, Integer.valueOf(i14));
                    z10 = true;
                } else if (iArr4[i15] == i14) {
                    if (c1VarArr3[i15] != null) {
                        z11 = false;
                    }
                    u6.p(z11);
                }
            }
            if (z10) {
                arrayList.add(d0VarArr2[i14]);
            }
            i12 = i14 + 1;
            d0VarArr = d0VarArr2;
            iArr2 = iArr4;
            i10 = 0;
        }
        int i16 = i10;
        System.arraycopy(c1VarArr2, i16, c1VarArr, i16, length2);
        this.f47404r = (d0[]) arrayList.toArray(new d0[i16]);
        AbstractList x10 = e9.s.x(arrayList, new si.a(7));
        this.d.getClass();
        this.f47405s = new n(arrayList, x10);
        return j11;
    }

    @Override
    public final q1 r() {
        q1 q1Var = this.f47403n;
        q1Var.getClass();
        return q1Var;
    }

    @Override
    public final long s() {
        return this.f47405s.s();
    }

    @Override
    public final long t(long j10, i2.r1 r1Var) {
        d0 d0Var;
        d0[] d0VarArr = this.f47404r;
        if (d0VarArr.length > 0) {
            d0Var = d0VarArr[0];
        } else {
            d0Var = this.f47399a[0];
        }
        return d0Var.t(j10, r1Var);
    }

    @Override
    public final void u(long j10) {
        this.f47405s.u(j10);
    }

    @Override
    public final void v(e1 e1Var) {
        d0 d0Var = (d0) e1Var;
        c0 c0Var = this.h;
        c0Var.getClass();
        c0Var.v(this);
    }
}
