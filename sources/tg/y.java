package tg;

import android.content.DialogInterface;
public final class y implements DialogInterface.OnShowListener {
    public final int f43240a;
    public final b0 f43241b;

    public y(b0 b0Var, int i10) {
        this.f43240a = i10;
        this.f43241b = b0Var;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f43240a) {
            case 0:
                vg.r rVar = this.f43241b.f43094g0.f43712r;
                if (rVar != null) {
                    rVar.setPaused(true);
                    return;
                }
                return;
            default:
                vg.r rVar2 = this.f43241b.f43094g0.f43712r;
                if (rVar2 != null) {
                    rVar2.setPaused(true);
                    return;
                }
                return;
        }
    }
}
