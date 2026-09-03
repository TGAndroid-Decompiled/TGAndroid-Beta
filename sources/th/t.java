package th;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.d20;
public final class t implements Runnable {
    public final int f48230a;
    public final i0 f48231b;

    public t(i0 i0Var, int i10) {
        this.f48230a = i10;
        this.f48231b = i0Var;
    }

    @Override
    public final void run() {
        switch (this.f48230a) {
            case 0:
                i0 i0Var = this.f48231b;
                i0Var.v.d.U2.h1(1, i0Var.R.f7758b);
                i0Var.f48168b.a(false, true);
                i0Var.setAllowNestedScroll(true);
                d20 d20Var = i0Var.f48177y;
                AndroidUtilities.hideKeyboard(d20Var.f26132r);
                d20Var.f26132r.clearFocus();
                return;
            case 1:
                i0 i0Var2 = this.f48231b;
                i0Var2.f48176x.d.U2.h1(1, i0Var2.R.f7758b);
                i0Var2.f48169c.a(false, true);
                i0Var2.setAllowNestedScroll(true);
                d20 d20Var2 = i0Var2.B;
                AndroidUtilities.hideKeyboard(d20Var2.f26132r);
                d20Var2.f26132r.clearFocus();
                return;
            default:
                i0 i0Var3 = this.f48231b;
                i0Var3.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", i0Var3.f48170e);
                i0Var3.f48174s.presentFragment(new n(bundle));
                i0Var3.dismiss();
                return;
        }
    }
}
