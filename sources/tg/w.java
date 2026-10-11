package tg;

import android.content.DialogInterface;
public final class w implements DialogInterface.OnShowListener {
    public final int f48523a;
    public final z f48524b;

    public w(z zVar, int i10) {
        this.f48523a = i10;
        this.f48524b = zVar;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f48523a) {
            case 0:
                vg.r rVar = this.f48524b.f48559g0.f49035r;
                if (rVar != null) {
                    rVar.setPaused(true);
                    return;
                }
                return;
            default:
                vg.r rVar2 = this.f48524b.f48559g0.f49035r;
                if (rVar2 != null) {
                    rVar2.setPaused(true);
                    return;
                }
                return;
        }
    }
}
