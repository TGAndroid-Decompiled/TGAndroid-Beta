package th;

import android.view.View;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.h51;
import org.telegram.ui.web.a2;
public final class c implements Utilities.Callback5, Utilities.Callback5Return, MessagesStorage.StringCallback {
    public final g f48138a;

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        h51 h51Var = (h51) obj;
        View view = (View) obj2;
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        this.f48138a.getClass();
        return Boolean.FALSE;
    }

    @Override
    public void mo27run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        g.U(this.f48138a, (h51) obj);
    }

    @Override
    public void run(String str) {
        g gVar = this.f48138a;
        gVar.getMessagesController().getChat(Long.valueOf(-gVar.f48155a));
        gVar.showDialog(new vh.a(gVar.getParentActivity(), null, gVar.f48155a, new a2(14, gVar, str)));
    }
}
