package tg;

import android.content.DialogInterface;
public final class x implements DialogInterface.OnShowListener {
    public final int f43539a;
    public final a0 f43540b;

    public x(a0 a0Var, int i10) {
        this.f43539a = i10;
        this.f43540b = a0Var;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f43539a) {
            case 0:
                vg.r rVar = this.f43540b.f43392g0.f44035r;
                if (rVar != null) {
                    rVar.setPaused(true);
                    return;
                }
                return;
            default:
                vg.r rVar2 = this.f43540b.f43392g0.f44035r;
                if (rVar2 != null) {
                    rVar2.setPaused(true);
                    return;
                }
                return;
        }
    }
}
