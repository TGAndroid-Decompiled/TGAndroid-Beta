package ug;

import android.content.DialogInterface;
public final class v implements DialogInterface.OnDismissListener {
    public final int f47773a;
    public final z f47774b;

    public v(z zVar, int i10) {
        this.f47773a = i10;
        this.f47774b = zVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f47773a) {
            case 0:
                wg.r rVar = this.f47774b.f47812g0.f48359r;
                if (rVar != null) {
                    rVar.setPaused(false);
                    return;
                }
                return;
            default:
                wg.r rVar2 = this.f47774b.f47812g0.f48359r;
                if (rVar2 != null) {
                    rVar2.setPaused(false);
                    return;
                }
                return;
        }
    }
}
