package yh;

import android.content.DialogInterface;
public final class v1 implements DialogInterface.OnDismissListener {
    public final int f53425a;
    public final s3 f53426b;

    public v1(s3 s3Var, int i10) {
        this.f53425a = i10;
        this.f53426b = s3Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f53425a) {
            case 0:
                this.f53426b.f53300k0.setLoading(false);
                return;
            default:
                this.f53426b.f53300k0.setLoading(false);
                return;
        }
    }
}
