package rg;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class u implements View.OnClickListener {
    public final int f47541a;
    public final j0 f47542b;

    public u(j0 j0Var, int i10) {
        this.f47541a = i10;
        this.f47542b = j0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f47541a) {
            case 0:
                j0 j0Var = this.f47542b;
                AndroidUtilities.addToClipboard(j0Var.q1());
                j0Var.dismiss();
                return;
            case 1:
                z zVar = this.f47542b.E0;
                if (zVar.h) {
                    zVar.f47472e.performClick();
                    return;
                } else {
                    zVar.f47475r.performClick();
                    return;
                }
            case 2:
                z zVar2 = this.f47542b.E0;
                if (zVar2.h) {
                    zVar2.f47472e.performClick();
                    return;
                } else {
                    zVar2.f47475r.performClick();
                    return;
                }
            default:
                j0.T(this.f47542b);
                return;
        }
    }
}
