package s4;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
public final class x extends GestureDetector.SimpleOnGestureListener {
    public boolean f47897a = true;
    public final z f47898b;

    public x(z zVar) {
        this.f47898b = zVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
        d1 T;
        if (this.f47897a) {
            z zVar = this.f47898b;
            View k10 = zVar.k(motionEvent);
            w wVar = zVar.f47915x;
            if (k10 != null && (T = zVar.H.T(k10)) != null) {
                RecyclerView recyclerView = zVar.H;
                int e7 = wVar.e(recyclerView, T);
                WeakHashMap weakHashMap = r0.i0.f46856a;
                if ((wVar.b(e7, recyclerView.getLayoutDirection()) & 16711680) != 0) {
                    int pointerId = motionEvent.getPointerId(0);
                    int i10 = zVar.f47914w;
                    if (pointerId == i10) {
                        int findPointerIndex = motionEvent.findPointerIndex(i10);
                        float x10 = motionEvent.getX(findPointerIndex);
                        float y3 = motionEvent.getY(findPointerIndex);
                        zVar.d = x10;
                        zVar.f47909e = y3;
                        zVar.f47912r = 0.0f;
                        zVar.f47911n = 0.0f;
                        if (wVar.k()) {
                            zVar.p(T, 2);
                        }
                    }
                }
            }
        }
    }
}
