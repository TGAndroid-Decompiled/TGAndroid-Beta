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
    public static final b2.o0 f47387s;
    public final a[] f47388k;
    public final ArrayList f47389l;
    public final b2.o1[] f47390m;
    public final ArrayList f47391n;
    public final oa.d f47392o;
    public int f47393p;
    public long[][] f47394q;
    public z4 f47395r;

    static {
        b2.c0 c0Var = new b2.c0();
        e9.l0 l0Var = e9.n0.f8476b;
        x1 x1Var = x1.e;
        List list = Collections.EMPTY_LIST;
        x1 x1Var2 = x1.e;
        b2.h0 h0Var = new b2.h0();
        f47387s = new b2.o0("MergingMediaSource", new b2.d0(c0Var), null, new b2.i0(h0Var), b2.r0.L, b2.k0.d);
    }

    public o0(a... aVarArr) {
        oa.d dVar = new oa.d(24);
        this.f47388k = aVarArr;
        this.f47392o = dVar;
        this.f47391n = new ArrayList(Arrays.asList(aVarArr));
        this.f47393p = -1;
        this.f47389l = new ArrayList(aVarArr.length);
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            this.f47389l.add(new ArrayList());
        }
        this.f47390m = new b2.o1[aVarArr.length];
        this.f47394q = new long[0];
        new HashMap();
        e9.s.f(8, "expectedKeys");
        e9.s.f(2, "expectedValuesPerKey");
        new e9.p1(e9.x.b(8)).h = new e9.o1();
    }

    @Override
    public final boolean a(b2.o0 o0Var) {
        a[] aVarArr = this.f47388k;
        if (aVarArr.length <= 0 || !aVarArr[0].a(o0Var)) {
            return false;
        }
        return true;
    }

    @Override
    public final e0 c(g0 g0Var, androidx.biometric.e eVar, long j10) {
        a[] aVarArr = this.f47388k;
        int length = aVarArr.length;
        e0[] e0VarArr = new e0[length];
        b2.o1[] o1VarArr = this.f47390m;
        int b10 = o1VarArr[0].b(g0Var.f47304a);
        for (int i10 = 0; i10 < length; i10++) {
            g0 a2 = g0Var.a(o1VarArr[i10].l(b10));
            e0VarArr[i10] = aVarArr[i10].c(a2, eVar, j10 - this.f47394q[b10][i10]);
            ((List) this.f47389l.get(i10)).add(new n0(a2, e0VarArr[i10]));
        }
        return new m0(this.f47392o, this.f47394q[b10], e0VarArr);
    }

    @Override
    public final b2.o0 i() {
        a[] aVarArr = this.f47388k;
        if (aVarArr.length > 0) {
            return aVarArr[0].i();
        }
        return f47387s;
    }

    @Override
    public final void k() {
        z4 z4Var = this.f47395r;
        if (z4Var == null) {
            super.k();
            return;
        }
        throw z4Var;
    }

    @Override
    public final void m(g2.c0 c0Var) {
        this.f47355j = c0Var;
        this.f47354i = e2.m0.q(null);
        int i10 = 0;
        while (true) {
            a[] aVarArr = this.f47388k;
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
            a[] aVarArr = this.f47388k;
            if (i10 < aVarArr.length) {
                List list = (List) this.f47389l.get(i10);
                e0[] e0VarArr = m0Var.f47356a;
                boolean[] zArr = m0Var.f47357b;
                if (zArr[i10]) {
                    e0Var2 = ((p1) e0VarArr[i10]).f47403a;
                } else {
                    e0Var2 = e0VarArr[i10];
                }
                int i11 = 0;
                while (true) {
                    if (i11 >= list.size()) {
                        break;
                    } else if (((n0) list.get(i11)).f47376b.equals(e0Var2)) {
                        list.remove(i11);
                        break;
                    } else {
                        i11++;
                    }
                }
                a aVar = aVarArr[i10];
                e0[] e0VarArr2 = m0Var.f47356a;
                if (zArr[i10]) {
                    e0Var3 = ((p1) e0VarArr2[i10]).f47403a;
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
        Arrays.fill(this.f47390m, (Object) null);
        this.f47393p = -1;
        this.f47395r = null;
        ArrayList arrayList = this.f47391n;
        arrayList.clear();
        Collections.addAll(arrayList, this.f47388k);
    }

    @Override
    public final void t(b2.o0 o0Var) {
        this.f47388k[0].t(o0Var);
    }

    @Override
    public final g0 u(Object obj, g0 g0Var) {
        int intValue = ((Integer) obj).intValue();
        ArrayList arrayList = this.f47389l;
        List list = (List) arrayList.get(intValue);
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (((n0) list.get(i10)).f47375a.equals(g0Var)) {
                return ((n0) ((List) arrayList.get(0)).get(i10)).f47375a;
            }
        }
        return null;
    }

    @Override
    public final void x(Object obj, a aVar, b2.o1 o1Var) {
        Integer num = (Integer) obj;
        if (this.f47395r == null) {
            if (this.f47393p == -1) {
                this.f47393p = o1Var.h();
            } else if (o1Var.h() != this.f47393p) {
                this.f47395r = new IOException();
                return;
            }
            int length = this.f47394q.length;
            b2.o1[] o1VarArr = this.f47390m;
            if (length == 0) {
                this.f47394q = (long[][]) Array.newInstance(Long.TYPE, this.f47393p, o1VarArr.length);
            }
            ArrayList arrayList = this.f47391n;
            arrayList.remove(aVar);
            o1VarArr[num.intValue()] = o1Var;
            if (arrayList.isEmpty()) {
                n(o1VarArr[0]);
            }
        }
    }
}
