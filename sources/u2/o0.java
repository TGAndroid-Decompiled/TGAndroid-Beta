package u2;

import com.google.android.gms.internal.cast.b5;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
public final class o0 extends l {
    public static final b2.k0 f46763s;
    public final a[] f46764k;
    public final ArrayList f46765l;
    public final b2.k1[] f46766m;
    public final ArrayList f46767n;
    public final qb.b f46768o;
    public int f46769p;
    public long[][] f46770q;
    public b5 f46771r;

    static {
        b2.y yVar = new b2.y();
        e9.g0 g0Var = e9.i0.f8957b;
        e9.a1 a1Var = e9.a1.f8920e;
        List list = Collections.EMPTY_LIST;
        e9.a1 a1Var2 = e9.a1.f8920e;
        b2.d0 d0Var = new b2.d0();
        f46763s = new b2.k0("MergingMediaSource", new b2.z(yVar), null, new b2.e0(d0Var), b2.n0.K, b2.g0.d);
    }

    public o0(a... aVarArr) {
        qb.b bVar = new qb.b(23);
        this.f46764k = aVarArr;
        this.f46768o = bVar;
        this.f46767n = new ArrayList(Arrays.asList(aVarArr));
        this.f46769p = -1;
        this.f46765l = new ArrayList(aVarArr.length);
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            this.f46765l.add(new ArrayList());
        }
        this.f46766m = new b2.k1[aVarArr.length];
        this.f46770q = new long[0];
        new HashMap();
        e9.q.e(8, "expectedKeys");
        e9.q.e(2, "expectedValuesPerKey");
        new e9.v0(e9.v.a(8)).f9020f = new e9.u0();
    }

    @Override
    public final boolean a(b2.k0 k0Var) {
        a[] aVarArr = this.f46764k;
        if (aVarArr.length <= 0 || !aVarArr[0].a(k0Var)) {
            return false;
        }
        return true;
    }

    @Override
    public final d0 c(f0 f0Var, y2.d dVar, long j3) {
        a[] aVarArr = this.f46764k;
        int length = aVarArr.length;
        d0[] d0VarArr = new d0[length];
        b2.k1[] k1VarArr = this.f46766m;
        int b10 = k1VarArr[0].b(f0Var.f46667a);
        for (int i10 = 0; i10 < length; i10++) {
            f0 a2 = f0Var.a(k1VarArr[i10].l(b10));
            d0VarArr[i10] = aVarArr[i10].c(a2, dVar, j3 - this.f46770q[b10][i10]);
            ((List) this.f46765l.get(i10)).add(new n0(a2, d0VarArr[i10]));
        }
        return new m0(this.f46768o, this.f46770q[b10], d0VarArr);
    }

    @Override
    public final b2.k0 i() {
        a[] aVarArr = this.f46764k;
        if (aVarArr.length > 0) {
            return aVarArr[0].i();
        }
        return f46763s;
    }

    @Override
    public final void k() {
        b5 b5Var = this.f46771r;
        if (b5Var == null) {
            super.k();
            return;
        }
        throw b5Var;
    }

    @Override
    public final void m(g2.c0 c0Var) {
        this.f46730j = c0Var;
        this.f46729i = e2.d0.o(null);
        int i10 = 0;
        while (true) {
            a[] aVarArr = this.f46764k;
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
        m0 m0Var = (m0) d0Var;
        int i10 = 0;
        while (true) {
            a[] aVarArr = this.f46764k;
            if (i10 < aVarArr.length) {
                List list = (List) this.f46765l.get(i10);
                d0[] d0VarArr = m0Var.f46743a;
                boolean[] zArr = m0Var.f46744b;
                if (zArr[i10]) {
                    d0Var2 = ((n1) d0VarArr[i10]).f46757a;
                } else {
                    d0Var2 = d0VarArr[i10];
                }
                int i11 = 0;
                while (true) {
                    if (i11 >= list.size()) {
                        break;
                    } else if (((n0) list.get(i11)).f46756b.equals(d0Var2)) {
                        list.remove(i11);
                        break;
                    } else {
                        i11++;
                    }
                }
                a aVar = aVarArr[i10];
                d0[] d0VarArr2 = m0Var.f46743a;
                if (zArr[i10]) {
                    d0Var3 = ((n1) d0VarArr2[i10]).f46757a;
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
        Arrays.fill(this.f46766m, (Object) null);
        this.f46769p = -1;
        this.f46771r = null;
        ArrayList arrayList = this.f46767n;
        arrayList.clear();
        Collections.addAll(arrayList, this.f46764k);
    }

    @Override
    public final void t(b2.k0 k0Var) {
        this.f46764k[0].t(k0Var);
    }

    @Override
    public final f0 u(Object obj, f0 f0Var) {
        int intValue = ((Integer) obj).intValue();
        ArrayList arrayList = this.f46765l;
        List list = (List) arrayList.get(intValue);
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (((n0) list.get(i10)).f46755a.equals(f0Var)) {
                return ((n0) ((List) arrayList.get(0)).get(i10)).f46755a;
            }
        }
        return null;
    }

    @Override
    public final void x(Object obj, a aVar, b2.k1 k1Var) {
        Integer num = (Integer) obj;
        if (this.f46771r == null) {
            if (this.f46769p == -1) {
                this.f46769p = k1Var.h();
            } else if (k1Var.h() != this.f46769p) {
                this.f46771r = new IOException();
                return;
            }
            int length = this.f46770q.length;
            b2.k1[] k1VarArr = this.f46766m;
            if (length == 0) {
                this.f46770q = (long[][]) Array.newInstance(Long.TYPE, this.f46769p, k1VarArr.length);
            }
            ArrayList arrayList = this.f46767n;
            arrayList.remove(aVar);
            k1VarArr[num.intValue()] = k1Var;
            if (arrayList.isEmpty()) {
                n(k1VarArr[0]);
            }
        }
    }
}
