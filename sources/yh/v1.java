package yh;

import android.content.DialogInterface;
public final class v1 implements DialogInterface.OnDismissListener {
    public final int f53391a;
    public final s3 f53392b;

    public v1(s3 s3Var, int i10) {
        this.f53391a = i10;
        this.f53392b = s3Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f53391a) {
            case 0:
                this.f53392b.f53266k0.setLoading(false);
                return;
            default:
                this.f53392b.f53266k0.setLoading(false);
                return;
        }
    }
}
