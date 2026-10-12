package yh;

import android.content.DialogInterface;
public final class v1 implements DialogInterface.OnDismissListener {
    public final int f53528a;
    public final s3 f53529b;

    public v1(s3 s3Var, int i10) {
        this.f53528a = i10;
        this.f53529b = s3Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f53528a) {
            case 0:
                this.f53529b.f53403k0.setLoading(false);
                return;
            default:
                this.f53529b.f53403k0.setLoading(false);
                return;
        }
    }
}
