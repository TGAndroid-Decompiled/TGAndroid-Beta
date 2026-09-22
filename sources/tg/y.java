package tg;

import android.content.DialogInterface;
public final class y implements DialogInterface.OnShowListener {
    public final int f43236a;
    public final b0 f43237b;

    public y(b0 b0Var, int i10) {
        this.f43236a = i10;
        this.f43237b = b0Var;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f43236a) {
            case 0:
                vg.r rVar = this.f43237b.f43090g0.f43708r;
                if (rVar != null) {
                    rVar.setPaused(true);
                    return;
                }
                return;
            default:
                vg.r rVar2 = this.f43237b.f43090g0.f43708r;
                if (rVar2 != null) {
                    rVar2.setPaused(true);
                    return;
                }
                return;
        }
    }
}
