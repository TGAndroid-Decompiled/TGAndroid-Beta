package tg;

import android.content.DialogInterface;
public final class x implements DialogInterface.OnShowListener {
    public final int f47119a;
    public final a0 f47120b;

    public x(a0 a0Var, int i10) {
        this.f47119a = i10;
        this.f47120b = a0Var;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f47119a) {
            case 0:
                vg.r rVar = this.f47120b.f46964g0.f47649r;
                if (rVar != null) {
                    rVar.setPaused(true);
                    return;
                }
                return;
            default:
                vg.r rVar2 = this.f47120b.f46964g0.f47649r;
                if (rVar2 != null) {
                    rVar2.setPaused(true);
                    return;
                }
                return;
        }
    }
}
