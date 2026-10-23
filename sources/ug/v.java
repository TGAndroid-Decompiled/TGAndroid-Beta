package ug;

import android.content.DialogInterface;
public final class v implements DialogInterface.OnShowListener {
    public final int f48211a;
    public final y f48212b;

    public v(y yVar, int i10) {
        this.f48211a = i10;
        this.f48212b = yVar;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f48211a) {
            case 0:
                wg.r rVar = this.f48212b.f48246g0.f48798r;
                if (rVar != null) {
                    rVar.setPaused(true);
                    return;
                }
                return;
            default:
                wg.r rVar2 = this.f48212b.f48246g0.f48798r;
                if (rVar2 != null) {
                    rVar2.setPaused(true);
                    return;
                }
                return;
        }
    }
}
