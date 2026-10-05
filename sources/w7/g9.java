package w7;

import java.util.List;
public abstract class g9 {
    public static void a(z3.d dVar, int i10, e2.h hVar) {
        long m10 = dVar.m(i10);
        List z10 = dVar.z(m10);
        if (!z10.isEmpty()) {
            if (i10 != dVar.G() - 1) {
                long m11 = dVar.m(i10 + 1) - dVar.m(i10);
                if (m11 > 0) {
                    hVar.accept(new z3.a(m10, m11, z10));
                    return;
                }
                return;
            }
            throw new IllegalStateException();
        }
    }

    public static void b(z3.d r12, z3.l r13, e2.h r14) {
        throw new UnsupportedOperationException("Method not decompiled: w7.g9.b(z3.d, z3.l, e2.h):void");
    }
}
