package th;

import android.view.View;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.h51;
import r0.m1;
public final class k implements Utilities.Callback5, Utilities.Callback5Return, r0.o, MessagesStorage.BooleanCallback {
    public final n f48183a;

    public k(n nVar) {
        this.f48183a = nVar;
    }

    @Override
    public m1 M0(View view, m1 m1Var) {
        i0.b f10 = m1Var.f46483a.f(519);
        this.f48183a.d.setPadding(0, f10.f7758b, 0, f10.d);
        return m1.f46482b;
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        return Boolean.valueOf(n.U(this.f48183a, (h51) obj, (View) obj2));
    }

    @Override
    public void mo27run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        n.V(this.f48183a, (h51) obj);
    }

    @Override
    public void run(boolean z4) {
        n nVar = this.f48183a;
        nVar.finishFragment();
        nVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(-nVar.f48189b), null, nVar.E, Boolean.valueOf(z4));
    }
}
