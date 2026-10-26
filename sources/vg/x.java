package vg;

import android.content.DialogInterface;
public final class x implements DialogInterface.OnShowListener {
    public final int f50273a;
    public final a0 f50274b;

    public x(a0 a0Var, int i10) {
        this.f50273a = i10;
        this.f50274b = a0Var;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f50273a) {
            case 0:
                xg.r rVar = this.f50274b.f50124g0.f51173r;
                if (rVar != null) {
                    rVar.setPaused(true);
                    return;
                }
                return;
            default:
                xg.r rVar2 = this.f50274b.f50124g0.f51173r;
                if (rVar2 != null) {
                    rVar2.setPaused(true);
                    return;
                }
                return;
        }
    }
}
