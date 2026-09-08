package ug;

import android.content.DialogInterface;
public final class y implements DialogInterface.OnShowListener {
    public final int f47255a;
    public final b0 f47256b;

    public y(b0 b0Var, int i10) {
        this.f47255a = i10;
        this.f47256b = b0Var;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f47255a) {
            case 0:
                wg.r rVar = this.f47256b.f47102g0.f47825r;
                if (rVar != null) {
                    rVar.setPaused(true);
                    return;
                }
                return;
            default:
                wg.r rVar2 = this.f47256b.f47102g0.f47825r;
                if (rVar2 != null) {
                    rVar2.setPaused(true);
                    return;
                }
                return;
        }
    }
}
