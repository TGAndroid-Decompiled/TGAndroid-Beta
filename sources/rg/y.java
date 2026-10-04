package rg;

import android.view.View;
import org.telegram.ui.Components.ol0;
import org.telegram.ui.PremiumPreviewFragment;
public final class y implements org.telegram.ui.ActionBar.a2, ol0 {
    public final int f46388a;
    public final k0 f46389b;

    public y(k0 k0Var, int i10) {
        this.f46388a = i10;
        this.f46389b = k0Var;
    }

    @Override
    public boolean d(int i10, View view) {
        k0 k0Var = this.f46389b;
        k0Var.d.getOnItemClickListener().d(i10, view);
        if (k0Var.f46158h0 != 19) {
            try {
                view.performHapticFeedback(0);
            } catch (Exception unused) {
            }
        }
        return false;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f46388a) {
            case 0:
                k0 k0Var = this.f46389b;
                k0Var.K0.presentFragment(new PremiumPreviewFragment(0, null));
                k0Var.dismiss();
                b2Var.dismiss();
                return;
            case 1:
                b2Var.dismiss();
                this.f46389b.n1();
                return;
            default:
                this.f46389b.dismiss();
                tg.m1.e0(0, null);
                return;
        }
    }
}
