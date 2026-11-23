package ug;

import android.view.View;
import org.telegram.ui.Components.sj0;
import org.telegram.ui.PremiumPreviewFragment;
public final class w implements org.telegram.ui.ActionBar.q1, sj0 {
    public final int f58935a;
    public final k0 f58936b;

    public w(k0 k0Var, int i7) {
        this.f58935a = i7;
        this.f58936b = k0Var;
    }

    @Override
    public boolean c(int i7, View view) {
        k0 k0Var = this.f58936b;
        k0Var.f39487o1.getOnItemClickListener().c(i7, view);
        if (k0Var.d2 != 19) {
            try {
                view.performHapticFeedback(0);
            } catch (Exception unused) {
            }
        }
        return false;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f58935a) {
            case 0:
                k0 k0Var = this.f58936b;
                k0Var.G2.presentFragment(new PremiumPreviewFragment(0, null));
                k0Var.dismiss();
                t1Var.dismiss();
                return;
            default:
                t1Var.dismiss();
                this.f58936b.j1();
                return;
        }
    }
}
