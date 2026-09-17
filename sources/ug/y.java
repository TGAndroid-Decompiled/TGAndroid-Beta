package ug;

import android.content.DialogInterface;
public final class y implements DialogInterface.OnShowListener {
    public final int f47256a;
    public final b0 f47257b;

    public y(b0 b0Var, int i10) {
        this.f47256a = i10;
        this.f47257b = b0Var;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f47256a) {
            case 0:
                wg.r rVar = this.f47257b.f47103g0.f47826r;
                if (rVar != null) {
                    rVar.setPaused(true);
                    return;
                }
                return;
            default:
                wg.r rVar2 = this.f47257b.f47103g0.f47826r;
                if (rVar2 != null) {
                    rVar2.setPaused(true);
                    return;
                }
                return;
        }
    }
}
