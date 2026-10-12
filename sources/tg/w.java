package tg;

import android.content.DialogInterface;
public final class w implements DialogInterface.OnShowListener {
    public final int f48630a;
    public final z f48631b;

    public w(z zVar, int i10) {
        this.f48630a = i10;
        this.f48631b = zVar;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f48630a) {
            case 0:
                vg.r rVar = this.f48631b.f48666g0.f49142r;
                if (rVar != null) {
                    rVar.setPaused(true);
                    return;
                }
                return;
            default:
                vg.r rVar2 = this.f48631b.f48666g0.f49142r;
                if (rVar2 != null) {
                    rVar2.setPaused(true);
                    return;
                }
                return;
        }
    }
}
