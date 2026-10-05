package tg;

import android.content.DialogInterface;
public final class x implements DialogInterface.OnShowListener {
    public final int f47126a;
    public final a0 f47127b;

    public x(a0 a0Var, int i10) {
        this.f47126a = i10;
        this.f47127b = a0Var;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f47126a) {
            case 0:
                vg.r rVar = this.f47127b.f46971g0.f47656r;
                if (rVar != null) {
                    rVar.setPaused(true);
                    return;
                }
                return;
            default:
                vg.r rVar2 = this.f47127b.f46971g0.f47656r;
                if (rVar2 != null) {
                    rVar2.setPaused(true);
                    return;
                }
                return;
        }
    }
}
