package ya;

import com.google.android.gms.internal.cast.z5;
import d9.k;
import java.util.Set;
import org.telegram.messenger.GenericProvider;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;
import yh.f4;
public final class b implements r9.d, a2, GenericProvider, k, Vector.TLDeserializer {
    public final int f50116a;

    public b(int i10) {
        this.f50116a = i10;
    }

    @Override
    public java.lang.Object apply(java.lang.Object r26) {
        throw new UnsupportedOperationException("Method not decompiled: ya.b.apply(java.lang.Object):java.lang.Object");
    }

    @Override
    public TLObject deserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
        return TLRPC.MessageReplyHeader.TLdeserialize(inputSerializedData, i10, z10);
    }

    @Override
    public void g(b2 b2Var, int i10) {
        switch (this.f50116a) {
            case 1:
                b2Var.dismiss();
                return;
            default:
                b2Var.dismiss();
                return;
        }
    }

    @Override
    public Object j2(z5 z5Var) {
        Set y3 = z5Var.y(a.class);
        d dVar = d.f50119c;
        if (dVar == null) {
            synchronized (d.class) {
                try {
                    dVar = d.f50119c;
                    if (dVar == null) {
                        dVar = new d();
                        d.f50119c = dVar;
                    }
                } finally {
                }
            }
        }
        return new c(y3, dVar);
    }

    @Override
    public Object provide(Object obj) {
        Integer num = (Integer) obj;
        int i10 = f4.f50239k0;
        return 0;
    }
}
