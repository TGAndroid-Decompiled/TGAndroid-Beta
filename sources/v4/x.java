package v4;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
public final class x extends GestureDetector.SimpleOnGestureListener {
    public boolean f59251a = true;
    public final z f59252b;

    public x(z zVar) {
        this.f59252b = zVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
        f1 T;
        if (this.f59251a) {
            z zVar = this.f59252b;
            View m10 = zVar.m(motionEvent);
            w wVar = zVar.f59269y;
            if (m10 != null && (T = zVar.I.T(m10)) != null) {
                RecyclerView recyclerView = zVar.I;
                int e10 = wVar.e(recyclerView, T);
                WeakHashMap weakHashMap = r0.i0.f56244a;
                if ((wVar.b(e10, recyclerView.getLayoutDirection()) & 16711680) != 0) {
                    int pointerId = motionEvent.getPointerId(0);
                    int i7 = zVar.f59268x;
                    if (pointerId == i7) {
                        int findPointerIndex = motionEvent.findPointerIndex(i7);
                        float x10 = motionEvent.getX(findPointerIndex);
                        float y10 = motionEvent.getY(findPointerIndex);
                        zVar.d = x10;
                        zVar.f59262e = y10;
                        zVar.f59265r = 0.0f;
                        zVar.f59264n = 0.0f;
                        if (wVar.k()) {
                            zVar.r(T, 2);
                        }
                    }
                }
            }
        }
    }
}
