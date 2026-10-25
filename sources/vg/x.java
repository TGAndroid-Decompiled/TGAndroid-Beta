package vg;

import android.content.DialogInterface;
public final class x implements DialogInterface.OnShowListener {
    public final int f50270a;
    public final a0 f50271b;

    public x(a0 a0Var, int i10) {
        this.f50270a = i10;
        this.f50271b = a0Var;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f50270a) {
            case 0:
                xg.r rVar = this.f50271b.f50121g0.f51170r;
                if (rVar != null) {
                    rVar.setPaused(true);
                    return;
                }
                return;
            default:
                xg.r rVar2 = this.f50271b.f50121g0.f51170r;
                if (rVar2 != null) {
                    rVar2.setPaused(true);
                    return;
                }
                return;
        }
    }
}
