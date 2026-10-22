package ug;

import android.content.DialogInterface;
public final class w implements DialogInterface.OnShowListener {
    public final int f47777a;
    public final z f47778b;

    public w(z zVar, int i10) {
        this.f47777a = i10;
        this.f47778b = zVar;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f47777a) {
            case 0:
                wg.r rVar = this.f47778b.f47812g0.f48359r;
                if (rVar != null) {
                    rVar.setPaused(true);
                    return;
                }
                return;
            default:
                wg.r rVar2 = this.f47778b.f47812g0.f48359r;
                if (rVar2 != null) {
                    rVar2.setPaused(true);
                    return;
                }
                return;
        }
    }
}
