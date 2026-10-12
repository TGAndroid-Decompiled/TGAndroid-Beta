package tg;

import android.content.DialogInterface;
public final class w implements DialogInterface.OnShowListener {
    public final int f48659a;
    public final a0 f48660b;

    public w(a0 a0Var, int i10) {
        this.f48659a = i10;
        this.f48660b = a0Var;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f48659a) {
            case 0:
                vg.r rVar = this.f48660b.f48511g0.f49150r;
                if (rVar != null) {
                    rVar.setPaused(true);
                    return;
                }
                return;
            default:
                vg.r rVar2 = this.f48660b.f48511g0.f49150r;
                if (rVar2 != null) {
                    rVar2.setPaused(true);
                    return;
                }
                return;
        }
    }
}
