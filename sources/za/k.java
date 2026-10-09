package za;

import android.util.Log;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;
public final class k implements i5.e, a2 {
    public final Object f54256a;

    public k(Object obj) {
        this.f54256a = obj;
    }

    @Override
    public Object apply(Object obj) {
        ((m2.t) this.f54256a).getClass();
        String T = d0.f54211b.T((c0) obj);
        kotlin.jvm.internal.i.d(T, "SessionEvents.SESSION_EVENT_ENCODER.encode(value)");
        Log.d("EventGDTLogger", "Session Event: ".concat(T));
        byte[] bytes = T.getBytes(yd.a.f52102a);
        kotlin.jvm.internal.i.d(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    @Override
    public void f(b2 b2Var, int i10) {
        ei.l lVar = (ei.l) this.f54256a;
        TL_bots.updateStarRefProgram updatestarrefprogram = new TL_bots.updateStarRefProgram();
        updatestarrefprogram.bot = lVar.getMessagesController().getInputUser(lVar.P);
        updatestarrefprogram.commission_permille = 0;
        b2 b2Var2 = new b2(lVar.getParentActivity(), 3, null);
        b2Var2.q(150L);
        lVar.getConnectionsManager().sendRequest(updatestarrefprogram, new ei.b(lVar, b2Var2, 0));
    }
}
