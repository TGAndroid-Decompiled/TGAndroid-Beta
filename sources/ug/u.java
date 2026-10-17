package ug;

import android.content.DialogInterface;
public final class u implements DialogInterface.OnDismissListener {
    public final int f47782a;
    public final y f47783b;

    public u(y yVar, int i10) {
        this.f47782a = i10;
        this.f47783b = yVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f47782a) {
            case 0:
                wg.r rVar = this.f47783b.f47821g0.f48371r;
                if (rVar != null) {
                    rVar.setPaused(false);
                    return;
                }
                return;
            default:
                wg.r rVar2 = this.f47783b.f47821g0.f48371r;
                if (rVar2 != null) {
                    rVar2.setPaused(false);
                    return;
                }
                return;
        }
    }
}
