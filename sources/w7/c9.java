package w7;

import java.util.List;
public abstract class c9 {
    public static void a(z3.d dVar, int i10, e2.h hVar) {
        long l4 = dVar.l(i10);
        List p5 = dVar.p(l4);
        if (!p5.isEmpty()) {
            if (i10 != dVar.w() - 1) {
                long l10 = dVar.l(i10 + 1) - dVar.l(i10);
                if (l10 > 0) {
                    hVar.accept(new z3.a(l4, l10, p5));
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
