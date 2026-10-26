package vg;

import android.content.DialogInterface;
public final class w implements DialogInterface.OnDismissListener {
    public final int f50269a;
    public final a0 f50270b;

    public w(a0 a0Var, int i10) {
        this.f50269a = i10;
        this.f50270b = a0Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f50269a) {
            case 0:
                xg.r rVar = this.f50270b.f50124g0.f51173r;
                if (rVar != null) {
                    rVar.setPaused(false);
                    return;
                }
                return;
            default:
                xg.r rVar2 = this.f50270b.f50124g0.f51173r;
                if (rVar2 != null) {
                    rVar2.setPaused(false);
                    return;
                }
                return;
        }
    }
}
