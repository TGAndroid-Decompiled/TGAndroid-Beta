package w7;

import java.util.List;
public abstract class a9 {
    public static void a(z3.e eVar, int i10, e2.j jVar) {
        long d = eVar.d(i10);
        List f7 = eVar.f(d);
        if (!f7.isEmpty()) {
            if (i10 != eVar.j() - 1) {
                long d10 = eVar.d(i10 + 1) - eVar.d(i10);
                if (d10 > 0) {
                    jVar.accept(new z3.b(d, d10, f7));
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
