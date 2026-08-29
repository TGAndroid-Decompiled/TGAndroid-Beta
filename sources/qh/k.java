package qh;

import android.view.View;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.w41;
import r0.m1;
public final class k implements Utilities.Callback5, Utilities.Callback5Return, r0.o, MessagesStorage.BooleanCallback {
    public final n f46728a;

    public k(n nVar) {
        this.f46728a = nVar;
    }

    @Override
    public m1 I0(View view, m1 m1Var) {
        i0.b f9 = m1Var.f46843a.f(519);
        this.f46728a.d.setPadding(0, f9.f8187b, 0, f9.d);
        return m1.f46842b;
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        return Boolean.valueOf(n.U(this.f46728a, (w41) obj, (View) obj2));
    }

    @Override
    public void mo19run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        n.V(this.f46728a, (w41) obj);
    }

    @Override
    public void run(boolean z10) {
        n nVar = this.f46728a;
        nVar.finishFragment();
        nVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(-nVar.f46737b), null, nVar.D, Boolean.valueOf(z10));
    }
}
