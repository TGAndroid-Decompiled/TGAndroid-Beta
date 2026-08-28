package yf;

import android.graphics.Bitmap;
import android.widget.FrameLayout;
import kh.s5;
import kh.vb;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class w0 implements Utilities.Callback2 {
    public final int f50149a;
    public final FrameLayout f50150b;

    public w0(int i9, FrameLayout frameLayout) {
        this.f50149a = i9;
        this.f50150b = frameLayout;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f50149a) {
            case 0:
                s5 s5Var = (s5) this.f50150b;
                s5Var.f49800u0 = ((Integer) obj).intValue();
                s5Var.f49801v0 = ((Integer) obj2).intValue();
                AndroidUtilities.runOnUIThread(new pf.o1(s5Var, 17), 60L);
                return;
            default:
                ((vb) this.f50150b).Z((Bitmap) obj, ((Float) obj2).floatValue());
                return;
        }
    }
}
