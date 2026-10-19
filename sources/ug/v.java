package ug;

import android.content.DialogInterface;
public final class v implements DialogInterface.OnDismissListener {
    public final int f47765a;
    public final z f47766b;

    public v(z zVar, int i10) {
        this.f47765a = i10;
        this.f47766b = zVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f47765a) {
            case 0:
                wg.r rVar = this.f47766b.f47804g0.f48351r;
                if (rVar != null) {
                    rVar.setPaused(false);
                    return;
                }
                return;
            default:
                wg.r rVar2 = this.f47766b.f47804g0.f48351r;
                if (rVar2 != null) {
                    rVar2.setPaused(false);
                    return;
                }
                return;
        }
    }
}
