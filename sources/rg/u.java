package rg;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class u implements View.OnClickListener {
    public final int f47449a;
    public final j0 f47450b;

    public u(j0 j0Var, int i10) {
        this.f47449a = i10;
        this.f47450b = j0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f47449a) {
            case 0:
                j0 j0Var = this.f47450b;
                AndroidUtilities.addToClipboard(j0Var.q1());
                j0Var.dismiss();
                return;
            case 1:
                z zVar = this.f47450b.E0;
                if (zVar.h) {
                    zVar.f47380e.performClick();
                    return;
                } else {
                    zVar.f47383r.performClick();
                    return;
                }
            case 2:
                z zVar2 = this.f47450b.E0;
                if (zVar2.h) {
                    zVar2.f47380e.performClick();
                    return;
                } else {
                    zVar2.f47383r.performClick();
                    return;
                }
            default:
                j0.T(this.f47450b);
                return;
        }
    }
}
