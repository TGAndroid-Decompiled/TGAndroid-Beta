package ug;

import android.content.DialogInterface;
public final class x implements DialogInterface.OnDismissListener {
    public final int f47223a;
    public final b0 f47224b;

    public x(b0 b0Var, int i10) {
        this.f47223a = i10;
        this.f47224b = b0Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f47223a) {
            case 0:
                wg.r rVar = this.f47224b.f47074g0.f47797r;
                if (rVar != null) {
                    rVar.setPaused(false);
                    return;
                }
                return;
            default:
                wg.r rVar2 = this.f47224b.f47074g0.f47797r;
                if (rVar2 != null) {
                    rVar2.setPaused(false);
                    return;
                }
                return;
        }
    }
}
