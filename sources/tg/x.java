package tg;

import android.content.DialogInterface;
public final class x implements DialogInterface.OnShowListener {
    public final int f43504a;
    public final a0 f43505b;

    public x(a0 a0Var, int i10) {
        this.f43504a = i10;
        this.f43505b = a0Var;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f43504a) {
            case 0:
                vg.r rVar = this.f43505b.f43358g0.f43998r;
                if (rVar != null) {
                    rVar.setPaused(true);
                    return;
                }
                return;
            default:
                vg.r rVar2 = this.f43505b.f43358g0.f43998r;
                if (rVar2 != null) {
                    rVar2.setPaused(true);
                    return;
                }
                return;
        }
    }
}
