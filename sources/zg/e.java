package zg;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class e extends ImageView {
    public long f54505a;
    public final f f54506b;

    public e(f fVar, Context context) {
        super(context);
        this.f54506b = fVar;
        this.f54505a = 0L;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Utilities.Callback callback;
        int action = motionEvent.getAction();
        f fVar = this.f54506b;
        if (action == 0) {
            if (System.currentTimeMillis() < this.f54505a + 350) {
                return false;
            }
            this.f54505a = System.currentTimeMillis();
            fVar.f54518b = true;
            fVar.f54519c = false;
            AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.r(fVar, 350, 11), 350);
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            fVar.f54518b = false;
            if (!fVar.f54519c && (callback = fVar.d) != null) {
                callback.run(Boolean.FALSE);
                try {
                    fVar.f54517a.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
        }
        super.onTouchEvent(motionEvent);
        return true;
    }
}
