package w2;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
public final class o0 extends l {
    public static final d2.n0 f57171s;
    public final a[] f57172k;
    public final ArrayList f57173l;
    public final d2.n1[] f57174m;
    public final ArrayList f57175n;
    public final ra.e f57176o;
    public int f57177p;
    public long[][] f57178q;
    public androidx.datastore.preferences.protobuf.l f57179r;

    static {
        d2.b0 b0Var = new d2.b0();
        g9.g0 g0Var = g9.i0.f12083b;
        g9.s1 s1Var = g9.s1.f12146e;
        List list = Collections.EMPTY_LIST;
        g9.s1 s1Var2 = g9.s1.f12146e;
        d2.g0 g0Var2 = new d2.g0();
        f57171s = new d2.n0("MergingMediaSource", new d2.c0(b0Var), null, new d2.h0(g0Var2), d2.q0.L, d2.j0.d);
    }

    public o0(a... aVarArr) {
        ra.e eVar = new ra.e(26);
        this.f57172k = aVarArr;
        this.f57176o = eVar;
        this.f57175n = new ArrayList(Arrays.asList(aVarArr));
        this.f57177p = -1;
        this.f57173l = new ArrayList(aVarArr.length);
        for (int i3 = 0; i3 < aVarArr.length; i3++) {
            this.f57173l.add(new ArrayList());
        }
        this.f57174m = new d2.n1[aVarArr.length];
        this.f57178q = new long[0];
        new HashMap();
        g9.o.g(8, "expectedKeys");
        g9.o.g(2, "expectedValuesPerKey");
        new g9.k1(g9.s.c(8)).h = new g9.j1();
    }

    @Override
    public final boolean a(d2.n0 n0Var) {
        a[] aVarArr = this.f57172k;
        if (aVarArr.length <= 0 || !aVarArr[0].a(n0Var)) {
            return false;
        }
        return true;
    }

    @Override
    public final e0 c(g0 g0Var, android.support.v4.media.session.a0 a0Var, long j10) {
        a[] aVarArr = this.f57172k;
        int length = aVarArr.length;
        e0[] e0VarArr = new e0[length];
        d2.n1[] n1VarArr = this.f57174m;
        int b10 = n1VarArr[0].b(g0Var.f57081a);
        for (int i3 = 0; i3 < length; i3++) {
            g0 a10 = g0Var.a(n1VarArr[i3].l(b10));
            e0VarArr[i3] = aVarArr[i3].c(a10, a0Var, j10 - this.f57178q[b10][i3]);
            ((List) this.f57173l.get(i3)).add(new n0(a10, e0VarArr[i3]));
        }
        return new m0(this.f57176o, this.f57178q[b10], e0VarArr);
    }

    @Override
    public final d2.n0 i() {
        a[] aVarArr = this.f57172k;
        if (aVarArr.length > 0) {
            return aVarArr[0].i();
        }
        return f57171s;
    }

    @Override
    public final void k() {
        androidx.datastore.preferences.protobuf.l lVar = this.f57179r;
        if (lVar == null) {
            super.k();
            return;
        }
        throw lVar;
    }

    @Override
    public final void m(i2.d0 d0Var) {
        this.f57129j = d0Var;
        this.f57128i = g2.n0.q(null);
        int i3 = 0;
        while (true) {
            a[] aVarArr = this.f57172k;
            if (i3 < aVarArr.length) {
                y(Integer.valueOf(i3), aVarArr[i3]);
                i3++;
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
        int i3 = 0;
        while (true) {
            a[] aVarArr = this.f57172k;
            if (i3 < aVarArr.length) {
                List list = (List) this.f57173l.get(i3);
                e0[] e0VarArr = m0Var.f57137a;
                boolean[] zArr = m0Var.f57138b;
                if (zArr[i3]) {
                    e0Var2 = ((p1) e0VarArr[i3]).f57190a;
                } else {
                    e0Var2 = e0VarArr[i3];
                }
                int i10 = 0;
                while (true) {
                    if (i10 >= list.size()) {
                        break;
                    } else if (((n0) list.get(i10)).f57159b.equals(e0Var2)) {
                        list.remove(i10);
                        break;
                    } else {
                        i10++;
                    }
                }
                a aVar = aVarArr[i3];
                e0[] e0VarArr2 = m0Var.f57137a;
                if (zArr[i3]) {
                    e0Var3 = ((p1) e0VarArr2[i3]).f57190a;
                } else {
                    e0Var3 = e0VarArr2[i3];
                }
                aVar.o(e0Var3);
                i3++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void q() {
        super.q();
        Arrays.fill(this.f57174m, (Object) null);
        this.f57177p = -1;
        this.f57179r = null;
        ArrayList arrayList = this.f57175n;
        arrayList.clear();
        Collections.addAll(arrayList, this.f57172k);
    }

    @Override
    public final void t(d2.n0 n0Var) {
        this.f57172k[0].t(n0Var);
    }

    @Override
    public final g0 u(Object obj, g0 g0Var) {
        int intValue = ((Integer) obj).intValue();
        ArrayList arrayList = this.f57173l;
        List list = (List) arrayList.get(intValue);
        for (int i3 = 0; i3 < list.size(); i3++) {
            if (((n0) list.get(i3)).f57158a.equals(g0Var)) {
                return ((n0) ((List) arrayList.get(0)).get(i3)).f57158a;
            }
        }
        return null;
    }

    @Override
    public final void x(Object obj, a aVar, d2.n1 n1Var) {
        Integer num = (Integer) obj;
        if (this.f57179r == null) {
            if (this.f57177p == -1) {
                this.f57177p = n1Var.h();
            } else if (n1Var.h() != this.f57177p) {
                this.f57179r = new IOException();
                return;
            }
            int length = this.f57178q.length;
            d2.n1[] n1VarArr = this.f57174m;
            if (length == 0) {
                this.f57178q = (long[][]) Array.newInstance(Long.TYPE, this.f57177p, n1VarArr.length);
            }
            ArrayList arrayList = this.f57175n;
            arrayList.remove(aVar);
            n1VarArr[num.intValue()] = n1Var;
            if (arrayList.isEmpty()) {
                n(n1VarArr[0]);
            }
        }
    }
}
