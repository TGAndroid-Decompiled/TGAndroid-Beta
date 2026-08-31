package th;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.d20;
public final class t implements Runnable {
    public final int f48194a;
    public final i0 f48195b;

    public t(i0 i0Var, int i10) {
        this.f48194a = i10;
        this.f48195b = i0Var;
    }

    @Override
    public final void run() {
        switch (this.f48194a) {
            case 0:
                i0 i0Var = this.f48195b;
                i0Var.v.d.U2.h1(1, i0Var.R.f7758b);
                i0Var.f48132b.a(false, true);
                i0Var.setAllowNestedScroll(true);
                d20 d20Var = i0Var.f48141y;
                AndroidUtilities.hideKeyboard(d20Var.f26172r);
                d20Var.f26172r.clearFocus();
                return;
            case 1:
                i0 i0Var2 = this.f48195b;
                i0Var2.f48140x.d.U2.h1(1, i0Var2.R.f7758b);
                i0Var2.f48133c.a(false, true);
                i0Var2.setAllowNestedScroll(true);
                d20 d20Var2 = i0Var2.B;
                AndroidUtilities.hideKeyboard(d20Var2.f26172r);
                d20Var2.f26172r.clearFocus();
                return;
            default:
                i0 i0Var3 = this.f48195b;
                i0Var3.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", i0Var3.f48134e);
                i0Var3.f48138s.presentFragment(new n(bundle));
                i0Var3.dismiss();
                return;
        }
    }
}
