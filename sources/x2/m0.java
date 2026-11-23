package x2;

import a8.la;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
public final class m0 implements e0, d0 {
    public final e0[] f60189a;
    public final boolean[] f60190b;
    public final IdentityHashMap f60191c;
    public final nb.a d;
    public final ArrayList f60192e = new ArrayList();
    public final HashMap f60193f = new HashMap();
    public d0 h;
    public r1 f60194n;
    public e0[] f60195r;
    public n f60196s;

    public m0(nb.a aVar, long[] jArr, e0... e0VarArr) {
        this.d = aVar;
        this.f60189a = e0VarArr;
        aVar.getClass();
        h9.g0 g0Var = h9.i0.f14035b;
        h9.t1 t1Var = h9.t1.f14103e;
        this.f60196s = new n(t1Var, t1Var);
        this.f60191c = new IdentityHashMap();
        this.f60195r = new e0[0];
        this.f60190b = new boolean[e0VarArr.length];
        for (int i7 = 0; i7 < e0VarArr.length; i7++) {
            long j3 = jArr[i7];
            if (j3 != 0) {
                this.f60190b[i7] = true;
                this.f60189a[i7] = new p1(e0VarArr[i7], j3);
            }
        }
    }

    @Override
    public final long b(a3.u[] uVarArr, boolean[] zArr, d1[] d1VarArr, boolean[] zArr2, long j3) {
        IdentityHashMap identityHashMap;
        d1 d1Var;
        int[] iArr;
        Integer num;
        int intValue;
        int[] iArr2 = new int[uVarArr.length];
        int[] iArr3 = new int[uVarArr.length];
        int i7 = 0;
        int i10 = 0;
        while (true) {
            int length = uVarArr.length;
            identityHashMap = this.f60191c;
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
            a3.u uVar = uVarArr[i10];
            if (uVar != null) {
                String str = uVar.c().f10557b;
                iArr3[i10] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr3[i10] = -1;
            }
            i10++;
        }
        identityHashMap.clear();
        int length2 = uVarArr.length;
        d1[] d1VarArr2 = new d1[length2];
        d1[] d1VarArr3 = new d1[uVarArr.length];
        a3.u[] uVarArr2 = new a3.u[uVarArr.length];
        e0[] e0VarArr = this.f60189a;
        ArrayList arrayList = new ArrayList(e0VarArr.length);
        long j10 = j3;
        int i11 = 0;
        while (i11 < e0VarArr.length) {
            int i12 = i7;
            while (i12 < uVarArr.length) {
                if (iArr2[i12] == i11) {
                    d1Var = d1VarArr[i12];
                } else {
                    d1Var = null;
                }
                d1VarArr3[i12] = d1Var;
                if (iArr3[i12] == i11) {
                    a3.u uVar2 = uVarArr[i12];
                    uVar2.getClass();
                    iArr = iArr2;
                    e2.m1 m1Var = (e2.m1) this.f60193f.get(uVar2.c());
                    m1Var.getClass();
                    uVarArr2[i12] = new l0(uVar2, m1Var);
                } else {
                    iArr = iArr2;
                    uVarArr2[i12] = null;
                }
                i12++;
                iArr2 = iArr;
            }
            int[] iArr4 = iArr2;
            e0[] e0VarArr2 = e0VarArr;
            int i13 = i11;
            long b10 = e0VarArr2[i11].b(uVarArr2, zArr, d1VarArr3, zArr2, j10);
            if (i13 == 0) {
                j10 = b10;
            } else if (b10 != j10) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z10 = false;
            for (int i14 = 0; i14 < uVarArr.length; i14++) {
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
                    la.p(z11);
                }
            }
            if (z10) {
                arrayList.add(e0VarArr2[i13]);
            }
            i11 = i13 + 1;
            e0VarArr = e0VarArr2;
            iArr2 = iArr4;
            i7 = 0;
        }
        int i15 = i7;
        System.arraycopy(d1VarArr2, i15, d1VarArr, i15, length2);
        this.f60195r = (e0[]) arrayList.toArray(new e0[i15]);
        AbstractList y10 = h9.o.y(arrayList, new ug.x(29));
        this.d.getClass();
        this.f60196s = new n(arrayList, y10);
        return j10;
    }

    @Override
    public final boolean c(l2.s0 s0Var) {
        ArrayList arrayList = this.f60192e;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                ((e0) arrayList.get(i7)).c(s0Var);
            }
            return false;
        }
        return this.f60196s.c(s0Var);
    }

    @Override
    public final void c0(f1 f1Var) {
        e0 e0Var = (e0) f1Var;
        d0 d0Var = this.h;
        d0Var.getClass();
        d0Var.c0(this);
    }

    @Override
    public final long e() {
        return this.f60196s.e();
    }

    @Override
    public final long f(long j3, l2.p1 p1Var) {
        e0 e0Var;
        e0[] e0VarArr = this.f60195r;
        if (e0VarArr.length > 0) {
            e0Var = e0VarArr[0];
        } else {
            e0Var = this.f60189a[0];
        }
        return e0Var.f(j3, p1Var);
    }

    @Override
    public final boolean g() {
        return this.f60196s.g();
    }

    @Override
    public final void i() {
        for (e0 e0Var : this.f60189a) {
            e0Var.i();
        }
    }

    @Override
    public final long k(long j3) {
        long k10 = this.f60195r[0].k(j3);
        int i7 = 1;
        while (true) {
            e0[] e0VarArr = this.f60195r;
            if (i7 < e0VarArr.length) {
                if (e0VarArr[i7].k(k10) == k10) {
                    i7++;
                } else {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else {
                return k10;
            }
        }
    }

    @Override
    public final void m(e0 e0Var) {
        ArrayList arrayList = this.f60192e;
        arrayList.remove(e0Var);
        if (!arrayList.isEmpty()) {
            return;
        }
        e0[] e0VarArr = this.f60189a;
        int i7 = 0;
        for (e0 e0Var2 : e0VarArr) {
            i7 += e0Var2.q().f60258a;
        }
        e2.m1[] m1VarArr = new e2.m1[i7];
        int i10 = 0;
        for (int i11 = 0; i11 < e0VarArr.length; i11++) {
            r1 q10 = e0VarArr[i11].q();
            int i12 = q10.f60258a;
            int i13 = 0;
            while (i13 < i12) {
                e2.m1 a10 = q10.a(i13);
                int i14 = a10.f10556a;
                e2.u[] uVarArr = new e2.u[i14];
                int i15 = 0;
                while (i15 < i14) {
                    e2.u uVar = a10.d[i15];
                    e2.t a11 = uVar.a();
                    String str = uVar.f10792m;
                    e0[] e0VarArr2 = e0VarArr;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i11);
                    sb2.append(":");
                    String str2 = uVar.f10782a;
                    if (str2 == null) {
                        str2 = "";
                    }
                    sb2.append(str2);
                    a11.f10731a = sb2.toString();
                    if (str != null) {
                        a11.f10740l = i11 + ":" + str;
                    }
                    uVarArr[i15] = new e2.u(a11);
                    i15++;
                    e0VarArr = e0VarArr2;
                }
                e0[] e0VarArr3 = e0VarArr;
                e2.m1 m1Var = new e2.m1(i11 + ":" + a10.f10557b, uVarArr);
                this.f60193f.put(m1Var, a10);
                m1VarArr[i10] = m1Var;
                i13++;
                i10++;
                e0VarArr = e0VarArr3;
            }
        }
        this.f60194n = new r1(m1VarArr);
        d0 d0Var = this.h;
        d0Var.getClass();
        d0Var.m(this);
    }

    @Override
    public final void n(long j3) {
        for (e0 e0Var : this.f60195r) {
            e0Var.n(j3);
        }
    }

    @Override
    public final long o() {
        e0[] e0VarArr;
        e0[] e0VarArr2;
        long j3 = -9223372036854775807L;
        for (e0 e0Var : this.f60195r) {
            long o4 = e0Var.o();
            if (o4 != -9223372036854775807L) {
                if (j3 == -9223372036854775807L) {
                    for (e0 e0Var2 : this.f60195r) {
                        if (e0Var2 == e0Var) {
                            break;
                        } else if (e0Var2.k(o4) != o4) {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j3 = o4;
                } else if (o4 != j3) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (j3 != -9223372036854775807L && e0Var.k(j3) != j3) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j3;
    }

    @Override
    public final r1 q() {
        r1 r1Var = this.f60194n;
        r1Var.getClass();
        return r1Var;
    }

    @Override
    public final long r() {
        return this.f60196s.r();
    }

    @Override
    public final void t(d0 d0Var, long j3) {
        this.h = d0Var;
        ArrayList arrayList = this.f60192e;
        e0[] e0VarArr = this.f60189a;
        Collections.addAll(arrayList, e0VarArr);
        for (e0 e0Var : e0VarArr) {
            e0Var.t(this, j3);
        }
    }

    @Override
    public final void u(long j3) {
        this.f60196s.u(j3);
    }
}
