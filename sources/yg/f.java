package yg;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import pg.f2;
public final class f extends ImageView {
    public long f46993a;
    public final g f46994b;

    public f(g gVar, Context context) {
        super(context);
        this.f46994b = gVar;
        this.f46993a = 0L;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Utilities.Callback callback;
        int action = motionEvent.getAction();
        g gVar = this.f46994b;
        if (action == 0) {
            if (System.currentTimeMillis() < this.f46993a + 350) {
                return false;
            }
            this.f46993a = System.currentTimeMillis();
            gVar.f47001b = true;
            gVar.f47002c = false;
            AndroidUtilities.runOnUIThread(new f2(gVar, 350, 5), 350);
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            gVar.f47001b = false;
            if (!gVar.f47002c && (callback = gVar.d) != null) {
                callback.run(Boolean.FALSE);
                try {
                    gVar.f47000a.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
        }
        super.onTouchEvent(motionEvent);
        return true;
    }
}
