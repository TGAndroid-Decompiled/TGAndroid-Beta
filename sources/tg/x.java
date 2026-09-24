package tg;

import android.content.DialogInterface;
public final class x implements DialogInterface.OnShowListener {
    public final int f43489a;
    public final a0 f43490b;

    public x(a0 a0Var, int i10) {
        this.f43489a = i10;
        this.f43490b = a0Var;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f43489a) {
            case 0:
                vg.r rVar = this.f43490b.f43343g0.f43983r;
                if (rVar != null) {
                    rVar.setPaused(true);
                    return;
                }
                return;
            default:
                vg.r rVar2 = this.f43490b.f43343g0.f43983r;
                if (rVar2 != null) {
                    rVar2.setPaused(true);
                    return;
                }
                return;
        }
    }
}
