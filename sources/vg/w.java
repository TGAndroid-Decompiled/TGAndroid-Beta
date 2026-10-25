package vg;

import android.content.DialogInterface;
public final class w implements DialogInterface.OnDismissListener {
    public final int f50266a;
    public final a0 f50267b;

    public w(a0 a0Var, int i10) {
        this.f50266a = i10;
        this.f50267b = a0Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f50266a) {
            case 0:
                xg.r rVar = this.f50267b.f50121g0.f51170r;
                if (rVar != null) {
                    rVar.setPaused(false);
                    return;
                }
                return;
            default:
                xg.r rVar2 = this.f50267b.f50121g0.f51170r;
                if (rVar2 != null) {
                    rVar2.setPaused(false);
                    return;
                }
                return;
        }
    }
}
