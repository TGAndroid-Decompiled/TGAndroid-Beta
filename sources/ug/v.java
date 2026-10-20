package ug;

import android.content.DialogInterface;
public final class v implements DialogInterface.OnDismissListener {
    public final int f47770a;
    public final z f47771b;

    public v(z zVar, int i10) {
        this.f47770a = i10;
        this.f47771b = zVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f47770a) {
            case 0:
                wg.r rVar = this.f47771b.f47809g0.f48356r;
                if (rVar != null) {
                    rVar.setPaused(false);
                    return;
                }
                return;
            default:
                wg.r rVar2 = this.f47771b.f47809g0.f48356r;
                if (rVar2 != null) {
                    rVar2.setPaused(false);
                    return;
                }
                return;
        }
    }
}
