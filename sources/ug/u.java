package ug;

import android.content.DialogInterface;
public final class u implements DialogInterface.OnDismissListener {
    public final int f48206a;
    public final y f48207b;

    public u(y yVar, int i10) {
        this.f48206a = i10;
        this.f48207b = yVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f48206a) {
            case 0:
                wg.r rVar = this.f48207b.f48245g0.f48797r;
                if (rVar != null) {
                    rVar.setPaused(false);
                    return;
                }
                return;
            default:
                wg.r rVar2 = this.f48207b.f48245g0.f48797r;
                if (rVar2 != null) {
                    rVar2.setPaused(false);
                    return;
                }
                return;
        }
    }
}
