package u2;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
public final class n0 implements d0, c0 {
    public final d0[] f47344a;
    public final boolean[] f47345b;
    public final IdentityHashMap f47346c;
    public final ob.a d;
    public final ArrayList f47347e = new ArrayList();
    public final HashMap f47348f = new HashMap();
    public c0 h;
    public p1 f47349n;
    public d0[] f47350r;
    public n f47351s;

    public n0(ob.a aVar, long[] jArr, d0... d0VarArr) {
        this.d = aVar;
        this.f47344a = d0VarArr;
        aVar.getClass();
        e9.g0 g0Var = e9.i0.f8758b;
        e9.a1 a1Var = e9.a1.f8721e;
        this.f47351s = new n(a1Var, a1Var);
        this.f47346c = new IdentityHashMap();
        this.f47350r = new d0[0];
        this.f47345b = new boolean[d0VarArr.length];
        for (int i10 = 0; i10 < d0VarArr.length; i10++) {
            long j3 = jArr[i10];
            if (j3 != 0) {
                this.f47345b[i10] = true;
                this.f47344a[i10] = new o1(d0VarArr[i10], j3);
            }
        }
    }

    @Override
    public final void b(d0 d0Var) {
        ArrayList arrayList = this.f47347e;
        arrayList.remove(d0Var);
        if (!arrayList.isEmpty()) {
            return;
        }
        d0[] d0VarArr = this.f47344a;
        int i10 = 0;
        for (d0 d0Var2 : d0VarArr) {
            i10 += d0Var2.o().f47379a;
        }
        b2.l1[] l1VarArr = new b2.l1[i10];
        int i11 = 0;
        for (int i12 = 0; i12 < d0VarArr.length; i12++) {
            p1 o9 = d0VarArr[i12].o();
            int i13 = o9.f47379a;
            int i14 = 0;
            while (i14 < i13) {
                b2.l1 a2 = o9.a(i14);
                int i15 = a2.f3336a;
                b2.s[] sVarArr = new b2.s[i15];
                for (int i16 = 0; i16 < i15; i16++) {
                    b2.s sVar = a2.d[i16];
                    b2.r a10 = sVar.a();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i12);
                    sb2.append(":");
                    String str = sVar.f3549a;
                    if (str == null) {
                        str = "";
                    }
                    sb2.append(str);
                    a10.f3492a = sb2.toString();
                    sVarArr[i16] = new b2.s(a10);
                }
                b2.l1 l1Var = new b2.l1(i12 + ":" + a2.f3337b, sVarArr);
                this.f47348f.put(l1Var, a2);
                l1VarArr[i11] = l1Var;
                i14++;
                i11++;
            }
        }
        this.f47349n = new p1(l1VarArr);
        c0 c0Var = this.h;
        c0Var.getClass();
        c0Var.b(this);
    }

    @Override
    public final boolean c() {
        return this.f47351s.c();
    }

    @Override
    public final long d() {
        return this.f47351s.d();
    }

    @Override
    public final void f(e1 e1Var) {
        d0 d0Var = (d0) e1Var;
        c0 c0Var = this.h;
        c0Var.getClass();
        c0Var.f(this);
    }

    @Override
    public final void g() {
        for (d0 d0Var : this.f47344a) {
            d0Var.g();
        }
    }

    @Override
    public final long h(long j3) {
        long h = this.f47350r[0].h(j3);
        int i10 = 1;
        while (true) {
            d0[] d0VarArr = this.f47350r;
            if (i10 < d0VarArr.length) {
                if (d0VarArr[i10].h(h) == h) {
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
    public final void i(long j3) {
        for (d0 d0Var : this.f47350r) {
            d0Var.i(j3);
        }
    }

    @Override
    public final void k(c0 c0Var, long j3) {
        this.h = c0Var;
        ArrayList arrayList = this.f47347e;
        d0[] d0VarArr = this.f47344a;
        Collections.addAll(arrayList, d0VarArr);
        for (d0 d0Var : d0VarArr) {
            d0Var.k(this, j3);
        }
    }

    @Override
    public final long l() {
        d0[] d0VarArr;
        d0[] d0VarArr2;
        long j3 = -9223372036854775807L;
        for (d0 d0Var : this.f47350r) {
            long l4 = d0Var.l();
            if (l4 != -9223372036854775807L) {
                if (j3 == -9223372036854775807L) {
                    for (d0 d0Var2 : this.f47350r) {
                        if (d0Var2 == d0Var) {
                            break;
                        } else if (d0Var2.h(l4) != l4) {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j3 = l4;
                } else if (l4 != j3) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (j3 != -9223372036854775807L && d0Var.h(j3) != j3) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j3;
    }

    @Override
    public final boolean m(i2.s0 s0Var) {
        ArrayList arrayList = this.f47347e;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((d0) arrayList.get(i10)).m(s0Var);
            }
            return false;
        }
        return this.f47351s.m(s0Var);
    }

    @Override
    public final long n(x2.r[] rVarArr, boolean[] zArr, c1[] c1VarArr, boolean[] zArr2, long j3) {
        IdentityHashMap identityHashMap;
        c1 c1Var;
        int[] iArr;
        Integer num;
        int intValue;
        int[] iArr2 = new int[rVarArr.length];
        int[] iArr3 = new int[rVarArr.length];
        int i10 = 0;
        while (true) {
            int length = rVarArr.length;
            identityHashMap = this.f47346c;
            if (i10 >= length) {
                break;
            }
            c1 c1Var2 = c1VarArr[i10];
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
            iArr2[i10] = intValue;
            x2.r rVar = rVarArr[i10];
            if (rVar != null) {
                String str = rVar.b().f3337b;
                iArr3[i10] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr3[i10] = -1;
            }
            i10++;
        }
        identityHashMap.clear();
        int length2 = rVarArr.length;
        c1[] c1VarArr2 = new c1[length2];
        c1[] c1VarArr3 = new c1[rVarArr.length];
        x2.r[] rVarArr2 = new x2.r[rVarArr.length];
        d0[] d0VarArr = this.f47344a;
        ArrayList arrayList = new ArrayList(d0VarArr.length);
        long j10 = j3;
        int i11 = 0;
        while (i11 < d0VarArr.length) {
            int i12 = 0;
            while (i12 < rVarArr.length) {
                if (iArr2[i12] == i11) {
                    c1Var = c1VarArr[i12];
                } else {
                    c1Var = null;
                }
                c1VarArr3[i12] = c1Var;
                if (iArr3[i12] == i11) {
                    x2.r rVar2 = rVarArr[i12];
                    rVar2.getClass();
                    iArr = iArr2;
                    b2.l1 l1Var = (b2.l1) this.f47348f.get(rVar2.b());
                    l1Var.getClass();
                    rVarArr2[i12] = new m0(rVar2, l1Var);
                } else {
                    iArr = iArr2;
                    rVarArr2[i12] = null;
                }
                i12++;
                iArr2 = iArr;
            }
            int[] iArr4 = iArr2;
            d0[] d0VarArr2 = d0VarArr;
            int i13 = i11;
            long n10 = d0VarArr2[i11].n(rVarArr2, zArr, c1VarArr3, zArr2, j10);
            if (i13 == 0) {
                j10 = n10;
            } else if (n10 != j10) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z10 = false;
            for (int i14 = 0; i14 < rVarArr.length; i14++) {
                boolean z11 = true;
                if (iArr3[i14] == i13) {
                    c1 c1Var3 = c1VarArr3[i14];
                    c1Var3.getClass();
                    c1VarArr2[i14] = c1VarArr3[i14];
                    identityHashMap.put(c1Var3, Integer.valueOf(i13));
                    z10 = true;
                } else if (iArr4[i14] == i13) {
                    if (c1VarArr3[i14] != null) {
                        z11 = false;
                    }
                    e2.d.g(z11);
                }
            }
            if (z10) {
                arrayList.add(d0VarArr2[i13]);
            }
            i11 = i13 + 1;
            d0VarArr = d0VarArr2;
            iArr2 = iArr4;
        }
        System.arraycopy(c1VarArr2, 0, c1VarArr, 0, length2);
        this.f47350r = (d0[]) arrayList.toArray(new d0[0]);
        AbstractList w10 = e9.q.w(arrayList, new l0(0));
        this.d.getClass();
        this.f47351s = new n(arrayList, w10);
        return j10;
    }

    @Override
    public final p1 o() {
        p1 p1Var = this.f47349n;
        p1Var.getClass();
        return p1Var;
    }

    @Override
    public final long p() {
        return this.f47351s.p();
    }

    @Override
    public final long q(long j3, i2.q1 q1Var) {
        d0 d0Var;
        d0[] d0VarArr = this.f47350r;
        if (d0VarArr.length > 0) {
            d0Var = d0VarArr[0];
        } else {
            d0Var = this.f47344a[0];
        }
        return d0Var.q(j3, q1Var);
    }

    @Override
    public final void r(long j3) {
        this.f47351s.r(j3);
    }
}
