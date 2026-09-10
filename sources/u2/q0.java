package u2;

import com.google.android.gms.internal.cast.b5;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
public final class q0 extends m {
    public static final b2.k0 f42427s;
    public final a[] f42428k;
    public final ArrayList f42429l;
    public final b2.k1[] f42430m;
    public final ArrayList f42431n;
    public final ob.a f42432o;
    public int f42433p;
    public long[][] f42434q;
    public b5 f42435r;

    static {
        b2.y yVar = new b2.y();
        e9.g0 g0Var = e9.i0.f7384b;
        e9.a1 a1Var = e9.a1.e;
        List list = Collections.EMPTY_LIST;
        e9.a1 a1Var2 = e9.a1.e;
        b2.d0 d0Var = new b2.d0();
        f42427s = new b2.k0("MergingMediaSource", new b2.z(yVar), null, new b2.e0(d0Var), b2.n0.K, b2.g0.d);
    }

    public q0(a... aVarArr) {
        ob.a aVar = new ob.a(23);
        this.f42428k = aVarArr;
        this.f42432o = aVar;
        this.f42431n = new ArrayList(Arrays.asList(aVarArr));
        this.f42433p = -1;
        this.f42429l = new ArrayList(aVarArr.length);
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            this.f42429l.add(new ArrayList());
        }
        this.f42430m = new b2.k1[aVarArr.length];
        this.f42434q = new long[0];
        new HashMap();
        e9.q.e(8, "expectedKeys");
        e9.q.e(2, "expectedValuesPerKey");
        new e9.v0(e9.v.a(8)).f7441f = new e9.u0();
    }

    @Override
    public final boolean a(b2.k0 k0Var) {
        a[] aVarArr = this.f42428k;
        if (aVarArr.length <= 0 || !aVarArr[0].a(k0Var)) {
            return false;
        }
        return true;
    }

    @Override
    public final e0 c(g0 g0Var, y2.d dVar, long j3) {
        a[] aVarArr = this.f42428k;
        int length = aVarArr.length;
        e0[] e0VarArr = new e0[length];
        b2.k1[] k1VarArr = this.f42430m;
        int b10 = k1VarArr[0].b(g0Var.f42324a);
        for (int i10 = 0; i10 < length; i10++) {
            g0 a2 = g0Var.a(k1VarArr[i10].l(b10));
            e0VarArr[i10] = aVarArr[i10].c(a2, dVar, j3 - this.f42434q[b10][i10]);
            ((List) this.f42429l.get(i10)).add(new p0(a2, e0VarArr[i10]));
        }
        return new o0(this.f42432o, this.f42434q[b10], e0VarArr);
    }

    @Override
    public final b2.k0 i() {
        a[] aVarArr = this.f42428k;
        if (aVarArr.length > 0) {
            return aVarArr[0].i();
        }
        return f42427s;
    }

    @Override
    public final void k() {
        b5 b5Var = this.f42435r;
        if (b5Var == null) {
            super.k();
            return;
        }
        throw b5Var;
    }

    @Override
    public final void m(g2.c0 c0Var) {
        this.f42379j = c0Var;
        this.f42378i = e2.d0.o(null);
        int i10 = 0;
        while (true) {
            a[] aVarArr = this.f42428k;
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
        o0 o0Var = (o0) e0Var;
        int i10 = 0;
        while (true) {
            a[] aVarArr = this.f42428k;
            if (i10 < aVarArr.length) {
                List list = (List) this.f42429l.get(i10);
                e0[] e0VarArr = o0Var.f42404a;
                boolean[] zArr = o0Var.f42405b;
                if (zArr[i10]) {
                    e0Var2 = ((p1) e0VarArr[i10]).f42418a;
                } else {
                    e0Var2 = e0VarArr[i10];
                }
                int i11 = 0;
                while (true) {
                    if (i11 >= list.size()) {
                        break;
                    } else if (((p0) list.get(i11)).f42417b.equals(e0Var2)) {
                        list.remove(i11);
                        break;
                    } else {
                        i11++;
                    }
                }
                a aVar = aVarArr[i10];
                e0[] e0VarArr2 = o0Var.f42404a;
                if (zArr[i10]) {
                    e0Var3 = ((p1) e0VarArr2[i10]).f42418a;
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
        Arrays.fill(this.f42430m, (Object) null);
        this.f42433p = -1;
        this.f42435r = null;
        ArrayList arrayList = this.f42431n;
        arrayList.clear();
        Collections.addAll(arrayList, this.f42428k);
    }

    @Override
    public final void t(b2.k0 k0Var) {
        this.f42428k[0].t(k0Var);
    }

    @Override
    public final g0 u(Object obj, g0 g0Var) {
        int intValue = ((Integer) obj).intValue();
        ArrayList arrayList = this.f42429l;
        List list = (List) arrayList.get(intValue);
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (((p0) list.get(i10)).f42416a.equals(g0Var)) {
                return ((p0) ((List) arrayList.get(0)).get(i10)).f42416a;
            }
        }
        return null;
    }

    @Override
    public final void x(Object obj, a aVar, b2.k1 k1Var) {
        Integer num = (Integer) obj;
        if (this.f42435r == null) {
            if (this.f42433p == -1) {
                this.f42433p = k1Var.h();
            } else if (k1Var.h() != this.f42433p) {
                this.f42435r = new IOException();
                return;
            }
            int length = this.f42434q.length;
            b2.k1[] k1VarArr = this.f42430m;
            if (length == 0) {
                this.f42434q = (long[][]) Array.newInstance(Long.TYPE, this.f42433p, k1VarArr.length);
            }
            ArrayList arrayList = this.f42431n;
            arrayList.remove(aVar);
            k1VarArr[num.intValue()] = k1Var;
            if (arrayList.isEmpty()) {
                n(k1VarArr[0]);
            }
        }
    }
}
