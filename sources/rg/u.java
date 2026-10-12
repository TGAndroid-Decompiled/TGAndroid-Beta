package rg;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class u implements View.OnClickListener {
    public final int f47665a;
    public final j0 f47666b;

    public u(j0 j0Var, int i10) {
        this.f47665a = i10;
        this.f47666b = j0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f47665a) {
            case 0:
                j0 j0Var = this.f47666b;
                AndroidUtilities.addToClipboard(j0Var.q1());
                j0Var.dismiss();
                return;
            case 1:
                z zVar = this.f47666b.E0;
                if (zVar.h) {
                    zVar.f47612e.performClick();
                    return;
                } else {
                    zVar.f47615r.performClick();
                    return;
                }
            case 2:
                z zVar2 = this.f47666b.E0;
                if (zVar2.h) {
                    zVar2.f47612e.performClick();
                    return;
                } else {
                    zVar2.f47615r.performClick();
                    return;
                }
            default:
                j0.T(this.f47666b);
                return;
        }
    }
}
