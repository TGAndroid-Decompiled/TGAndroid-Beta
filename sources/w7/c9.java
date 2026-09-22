package w7;

import java.util.List;
public abstract class c9 {
    public static void a(z3.e eVar, int i10, e2.h hVar) {
        long g10 = eVar.g(i10);
        List l4 = eVar.l(g10);
        if (!l4.isEmpty()) {
            if (i10 != eVar.A() - 1) {
                long g11 = eVar.g(i10 + 1) - eVar.g(i10);
                if (g11 > 0) {
                    hVar.accept(new z3.b(g10, g11, l4));
                    return;
                }
                return;
            }
            throw new IllegalStateException();
        }
    }

    public static void b(z3.e r12, z3.m r13, e2.h r14) {
        throw new UnsupportedOperationException("Method not decompiled: w7.c9.b(z3.e, z3.m, e2.h):void");
    }
}
