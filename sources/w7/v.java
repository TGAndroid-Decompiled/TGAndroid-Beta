package w7;

import android.util.SparseBooleanArray;
public abstract class v {
    public static b2.b1 a(b2.b1 b1Var, b2.b1 b1Var2) {
        if (b1Var != null) {
            b2.u uVar = b1Var.f3707a;
            if (b1Var2 != null) {
                SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
                for (int i10 = 0; i10 < uVar.f4059a.size(); i10++) {
                    if (b1Var2.a(uVar.a(i10))) {
                        int a2 = uVar.a(i10);
                        v7.u6.p(!false);
                        sparseBooleanArray.append(a2, true);
                    }
                }
                v7.u6.p(!false);
                return new b2.b1(new b2.u(sparseBooleanArray));
            }
        }
        return b2.b1.f3705b;
    }

    public static void b(b2.f1 f1Var, m4.w wVar) {
        int i10 = wVar.f16826b;
        long j10 = wVar.f16827c;
        e9.n0 n0Var = wVar.f16825a;
        if (i10 == -1) {
            if (f1Var.o0(20)) {
                f1Var.L0(n0Var);
            } else if (!n0Var.isEmpty()) {
                f1Var.l0((b2.o0) n0Var.get(0));
            }
        } else if (f1Var.o0(20)) {
            f1Var.S(j10, wVar.f16826b, n0Var);
        } else if (!n0Var.isEmpty()) {
            f1Var.k((b2.o0) n0Var.get(0), j10);
        }
    }
}
