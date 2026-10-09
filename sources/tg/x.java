package tg;

import android.content.DialogInterface;
public final class x implements DialogInterface.OnShowListener {
    public final int f48425a;
    public final a0 f48426b;

    public x(a0 a0Var, int i10) {
        this.f48425a = i10;
        this.f48426b = a0Var;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f48425a) {
            case 0:
                vg.r rVar = this.f48426b.f48272g0.f48914r;
                if (rVar != null) {
                    rVar.setPaused(true);
                    return;
                }
                return;
            default:
                vg.r rVar2 = this.f48426b.f48272g0.f48914r;
                if (rVar2 != null) {
                    rVar2.setPaused(true);
                    return;
                }
                return;
        }
    }
}
