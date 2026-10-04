package u2;

import com.google.android.gms.internal.cast.b5;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
public final class p0 extends l {
    public static final b2.k0 f47369s;
    public final a[] f47370k;
    public final ArrayList f47371l;
    public final b2.k1[] f47372m;
    public final ArrayList f47373n;
    public final ob.a f47374o;
    public int f47375p;
    public long[][] f47376q;
    public b5 f47377r;

    static {
        b2.y yVar = new b2.y();
        e9.g0 g0Var = e9.i0.f8758b;
        e9.a1 a1Var = e9.a1.f8721e;
        List list = Collections.EMPTY_LIST;
        e9.a1 a1Var2 = e9.a1.f8721e;
        b2.d0 d0Var = new b2.d0();
        f47369s = new b2.k0("MergingMediaSource", new b2.z(yVar), null, new b2.e0(d0Var), b2.n0.K, b2.g0.d);
    }

    public p0(a... aVarArr) {
        ob.a aVar = new ob.a(23);
        this.f47370k = aVarArr;
        this.f47374o = aVar;
        this.f47373n = new ArrayList(Arrays.asList(aVarArr));
        this.f47375p = -1;
        this.f47371l = new ArrayList(aVarArr.length);
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            this.f47371l.add(new ArrayList());
        }
        this.f47372m = new b2.k1[aVarArr.length];
        this.f47376q = new long[0];
        new HashMap();
        e9.q.e(8, "expectedKeys");
        e9.q.e(2, "expectedValuesPerKey");
        new e9.v0(e9.v.a(8)).f8821f = new e9.u0();
    }

    @Override
    public final boolean a(b2.k0 k0Var) {
        a[] aVarArr = this.f47370k;
        if (aVarArr.length <= 0 || !aVarArr[0].a(k0Var)) {
            return false;
        }
        return true;
    }

    @Override
    public final d0 c(f0 f0Var, y2.d dVar, long j3) {
        a[] aVarArr = this.f47370k;
        int length = aVarArr.length;
        d0[] d0VarArr = new d0[length];
        b2.k1[] k1VarArr = this.f47372m;
        int b10 = k1VarArr[0].b(f0Var.f47263a);
        for (int i10 = 0; i10 < length; i10++) {
            f0 a2 = f0Var.a(k1VarArr[i10].l(b10));
            d0VarArr[i10] = aVarArr[i10].c(a2, dVar, j3 - this.f47376q[b10][i10]);
            ((List) this.f47371l.get(i10)).add(new o0(a2, d0VarArr[i10]));
        }
        return new n0(this.f47374o, this.f47376q[b10], d0VarArr);
    }

    @Override
    public final b2.k0 i() {
        a[] aVarArr = this.f47370k;
        if (aVarArr.length > 0) {
            return aVarArr[0].i();
        }
        return f47369s;
    }

    @Override
    public final void k() {
        b5 b5Var = this.f47377r;
        if (b5Var == null) {
            super.k();
            return;
        }
        throw b5Var;
    }

    @Override
    public final void m(g2.c0 c0Var) {
        this.f47317j = c0Var;
        this.f47316i = e2.d0.o(null);
        int i10 = 0;
        while (true) {
            a[] aVarArr = this.f47370k;
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
        n0 n0Var = (n0) d0Var;
        int i10 = 0;
        while (true) {
            a[] aVarArr = this.f47370k;
            if (i10 < aVarArr.length) {
                List list = (List) this.f47371l.get(i10);
                d0[] d0VarArr = n0Var.f47344a;
                boolean[] zArr = n0Var.f47345b;
                if (zArr[i10]) {
                    d0Var2 = ((o1) d0VarArr[i10]).f47359a;
                } else {
                    d0Var2 = d0VarArr[i10];
                }
                int i11 = 0;
                while (true) {
                    if (i11 >= list.size()) {
                        break;
                    } else if (((o0) list.get(i11)).f47358b.equals(d0Var2)) {
                        list.remove(i11);
                        break;
                    } else {
                        i11++;
                    }
                }
                a aVar = aVarArr[i10];
                d0[] d0VarArr2 = n0Var.f47344a;
                if (zArr[i10]) {
                    d0Var3 = ((o1) d0VarArr2[i10]).f47359a;
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
        Arrays.fill(this.f47372m, (Object) null);
        this.f47375p = -1;
        this.f47377r = null;
        ArrayList arrayList = this.f47373n;
        arrayList.clear();
        Collections.addAll(arrayList, this.f47370k);
    }

    @Override
    public final void t(b2.k0 k0Var) {
        this.f47370k[0].t(k0Var);
    }

    @Override
    public final f0 u(Object obj, f0 f0Var) {
        int intValue = ((Integer) obj).intValue();
        ArrayList arrayList = this.f47371l;
        List list = (List) arrayList.get(intValue);
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (((o0) list.get(i10)).f47357a.equals(f0Var)) {
                return ((o0) ((List) arrayList.get(0)).get(i10)).f47357a;
            }
        }
        return null;
    }

    @Override
    public final void x(Object obj, a aVar, b2.k1 k1Var) {
        Integer num = (Integer) obj;
        if (this.f47377r == null) {
            if (this.f47375p == -1) {
                this.f47375p = k1Var.h();
            } else if (k1Var.h() != this.f47375p) {
                this.f47377r = new IOException();
                return;
            }
            int length = this.f47376q.length;
            b2.k1[] k1VarArr = this.f47372m;
            if (length == 0) {
                this.f47376q = (long[][]) Array.newInstance(Long.TYPE, this.f47375p, k1VarArr.length);
            }
            ArrayList arrayList = this.f47373n;
            arrayList.remove(aVar);
            k1VarArr[num.intValue()] = k1Var;
            if (arrayList.isEmpty()) {
                n(k1VarArr[0]);
            }
        }
    }
}
