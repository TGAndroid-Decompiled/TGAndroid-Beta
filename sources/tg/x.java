package tg;

import android.content.DialogInterface;
public final class x implements DialogInterface.OnShowListener {
    public final int f43503a;
    public final a0 f43504b;

    public x(a0 a0Var, int i10) {
        this.f43503a = i10;
        this.f43504b = a0Var;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f43503a) {
            case 0:
                vg.r rVar = this.f43504b.f43357g0.f43997r;
                if (rVar != null) {
                    rVar.setPaused(true);
                    return;
                }
                return;
            default:
                vg.r rVar2 = this.f43504b.f43357g0.f43997r;
                if (rVar2 != null) {
                    rVar2.setPaused(true);
                    return;
                }
                return;
        }
    }
}
