package u2;

import com.google.android.gms.internal.cast.b5;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
public final class o0 extends l {
    public static final b2.k0 f43471s;
    public final a[] f43472k;
    public final ArrayList f43473l;
    public final b2.k1[] f43474m;
    public final ArrayList f43475n;
    public final ob.a f43476o;
    public int f43477p;
    public long[][] f43478q;
    public b5 f43479r;

    static {
        b2.y yVar = new b2.y();
        e9.g0 g0Var = e9.i0.f8084b;
        e9.a1 a1Var = e9.a1.e;
        List list = Collections.EMPTY_LIST;
        e9.a1 a1Var2 = e9.a1.e;
        b2.d0 d0Var = new b2.d0();
        f43471s = new b2.k0("MergingMediaSource", new b2.z(yVar), null, new b2.e0(d0Var), b2.n0.K, b2.g0.d);
    }

    public o0(a... aVarArr) {
        ob.a aVar = new ob.a(23);
        this.f43472k = aVarArr;
        this.f43476o = aVar;
        this.f43475n = new ArrayList(Arrays.asList(aVarArr));
        this.f43477p = -1;
        this.f43473l = new ArrayList(aVarArr.length);
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            this.f43473l.add(new ArrayList());
        }
        this.f43474m = new b2.k1[aVarArr.length];
        this.f43478q = new long[0];
        new HashMap();
        e9.q.e(8, "expectedKeys");
        e9.q.e(2, "expectedValuesPerKey");
        new e9.v0(e9.v.a(8)).f8141f = new e9.u0();
    }

    @Override
    public final boolean a(b2.k0 k0Var) {
        a[] aVarArr = this.f43472k;
        if (aVarArr.length <= 0 || !aVarArr[0].a(k0Var)) {
            return false;
        }
        return true;
    }

    @Override
    public final d0 c(f0 f0Var, y2.d dVar, long j3) {
        a[] aVarArr = this.f43472k;
        int length = aVarArr.length;
        d0[] d0VarArr = new d0[length];
        b2.k1[] k1VarArr = this.f43474m;
        int b10 = k1VarArr[0].b(f0Var.f43380a);
        for (int i10 = 0; i10 < length; i10++) {
            f0 a2 = f0Var.a(k1VarArr[i10].l(b10));
            d0VarArr[i10] = aVarArr[i10].c(a2, dVar, j3 - this.f43478q[b10][i10]);
            ((List) this.f43473l.get(i10)).add(new n0(a2, d0VarArr[i10]));
        }
        return new m0(this.f43476o, this.f43478q[b10], d0VarArr);
    }

    @Override
    public final b2.k0 i() {
        a[] aVarArr = this.f43472k;
        if (aVarArr.length > 0) {
            return aVarArr[0].i();
        }
        return f43471s;
    }

    @Override
    public final void k() {
        b5 b5Var = this.f43479r;
        if (b5Var == null) {
            super.k();
            return;
        }
        throw b5Var;
    }

    @Override
    public final void m(g2.c0 c0Var) {
        this.f43439j = c0Var;
        this.f43438i = e2.d0.o(null);
        int i10 = 0;
        while (true) {
            a[] aVarArr = this.f43472k;
            if (i10 < aVarArr.length) {
                y(Integer.valueOf(i10), aVarArr[i10]);
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void o(d0 d0Var) {
        d0 d0Var2;
        d0 d0Var3;
        m0 m0Var = (m0) d0Var;
        int i10 = 0;
        while (true) {
            a[] aVarArr = this.f43472k;
            if (i10 < aVarArr.length) {
                List list = (List) this.f43473l.get(i10);
                d0[] d0VarArr = m0Var.f43452a;
                boolean[] zArr = m0Var.f43453b;
                if (zArr[i10]) {
                    d0Var2 = ((n1) d0VarArr[i10]).f43465a;
                } else {
                    d0Var2 = d0VarArr[i10];
                }
                int i11 = 0;
                while (true) {
                    if (i11 >= list.size()) {
                        break;
                    } else if (((n0) list.get(i11)).f43464b.equals(d0Var2)) {
                        list.remove(i11);
                        break;
                    } else {
                        i11++;
                    }
                }
                a aVar = aVarArr[i10];
                d0[] d0VarArr2 = m0Var.f43452a;
                if (zArr[i10]) {
                    d0Var3 = ((n1) d0VarArr2[i10]).f43465a;
                } else {
                    d0Var3 = d0VarArr2[i10];
                }
                aVar.o(d0Var3);
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void q() {
        super.q();
        Arrays.fill(this.f43474m, (Object) null);
        this.f43477p = -1;
        this.f43479r = null;
        ArrayList arrayList = this.f43475n;
        arrayList.clear();
        Collections.addAll(arrayList, this.f43472k);
    }

    @Override
    public final void t(b2.k0 k0Var) {
        this.f43472k[0].t(k0Var);
    }

    @Override
    public final f0 u(Object obj, f0 f0Var) {
        int intValue = ((Integer) obj).intValue();
        ArrayList arrayList = this.f43473l;
        List list = (List) arrayList.get(intValue);
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (((n0) list.get(i10)).f43463a.equals(f0Var)) {
                return ((n0) ((List) arrayList.get(0)).get(i10)).f43463a;
            }
        }
        return null;
    }

    @Override
    public final void x(Object obj, a aVar, b2.k1 k1Var) {
        Integer num = (Integer) obj;
        if (this.f43479r == null) {
            if (this.f43477p == -1) {
                this.f43477p = k1Var.h();
            } else if (k1Var.h() != this.f43477p) {
                this.f43479r = new IOException();
                return;
            }
            int length = this.f43478q.length;
            b2.k1[] k1VarArr = this.f43474m;
            if (length == 0) {
                this.f43478q = (long[][]) Array.newInstance(Long.TYPE, this.f43477p, k1VarArr.length);
            }
            ArrayList arrayList = this.f43475n;
            arrayList.remove(aVar);
            k1VarArr[num.intValue()] = k1Var;
            if (arrayList.isEmpty()) {
                n(k1VarArr[0]);
            }
        }
    }
}
