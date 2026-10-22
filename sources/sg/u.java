package sg;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class u implements View.OnClickListener {
    public final int f46441a;
    public final k0 f46442b;

    public u(k0 k0Var, int i10) {
        this.f46441a = i10;
        this.f46442b = k0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f46441a) {
            case 0:
                k0 k0Var = this.f46442b;
                AndroidUtilities.addToClipboard(k0Var.q1());
                k0Var.dismiss();
                return;
            case 1:
                a0 a0Var = this.f46442b.E0;
                if (a0Var.h) {
                    a0Var.e.performClick();
                    return;
                } else {
                    a0Var.f46391r.performClick();
                    return;
                }
            case 2:
                a0 a0Var2 = this.f46442b.E0;
                if (a0Var2.h) {
                    a0Var2.e.performClick();
                    return;
                } else {
                    a0Var2.f46391r.performClick();
                    return;
                }
            default:
                k0.T(this.f46442b);
                return;
        }
    }
}
