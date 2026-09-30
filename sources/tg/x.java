package tg;

import android.content.DialogInterface;
public final class x implements DialogInterface.OnShowListener {
    public final int f43505a;
    public final a0 f43506b;

    public x(a0 a0Var, int i10) {
        this.f43505a = i10;
        this.f43506b = a0Var;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f43505a) {
            case 0:
                vg.r rVar = this.f43506b.f43359g0.f43999r;
                if (rVar != null) {
                    rVar.setPaused(true);
                    return;
                }
                return;
            default:
                vg.r rVar2 = this.f43506b.f43359g0.f43999r;
                if (rVar2 != null) {
                    rVar2.setPaused(true);
                    return;
                }
                return;
        }
    }
}
