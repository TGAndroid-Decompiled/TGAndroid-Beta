package ug;

import android.content.DialogInterface;
public final class v implements DialogInterface.OnDismissListener {
    public final int f47774a;
    public final z f47775b;

    public v(z zVar, int i10) {
        this.f47774a = i10;
        this.f47775b = zVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f47774a) {
            case 0:
                wg.r rVar = this.f47775b.f47813g0.f48360r;
                if (rVar != null) {
                    rVar.setPaused(false);
                    return;
                }
                return;
            default:
                wg.r rVar2 = this.f47775b.f47813g0.f48360r;
                if (rVar2 != null) {
                    rVar2.setPaused(false);
                    return;
                }
                return;
        }
    }
}
