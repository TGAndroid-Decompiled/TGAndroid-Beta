package tg;

import android.content.DialogInterface;
public final class w implements DialogInterface.OnDismissListener {
    public final int f43514a;
    public final a0 f43515b;

    public w(a0 a0Var, int i10) {
        this.f43514a = i10;
        this.f43515b = a0Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f43514a) {
            case 0:
                vg.r rVar = this.f43515b.f43371g0.f44014r;
                if (rVar != null) {
                    rVar.setPaused(false);
                    return;
                }
                return;
            default:
                vg.r rVar2 = this.f43515b.f43371g0.f44014r;
                if (rVar2 != null) {
                    rVar2.setPaused(false);
                    return;
                }
                return;
        }
    }
}
