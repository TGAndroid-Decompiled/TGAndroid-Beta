package za;

import android.util.Log;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.Cells.ja;
public final class k implements i5.e, a2 {
    public final Object f48748a;

    public k(Object obj) {
        this.f48748a = obj;
    }

    @Override
    public Object apply(Object obj) {
        ((ja) this.f48748a).getClass();
        String e = d0.f48708b.e((c0) obj);
        kotlin.jvm.internal.i.d(e, "SessionEvents.SESSION_EVENT_ENCODER.encode(value)");
        Log.d("EventGDTLogger", "Session Event: ".concat(e));
        byte[] bytes = e.getBytes(xd.a.f45692a);
        kotlin.jvm.internal.i.d(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    @Override
    public void f(b2 b2Var, int i10) {
        ei.l lVar = (ei.l) this.f48748a;
        TL_bots.updateStarRefProgram updatestarrefprogram = new TL_bots.updateStarRefProgram();
        updatestarrefprogram.bot = lVar.getMessagesController().getInputUser(lVar.P);
        updatestarrefprogram.commission_permille = 0;
        b2 b2Var2 = new b2(lVar.getParentActivity(), 3, null);
        b2Var2.q(150L);
        lVar.getConnectionsManager().sendRequest(updatestarrefprogram, new ei.b(lVar, b2Var2, 0));
    }
}
