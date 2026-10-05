package tg;

import android.content.DialogInterface;
public final class w implements DialogInterface.OnDismissListener {
    public final int f47122a;
    public final a0 f47123b;

    public w(a0 a0Var, int i10) {
        this.f47122a = i10;
        this.f47123b = a0Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f47122a) {
            case 0:
                vg.r rVar = this.f47123b.f46971g0.f47656r;
                if (rVar != null) {
                    rVar.setPaused(false);
                    return;
                }
                return;
            default:
                vg.r rVar2 = this.f47123b.f46971g0.f47656r;
                if (rVar2 != null) {
                    rVar2.setPaused(false);
                    return;
                }
                return;
        }
    }
}
