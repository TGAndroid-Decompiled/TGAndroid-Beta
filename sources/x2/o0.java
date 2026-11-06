package x2;

import h9.t1;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
public final class o0 extends l {
    public static final e2.l0 f58324s;
    public final a[] f58325k;
    public final ArrayList f58326l;
    public final e2.l1[] f58327m;
    public final ArrayList f58328n;
    public final sa.d f58329o;
    public int f58330p;
    public long[][] f58331q;
    public androidx.datastore.preferences.protobuf.l f58332r;

    static {
        e2.z zVar = new e2.z();
        h9.g0 g0Var = h9.i0.f14329b;
        t1 t1Var = t1.f14397e;
        List list = Collections.EMPTY_LIST;
        t1 t1Var2 = t1.f14397e;
        e2.e0 e0Var = new e2.e0();
        f58324s = new e2.l0("MergingMediaSource", new e2.a0(zVar), null, new e2.f0(e0Var), e2.o0.L, e2.h0.d);
    }

    public o0(a... aVarArr) {
        sa.d dVar = new sa.d(27);
        this.f58325k = aVarArr;
        this.f58329o = dVar;
        this.f58328n = new ArrayList(Arrays.asList(aVarArr));
        this.f58330p = -1;
        this.f58326l = new ArrayList(aVarArr.length);
        for (int i7 = 0; i7 < aVarArr.length; i7++) {
            this.f58326l.add(new ArrayList());
        }
        this.f58327m = new e2.l1[aVarArr.length];
        this.f58331q = new long[0];
        new HashMap();
        h9.o.g(8, "expectedKeys");
        h9.o.g(2, "expectedValuesPerKey");
        new h9.l1(h9.s.c(8)).h = new h9.k1();
    }

    @Override
    public final boolean a(e2.l0 l0Var) {
        a[] aVarArr = this.f58325k;
        if (aVarArr.length <= 0 || !aVarArr[0].a(l0Var)) {
            return false;
        }
        return true;
    }

    @Override
    public final e0 c(g0 g0Var, h6.m mVar, long j3) {
        a[] aVarArr = this.f58325k;
        int length = aVarArr.length;
        e0[] e0VarArr = new e0[length];
        e2.l1[] l1VarArr = this.f58327m;
        int b10 = l1VarArr[0].b(g0Var.f58235a);
        for (int i7 = 0; i7 < length; i7++) {
            g0 a10 = g0Var.a(l1VarArr[i7].l(b10));
            e0VarArr[i7] = aVarArr[i7].c(a10, mVar, j3 - this.f58331q[b10][i7]);
            ((List) this.f58326l.get(i7)).add(new n0(a10, e0VarArr[i7]));
        }
        return new m0(this.f58329o, this.f58331q[b10], e0VarArr);
    }

    @Override
    public final e2.l0 i() {
        a[] aVarArr = this.f58325k;
        if (aVarArr.length > 0) {
            return aVarArr[0].i();
        }
        return f58324s;
    }

    @Override
    public final void k() {
        androidx.datastore.preferences.protobuf.l lVar = this.f58332r;
        if (lVar == null) {
            super.k();
            return;
        }
        throw lVar;
    }

    @Override
    public final void m(j2.d0 d0Var) {
        this.f58283j = d0Var;
        this.f58282i = h2.m0.q(null);
        int i7 = 0;
        while (true) {
            a[] aVarArr = this.f58325k;
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
            a[] aVarArr = this.f58325k;
            if (i7 < aVarArr.length) {
                List list = (List) this.f58326l.get(i7);
                e0[] e0VarArr = m0Var.f58299a;
                boolean[] zArr = m0Var.f58300b;
                if (zArr[i7]) {
                    e0Var2 = ((o1) e0VarArr[i7]).f58333a;
                } else {
                    e0Var2 = e0VarArr[i7];
                }
                int i10 = 0;
                while (true) {
                    if (i10 >= list.size()) {
                        break;
                    } else if (((n0) list.get(i10)).f58318b.equals(e0Var2)) {
                        list.remove(i10);
                        break;
                    } else {
                        i10++;
                    }
                }
                a aVar = aVarArr[i7];
                e0[] e0VarArr2 = m0Var.f58299a;
                if (zArr[i7]) {
                    e0Var3 = ((o1) e0VarArr2[i7]).f58333a;
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
        Arrays.fill(this.f58327m, (Object) null);
        this.f58330p = -1;
        this.f58332r = null;
        ArrayList arrayList = this.f58328n;
        arrayList.clear();
        Collections.addAll(arrayList, this.f58325k);
    }

    @Override
    public final void t(e2.l0 l0Var) {
        this.f58325k[0].t(l0Var);
    }

    @Override
    public final g0 u(Object obj, g0 g0Var) {
        int intValue = ((Integer) obj).intValue();
        ArrayList arrayList = this.f58326l;
        List list = (List) arrayList.get(intValue);
        for (int i7 = 0; i7 < list.size(); i7++) {
            if (((n0) list.get(i7)).f58317a.equals(g0Var)) {
                return ((n0) ((List) arrayList.get(0)).get(i7)).f58317a;
            }
        }
        return null;
    }

    @Override
    public final void x(Object obj, a aVar, e2.l1 l1Var) {
        Integer num = (Integer) obj;
        if (this.f58332r == null) {
            if (this.f58330p == -1) {
                this.f58330p = l1Var.h();
            } else if (l1Var.h() != this.f58330p) {
                this.f58332r = new IOException();
                return;
            }
            int length = this.f58331q.length;
            e2.l1[] l1VarArr = this.f58327m;
            if (length == 0) {
                this.f58331q = (long[][]) Array.newInstance(Long.TYPE, this.f58330p, l1VarArr.length);
            }
            ArrayList arrayList = this.f58328n;
            arrayList.remove(aVar);
            l1VarArr[num.intValue()] = l1Var;
            if (arrayList.isEmpty()) {
                n(l1VarArr[0]);
            }
        }
    }
}
