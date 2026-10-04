package tg;

import android.content.DialogInterface;
public final class w implements DialogInterface.OnDismissListener {
    public final int f47106a;
    public final a0 f47107b;

    public w(a0 a0Var, int i10) {
        this.f47106a = i10;
        this.f47107b = a0Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f47106a) {
            case 0:
                vg.r rVar = this.f47107b.f46956g0.f47640r;
                if (rVar != null) {
                    rVar.setPaused(false);
                    return;
                }
                return;
            default:
                vg.r rVar2 = this.f47107b.f46956g0.f47640r;
                if (rVar2 != null) {
                    rVar2.setPaused(false);
                    return;
                }
                return;
        }
    }
}
