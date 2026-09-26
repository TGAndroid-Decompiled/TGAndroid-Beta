package tg;

import android.content.DialogInterface;
public final class x implements DialogInterface.OnShowListener {
    public final int f43502a;
    public final a0 f43503b;

    public x(a0 a0Var, int i10) {
        this.f43502a = i10;
        this.f43503b = a0Var;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f43502a) {
            case 0:
                vg.r rVar = this.f43503b.f43356g0.f43996r;
                if (rVar != null) {
                    rVar.setPaused(true);
                    return;
                }
                return;
            default:
                vg.r rVar2 = this.f43503b.f43356g0.f43996r;
                if (rVar2 != null) {
                    rVar2.setPaused(true);
                    return;
                }
                return;
        }
    }
}
