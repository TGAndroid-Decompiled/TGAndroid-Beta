package ug;

import android.content.DialogInterface;
public final class v implements DialogInterface.OnDismissListener {
    public final int f47810a;
    public final z f47811b;

    public v(z zVar, int i10) {
        this.f47810a = i10;
        this.f47811b = zVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f47810a) {
            case 0:
                wg.r rVar = this.f47811b.f47849g0.f48396r;
                if (rVar != null) {
                    rVar.setPaused(false);
                    return;
                }
                return;
            default:
                wg.r rVar2 = this.f47811b.f47849g0.f48396r;
                if (rVar2 != null) {
                    rVar2.setPaused(false);
                    return;
                }
                return;
        }
    }
}
