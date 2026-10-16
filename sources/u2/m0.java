package u2;

import e9.x1;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import v7.u6;
public final class m0 implements e0, d0 {
    public final e0[] f45972a;
    public final boolean[] f45973b;
    public final IdentityHashMap f45974c;
    public final oa.d d;
    public final ArrayList e = new ArrayList();
    public final HashMap f45975f = new HashMap();
    public d0 h;
    public r1 f45976n;
    public e0[] f45977r;
    public o f45978s;

    public m0(oa.d dVar, long[] jArr, e0... e0VarArr) {
        this.d = dVar;
        this.f45972a = e0VarArr;
        dVar.getClass();
        e9.l0 l0Var = e9.n0.f8595b;
        x1 x1Var = x1.e;
        this.f45978s = new o(x1Var, x1Var);
        this.f45974c = new IdentityHashMap();
        this.f45977r = new e0[0];
        this.f45973b = new boolean[e0VarArr.length];
        for (int i10 = 0; i10 < e0VarArr.length; i10++) {
            long j10 = jArr[i10];
            if (j10 != 0) {
                this.f45973b[i10] = true;
                this.f45972a[i10] = new p1(e0VarArr[i10], j10);
            }
        }
    }

    @Override
    public final void F(f1 f1Var) {
        e0 e0Var = (e0) f1Var;
        d0 d0Var = this.h;
        d0Var.getClass();
        d0Var.F(this);
    }

    @Override
    public final boolean c() {
        return this.f45978s.c();
    }

    @Override
    public final long d() {
        return this.f45978s.d();
    }

    @Override
    public final void g() {
        for (e0 e0Var : this.f45972a) {
            e0Var.g();
        }
    }

