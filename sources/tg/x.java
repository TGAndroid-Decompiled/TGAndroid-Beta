package tg;

import android.content.DialogInterface;
public final class x implements DialogInterface.OnShowListener {
    public final int f48423a;
    public final a0 f48424b;

    public x(a0 a0Var, int i10) {
        this.f48423a = i10;
        this.f48424b = a0Var;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f48423a) {
            case 0:
                vg.r rVar = this.f48424b.f48270g0.f48912r;
                if (rVar != null) {
                    rVar.setPaused(true);
                    return;
                }
                return;
            default:
                vg.r rVar2 = this.f48424b.f48270g0.f48912r;
                if (rVar2 != null) {
                    rVar2.setPaused(true);
                    return;
                }
                return;
        }
    }
}
