package ph;

import android.content.DialogInterface;
public final class t8 implements DialogInterface.OnDismissListener {
    public final int f42451a;
    public final da f42452b;

    public t8(da daVar, int i10) {
        this.f42451a = i10;
        this.f42452b = daVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f42451a) {
            case 0:
                da daVar = this.f42452b;
                daVar.U0.x(3, false);
                daVar.f41551n0 = null;
                return;
            default:
                s9 s9Var = this.f42452b.U0;
                if (s9Var != null) {
                    s9Var.x(4, false);
                    return;
                }
                return;
        }
    }
}
