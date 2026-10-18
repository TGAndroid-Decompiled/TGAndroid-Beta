package ug;

import android.content.DialogInterface;
public final class v implements DialogInterface.OnDismissListener {
    public final int f47763a;
    public final z f47764b;

    public v(z zVar, int i10) {
        this.f47763a = i10;
        this.f47764b = zVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f47763a) {
            case 0:
                wg.r rVar = this.f47764b.f47802g0.f48349r;
                if (rVar != null) {
                    rVar.setPaused(false);
                    return;
                }
                return;
            default:
                wg.r rVar2 = this.f47764b.f47802g0.f48349r;
                if (rVar2 != null) {
                    rVar2.setPaused(false);
                    return;
                }
                return;
        }
    }
}
