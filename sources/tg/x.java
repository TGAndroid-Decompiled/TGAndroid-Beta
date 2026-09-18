package tg;

import android.content.DialogInterface;
public final class x implements DialogInterface.OnShowListener {
    public final int f43474a;
    public final a0 f43475b;

    public x(a0 a0Var, int i10) {
        this.f43474a = i10;
        this.f43475b = a0Var;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f43474a) {
            case 0:
                vg.r rVar = this.f43475b.f43327g0.f43970r;
                if (rVar != null) {
                    rVar.setPaused(true);
                    return;
                }
                return;
            default:
                vg.r rVar2 = this.f43475b.f43327g0.f43970r;
                if (rVar2 != null) {
                    rVar2.setPaused(true);
                    return;
                }
                return;
        }
    }
}
