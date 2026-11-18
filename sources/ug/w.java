package ug;

import android.view.View;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.PremiumPreviewFragment;
public final class w implements org.telegram.ui.ActionBar.r1, qj0 {
    public final int f58929a;
    public final l0 f58930b;

    public w(l0 l0Var, int i7) {
        this.f58929a = i7;
        this.f58930b = l0Var;
    }

    @Override
    public boolean c(int i7, View view) {
        l0 l0Var = this.f58930b;
        l0Var.f39534o1.getOnItemClickListener().c(i7, view);
        if (l0Var.d2 != 19) {
            try {
                view.performHapticFeedback(0);
            } catch (Exception unused) {
            }
        }
        return false;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f58929a) {
            case 0:
                l0 l0Var = this.f58930b;
                l0Var.G2.presentFragment(new PremiumPreviewFragment(0, null));
                l0Var.dismiss();
                u1Var.dismiss();
                return;
            default:
                u1Var.dismiss();
                this.f58930b.j1();
                return;
        }
    }
}
