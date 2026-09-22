package tg;

import android.content.DialogInterface;
public final class w implements DialogInterface.OnDismissListener {
    public final int f43535a;
    public final a0 f43536b;

    public w(a0 a0Var, int i10) {
        this.f43535a = i10;
        this.f43536b = a0Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f43535a) {
            case 0:
                vg.r rVar = this.f43536b.f43392g0.f44035r;
                if (rVar != null) {
                    rVar.setPaused(false);
                    return;
                }
                return;
            default:
                vg.r rVar2 = this.f43536b.f43392g0.f44035r;
                if (rVar2 != null) {
                    rVar2.setPaused(false);
                    return;
                }
                return;
        }
    }
}
