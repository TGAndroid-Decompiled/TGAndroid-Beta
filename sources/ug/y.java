package ug;

import android.content.DialogInterface;
public final class y implements DialogInterface.OnShowListener {
    public final int f47228a;
    public final b0 f47229b;

    public y(b0 b0Var, int i10) {
        this.f47228a = i10;
        this.f47229b = b0Var;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f47228a) {
            case 0:
                wg.r rVar = this.f47229b.f47075g0.f47798r;
                if (rVar != null) {
                    rVar.setPaused(true);
                    return;
                }
                return;
            default:
                wg.r rVar2 = this.f47229b.f47075g0.f47798r;
                if (rVar2 != null) {
                    rVar2.setPaused(true);
                    return;
                }
                return;
        }
    }
}
