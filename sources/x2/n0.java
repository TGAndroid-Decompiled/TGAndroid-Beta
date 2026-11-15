package x2;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
public final class n0 extends l {
    public static final e2.l0 f59609s;
    public final a[] f59610k;
    public final ArrayList f59611l;
    public final e2.l1[] f59612m;
    public final ArrayList f59613n;
    public final nb.a f59614o;
    public int f59615p;
    public long[][] f59616q;
    public androidx.datastore.preferences.protobuf.l f59617r;

    static {
        e2.z zVar = new e2.z();
        h9.g0 g0Var = h9.i0.f13686b;
        h9.s1 s1Var = h9.s1.f13749e;
        List list = Collections.EMPTY_LIST;
        h9.s1 s1Var2 = h9.s1.f13749e;
        e2.e0 e0Var = new e2.e0();
        f59609s = new e2.l0("MergingMediaSource", new e2.a0(zVar), null, new e2.f0(e0Var), e2.o0.L, e2.h0.d);
    }

    public n0(a... aVarArr) {
        nb.a aVar = new nb.a(28);
        this.f59610k = aVarArr;
        this.f59614o = aVar;
        this.f59613n = new ArrayList(Arrays.asList(aVarArr));
        this.f59615p = -1;
        this.f59611l = new ArrayList(aVarArr.length);
        for (int i7 = 0; i7 < aVarArr.length; i7++) {
            this.f59611l.add(new ArrayList());
        }
        this.f59612m = new e2.l1[aVarArr.length];
        this.f59616q = new long[0];
        new HashMap();
        h9.o.g(8, "expectedKeys");
        h9.o.g(2, "expectedValuesPerKey");
        new h9.k1(h9.s.c(8)).h = new h9.j1();
    }

    @Override
    public final boolean a(e2.l0 l0Var) {
        a[] aVarArr = this.f59610k;
        if (aVarArr.length <= 0 || !aVarArr[0].a(l0Var)) {
            return false;
        }
        return true;
    }

    @Override
    public final d0 c(f0 f0Var, h6.m mVar, long j3) {
        a[] aVarArr = this.f59610k;
        int length = aVarArr.length;
        d0[] d0VarArr = new d0[length];
        e2.l1[] l1VarArr = this.f59612m;
        int b10 = l1VarArr[0].b(f0Var.f59523a);
        for (int i7 = 0; i7 < length; i7++) {
            f0 a10 = f0Var.a(l1VarArr[i7].l(b10));
            d0VarArr[i7] = aVarArr[i7].c(a10, mVar, j3 - this.f59616q[b10][i7]);
            ((List) this.f59611l.get(i7)).add(new m0(a10, d0VarArr[i7]));
        }
        return new l0(this.f59614o, this.f59616q[b10], d0VarArr);
    }

    @Override
    public final e2.l0 i() {
        a[] aVarArr = this.f59610k;
        if (aVarArr.length > 0) {
            return aVarArr[0].i();
        }
        return f59609s;
    }

    @Override
    public final void k() {
        androidx.datastore.preferences.protobuf.l lVar = this.f59617r;
        if (lVar == null) {
            super.k();
            return;
        }
        throw lVar;
    }

    @Override
    public final void m(j2.c0 c0Var) {
        this.f59584j = c0Var;
        this.f59583i = h2.l0.q(null);
        int i7 = 0;
        while (true) {
            a[] aVarArr = this.f59610k;
            if (i7 < aVarArr.length) {
                y(Integer.valueOf(i7), aVarArr[i7]);
                i7++;
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
        int i7 = 0;
        while (true) {
            a[] aVarArr = this.f59610k;
            if (i7 < aVarArr.length) {
                List list = (List) this.f59611l.get(i7);
                d0[] d0VarArr = l0Var.f59585a;
                boolean[] zArr = l0Var.f59586b;
                if (zArr[i7]) {
                    d0Var2 = ((n1) d0VarArr[i7]).f59618a;
                } else {
                    d0Var2 = d0VarArr[i7];
                }
                int i10 = 0;
                while (true) {
                    if (i10 >= list.size()) {
                        break;
                    } else if (((m0) list.get(i10)).f59604b.equals(d0Var2)) {
                        list.remove(i10);
                        break;
                    } else {
                        i10++;
                    }
                }
                a aVar = aVarArr[i7];
                d0[] d0VarArr2 = l0Var.f59585a;
                if (zArr[i7]) {
                    d0Var3 = ((n1) d0VarArr2[i7]).f59618a;
                } else {
                    d0Var3 = d0VarArr2[i7];
                }
                aVar.o(d0Var3);
                i7++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void q() {
        super.q();
        Arrays.fill(this.f59612m, (Object) null);
        this.f59615p = -1;
        this.f59617r = null;
        ArrayList arrayList = this.f59613n;
        arrayList.clear();
        Collections.addAll(arrayList, this.f59610k);
    }

    @Override
    public final void t(e2.l0 l0Var) {
        this.f59610k[0].t(l0Var);
    }

    @Override
    public final f0 u(Object obj, f0 f0Var) {
        int intValue = ((Integer) obj).intValue();
        ArrayList arrayList = this.f59611l;
        List list = (List) arrayList.get(intValue);
        for (int i7 = 0; i7 < list.size(); i7++) {
            if (((m0) list.get(i7)).f59603a.equals(f0Var)) {
                return ((m0) ((List) arrayList.get(0)).get(i7)).f59603a;
            }
        }
        return null;
    }

    @Override
    public final void x(Object obj, a aVar, e2.l1 l1Var) {
        Integer num = (Integer) obj;
        if (this.f59617r == null) {
            if (this.f59615p == -1) {
                this.f59615p = l1Var.h();
            } else if (l1Var.h() != this.f59615p) {
                this.f59617r = new IOException();
                return;
            }
            int length = this.f59616q.length;
            e2.l1[] l1VarArr = this.f59612m;
            if (length == 0) {
                this.f59616q = (long[][]) Array.newInstance(Long.TYPE, this.f59615p, l1VarArr.length);
            }
            ArrayList arrayList = this.f59613n;
            arrayList.remove(aVar);
            l1VarArr[num.intValue()] = l1Var;
            if (arrayList.isEmpty()) {
                n(l1VarArr[0]);
            }
        }
    }
}