    @Override
    public final long h(long j10) {
        long h = this.f45977r[0].h(j10);
        int i10 = 1;
        while (true) {
            e0[] e0VarArr = this.f45977r;
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
        for (e0 e0Var : this.f45977r) {
            e0Var.i(j10);
        }
    }

    @Override
    public final void k(d0 d0Var, long j10) {
        this.h = d0Var;
        ArrayList arrayList = this.e;
        e0[] e0VarArr = this.f45972a;
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
        for (e0 e0Var : this.f45977r) {
            long l4 = e0Var.l();
            if (l4 != -9223372036854775807L) {
                if (j10 == -9223372036854775807L) {
                    for (e0 e0Var2 : this.f45977r) {
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
    public final boolean m(i2.v0 v0Var) {
        ArrayList arrayList = this.e;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((e0) arrayList.get(i10)).m(v0Var);
            }
            return false;
        }
        return this.f45978s.m(v0Var);
    }

    @Override
    public final long n(x2.p[] pVarArr, boolean[] zArr, d1[] d1VarArr, boolean[] zArr2, long j10) {
        IdentityHashMap identityHashMap;
        d1 d1Var;
        int[] iArr;
        Integer num;
        int intValue;
        int[] iArr2 = new int[pVarArr.length];
        int[] iArr3 = new int[pVarArr.length];
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int length = pVarArr.length;
            identityHashMap = this.f45974c;
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
            x2.p pVar = pVarArr[i11];
            if (pVar != null) {
                String str = pVar.b().f2296b;
                iArr3[i11] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr3[i11] = -1;
            }
            i11++;
        }
        identityHashMap.clear();
        int length2 = pVarArr.length;
        d1[] d1VarArr2 = new d1[length2];
        d1[] d1VarArr3 = new d1[pVarArr.length];
        x2.p[] pVarArr2 = new x2.p[pVarArr.length];
        e0[] e0VarArr = this.f45972a;
        ArrayList arrayList = new ArrayList(e0VarArr.length);
        long j11 = j10;
        int i12 = 0;
        while (i12 < e0VarArr.length) {
            int i13 = i10;
            while (i13 < pVarArr.length) {
                if (iArr2[i13] == i12) {
                    d1Var = d1VarArr[i13];
                } else {
                    d1Var = null;
                }
                d1VarArr3[i13] = d1Var;
                if (iArr3[i13] == i12) {
                    x2.p pVar2 = pVarArr[i13];
                    pVar2.getClass();
                    iArr = iArr2;
                    b2.q1 q1Var = (b2.q1) this.f45975f.get(pVar2.b());
                    q1Var.getClass();
                    pVarArr2[i13] = new l0(pVar2, q1Var);
                } else {
                    iArr = iArr2;
                    pVarArr2[i13] = null;
                }
                i13++;
                iArr2 = iArr;
            }
            int[] iArr4 = iArr2;
            e0[] e0VarArr2 = e0VarArr;
            int i14 = i12;
            long n10 = e0VarArr2[i12].n(pVarArr2, zArr, d1VarArr3, zArr2, j11);
            if (i14 == 0) {
                j11 = n10;
            } else if (n10 != j11) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z10 = false;
            for (int i15 = 0; i15 < pVarArr.length; i15++) {
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
                    u6.p(z11);
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
        this.f45977r = (e0[]) arrayList.toArray(new e0[i16]);
        AbstractList x10 = e9.s.x(arrayList, new t0.a(4));
        this.d.getClass();
        this.f45978s = new o(arrayList, x10);
        return j11;
    }

    @Override
    public final r1 o() {
        r1 r1Var = this.f45976n;
        r1Var.getClass();
        return r1Var;
    }

    @Override
    public final long p() {
        return this.f45978s.p();
    }

    @Override
    public final void q(e0 e0Var) {
        ArrayList arrayList = this.e;
        arrayList.remove(e0Var);
        if (!arrayList.isEmpty()) {
            return;
        }
        e0[] e0VarArr = this.f45972a;
        int i10 = 0;
        for (e0 e0Var2 : e0VarArr) {
            i10 += e0Var2.o().f46033a;
        }
        b2.q1[] q1VarArr = new b2.q1[i10];
        int i11 = 0;
        for (int i12 = 0; i12 < e0VarArr.length; i12++) {
            r1 o10 = e0VarArr[i12].o();
            int i13 = o10.f46033a;
            int i14 = 0;
            while (i14 < i13) {
                b2.q1 a2 = o10.a(i14);
                int i15 = a2.f2295a;
                b2.x[] xVarArr = new b2.x[i15];
                int i16 = 0;
                while (i16 < i15) {
                    b2.x xVar = a2.d[i16];
                    b2.w a10 = xVar.a();
                    String str = xVar.f2517m;
                    e0[] e0VarArr2 = e0VarArr;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i12);
                    sb2.append(":");
                    String str2 = xVar.f2508a;
                    if (str2 == null) {
                        str2 = "";
                    }
                    sb2.append(str2);
                    a10.f2456a = sb2.toString();
                    if (str != null) {
                        a10.f2464l = i12 + ":" + str;
                    }
                    xVarArr[i16] = new b2.x(a10);
                    i16++;
                    e0VarArr = e0VarArr2;
                }
                e0[] e0VarArr3 = e0VarArr;
                b2.q1 q1Var = new b2.q1(i12 + ":" + a2.f2296b, xVarArr);
                this.f45975f.put(q1Var, a2);
                q1VarArr[i11] = q1Var;
                i14++;
                i11++;
                e0VarArr = e0VarArr3;
            }
        }
        this.f45976n = new r1(q1VarArr);
        d0 d0Var = this.h;
        d0Var.getClass();
        d0Var.q(this);
    }

    @Override
    public final long r(long j10, i2.t1 t1Var) {
        e0 e0Var;
        e0[] e0VarArr = this.f45977r;
        if (e0VarArr.length > 0) {
            e0Var = e0VarArr[0];
        } else {
            e0Var = this.f45972a[0];
        }
        return e0Var.r(j10, t1Var);
    }

    @Override
    public final void s(long j10) {
        this.f45978s.s(j10);
    }
}
