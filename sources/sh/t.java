package sh;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.c20;
public final class t implements Runnable {
    public final int f44412a;
    public final i0 f44413b;

    public t(i0 i0Var, int i10) {
        this.f44412a = i10;
        this.f44413b = i0Var;
    }

    @Override
    public final void run() {
        switch (this.f44412a) {
            case 0:
                i0 i0Var = this.f44413b;
                i0Var.v.d.U2.h1(1, i0Var.R.f7214b);
                i0Var.f44351b.a(false, true);
                i0Var.setAllowNestedScroll(true);
                c20 c20Var = i0Var.f44359y;
                AndroidUtilities.hideKeyboard(c20Var.f23815r);
                c20Var.f23815r.clearFocus();
                return;
            case 1:
                i0 i0Var2 = this.f44413b;
                i0Var2.f44358x.d.U2.h1(1, i0Var2.R.f7214b);
                i0Var2.f44352c.a(false, true);
                i0Var2.setAllowNestedScroll(true);
                c20 c20Var2 = i0Var2.B;
                AndroidUtilities.hideKeyboard(c20Var2.f23815r);
                c20Var2.f23815r.clearFocus();
                return;
            default:
                i0 i0Var3 = this.f44413b;
                i0Var3.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", i0Var3.e);
                i0Var3.f44356s.presentFragment(new n(bundle));
                i0Var3.dismiss();
                return;
        }
    }
}
