package w7;

import java.util.List;
public abstract class d9 {
    public static void a(z3.d dVar, int i10, e2.h hVar) {
        long d = dVar.d(i10);
        List f7 = dVar.f(d);
        if (!f7.isEmpty()) {
            if (i10 != dVar.g() - 1) {
                long d10 = dVar.d(i10 + 1) - dVar.d(i10);
                if (d10 > 0) {
                    hVar.accept(new z3.a(d, d10, f7));
                    return;
                }
                return;
            }
            throw new IllegalStateException();
        }
    }

    public static void b(z3.d r12, z3.l r13, e2.h r14) {
        throw new UnsupportedOperationException("Method not decompiled: w7.d9.b(z3.d, z3.l, e2.h):void");
    }
}
