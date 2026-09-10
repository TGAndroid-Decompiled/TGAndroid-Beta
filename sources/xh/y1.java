package xh;

import android.content.DialogInterface;
public final class y1 implements DialogInterface.OnDismissListener {
    public final int f46324a;
    public final x3 f46325b;

    public y1(x3 x3Var, int i10) {
        this.f46324a = i10;
        this.f46325b = x3Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f46324a) {
            case 0:
                this.f46325b.f46285j0.setLoading(false);
                return;
            default:
                this.f46325b.f46285j0.setLoading(false);
                return;
        }
    }
}
