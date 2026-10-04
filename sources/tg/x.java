package tg;

import android.content.DialogInterface;
public final class x implements DialogInterface.OnShowListener {
    public final int f47110a;
    public final a0 f47111b;

    public x(a0 a0Var, int i10) {
        this.f47110a = i10;
        this.f47111b = a0Var;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f47110a) {
            case 0:
                vg.r rVar = this.f47111b.f46956g0.f47640r;
                if (rVar != null) {
                    rVar.setPaused(true);
                    return;
                }
                return;
            default:
                vg.r rVar2 = this.f47111b.f46956g0.f47640r;
                if (rVar2 != null) {
                    rVar2.setPaused(true);
                    return;
                }
                return;
        }
    }
}
