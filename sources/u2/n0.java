package u2;

import com.google.android.gms.internal.cast.b5;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
public final class n0 extends l {
    public static final b2.k0 f43724s;
    public final a[] f43725k;
    public final ArrayList f43726l;
    public final b2.k1[] f43727m;
    public final ArrayList f43728n;
    public final ob.a f43729o;
    public int f43730p;
    public long[][] f43731q;
    public b5 f43732r;

    static {
        b2.y yVar = new b2.y();
        e9.g0 g0Var = e9.i0.f8066b;
        e9.a1 a1Var = e9.a1.e;
        List list = Collections.EMPTY_LIST;
        e9.a1 a1Var2 = e9.a1.e;
        b2.d0 d0Var = new b2.d0();
        f43724s = new b2.k0("MergingMediaSource", new b2.z(yVar), null, new b2.e0(d0Var), b2.n0.K, b2.g0.d);
    }

    public n0(a... aVarArr) {
        ob.a aVar = new ob.a(23);
        this.f43725k = aVarArr;
        this.f43729o = aVar;
        this.f43728n = new ArrayList(Arrays.asList(aVarArr));
        this.f43730p = -1;
        this.f43726l = new ArrayList(aVarArr.length);
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            this.f43726l.add(new ArrayList());
        }
        this.f43727m = new b2.k1[aVarArr.length];
        this.f43731q = new long[0];
        new HashMap();
        e9.q.e(8, "expectedKeys");
        e9.q.e(2, "expectedValuesPerKey");
        new e9.v0(e9.v.a(8)).f8123f = new e9.u0();
    }

    @Override
    public final boolean a(b2.k0 k0Var) {
        a[] aVarArr = this.f43725k;
        if (aVarArr.length <= 0 || !aVarArr[0].a(k0Var)) {
            return false;
        }
        return true;
    }

    @Override
    public final d0 c(f0 f0Var, y2.d dVar, long j3) {
        a[] aVarArr = this.f43725k;
        int length = aVarArr.length;
        d0[] d0VarArr = new d0[length];
        b2.k1[] k1VarArr = this.f43727m;
        int b10 = k1VarArr[0].b(f0Var.f43642a);
        for (int i10 = 0; i10 < length; i10++) {
            f0 a2 = f0Var.a(k1VarArr[i10].l(b10));
            d0VarArr[i10] = aVarArr[i10].c(a2, dVar, j3 - this.f43731q[b10][i10]);
            ((List) this.f43726l.get(i10)).add(new m0(a2, d0VarArr[i10]));
        }
        return new l0(this.f43729o, this.f43731q[b10], d0VarArr);
    }

    @Override
    public final b2.k0 i() {
        a[] aVarArr = this.f43725k;
        if (aVarArr.length > 0) {
            return aVarArr[0].i();
        }
        return f43724s;
    }

    @Override
    public final void k() {
        b5 b5Var = this.f43732r;
        if (b5Var == null) {
            super.k();
            return;
        }
        throw b5Var;
    }

    @Override
    public final void m(g2.c0 c0Var) {
        this.f43700j = c0Var;
        this.f43699i = e2.d0.o(null);
        int i10 = 0;
        while (true) {
            a[] aVarArr = this.f43725k;
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
            a[] aVarArr = this.f43725k;
            if (i10 < aVarArr.length) {
                List list = (List) this.f43726l.get(i10);
                d0[] d0VarArr = l0Var.f43701a;
                boolean[] zArr = l0Var.f43702b;
                if (zArr[i10]) {
                    d0Var2 = ((n1) d0VarArr[i10]).f43733a;
                } else {
                    d0Var2 = d0VarArr[i10];
                }
                int i11 = 0;
                while (true) {
                    if (i11 >= list.size()) {
                        break;
                    } else if (((m0) list.get(i11)).f43719b.equals(d0Var2)) {
                        list.remove(i11);
                        break;
                    } else {
                        i11++;
                    }
                }
                a aVar = aVarArr[i10];
                d0[] d0VarArr2 = l0Var.f43701a;
                if (zArr[i10]) {
                    d0Var3 = ((n1) d0VarArr2[i10]).f43733a;
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
        Arrays.fill(this.f43727m, (Object) null);
        this.f43730p = -1;
        this.f43732r = null;
        ArrayList arrayList = this.f43728n;
        arrayList.clear();
        Collections.addAll(arrayList, this.f43725k);
    }

    @Override
    public final void t(b2.k0 k0Var) {
        this.f43725k[0].t(k0Var);
    }

    @Override
    public final f0 u(Object obj, f0 f0Var) {
        int intValue = ((Integer) obj).intValue();
        ArrayList arrayList = this.f43726l;
        List list = (List) arrayList.get(intValue);
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (((m0) list.get(i10)).f43718a.equals(f0Var)) {
                return ((m0) ((List) arrayList.get(0)).get(i10)).f43718a;
            }
        }
        return null;
    }

    @Override
    public final void x(Object obj, a aVar, b2.k1 k1Var) {
        Integer num = (Integer) obj;
        if (this.f43732r == null) {
            if (this.f43730p == -1) {
                this.f43730p = k1Var.h();
            } else if (k1Var.h() != this.f43730p) {
                this.f43732r = new IOException();
                return;
            }
            int length = this.f43731q.length;
            b2.k1[] k1VarArr = this.f43727m;
            if (length == 0) {
                this.f43731q = (long[][]) Array.newInstance(Long.TYPE, this.f43730p, k1VarArr.length);
            }
            ArrayList arrayList = this.f43728n;
            arrayList.remove(aVar);
            k1VarArr[num.intValue()] = k1Var;
            if (arrayList.isEmpty()) {
                n(k1VarArr[0]);
            }
        }
    }
}
