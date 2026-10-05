package zg;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import qg.f2;
public final class e extends ImageView {
    public long f53373a;
    public final f f53374b;

    public e(f fVar, Context context) {
        super(context);
        this.f53374b = fVar;
        this.f53373a = 0L;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Utilities.Callback callback;
        int action = motionEvent.getAction();
        f fVar = this.f53374b;
        if (action == 0) {
            if (System.currentTimeMillis() < this.f53373a + 350) {
                return false;
            }
            this.f53373a = System.currentTimeMillis();
            fVar.f53379b = true;
            fVar.f53380c = false;
            AndroidUtilities.runOnUIThread(new f2(fVar, 350, 5), 350);
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            fVar.f53379b = false;
            if (!fVar.f53380c && (callback = fVar.d) != null) {
                callback.run(Boolean.FALSE);
                try {
                    fVar.f53378a.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
        }
        super.onTouchEvent(motionEvent);
        return true;
    }
}
