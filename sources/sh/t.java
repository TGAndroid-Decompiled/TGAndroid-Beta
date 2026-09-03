package sh;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.d20;
public final class t implements Runnable {
    public final int f44474a;
    public final i0 f44475b;

    public t(i0 i0Var, int i10) {
        this.f44474a = i10;
        this.f44475b = i0Var;
    }

    @Override
    public final void run() {
        switch (this.f44474a) {
            case 0:
                i0 i0Var = this.f44475b;
                i0Var.v.d.U2.h1(1, i0Var.R.f7197b);
                i0Var.f44416b.a(false, true);
                i0Var.setAllowNestedScroll(true);
                d20 d20Var = i0Var.f44424y;
                AndroidUtilities.hideKeyboard(d20Var.f24117r);
                d20Var.f24117r.clearFocus();
                return;
            case 1:
                i0 i0Var2 = this.f44475b;
                i0Var2.f44423x.d.U2.h1(1, i0Var2.R.f7197b);
                i0Var2.f44417c.a(false, true);
                i0Var2.setAllowNestedScroll(true);
                d20 d20Var2 = i0Var2.B;
                AndroidUtilities.hideKeyboard(d20Var2.f24117r);
                d20Var2.f24117r.clearFocus();
                return;
            default:
                i0 i0Var3 = this.f44475b;
                i0Var3.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", i0Var3.e);
                i0Var3.f44421s.presentFragment(new n(bundle));
                i0Var3.dismiss();
                return;
        }
    }
}
