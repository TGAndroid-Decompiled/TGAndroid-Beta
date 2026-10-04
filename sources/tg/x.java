package tg;

import android.content.DialogInterface;
public final class x implements DialogInterface.OnShowListener {
    public final int f47111a;
    public final a0 f47112b;

    public x(a0 a0Var, int i10) {
        this.f47111a = i10;
        this.f47112b = a0Var;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f47111a) {
            case 0:
                vg.r rVar = this.f47112b.f46957g0.f47641r;
                if (rVar != null) {
                    rVar.setPaused(true);
                    return;
                }
                return;
            default:
                vg.r rVar2 = this.f47112b.f46957g0.f47641r;
                if (rVar2 != null) {
                    rVar2.setPaused(true);
                    return;
                }
                return;
        }
    }
}
