package qg;

import android.view.View;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.PremiumPreviewFragment;
public final class y implements c2, ll0 {
    public final int f40987a;
    public final k0 f40988b;

    public y(k0 k0Var, int i10) {
        this.f40987a = i10;
        this.f40988b = k0Var;
    }

    @Override
    public boolean d(int i10, View view) {
        k0 k0Var = this.f40988b;
        k0Var.d.getOnItemClickListener().d(i10, view);
        if (k0Var.f40771h0 != 19) {
            try {
                view.performHapticFeedback(0);
            } catch (Exception unused) {
            }
        }
        return false;
    }

    @Override
    public void f(d2 d2Var, int i10) {
        switch (this.f40987a) {
            case 0:
                k0 k0Var = this.f40988b;
                k0Var.K0.presentFragment(new PremiumPreviewFragment(0, null));
                k0Var.dismiss();
                d2Var.dismiss();
                return;
            case 1:
                d2Var.dismiss();
                this.f40988b.n1();
                return;
            default:
                this.f40988b.dismiss();
                sg.p1.e0(0, null);
                return;
        }
    }
}
