package x2;

import a8.ia;
import h9.t1;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
public final class l0 implements d0, c0 {
    public final d0[] f58404a;
    public final boolean[] f58405b;
    public final IdentityHashMap f58406c;
    public final sa.d d;
    public final ArrayList f58407e = new ArrayList();
    public final HashMap f58408f = new HashMap();
    public c0 h;
    public p1 f58409n;
    public d0[] f58410r;
    public n f58411s;

    public l0(sa.d dVar, long[] jArr, d0... d0VarArr) {
        this.d = dVar;
        this.f58404a = d0VarArr;
        dVar.getClass();
        h9.g0 g0Var = h9.i0.f14331b;
        t1 t1Var = t1.f14399e;
        this.f58411s = new n(t1Var, t1Var);
        this.f58406c = new IdentityHashMap();
        this.f58410r = new d0[0];
        this.f58405b = new boolean[d0VarArr.length];
        for (int i7 = 0; i7 < d0VarArr.length; i7++) {
            long j3 = jArr[i7];
            if (j3 != 0) {
                this.f58405b[i7] = true;
                this.f58404a[i7] = new n1(d0VarArr[i7], j3);
            }
        }
    }

    @Override
    public final void a(d0 d0Var) {
        ArrayList arrayList = this.f58407e;
        arrayList.remove(d0Var);
        if (!arrayList.isEmpty()) {
            return;
        }
        d0[] d0VarArr = this.f58404a;
        int i7 = 0;
        for (d0 d0Var2 : d0VarArr) {
            i7 += d0Var2.o().f58455a;
        }
        e2.m1[] m1VarArr = new e2.m1[i7];
        int i10 = 0;
        for (int i11 = 0; i11 < d0VarArr.length; i11++) {
            p1 o4 = d0VarArr[i11].o();
            int i12 = o4.f58455a;
            int i13 = 0;
            while (i13 < i12) {
                e2.m1 a10 = o4.a(i13);
                int i14 = a10.f10378a;
                e2.u[] uVarArr = new e2.u[i14];
                int i15 = 0;
                while (i15 < i14) {
                    e2.u uVar = a10.d[i15];
                    e2.t a11 = uVar.a();
                    String str = uVar.f10614m;
                    d0[] d0VarArr2 = d0VarArr;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i11);
                    sb2.append(":");
                    String str2 = uVar.f10604a;
                    if (str2 == null) {
                        str2 = "";
                    }
                    sb2.append(str2);
                    a11.f10553a = sb2.toString();
                    if (str != null) {
                        a11.f10562l = i11 + ":" + str;
                    }
                    uVarArr[i15] = new e2.u(a11);
                    i15++;
                    d0VarArr = d0VarArr2;
                }
                d0[] d0VarArr3 = d0VarArr;
                e2.m1 m1Var = new e2.m1(i11 + ":" + a10.f10379b, uVarArr);
                this.f58408f.put(m1Var, a10);
                m1VarArr[i10] = m1Var;
                i13++;
                i10++;
                d0VarArr = d0VarArr3;
            }
        }
        this.f58409n = new p1(m1VarArr);
        c0 c0Var = this.h;
        c0Var.getClass();
        c0Var.a(this);
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
            identityHashMap = this.f58406c;
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
                String str = uVar.c().f10379b;
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
        d0[] d0VarArr = this.f58404a;
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
                    e2.m1 m1Var = (e2.m1) this.f58408f.get(uVar2.c());
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
            boolean z9 = false;
            for (int i14 = 0; i14 < uVarArr.length; i14++) {
                boolean z10 = true;
                if (iArr3[i14] == i13) {
                    b1 b1Var3 = b1VarArr3[i14];
                    b1Var3.getClass();
                    b1VarArr2[i14] = b1VarArr3[i14];
                    identityHashMap.put(b1Var3, Integer.valueOf(i13));
                    z9 = true;
                } else if (iArr4[i14] == i13) {
                    if (b1VarArr3[i14] != null) {
                        z10 = false;
                    }
                    ia.p(z10);
                }
            }
            if (z9) {
                arrayList.add(d0VarArr2[i13]);
            }
            i11 = i13 + 1;
            d0VarArr = d0VarArr2;
            iArr2 = iArr4;
            i7 = 0;
        }
        int i15 = i7;
        System.arraycopy(b1VarArr2, i15, b1VarArr, i15, length2);
        this.f58410r = (d0[]) arrayList.toArray(new d0[i15]);
        AbstractList y10 = h9.o.y(arrayList, new v0.j(23));
        this.d.getClass();
        this.f58411s = new n(arrayList, y10);
        return j10;
    }

    @Override
    public final boolean c(l2.v0 v0Var) {
        ArrayList arrayList = this.f58407e;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                ((d0) arrayList.get(i7)).c(v0Var);
            }
            return false;
        }
        return this.f58411s.c(v0Var);
    }

    @Override
    public final void d(d1 d1Var) {
        d0 d0Var = (d0) d1Var;
        c0 c0Var = this.h;
        c0Var.getClass();
        c0Var.d(this);
    }

    @Override
    public final long e() {
        return this.f58411s.e();
    }

    @Override
    public final boolean g() {
        return this.f58411s.g();
    }

    @Override
    public final long h(long j3, l2.t1 t1Var) {
        d0 d0Var;
        d0[] d0VarArr = this.f58410r;
        if (d0VarArr.length > 0) {
            d0Var = d0VarArr[0];
        } else {
            d0Var = this.f58404a[0];
        }
        return d0Var.h(j3, t1Var);
    }

    @Override
    public final void i() {
        for (d0 d0Var : this.f58404a) {
            d0Var.i();
        }
    }

    @Override
    public final long j(long j3) {
        long j10 = this.f58410r[0].j(j3);
        int i7 = 1;
        while (true) {
            d0[] d0VarArr = this.f58410r;
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
    public final void k(long j3) {
        for (d0 d0Var : this.f58410r) {
            d0Var.k(j3);
        }
    }

    @Override
    public final long n() {
        d0[] d0VarArr;
        d0[] d0VarArr2;
        long j3 = -9223372036854775807L;
        for (d0 d0Var : this.f58410r) {
            long n10 = d0Var.n();
            if (n10 != -9223372036854775807L) {
                if (j3 == -9223372036854775807L) {
                    for (d0 d0Var2 : this.f58410r) {
                        if (d0Var2 == d0Var) {
                            break;
                        } else if (d0Var2.j(n10) != n10) {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j3 = n10;
                } else if (n10 != j3) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (j3 != -9223372036854775807L && d0Var.j(j3) != j3) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j3;
    }

    @Override
    public final p1 o() {
        p1 p1Var = this.f58409n;
        p1Var.getClass();
        return p1Var;
    }

    @Override
    public final long p() {
        return this.f58411s.p();
    }

    @Override
    public final void q(c0 c0Var, long j3) {
        this.h = c0Var;
        ArrayList arrayList = this.f58407e;
        d0[] d0VarArr = this.f58404a;
        Collections.addAll(arrayList, d0VarArr);
        for (d0 d0Var : d0VarArr) {
            d0Var.q(this, j3);
        }
    }

    @Override
    public final void r(long j3) {
        this.f58411s.r(j3);
    }
}
