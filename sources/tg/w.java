package tg;

import android.content.DialogInterface;
public final class w implements DialogInterface.OnDismissListener {
    public final int f43500a;
    public final a0 f43501b;

    public w(a0 a0Var, int i10) {
        this.f43500a = i10;
        this.f43501b = a0Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f43500a) {
            case 0:
                vg.r rVar = this.f43501b.f43358g0.f43998r;
                if (rVar != null) {
                    rVar.setPaused(false);
                    return;
                }
                return;
            default:
                vg.r rVar2 = this.f43501b.f43358g0.f43998r;
                if (rVar2 != null) {
                    rVar2.setPaused(false);
                    return;
                }
                return;
        }
    }
}
