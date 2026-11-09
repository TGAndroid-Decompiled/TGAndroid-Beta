package tf;

import java.util.logging.Logger;
public final class g extends rf.a {
    public static final Logger f55548s = Logger.getLogger(g.class.getName());
    public byte f55549r;

    public static boolean b(m mVar) {
        boolean z9;
        mVar.mark(3);
        try {
            if (mVar.read() == 73 && mVar.read() == 68) {
                if (mVar.read() == 51) {
                    z9 = true;
                    return z9;
                }
            }
            z9 = false;
            return z9;
        } finally {
            mVar.reset();
        }
    }

    public static f5.a c(e eVar) {
        b b10 = eVar.b();
        eVar.c(3, b.ISO_8859_1);
        return new f5.a(eVar.d(200, b10), eVar.c((int) eVar.f55539a.e(), b10), false);
    }

    public static String e(e eVar) {
        return eVar.c((int) eVar.f55539a.e(), eVar.b());
    }

    public final void d(tf.e r12) {
        throw new UnsupportedOperationException("Method not decompiled: tf.g.d(tf.e):void");
    }
}
