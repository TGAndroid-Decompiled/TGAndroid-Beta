package rg;

import android.view.View;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.Components.bl0;
import org.telegram.ui.PremiumPreviewFragment;
public final class x implements a2, bl0 {
    public final int f42531a;
    public final j0 f42532b;

    public x(j0 j0Var, int i10) {
        this.f42531a = i10;
        this.f42532b = j0Var;
    }

    @Override
    public boolean d(int i10, View view) {
        j0 j0Var = this.f42532b;
        j0Var.d.getOnItemClickListener().d(i10, view);
        if (j0Var.f42313h0 != 19) {
            try {
                view.performHapticFeedback(0);
            } catch (Exception unused) {
            }
        }
        return false;
    }

    @Override
    public void f(b2 b2Var, int i10) {
        switch (this.f42531a) {
            case 0:
                j0 j0Var = this.f42532b;
                j0Var.K0.presentFragment(new PremiumPreviewFragment(0, null));
                j0Var.dismiss();
                b2Var.dismiss();
                return;
            case 1:
                b2Var.dismiss();
                this.f42532b.n1();
                return;
            default:
                this.f42532b.dismiss();
                tg.n1.e0(0, null);
                return;
        }
    }
}
