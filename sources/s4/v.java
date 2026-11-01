package s4;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
public final class v extends GestureDetector.SimpleOnGestureListener {
    public boolean f48029a = true;
    public final x f48030b;

    public v(x xVar) {
        this.f48030b = xVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
        c1 T;
        if (this.f48029a) {
            x xVar = this.f48030b;
            View m10 = xVar.m(motionEvent);
            u uVar = xVar.f48041y;
            if (m10 != null && (T = xVar.H.T(m10)) != null) {
                RecyclerView recyclerView = xVar.H;
                int e = uVar.e(recyclerView, T);
                WeakHashMap weakHashMap = r0.h0.f46134a;
                if ((uVar.b(e, recyclerView.getLayoutDirection()) & 16711680) != 0) {
                    int pointerId = motionEvent.getPointerId(0);
                    int i10 = xVar.f48040x;
                    if (pointerId == i10) {
                        int findPointerIndex = motionEvent.findPointerIndex(i10);
                        float x10 = motionEvent.getX(findPointerIndex);
                        float y3 = motionEvent.getY(findPointerIndex);
                        xVar.d = x10;
                        xVar.e = y3;
                        xVar.f48037r = 0.0f;
                        xVar.f48036n = 0.0f;
                        if (uVar.k()) {
                            xVar.r(T, 2);
                        }
                    }
                }
            }
        }
    }
}
