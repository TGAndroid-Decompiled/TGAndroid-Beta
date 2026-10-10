package tg;

import android.content.DialogInterface;
public final class x implements DialogInterface.OnShowListener {
    public final int f48469a;
    public final a0 f48470b;

    public x(a0 a0Var, int i10) {
        this.f48469a = i10;
        this.f48470b = a0Var;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f48469a) {
            case 0:
                vg.r rVar = this.f48470b.f48316g0.f48958r;
                if (rVar != null) {
                    rVar.setPaused(true);
                    return;
                }
                return;
            default:
                vg.r rVar2 = this.f48470b.f48316g0.f48958r;
                if (rVar2 != null) {
                    rVar2.setPaused(true);
                    return;
                }
                return;
        }
    }
}
