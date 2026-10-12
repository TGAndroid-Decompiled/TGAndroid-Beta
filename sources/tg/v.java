package tg;

import android.content.DialogInterface;
public final class v implements DialogInterface.OnDismissListener {
    public final int f48626a;
    public final z f48627b;

    public v(z zVar, int i10) {
        this.f48626a = i10;
        this.f48627b = zVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f48626a) {
            case 0:
                vg.r rVar = this.f48627b.f48666g0.f49142r;
                if (rVar != null) {
                    rVar.setPaused(false);
                    return;
                }
                return;
            default:
                vg.r rVar2 = this.f48627b.f48666g0.f49142r;
                if (rVar2 != null) {
                    rVar2.setPaused(false);
                    return;
                }
                return;
        }
    }
}
