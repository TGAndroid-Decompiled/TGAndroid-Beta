package w7;

import java.util.List;
public abstract class n5 {
    public static void a(z3.d dVar, int i10, e2.j jVar) {
        long e = dVar.e(i10);
        List g7 = dVar.g(e);
        if (!g7.isEmpty()) {
            if (i10 != dVar.k() - 1) {
                long e10 = dVar.e(i10 + 1) - dVar.e(i10);
                if (e10 > 0) {
                    jVar.accept(new z3.a(e, e10, g7));
                    return;
                }
                return;
            }
            throw new IllegalStateException();
        }
    }

    public static void b(z3.d r12, z3.l r13, e2.j r14) {
        throw new UnsupportedOperationException("Method not decompiled: w7.n5.b(z3.d, z3.l, e2.j):void");
    }
}
