package ug;

import android.content.DialogInterface;
public final class x implements DialogInterface.OnDismissListener {
    public final int f47251a;
    public final b0 f47252b;

    public x(b0 b0Var, int i10) {
        this.f47251a = i10;
        this.f47252b = b0Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f47251a) {
            case 0:
                wg.r rVar = this.f47252b.f47102g0.f47825r;
                if (rVar != null) {
                    rVar.setPaused(false);
                    return;
                }
                return;
            default:
                wg.r rVar2 = this.f47252b.f47102g0.f47825r;
                if (rVar2 != null) {
                    rVar2.setPaused(false);
                    return;
                }
                return;
        }
    }
}
