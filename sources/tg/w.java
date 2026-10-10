package tg;

import android.content.DialogInterface;
public final class w implements DialogInterface.OnDismissListener {
    public final int f48465a;
    public final a0 f48466b;

    public w(a0 a0Var, int i10) {
        this.f48465a = i10;
        this.f48466b = a0Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f48465a) {
            case 0:
                vg.r rVar = this.f48466b.f48316g0.f48958r;
                if (rVar != null) {
                    rVar.setPaused(false);
                    return;
                }
                return;
            default:
                vg.r rVar2 = this.f48466b.f48316g0.f48958r;
                if (rVar2 != null) {
                    rVar2.setPaused(false);
                    return;
                }
                return;
        }
    }
}
