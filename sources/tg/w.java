package tg;

import android.content.DialogInterface;
public final class w implements DialogInterface.OnDismissListener {
    public final int f48421a;
    public final a0 f48422b;

    public w(a0 a0Var, int i10) {
        this.f48421a = i10;
        this.f48422b = a0Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f48421a) {
            case 0:
                vg.r rVar = this.f48422b.f48272g0.f48914r;
                if (rVar != null) {
                    rVar.setPaused(false);
                    return;
                }
                return;
            default:
                vg.r rVar2 = this.f48422b.f48272g0.f48914r;
                if (rVar2 != null) {
                    rVar2.setPaused(false);
                    return;
                }
                return;
        }
    }
}
