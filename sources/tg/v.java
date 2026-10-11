package tg;

import android.content.DialogInterface;
public final class v implements DialogInterface.OnDismissListener {
    public final int f48519a;
    public final z f48520b;

    public v(z zVar, int i10) {
        this.f48519a = i10;
        this.f48520b = zVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f48519a) {
            case 0:
                vg.r rVar = this.f48520b.f48559g0.f49035r;
                if (rVar != null) {
                    rVar.setPaused(false);
                    return;
                }
                return;
            default:
                vg.r rVar2 = this.f48520b.f48559g0.f49035r;
                if (rVar2 != null) {
                    rVar2.setPaused(false);
                    return;
                }
                return;
        }
    }
}
