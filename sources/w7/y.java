package w7;

import android.util.SparseBooleanArray;
public abstract class y {
    public static b2.b1 a(b2.b1 b1Var, b2.b1 b1Var2) {
        if (b1Var != null) {
            b2.v vVar = b1Var.f1984a;
            if (b1Var2 != null) {
                SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
                for (int i10 = 0; i10 < vVar.f2347a.size(); i10++) {
                    if (b1Var2.a(vVar.a(i10))) {
                        int a2 = vVar.a(i10);
                        v7.t6.p(!false);
                        sparseBooleanArray.append(a2, true);
                    }
                }
                v7.t6.p(!false);
                return new b2.b1(new b2.v(sparseBooleanArray));
            }
        }
        return b2.b1.f1982b;
    }

    public static void b(b2.f1 f1Var, m4.x xVar) {
        int i10 = xVar.f12987b;
        long j10 = xVar.f12988c;
        e9.n0 n0Var = xVar.f12986a;
        if (i10 == -1) {
            if (f1Var.n0(20)) {
                f1Var.L0(n0Var);
            } else if (!n0Var.isEmpty()) {
                f1Var.k0((b2.p0) n0Var.get(0));
            }
        } else if (f1Var.n0(20)) {
            f1Var.U(n0Var, xVar.f12987b, j10);
        } else if (!n0Var.isEmpty()) {
            f1Var.i((b2.p0) n0Var.get(0), j10);
        }
    }
}
