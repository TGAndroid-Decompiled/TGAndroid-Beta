package za;

import android.util.Log;
import m.y0;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.z1;
public final class k implements i5.e, z1 {
    public final Object f54481a;

    public k(Object obj) {
        this.f54481a = obj;
    }

    @Override
    public Object apply(Object obj) {
        ((y0) this.f54481a).getClass();
        String k02 = c0.f54426b.k0((b0) obj);
        kotlin.jvm.internal.i.d(k02, "SessionEvents.SESSION_EVENT_ENCODER.encode(value)");
        Log.d("EventGDTLogger", "Session Event: ".concat(k02));
        byte[] bytes = k02.getBytes(yd.a.f52326a);
        kotlin.jvm.internal.i.d(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    @Override
    public void f(a2 a2Var, int i10) {
        ei.l lVar = (ei.l) this.f54481a;
        TL_bots.updateStarRefProgram updatestarrefprogram = new TL_bots.updateStarRefProgram();
        updatestarrefprogram.bot = lVar.getMessagesController().getInputUser(lVar.P);
        updatestarrefprogram.commission_permille = 0;
        a2 a2Var2 = new a2(lVar.getParentActivity(), 3, null);
        a2Var2.q(150L);
        lVar.getConnectionsManager().sendRequest(updatestarrefprogram, new ei.b(lVar, a2Var2, 0));
    }
}
