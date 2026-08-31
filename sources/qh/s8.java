package qh;

import android.content.DialogInterface;
public final class s8 implements DialogInterface.OnDismissListener {
    public final int f46094a;
    public final ca f46095b;

    public s8(ca caVar, int i10) {
        this.f46094a = i10;
        this.f46095b = caVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f46094a) {
            case 0:
                ca caVar = this.f46095b;
                caVar.U0.x(3, false);
                caVar.f45116n0 = null;
                return;
            default:
                q9 q9Var = this.f46095b.U0;
                if (q9Var != null) {
                    q9Var.x(4, false);
                    return;
                }
                return;
        }
    }
}
