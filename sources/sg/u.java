package sg;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class u implements View.OnClickListener {
    public final int f46322a;
    public final k0 f46323b;

    public u(k0 k0Var, int i10) {
        this.f46322a = i10;
        this.f46323b = k0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f46322a) {
            case 0:
                k0 k0Var = this.f46323b;
                AndroidUtilities.addToClipboard(k0Var.p1());
                k0Var.dismiss();
                return;
            case 1:
                a0 a0Var = this.f46323b.E0;
                if (a0Var.h) {
                    a0Var.f46267e.performClick();
                    return;
                } else {
                    a0Var.f46270r.performClick();
                    return;
                }
            case 2:
                a0 a0Var2 = this.f46323b.E0;
                if (a0Var2.h) {
                    a0Var2.f46267e.performClick();
                    return;
                } else {
                    a0Var2.f46270r.performClick();
                    return;
                }
            default:
                k0.S(this.f46323b);
                return;
        }
    }
}
