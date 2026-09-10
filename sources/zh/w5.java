package zh;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
public final class w5 extends ImageReceiver {
    public final Runnable[] f49010a;
    public final org.telegram.ui.web.a1 f49011b;

    public w5(Runnable[] runnableArr, org.telegram.ui.web.a1 a1Var) {
        this.f49010a = runnableArr;
        this.f49011b = a1Var;
    }

    @Override
    public final boolean setImageBitmapByKey(Drawable drawable, String str, int i10, boolean z10, int i11) {
        boolean imageBitmapByKey = super.setImageBitmapByKey(drawable, str, i10, z10, i11);
        Runnable runnable = this.f49010a[0];
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            ((yg.q) this.f49011b.d).run();
        }
        AndroidUtilities.runOnUIThread(new k5(this, 2));
        return imageBitmapByKey;
    }
}
