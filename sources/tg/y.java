package tg;

import android.content.DialogInterface;
public final class y implements DialogInterface.OnShowListener {
    public final int f43268a;
    public final b0 f43269b;

    public y(b0 b0Var, int i10) {
        this.f43268a = i10;
        this.f43269b = b0Var;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f43268a) {
            case 0:
                vg.r rVar = this.f43269b.f43121g0.f43740r;
                if (rVar != null) {
                    rVar.setPaused(true);
                    return;
                }
                return;
            default:
                vg.r rVar2 = this.f43269b.f43121g0.f43740r;
                if (rVar2 != null) {
                    rVar2.setPaused(true);
                    return;
                }
                return;
        }
    }
}
