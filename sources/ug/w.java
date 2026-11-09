package ug;

import android.view.View;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.Components.ej0;
import org.telegram.ui.PremiumPreviewFragment;
public final class w implements org.telegram.ui.ActionBar.r1, ej0 {
    public final int f56854a;
    public final i0 f56855b;

    public w(i0 i0Var, int i7) {
        this.f56854a = i7;
        this.f56855b = i0Var;
    }

    @Override
    public boolean c(int i7, View view) {
        i0 i0Var = this.f56855b;
        i0Var.f36303k1.getOnItemClickListener().c(i7, view);
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
        switch (this.f56854a) {
            case 0:
                i0 i0Var = this.f56855b;
                i0Var.C2.presentFragment(new PremiumPreviewFragment(0, null));
                i0Var.dismiss();
                u1Var.dismiss();
                return;
            default:
                u1Var.dismiss();
                this.f56855b.i1();
                return;
        }
    }
}
