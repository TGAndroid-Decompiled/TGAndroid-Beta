package sg;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageView;
import org.telegram.messenger.r20;
public final class e extends ImageView {
    public long f48328a;
    public final f f48329b;

    public e(f fVar, Context context) {
        super(context);
        this.f48329b = fVar;
        this.f48328a = 0L;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        r20 r20Var;
        int action = motionEvent.getAction();
        f fVar = this.f48329b;
        if (action == 0) {
            if (System.currentTimeMillis() < this.f48328a + 350) {
                return false;
            }
            this.f48328a = System.currentTimeMillis();
            fVar.f48336b = true;
            fVar.f48337c = false;
            org.telegram.messenger.i0.h3(new org.telegram.utils.twidget.v(fVar, 350, 3), 350);
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            fVar.f48336b = false;
            if (!fVar.f48337c && (r20Var = fVar.d) != null) {
                r20Var.a(Boolean.FALSE);
                try {
                    fVar.f48335a.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
        }
        super.onTouchEvent(motionEvent);
        return true;
    }
}
