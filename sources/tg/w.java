package tg;

import android.content.DialogInterface;
public final class w implements DialogInterface.OnDismissListener {
    public final int f43545a;
    public final a0 f43546b;

    public w(a0 a0Var, int i10) {
        this.f43545a = i10;
        this.f43546b = a0Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f43545a) {
            case 0:
                vg.r rVar = this.f43546b.f43402g0.f44043r;
                if (rVar != null) {
                    rVar.setPaused(false);
                    return;
                }
                return;
            default:
                vg.r rVar2 = this.f43546b.f43402g0.f44043r;
                if (rVar2 != null) {
                    rVar2.setPaused(false);
                    return;
                }
                return;
        }
    }
}
