package vg;

import android.view.View;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.PremiumPreviewFragment;
public final class w implements org.telegram.ui.ActionBar.p1, hj0 {
    public final int f56889a;
    public final i0 f56890b;

    public w(i0 i0Var, int i3) {
        this.f56889a = i3;
        this.f56890b = i0Var;
    }

    @Override
    public boolean f(int i3, View view) {
        i0 i0Var = this.f56890b;
        i0Var.f36102l1.getOnItemClickListener().f(i3, view);
        if (i0Var.f56651a2 != 19) {
            try {
                view.performHapticFeedback(0);
            } catch (Exception unused) {
            }
        }
        return false;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        switch (this.f56889a) {
            case 0:
                i0 i0Var = this.f56890b;
                i0Var.D2.presentFragment(new PremiumPreviewFragment(0, null));
                i0Var.dismiss();
                s1Var.dismiss();
                return;
            default:
                s1Var.dismiss();
                this.f56890b.i1();
                return;
        }
    }
}
