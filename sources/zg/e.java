package zg;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class e extends ImageView {
    public long f48959a;
    public final f f48960b;

    public e(f fVar, Context context) {
        super(context);
        this.f48960b = fVar;
        this.f48959a = 0L;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Utilities.Callback callback;
        int action = motionEvent.getAction();
        f fVar = this.f48960b;
        if (action == 0) {
            if (System.currentTimeMillis() < this.f48959a + 350) {
                return false;
            }
            this.f48959a = System.currentTimeMillis();
            fVar.f48964b = true;
            fVar.f48965c = false;
            AndroidUtilities.runOnUIThread(new qg.v(fVar, 350, 6), 350);
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            fVar.f48964b = false;
            if (!fVar.f48965c && (callback = fVar.d) != null) {
                callback.run(Boolean.FALSE);
                try {
                    fVar.f48963a.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
        }
        super.onTouchEvent(motionEvent);
        return true;
    }
}
