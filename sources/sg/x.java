package sg;

import android.view.View;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.PremiumPreviewFragment;
public final class x implements org.telegram.ui.ActionBar.a2, zl0 {
    public final int f46500a;
    public final k0 f46501b;

    public x(k0 k0Var, int i10) {
        this.f46500a = i10;
        this.f46501b = k0Var;
    }

    @Override
    public boolean a(int i10, View view) {
        k0 k0Var = this.f46501b;
        k0Var.d.getOnItemClickListener().a(i10, view);
        if (k0Var.f46296h0 != 19) {
            try {
                view.performHapticFeedback(0);
            } catch (Exception unused) {
            }
        }
        return false;
    }

    @Override
    public void g(b2 b2Var, int i10) {
        switch (this.f46500a) {
            case 0:
                k0 k0Var = this.f46501b;
                k0Var.K0.presentFragment(new PremiumPreviewFragment(0, null));
                k0Var.dismiss();
                b2Var.dismiss();
                return;
            case 1:
                b2Var.dismiss();
                this.f46501b.o1();
                return;
            default:
                this.f46501b.dismiss();
                ug.m1.f0(0, null);
                return;
        }
    }
}
