package u2;

import i2.q1;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
public final class l0 implements d0, c0 {
    public final d0[] f43353a;
    public final boolean[] f43354b;
    public final IdentityHashMap f43355c;
    public final ob.a d;
    public final ArrayList e = new ArrayList();
    public final HashMap f43356f = new HashMap();
    public c0 h;
    public n1 f43357n;
    public d0[] f43358r;
    public n f43359s;

    public l0(ob.a aVar, long[] jArr, d0... d0VarArr) {
        this.d = aVar;
        this.f43353a = d0VarArr;
        aVar.getClass();
        e9.g0 g0Var = e9.i0.f8067b;
        e9.a1 a1Var = e9.a1.e;
        this.f43359s = new n(a1Var, a1Var);
        this.f43355c = new IdentityHashMap();
        this.f43358r = new d0[0];
        this.f43354b = new boolean[d0VarArr.length];
        for (int i10 = 0; i10 < d0VarArr.length; i10++) {
            long j3 = jArr[i10];
            if (j3 != 0) {
                this.f43354b[i10] = true;
                this.f43353a[i10] = new m1(d0VarArr[i10], j3);
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
        d0[] d0VarArr = this.f43353a;
        int i10 = 0;
        for (d0 d0Var2 : d0VarArr) {
            i10 += d0Var2.r().f43380a;
        }
        b2.l1[] l1VarArr = new b2.l1[i10];
        int i11 = 0;
        for (int i12 = 0; i12 < d0VarArr.length; i12++) {
            n1 r10 = d0VarArr[i12].r();
            int i13 = r10.f43380a;
            int i14 = 0;
            while (i14 < i13) {
                b2.l1 a2 = r10.a(i14);
                int i15 = a2.f3083a;
                b2.s[] sVarArr = new b2.s[i15];
                for (int i16 = 0; i16 < i15; i16++) {
                    b2.s sVar = a2.d[i16];
                    b2.r a10 = sVar.a();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i12);
                    sb2.append(":");
                    String str = sVar.f3287a;
                    if (str == null) {
                        str = "";
                    }
                    sb2.append(str);
                    a10.f3232a = sb2.toString();
                    sVarArr[i16] = new b2.s(a10);
                }
                b2.l1 l1Var = new b2.l1(i12 + ":" + a2.f3084b, sVarArr);
                this.f43356f.put(l1Var, a2);
                l1VarArr[i11] = l1Var;
                i14++;
                i11++;
            }
        }
        this.f43357n = new n1(l1VarArr);
        c0 c0Var = this.h;
        c0Var.getClass();
        c0Var.a(this);
    }

    @Override
    public final boolean c() {
        return this.f43359s.c();
    }

    @Override
    public final long d() {
        return this.f43359s.d();
    }

    @Override
    public final void g() {
        for (d0 d0Var : this.f43353a) {
            d0Var.g();
        }
    }

    @Override
    public final long h(long j3) {
        long h = this.f43358r[0].h(j3);
        int i10 = 1;
        while (true) {
            d0[] d0VarArr = this.f43358r;
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
        for (d0 d0Var : this.f43358r) {
            d0Var.i(j3);
        }
    }

    @Override
    public final void k(c0 c0Var, long j3) {
        this.h = c0Var;
        ArrayList arrayList = this.e;
        d0[] d0VarArr = this.f43353a;
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
        for (d0 d0Var : this.f43358r) {
            long l4 = d0Var.l();
            if (l4 != -9223372036854775807L) {
                if (j3 == -9223372036854775807L) {
                    for (d0 d0Var2 : this.f43358r) {
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
        ArrayList arrayList = this.e;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((d0) arrayList.get(i10)).m(s0Var);
            }
            return false;
        }
        return this.f43359s.m(s0Var);
    }

    @Override
    public final long p(x2.r[] rVarArr, boolean[] zArr, a1[] a1VarArr, boolean[] zArr2, long j3) {
        IdentityHashMap identityHashMap;
        a1 a1Var;
        int[] iArr;
        Integer num;
        int intValue;
        int[] iArr2 = new int[rVarArr.length];
        int[] iArr3 = new int[rVarArr.length];
        int i10 = 0;
        while (true) {
            int length = rVarArr.length;
            identityHashMap = this.f43355c;
            if (i10 >= length) {
                break;
            }
            a1 a1Var2 = a1VarArr[i10];
            if (a1Var2 == null) {
                num = null;
            } else {
                num = (Integer) identityHashMap.get(a1Var2);
            }
            if (num == null) {
                intValue = -1;
            } else {
                intValue = num.intValue();
            }
            iArr2[i10] = intValue;
            x2.r rVar = rVarArr[i10];
            if (rVar != null) {
                String str = rVar.b().f3084b;
                iArr3[i10] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr3[i10] = -1;
            }
            i10++;
        }
        identityHashMap.clear();
        int length2 = rVarArr.length;
        a1[] a1VarArr2 = new a1[length2];
        a1[] a1VarArr3 = new a1[rVarArr.length];
        x2.r[] rVarArr2 = new x2.r[rVarArr.length];
        d0[] d0VarArr = this.f43353a;
        ArrayList arrayList = new ArrayList(d0VarArr.length);
        long j10 = j3;
        int i11 = 0;
        while (i11 < d0VarArr.length) {
            int i12 = 0;
            while (i12 < rVarArr.length) {
                if (iArr2[i12] == i11) {
                    a1Var = a1VarArr[i12];
                } else {
                    a1Var = null;
                }
                a1VarArr3[i12] = a1Var;
                if (iArr3[i12] == i11) {
                    x2.r rVar2 = rVarArr[i12];
                    rVar2.getClass();
                    iArr = iArr2;
                    b2.l1 l1Var = (b2.l1) this.f43356f.get(rVar2.b());
                    l1Var.getClass();
                    rVarArr2[i12] = new k0(rVar2, l1Var);
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
            long p5 = d0VarArr2[i11].p(rVarArr2, zArr, a1VarArr3, zArr2, j10);
            if (i13 == 0) {
                j10 = p5;
            } else if (p5 != j10) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z10 = false;
            for (int i14 = 0; i14 < rVarArr.length; i14++) {
                boolean z11 = true;
                if (iArr3[i14] == i13) {
                    a1 a1Var3 = a1VarArr3[i14];
                    a1Var3.getClass();
                    a1VarArr2[i14] = a1VarArr3[i14];
                    identityHashMap.put(a1Var3, Integer.valueOf(i13));
                    z10 = true;
                } else if (iArr4[i14] == i13) {
                    if (a1VarArr3[i14] != null) {
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
        System.arraycopy(a1VarArr2, 0, a1VarArr, 0, length2);
        this.f43358r = (d0[]) arrayList.toArray(new d0[0]);
        AbstractList w10 = e9.q.w(arrayList, new s0.b(22));
        this.d.getClass();
        this.f43359s = new n(arrayList, w10);
        return j10;
    }

    @Override
    public final n1 r() {
        n1 n1Var = this.f43357n;
        n1Var.getClass();
        return n1Var;
    }

    @Override
    public final long s() {
        return this.f43359s.s();
    }

    @Override
    public final long t(long j3, q1 q1Var) {
        d0 d0Var;
        d0[] d0VarArr = this.f43358r;
        if (d0VarArr.length > 0) {
            d0Var = d0VarArr[0];
        } else {
            d0Var = this.f43353a[0];
        }
        return d0Var.t(j3, q1Var);
    }

    @Override
    public final void u(long j3) {
        this.f43359s.u(j3);
    }

    @Override
    public final void v(c1 c1Var) {
        d0 d0Var = (d0) c1Var;
        c0 c0Var = this.h;
        c0Var.getClass();
        c0Var.v(this);
    }
}
