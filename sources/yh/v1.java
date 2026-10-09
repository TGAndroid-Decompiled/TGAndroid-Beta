package yh;

import android.content.DialogInterface;
public final class v1 implements DialogInterface.OnDismissListener {
    public final int f53304a;
    public final s3 f53305b;

    public v1(s3 s3Var, int i10) {
        this.f53304a = i10;
        this.f53305b = s3Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f53304a) {
            case 0:
                this.f53305b.f53179k0.setLoading(false);
                return;
            default:
                this.f53305b.f53179k0.setLoading(false);
                return;
        }
    }
}
