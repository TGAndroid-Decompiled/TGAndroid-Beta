package vg;

import android.content.DialogInterface;
public final class x implements DialogInterface.OnShowListener {
    public final int f50308a;
    public final a0 f50309b;

    public x(a0 a0Var, int i10) {
        this.f50308a = i10;
        this.f50309b = a0Var;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f50308a) {
            case 0:
                xg.r rVar = this.f50309b.f50159g0.f51231r;
                if (rVar != null) {
                    rVar.setPaused(true);
                    return;
                }
                return;
            default:
                xg.r rVar2 = this.f50309b.f50159g0.f51231r;
                if (rVar2 != null) {
                    rVar2.setPaused(true);
                    return;
                }
                return;
        }
    }
}
