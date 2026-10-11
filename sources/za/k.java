package za;

import android.util.Log;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.z1;
public final class k implements i5.e, z1 {
    public final Object f54344a;

    public k(Object obj) {
        this.f54344a = obj;
    }

    @Override
    public Object apply(Object obj) {
        ((m2.t) this.f54344a).getClass();
        String T = c0.f54289b.T((b0) obj);
        kotlin.jvm.internal.i.d(T, "SessionEvents.SESSION_EVENT_ENCODER.encode(value)");
        Log.d("EventGDTLogger", "Session Event: ".concat(T));
        byte[] bytes = T.getBytes(yd.a.f52189a);
        kotlin.jvm.internal.i.d(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    @Override
    public void f(a2 a2Var, int i10) {
        ei.l lVar = (ei.l) this.f54344a;
        TL_bots.updateStarRefProgram updatestarrefprogram = new TL_bots.updateStarRefProgram();
        updatestarrefprogram.bot = lVar.getMessagesController().getInputUser(lVar.P);
        updatestarrefprogram.commission_permille = 0;
        a2 a2Var2 = new a2(lVar.getParentActivity(), 3, null);
        a2Var2.q(150L);
        lVar.getConnectionsManager().sendRequest(updatestarrefprogram, new ei.b(lVar, a2Var2, 0));
    }
}
