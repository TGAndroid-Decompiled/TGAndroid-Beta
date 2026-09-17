package tg;

import android.content.DialogInterface;
public final class y implements DialogInterface.OnShowListener {
    public final int f43263a;
    public final b0 f43264b;

    public y(b0 b0Var, int i10) {
        this.f43263a = i10;
        this.f43264b = b0Var;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f43263a) {
            case 0:
                vg.r rVar = this.f43264b.f43116g0.f43735r;
                if (rVar != null) {
                    rVar.setPaused(true);
                    return;
                }
                return;
            default:
                vg.r rVar2 = this.f43264b.f43116g0.f43735r;
                if (rVar2 != null) {
                    rVar2.setPaused(true);
                    return;
                }
                return;
        }
    }
}
