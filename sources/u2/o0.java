package u2;

import com.google.android.gms.internal.cast.x4;
import e9.x1;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
public final class o0 extends l {
    public static final b2.p0 f49975s;
    public final a[] f49976k;
    public final ArrayList f49977l;
    public final b2.o1[] f49978m;
    public final ArrayList f49979n;
    public final kb.a f49980o;
    public int f49981p;
    public long[][] f49982q;
    public x4 f49983r;

    static {
        b2.d0 d0Var = new b2.d0();
        e9.l0 l0Var = e9.n0.f6390b;
        x1 x1Var = x1.e;
        List list = Collections.EMPTY_LIST;
        x1 x1Var2 = x1.e;
        b2.i0 i0Var = new b2.i0();
        f49975s = new b2.p0("MergingMediaSource", new b2.e0(d0Var), null, new b2.j0(i0Var), b2.s0.L, b2.l0.d);
    }

    public o0(a... aVarArr) {
        kb.a aVar = new kb.a(21);
        this.f49976k = aVarArr;
        this.f49980o = aVar;
        this.f49979n = new ArrayList(Arrays.asList(aVarArr));
        this.f49981p = -1;
        this.f49977l = new ArrayList(aVarArr.length);
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            this.f49977l.add(new ArrayList());
        }
        this.f49978m = new b2.o1[aVarArr.length];
        this.f49982q = new long[0];
        new HashMap();
        e9.s.f(8, "expectedKeys");
        e9.s.f(2, "expectedValuesPerKey");
        new e9.p1(e9.x.b(8)).h = new e9.o1();
    }

    @Override
    public final boolean a(b2.p0 p0Var) {
        a[] aVarArr = this.f49976k;
        if (aVarArr.length <= 0 || !aVarArr[0].a(p0Var)) {
            return false;
        }
        return true;
    }

    @Override
    public final e0 c(g0 g0Var, android.support.v4.media.session.a0 a0Var, long j10) {
        a[] aVarArr = this.f49976k;
        int length = aVarArr.length;
        e0[] e0VarArr = new e0[length];
        b2.o1[] o1VarArr = this.f49978m;
        int b10 = o1VarArr[0].b(g0Var.f49889a);
        for (int i10 = 0; i10 < length; i10++) {
            g0 a2 = g0Var.a(o1VarArr[i10].l(b10));
            e0VarArr[i10] = aVarArr[i10].c(a2, a0Var, j10 - this.f49982q[b10][i10]);
            ((List) this.f49977l.get(i10)).add(new n0(a2, e0VarArr[i10]));
        }
        return new m0(this.f49980o, this.f49982q[b10], e0VarArr);
    }

    @Override
    public final b2.p0 i() {
        a[] aVarArr = this.f49976k;
        if (aVarArr.length > 0) {
            return aVarArr[0].i();
        }
        return f49975s;
    }

    @Override
    public final void k() {
        x4 x4Var = this.f49983r;
        if (x4Var == null) {
            super.k();
            return;
        }
        throw x4Var;
    }

    @Override
    public final void m(g2.d0 d0Var) {
        this.f49935j = d0Var;
        this.f49934i = e2.l0.q(null);
        int i10 = 0;
        while (true) {
            a[] aVarArr = this.f49976k;
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
            a[] aVarArr = this.f49976k;
            if (i10 < aVarArr.length) {
                List list = (List) this.f49977l.get(i10);
                e0[] e0VarArr = m0Var.f49943a;
                boolean[] zArr = m0Var.f49944b;
                if (zArr[i10]) {
                    e0Var2 = ((p1) e0VarArr[i10]).f49993a;
                } else {
                    e0Var2 = e0VarArr[i10];
                }
                int i11 = 0;
                while (true) {
                    if (i11 >= list.size()) {
                        break;
                    } else if (((n0) list.get(i11)).f49963b.equals(e0Var2)) {
                        list.remove(i11);
                        break;
                    } else {
                        i11++;
                    }
                }
                a aVar = aVarArr[i10];
                e0[] e0VarArr2 = m0Var.f49943a;
                if (zArr[i10]) {
                    e0Var3 = ((p1) e0VarArr2[i10]).f49993a;
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
        Arrays.fill(this.f49978m, (Object) null);
        this.f49981p = -1;
        this.f49983r = null;
        ArrayList arrayList = this.f49979n;
        arrayList.clear();
        Collections.addAll(arrayList, this.f49976k);
    }

    @Override
    public final void t(b2.p0 p0Var) {
        this.f49976k[0].t(p0Var);
    }

    @Override
    public final g0 u(Object obj, g0 g0Var) {
        int intValue = ((Integer) obj).intValue();
        ArrayList arrayList = this.f49977l;
        List list = (List) arrayList.get(intValue);
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (((n0) list.get(i10)).f49962a.equals(g0Var)) {
                return ((n0) ((List) arrayList.get(0)).get(i10)).f49962a;
            }
        }
        return null;
    }

    @Override
    public final void x(Object obj, a aVar, b2.o1 o1Var) {
        Integer num = (Integer) obj;
        if (this.f49983r == null) {
            if (this.f49981p == -1) {
                this.f49981p = o1Var.h();
            } else if (o1Var.h() != this.f49981p) {
                this.f49983r = new IOException();
                return;
            }
            int length = this.f49982q.length;
            b2.o1[] o1VarArr = this.f49978m;
            if (length == 0) {
                this.f49982q = (long[][]) Array.newInstance(Long.TYPE, this.f49981p, o1VarArr.length);
            }
            ArrayList arrayList = this.f49979n;
            arrayList.remove(aVar);
            o1VarArr[num.intValue()] = o1Var;
            if (arrayList.isEmpty()) {
                n(o1VarArr[0]);
            }
        }
    }
}
