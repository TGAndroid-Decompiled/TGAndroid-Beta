package x2;

import a8.ja;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
public final class l0 implements d0, c0 {
    public final d0[] f59585a;
    public final boolean[] f59586b;
    public final IdentityHashMap f59587c;
    public final nb.a d;
    public final ArrayList f59588e = new ArrayList();
    public final HashMap f59589f = new HashMap();
    public c0 h;
    public q1 f59590n;
    public d0[] f59591r;
    public n f59592s;

    public l0(nb.a aVar, long[] jArr, d0... d0VarArr) {
        this.d = aVar;
        this.f59585a = d0VarArr;
        aVar.getClass();
        h9.g0 g0Var = h9.i0.f13686b;
        h9.s1 s1Var = h9.s1.f13749e;
        this.f59592s = new n(s1Var, s1Var);
        this.f59587c = new IdentityHashMap();
        this.f59591r = new d0[0];
        this.f59586b = new boolean[d0VarArr.length];
        for (int i7 = 0; i7 < d0VarArr.length; i7++) {
            long j3 = jArr[i7];
            if (j3 != 0) {
                this.f59586b[i7] = true;
                this.f59585a[i7] = new n1(d0VarArr[i7], j3);
            }
        }
    }

    @Override
    public final long b(a3.u[] uVarArr, boolean[] zArr, b1[] b1VarArr, boolean[] zArr2, long j3) {
        IdentityHashMap identityHashMap;
        b1 b1Var;
        int[] iArr;
        Integer num;
        int intValue;
        int[] iArr2 = new int[uVarArr.length];
        int[] iArr3 = new int[uVarArr.length];
        int i7 = 0;
        int i10 = 0;
        while (true) {
            int length = uVarArr.length;
            identityHashMap = this.f59587c;
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
            a3.u uVar = uVarArr[i10];
            if (uVar != null) {
                String str = uVar.c().f10210b;
                iArr3[i10] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr3[i10] = -1;
            }
            i10++;
        }
        identityHashMap.clear();
        int length2 = uVarArr.length;
        b1[] b1VarArr2 = new b1[length2];
        b1[] b1VarArr3 = new b1[uVarArr.length];
        a3.u[] uVarArr2 = new a3.u[uVarArr.length];
        d0[] d0VarArr = this.f59585a;
        ArrayList arrayList = new ArrayList(d0VarArr.length);
        long j10 = j3;
        int i11 = 0;
        while (i11 < d0VarArr.length) {
            int i12 = i7;
            while (i12 < uVarArr.length) {
                if (iArr2[i12] == i11) {
                    b1Var = b1VarArr[i12];
                } else {
                    b1Var = null;
                }
                b1VarArr3[i12] = b1Var;
                if (iArr3[i12] == i11) {
                    a3.u uVar2 = uVarArr[i12];
                    uVar2.getClass();
                    iArr = iArr2;
                    e2.m1 m1Var = (e2.m1) this.f59589f.get(uVar2.c());
                    m1Var.getClass();
                    uVarArr2[i12] = new k0(uVar2, m1Var);
                } else {
                    iArr = iArr2;
                    uVarArr2[i12] = null;
                }
                i12++;
                iArr2 = iArr;
            }
            int[] iArr4 = iArr2;
            d0[] d0VarArr2 = d0VarArr;
            int i13 = i11;
            long b10 = d0VarArr2[i11].b(uVarArr2, zArr, b1VarArr3, zArr2, j10);
            if (i13 == 0) {
                j10 = b10;
            } else if (b10 != j10) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z10 = false;
            for (int i14 = 0; i14 < uVarArr.length; i14++) {
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
                    ja.p(z11);
                }
            }
            if (z10) {
                arrayList.add(d0VarArr2[i13]);
            }
            i11 = i13 + 1;
            d0VarArr = d0VarArr2;
            iArr2 = iArr4;
            i7 = 0;
        }
        int i15 = i7;
        System.arraycopy(b1VarArr2, i15, b1VarArr, i15, length2);
        this.f59591r = (d0[]) arrayList.toArray(new d0[i15]);
        AbstractList y10 = h9.o.y(arrayList, new ug.x(28));
        this.d.getClass();
        this.f59592s = new n(arrayList, y10);
        return j10;
    }

    @Override
    public final boolean c(l2.s0 s0Var) {
        ArrayList arrayList = this.f59588e;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                ((d0) arrayList.get(i7)).c(s0Var);
            }
            return false;
        }
        return this.f59592s.c(s0Var);
    }

    @Override
    public final long e() {
        return this.f59592s.e();
    }

    @Override
    public final void f0(d1 d1Var) {
        d0 d0Var = (d0) d1Var;
        c0 c0Var = this.h;
        c0Var.getClass();
        c0Var.f0(this);
    }

    @Override
    public final boolean g() {
        return this.f59592s.g();
    }

    @Override
    public final long h(long j3, l2.p1 p1Var) {
        d0 d0Var;
        d0[] d0VarArr = this.f59591r;
        if (d0VarArr.length > 0) {
            d0Var = d0VarArr[0];
        } else {
            d0Var = this.f59585a[0];
        }
        return d0Var.h(j3, p1Var);
    }

    @Override
    public final void i() {
        for (d0 d0Var : this.f59585a) {
            d0Var.i();
        }
    }

    @Override
    public final long j(long j3) {
        long j10 = this.f59591r[0].j(j3);
        int i7 = 1;
        while (true) {
            d0[] d0VarArr = this.f59591r;
            if (i7 < d0VarArr.length) {
                if (d0VarArr[i7].j(j10) == j10) {
                    i7++;
                } else {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else {
                return j10;
            }
        }
    }

    @Override
    public final void k(d0 d0Var) {
        ArrayList arrayList = this.f59588e;
        arrayList.remove(d0Var);
        if (!arrayList.isEmpty()) {
            return;
        }
        d0[] d0VarArr = this.f59585a;
        int i7 = 0;
        for (d0 d0Var2 : d0VarArr) {
            i7 += d0Var2.p().f59640a;
        }
        e2.m1[] m1VarArr = new e2.m1[i7];
        int i10 = 0;
        for (int i11 = 0; i11 < d0VarArr.length; i11++) {
            q1 p10 = d0VarArr[i11].p();
            int i12 = p10.f59640a;
            int i13 = 0;
            while (i13 < i12) {
                e2.m1 a10 = p10.a(i13);
                int i14 = a10.f10209a;
                e2.u[] uVarArr = new e2.u[i14];
                int i15 = 0;
                while (i15 < i14) {
                    e2.u uVar = a10.d[i15];
                    e2.t a11 = uVar.a();
                    String str = uVar.f10445m;
                    d0[] d0VarArr2 = d0VarArr;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i11);
                    sb2.append(":");
                    String str2 = uVar.f10435a;
                    if (str2 == null) {
                        str2 = "";
                    }
                    sb2.append(str2);
                    a11.f10384a = sb2.toString();
                    if (str != null) {
                        a11.f10393l = i11 + ":" + str;
                    }
                    uVarArr[i15] = new e2.u(a11);
                    i15++;
                    d0VarArr = d0VarArr2;
                }
                d0[] d0VarArr3 = d0VarArr;
                e2.m1 m1Var = new e2.m1(i11 + ":" + a10.f10210b, uVarArr);
                this.f59589f.put(m1Var, a10);
                m1VarArr[i10] = m1Var;
                i13++;
                i10++;
                d0VarArr = d0VarArr3;
            }
        }
        this.f59590n = new q1(m1VarArr);
        c0 c0Var = this.h;
        c0Var.getClass();
        c0Var.k(this);
    }

    @Override
    public final void l(long j3) {
        for (d0 d0Var : this.f59591r) {
            d0Var.l(j3);
        }
    }

    @Override
    public final long o() {
        d0[] d0VarArr;
        d0[] d0VarArr2;
        long j3 = -9223372036854775807L;
        for (d0 d0Var : this.f59591r) {
            long o4 = d0Var.o();
            if (o4 != -9223372036854775807L) {
                if (j3 == -9223372036854775807L) {
                    for (d0 d0Var2 : this.f59591r) {
                        if (d0Var2 == d0Var) {
                            break;
                        } else if (d0Var2.j(o4) != o4) {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j3 = o4;
                } else if (o4 != j3) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (j3 != -9223372036854775807L && d0Var.j(j3) != j3) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j3;
    }

    @Override
    public final q1 p() {
        q1 q1Var = this.f59590n;
        q1Var.getClass();
        return q1Var;
    }

    @Override
    public final long s() {
        return this.f59592s.s();
    }

    @Override
    public final void t(c0 c0Var, long j3) {
        this.h = c0Var;
        ArrayList arrayList = this.f59588e;
        d0[] d0VarArr = this.f59585a;
        Collections.addAll(arrayList, d0VarArr);
        for (d0 d0Var : d0VarArr) {
            d0Var.t(this, j3);
        }
    }

    @Override
    public final void u(long j3) {
        this.f59592s.u(j3);
    }
}
