package sg;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class u implements View.OnClickListener {
    public final int f46873a;
    public final j0 f46874b;

    public u(j0 j0Var, int i10) {
        this.f46873a = i10;
        this.f46874b = j0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f46873a) {
            case 0:
                j0 j0Var = this.f46874b;
                AndroidUtilities.addToClipboard(j0Var.t1());
                j0Var.dismiss();
                return;
            case 1:
                z zVar = this.f46874b.E0;
                if (zVar.f46805r) {
                    zVar.h.performClick();
                    return;
                } else {
                    zVar.v.performClick();
                    return;
                }
            case 2:
                z zVar2 = this.f46874b.E0;
                if (zVar2.f46805r) {
                    zVar2.h.performClick();
                    return;
                } else {
                    zVar2.v.performClick();
                    return;
                }
            default:
                j0.S(this.f46874b);
                return;
        }
    }
}
