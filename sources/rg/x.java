package rg;

import android.view.View;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.PremiumPreviewFragment;
public final class x implements org.telegram.ui.ActionBar.z1, mm0 {
    public final int f47730a;
    public final j0 f47731b;

    public x(j0 j0Var, int i10) {
        this.f47730a = i10;
        this.f47731b = j0Var;
    }

    @Override
    public boolean d(int i10, View view) {
        j0 j0Var = this.f47731b;
        j0Var.d.getOnItemClickListener().d(i10, view);
        if (j0Var.f47503h0 != 19) {
            try {
                view.performHapticFeedback(0);
            } catch (Exception unused) {
            }
        }
        return false;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f47730a) {
            case 0:
                j0 j0Var = this.f47731b;
                j0Var.K0.presentFragment(new PremiumPreviewFragment(0, null));
                j0Var.dismiss();
                a2Var.dismiss();
                return;
            case 1:
                a2Var.dismiss();
                this.f47731b.o1();
                return;
            default:
                this.f47731b.dismiss();
                tg.m1.f0(0, null);
                return;
        }
    }
}
