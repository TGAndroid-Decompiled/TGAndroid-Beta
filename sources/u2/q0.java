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
public final class q0 extends m {
    public static final b2.o0 f47860s;
    public final a[] f47861k;
    public final ArrayList f47862l;
    public final b2.o1[] f47863m;
    public final ArrayList f47864n;
    public final oa.d f47865o;
    public int f47866p;
    public long[][] f47867q;
    public z4 f47868r;

    static {
        b2.c0 c0Var = new b2.c0();
        e9.l0 l0Var = e9.n0.f8481b;
        x1 x1Var = x1.e;
        List list = Collections.EMPTY_LIST;
        x1 x1Var2 = x1.e;
        b2.h0 h0Var = new b2.h0();
        f47860s = new b2.o0("MergingMediaSource", new b2.d0(c0Var), null, new b2.i0(h0Var), b2.r0.L, b2.k0.d);
    }

    public q0(a... aVarArr) {
        oa.d dVar = new oa.d(24);
        this.f47861k = aVarArr;
        this.f47865o = dVar;
        this.f47864n = new ArrayList(Arrays.asList(aVarArr));
        this.f47866p = -1;
        this.f47862l = new ArrayList(aVarArr.length);
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            this.f47862l.add(new ArrayList());
        }
        this.f47863m = new b2.o1[aVarArr.length];
        this.f47867q = new long[0];
        new HashMap();
        e9.s.f(8, "expectedKeys");
        e9.s.f(2, "expectedValuesPerKey");
        new e9.p1(e9.x.b(8)).h = new e9.o1();
    }

    @Override
    public final boolean a(b2.o0 o0Var) {
        a[] aVarArr = this.f47861k;
        if (aVarArr.length <= 0 || !aVarArr[0].a(o0Var)) {
            return false;
        }
        return true;
    }

    @Override
    public final f0 c(h0 h0Var, androidx.biometric.e eVar, long j10) {
        a[] aVarArr = this.f47861k;
        int length = aVarArr.length;
        f0[] f0VarArr = new f0[length];
        b2.o1[] o1VarArr = this.f47863m;
        int b10 = o1VarArr[0].b(h0Var.f47766a);
        for (int i10 = 0; i10 < length; i10++) {
            h0 a2 = h0Var.a(o1VarArr[i10].l(b10));
            f0VarArr[i10] = aVarArr[i10].c(a2, eVar, j10 - this.f47867q[b10][i10]);
            ((List) this.f47862l.get(i10)).add(new p0(a2, f0VarArr[i10]));
        }
        return new o0(this.f47865o, this.f47867q[b10], f0VarArr);
    }

    @Override
    public final b2.o0 i() {
        a[] aVarArr = this.f47861k;
        if (aVarArr.length > 0) {
            return aVarArr[0].i();
        }
        return f47860s;
    }

    @Override
    public final void k() {
        z4 z4Var = this.f47868r;
        if (z4Var == null) {
            super.k();
            return;
        }
        throw z4Var;
    }

    @Override
    public final void m(g2.c0 c0Var) {
        this.f47812j = c0Var;
        this.f47811i = e2.m0.q(null);
        int i10 = 0;
        while (true) {
            a[] aVarArr = this.f47861k;
            if (i10 < aVarArr.length) {
                y(Integer.valueOf(i10), aVarArr[i10]);
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void o(f0 f0Var) {
        f0 f0Var2;
        f0 f0Var3;
        o0 o0Var = (o0) f0Var;
        int i10 = 0;
        while (true) {
            a[] aVarArr = this.f47861k;
            if (i10 < aVarArr.length) {
                List list = (List) this.f47862l.get(i10);
                f0[] f0VarArr = o0Var.f47825a;
                boolean[] zArr = o0Var.f47826b;
                if (zArr[i10]) {
                    f0Var2 = ((r1) f0VarArr[i10]).f47879a;
                } else {
                    f0Var2 = f0VarArr[i10];
                }
                int i11 = 0;
                while (true) {
                    if (i11 >= list.size()) {
                        break;
                    } else if (((p0) list.get(i11)).f47846b.equals(f0Var2)) {
                        list.remove(i11);
                        break;
                    } else {
                        i11++;
                    }
                }
                a aVar = aVarArr[i10];
                f0[] f0VarArr2 = o0Var.f47825a;
                if (zArr[i10]) {
                    f0Var3 = ((r1) f0VarArr2[i10]).f47879a;
                } else {
                    f0Var3 = f0VarArr2[i10];
                }
                aVar.o(f0Var3);
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void q() {
        super.q();
        Arrays.fill(this.f47863m, (Object) null);
        this.f47866p = -1;
        this.f47868r = null;
        ArrayList arrayList = this.f47864n;
        arrayList.clear();
        Collections.addAll(arrayList, this.f47861k);
    }

    @Override
    public final void t(b2.o0 o0Var) {
        this.f47861k[0].t(o0Var);
    }

    @Override
    public final h0 u(Object obj, h0 h0Var) {
        int intValue = ((Integer) obj).intValue();
        ArrayList arrayList = this.f47862l;
        List list = (List) arrayList.get(intValue);
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (((p0) list.get(i10)).f47845a.equals(h0Var)) {
                return ((p0) ((List) arrayList.get(0)).get(i10)).f47845a;
            }
        }
        return null;
    }

    @Override
    public final void x(Object obj, a aVar, b2.o1 o1Var) {
        Integer num = (Integer) obj;
        if (this.f47868r == null) {
            if (this.f47866p == -1) {
                this.f47866p = o1Var.h();
            } else if (o1Var.h() != this.f47866p) {
                this.f47868r = new IOException();
                return;
            }
            int length = this.f47867q.length;
            b2.o1[] o1VarArr = this.f47863m;
            if (length == 0) {
                this.f47867q = (long[][]) Array.newInstance(Long.TYPE, this.f47866p, o1VarArr.length);
            }
            ArrayList arrayList = this.f47864n;
            arrayList.remove(aVar);
            o1VarArr[num.intValue()] = o1Var;
            if (arrayList.isEmpty()) {
                n(o1VarArr[0]);
            }
        }
    }
}
