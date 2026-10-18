package sg;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class u implements View.OnClickListener {
    public final int f46463a;
    public final j0 f46464b;

    public u(j0 j0Var, int i10) {
        this.f46463a = i10;
        this.f46464b = j0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f46463a) {
            case 0:
                j0 j0Var = this.f46464b;
                AndroidUtilities.addToClipboard(j0Var.q1());
                j0Var.dismiss();
                return;
            case 1:
                z zVar = this.f46464b.E0;
                if (zVar.h) {
                    zVar.e.performClick();
                    return;
                } else {
                    zVar.f46402r.performClick();
                    return;
                }
            case 2:
                z zVar2 = this.f46464b.E0;
                if (zVar2.h) {
                    zVar2.e.performClick();
                    return;
                } else {
                    zVar2.f46402r.performClick();
                    return;
                }
            default:
                j0.T(this.f46464b);
                return;
        }
    }
}
