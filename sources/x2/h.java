package x2;

import android.hardware.fingerprint.FingerprintManager;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import java.util.Set;
import org.telegram.messenger.GenericProvider;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ih1;
import xh.h4;
import yh.y3;
import za.c0;
import za.i0;
import za.m0;
public final class h implements d9.e, q9.d, a2, GenericProvider, Vector.TLDeserializer {
    public final int f45466a;

    public h(int i10) {
        this.f45466a = i10;
    }

    public static FingerprintManager a(Object obj) {
        return (FingerprintManager) obj;
    }

    @Override
    public Object G(cf.c cVar) {
        za.l m10getComponents$lambda0;
        i0 m11getComponents$lambda1;
        c0 m12getComponents$lambda2;
        bb.h m13getComponents$lambda3;
        za.s m14getComponents$lambda4;
        m0 m15getComponents$lambda5;
        switch (this.f45466a) {
            case 1:
                Set x10 = cVar.x(xa.a.class);
                xa.c cVar2 = xa.c.f46033c;
                if (cVar2 == null) {
                    synchronized (xa.c.class) {
                        try {
                            cVar2 = xa.c.f46033c;
                            if (cVar2 == null) {
                                cVar2 = new xa.c(0);
                                xa.c.f46033c = cVar2;
                            }
                        } finally {
                        }
                    }
                }
                return new xa.b(x10, cVar2);
            case 18:
                m10getComponents$lambda0 = FirebaseSessionsRegistrar.m10getComponents$lambda0(cVar);
                return m10getComponents$lambda0;
            case 19:
                m11getComponents$lambda1 = FirebaseSessionsRegistrar.m11getComponents$lambda1(cVar);
                return m11getComponents$lambda1;
            case 20:
                m12getComponents$lambda2 = FirebaseSessionsRegistrar.m12getComponents$lambda2(cVar);
                return m12getComponents$lambda2;
            case 21:
                m13getComponents$lambda3 = FirebaseSessionsRegistrar.m13getComponents$lambda3(cVar);
                return m13getComponents$lambda3;
            case 22:
                m14getComponents$lambda4 = FirebaseSessionsRegistrar.m14getComponents$lambda4(cVar);
                return m14getComponents$lambda4;
            default:
                m15getComponents$lambda5 = FirebaseSessionsRegistrar.m15getComponents$lambda5(cVar);
                return m15getComponents$lambda5;
        }
    }

    @Override
    public java.lang.Object apply(java.lang.Object r26) {
        throw new UnsupportedOperationException("Method not decompiled: x2.h.apply(java.lang.Object):java.lang.Object");
    }

    @Override
    public TLObject deserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
        return TLRPC.MessageReplyHeader.TLdeserialize(inputSerializedData, i10, z10);
    }

    @Override
    public void k(b2 b2Var, int i10) {
        switch (this.f45466a) {
            case 3:
                b2Var.dismiss();
                return;
            case 4:
                b2Var.dismiss();
                return;
            case 5:
            case 6:
            default:
                int i11 = y3.f48298q1;
                return;
            case 7:
                y3.d2(new ih1(6, null));
                return;
        }
    }

    @Override
    public Object provide(Object obj) {
        Integer num = (Integer) obj;
        int i10 = h4.f46187k0;
        return 0;
    }

    public h(y3 y3Var) {
        this.f45466a = 7;
    }
}
