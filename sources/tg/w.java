package tg;

import android.content.DialogInterface;
public final class w implements DialogInterface.OnDismissListener {
    public final int f43501a;
    public final a0 f43502b;

    public w(a0 a0Var, int i10) {
        this.f43501a = i10;
        this.f43502b = a0Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f43501a) {
            case 0:
                vg.r rVar = this.f43502b.f43359g0.f43999r;
                if (rVar != null) {
                    rVar.setPaused(false);
                    return;
                }
                return;
            default:
                vg.r rVar2 = this.f43502b.f43359g0.f43999r;
                if (rVar2 != null) {
                    rVar2.setPaused(false);
                    return;
                }
                return;
        }
    }
}
