package tg;

import android.content.DialogInterface;
public final class x implements DialogInterface.OnDismissListener {
    public final int f43259a;
    public final b0 f43260b;

    public x(b0 b0Var, int i10) {
        this.f43259a = i10;
        this.f43260b = b0Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f43259a) {
            case 0:
                vg.r rVar = this.f43260b.f43116g0.f43735r;
                if (rVar != null) {
                    rVar.setPaused(false);
                    return;
                }
                return;
            default:
                vg.r rVar2 = this.f43260b.f43116g0.f43735r;
                if (rVar2 != null) {
                    rVar2.setPaused(false);
                    return;
                }
                return;
        }
    }
}
