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
    public static final b2.k0 f43448s;
    public final a[] f43449k;
    public final ArrayList f43450l;
    public final b2.k1[] f43451m;
    public final ArrayList f43452n;
    public final ob.a f43453o;
    public int f43454p;
    public long[][] f43455q;
    public b5 f43456r;

    static {
        b2.y yVar = new b2.y();
        e9.g0 g0Var = e9.i0.f8079b;
        e9.a1 a1Var = e9.a1.e;
        List list = Collections.EMPTY_LIST;
        e9.a1 a1Var2 = e9.a1.e;
        b2.d0 d0Var = new b2.d0();
        f43448s = new b2.k0("MergingMediaSource", new b2.z(yVar), null, new b2.e0(d0Var), b2.n0.K, b2.g0.d);
    }

    public o0(a... aVarArr) {
        ob.a aVar = new ob.a(23);
        this.f43449k = aVarArr;
        this.f43453o = aVar;
        this.f43452n = new ArrayList(Arrays.asList(aVarArr));
        this.f43454p = -1;
        this.f43450l = new ArrayList(aVarArr.length);
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            this.f43450l.add(new ArrayList());
        }
        this.f43451m = new b2.k1[aVarArr.length];
        this.f43455q = new long[0];
        new HashMap();
        e9.q.e(8, "expectedKeys");
        e9.q.e(2, "expectedValuesPerKey");
        new e9.v0(e9.v.a(8)).f8136f = new e9.u0();
    }

    @Override
    public final boolean a(b2.k0 k0Var) {
        a[] aVarArr = this.f43449k;
        if (aVarArr.length <= 0 || !aVarArr[0].a(k0Var)) {
            return false;
        }
        return true;
    }

    @Override
    public final d0 c(f0 f0Var, y2.d dVar, long j3) {
        a[] aVarArr = this.f43449k;
        int length = aVarArr.length;
        d0[] d0VarArr = new d0[length];
        b2.k1[] k1VarArr = this.f43451m;
        int b10 = k1VarArr[0].b(f0Var.f43357a);
        for (int i10 = 0; i10 < length; i10++) {
            f0 a2 = f0Var.a(k1VarArr[i10].l(b10));
            d0VarArr[i10] = aVarArr[i10].c(a2, dVar, j3 - this.f43455q[b10][i10]);
            ((List) this.f43450l.get(i10)).add(new n0(a2, d0VarArr[i10]));
        }
        return new m0(this.f43453o, this.f43455q[b10], d0VarArr);
    }

    @Override
    public final b2.k0 i() {
        a[] aVarArr = this.f43449k;
        if (aVarArr.length > 0) {
            return aVarArr[0].i();
        }
        return f43448s;
    }

    @Override
    public final void k() {
        b5 b5Var = this.f43456r;
        if (b5Var == null) {
            super.k();
            return;
        }
        throw b5Var;
    }

    @Override
    public final void m(g2.c0 c0Var) {
        this.f43416j = c0Var;
        this.f43415i = e2.d0.o(null);
        int i10 = 0;
        while (true) {
            a[] aVarArr = this.f43449k;
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
            a[] aVarArr = this.f43449k;
            if (i10 < aVarArr.length) {
                List list = (List) this.f43450l.get(i10);
                d0[] d0VarArr = m0Var.f43429a;
                boolean[] zArr = m0Var.f43430b;
                if (zArr[i10]) {
                    d0Var2 = ((n1) d0VarArr[i10]).f43442a;
                } else {
                    d0Var2 = d0VarArr[i10];
                }
                int i11 = 0;
                while (true) {
                    if (i11 >= list.size()) {
                        break;
                    } else if (((n0) list.get(i11)).f43441b.equals(d0Var2)) {
                        list.remove(i11);
                        break;
                    } else {
                        i11++;
                    }
                }
                a aVar = aVarArr[i10];
                d0[] d0VarArr2 = m0Var.f43429a;
                if (zArr[i10]) {
                    d0Var3 = ((n1) d0VarArr2[i10]).f43442a;
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
        Arrays.fill(this.f43451m, (Object) null);
        this.f43454p = -1;
        this.f43456r = null;
        ArrayList arrayList = this.f43452n;
        arrayList.clear();
        Collections.addAll(arrayList, this.f43449k);
    }

    @Override
    public final void t(b2.k0 k0Var) {
        this.f43449k[0].t(k0Var);
    }

    @Override
    public final f0 u(Object obj, f0 f0Var) {
        int intValue = ((Integer) obj).intValue();
        ArrayList arrayList = this.f43450l;
        List list = (List) arrayList.get(intValue);
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (((n0) list.get(i10)).f43440a.equals(f0Var)) {
                return ((n0) ((List) arrayList.get(0)).get(i10)).f43440a;
            }
        }
        return null;
    }

    @Override
    public final void x(Object obj, a aVar, b2.k1 k1Var) {
        Integer num = (Integer) obj;
        if (this.f43456r == null) {
            if (this.f43454p == -1) {
                this.f43454p = k1Var.h();
            } else if (k1Var.h() != this.f43454p) {
                this.f43456r = new IOException();
                return;
            }
            int length = this.f43455q.length;
            b2.k1[] k1VarArr = this.f43451m;
            if (length == 0) {
                this.f43455q = (long[][]) Array.newInstance(Long.TYPE, this.f43454p, k1VarArr.length);
            }
            ArrayList arrayList = this.f43452n;
            arrayList.remove(aVar);
            k1VarArr[num.intValue()] = k1Var;
            if (arrayList.isEmpty()) {
                n(k1VarArr[0]);
            }
        }
    }
}
