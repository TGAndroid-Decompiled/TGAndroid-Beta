package zg;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import qg.f2;
public final class e extends ImageView {
    public long f53363a;
    public final f f53364b;

    public e(f fVar, Context context) {
        super(context);
        this.f53364b = fVar;
        this.f53363a = 0L;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Utilities.Callback callback;
        int action = motionEvent.getAction();
        f fVar = this.f53364b;
        if (action == 0) {
            if (System.currentTimeMillis() < this.f53363a + 350) {
                return false;
            }
            this.f53363a = System.currentTimeMillis();
            fVar.f53373b = true;
            fVar.f53374c = false;
            AndroidUtilities.runOnUIThread(new f2(fVar, 350, 5), 350);
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            fVar.f53373b = false;
            if (!fVar.f53374c && (callback = fVar.d) != null) {
                callback.run(Boolean.FALSE);
                try {
                    fVar.f53372a.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
        }
        super.onTouchEvent(motionEvent);
        return true;
    }
}
