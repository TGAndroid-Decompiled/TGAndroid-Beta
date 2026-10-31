package sg;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageView;
import org.telegram.messenger.q20;
public final class e extends ImageView {
    public long f48317a;
    public final f f48318b;

    public e(f fVar, Context context) {
        super(context);
        this.f48318b = fVar;
        this.f48317a = 0L;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        q20 q20Var;
        int action = motionEvent.getAction();
        f fVar = this.f48318b;
        if (action == 0) {
            if (System.currentTimeMillis() < this.f48317a + 350) {
                return false;
            }
            this.f48317a = System.currentTimeMillis();
            fVar.f48325b = true;
            fVar.f48326c = false;
            org.telegram.messenger.i0.h3(new org.telegram.utils.twidget.v(fVar, 350, 3), 350);
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            fVar.f48325b = false;
            if (!fVar.f48326c && (q20Var = fVar.d) != null) {
                q20Var.a(Boolean.FALSE);
                try {
                    fVar.f48324a.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
        }
        super.onTouchEvent(motionEvent);
        return true;
    }
}
