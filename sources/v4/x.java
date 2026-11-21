package v4;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
public final class x extends GestureDetector.SimpleOnGestureListener {
    public boolean f59290a = true;
    public final z f59291b;

    public x(z zVar) {
        this.f59291b = zVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
        f1 T;
        if (this.f59290a) {
            z zVar = this.f59291b;
            View m10 = zVar.m(motionEvent);
            w wVar = zVar.f59308y;
            if (m10 != null && (T = zVar.I.T(m10)) != null) {
                RecyclerView recyclerView = zVar.I;
                int e10 = wVar.e(recyclerView, T);
                WeakHashMap weakHashMap = r0.i0.f56285a;
                if ((wVar.b(e10, recyclerView.getLayoutDirection()) & 16711680) != 0) {
                    int pointerId = motionEvent.getPointerId(0);
                    int i7 = zVar.f59307x;
                    if (pointerId == i7) {
                        int findPointerIndex = motionEvent.findPointerIndex(i7);
                        float x10 = motionEvent.getX(findPointerIndex);
                        float y10 = motionEvent.getY(findPointerIndex);
                        zVar.d = x10;
                        zVar.f59301e = y10;
                        zVar.f59304r = 0.0f;
                        zVar.f59303n = 0.0f;
                        if (wVar.k()) {
                            zVar.r(T, 2);
                        }
                    }
                }
            }
        }
    }
}
