package rg;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class u implements View.OnClickListener {
    public final int f46305a;
    public final k0 f46306b;

    public u(k0 k0Var, int i10) {
        this.f46305a = i10;
        this.f46306b = k0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f46305a) {
            case 0:
                k0 k0Var = this.f46306b;
                AndroidUtilities.addToClipboard(k0Var.p1());
                k0Var.dismiss();
                return;
            case 1:
                a0 a0Var = this.f46306b.E0;
                if (a0Var.h) {
                    a0Var.f46248e.performClick();
                    return;
                } else {
                    a0Var.f46251r.performClick();
                    return;
                }
            case 2:
                a0 a0Var2 = this.f46306b.E0;
                if (a0Var2.h) {
                    a0Var2.f46248e.performClick();
                    return;
                } else {
                    a0Var2.f46251r.performClick();
                    return;
                }
            default:
                k0.Q(this.f46306b);
                return;
        }
    }
}
