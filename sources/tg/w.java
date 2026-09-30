package tg;

import android.content.DialogInterface;
public final class w implements DialogInterface.OnDismissListener {
    public final int f43607a;
    public final a0 f43608b;

    public w(a0 a0Var, int i10) {
        this.f43607a = i10;
        this.f43608b = a0Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f43607a) {
            case 0:
                vg.r rVar = this.f43608b.f43465g0.f44105r;
                if (rVar != null) {
                    rVar.setPaused(false);
                    return;
                }
                return;
            default:
                vg.r rVar2 = this.f43608b.f43465g0.f44105r;
                if (rVar2 != null) {
                    rVar2.setPaused(false);
                    return;
                }
                return;
        }
    }
}
