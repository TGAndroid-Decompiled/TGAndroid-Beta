package tg;

import android.content.DialogInterface;
public final class w implements DialogInterface.OnDismissListener {
    public final int f43485a;
    public final a0 f43486b;

    public w(a0 a0Var, int i10) {
        this.f43485a = i10;
        this.f43486b = a0Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f43485a) {
            case 0:
                vg.r rVar = this.f43486b.f43343g0.f43983r;
                if (rVar != null) {
                    rVar.setPaused(false);
                    return;
                }
                return;
            default:
                vg.r rVar2 = this.f43486b.f43343g0.f43983r;
                if (rVar2 != null) {
                    rVar2.setPaused(false);
                    return;
                }
                return;
        }
    }
}
