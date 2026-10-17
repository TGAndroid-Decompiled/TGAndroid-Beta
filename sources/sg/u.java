package sg;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class u implements View.OnClickListener {
    public final int f46443a;
    public final j0 f46444b;

    public u(j0 j0Var, int i10) {
        this.f46443a = i10;
        this.f46444b = j0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f46443a) {
            case 0:
                j0 j0Var = this.f46444b;
                AndroidUtilities.addToClipboard(j0Var.q1());
                j0Var.dismiss();
                return;
            case 1:
                z zVar = this.f46444b.E0;
                if (zVar.h) {
                    zVar.e.performClick();
                    return;
                } else {
                    zVar.f46382r.performClick();
                    return;
                }
            case 2:
                z zVar2 = this.f46444b.E0;
                if (zVar2.h) {
                    zVar2.e.performClick();
                    return;
                } else {
                    zVar2.f46382r.performClick();
                    return;
                }
            default:
                j0.T(this.f46444b);
                return;
        }
    }
}
