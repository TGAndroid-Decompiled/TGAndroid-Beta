package tg;

import android.content.DialogInterface;
public final class y implements DialogInterface.OnShowListener {
    public final int f43191a;
    public final b0 f43192b;

    public y(b0 b0Var, int i10) {
        this.f43191a = i10;
        this.f43192b = b0Var;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f43191a) {
            case 0:
                vg.r rVar = this.f43192b.f43045g0.f43660r;
                if (rVar != null) {
                    rVar.setPaused(true);
                    return;
                }
                return;
            default:
                vg.r rVar2 = this.f43192b.f43045g0.f43660r;
                if (rVar2 != null) {
                    rVar2.setPaused(true);
                    return;
                }
                return;
        }
    }
}
