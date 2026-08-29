package qh;

import android.view.View;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.w41;
import org.telegram.ui.yu0;
public final class c implements Utilities.Callback5, Utilities.Callback5Return, MessagesStorage.StringCallback {
    public final g f46683a;

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        w41 w41Var = (w41) obj;
        View view = (View) obj2;
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        this.f46683a.getClass();
        return Boolean.FALSE;
    }

    @Override
    public void mo19run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        g.U(this.f46683a, (w41) obj);
    }

    @Override
    public void run(String str) {
        g gVar = this.f46683a;
        gVar.getMessagesController().getChat(Long.valueOf(-gVar.f46700a));
        gVar.showDialog(new sh.a(gVar.getParentActivity(), null, gVar.f46700a, new yu0(15, gVar, str)));
    }
}
