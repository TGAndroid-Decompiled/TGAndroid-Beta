package tg;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class u implements View.OnClickListener {
    public final int f49053a;
    public final j0 f49054b;

    public u(j0 j0Var, int i10) {
        this.f49053a = i10;
        this.f49054b = j0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f49053a) {
            case 0:
                j0 j0Var = this.f49054b;
                AndroidUtilities.addToClipboard(j0Var.t1());
                j0Var.dismiss();
                return;
            case 1:
                z zVar = this.f49054b.E0;
                if (zVar.f48983r) {
                    zVar.h.performClick();
                    return;
                } else {
                    zVar.v.performClick();
                    return;
                }
            case 2:
                z zVar2 = this.f49054b.E0;
                if (zVar2.f48983r) {
                    zVar2.h.performClick();
                    return;
                } else {
                    zVar2.v.performClick();
                    return;
                }
            default:
                j0.S(this.f49054b);
                return;
        }
    }
}
