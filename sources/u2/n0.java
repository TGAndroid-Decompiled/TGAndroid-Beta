package u2;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
public final class n0 implements d0, c0 {
    public final d0[] f43754a;
    public final boolean[] f43755b;
    public final IdentityHashMap f43756c;
    public final ob.a d;
    public final ArrayList e = new ArrayList();
    public final HashMap f43757f = new HashMap();
    public c0 h;
    public p1 f43758n;
    public d0[] f43759r;
    public n f43760s;

    public n0(ob.a aVar, long[] jArr, d0... d0VarArr) {
        this.d = aVar;
        this.f43754a = d0VarArr;
        aVar.getClass();
        e9.g0 g0Var = e9.i0.f8083b;
        e9.a1 a1Var = e9.a1.e;
        this.f43760s = new n(a1Var, a1Var);
        this.f43756c = new IdentityHashMap();
        this.f43759r = new d0[0];
        this.f43755b = new boolean[d0VarArr.length];
        for (int i10 = 0; i10 < d0VarArr.length; i10++) {
            long j3 = jArr[i10];
            if (j3 != 0) {
                this.f43755b[i10] = true;
                this.f43754a[i10] = new o1(d0VarArr[i10], j3);
            }
        }
    }

    @Override
    public final void a(d0 d0Var) {
        ArrayList arrayList = this.e;
        arrayList.remove(d0Var);
        if (!arrayList.isEmpty()) {
            return;
        }
        d0[] d0VarArr = this.f43754a;
        int i10 = 0;
        for (d0 d0Var2 : d0VarArr) {
            i10 += d0Var2.s().f43786a;
        }
        b2.l1[] l1VarArr = new b2.l1[i10];
        int i11 = 0;
        for (int i12 = 0; i12 < d0VarArr.length; i12++) {
            p1 s10 = d0VarArr[i12].s();
            int i13 = s10.f43786a;
            int i14 = 0;
            while (i14 < i13) {
                b2.l1 a2 = s10.a(i14);
                int i15 = a2.f3090a;
                b2.s[] sVarArr = new b2.s[i15];
                for (int i16 = 0; i16 < i15; i16++) {
                    b2.s sVar = a2.d[i16];
                    b2.r a10 = sVar.a();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i12);
                    sb2.append(":");
                    String str = sVar.f3294a;
                    if (str == null) {
                        str = "";
                    }
                    sb2.append(str);
                    a10.f3239a = sb2.toString();
                    sVarArr[i16] = new b2.s(a10);
                }
                b2.l1 l1Var = new b2.l1(i12 + ":" + a2.f3091b, sVarArr);
                this.f43757f.put(l1Var, a2);
                l1VarArr[i11] = l1Var;
                i14++;
                i11++;
            }
        }
        this.f43758n = new p1(l1VarArr);
        c0 c0Var = this.h;
        c0Var.getClass();
        c0Var.a(this);
    }

    @Override
    public final boolean c() {
        return this.f43760s.c();
    }

    @Override
    public final long d() {
        return this.f43760s.d();
    }

    @Override
    public final void g() {
        for (d0 d0Var : this.f43754a) {
            d0Var.g();
        }
    }

    @Override
    public final long h(long j3) {
        long h = this.f43759r[0].h(j3);
        int i10 = 1;
        while (true) {
            d0[] d0VarArr = this.f43759r;
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
        for (d0 d0Var : this.f43759r) {
            d0Var.i(j3);
        }
    }

    @Override
    public final void k(c0 c0Var, long j3) {
        this.h = c0Var;
        ArrayList arrayList = this.e;
        d0[] d0VarArr = this.f43754a;
        Collections.addAll(arrayList, d0VarArr);
        for (d0 d0Var : d0VarArr) {
            d0Var.k(this, j3);
        }
    }

    @Override
    public final void l(e1 e1Var) {
        d0 d0Var = (d0) e1Var;
        c0 c0Var = this.h;
        c0Var.getClass();
        c0Var.l(this);
    }

    @Override
    public final long m() {
        d0[] d0VarArr;
        d0[] d0VarArr2;
        long j3 = -9223372036854775807L;
        for (d0 d0Var : this.f43759r) {
            long m10 = d0Var.m();
            if (m10 != -9223372036854775807L) {
                if (j3 == -9223372036854775807L) {
                    for (d0 d0Var2 : this.f43759r) {
                        if (d0Var2 == d0Var) {
                            break;
                        } else if (d0Var2.h(m10) != m10) {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j3 = m10;
                } else if (m10 != j3) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (j3 != -9223372036854775807L && d0Var.h(j3) != j3) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j3;
    }

    @Override
    public final boolean q(i2.r0 r0Var) {
        ArrayList arrayList = this.e;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((d0) arrayList.get(i10)).q(r0Var);
            }
            return false;
        }
        return this.f43760s.q(r0Var);
    }

    @Override
    public final long r(x2.s[] sVarArr, boolean[] zArr, c1[] c1VarArr, boolean[] zArr2, long j3) {
        IdentityHashMap identityHashMap;
        c1 c1Var;
        int[] iArr;
        Integer num;
        int intValue;
        int[] iArr2 = new int[sVarArr.length];
        int[] iArr3 = new int[sVarArr.length];
        int i10 = 0;
        while (true) {
            int length = sVarArr.length;
            identityHashMap = this.f43756c;
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
            x2.s sVar = sVarArr[i10];
            if (sVar != null) {
                String str = sVar.b().f3091b;
                iArr3[i10] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr3[i10] = -1;
            }
            i10++;
        }
        identityHashMap.clear();
        int length2 = sVarArr.length;
        c1[] c1VarArr2 = new c1[length2];
        c1[] c1VarArr3 = new c1[sVarArr.length];
        x2.s[] sVarArr2 = new x2.s[sVarArr.length];
        d0[] d0VarArr = this.f43754a;
        ArrayList arrayList = new ArrayList(d0VarArr.length);
        long j10 = j3;
        int i11 = 0;
        while (i11 < d0VarArr.length) {
            int i12 = 0;
            while (i12 < sVarArr.length) {
                if (iArr2[i12] == i11) {
                    c1Var = c1VarArr[i12];
                } else {
                    c1Var = null;
                }
                c1VarArr3[i12] = c1Var;
                if (iArr3[i12] == i11) {
                    x2.s sVar2 = sVarArr[i12];
                    sVar2.getClass();
                    iArr = iArr2;
                    b2.l1 l1Var = (b2.l1) this.f43757f.get(sVar2.b());
                    l1Var.getClass();
                    sVarArr2[i12] = new m0(sVar2, l1Var);
                } else {
                    iArr = iArr2;
                    sVarArr2[i12] = null;
                }
                i12++;
                iArr2 = iArr;
            }
            int[] iArr4 = iArr2;
            d0[] d0VarArr2 = d0VarArr;
            int i13 = i11;
            long r10 = d0VarArr2[i11].r(sVarArr2, zArr, c1VarArr3, zArr2, j10);
            if (i13 == 0) {
                j10 = r10;
            } else if (r10 != j10) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z10 = false;
            for (int i14 = 0; i14 < sVarArr.length; i14++) {
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
        this.f43759r = (d0[]) arrayList.toArray(new d0[0]);
        AbstractList w10 = e9.q.w(arrayList, new s0.b(17));
        this.d.getClass();
        this.f43760s = new n(arrayList, w10);
        return j10;
    }

    @Override
    public final p1 s() {
        p1 p1Var = this.f43758n;
        p1Var.getClass();
        return p1Var;
    }

    @Override
    public final long t() {
        return this.f43760s.t();
    }

    @Override
    public final long u(long j3, i2.p1 p1Var) {
        d0 d0Var;
        d0[] d0VarArr = this.f43759r;
        if (d0VarArr.length > 0) {
            d0Var = d0VarArr[0];
        } else {
            d0Var = this.f43754a[0];
        }
        return d0Var.u(j3, p1Var);
    }

    @Override
    public final void v(long j3) {
        this.f43760s.v(j3);
    }
}
