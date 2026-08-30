package sh;

import android.view.View;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.i51;
import org.telegram.ui.web.u1;
public final class c implements Utilities.Callback5, Utilities.Callback5Return, MessagesStorage.StringCallback {
    public final g f44324a;

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        i51 i51Var = (i51) obj;
        View view = (View) obj2;
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        this.f44324a.getClass();
        return Boolean.FALSE;
    }

    @Override
    public void mo28run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        g.U(this.f44324a, (i51) obj);
    }

    @Override
    public void run(String str) {
        g gVar = this.f44324a;
        gVar.getMessagesController().getChat(Long.valueOf(-gVar.f44339a));
        gVar.showDialog(new uh.a(gVar.getParentActivity(), null, gVar.f44339a, new u1(15, gVar, str)));
    }
}
