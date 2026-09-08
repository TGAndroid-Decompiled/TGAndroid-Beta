package u2;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
public final class m0 implements d0, c0 {
    public final d0[] f46771a;
    public final boolean[] f46772b;
    public final IdentityHashMap f46773c;
    public final qb.b d;
    public final ArrayList f46774e = new ArrayList();
    public final HashMap f46775f = new HashMap();
    public c0 h;
    public o1 f46776n;
    public d0[] f46777r;
    public n f46778s;

    public m0(qb.b bVar, long[] jArr, d0... d0VarArr) {
        this.d = bVar;
        this.f46771a = d0VarArr;
        bVar.getClass();
        e9.g0 g0Var = e9.i0.f8985b;
        e9.a1 a1Var = e9.a1.f8948e;
        this.f46778s = new n(a1Var, a1Var);
        this.f46773c = new IdentityHashMap();
        this.f46777r = new d0[0];
        this.f46772b = new boolean[d0VarArr.length];
        for (int i10 = 0; i10 < d0VarArr.length; i10++) {
            long j3 = jArr[i10];
            if (j3 != 0) {
                this.f46772b[i10] = true;
                this.f46771a[i10] = new n1(d0VarArr[i10], j3);
            }
        }
    }

    @Override
    public final void a(d0 d0Var) {
        ArrayList arrayList = this.f46774e;
        arrayList.remove(d0Var);
        if (!arrayList.isEmpty()) {
            return;
        }
        d0[] d0VarArr = this.f46771a;
        int i10 = 0;
        for (d0 d0Var2 : d0VarArr) {
            i10 += d0Var2.r().f46801a;
        }
        b2.l1[] l1VarArr = new b2.l1[i10];
        int i11 = 0;
        for (int i12 = 0; i12 < d0VarArr.length; i12++) {
            o1 r10 = d0VarArr[i12].r();
            int i13 = r10.f46801a;
            int i14 = 0;
            while (i14 < i13) {
                b2.l1 a2 = r10.a(i14);
                int i15 = a2.f2169a;
                b2.s[] sVarArr = new b2.s[i15];
                for (int i16 = 0; i16 < i15; i16++) {
                    b2.s sVar = a2.d[i16];
                    b2.r a10 = sVar.a();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i12);
                    sb2.append(":");
                    String str = sVar.f2382a;
                    if (str == null) {
                        str = "";
                    }
                    sb2.append(str);
                    a10.f2325a = sb2.toString();
                    sVarArr[i16] = new b2.s(a10);
                }
                b2.l1 l1Var = new b2.l1(i12 + ":" + a2.f2170b, sVarArr);
                this.f46775f.put(l1Var, a2);
                l1VarArr[i11] = l1Var;
                i14++;
                i11++;
            }
        }
        this.f46776n = new o1(l1VarArr);
        c0 c0Var = this.h;
        c0Var.getClass();
        c0Var.a(this);
    }

    @Override
    public final void b(d1 d1Var) {
        d0 d0Var = (d0) d1Var;
        c0 c0Var = this.h;
        c0Var.getClass();
        c0Var.b(this);
    }

    @Override
    public final boolean c() {
        return this.f46778s.c();
    }

    @Override
    public final long d() {
        return this.f46778s.d();
    }

    @Override
    public final void j() {
        for (d0 d0Var : this.f46771a) {
            d0Var.j();
        }
    }

    @Override
    public final long k(long j3) {
        long k10 = this.f46777r[0].k(j3);
        int i10 = 1;
        while (true) {
            d0[] d0VarArr = this.f46777r;
            if (i10 < d0VarArr.length) {
                if (d0VarArr[i10].k(k10) == k10) {
                    i10++;
                } else {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else {
                return k10;
            }
        }
    }

    @Override
    public final void l(long j3) {
        for (d0 d0Var : this.f46777r) {
            d0Var.l(j3);
        }
    }

    @Override
    public final void n(c0 c0Var, long j3) {
        this.h = c0Var;
        ArrayList arrayList = this.f46774e;
        d0[] d0VarArr = this.f46771a;
        Collections.addAll(arrayList, d0VarArr);
        for (d0 d0Var : d0VarArr) {
            d0Var.n(this, j3);
        }
    }

    @Override
    public final long o() {
        d0[] d0VarArr;
        d0[] d0VarArr2;
        long j3 = -9223372036854775807L;
        for (d0 d0Var : this.f46777r) {
            long o9 = d0Var.o();
            if (o9 != -9223372036854775807L) {
                if (j3 == -9223372036854775807L) {
                    for (d0 d0Var2 : this.f46777r) {
                        if (d0Var2 == d0Var) {
                            break;
                        } else if (d0Var2.k(o9) != o9) {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j3 = o9;
                } else if (o9 != j3) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (j3 != -9223372036854775807L && d0Var.k(j3) != j3) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j3;
    }

    @Override
    public final boolean p(i2.r0 r0Var) {
        ArrayList arrayList = this.f46774e;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((d0) arrayList.get(i10)).p(r0Var);
            }
            return false;
        }
        return this.f46778s.p(r0Var);
    }

    @Override
    public final long q(x2.r[] rVarArr, boolean[] zArr, b1[] b1VarArr, boolean[] zArr2, long j3) {
        IdentityHashMap identityHashMap;
        b1 b1Var;
        int[] iArr;
        Integer num;
        int intValue;
        int[] iArr2 = new int[rVarArr.length];
        int[] iArr3 = new int[rVarArr.length];
        int i10 = 0;
        while (true) {
            int length = rVarArr.length;
            identityHashMap = this.f46773c;
            if (i10 >= length) {
                break;
            }
            b1 b1Var2 = b1VarArr[i10];
            if (b1Var2 == null) {
                num = null;
            } else {
                num = (Integer) identityHashMap.get(b1Var2);
            }
            if (num == null) {
                intValue = -1;
            } else {
                intValue = num.intValue();
            }
            iArr2[i10] = intValue;
            x2.r rVar = rVarArr[i10];
            if (rVar != null) {
                String str = rVar.b().f2170b;
                iArr3[i10] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr3[i10] = -1;
            }
            i10++;
        }
        identityHashMap.clear();
        int length2 = rVarArr.length;
        b1[] b1VarArr2 = new b1[length2];
        b1[] b1VarArr3 = new b1[rVarArr.length];
        x2.r[] rVarArr2 = new x2.r[rVarArr.length];
        d0[] d0VarArr = this.f46771a;
        ArrayList arrayList = new ArrayList(d0VarArr.length);
        long j10 = j3;
        int i11 = 0;
        while (i11 < d0VarArr.length) {
            int i12 = 0;
            while (i12 < rVarArr.length) {
                if (iArr2[i12] == i11) {
                    b1Var = b1VarArr[i12];
                } else {
                    b1Var = null;
                }
                b1VarArr3[i12] = b1Var;
                if (iArr3[i12] == i11) {
                    x2.r rVar2 = rVarArr[i12];
                    rVar2.getClass();
                    iArr = iArr2;
                    b2.l1 l1Var = (b2.l1) this.f46775f.get(rVar2.b());
                    l1Var.getClass();
                    rVarArr2[i12] = new l0(rVar2, l1Var);
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
            long q6 = d0VarArr2[i11].q(rVarArr2, zArr, b1VarArr3, zArr2, j10);
            if (i13 == 0) {
                j10 = q6;
            } else if (q6 != j10) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z10 = false;
            for (int i14 = 0; i14 < rVarArr.length; i14++) {
                boolean z11 = true;
                if (iArr3[i14] == i13) {
                    b1 b1Var3 = b1VarArr3[i14];
                    b1Var3.getClass();
                    b1VarArr2[i14] = b1VarArr3[i14];
                    identityHashMap.put(b1Var3, Integer.valueOf(i13));
                    z10 = true;
                } else if (iArr4[i14] == i13) {
                    if (b1VarArr3[i14] != null) {
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
        System.arraycopy(b1VarArr2, 0, b1VarArr, 0, length2);
        this.f46777r = (d0[]) arrayList.toArray(new d0[0]);
        AbstractList w10 = e9.q.w(arrayList, new t0.a(3));
        this.d.getClass();
        this.f46778s = new n(arrayList, w10);
        return j10;
    }

    @Override
    public final o1 r() {
        o1 o1Var = this.f46776n;
        o1Var.getClass();
        return o1Var;
    }

    @Override
    public final long s() {
        return this.f46778s.s();
    }

    @Override
    public final long t(long j3, i2.p1 p1Var) {
        d0 d0Var;
        d0[] d0VarArr = this.f46777r;
        if (d0VarArr.length > 0) {
            d0Var = d0VarArr[0];
        } else {
            d0Var = this.f46771a[0];
        }
        return d0Var.t(j3, p1Var);
    }

    @Override
    public final void u(long j3) {
        this.f46778s.u(j3);
    }
}
