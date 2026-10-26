package u2;

import com.google.android.gms.internal.cast.w4;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
public final class o0 extends l {
    public static final b2.p0 f49383s;
    public final a[] f49384k;
    public final ArrayList f49385l;
    public final b2.p1[] f49386m;
    public final ArrayList f49387n;
    public final pa.d f49388o;
    public int f49389p;
    public long[][] f49390q;
    public w4 f49391r;

    static {
        b2.d0 d0Var = new b2.d0();
        f9.g0 g0Var = f9.i0.f10287b;
        f9.s1 s1Var = f9.s1.e;
        List list = Collections.EMPTY_LIST;
        f9.s1 s1Var2 = f9.s1.e;
        b2.i0 i0Var = new b2.i0();
        f49383s = new b2.p0("MergingMediaSource", new b2.e0(d0Var), null, new b2.j0(i0Var), b2.s0.L, b2.l0.d);
    }

    public o0(a... aVarArr) {
        ?? obj = new Object();
        this.f49384k = aVarArr;
        this.f49388o = obj;
        this.f49387n = new ArrayList(Arrays.asList(aVarArr));
        this.f49389p = -1;
        this.f49385l = new ArrayList(aVarArr.length);
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            this.f49385l.add(new ArrayList());
        }
        this.f49386m = new b2.p1[aVarArr.length];
        this.f49390q = new long[0];
        new HashMap();
        f9.o.f(8, "expectedKeys");
        f9.o.f(2, "expectedValuesPerKey");
        new f9.k1(f9.s.b(8)).h = new f9.j1();
    }

    @Override
    public final boolean a(b2.p0 p0Var) {
        a[] aVarArr = this.f49384k;
        if (aVarArr.length <= 0 || !aVarArr[0].a(p0Var)) {
            return false;
        }
        return true;
    }

    @Override
    public final e0 c(g0 g0Var, a8.h0 h0Var, long j10) {
        a[] aVarArr = this.f49384k;
        int length = aVarArr.length;
        e0[] e0VarArr = new e0[length];
        b2.p1[] p1VarArr = this.f49386m;
        int b10 = p1VarArr[0].b(g0Var.f49297a);
        for (int i10 = 0; i10 < length; i10++) {
            g0 a2 = g0Var.a(p1VarArr[i10].l(b10));
            e0VarArr[i10] = aVarArr[i10].c(a2, h0Var, j10 - this.f49390q[b10][i10]);
            ((List) this.f49385l.get(i10)).add(new n0(a2, e0VarArr[i10]));
        }
        return new m0(this.f49388o, this.f49390q[b10], e0VarArr);
    }

    @Override
    public final b2.p0 i() {
        a[] aVarArr = this.f49384k;
        if (aVarArr.length > 0) {
            return aVarArr[0].i();
        }
        return f49383s;
    }

    @Override
    public final void k() {
        w4 w4Var = this.f49391r;
        if (w4Var == null) {
            super.k();
            return;
        }
        throw w4Var;
    }

    @Override
    public final void m(g2.c0 c0Var) {
        this.f49343j = c0Var;
        this.f49342i = e2.n0.q(null);
        int i10 = 0;
        while (true) {
            a[] aVarArr = this.f49384k;
            if (i10 < aVarArr.length) {
                y(Integer.valueOf(i10), aVarArr[i10]);
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void o(e0 e0Var) {
        e0 e0Var2;
        e0 e0Var3;
        m0 m0Var = (m0) e0Var;
        int i10 = 0;
        while (true) {
            a[] aVarArr = this.f49384k;
            if (i10 < aVarArr.length) {
                List list = (List) this.f49385l.get(i10);
                e0[] e0VarArr = m0Var.f49351a;
                boolean[] zArr = m0Var.f49352b;
                if (zArr[i10]) {
                    e0Var2 = ((p1) e0VarArr[i10]).f49401a;
                } else {
                    e0Var2 = e0VarArr[i10];
                }
                int i11 = 0;
                while (true) {
                    if (i11 >= list.size()) {
                        break;
                    } else if (((n0) list.get(i11)).f49371b.equals(e0Var2)) {
                        list.remove(i11);
                        break;
                    } else {
                        i11++;
                    }
                }
                a aVar = aVarArr[i10];
                e0[] e0VarArr2 = m0Var.f49351a;
                if (zArr[i10]) {
                    e0Var3 = ((p1) e0VarArr2[i10]).f49401a;
                } else {
                    e0Var3 = e0VarArr2[i10];
                }
                aVar.o(e0Var3);
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void q() {
        super.q();
        Arrays.fill(this.f49386m, (Object) null);
        this.f49389p = -1;
        this.f49391r = null;
        ArrayList arrayList = this.f49387n;
        arrayList.clear();
        Collections.addAll(arrayList, this.f49384k);
    }

    @Override
    public final void t(b2.p0 p0Var) {
        this.f49384k[0].t(p0Var);
    }

    @Override
    public final g0 u(Object obj, g0 g0Var) {
        int intValue = ((Integer) obj).intValue();
        ArrayList arrayList = this.f49385l;
        List list = (List) arrayList.get(intValue);
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (((n0) list.get(i10)).f49370a.equals(g0Var)) {
                return ((n0) ((List) arrayList.get(0)).get(i10)).f49370a;
            }
        }
        return null;
    }

    @Override
    public final void x(Object obj, a aVar, b2.p1 p1Var) {
        Integer num = (Integer) obj;
        if (this.f49391r == null) {
            if (this.f49389p == -1) {
                this.f49389p = p1Var.h();
            } else if (p1Var.h() != this.f49389p) {
                this.f49391r = new IOException();
                return;
            }
            int length = this.f49390q.length;
            b2.p1[] p1VarArr = this.f49386m;
            if (length == 0) {
                this.f49390q = (long[][]) Array.newInstance(Long.TYPE, this.f49389p, p1VarArr.length);
            }
            ArrayList arrayList = this.f49387n;
            arrayList.remove(aVar);
            p1VarArr[num.intValue()] = p1Var;
            if (arrayList.isEmpty()) {
                n(p1VarArr[0]);
            }
        }
    }
}
