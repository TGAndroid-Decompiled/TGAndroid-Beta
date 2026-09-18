package zg;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ai1;
public final class e extends ImageView {
    public long f49269a;
    public final f f49270b;

    public e(f fVar, Context context) {
        super(context);
        this.f49270b = fVar;
        this.f49269a = 0L;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Utilities.Callback callback;
        int action = motionEvent.getAction();
        f fVar = this.f49270b;
        if (action == 0) {
            if (System.currentTimeMillis() < this.f49269a + 350) {
                return false;
            }
            this.f49269a = System.currentTimeMillis();
            fVar.f49277b = true;
            fVar.f49278c = false;
            AndroidUtilities.runOnUIThread(new ai1(fVar, 350, 8), 350);
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            fVar.f49277b = false;
            if (!fVar.f49278c && (callback = fVar.d) != null) {
                callback.run(Boolean.FALSE);
                try {
                    fVar.f49276a.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
        }
        super.onTouchEvent(motionEvent);
        return true;
    }
}
