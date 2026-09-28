package zg;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class e extends ImageView {
    public long f49289a;
    public final f f49290b;

    public e(f fVar, Context context) {
        super(context);
        this.f49290b = fVar;
        this.f49289a = 0L;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Utilities.Callback callback;
        int action = motionEvent.getAction();
        f fVar = this.f49290b;
        if (action == 0) {
            if (System.currentTimeMillis() < this.f49289a + 350) {
                return false;
            }
            this.f49289a = System.currentTimeMillis();
            fVar.f49297b = true;
            fVar.f49298c = false;
            AndroidUtilities.runOnUIThread(new qg.v(fVar, 350, 6), 350);
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            fVar.f49297b = false;
            if (!fVar.f49298c && (callback = fVar.d) != null) {
                callback.run(Boolean.FALSE);
                try {
                    fVar.f49296a.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
        }
        super.onTouchEvent(motionEvent);
        return true;
    }
}
