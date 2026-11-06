package ug;

import android.view.View;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.Components.dj0;
import org.telegram.ui.PremiumPreviewFragment;
public final class w implements org.telegram.ui.ActionBar.r1, dj0 {
    public final int f56749a;
    public final i0 f56750b;

    public w(i0 i0Var, int i7) {
        this.f56749a = i7;
        this.f56750b = i0Var;
    }

    @Override
    public boolean c(int i7, View view) {
        i0 i0Var = this.f56750b;
        i0Var.f36261k1.getOnItemClickListener().c(i7, view);
        if (i0Var.Z1 != 19) {
            try {
                view.performHapticFeedback(0);
            } catch (Exception unused) {
            }
        }
        return false;
    }

    @Override
    public void g(u1 u1Var, int i7) {
        switch (this.f56749a) {
            case 0:
                i0 i0Var = this.f56750b;
                i0Var.C2.presentFragment(new PremiumPreviewFragment(0, null));
                i0Var.dismiss();
                u1Var.dismiss();
                return;
            default:
                u1Var.dismiss();
                this.f56750b.i1();
                return;
        }
    }
}
