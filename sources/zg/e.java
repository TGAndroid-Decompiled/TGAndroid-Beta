package zg;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class e extends ImageView {
    public long f54594a;
    public final f f54595b;

    public e(f fVar, Context context) {
        super(context);
        this.f54595b = fVar;
        this.f54594a = 0L;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Utilities.Callback callback;
        int action = motionEvent.getAction();
        f fVar = this.f54595b;
        if (action == 0) {
            if (System.currentTimeMillis() < this.f54594a + 350) {
                return false;
            }
            this.f54594a = System.currentTimeMillis();
            fVar.f54607b = true;
            fVar.f54608c = false;
            AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.j(fVar, 350, 12), 350);
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            fVar.f54607b = false;
            if (!fVar.f54608c && (callback = fVar.d) != null) {
                callback.run(Boolean.FALSE);
                try {
                    fVar.f54606a.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
        }
        super.onTouchEvent(motionEvent);
        return true;
    }
}
