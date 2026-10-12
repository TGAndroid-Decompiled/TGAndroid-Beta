package sg;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class u implements View.OnClickListener {
    public final int f45364a;
    public final j0 f45365b;

    public u(j0 j0Var, int i10) {
        this.f45364a = i10;
        this.f45365b = j0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f45364a) {
            case 0:
                j0 j0Var = this.f45365b;
                AndroidUtilities.addToClipboard(j0Var.q1());
                j0Var.dismiss();
                return;
            case 1:
                z zVar = this.f45365b.E0;
                if (zVar.h) {
                    zVar.e.performClick();
                    return;
                } else {
                    zVar.f45314r.performClick();
                    return;
                }
            case 2:
                z zVar2 = this.f45365b.E0;
                if (zVar2.h) {
                    zVar2.e.performClick();
                    return;
                } else {
                    zVar2.f45314r.performClick();
                    return;
                }
            default:
                j0.T(this.f45365b);
                return;
        }
    }
}
