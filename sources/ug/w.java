package ug;

import android.content.DialogInterface;
public final class w implements DialogInterface.OnShowListener {
    public final int f47774a;
    public final z f47775b;

    public w(z zVar, int i10) {
        this.f47774a = i10;
        this.f47775b = zVar;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f47774a) {
            case 0:
                wg.r rVar = this.f47775b.f47809g0.f48356r;
                if (rVar != null) {
                    rVar.setPaused(true);
                    return;
                }
                return;
            default:
                wg.r rVar2 = this.f47775b.f47809g0.f48356r;
                if (rVar2 != null) {
                    rVar2.setPaused(true);
                    return;
                }
                return;
        }
    }
}
