package sh;

import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.ActionBar.g3;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.do0;
import org.telegram.ui.l10;
import org.telegram.ui.s10;
public final class y implements s10 {
    public final i0 f44417a;

    public y(i0 i0Var) {
        this.f44417a = i0Var;
    }

    @Override
    public final boolean b(l10 l10Var) {
        return false;
    }

    @Override
    public final void c(MessageObject messageObject) {
        int i10;
        i0 i0Var = this.f44417a;
        p2 p2Var = i0Var.f44356s;
        i10 = ((g3) i0Var).currentAccount;
        p2Var.presentFragment(do0.K(messageObject, i10));
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
