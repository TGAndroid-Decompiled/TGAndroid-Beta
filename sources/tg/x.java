package tg;

import android.content.DialogInterface;
public final class x implements DialogInterface.OnDismissListener {
    public final int f43187a;
    public final b0 f43188b;

    public x(b0 b0Var, int i10) {
        this.f43187a = i10;
        this.f43188b = b0Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f43187a) {
            case 0:
                vg.r rVar = this.f43188b.f43045g0.f43660r;
                if (rVar != null) {
                    rVar.setPaused(false);
                    return;
                }
                return;
            default:
                vg.r rVar2 = this.f43188b.f43045g0.f43660r;
                if (rVar2 != null) {
                    rVar2.setPaused(false);
                    return;
                }
                return;
        }
    }
}
