package qh;

import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.tn0;
import org.telegram.ui.g10;
import org.telegram.ui.z00;
public final class y implements g10 {
    public final i0 f46783a;

    public y(i0 i0Var) {
        this.f46783a = i0Var;
    }

    @Override
    public final boolean b(z00 z00Var) {
        return false;
    }

    @Override
    public final void c(MessageObject messageObject) {
        int i10;
        i0 i0Var = this.f46783a;
        o2 o2Var = i0Var.f46719s;
        i10 = ((f3) i0Var).currentAccount;
        o2Var.presentFragment(tn0.K(messageObject, i10));
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
