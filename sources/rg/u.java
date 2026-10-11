package rg;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class u implements View.OnClickListener {
    public final int f47575a;
    public final j0 f47576b;

    public u(j0 j0Var, int i10) {
        this.f47575a = i10;
        this.f47576b = j0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f47575a) {
            case 0:
                j0 j0Var = this.f47576b;
                AndroidUtilities.addToClipboard(j0Var.q1());
                j0Var.dismiss();
                return;
            case 1:
                z zVar = this.f47576b.E0;
                if (zVar.h) {
                    zVar.f47506e.performClick();
                    return;
                } else {
                    zVar.f47509r.performClick();
                    return;
                }
            case 2:
                z zVar2 = this.f47576b.E0;
                if (zVar2.h) {
                    zVar2.f47506e.performClick();
                    return;
                } else {
                    zVar2.f47509r.performClick();
                    return;
                }
            default:
                j0.T(this.f47576b);
                return;
        }
    }
}
