package ug;

import android.content.DialogInterface;
public final class w implements DialogInterface.OnShowListener {
    public final int f47767a;
    public final z f47768b;

    public w(z zVar, int i10) {
        this.f47767a = i10;
        this.f47768b = zVar;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f47767a) {
            case 0:
                wg.r rVar = this.f47768b.f47802g0.f48349r;
                if (rVar != null) {
                    rVar.setPaused(true);
                    return;
                }
                return;
            default:
                wg.r rVar2 = this.f47768b.f47802g0.f48349r;
                if (rVar2 != null) {
                    rVar2.setPaused(true);
                    return;
                }
                return;
        }
    }
}
