package th;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class s5 extends ImageReceiver {
    public final Runnable[] J1;
    public final org.telegram.ui.web.x0 K1;

    public s5(Runnable[] runnableArr, org.telegram.ui.web.x0 x0Var) {
        super(null);
        this.J1 = runnableArr;
        this.K1 = x0Var;
    }

    @Override
    public final boolean x0(Drawable drawable, String str, int i10, boolean z10, int i11) {
        boolean x02 = super.x0(drawable, str, i10, z10, i11);
        Runnable runnable = this.J1[0];
        if (runnable != null) {
            org.telegram.messenger.i0.r(runnable);
            ((o0) this.K1.d).run();
        }
        org.telegram.messenger.i0.g3(new sg.v(this, 16));
        return x02;
    }
}
