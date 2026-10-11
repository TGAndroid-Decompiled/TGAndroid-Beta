package u2;

import i2.q1;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
public final class l0 implements d0, c0 {
    public final d0[] f48743a;
    public final boolean[] f48744b;
    public final IdentityHashMap f48745c;
    public final t7.t d;
    public final ArrayList f48746e = new ArrayList();
    public final HashMap f48747f = new HashMap();
    public c0 h;
    public n1 f48748n;
    public d0[] f48749r;
    public n f48750s;

    public l0(t7.t tVar, long[] jArr, d0... d0VarArr) {
        this.d = tVar;
        this.f48743a = d0VarArr;
        tVar.getClass();
        e9.g0 g0Var = e9.i0.f8751b;
        e9.a1 a1Var = e9.a1.f8714e;
        this.f48750s = new n(a1Var, a1Var);
        this.f48745c = new IdentityHashMap();
        this.f48749r = new d0[0];
        this.f48744b = new boolean[d0VarArr.length];
        for (int i10 = 0; i10 < d0VarArr.length; i10++) {
            long j3 = jArr[i10];
            if (j3 != 0) {
                this.f48744b[i10] = true;
                this.f48743a[i10] = new m1(d0VarArr[i10], j3);
            }
        }
    }

    @Override
    public final void D(c1 c1Var) {
        d0 d0Var = (d0) c1Var;
        c0 c0Var = this.h;
        c0Var.getClass();
        c0Var.D(this);
    }

    @Override
    public final boolean c() {
        return this.f48750s.c();
    }

    @Override
    public final long d() {
        return this.f48750s.d();
    }

    @Override
    public final void g() {
        for (d0 d0Var : this.f48743a) {
            d0Var.g();
        }
    }

