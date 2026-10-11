package tg;

import android.content.DialogInterface;
public final class w implements DialogInterface.OnShowListener {
    public final int f48489a;
    public final z f48490b;

    public w(z zVar, int i10) {
        this.f48489a = i10;
        this.f48490b = zVar;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f48489a) {
            case 0:
                vg.r rVar = this.f48490b.f48525g0.f49001r;
                if (rVar != null) {
                    rVar.setPaused(true);
                    return;
                }
                return;
            default:
                vg.r rVar2 = this.f48490b.f48525g0.f49001r;
                if (rVar2 != null) {
                    rVar2.setPaused(true);
                    return;
                }
                return;
        }
    }
}
