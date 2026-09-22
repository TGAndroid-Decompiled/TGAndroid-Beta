package tg;

import android.content.DialogInterface;
public final class x implements DialogInterface.OnDismissListener {
    public final int f43232a;
    public final b0 f43233b;

    public x(b0 b0Var, int i10) {
        this.f43232a = i10;
        this.f43233b = b0Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f43232a) {
            case 0:
                vg.r rVar = this.f43233b.f43090g0.f43708r;
                if (rVar != null) {
                    rVar.setPaused(false);
                    return;
                }
                return;
            default:
                vg.r rVar2 = this.f43233b.f43090g0.f43708r;
                if (rVar2 != null) {
                    rVar2.setPaused(false);
                    return;
                }
                return;
        }
    }
}
