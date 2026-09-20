package zg;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class e extends ImageView {
    public long f49315a;
    public final f f49316b;

    public e(f fVar, Context context) {
        super(context);
        this.f49316b = fVar;
        this.f49315a = 0L;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Utilities.Callback callback;
        int action = motionEvent.getAction();
        f fVar = this.f49316b;
        if (action == 0) {
            if (System.currentTimeMillis() < this.f49315a + 350) {
                return false;
            }
            this.f49315a = System.currentTimeMillis();
            fVar.f49323b = true;
            fVar.f49324c = false;
            AndroidUtilities.runOnUIThread(new qg.v(fVar, 350, 6), 350);
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            fVar.f49323b = false;
            if (!fVar.f49324c && (callback = fVar.d) != null) {
                callback.run(Boolean.FALSE);
                try {
                    fVar.f49322a.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
        }
        super.onTouchEvent(motionEvent);
        return true;
    }
}
