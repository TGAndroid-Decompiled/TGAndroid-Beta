package vg;

import android.content.DialogInterface;
public final class w implements DialogInterface.OnDismissListener {
    public final int f50304a;
    public final a0 f50305b;

    public w(a0 a0Var, int i10) {
        this.f50304a = i10;
        this.f50305b = a0Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f50304a) {
            case 0:
                xg.r rVar = this.f50305b.f50159g0.f51231r;
                if (rVar != null) {
                    rVar.setPaused(false);
                    return;
                }
                return;
            default:
                xg.r rVar2 = this.f50305b.f50159g0.f51231r;
                if (rVar2 != null) {
                    rVar2.setPaused(false);
                    return;
                }
                return;
        }
    }
}