    @Override
    public final long h(long j3) {
        long h = this.f48749r[0].h(j3);
        int i10 = 1;
        while (true) {
            d0[] d0VarArr = this.f48749r;
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
        for (d0 d0Var : this.f48749r) {
            d0Var.i(j3);
        }
    }

    @Override
    public final void k(c0 c0Var, long j3) {
        this.h = c0Var;
        ArrayList arrayList = this.f48746e;
        d0[] d0VarArr = this.f48743a;
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
        for (d0 d0Var : this.f48749r) {
            long l4 = d0Var.l();
            if (l4 != -9223372036854775807L) {
                if (j3 == -9223372036854775807L) {
                    for (d0 d0Var2 : this.f48749r) {
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
    public final void m(d0 d0Var) {
        ArrayList arrayList = this.f48746e;
        arrayList.remove(d0Var);
        if (!arrayList.isEmpty()) {
            return;
        }
        d0[] d0VarArr = this.f48743a;
        int i10 = 0;
        for (d0 d0Var2 : d0VarArr) {
            i10 += d0Var2.p().f48772a;
        }
        b2.l1[] l1VarArr = new b2.l1[i10];
        int i11 = 0;
        for (int i12 = 0; i12 < d0VarArr.length; i12++) {
            n1 p5 = d0VarArr[i12].p();
            int i13 = p5.f48772a;
            int i14 = 0;
            while (i14 < i13) {
                b2.l1 a2 = p5.a(i14);
                int i15 = a2.f3415a;
                b2.s[] sVarArr = new b2.s[i15];
                for (int i16 = 0; i16 < i15; i16++) {
                    b2.s sVar = a2.d[i16];
                    b2.r a10 = sVar.a();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i12);
                    sb2.append(":");
                    String str = sVar.f3628a;
                    if (str == null) {
                        str = "";
                    }
                    sb2.append(str);
                    a10.f3571a = sb2.toString();
                    sVarArr[i16] = new b2.s(a10);
                }
                b2.l1 l1Var = new b2.l1(i12 + ":" + a2.f3416b, sVarArr);
                this.f48747f.put(l1Var, a2);
                l1VarArr[i11] = l1Var;
                i14++;
                i11++;
            }
        }
        this.f48748n = new n1(l1VarArr);
        c0 c0Var = this.h;
        c0Var.getClass();
        c0Var.m(this);
    }

    @Override
    public final boolean n(i2.s0 s0Var) {
        ArrayList arrayList = this.f48746e;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((d0) arrayList.get(i10)).n(s0Var);
            }
            return false;
        }
        return this.f48750s.n(s0Var);
    }

    @Override
    public final long o(x2.r[] rVarArr, boolean[] zArr, a1[] a1VarArr, boolean[] zArr2, long j3) {
        IdentityHashMap identityHashMap;
        a1 a1Var;
        int[] iArr;
        Integer num;
        int intValue;
        int[] iArr2 = new int[rVarArr.length];
        int[] iArr3 = new int[rVarArr.length];
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int length = rVarArr.length;
            identityHashMap = this.f48745c;
            if (i11 >= length) {
                break;
            }
            a1 a1Var2 = a1VarArr[i11];
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
            iArr2[i11] = intValue;
            x2.r rVar = rVarArr[i11];
            if (rVar != null) {
                String str = rVar.b().f3416b;
                iArr3[i11] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr3[i11] = -1;
            }
            i11++;
        }
        identityHashMap.clear();
        int length2 = rVarArr.length;
        a1[] a1VarArr2 = new a1[length2];
        a1[] a1VarArr3 = new a1[rVarArr.length];
        x2.r[] rVarArr2 = new x2.r[rVarArr.length];
        d0[] d0VarArr = this.f48743a;
        ArrayList arrayList = new ArrayList(d0VarArr.length);
        long j10 = j3;
        int i12 = 0;
        while (i12 < d0VarArr.length) {
            int i13 = i10;
            while (i13 < rVarArr.length) {
                if (iArr2[i13] == i12) {
                    a1Var = a1VarArr[i13];
                } else {
                    a1Var = null;
                }
                a1VarArr3[i13] = a1Var;
                if (iArr3[i13] == i12) {
                    x2.r rVar2 = rVarArr[i13];
                    rVar2.getClass();
                    iArr = iArr2;
                    b2.l1 l1Var = (b2.l1) this.f48747f.get(rVar2.b());
                    l1Var.getClass();
                    rVarArr2[i13] = new k0(rVar2, l1Var);
                } else {
                    iArr = iArr2;
                    rVarArr2[i13] = null;
                }
                i13++;
                iArr2 = iArr;
            }
            int[] iArr4 = iArr2;
            d0[] d0VarArr2 = d0VarArr;
            int i14 = i12;
            long o9 = d0VarArr2[i12].o(rVarArr2, zArr, a1VarArr3, zArr2, j10);
            if (i14 == 0) {
                j10 = o9;
            } else if (o9 != j10) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z10 = false;
            for (int i15 = 0; i15 < rVarArr.length; i15++) {
                boolean z11 = true;
                if (iArr3[i15] == i14) {
                    a1 a1Var3 = a1VarArr3[i15];
                    a1Var3.getClass();
                    a1VarArr2[i15] = a1VarArr3[i15];
                    identityHashMap.put(a1Var3, Integer.valueOf(i14));
                    z10 = true;
                } else if (iArr4[i15] == i14) {
                    if (a1VarArr3[i15] != null) {
                        z11 = false;
                    }
                    e2.d.g(z11);
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
        System.arraycopy(a1VarArr2, i16, a1VarArr, i16, length2);
        this.f48749r = (d0[]) arrayList.toArray(new d0[i16]);
        AbstractList w10 = e9.q.w(arrayList, new s0.b(17));
        this.d.getClass();
        this.f48750s = new n(arrayList, w10);
        return j10;
    }

    @Override
    public final n1 p() {
        n1 n1Var = this.f48748n;
        n1Var.getClass();
        return n1Var;
    }

    @Override
    public final long q() {
        return this.f48750s.q();
    }

    @Override
    public final long r(long j3, q1 q1Var) {
        d0 d0Var;
        d0[] d0VarArr = this.f48749r;
        if (d0VarArr.length > 0) {
            d0Var = d0VarArr[0];
        } else {
            d0Var = this.f48743a[0];
        }
        return d0Var.r(j3, q1Var);
    }

    @Override
    public final void s(long j3) {
        this.f48750s.s(j3);
    }
}
