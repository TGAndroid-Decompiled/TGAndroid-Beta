package tg;

import android.content.DialogInterface;
public final class v implements DialogInterface.OnDismissListener {
    public final int f48485a;
    public final z f48486b;

    public v(z zVar, int i10) {
        this.f48485a = i10;
        this.f48486b = zVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f48485a) {
            case 0:
                vg.r rVar = this.f48486b.f48525g0.f49001r;
                if (rVar != null) {
                    rVar.setPaused(false);
                    return;
                }
                return;
            default:
                vg.r rVar2 = this.f48486b.f48525g0.f49001r;
                if (rVar2 != null) {
                    rVar2.setPaused(false);
                    return;
                }
                return;
        }
    }
}
