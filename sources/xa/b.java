package xa;

import ci.u5;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import d9.e;
import e2.h;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import org.telegram.messenger.GenericProvider;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ih1;
import xh.h4;
import yh.s3;
public final class b implements q9.d, a2, GenericProvider, h, Vector.TLDeserializer, e {
    public final int f51102a;

    public b(int i10) {
        this.f51102a = i10;
    }

    @Override
    public void accept(Object obj) {
        ((ExecutorService) obj).shutdown();
    }

    @Override
    public java.lang.Object apply(java.lang.Object r26) {
        throw new UnsupportedOperationException("Method not decompiled: xa.b.apply(java.lang.Object):java.lang.Object");
    }

    @Override
    public TLObject deserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
        return TLRPC.MessageReplyHeader.TLdeserialize(inputSerializedData, i10, z10);
    }

    @Override
    public void f(b2 b2Var, int i10) {
        switch (this.f51102a) {
            case 1:
                b2Var.dismiss();
                return;
            case 2:
                b2Var.dismiss();
                return;
            case 6:
                s3.e2(new ih1(6, null));
                return;
            default:
                int i11 = s3.f53158r1;
                return;
        }
    }

    @Override
    public Object provide(Object obj) {
        Integer num = (Integer) obj;
        int i10 = h4.f51267k0;
        return 0;
    }

    @Override
    public Object y0(u5 u5Var) {
        switch (this.f51102a) {
            case 0:
                Set y3 = u5Var.y(a.class);
                d dVar = d.f51105c;
                if (dVar == null) {
                    synchronized (d.class) {
                        try {
                            dVar = d.f51105c;
                            if (dVar == null) {
                                dVar = new d(0);
                                d.f51105c = dVar;
                            }
                        } finally {
                        }
                    }
                }
                return new c(y3, dVar);
            case 17:
                return FirebaseSessionsRegistrar.e(u5Var);
            case 18:
                return FirebaseSessionsRegistrar.f(u5Var);
            case 19:
                return FirebaseSessionsRegistrar.a(u5Var);
            case 20:
                return FirebaseSessionsRegistrar.b(u5Var);
            case 21:
                return FirebaseSessionsRegistrar.d(u5Var);
            default:
                return FirebaseSessionsRegistrar.c(u5Var);
        }
    }
}
