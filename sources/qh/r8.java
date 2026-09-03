package qh;

import android.content.DialogInterface;
public final class r8 implements DialogInterface.OnDismissListener {
    public final int f46045a;
    public final ba f46046b;

    public r8(ba baVar, int i10) {
        this.f46045a = i10;
        this.f46046b = baVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f46045a) {
            case 0:
                ba baVar = this.f46046b;
                baVar.U0.x(3, false);
                baVar.f45082n0 = null;
                return;
            default:
                p9 p9Var = this.f46046b.U0;
                if (p9Var != null) {
                    p9Var.x(4, false);
                    return;
                }
                return;
        }
    }
}
