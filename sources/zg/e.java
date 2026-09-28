package zg;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class e extends ImageView {
    public long f49288a;
    public final f f49289b;

    public e(f fVar, Context context) {
        super(context);
        this.f49289b = fVar;
        this.f49288a = 0L;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Utilities.Callback callback;
        int action = motionEvent.getAction();
        f fVar = this.f49289b;
        if (action == 0) {
            if (System.currentTimeMillis() < this.f49288a + 350) {
                return false;
            }
            this.f49288a = System.currentTimeMillis();
            fVar.f49296b = true;
            fVar.f49297c = false;
            AndroidUtilities.runOnUIThread(new qg.v(fVar, 350, 6), 350);
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            fVar.f49296b = false;
            if (!fVar.f49297c && (callback = fVar.d) != null) {
                callback.run(Boolean.FALSE);
                try {
                    fVar.f49295a.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
        }
        super.onTouchEvent(motionEvent);
        return true;
    }
}
