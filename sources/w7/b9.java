package w7;

import java.util.List;
public abstract class b9 {
    public static void a(z3.d dVar, int i10, e2.j jVar) {
        long d = dVar.d(i10);
        List e = dVar.e(d);
        if (!e.isEmpty()) {
            if (i10 != dVar.i() - 1) {
                long d10 = dVar.d(i10 + 1) - dVar.d(i10);
                if (d10 > 0) {
                    jVar.accept(new z3.a(d, d10, e));
                    return;
                }
                return;
            }
            throw new IllegalStateException();
        }
    }

    public static void b(z3.d r12, z3.l r13, e2.j r14) {
        throw new UnsupportedOperationException("Method not decompiled: w7.b9.b(z3.d, z3.l, e2.j):void");
    }
}
