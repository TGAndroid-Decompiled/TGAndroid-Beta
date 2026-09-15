package tg;

import android.content.DialogInterface;
public final class x implements DialogInterface.OnDismissListener {
    public final int f43236a;
    public final b0 f43237b;

    public x(b0 b0Var, int i10) {
        this.f43236a = i10;
        this.f43237b = b0Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f43236a) {
            case 0:
                vg.r rVar = this.f43237b.f43094g0.f43712r;
                if (rVar != null) {
                    rVar.setPaused(false);
                    return;
                }
                return;
            default:
                vg.r rVar2 = this.f43237b.f43094g0.f43712r;
                if (rVar2 != null) {
                    rVar2.setPaused(false);
                    return;
                }
                return;
        }
    }
}
