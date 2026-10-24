package sg;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class u implements View.OnClickListener {
    public final int f46872a;
    public final j0 f46873b;

    public u(j0 j0Var, int i10) {
        this.f46872a = i10;
        this.f46873b = j0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f46872a) {
            case 0:
                j0 j0Var = this.f46873b;
                AndroidUtilities.addToClipboard(j0Var.t1());
                j0Var.dismiss();
                return;
            case 1:
                z zVar = this.f46873b.E0;
                if (zVar.f46804r) {
                    zVar.h.performClick();
                    return;
                } else {
                    zVar.v.performClick();
                    return;
                }
            case 2:
                z zVar2 = this.f46873b.E0;
                if (zVar2.f46804r) {
                    zVar2.h.performClick();
                    return;
                } else {
                    zVar2.v.performClick();
                    return;
                }
            default:
                j0.S(this.f46873b);
                return;
        }
    }
}
