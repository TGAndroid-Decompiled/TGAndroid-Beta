package ph;

import android.content.DialogInterface;
public final class u8 implements DialogInterface.OnDismissListener {
    public final int f42450a;
    public final da f42451b;

    public u8(da daVar, int i10) {
        this.f42450a = i10;
        this.f42451b = daVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f42450a) {
            case 0:
                da daVar = this.f42451b;
                daVar.U0.x(3, false);
                daVar.f41513n0 = null;
                return;
            default:
                s9 s9Var = this.f42451b.U0;
                if (s9Var != null) {
                    s9Var.x(4, false);
                    return;
                }
                return;
        }
    }
}
