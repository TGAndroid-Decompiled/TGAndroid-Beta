package tg;

import android.content.DialogInterface;
public final class w implements DialogInterface.OnDismissListener {
    public final int f43470a;
    public final a0 f43471b;

    public w(a0 a0Var, int i10) {
        this.f43470a = i10;
        this.f43471b = a0Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f43470a) {
            case 0:
                vg.r rVar = this.f43471b.f43327g0.f43970r;
                if (rVar != null) {
                    rVar.setPaused(false);
                    return;
                }
                return;
            default:
                vg.r rVar2 = this.f43471b.f43327g0.f43970r;
                if (rVar2 != null) {
                    rVar2.setPaused(false);
                    return;
                }
                return;
        }
    }
}
