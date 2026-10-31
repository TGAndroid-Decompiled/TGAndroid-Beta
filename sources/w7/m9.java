package w7;

import java.util.List;
public abstract class m9 {
    public static void a(z3.d dVar, int i10, e2.j jVar) {
        long g10 = dVar.g(i10);
        List p5 = dVar.p(g10);
        if (!p5.isEmpty()) {
            if (i10 != dVar.s() - 1) {
                long g11 = dVar.g(i10 + 1) - dVar.g(i10);
                if (g11 > 0) {
                    jVar.accept(new z3.a(g10, g11, p5));
                    return;
                }
                return;
            }
            throw new IllegalStateException();
        }
    }

    public static void b(z3.d r12, z3.l r13, e2.j r14) {
        throw new UnsupportedOperationException("Method not decompiled: w7.m9.b(z3.d, z3.l, e2.j):void");
    }
}
