package s4;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
public final class x extends GestureDetector.SimpleOnGestureListener {
    public boolean f47805a = true;
    public final z f47806b;

    public x(z zVar) {
        this.f47806b = zVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
        d1 T;
        if (this.f47805a) {
            z zVar = this.f47806b;
            View k10 = zVar.k(motionEvent);
            w wVar = zVar.f47823x;
            if (k10 != null && (T = zVar.H.T(k10)) != null) {
                RecyclerView recyclerView = zVar.H;
                int e7 = wVar.e(recyclerView, T);
                WeakHashMap weakHashMap = r0.i0.f46764a;
                if ((wVar.b(e7, recyclerView.getLayoutDirection()) & 16711680) != 0) {
                    int pointerId = motionEvent.getPointerId(0);
                    int i10 = zVar.f47822w;
                    if (pointerId == i10) {
                        int findPointerIndex = motionEvent.findPointerIndex(i10);
                        float x10 = motionEvent.getX(findPointerIndex);
                        float y3 = motionEvent.getY(findPointerIndex);
                        zVar.d = x10;
                        zVar.f47817e = y3;
                        zVar.f47820r = 0.0f;
                        zVar.f47819n = 0.0f;
                        if (wVar.k()) {
                            zVar.p(T, 2);
                        }
                    }
                }
            }
        }
    }
}
