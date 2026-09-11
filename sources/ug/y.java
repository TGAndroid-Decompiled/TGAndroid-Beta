package ug;

import android.content.DialogInterface;
public final class y implements DialogInterface.OnShowListener {
    public final int f47227a;
    public final b0 f47228b;

    public y(b0 b0Var, int i10) {
        this.f47227a = i10;
        this.f47228b = b0Var;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f47227a) {
            case 0:
                wg.r rVar = this.f47228b.f47074g0.f47797r;
                if (rVar != null) {
                    rVar.setPaused(true);
                    return;
                }
                return;
            default:
                wg.r rVar2 = this.f47228b.f47074g0.f47797r;
                if (rVar2 != null) {
                    rVar2.setPaused(true);
                    return;
                }
                return;
        }
    }
}
