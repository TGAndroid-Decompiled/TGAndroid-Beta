package ug;

import android.content.DialogInterface;
public final class w implements DialogInterface.OnShowListener {
    public final int f47769a;
    public final z f47770b;

    public w(z zVar, int i10) {
        this.f47769a = i10;
        this.f47770b = zVar;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f47769a) {
            case 0:
                wg.r rVar = this.f47770b.f47804g0.f48351r;
                if (rVar != null) {
                    rVar.setPaused(true);
                    return;
                }
                return;
            default:
                wg.r rVar2 = this.f47770b.f47804g0.f48351r;
                if (rVar2 != null) {
                    rVar2.setPaused(true);
                    return;
                }
                return;
        }
    }
}
