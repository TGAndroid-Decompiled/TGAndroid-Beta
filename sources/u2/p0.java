package u2;

import com.google.android.gms.internal.cast.b5;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
public final class p0 extends l {
    public static final b2.k0 f43777s;
    public final a[] f43778k;
    public final ArrayList f43779l;
    public final b2.k1[] f43780m;
    public final ArrayList f43781n;
    public final ob.a f43782o;
    public int f43783p;
    public long[][] f43784q;
    public b5 f43785r;

    static {
        b2.y yVar = new b2.y();
        e9.g0 g0Var = e9.i0.f8083b;
        e9.a1 a1Var = e9.a1.e;
        List list = Collections.EMPTY_LIST;
        e9.a1 a1Var2 = e9.a1.e;
        b2.d0 d0Var = new b2.d0();
        f43777s = new b2.k0("MergingMediaSource", new b2.z(yVar), null, new b2.e0(d0Var), b2.n0.K, b2.g0.d);
    }

    public p0(a... aVarArr) {
        ob.a aVar = new ob.a(23);
        this.f43778k = aVarArr;
        this.f43782o = aVar;
        this.f43781n = new ArrayList(Arrays.asList(aVarArr));
        this.f43783p = -1;
        this.f43779l = new ArrayList(aVarArr.length);
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            this.f43779l.add(new ArrayList());
        }
        this.f43780m = new b2.k1[aVarArr.length];
        this.f43784q = new long[0];
        new HashMap();
        e9.q.e(8, "expectedKeys");
        e9.q.e(2, "expectedValuesPerKey");
        new e9.v0(e9.v.a(8)).f8140f = new e9.u0();
    }

    @Override
    public final boolean a(b2.k0 k0Var) {
        a[] aVarArr = this.f43778k;
        if (aVarArr.length <= 0 || !aVarArr[0].a(k0Var)) {
            return false;
        }
        return true;
    }

    @Override
    public final d0 c(f0 f0Var, y2.d dVar, long j3) {
        a[] aVarArr = this.f43778k;
        int length = aVarArr.length;
        d0[] d0VarArr = new d0[length];
        b2.k1[] k1VarArr = this.f43780m;
        int b10 = k1VarArr[0].b(f0Var.f43674a);
        for (int i10 = 0; i10 < length; i10++) {
            f0 a2 = f0Var.a(k1VarArr[i10].l(b10));
            d0VarArr[i10] = aVarArr[i10].c(a2, dVar, j3 - this.f43784q[b10][i10]);
            ((List) this.f43779l.get(i10)).add(new o0(a2, d0VarArr[i10]));
        }
        return new n0(this.f43782o, this.f43784q[b10], d0VarArr);
    }

    @Override
    public final b2.k0 i() {
        a[] aVarArr = this.f43778k;
        if (aVarArr.length > 0) {
            return aVarArr[0].i();
        }
        return f43777s;
    }

    @Override
    public final void k() {
        b5 b5Var = this.f43785r;
        if (b5Var == null) {
            super.k();
            return;
        }
        throw b5Var;
    }

    @Override
    public final void m(g2.c0 c0Var) {
        this.f43729j = c0Var;
        this.f43728i = e2.d0.o(null);
        int i10 = 0;
        while (true) {
            a[] aVarArr = this.f43778k;
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
        n0 n0Var = (n0) d0Var;
        int i10 = 0;
        while (true) {
            a[] aVarArr = this.f43778k;
            if (i10 < aVarArr.length) {
                List list = (List) this.f43779l.get(i10);
                d0[] d0VarArr = n0Var.f43754a;
                boolean[] zArr = n0Var.f43755b;
                if (zArr[i10]) {
                    d0Var2 = ((o1) d0VarArr[i10]).f43768a;
                } else {
                    d0Var2 = d0VarArr[i10];
                }
                int i11 = 0;
                while (true) {
                    if (i11 >= list.size()) {
                        break;
                    } else if (((o0) list.get(i11)).f43767b.equals(d0Var2)) {
                        list.remove(i11);
                        break;
                    } else {
                        i11++;
                    }
                }
                a aVar = aVarArr[i10];
                d0[] d0VarArr2 = n0Var.f43754a;
                if (zArr[i10]) {
                    d0Var3 = ((o1) d0VarArr2[i10]).f43768a;
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
        Arrays.fill(this.f43780m, (Object) null);
        this.f43783p = -1;
        this.f43785r = null;
        ArrayList arrayList = this.f43781n;
        arrayList.clear();
        Collections.addAll(arrayList, this.f43778k);
    }

    @Override
    public final void t(b2.k0 k0Var) {
        this.f43778k[0].t(k0Var);
    }

    @Override
    public final f0 u(Object obj, f0 f0Var) {
        int intValue = ((Integer) obj).intValue();
        ArrayList arrayList = this.f43779l;
        List list = (List) arrayList.get(intValue);
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (((o0) list.get(i10)).f43766a.equals(f0Var)) {
                return ((o0) ((List) arrayList.get(0)).get(i10)).f43766a;
            }
        }
        return null;
    }

    @Override
    public final void x(Object obj, a aVar, b2.k1 k1Var) {
        Integer num = (Integer) obj;
        if (this.f43785r == null) {
            if (this.f43783p == -1) {
                this.f43783p = k1Var.h();
            } else if (k1Var.h() != this.f43783p) {
                this.f43785r = new IOException();
                return;
            }
            int length = this.f43784q.length;
            b2.k1[] k1VarArr = this.f43780m;
            if (length == 0) {
                this.f43784q = (long[][]) Array.newInstance(Long.TYPE, this.f43783p, k1VarArr.length);
            }
            ArrayList arrayList = this.f43781n;
            arrayList.remove(aVar);
            k1VarArr[num.intValue()] = k1Var;
            if (arrayList.isEmpty()) {
                n(k1VarArr[0]);
            }
        }
    }
}
