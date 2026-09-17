package ug;

import android.content.DialogInterface;
public final class x implements DialogInterface.OnDismissListener {
    public final int f47224a;
    public final b0 f47225b;

    public x(b0 b0Var, int i10) {
        this.f47224a = i10;
        this.f47225b = b0Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f47224a) {
            case 0:
                wg.r rVar = this.f47225b.f47075g0.f47798r;
                if (rVar != null) {
                    rVar.setPaused(false);
                    return;
                }
                return;
            default:
                wg.r rVar2 = this.f47225b.f47075g0.f47798r;
                if (rVar2 != null) {
                    rVar2.setPaused(false);
                    return;
                }
                return;
        }
    }
}
