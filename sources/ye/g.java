package ye;

import java.util.logging.Logger;
public final class g extends we.a {
    public static final Logger f50908s = Logger.getLogger(g.class.getName());
    public byte f50909r;

    public static boolean b(m mVar) {
        boolean z4;
        mVar.mark(3);
        try {
            if (mVar.read() == 73 && mVar.read() == 68) {
                if (mVar.read() == 51) {
                    z4 = true;
                    return z4;
                }
            }
            z4 = false;
            return z4;
        } finally {
            mVar.reset();
        }
    }

    public static b6.h c(e eVar) {
        b b10 = eVar.b();
        eVar.c(3, b.ISO_8859_1);
        return new b6.h(5, eVar.d(200, b10), eVar.c((int) eVar.f50899a.e(), b10));
    }

    public static String e(e eVar) {
        return eVar.c((int) eVar.f50899a.e(), eVar.b());
    }

    public final void d(ye.e r12) {
        throw new UnsupportedOperationException("Method not decompiled: ye.g.d(ye.e):void");
    }
}
