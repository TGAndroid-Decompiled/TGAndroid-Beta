package u2;

import i2.q1;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
public final class l0 implements d0, c0 {
    public final d0[] f43746a;
    public final boolean[] f43747b;
    public final IdentityHashMap f43748c;
    public final ob.a d;
    public final ArrayList e = new ArrayList();
    public final HashMap f43749f = new HashMap();
    public c0 h;
    public o1 f43750n;
    public d0[] f43751r;
    public n f43752s;

    public l0(ob.a aVar, long[] jArr, d0... d0VarArr) {
        this.d = aVar;
        this.f43746a = d0VarArr;
        aVar.getClass();
        e9.g0 g0Var = e9.i0.f8068b;
        e9.a1 a1Var = e9.a1.e;
        this.f43752s = new n(a1Var, a1Var);
        this.f43748c = new IdentityHashMap();
        this.f43751r = new d0[0];
        this.f43747b = new boolean[d0VarArr.length];
        for (int i10 = 0; i10 < d0VarArr.length; i10++) {
            long j3 = jArr[i10];
            if (j3 != 0) {
                this.f43747b[i10] = true;
                this.f43746a[i10] = new n1(d0VarArr[i10], j3);
            }
        }
    }

    @Override
    public final boolean c() {
        return this.f43752s.c();
    }

    @Override
    public final long d() {
        return this.f43752s.d();
    }

    @Override
    public final void e(d0 d0Var) {
        ArrayList arrayList = this.e;
        arrayList.remove(d0Var);
        if (!arrayList.isEmpty()) {
            return;
        }
        d0[] d0VarArr = this.f43746a;
        int i10 = 0;
        for (d0 d0Var2 : d0VarArr) {
            i10 += d0Var2.r().f43786a;
        }
        b2.l1[] l1VarArr = new b2.l1[i10];
        int i11 = 0;
        for (int i12 = 0; i12 < d0VarArr.length; i12++) {
            o1 r10 = d0VarArr[i12].r();
            int i13 = r10.f43786a;
            int i14 = 0;
            while (i14 < i13) {
                b2.l1 a2 = r10.a(i14);
                int i15 = a2.f3085a;
                b2.s[] sVarArr = new b2.s[i15];
                for (int i16 = 0; i16 < i15; i16++) {
                    b2.s sVar = a2.d[i16];
                    b2.r a10 = sVar.a();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i12);
                    sb2.append(":");
                    String str = sVar.f3289a;
                    if (str == null) {
                        str = "";
                    }
                    sb2.append(str);
                    a10.f3234a = sb2.toString();
                    sVarArr[i16] = new b2.s(a10);
                }
                b2.l1 l1Var = new b2.l1(i12 + ":" + a2.f3086b, sVarArr);
                this.f43749f.put(l1Var, a2);
                l1VarArr[i11] = l1Var;
                i14++;
                i11++;
            }
        }
        this.f43750n = new o1(l1VarArr);
        c0 c0Var = this.h;
        c0Var.getClass();
        c0Var.e(this);
    }

    @Override
    public final void g() {
        for (d0 d0Var : this.f43746a) {
            d0Var.g();
        }
    }

    @Override
    public final void h(d1 d1Var) {
        d0 d0Var = (d0) d1Var;
        c0 c0Var = this.h;
        c0Var.getClass();
        c0Var.h(this);
    }

    @Override
    public final long i(long j3) {
        long i10 = this.f43751r[0].i(j3);
        int i11 = 1;
        while (true) {
            d0[] d0VarArr = this.f43751r;
            if (i11 < d0VarArr.length) {
                if (d0VarArr[i11].i(i10) == i10) {
                    i11++;
                } else {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else {
                return i10;
            }
        }
    }

    @Override
    public final void j(long j3) {
        for (d0 d0Var : this.f43751r) {
            d0Var.j(j3);
        }
    }

    @Override
    public final void k(c0 c0Var, long j3) {
        this.h = c0Var;
        ArrayList arrayList = this.e;
        d0[] d0VarArr = this.f43746a;
        Collections.addAll(arrayList, d0VarArr);
        for (d0 d0Var : d0VarArr) {
            d0Var.k(this, j3);
        }
    }

    @Override
    public final long n() {
        d0[] d0VarArr;
        d0[] d0VarArr2;
        long j3 = -9223372036854775807L;
        for (d0 d0Var : this.f43751r) {
            long n10 = d0Var.n();
            if (n10 != -9223372036854775807L) {
                if (j3 == -9223372036854775807L) {
                    for (d0 d0Var2 : this.f43751r) {
                        if (d0Var2 == d0Var) {
                            break;
                        } else if (d0Var2.i(n10) != n10) {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j3 = n10;
                } else if (n10 != j3) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (j3 != -9223372036854775807L && d0Var.i(j3) != j3) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j3;
    }

    @Override
    public final boolean o(i2.s0 s0Var) {
        ArrayList arrayList = this.e;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((d0) arrayList.get(i10)).o(s0Var);
            }
            return false;
        }
        return this.f43752s.o(s0Var);
    }

    @Override
    public final long p(x2.r[] rVarArr, boolean[] zArr, b1[] b1VarArr, boolean[] zArr2, long j3) {
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
            identityHashMap = this.f43748c;
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
                String str = rVar.b().f3086b;
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
        d0[] d0VarArr = this.f43746a;
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
                    b2.l1 l1Var = (b2.l1) this.f43749f.get(rVar2.b());
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
            long p5 = d0VarArr2[i11].p(rVarArr2, zArr, b1VarArr3, zArr2, j10);
            if (i13 == 0) {
                j10 = p5;
            } else if (p5 != j10) {
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
        this.f43751r = (d0[]) arrayList.toArray(new d0[0]);
        AbstractList w10 = e9.q.w(arrayList, new s0.b(29));
        this.d.getClass();
        this.f43752s = new n(arrayList, w10);
        return j10;
    }

    @Override
    public final o1 r() {
        o1 o1Var = this.f43750n;
        o1Var.getClass();
        return o1Var;
    }

    @Override
    public final long s() {
        return this.f43752s.s();
    }

    @Override
    public final long t(long j3, q1 q1Var) {
        d0 d0Var;
        d0[] d0VarArr = this.f43751r;
        if (d0VarArr.length > 0) {
            d0Var = d0VarArr[0];
        } else {
            d0Var = this.f43746a[0];
        }
        return d0Var.t(j3, q1Var);
    }

    @Override
    public final void u(long j3) {
        this.f43752s.u(j3);
    }
}
