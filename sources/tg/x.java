package tg;

import android.content.DialogInterface;
public final class x implements DialogInterface.OnShowListener {
    public final int f43611a;
    public final a0 f43612b;

    public x(a0 a0Var, int i10) {
        this.f43611a = i10;
        this.f43612b = a0Var;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f43611a) {
            case 0:
                vg.r rVar = this.f43612b.f43465g0.f44105r;
                if (rVar != null) {
                    rVar.setPaused(true);
                    return;
                }
                return;
            default:
                vg.r rVar2 = this.f43612b.f43465g0.f44105r;
                if (rVar2 != null) {
                    rVar2.setPaused(true);
                    return;
                }
                return;
        }
    }
}
