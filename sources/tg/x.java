package tg;

import android.content.DialogInterface;
public final class x implements DialogInterface.OnShowListener {
    public final int f43549a;
    public final a0 f43550b;

    public x(a0 a0Var, int i10) {
        this.f43549a = i10;
        this.f43550b = a0Var;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f43549a) {
            case 0:
                vg.r rVar = this.f43550b.f43402g0.f44043r;
                if (rVar != null) {
                    rVar.setPaused(true);
                    return;
                }
                return;
            default:
                vg.r rVar2 = this.f43550b.f43402g0.f44043r;
                if (rVar2 != null) {
                    rVar2.setPaused(true);
                    return;
                }
                return;
        }
    }
}
