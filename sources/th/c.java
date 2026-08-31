package th;

import android.view.View;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.j51;
import org.telegram.ui.web.v1;
public final class c implements Utilities.Callback5, Utilities.Callback5Return, MessagesStorage.StringCallback {
    public final g f48102a;

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        j51 j51Var = (j51) obj;
        View view = (View) obj2;
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        this.f48102a.getClass();
        return Boolean.FALSE;
    }

    @Override
    public void mo27run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        g.U(this.f48102a, (j51) obj);
    }

    @Override
    public void run(String str) {
        g gVar = this.f48102a;
        gVar.getMessagesController().getChat(Long.valueOf(-gVar.f48119a));
        gVar.showDialog(new vh.a(gVar.getParentActivity(), null, gVar.f48119a, new v1(15, gVar, str)));
    }
}
