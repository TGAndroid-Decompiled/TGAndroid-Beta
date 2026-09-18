package yf;

import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.gh1;
import yh.y3;
public final class q implements Vector.TLDeserializer, a2, d9.e, q9.d {
    public final int f47107a;

    public q(int i10) {
        this.f47107a = i10;
    }

    @Override
    public Object G(cf.c cVar) {
        switch (this.f47107a) {
            case 12:
                return FirebaseSessionsRegistrar.e(cVar);
            case 13:
                return FirebaseSessionsRegistrar.f(cVar);
            case 14:
                return FirebaseSessionsRegistrar.a(cVar);
            case 15:
                return FirebaseSessionsRegistrar.b(cVar);
            case 16:
                return FirebaseSessionsRegistrar.d(cVar);
            default:
                return FirebaseSessionsRegistrar.c(cVar);
        }
    }

    @Override
    public java.lang.Object apply(java.lang.Object r26) {
        throw new UnsupportedOperationException("Method not decompiled: yf.q.apply(java.lang.Object):java.lang.Object");
    }

    @Override
    public TLObject deserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
        return TLRPC.MessageReplyHeader.TLdeserialize(inputSerializedData, i10, z10);
    }

    @Override
    public void f(b2 b2Var, int i10) {
        switch (this.f47107a) {
            case 1:
                y3.d2(new gh1(6, null));
                return;
            default:
                int i11 = y3.f48255q1;
                return;
        }
    }

    public q(y3 y3Var) {
        this.f47107a = 1;
    }
}
