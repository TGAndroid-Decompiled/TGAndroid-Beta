package v4;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
public final class w extends GestureDetector.SimpleOnGestureListener {
    public boolean f59241a = true;
    public final y f59242b;

    public w(y yVar) {
        this.f59242b = yVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
        e1 T;
        if (this.f59241a) {
            y yVar = this.f59242b;
            View m10 = yVar.m(motionEvent);
            v vVar = yVar.f59259y;
            if (m10 != null && (T = yVar.I.T(m10)) != null) {
                RecyclerView recyclerView = yVar.I;
                int e10 = vVar.e(recyclerView, T);
                WeakHashMap weakHashMap = r0.i0.f56254a;
                if ((vVar.b(e10, recyclerView.getLayoutDirection()) & 16711680) != 0) {
                    int pointerId = motionEvent.getPointerId(0);
                    int i7 = yVar.f59258x;
                    if (pointerId == i7) {
                        int findPointerIndex = motionEvent.findPointerIndex(i7);
                        float x10 = motionEvent.getX(findPointerIndex);
                        float y10 = motionEvent.getY(findPointerIndex);
                        yVar.d = x10;
                        yVar.f59252e = y10;
                        yVar.f59255r = 0.0f;
                        yVar.f59254n = 0.0f;
                        if (vVar.k()) {
                            yVar.r(T, 2);
                        }
                    }
                }
            }
        }
    }
}
