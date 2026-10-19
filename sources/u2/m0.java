package u2;

import e9.x1;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import v7.u6;
public final class m0 implements e0, d0 {
    public final e0[] f47358a;
    public final boolean[] f47359b;
    public final IdentityHashMap f47360c;
    public final oa.d d;
    public final ArrayList e = new ArrayList();
    public final HashMap f47361f = new HashMap();
    public d0 h;
    public r1 f47362n;
    public e0[] f47363r;
    public o f47364s;

    public m0(oa.d dVar, long[] jArr, e0... e0VarArr) {
        this.d = dVar;
        this.f47358a = e0VarArr;
        dVar.getClass();
        e9.l0 l0Var = e9.n0.f8474b;
        x1 x1Var = x1.e;
        this.f47364s = new o(x1Var, x1Var);
        this.f47360c = new IdentityHashMap();
        this.f47363r = new e0[0];
        this.f47359b = new boolean[e0VarArr.length];
        for (int i10 = 0; i10 < e0VarArr.length; i10++) {
            long j10 = jArr[i10];
            if (j10 != 0) {
                this.f47359b[i10] = true;
                this.f47358a[i10] = new p1(e0VarArr[i10], j10);
            }
        }
    }

    @Override
    public final void a(e0 e0Var) {
        ArrayList arrayList = this.e;
        arrayList.remove(e0Var);
        if (!arrayList.isEmpty()) {
            return;
        }
        e0[] e0VarArr = this.f47358a;
        int i10 = 0;
        for (e0 e0Var2 : e0VarArr) {
            i10 += e0Var2.r().f47419a;
        }
        b2.p1[] p1VarArr = new b2.p1[i10];
        int i11 = 0;
        for (int i12 = 0; i12 < e0VarArr.length; i12++) {
            r1 r10 = e0VarArr[i12].r();
            int i13 = r10.f47419a;
            int i14 = 0;
            while (i14 < i13) {
                b2.p1 a2 = r10.a(i14);
                int i15 = a2.f3900a;
                b2.w[] wVarArr = new b2.w[i15];
                int i16 = 0;
                while (i16 < i15) {
                    b2.w wVar = a2.d[i16];
                    b2.v a10 = wVar.a();
                    String str = wVar.f4122m;
                    e0[] e0VarArr2 = e0VarArr;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i12);
                    sb2.append(":");
                    String str2 = wVar.f4113a;
                    if (str2 == null) {
                        str2 = "";
                    }
                    sb2.append(str2);
                    a10.f4061a = sb2.toString();
                    if (str != null) {
                        a10.f4069l = i12 + ":" + str;
                    }
                    wVarArr[i16] = new b2.w(a10);
                    i16++;
                    e0VarArr = e0VarArr2;
                }
                e0[] e0VarArr3 = e0VarArr;
                b2.p1 p1Var = new b2.p1(i12 + ":" + a2.f3901b, wVarArr);
                this.f47361f.put(p1Var, a2);
                p1VarArr[i11] = p1Var;
                i14++;
                i11++;
                e0VarArr = e0VarArr3;
            }
        }
        this.f47362n = new r1(p1VarArr);
        d0 d0Var = this.h;
        d0Var.getClass();
        d0Var.a(this);
    }

    @Override
    public final boolean c() {
        return this.f47364s.c();
    }

    @Override
    public final long d() {
        return this.f47364s.d();
    }

    @Override
    public final void h(f1 f1Var) {
        e0 e0Var = (e0) f1Var;
        d0 d0Var = this.h;
        d0Var.getClass();
        d0Var.h(this);
    }

    @Override
    public final void i() {
        for (e0 e0Var : this.f47358a) {
            e0Var.i();
        }
    }

    @Override
    public final long j(long j10) {
        long j11 = this.f47363r[0].j(j10);
        int i10 = 1;
        while (true) {
            e0[] e0VarArr = this.f47363r;
            if (i10 < e0VarArr.length) {
                if (e0VarArr[i10].j(j11) == j11) {
                    i10++;
                } else {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else {
                return j11;
            }
        }
    }

    @Override
    public final void l(long j10) {
        for (e0 e0Var : this.f47363r) {
            e0Var.l(j10);
        }
    }

    @Override
    public final void n(d0 d0Var, long j10) {
        this.h = d0Var;
        ArrayList arrayList = this.e;
        e0[] e0VarArr = this.f47358a;
        Collections.addAll(arrayList, e0VarArr);
        for (e0 e0Var : e0VarArr) {
            e0Var.n(this, j10);
        }
    }

    @Override
    public final long o() {
        e0[] e0VarArr;
        e0[] e0VarArr2;
        long j10 = -9223372036854775807L;
        for (e0 e0Var : this.f47363r) {
            long o10 = e0Var.o();
            if (o10 != -9223372036854775807L) {
                if (j10 == -9223372036854775807L) {
                    for (e0 e0Var2 : this.f47363r) {
                        if (e0Var2 == e0Var) {
                            break;
                        } else if (e0Var2.j(o10) != o10) {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j10 = o10;
                } else if (o10 != j10) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (j10 != -9223372036854775807L && e0Var.j(j10) != j10) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j10;
    }

    @Override
    public final boolean p(i2.v0 v0Var) {
        ArrayList arrayList = this.e;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((e0) arrayList.get(i10)).p(v0Var);
            }
            return false;
        }
        return this.f47364s.p(v0Var);
    }

    @Override
    public final long q(x2.p[] pVarArr, boolean[] zArr, d1[] d1VarArr, boolean[] zArr2, long j10) {
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
            identityHashMap = this.f47360c;
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
                String str = pVar.b().f3901b;
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
        e0[] e0VarArr = this.f47358a;
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
                    b2.p1 p1Var = (b2.p1) this.f47361f.get(pVar2.b());
                    p1Var.getClass();
                    pVarArr2[i13] = new l0(pVar2, p1Var);
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
            long q6 = e0VarArr2[i12].q(pVarArr2, zArr, d1VarArr3, zArr2, j11);
            if (i14 == 0) {
                j11 = q6;
            } else if (q6 != j11) {
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
        this.f47363r = (e0[]) arrayList.toArray(new e0[i16]);
        AbstractList x10 = e9.s.x(arrayList, new sg.y(8));
        this.d.getClass();
        this.f47364s = new o(arrayList, x10);
        return j11;
    }

    @Override
    public final r1 r() {
        r1 r1Var = this.f47362n;
        r1Var.getClass();
        return r1Var;
    }

    @Override
    public final long s() {
        return this.f47364s.s();
    }

    @Override
    public final long t(long j10, i2.s1 s1Var) {
        e0 e0Var;
        e0[] e0VarArr = this.f47363r;
        if (e0VarArr.length > 0) {
            e0Var = e0VarArr[0];
        } else {
            e0Var = this.f47358a[0];
        }
        return e0Var.t(j10, s1Var);
    }

    @Override
    public final void u(long j10) {
        this.f47364s.u(j10);
    }
}
