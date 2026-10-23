package ug;

import android.content.DialogInterface;
public final class w implements DialogInterface.OnShowListener {
    public final int f47778a;
    public final z f47779b;

    public w(z zVar, int i10) {
        this.f47778a = i10;
        this.f47779b = zVar;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f47778a) {
            case 0:
                wg.r rVar = this.f47779b.f47813g0.f48360r;
                if (rVar != null) {
                    rVar.setPaused(true);
                    return;
                }
                return;
            default:
                wg.r rVar2 = this.f47779b.f47813g0.f48360r;
                if (rVar2 != null) {
                    rVar2.setPaused(true);
                    return;
                }
                return;
        }
    }
}
