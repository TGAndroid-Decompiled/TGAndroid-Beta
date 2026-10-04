package tg;

import android.content.DialogInterface;
public final class w implements DialogInterface.OnDismissListener {
    public final int f47115a;
    public final a0 f47116b;

    public w(a0 a0Var, int i10) {
        this.f47115a = i10;
        this.f47116b = a0Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f47115a) {
            case 0:
                vg.r rVar = this.f47116b.f46964g0.f47649r;
                if (rVar != null) {
                    rVar.setPaused(false);
                    return;
                }
                return;
            default:
                vg.r rVar2 = this.f47116b.f46964g0.f47649r;
                if (rVar2 != null) {
                    rVar2.setPaused(false);
                    return;
                }
                return;
        }
    }
}
