package xe;

import java.util.logging.Logger;
public final class h extends ve.a {
    public static final Logger f47001s = Logger.getLogger(h.class.getName());
    public byte f47002r;

    public static boolean b(n nVar) {
        boolean z4;
        nVar.mark(3);
        try {
            if (nVar.read() == 73 && nVar.read() == 68) {
                if (nVar.read() == 51) {
                    z4 = true;
                    return z4;
                }
            }
            z4 = false;
            return z4;
        } finally {
            nVar.reset();
        }
    }

    public static b6.h c(f fVar) {
        c b10 = fVar.b();
        fVar.c(3, c.ISO_8859_1);
        return new b6.h(5, fVar.d(200, b10), fVar.c((int) fVar.f46993a.e(), b10));
    }

    public static String e(f fVar) {
        return fVar.c((int) fVar.f46993a.e(), fVar.b());
    }

    public final void d(xe.f r12) {
        throw new UnsupportedOperationException("Method not decompiled: xe.h.d(xe.f):void");
    }
}
