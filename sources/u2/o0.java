package u2;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
public final class o0 implements e0, d0 {
    public final e0[] f42404a;
    public final boolean[] f42405b;
    public final IdentityHashMap f42406c;
    public final ob.a d;
    public final ArrayList e = new ArrayList();
    public final HashMap f42407f = new HashMap();
    public d0 h;
    public q1 f42408n;
    public e0[] f42409r;
    public o f42410s;

    public o0(ob.a aVar, long[] jArr, e0... e0VarArr) {
        this.d = aVar;
        this.f42404a = e0VarArr;
        aVar.getClass();
        e9.g0 g0Var = e9.i0.f7384b;
        e9.a1 a1Var = e9.a1.e;
        this.f42410s = new o(a1Var, a1Var);
        this.f42406c = new IdentityHashMap();
        this.f42409r = new e0[0];
        this.f42405b = new boolean[e0VarArr.length];
        for (int i10 = 0; i10 < e0VarArr.length; i10++) {
            long j3 = jArr[i10];
            if (j3 != 0) {
                this.f42405b[i10] = true;
                this.f42404a[i10] = new p1(e0VarArr[i10], j3);
            }
        }
    }

    @Override
    public final void b(e0 e0Var) {
        ArrayList arrayList = this.e;
        arrayList.remove(e0Var);
        if (!arrayList.isEmpty()) {
            return;
        }
        e0[] e0VarArr = this.f42404a;
        int i10 = 0;
        for (e0 e0Var2 : e0VarArr) {
            i10 += e0Var2.q().f42436a;
        }
        b2.l1[] l1VarArr = new b2.l1[i10];
        int i11 = 0;
        for (int i12 = 0; i12 < e0VarArr.length; i12++) {
            q1 q6 = e0VarArr[i12].q();
            int i13 = q6.f42436a;
            int i14 = 0;
            while (i14 < i13) {
                b2.l1 a2 = q6.a(i14);
                int i15 = a2.f1784a;
                b2.s[] sVarArr = new b2.s[i15];
                for (int i16 = 0; i16 < i15; i16++) {
                    b2.s sVar = a2.d[i16];
                    b2.r a10 = sVar.a();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i12);
                    sb2.append(":");
                    String str = sVar.f1988a;
                    if (str == null) {
                        str = "";
                    }
                    sb2.append(str);
                    a10.f1933a = sb2.toString();
                    sVarArr[i16] = new b2.s(a10);
                }
                b2.l1 l1Var = new b2.l1(i12 + ":" + a2.f1785b, sVarArr);
                this.f42407f.put(l1Var, a2);
                l1VarArr[i11] = l1Var;
                i14++;
                i11++;
            }
        }
        this.f42408n = new q1(l1VarArr);
        d0 d0Var = this.h;
        d0Var.getClass();
        d0Var.b(this);
    }

    @Override
    public final boolean c() {
        return this.f42410s.c();
    }

    @Override
    public final long d() {
        return this.f42410s.d();
    }

    @Override
    public final void f() {
        for (e0 e0Var : this.f42404a) {
            e0Var.f();
        }
    }

    @Override
    public final void g(f1 f1Var) {
        e0 e0Var = (e0) f1Var;
        d0 d0Var = this.h;
        d0Var.getClass();
        d0Var.g(this);
    }

    @Override
    public final long h(long j3) {
        long h = this.f42409r[0].h(j3);
        int i10 = 1;
        while (true) {
            e0[] e0VarArr = this.f42409r;
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
    public final void i(long j3) {
        for (e0 e0Var : this.f42409r) {
            e0Var.i(j3);
        }
    }

    @Override
    public final void j(d0 d0Var, long j3) {
        this.h = d0Var;
        ArrayList arrayList = this.e;
        e0[] e0VarArr = this.f42404a;
        Collections.addAll(arrayList, e0VarArr);
        for (e0 e0Var : e0VarArr) {
            e0Var.j(this, j3);
        }
    }

    @Override
    public final long m() {
        e0[] e0VarArr;
        e0[] e0VarArr2;
        long j3 = -9223372036854775807L;
        for (e0 e0Var : this.f42409r) {
            long m10 = e0Var.m();
            if (m10 != -9223372036854775807L) {
                if (j3 == -9223372036854775807L) {
                    for (e0 e0Var2 : this.f42409r) {
                        if (e0Var2 == e0Var) {
                            break;
                        } else if (e0Var2.h(m10) != m10) {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j3 = m10;
                } else if (m10 != j3) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (j3 != -9223372036854775807L && e0Var.h(j3) != j3) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j3;
    }

    @Override
    public final boolean n(i2.q0 q0Var) {
        ArrayList arrayList = this.e;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((e0) arrayList.get(i10)).n(q0Var);
            }
            return false;
        }
        return this.f42410s.n(q0Var);
    }

    @Override
    public final long o(x2.r[] rVarArr, boolean[] zArr, d1[] d1VarArr, boolean[] zArr2, long j3) {
        IdentityHashMap identityHashMap;
        d1 d1Var;
        int[] iArr;
        Integer num;
        int intValue;
        int[] iArr2 = new int[rVarArr.length];
        int[] iArr3 = new int[rVarArr.length];
        int i10 = 0;
        while (true) {
            int length = rVarArr.length;
            identityHashMap = this.f42406c;
            if (i10 >= length) {
                break;
            }
            d1 d1Var2 = d1VarArr[i10];
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
            iArr2[i10] = intValue;
            x2.r rVar = rVarArr[i10];
            if (rVar != null) {
                String str = rVar.b().f1785b;
                iArr3[i10] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr3[i10] = -1;
            }
            i10++;
        }
        identityHashMap.clear();
        int length2 = rVarArr.length;
        d1[] d1VarArr2 = new d1[length2];
        d1[] d1VarArr3 = new d1[rVarArr.length];
        x2.r[] rVarArr2 = new x2.r[rVarArr.length];
        e0[] e0VarArr = this.f42404a;
        ArrayList arrayList = new ArrayList(e0VarArr.length);
        long j10 = j3;
        int i11 = 0;
        while (i11 < e0VarArr.length) {
            int i12 = 0;
            while (i12 < rVarArr.length) {
                if (iArr2[i12] == i11) {
                    d1Var = d1VarArr[i12];
                } else {
                    d1Var = null;
                }
                d1VarArr3[i12] = d1Var;
                if (iArr3[i12] == i11) {
                    x2.r rVar2 = rVarArr[i12];
                    rVar2.getClass();
                    iArr = iArr2;
                    b2.l1 l1Var = (b2.l1) this.f42407f.get(rVar2.b());
                    l1Var.getClass();
                    rVarArr2[i12] = new n0(rVar2, l1Var);
                } else {
                    iArr = iArr2;
                    rVarArr2[i12] = null;
                }
                i12++;
                iArr2 = iArr;
            }
            int[] iArr4 = iArr2;
            e0[] e0VarArr2 = e0VarArr;
            int i13 = i11;
            long o9 = e0VarArr2[i11].o(rVarArr2, zArr, d1VarArr3, zArr2, j10);
            if (i13 == 0) {
                j10 = o9;
            } else if (o9 != j10) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z10 = false;
            for (int i14 = 0; i14 < rVarArr.length; i14++) {
                boolean z11 = true;
                if (iArr3[i14] == i13) {
                    d1 d1Var3 = d1VarArr3[i14];
                    d1Var3.getClass();
                    d1VarArr2[i14] = d1VarArr3[i14];
                    identityHashMap.put(d1Var3, Integer.valueOf(i13));
                    z10 = true;
                } else if (iArr4[i14] == i13) {
                    if (d1VarArr3[i14] != null) {
                        z11 = false;
                    }
                    e2.d.g(z11);
                }
            }
            if (z10) {
                arrayList.add(e0VarArr2[i13]);
            }
            i11 = i13 + 1;
            e0VarArr = e0VarArr2;
            iArr2 = iArr4;
        }
        System.arraycopy(d1VarArr2, 0, d1VarArr, 0, length2);
        this.f42409r = (e0[]) arrayList.toArray(new e0[0]);
        AbstractList w10 = e9.q.w(arrayList, new c(1));
        this.d.getClass();
        this.f42410s = new o(arrayList, w10);
        return j10;
    }

    @Override
    public final q1 q() {
        q1 q1Var = this.f42408n;
        q1Var.getClass();
        return q1Var;
    }

    @Override
    public final long r() {
        return this.f42410s.r();
    }

    @Override
    public final long s(long j3, i2.o1 o1Var) {
        e0 e0Var;
        e0[] e0VarArr = this.f42409r;
        if (e0VarArr.length > 0) {
            e0Var = e0VarArr[0];
        } else {
            e0Var = this.f42404a[0];
        }
        return e0Var.s(j3, o1Var);
    }

    @Override
    public final void u(long j3) {
        this.f42410s.u(j3);
    }
}
