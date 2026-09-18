package tg;

import android.content.DialogInterface;
public final class x implements DialogInterface.OnDismissListener {
    public final int f43264a;
    public final b0 f43265b;

    public x(b0 b0Var, int i10) {
        this.f43264a = i10;
        this.f43265b = b0Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f43264a) {
            case 0:
                vg.r rVar = this.f43265b.f43121g0.f43740r;
                if (rVar != null) {
                    rVar.setPaused(false);
                    return;
                }
                return;
            default:
                vg.r rVar2 = this.f43265b.f43121g0.f43740r;
                if (rVar2 != null) {
                    rVar2.setPaused(false);
                    return;
                }
                return;
        }
    }
}
