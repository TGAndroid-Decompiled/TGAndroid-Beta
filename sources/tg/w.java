package tg;

import android.content.DialogInterface;
public final class w implements DialogInterface.OnDismissListener {
    public final int f43498a;
    public final a0 f43499b;

    public w(a0 a0Var, int i10) {
        this.f43498a = i10;
        this.f43499b = a0Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f43498a) {
            case 0:
                vg.r rVar = this.f43499b.f43356g0.f43996r;
                if (rVar != null) {
                    rVar.setPaused(false);
                    return;
                }
                return;
            default:
                vg.r rVar2 = this.f43499b.f43356g0.f43996r;
                if (rVar2 != null) {
                    rVar2.setPaused(false);
                    return;
                }
                return;
        }
    }
}
