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
public final class p0 extends m {
    public static final b2.o0 f47407s;
    public final a[] f47408k;
    public final ArrayList f47409l;
    public final b2.o1[] f47410m;
    public final ArrayList f47411n;
    public final oa.d f47412o;
    public int f47413p;
    public long[][] f47414q;
    public z4 f47415r;

    static {
        b2.c0 c0Var = new b2.c0();
        e9.l0 l0Var = e9.n0.f8474b;
        x1 x1Var = x1.e;
        List list = Collections.EMPTY_LIST;
        x1 x1Var2 = x1.e;
        b2.h0 h0Var = new b2.h0();
        f47407s = new b2.o0("MergingMediaSource", new b2.d0(c0Var), null, new b2.i0(h0Var), b2.r0.L, b2.k0.d);
    }

    public p0(a... aVarArr) {
        oa.d dVar = new oa.d(24);
        this.f47408k = aVarArr;
        this.f47412o = dVar;
        this.f47411n = new ArrayList(Arrays.asList(aVarArr));
        this.f47413p = -1;
        this.f47409l = new ArrayList(aVarArr.length);
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            this.f47409l.add(new ArrayList());
        }
        this.f47410m = new b2.o1[aVarArr.length];
        this.f47414q = new long[0];
        new HashMap();
        e9.s.f(8, "expectedKeys");
        e9.s.f(2, "expectedValuesPerKey");
        new e9.p1(e9.x.b(8)).h = new e9.o1();
    }

    @Override
    public final boolean a(b2.o0 o0Var) {
        a[] aVarArr = this.f47408k;
        if (aVarArr.length <= 0 || !aVarArr[0].a(o0Var)) {
            return false;
        }
        return true;
    }

    @Override
    public final e0 c(g0 g0Var, androidx.biometric.e eVar, long j10) {
        a[] aVarArr = this.f47408k;
        int length = aVarArr.length;
        e0[] e0VarArr = new e0[length];
        b2.o1[] o1VarArr = this.f47410m;
        int b10 = o1VarArr[0].b(g0Var.f47318a);
        for (int i10 = 0; i10 < length; i10++) {
            g0 a2 = g0Var.a(o1VarArr[i10].l(b10));
            e0VarArr[i10] = aVarArr[i10].c(a2, eVar, j10 - this.f47414q[b10][i10]);
            ((List) this.f47409l.get(i10)).add(new o0(a2, e0VarArr[i10]));
        }
        return new n0(this.f47412o, this.f47414q[b10], e0VarArr);
    }

    @Override
    public final b2.o0 i() {
        a[] aVarArr = this.f47408k;
        if (aVarArr.length > 0) {
            return aVarArr[0].i();
        }
        return f47407s;
    }

    @Override
    public final void k() {
        z4 z4Var = this.f47415r;
        if (z4Var == null) {
            super.k();
            return;
        }
        throw z4Var;
    }

    @Override
    public final void m(g2.c0 c0Var) {
        this.f47367j = c0Var;
        this.f47366i = e2.m0.q(null);
        int i10 = 0;
        while (true) {
            a[] aVarArr = this.f47408k;
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
        n0 n0Var = (n0) e0Var;
        int i10 = 0;
        while (true) {
            a[] aVarArr = this.f47408k;
            if (i10 < aVarArr.length) {
                List list = (List) this.f47409l.get(i10);
                e0[] e0VarArr = n0Var.f47375a;
                boolean[] zArr = n0Var.f47376b;
                if (zArr[i10]) {
                    e0Var2 = ((q1) e0VarArr[i10]).f47426a;
                } else {
                    e0Var2 = e0VarArr[i10];
                }
                int i11 = 0;
                while (true) {
                    if (i11 >= list.size()) {
                        break;
                    } else if (((o0) list.get(i11)).f47395b.equals(e0Var2)) {
                        list.remove(i11);
                        break;
                    } else {
                        i11++;
                    }
                }
                a aVar = aVarArr[i10];
                e0[] e0VarArr2 = n0Var.f47375a;
                if (zArr[i10]) {
                    e0Var3 = ((q1) e0VarArr2[i10]).f47426a;
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
        Arrays.fill(this.f47410m, (Object) null);
        this.f47413p = -1;
        this.f47415r = null;
        ArrayList arrayList = this.f47411n;
        arrayList.clear();
        Collections.addAll(arrayList, this.f47408k);
    }

    @Override
    public final void t(b2.o0 o0Var) {
        this.f47408k[0].t(o0Var);
    }

    @Override
    public final g0 u(Object obj, g0 g0Var) {
        int intValue = ((Integer) obj).intValue();
        ArrayList arrayList = this.f47409l;
        List list = (List) arrayList.get(intValue);
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (((o0) list.get(i10)).f47394a.equals(g0Var)) {
                return ((o0) ((List) arrayList.get(0)).get(i10)).f47394a;
            }
        }
        return null;
    }

    @Override
    public final void x(Object obj, a aVar, b2.o1 o1Var) {
        Integer num = (Integer) obj;
        if (this.f47415r == null) {
            if (this.f47413p == -1) {
                this.f47413p = o1Var.h();
            } else if (o1Var.h() != this.f47413p) {
                this.f47415r = new IOException();
                return;
            }
            int length = this.f47414q.length;
            b2.o1[] o1VarArr = this.f47410m;
            if (length == 0) {
                this.f47414q = (long[][]) Array.newInstance(Long.TYPE, this.f47413p, o1VarArr.length);
            }
            ArrayList arrayList = this.f47411n;
            arrayList.remove(aVar);
            o1VarArr[num.intValue()] = o1Var;
            if (arrayList.isEmpty()) {
                n(o1VarArr[0]);
            }
        }
    }
}
