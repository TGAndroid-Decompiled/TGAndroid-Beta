package w7;

import java.util.List;
public abstract class c9 {
    public static void a(z3.d dVar, int i10, e2.h hVar) {
        long e7 = dVar.e(i10);
        List h = dVar.h(e7);
        if (!h.isEmpty()) {
            if (i10 != dVar.k() - 1) {
                long e10 = dVar.e(i10 + 1) - dVar.e(i10);
                if (e10 > 0) {
                    hVar.accept(new z3.a(e7, e10, h));
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
