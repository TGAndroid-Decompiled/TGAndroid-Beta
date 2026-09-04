package sg;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class u implements View.OnClickListener {
    public final int f46293a;
    public final k0 f46294b;

    public u(k0 k0Var, int i10) {
        this.f46293a = i10;
        this.f46294b = k0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f46293a) {
            case 0:
                k0 k0Var = this.f46294b;
                AndroidUtilities.addToClipboard(k0Var.p1());
                k0Var.dismiss();
                return;
            case 1:
                a0 a0Var = this.f46294b.E0;
                if (a0Var.h) {
                    a0Var.f46238e.performClick();
                    return;
                } else {
                    a0Var.f46241r.performClick();
                    return;
                }
            case 2:
                a0 a0Var2 = this.f46294b.E0;
                if (a0Var2.h) {
                    a0Var2.f46238e.performClick();
                    return;
                } else {
                    a0Var2.f46241r.performClick();
                    return;
                }
            default:
                k0.S(this.f46294b);
                return;
        }
    }
}
