package qf;

import java.util.logging.Logger;
import org.telegram.messenger.m6;
public final class g extends of.a {
    public static final Logger f53889s = Logger.getLogger(g.class.getName());
    public byte f53890r;

    public static boolean b(m mVar) {
        boolean z10;
        mVar.mark(3);
        try {
            if (mVar.read() == 73 && mVar.read() == 68) {
                if (mVar.read() == 51) {
                    z10 = true;
                    return z10;
                }
            }
            z10 = false;
            return z10;
        } finally {
            mVar.reset();
        }
    }

    public static m6 c(e eVar) {
        b b10 = eVar.b();
        eVar.c(3, b.ISO_8859_1);
        return new m6(eVar.d(200, b10), eVar.c((int) eVar.f53880a.e(), b10), false);
    }

    public static String e(e eVar) {
        return eVar.c((int) eVar.f53880a.e(), eVar.b());
    }

    public final void d(qf.e r12) {
        throw new UnsupportedOperationException("Method not decompiled: qf.g.d(qf.e):void");
    }
}
