package tg;

import android.content.DialogInterface;
public final class v implements DialogInterface.OnDismissListener {
    public final int f48655a;
    public final a0 f48656b;

    public v(a0 a0Var, int i10) {
        this.f48655a = i10;
        this.f48656b = a0Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f48655a) {
            case 0:
                vg.r rVar = this.f48656b.f48511g0.f49150r;
                if (rVar != null) {
                    rVar.setPaused(false);
                    return;
                }
                return;
            default:
                vg.r rVar2 = this.f48656b.f48511g0.f49150r;
                if (rVar2 != null) {
                    rVar2.setPaused(false);
                    return;
                }
                return;
        }
    }
}
