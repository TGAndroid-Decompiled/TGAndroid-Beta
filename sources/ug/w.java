package ug;

import android.content.DialogInterface;
public final class w implements DialogInterface.OnShowListener {
    public final int f47814a;
    public final z f47815b;

    public w(z zVar, int i10) {
        this.f47814a = i10;
        this.f47815b = zVar;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f47814a) {
            case 0:
                wg.r rVar = this.f47815b.f47849g0.f48396r;
                if (rVar != null) {
                    rVar.setPaused(true);
                    return;
                }
                return;
            default:
                wg.r rVar2 = this.f47815b.f47849g0.f48396r;
                if (rVar2 != null) {
                    rVar2.setPaused(true);
                    return;
                }
                return;
        }
    }
}
