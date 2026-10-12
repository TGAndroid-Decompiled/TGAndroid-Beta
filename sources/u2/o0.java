package u2;

import com.google.android.gms.internal.cast.z4;
import e9.x1;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
public final class o0 extends m {
    public static final b2.p0 f46003s;
    public final a[] f46004k;
    public final ArrayList f46005l;
    public final b2.p1[] f46006m;
    public final ArrayList f46007n;
    public final oa.d f46008o;
    public int f46009p;
    public long[][] f46010q;
    public z4 f46011r;

    static {
        b2.d0 d0Var = new b2.d0();
        e9.l0 l0Var = e9.n0.f8592b;
        x1 x1Var = x1.e;
        List list = Collections.EMPTY_LIST;
        x1 x1Var2 = x1.e;
        b2.i0 i0Var = new b2.i0();
        f46003s = new b2.p0("MergingMediaSource", new b2.e0(d0Var), null, new b2.j0(i0Var), b2.s0.L, b2.l0.d);
    }

    public o0(a... aVarArr) {
        oa.d dVar = new oa.d(24);
        this.f46004k = aVarArr;
        this.f46008o = dVar;
        this.f46007n = new ArrayList(Arrays.asList(aVarArr));
        this.f46009p = -1;
        this.f46005l = new ArrayList(aVarArr.length);
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            this.f46005l.add(new ArrayList());
        }
        this.f46006m = new b2.p1[aVarArr.length];
        this.f46010q = new long[0];
        new HashMap();
        e9.s.f(8, "expectedKeys");
        e9.s.f(2, "expectedValuesPerKey");
        new e9.p1(e9.x.b(8)).h = new e9.o1();
    }

    @Override
    public final boolean a(b2.p0 p0Var) {
        a[] aVarArr = this.f46004k;
        if (aVarArr.length <= 0 || !aVarArr[0].a(p0Var)) {
            return false;
        }
        return true;
    }

    @Override
    public final e0 c(g0 g0Var, androidx.biometric.e eVar, long j10) {
        a[] aVarArr = this.f46004k;
        int length = aVarArr.length;
        e0[] e0VarArr = new e0[length];
        b2.p1[] p1VarArr = this.f46006m;
        int b10 = p1VarArr[0].b(g0Var.f45920a);
        for (int i10 = 0; i10 < length; i10++) {
            g0 a2 = g0Var.a(p1VarArr[i10].l(b10));
            e0VarArr[i10] = aVarArr[i10].c(a2, eVar, j10 - this.f46010q[b10][i10]);
            ((List) this.f46005l.get(i10)).add(new n0(a2, e0VarArr[i10]));
        }
        return new m0(this.f46008o, this.f46010q[b10], e0VarArr);
    }

    @Override
    public final b2.p0 i() {
        a[] aVarArr = this.f46004k;
        if (aVarArr.length > 0) {
            return aVarArr[0].i();
        }
        return f46003s;
    }

    @Override
    public final void k() {
        z4 z4Var = this.f46011r;
        if (z4Var == null) {
            super.k();
            return;
        }
        throw z4Var;
    }

    @Override
    public final void m(g2.c0 c0Var) {
        this.f45971j = c0Var;
        this.f45970i = e2.m0.q(null);
        int i10 = 0;
        while (true) {
            a[] aVarArr = this.f46004k;
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
            a[] aVarArr = this.f46004k;
            if (i10 < aVarArr.length) {
                List list = (List) this.f46005l.get(i10);
                e0[] e0VarArr = m0Var.f45972a;
                boolean[] zArr = m0Var.f45973b;
                if (zArr[i10]) {
                    e0Var2 = ((p1) e0VarArr[i10]).f46019a;
                } else {
                    e0Var2 = e0VarArr[i10];
                }
                int i11 = 0;
                while (true) {
                    if (i11 >= list.size()) {
                        break;
                    } else if (((n0) list.get(i11)).f45992b.equals(e0Var2)) {
                        list.remove(i11);
                        break;
                    } else {
                        i11++;
                    }
                }
                a aVar = aVarArr[i10];
                e0[] e0VarArr2 = m0Var.f45972a;
                if (zArr[i10]) {
                    e0Var3 = ((p1) e0VarArr2[i10]).f46019a;
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
        Arrays.fill(this.f46006m, (Object) null);
        this.f46009p = -1;
        this.f46011r = null;
        ArrayList arrayList = this.f46007n;
        arrayList.clear();
        Collections.addAll(arrayList, this.f46004k);
    }

    @Override
    public final void t(b2.p0 p0Var) {
        this.f46004k[0].t(p0Var);
    }

    @Override
    public final g0 u(Object obj, g0 g0Var) {
        int intValue = ((Integer) obj).intValue();
        ArrayList arrayList = this.f46005l;
        List list = (List) arrayList.get(intValue);
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (((n0) list.get(i10)).f45991a.equals(g0Var)) {
                return ((n0) ((List) arrayList.get(0)).get(i10)).f45991a;
            }
        }
        return null;
    }

    @Override
    public final void x(Object obj, a aVar, b2.p1 p1Var) {
        Integer num = (Integer) obj;
        if (this.f46011r == null) {
            if (this.f46009p == -1) {
                this.f46009p = p1Var.h();
            } else if (p1Var.h() != this.f46009p) {
                this.f46011r = new IOException();
                return;
            }
            int length = this.f46010q.length;
            b2.p1[] p1VarArr = this.f46006m;
            if (length == 0) {
                this.f46010q = (long[][]) Array.newInstance(Long.TYPE, this.f46009p, p1VarArr.length);
            }
            ArrayList arrayList = this.f46007n;
            arrayList.remove(aVar);
            p1VarArr[num.intValue()] = p1Var;
            if (arrayList.isEmpty()) {
                n(p1VarArr[0]);
            }
        }
    }
}
