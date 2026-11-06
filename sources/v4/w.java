package v4;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
public final class w extends GestureDetector.SimpleOnGestureListener {
    public boolean f57090a = true;
    public final y f57091b;

    public w(y yVar) {
        this.f57091b = yVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
        d1 T;
        if (this.f57090a) {
            y yVar = this.f57091b;
            View m10 = yVar.m(motionEvent);
            v vVar = yVar.f57103y;
            if (m10 != null && (T = yVar.H.T(m10)) != null) {
                RecyclerView recyclerView = yVar.H;
                int e10 = vVar.e(recyclerView, T);
                WeakHashMap weakHashMap = r0.i0.f54097a;
                if ((vVar.b(e10, recyclerView.getLayoutDirection()) & 16711680) != 0) {
                    int pointerId = motionEvent.getPointerId(0);
                    int i7 = yVar.f57102x;
                    if (pointerId == i7) {
                        int findPointerIndex = motionEvent.findPointerIndex(i7);
                        float x10 = motionEvent.getX(findPointerIndex);
                        float y10 = motionEvent.getY(findPointerIndex);
                        yVar.d = x10;
                        yVar.f57096e = y10;
                        yVar.f57099r = 0.0f;
                        yVar.f57098n = 0.0f;
                        if (vVar.k()) {
                            yVar.r(T, 2);
                        }
                    }
                }
            }
        }
    }
}
