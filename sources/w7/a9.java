package w7;

import java.util.List;
public abstract class a9 {
    public static void a(z3.d dVar, int i10, e2.j jVar) {
        long k10 = dVar.k(i10);
        List r10 = dVar.r(k10);
        if (!r10.isEmpty()) {
            if (i10 != dVar.v() - 1) {
                long k11 = dVar.k(i10 + 1) - dVar.k(i10);
                if (k11 > 0) {
                    jVar.accept(new z3.a(k10, k11, r10));
                    return;
                }
                return;
            }
            throw new IllegalStateException();
        }
    }

    public static void b(z3.d r12, z3.l r13, e2.j r14) {
        throw new UnsupportedOperationException("Method not decompiled: w7.a9.b(z3.d, z3.l, e2.j):void");
    }
}
