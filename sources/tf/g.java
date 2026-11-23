package tf;

import java.util.logging.Logger;
public final class g extends rf.a {
    public static final Logger f57714s = Logger.getLogger(g.class.getName());
    public byte f57715r;

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

    public static f5.a c(e eVar) {
        b b10 = eVar.b();
        eVar.c(3, b.ISO_8859_1);
        return new f5.a(4, eVar.d(200, b10), eVar.c((int) eVar.f57705a.e(), b10));
    }

    public static String e(e eVar) {
        return eVar.c((int) eVar.f57705a.e(), eVar.b());
    }

    public final void d(tf.e r12) {
        throw new UnsupportedOperationException("Method not decompiled: tf.g.d(tf.e):void");
    }
}
