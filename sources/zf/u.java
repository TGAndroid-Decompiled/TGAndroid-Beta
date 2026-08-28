package zf;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class u implements View.OnClickListener {
    public final int f50707a;
    public final j0 f50708b;

    public u(j0 j0Var, int i9) {
        this.f50707a = i9;
        this.f50708b = j0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f50707a) {
            case 0:
                j0 j0Var = this.f50708b;
                AndroidUtilities.addToClipboard(j0Var.p1());
                j0Var.dismiss();
                return;
            case 1:
                y yVar = this.f50708b.A0;
                if (yVar.h) {
                    yVar.f50648e.performClick();
                    return;
                } else {
                    yVar.f50651r.performClick();
                    return;
                }
            case 2:
                y yVar2 = this.f50708b.A0;
                if (yVar2.h) {
                    yVar2.f50648e.performClick();
                    return;
                } else {
                    yVar2.f50651r.performClick();
                    return;
                }
            default:
                j0.R(this.f50708b);
                return;
        }
    }
}
