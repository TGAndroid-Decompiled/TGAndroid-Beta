package tg;

import android.content.DialogInterface;
public final class x implements DialogInterface.OnShowListener {
    public final int f43518a;
    public final a0 f43519b;

    public x(a0 a0Var, int i10) {
        this.f43518a = i10;
        this.f43519b = a0Var;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f43518a) {
            case 0:
                vg.r rVar = this.f43519b.f43371g0.f44014r;
                if (rVar != null) {
                    rVar.setPaused(true);
                    return;
                }
                return;
            default:
                vg.r rVar2 = this.f43519b.f43371g0.f44014r;
                if (rVar2 != null) {
                    rVar2.setPaused(true);
                    return;
                }
                return;
        }
    }
}
