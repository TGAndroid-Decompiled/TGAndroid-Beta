package ug;

import android.content.DialogInterface;
public final class v implements DialogInterface.OnShowListener {
    public final int f47786a;
    public final y f47787b;

    public v(y yVar, int i10) {
        this.f47786a = i10;
        this.f47787b = yVar;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f47786a) {
            case 0:
                wg.r rVar = this.f47787b.f47821g0.f48371r;
                if (rVar != null) {
                    rVar.setPaused(true);
                    return;
                }
                return;
            default:
                wg.r rVar2 = this.f47787b.f47821g0.f48371r;
                if (rVar2 != null) {
                    rVar2.setPaused(true);
                    return;
                }
                return;
        }
    }
}
