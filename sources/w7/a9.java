package w7;

import java.util.List;
public abstract class a9 {
    public static void a(z3.e eVar, int i10, e2.j jVar) {
        long h = eVar.h(i10);
        List o10 = eVar.o(h);
        if (!o10.isEmpty()) {
            if (i10 != eVar.u() - 1) {
                long h10 = eVar.h(i10 + 1) - eVar.h(i10);
                if (h10 > 0) {
                    jVar.accept(new z3.b(h, h10, o10));
                    return;
                }
                return;
            }
            throw new IllegalStateException();
        }
    }

    public static void b(z3.e r12, z3.m r13, e2.j r14) {
        throw new UnsupportedOperationException("Method not decompiled: w7.a9.b(z3.e, z3.m, e2.j):void");
    }
}
