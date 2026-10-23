package ug;

import android.content.DialogInterface;
public final class u implements DialogInterface.OnDismissListener {
    public final int f48207a;
    public final y f48208b;

    public u(y yVar, int i10) {
        this.f48207a = i10;
        this.f48208b = yVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f48207a) {
            case 0:
                wg.r rVar = this.f48208b.f48246g0.f48798r;
                if (rVar != null) {
                    rVar.setPaused(false);
                    return;
                }
                return;
            default:
                wg.r rVar2 = this.f48208b.f48246g0.f48798r;
                if (rVar2 != null) {
                    rVar2.setPaused(false);
                    return;
                }
                return;
        }
    }
}
