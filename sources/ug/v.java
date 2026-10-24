package ug;

import android.content.DialogInterface;
public final class v implements DialogInterface.OnShowListener {
    public final int f48210a;
    public final y f48211b;

    public v(y yVar, int i10) {
        this.f48210a = i10;
        this.f48211b = yVar;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f48210a) {
            case 0:
                wg.r rVar = this.f48211b.f48245g0.f48797r;
                if (rVar != null) {
                    rVar.setPaused(true);
                    return;
                }
                return;
            default:
                wg.r rVar2 = this.f48211b.f48245g0.f48797r;
                if (rVar2 != null) {
                    rVar2.setPaused(true);
                    return;
                }
                return;
        }
    }
}
