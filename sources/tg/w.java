package tg;

import android.content.DialogInterface;
public final class w implements DialogInterface.OnDismissListener {
    public final int f43499a;
    public final a0 f43500b;

    public w(a0 a0Var, int i10) {
        this.f43499a = i10;
        this.f43500b = a0Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f43499a) {
            case 0:
                vg.r rVar = this.f43500b.f43357g0.f43997r;
                if (rVar != null) {
                    rVar.setPaused(false);
                    return;
                }
                return;
            default:
                vg.r rVar2 = this.f43500b.f43357g0.f43997r;
                if (rVar2 != null) {
                    rVar2.setPaused(false);
                    return;
                }
                return;
        }
    }
}
