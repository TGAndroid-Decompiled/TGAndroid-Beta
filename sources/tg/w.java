package tg;

import android.content.DialogInterface;
public final class w implements DialogInterface.OnDismissListener {
    public final int f47107a;
    public final a0 f47108b;

    public w(a0 a0Var, int i10) {
        this.f47107a = i10;
        this.f47108b = a0Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f47107a) {
            case 0:
                vg.r rVar = this.f47108b.f46957g0.f47641r;
                if (rVar != null) {
                    rVar.setPaused(false);
                    return;
                }
                return;
            default:
                vg.r rVar2 = this.f47108b.f46957g0.f47641r;
                if (rVar2 != null) {
                    rVar2.setPaused(false);
                    return;
                }
                return;
        }
    }
}
