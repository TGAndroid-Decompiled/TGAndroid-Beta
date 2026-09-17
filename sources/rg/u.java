package rg;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class u implements View.OnClickListener {
    public final int f42512a;
    public final j0 f42513b;

    public u(j0 j0Var, int i10) {
        this.f42512a = i10;
        this.f42513b = j0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f42512a) {
            case 0:
                j0 j0Var = this.f42513b;
                AndroidUtilities.addToClipboard(j0Var.p1());
                j0Var.dismiss();
                return;
            case 1:
                z zVar = this.f42513b.E0;
                if (zVar.h) {
                    zVar.e.performClick();
                    return;
                } else {
                    zVar.f42448r.performClick();
                    return;
                }
            case 2:
                z zVar2 = this.f42513b.E0;
                if (zVar2.h) {
                    zVar2.e.performClick();
                    return;
                } else {
                    zVar2.f42448r.performClick();
                    return;
                }
            default:
                j0.S(this.f42513b);
                return;
        }
    }
}
