package rg;

import android.view.View;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.Components.hm0;
import org.telegram.ui.PremiumPreviewFragment;
public final class x implements org.telegram.ui.ActionBar.a2, hm0 {
    public final int f47552a;
    public final j0 f47553b;

    public x(j0 j0Var, int i10) {
        this.f47552a = i10;
        this.f47553b = j0Var;
    }

    @Override
    public boolean d(int i10, View view) {
        j0 j0Var = this.f47553b;
        j0Var.d.getOnItemClickListener().d(i10, view);
        if (j0Var.f47325h0 != 19) {
            try {
                view.performHapticFeedback(0);
            } catch (Exception unused) {
            }
        }
        return false;
    }

    @Override
    public void f(b2 b2Var, int i10) {
        switch (this.f47552a) {
            case 0:
                j0 j0Var = this.f47553b;
                j0Var.K0.presentFragment(new PremiumPreviewFragment(0, null));
                j0Var.dismiss();
                b2Var.dismiss();
                return;
            case 1:
                b2Var.dismiss();
                this.f47553b.o1();
                return;
            default:
                this.f47553b.dismiss();
                tg.m1.f0(0, null);
                return;
        }
    }
}
