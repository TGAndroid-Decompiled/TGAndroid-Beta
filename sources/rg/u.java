package rg;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class u implements View.OnClickListener {
    public final int f42486a;
    public final j0 f42487b;

    public u(j0 j0Var, int i10) {
        this.f42486a = i10;
        this.f42487b = j0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f42486a) {
            case 0:
                j0 j0Var = this.f42487b;
                AndroidUtilities.addToClipboard(j0Var.p1());
                j0Var.dismiss();
                return;
            case 1:
                z zVar = this.f42487b.E0;
                if (zVar.h) {
                    zVar.e.performClick();
                    return;
                } else {
                    zVar.f42422r.performClick();
                    return;
                }
            case 2:
                z zVar2 = this.f42487b.E0;
                if (zVar2.h) {
                    zVar2.e.performClick();
                    return;
                } else {
                    zVar2.f42422r.performClick();
                    return;
                }
            default:
                j0.S(this.f42487b);
                return;
        }
    }
}
