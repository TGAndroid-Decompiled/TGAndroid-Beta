package yh;

import android.content.DialogInterface;
public final class v1 implements DialogInterface.OnDismissListener {
    public final int f53348a;
    public final s3 f53349b;

    public v1(s3 s3Var, int i10) {
        this.f53348a = i10;
        this.f53349b = s3Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f53348a) {
            case 0:
                this.f53349b.f53223k0.setLoading(false);
                return;
            default:
                this.f53349b.f53223k0.setLoading(false);
                return;
        }
    }
}
