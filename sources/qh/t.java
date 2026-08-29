package qh;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.x10;
public final class t implements Runnable {
    public final int f46778a;
    public final i0 f46779b;

    public t(i0 i0Var, int i10) {
        this.f46778a = i10;
        this.f46779b = i0Var;
    }

    @Override
    public final void run() {
        switch (this.f46778a) {
            case 0:
                i0 i0Var = this.f46779b;
                i0Var.v.d.T2.h1(1, i0Var.Q.f8187b);
                i0Var.f46713b.a(false, true);
                i0Var.setAllowNestedScroll(true);
                x10 x10Var = i0Var.f46722y;
                AndroidUtilities.hideKeyboard(x10Var.f34546r);
                x10Var.f34546r.clearFocus();
                return;
            case 1:
                i0 i0Var2 = this.f46779b;
                i0Var2.f46721x.d.T2.h1(1, i0Var2.Q.f8187b);
                i0Var2.f46714c.a(false, true);
                i0Var2.setAllowNestedScroll(true);
                x10 x10Var2 = i0Var2.A;
                AndroidUtilities.hideKeyboard(x10Var2.f34546r);
                x10Var2.f34546r.clearFocus();
                return;
            default:
                i0 i0Var3 = this.f46779b;
                i0Var3.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", i0Var3.f46715e);
                i0Var3.f46719s.presentFragment(new n(bundle));
                i0Var3.dismiss();
                return;
        }
    }
}
