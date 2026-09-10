package sg;

import android.content.DialogInterface;
public final class w implements DialogInterface.OnDismissListener {
    public final int f42017a;
    public final a0 f42018b;

    public w(a0 a0Var, int i10) {
        this.f42017a = i10;
        this.f42018b = a0Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f42017a) {
            case 0:
                ug.r rVar = this.f42018b.f41852g0.f42147r;
                if (rVar != null) {
                    rVar.setPaused(false);
                    return;
                }
                return;
            default:
                ug.r rVar2 = this.f42018b.f41852g0.f42147r;
                if (rVar2 != null) {
                    rVar2.setPaused(false);
                    return;
                }
                return;
        }
    }
}
