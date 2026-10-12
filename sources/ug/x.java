package ug;

import android.content.DialogInterface;
public final class x implements DialogInterface.OnShowListener {
    public final int f46406a;
    public final a0 f46407b;

    public x(a0 a0Var, int i10) {
        this.f46406a = i10;
        this.f46407b = a0Var;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f46406a) {
            case 0:
                wg.r rVar = this.f46407b.f46260g0.f46964r;
                if (rVar != null) {
                    rVar.setPaused(true);
                    return;
                }
                return;
            default:
                wg.r rVar2 = this.f46407b.f46260g0.f46964r;
                if (rVar2 != null) {
                    rVar2.setPaused(true);
                    return;
                }
                return;
        }
    }
}
