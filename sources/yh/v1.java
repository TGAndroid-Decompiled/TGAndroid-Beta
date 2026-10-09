package yh;

import android.content.DialogInterface;
public final class v1 implements DialogInterface.OnDismissListener {
    public final int f53302a;
    public final s3 f53303b;

    public v1(s3 s3Var, int i10) {
        this.f53302a = i10;
        this.f53303b = s3Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f53302a) {
            case 0:
                this.f53303b.f53177k0.setLoading(false);
                return;
            default:
                this.f53303b.f53177k0.setLoading(false);
                return;
        }
    }
}
