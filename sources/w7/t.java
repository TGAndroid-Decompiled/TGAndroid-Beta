package w7;

import android.util.SparseBooleanArray;
public abstract class t {
    public static b2.x0 a(b2.x0 x0Var, b2.x0 x0Var2) {
        if (x0Var != null) {
            b2.q qVar = x0Var.f2440a;
            if (x0Var2 != null) {
                SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
                for (int i10 = 0; i10 < qVar.f2286a.size(); i10++) {
                    if (x0Var2.a(qVar.a(i10))) {
                        int a2 = qVar.a(i10);
                        e2.d.g(!false);
                        sparseBooleanArray.append(a2, true);
                    }
                }
                e2.d.g(!false);
                return new b2.x0(new b2.q(sparseBooleanArray));
            }
        }
        return b2.x0.f2438b;
    }

    public static void b(b2.b1 b1Var, m4.s sVar) {
        int i10 = sVar.f16109b;
        long j3 = sVar.f16110c;
        e9.i0 i0Var = sVar.f16108a;
        if (i10 == -1) {
            if (b1Var.m0(20)) {
                b1Var.I0(i0Var);
            } else if (!i0Var.isEmpty()) {
                b1Var.p0((b2.k0) i0Var.get(0));
            }
        } else if (b1Var.m0(20)) {
            b1Var.T(j3, sVar.f16109b, i0Var);
        } else if (!i0Var.isEmpty()) {
            b1Var.k((b2.k0) i0Var.get(0), j3);
        }
    }
}
