package s4;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
public final class x extends GestureDetector.SimpleOnGestureListener {
    public boolean f47851a = true;
    public final z f47852b;

    public x(z zVar) {
        this.f47852b = zVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
        d1 T;
        if (this.f47851a) {
            z zVar = this.f47852b;
            View k10 = zVar.k(motionEvent);
            w wVar = zVar.f47869x;
            if (k10 != null && (T = zVar.H.T(k10)) != null) {
                RecyclerView recyclerView = zVar.H;
                int e7 = wVar.e(recyclerView, T);
                WeakHashMap weakHashMap = r0.i0.f46810a;
                if ((wVar.b(e7, recyclerView.getLayoutDirection()) & 16711680) != 0) {
                    int pointerId = motionEvent.getPointerId(0);
                    int i10 = zVar.f47868w;
                    if (pointerId == i10) {
                        int findPointerIndex = motionEvent.findPointerIndex(i10);
                        float x10 = motionEvent.getX(findPointerIndex);
                        float y3 = motionEvent.getY(findPointerIndex);
                        zVar.d = x10;
                        zVar.f47863e = y3;
                        zVar.f47866r = 0.0f;
                        zVar.f47865n = 0.0f;
                        if (wVar.k()) {
                            zVar.p(T, 2);
                        }
                    }
                }
            }
        }
    }
}
