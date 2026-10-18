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
public final class n0 extends l {
    public static final b2.o0 f47430s;
    public final a[] f47431k;
    public final ArrayList f47432l;
    public final b2.o1[] f47433m;
    public final ArrayList f47434n;
    public final oa.d f47435o;
    public int f47436p;
    public long[][] f47437q;
    public z4 f47438r;

    static {
        b2.c0 c0Var = new b2.c0();
        e9.l0 l0Var = e9.n0.f8477b;
        x1 x1Var = x1.e;
        List list = Collections.EMPTY_LIST;
        x1 x1Var2 = x1.e;
        b2.h0 h0Var = new b2.h0();
        f47430s = new b2.o0("MergingMediaSource", new b2.d0(c0Var), null, new b2.i0(h0Var), b2.r0.L, b2.k0.d);
    }

    public n0(a... aVarArr) {
        oa.d dVar = new oa.d(24);
        this.f47431k = aVarArr;
        this.f47435o = dVar;
        this.f47434n = new ArrayList(Arrays.asList(aVarArr));
        this.f47436p = -1;
        this.f47432l = new ArrayList(aVarArr.length);
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            this.f47432l.add(new ArrayList());
        }
        this.f47433m = new b2.o1[aVarArr.length];
        this.f47437q = new long[0];
        new HashMap();
        e9.s.f(8, "expectedKeys");
        e9.s.f(2, "expectedValuesPerKey");
        new e9.p1(e9.x.b(8)).h = new e9.o1();
    }

    @Override
    public final boolean a(b2.o0 o0Var) {
        a[] aVarArr = this.f47431k;
        if (aVarArr.length <= 0 || !aVarArr[0].a(o0Var)) {
            return false;
        }
        return true;
    }

    @Override
    public final d0 c(f0 f0Var, androidx.biometric.e eVar, long j10) {
        a[] aVarArr = this.f47431k;
        int length = aVarArr.length;
        d0[] d0VarArr = new d0[length];
        b2.o1[] o1VarArr = this.f47433m;
        int b10 = o1VarArr[0].b(f0Var.f47347a);
        for (int i10 = 0; i10 < length; i10++) {
            f0 a2 = f0Var.a(o1VarArr[i10].l(b10));
            d0VarArr[i10] = aVarArr[i10].c(a2, eVar, j10 - this.f47437q[b10][i10]);
            ((List) this.f47432l.get(i10)).add(new m0(a2, d0VarArr[i10]));
        }
        return new l0(this.f47435o, this.f47437q[b10], d0VarArr);
    }

    @Override
    public final b2.o0 i() {
        a[] aVarArr = this.f47431k;
        if (aVarArr.length > 0) {
            return aVarArr[0].i();
        }
        return f47430s;
    }

    @Override
    public final void k() {
        z4 z4Var = this.f47438r;
        if (z4Var == null) {
            super.k();
            return;
        }
        throw z4Var;
    }

    @Override
    public final void m(g2.c0 c0Var) {
        this.f47398j = c0Var;
        this.f47397i = e2.m0.q(null);
        int i10 = 0;
        while (true) {
            a[] aVarArr = this.f47431k;
            if (i10 < aVarArr.length) {
                y(Integer.valueOf(i10), aVarArr[i10]);
                i10++;
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
        int i10 = 0;
        while (true) {
            a[] aVarArr = this.f47431k;
            if (i10 < aVarArr.length) {
                List list = (List) this.f47432l.get(i10);
                d0[] d0VarArr = l0Var.f47399a;
                boolean[] zArr = l0Var.f47400b;
                if (zArr[i10]) {
                    d0Var2 = ((o1) d0VarArr[i10]).f47446a;
                } else {
                    d0Var2 = d0VarArr[i10];
                }
                int i11 = 0;
                while (true) {
                    if (i11 >= list.size()) {
                        break;
                    } else if (((m0) list.get(i11)).f47419b.equals(d0Var2)) {
                        list.remove(i11);
                        break;
                    } else {
                        i11++;
                    }
                }
                a aVar = aVarArr[i10];
                d0[] d0VarArr2 = l0Var.f47399a;
                if (zArr[i10]) {
                    d0Var3 = ((o1) d0VarArr2[i10]).f47446a;
                } else {
                    d0Var3 = d0VarArr2[i10];
                }
                aVar.o(d0Var3);
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void q() {
        super.q();
        Arrays.fill(this.f47433m, (Object) null);
        this.f47436p = -1;
        this.f47438r = null;
        ArrayList arrayList = this.f47434n;
        arrayList.clear();
        Collections.addAll(arrayList, this.f47431k);
    }

    @Override
    public final void t(b2.o0 o0Var) {
        this.f47431k[0].t(o0Var);
    }

    @Override
    public final f0 u(Object obj, f0 f0Var) {
        int intValue = ((Integer) obj).intValue();
        ArrayList arrayList = this.f47432l;
        List list = (List) arrayList.get(intValue);
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (((m0) list.get(i10)).f47418a.equals(f0Var)) {
                return ((m0) ((List) arrayList.get(0)).get(i10)).f47418a;
            }
        }
        return null;
    }

    @Override
    public final void x(Object obj, a aVar, b2.o1 o1Var) {
        Integer num = (Integer) obj;
        if (this.f47438r == null) {
            if (this.f47436p == -1) {
                this.f47436p = o1Var.h();
            } else if (o1Var.h() != this.f47436p) {
                this.f47438r = new IOException();
                return;
            }
            int length = this.f47437q.length;
            b2.o1[] o1VarArr = this.f47433m;
            if (length == 0) {
                this.f47437q = (long[][]) Array.newInstance(Long.TYPE, this.f47436p, o1VarArr.length);
            }
            ArrayList arrayList = this.f47434n;
            arrayList.remove(aVar);
            o1VarArr[num.intValue()] = o1Var;
            if (arrayList.isEmpty()) {
                n(o1VarArr[0]);
            }
        }
    }
}
