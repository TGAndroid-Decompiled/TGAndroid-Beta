package w7;

import android.util.SparseBooleanArray;
public abstract class w {
    public static b2.c1 a(b2.c1 c1Var, b2.c1 c1Var2) {
        if (c1Var != null) {
            b2.v vVar = c1Var.f2093a;
            if (c1Var2 != null) {
                SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
                for (int i10 = 0; i10 < vVar.f2443a.size(); i10++) {
                    if (c1Var2.a(vVar.a(i10))) {
                        int a2 = vVar.a(i10);
                        v7.u6.p(!false);
                        sparseBooleanArray.append(a2, true);
                    }
                }
                v7.u6.p(!false);
                return new b2.c1(new b2.v(sparseBooleanArray));
            }
        }
        return b2.c1.f2091b;
    }

    public static void b(b2.g1 g1Var, m4.x xVar) {
        int i10 = xVar.f15675b;
        long j10 = xVar.f15676c;
        e9.n0 n0Var = xVar.f15674a;
        if (i10 == -1) {
            if (g1Var.o0(20)) {
                g1Var.L0(n0Var);
            } else if (!n0Var.isEmpty()) {
                g1Var.l0((b2.p0) n0Var.get(0));
            }
        } else if (g1Var.o0(20)) {
            g1Var.S(j10, xVar.f15675b, n0Var);
        } else if (!n0Var.isEmpty()) {
            g1Var.k((b2.p0) n0Var.get(0), j10);
        }
    }
}
