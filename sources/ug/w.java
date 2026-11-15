package ug;

import android.view.View;
import org.telegram.ui.Components.ij0;
import org.telegram.ui.PremiumPreviewFragment;
public final class w implements org.telegram.ui.ActionBar.q1, ij0 {
    public final int f58350a;
    public final j0 f58351b;

    public w(j0 j0Var, int i7) {
        this.f58350a = i7;
        this.f58351b = j0Var;
    }

    @Override
    public boolean b(int i7, View view) {
        j0 j0Var = this.f58351b;
        j0Var.f35931o1.getOnItemClickListener().b(i7, view);
        if (j0Var.d2 != 19) {
            try {
                view.performHapticFeedback(0);
            } catch (Exception unused) {
            }
        }
        return false;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f58350a) {
            case 0:
                j0 j0Var = this.f58351b;
                j0Var.G2.presentFragment(new PremiumPreviewFragment(0, null));
                j0Var.dismiss();
                t1Var.dismiss();
                return;
            default:
                t1Var.dismiss();
                this.f58351b.i1();
                return;
        }
    }
}
