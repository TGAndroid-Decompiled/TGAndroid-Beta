package sh;

import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.ActionBar.g3;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.co0;
import org.telegram.ui.m10;
import org.telegram.ui.t10;
public final class y implements t10 {
    public final i0 f44479a;

    public y(i0 i0Var) {
        this.f44479a = i0Var;
    }

    @Override
    public final boolean b(m10 m10Var) {
        return false;
    }

    @Override
    public final void c(MessageObject messageObject) {
        int i10;
        i0 i0Var = this.f44479a;
        p2 p2Var = i0Var.f44421s;
        i10 = ((g3) i0Var).currentAccount;
        p2Var.presentFragment(co0.K(messageObject, i10));
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
