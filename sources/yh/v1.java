package yh;

import android.content.DialogInterface;
public final class v1 implements DialogInterface.OnDismissListener {
    public final int f53540a;
    public final s3 f53541b;

    public v1(s3 s3Var, int i10) {
        this.f53540a = i10;
        this.f53541b = s3Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f53540a) {
            case 0:
                this.f53541b.f53415k0.setLoading(false);
                return;
            default:
                this.f53541b.f53415k0.setLoading(false);
                return;
        }
    }
}
