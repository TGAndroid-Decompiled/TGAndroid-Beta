package ph;

import android.content.DialogInterface;
public final class e4 implements DialogInterface.OnDismissListener {
    public final int f41565a;
    public final c5 f41566b;

    public e4(c5 c5Var, int i10) {
        this.f41565a = i10;
        this.f41566b = c5Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f41565a) {
            case 0:
                this.f41566b.z0(false);
                return;
            default:
                this.f41566b.z0(false);
                return;
        }
    }
}
