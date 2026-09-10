package w7;

import java.util.List;
public abstract class c9 {
    public static void a(z3.d dVar, int i10, e2.h hVar) {
        long g10 = dVar.g(i10);
        List q6 = dVar.q(g10);
        if (!q6.isEmpty()) {
            if (i10 != dVar.u() - 1) {
                long g11 = dVar.g(i10 + 1) - dVar.g(i10);
                if (g11 > 0) {
                    hVar.accept(new z3.a(g10, g11, q6));
                    return;
                }
                return;
            }
            throw new IllegalStateException();
        }
    }

    public static void b(z3.d r12, z3.l r13, e2.h r14) {
        throw new UnsupportedOperationException("Method not decompiled: w7.c9.b(z3.d, z3.l, e2.h):void");
    }
}
