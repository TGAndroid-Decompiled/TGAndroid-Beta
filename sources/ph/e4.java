package ph;

import android.content.DialogInterface;
public final class e4 implements DialogInterface.OnDismissListener {
    public final int f41603a;
    public final c5 f41604b;

    public e4(c5 c5Var, int i10) {
        this.f41603a = i10;
        this.f41604b = c5Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f41603a) {
            case 0:
                this.f41604b.z0(false);
                return;
            default:
                this.f41604b.z0(false);
                return;
        }
    }
}
