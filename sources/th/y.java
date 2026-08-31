package th;

import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.eo0;
import org.telegram.ui.l10;
import org.telegram.ui.s10;
public final class y implements s10 {
    public final i0 f48199a;

    public y(i0 i0Var) {
        this.f48199a = i0Var;
    }

    @Override
    public final boolean b(l10 l10Var) {
        return false;
    }

    @Override
    public final void c(MessageObject messageObject) {
        int i10;
        i0 i0Var = this.f48199a;
        p2 p2Var = i0Var.f48138s;
        i10 = ((h3) i0Var).currentAccount;
        p2Var.presentFragment(eo0.K(messageObject, i10));
        i0Var.dismiss();
    }

    @Override
    public final boolean f() {
        return false;
    }

    @Override
    public final void a() {
    }

    @Override
    public final void d(MessageObject messageObject, View view, int i10) {
    }
}
