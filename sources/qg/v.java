package qg;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class v implements View.OnClickListener {
    public final int f40935a;
    public final k0 f40936b;

    public v(k0 k0Var, int i10) {
        this.f40935a = i10;
        this.f40936b = k0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f40935a) {
            case 0:
                k0 k0Var = this.f40936b;
                AndroidUtilities.addToClipboard(k0Var.p1());
                k0Var.dismiss();
                return;
            case 1:
                a0 a0Var = this.f40936b.E0;
                if (a0Var.h) {
                    a0Var.e.performClick();
                    return;
                } else {
                    a0Var.f40904r.performClick();
                    return;
                }
            case 2:
                a0 a0Var2 = this.f40936b.E0;
                if (a0Var2.h) {
                    a0Var2.e.performClick();
                    return;
                } else {
                    a0Var2.f40904r.performClick();
                    return;
                }
            default:
                k0.S(this.f40936b);
                return;
        }
    }
}
