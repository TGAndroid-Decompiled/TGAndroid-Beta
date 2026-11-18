package x2;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
public final class o0 extends l {
    public static final e2.l0 f60177s;
    public final a[] f60178k;
    public final ArrayList f60179l;
    public final e2.l1[] f60180m;
    public final ArrayList f60181n;
    public final nb.a f60182o;
    public int f60183p;
    public long[][] f60184q;
    public androidx.datastore.preferences.protobuf.l f60185r;

    static {
        e2.z zVar = new e2.z();
        h9.g0 g0Var = h9.i0.f14006b;
        h9.t1 t1Var = h9.t1.f14074e;
        List list = Collections.EMPTY_LIST;
        h9.t1 t1Var2 = h9.t1.f14074e;
        e2.e0 e0Var = new e2.e0();
        f60177s = new e2.l0("MergingMediaSource", new e2.a0(zVar), null, new e2.f0(e0Var), e2.o0.L, e2.h0.d);
    }

    public o0(a... aVarArr) {
        nb.a aVar = new nb.a(28);
        this.f60178k = aVarArr;
        this.f60182o = aVar;
        this.f60181n = new ArrayList(Arrays.asList(aVarArr));
        this.f60183p = -1;
        this.f60179l = new ArrayList(aVarArr.length);
        for (int i7 = 0; i7 < aVarArr.length; i7++) {
            this.f60179l.add(new ArrayList());
        }
        this.f60180m = new e2.l1[aVarArr.length];
        this.f60184q = new long[0];
        new HashMap();
        h9.o.g(8, "expectedKeys");
        h9.o.g(2, "expectedValuesPerKey");
        new h9.l1(h9.s.c(8)).h = new h9.k1();
    }

    @Override
    public final boolean a(e2.l0 l0Var) {
        a[] aVarArr = this.f60178k;
        if (aVarArr.length <= 0 || !aVarArr[0].a(l0Var)) {
            return false;
        }
        return true;
    }

    @Override
    public final e0 c(g0 g0Var, h6.m mVar, long j3) {
        a[] aVarArr = this.f60178k;
        int length = aVarArr.length;
        e0[] e0VarArr = new e0[length];
        e2.l1[] l1VarArr = this.f60180m;
        int b10 = l1VarArr[0].b(g0Var.f60087a);
        for (int i7 = 0; i7 < length; i7++) {
            g0 a10 = g0Var.a(l1VarArr[i7].l(b10));
            e0VarArr[i7] = aVarArr[i7].c(a10, mVar, j3 - this.f60184q[b10][i7]);
            ((List) this.f60179l.get(i7)).add(new n0(a10, e0VarArr[i7]));
        }
        return new m0(this.f60182o, this.f60184q[b10], e0VarArr);
    }

    @Override
    public final e2.l0 i() {
        a[] aVarArr = this.f60178k;
        if (aVarArr.length > 0) {
            return aVarArr[0].i();
        }
        return f60177s;
    }

    @Override
    public final void k() {
        androidx.datastore.preferences.protobuf.l lVar = this.f60185r;
        if (lVar == null) {
            super.k();
            return;
        }
        throw lVar;
    }

    @Override
    public final void m(j2.c0 c0Var) {
        this.f60135j = c0Var;
        this.f60134i = h2.l0.q(null);
        int i7 = 0;
        while (true) {
            a[] aVarArr = this.f60178k;
            if (i7 < aVarArr.length) {
                y(Integer.valueOf(i7), aVarArr[i7]);
                i7++;
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
        int i7 = 0;
        while (true) {
            a[] aVarArr = this.f60178k;
            if (i7 < aVarArr.length) {
                List list = (List) this.f60179l.get(i7);
                e0[] e0VarArr = m0Var.f60143a;
                boolean[] zArr = m0Var.f60144b;
                if (zArr[i7]) {
                    e0Var2 = ((p1) e0VarArr[i7]).f60196a;
                } else {
                    e0Var2 = e0VarArr[i7];
                }
                int i10 = 0;
                while (true) {
                    if (i10 >= list.size()) {
                        break;
                    } else if (((n0) list.get(i10)).f60165b.equals(e0Var2)) {
                        list.remove(i10);
                        break;
                    } else {
                        i10++;
                    }
                }
                a aVar = aVarArr[i7];
                e0[] e0VarArr2 = m0Var.f60143a;
                if (zArr[i7]) {
                    e0Var3 = ((p1) e0VarArr2[i7]).f60196a;
                } else {
                    e0Var3 = e0VarArr2[i7];
                }
                aVar.o(e0Var3);
                i7++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void q() {
        super.q();
        Arrays.fill(this.f60180m, (Object) null);
        this.f60183p = -1;
        this.f60185r = null;
        ArrayList arrayList = this.f60181n;
        arrayList.clear();
        Collections.addAll(arrayList, this.f60178k);
    }

    @Override
    public final void t(e2.l0 l0Var) {
        this.f60178k[0].t(l0Var);
    }

    @Override
    public final g0 u(Object obj, g0 g0Var) {
        int intValue = ((Integer) obj).intValue();
        ArrayList arrayList = this.f60179l;
        List list = (List) arrayList.get(intValue);
        for (int i7 = 0; i7 < list.size(); i7++) {
            if (((n0) list.get(i7)).f60164a.equals(g0Var)) {
                return ((n0) ((List) arrayList.get(0)).get(i7)).f60164a;
            }
        }
        return null;
    }

    @Override
    public final void x(Object obj, a aVar, e2.l1 l1Var) {
        Integer num = (Integer) obj;
        if (this.f60185r == null) {
            if (this.f60183p == -1) {
                this.f60183p = l1Var.h();
            } else if (l1Var.h() != this.f60183p) {
                this.f60185r = new IOException();
                return;
            }
            int length = this.f60184q.length;
            e2.l1[] l1VarArr = this.f60180m;
            if (length == 0) {
                this.f60184q = (long[][]) Array.newInstance(Long.TYPE, this.f60183p, l1VarArr.length);
            }
            ArrayList arrayList = this.f60181n;
            arrayList.remove(aVar);
            l1VarArr[num.intValue()] = l1Var;
            if (arrayList.isEmpty()) {
                n(l1VarArr[0]);
            }
        }
    }
}
