package s4;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
public final class x extends GestureDetector.SimpleOnGestureListener {
    public boolean f47893a = true;
    public final z f47894b;

    public x(z zVar) {
        this.f47894b = zVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
        e1 T;
        if (this.f47893a) {
            z zVar = this.f47894b;
            View m10 = zVar.m(motionEvent);
            w wVar = zVar.f47904x;
            if (m10 != null && (T = zVar.H.T(m10)) != null) {
                RecyclerView recyclerView = zVar.H;
                int e = wVar.e(recyclerView, T);
                WeakHashMap weakHashMap = r0.i0.f47143a;
                if ((wVar.b(e, recyclerView.getLayoutDirection()) & 16711680) != 0) {
                    int pointerId = motionEvent.getPointerId(0);
                    int i10 = zVar.f47903w;
                    if (pointerId == i10) {
                        int findPointerIndex = motionEvent.findPointerIndex(i10);
                        float x9 = motionEvent.getX(findPointerIndex);
                        float y3 = motionEvent.getY(findPointerIndex);
                        zVar.d = x9;
                        zVar.e = y3;
                        zVar.f47901r = 0.0f;
                        zVar.f47900n = 0.0f;
                        if (wVar.k()) {
                            zVar.r(T, 2);
                        }
                    }
                }
            }
        }
    }
}
