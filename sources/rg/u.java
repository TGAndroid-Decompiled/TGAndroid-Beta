package rg;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class u implements View.OnClickListener {
    public final int f46320a;
    public final k0 f46321b;

    public u(k0 k0Var, int i10) {
        this.f46320a = i10;
        this.f46321b = k0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f46320a) {
            case 0:
                k0 k0Var = this.f46321b;
                AndroidUtilities.addToClipboard(k0Var.p1());
                k0Var.dismiss();
                return;
            case 1:
                a0 a0Var = this.f46321b.E0;
                if (a0Var.h) {
                    a0Var.f46263e.performClick();
                    return;
                } else {
                    a0Var.f46266r.performClick();
                    return;
                }
            case 2:
                a0 a0Var2 = this.f46321b.E0;
                if (a0Var2.h) {
                    a0Var2.f46263e.performClick();
                    return;
                } else {
                    a0Var2.f46266r.performClick();
                    return;
                }
            default:
                k0.Q(this.f46321b);
                return;
        }
    }
}
