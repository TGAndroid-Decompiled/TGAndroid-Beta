package ug;

import android.content.DialogInterface;
public final class w implements DialogInterface.OnDismissListener {
    public final int f46402a;
    public final a0 f46403b;

    public w(a0 a0Var, int i10) {
        this.f46402a = i10;
        this.f46403b = a0Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f46402a) {
            case 0:
                wg.r rVar = this.f46403b.f46260g0.f46964r;
                if (rVar != null) {
                    rVar.setPaused(false);
                    return;
                }
                return;
            default:
                wg.r rVar2 = this.f46403b.f46260g0.f46964r;
                if (rVar2 != null) {
                    rVar2.setPaused(false);
                    return;
                }
                return;
        }
    }
}
