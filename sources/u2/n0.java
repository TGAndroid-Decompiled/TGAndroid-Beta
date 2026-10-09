package u2;

import com.google.android.gms.internal.cast.z4;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
public final class n0 extends l {
    public static final b2.k0 f48658s;
    public final a[] f48659k;
    public final ArrayList f48660l;
    public final b2.k1[] f48661m;
    public final ArrayList f48662n;
    public final t7.t f48663o;
    public int f48664p;
    public long[][] f48665q;
    public z4 f48666r;

    static {
        b2.y yVar = new b2.y();
        e9.g0 g0Var = e9.i0.f8752b;
        e9.a1 a1Var = e9.a1.f8715e;
        List list = Collections.EMPTY_LIST;
        e9.a1 a1Var2 = e9.a1.f8715e;
        b2.d0 d0Var = new b2.d0();
        f48658s = new b2.k0("MergingMediaSource", new b2.z(yVar), null, new b2.e0(d0Var), b2.n0.K, b2.g0.d);
    }

    public n0(a... aVarArr) {
        ?? obj = new Object();
        this.f48659k = aVarArr;
        this.f48663o = obj;
        this.f48662n = new ArrayList(Arrays.asList(aVarArr));
        this.f48664p = -1;
        this.f48660l = new ArrayList(aVarArr.length);
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            this.f48660l.add(new ArrayList());
        }
        this.f48661m = new b2.k1[aVarArr.length];
        this.f48665q = new long[0];
        new HashMap();
        e9.q.e(8, "expectedKeys");
        e9.q.e(2, "expectedValuesPerKey");
        new e9.v0(e9.v.a(8)).f8815f = new e9.u0();
    }

    @Override
    public final boolean a(b2.k0 k0Var) {
        a[] aVarArr = this.f48659k;
        if (aVarArr.length <= 0 || !aVarArr[0].a(k0Var)) {
            return false;
        }
        return true;
    }

    @Override
    public final d0 c(f0 f0Var, y2.d dVar, long j3) {
        a[] aVarArr = this.f48659k;
        int length = aVarArr.length;
        d0[] d0VarArr = new d0[length];
        b2.k1[] k1VarArr = this.f48661m;
        int b10 = k1VarArr[0].b(f0Var.f48572a);
        for (int i10 = 0; i10 < length; i10++) {
            f0 a2 = f0Var.a(k1VarArr[i10].l(b10));
            d0VarArr[i10] = aVarArr[i10].c(a2, dVar, j3 - this.f48665q[b10][i10]);
            ((List) this.f48660l.get(i10)).add(new m0(a2, d0VarArr[i10]));
        }
        return new l0(this.f48663o, this.f48665q[b10], d0VarArr);
    }

    @Override
    public final b2.k0 i() {
        a[] aVarArr = this.f48659k;
        if (aVarArr.length > 0) {
            return aVarArr[0].i();
        }
        return f48658s;
    }

    @Override
    public final void k() {
        z4 z4Var = this.f48666r;
        if (z4Var == null) {
            super.k();
            return;
        }
        throw z4Var;
    }

    @Override
    public final void m(g2.c0 c0Var) {
        this.f48633j = c0Var;
        this.f48632i = e2.d0.o(null);
        int i10 = 0;
        while (true) {
            a[] aVarArr = this.f48659k;
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
        l0 l0Var = (l0) d0Var;
        int i10 = 0;
        while (true) {
            a[] aVarArr = this.f48659k;
            if (i10 < aVarArr.length) {
                List list = (List) this.f48660l.get(i10);
                d0[] d0VarArr = l0Var.f48634a;
                boolean[] zArr = l0Var.f48635b;
                if (zArr[i10]) {
                    d0Var2 = ((n1) d0VarArr[i10]).f48667a;
                } else {
                    d0Var2 = d0VarArr[i10];
                }
                int i11 = 0;
                while (true) {
                    if (i11 >= list.size()) {
                        break;
                    } else if (((m0) list.get(i11)).f48653b.equals(d0Var2)) {
                        list.remove(i11);
                        break;
                    } else {
                        i11++;
                    }
                }
                a aVar = aVarArr[i10];
                d0[] d0VarArr2 = l0Var.f48634a;
                if (zArr[i10]) {
                    d0Var3 = ((n1) d0VarArr2[i10]).f48667a;
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
        Arrays.fill(this.f48661m, (Object) null);
        this.f48664p = -1;
        this.f48666r = null;
        ArrayList arrayList = this.f48662n;
        arrayList.clear();
        Collections.addAll(arrayList, this.f48659k);
    }

    @Override
    public final void t(b2.k0 k0Var) {
        this.f48659k[0].t(k0Var);
    }

    @Override
    public final f0 u(Object obj, f0 f0Var) {
        int intValue = ((Integer) obj).intValue();
        ArrayList arrayList = this.f48660l;
        List list = (List) arrayList.get(intValue);
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (((m0) list.get(i10)).f48652a.equals(f0Var)) {
                return ((m0) ((List) arrayList.get(0)).get(i10)).f48652a;
            }
        }
        return null;
    }

    @Override
    public final void x(Object obj, a aVar, b2.k1 k1Var) {
        Integer num = (Integer) obj;
        if (this.f48666r == null) {
            if (this.f48664p == -1) {
                this.f48664p = k1Var.h();
            } else if (k1Var.h() != this.f48664p) {
                this.f48666r = new IOException();
                return;
            }
            int length = this.f48665q.length;
            b2.k1[] k1VarArr = this.f48661m;
            if (length == 0) {
                this.f48665q = (long[][]) Array.newInstance(Long.TYPE, this.f48664p, k1VarArr.length);
            }
            ArrayList arrayList = this.f48662n;
            arrayList.remove(aVar);
            k1VarArr[num.intValue()] = k1Var;
            if (arrayList.isEmpty()) {
                n(k1VarArr[0]);
            }
        }
    }
}
