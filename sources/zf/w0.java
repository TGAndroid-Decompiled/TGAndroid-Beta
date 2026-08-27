package zf;

import android.graphics.Bitmap;
import android.widget.FrameLayout;
import lh.r5;
import lh.rb;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

public final class w0 implements Utilities.Callback2 {

    public final int f50744a;

    public final FrameLayout f50745b;

    public w0(int i10, FrameLayout frameLayout) {
        this.f50744a = i10;
        this.f50745b = frameLayout;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f50744a) {
            case 0:
                r5 r5Var = (r5) this.f50745b;
                r5Var.f50395u0 = ((Integer) obj).intValue();
                r5Var.f50396v0 = ((Integer) obj2).intValue();
                AndroidUtilities.runOnUIThread(new qf.b(r5Var, 24), 60L);
                break;
            default:
                ((rb) this.f50745b).Z((Bitmap) obj, ((Float) obj2).floatValue());
                break;
        }
    }
}
