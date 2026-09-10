package sg;

import android.content.DialogInterface;
public final class x implements DialogInterface.OnShowListener {
    public final int f42021a;
    public final a0 f42022b;

    public x(a0 a0Var, int i10) {
        this.f42021a = i10;
        this.f42022b = a0Var;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f42021a) {
            case 0:
                ug.r rVar = this.f42022b.f41852g0.f42147r;
                if (rVar != null) {
                    rVar.setPaused(true);
                    return;
                }
                return;
            default:
                ug.r rVar2 = this.f42022b.f41852g0.f42147r;
                if (rVar2 != null) {
                    rVar2.setPaused(true);
                    return;
                }
                return;
        }
    }
}
