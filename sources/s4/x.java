package s4;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
public final class x extends GestureDetector.SimpleOnGestureListener {
    public boolean f48038a = true;
    public final z f48039b;

    public x(z zVar) {
        this.f48039b = zVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
        d1 T;
        if (this.f48038a) {
            z zVar = this.f48039b;
            View k10 = zVar.k(motionEvent);
            w wVar = zVar.f48056x;
            if (k10 != null && (T = zVar.H.T(k10)) != null) {
                RecyclerView recyclerView = zVar.H;
                int e7 = wVar.e(recyclerView, T);
                WeakHashMap weakHashMap = r0.i0.f46981a;
                if ((wVar.b(e7, recyclerView.getLayoutDirection()) & 16711680) != 0) {
                    int pointerId = motionEvent.getPointerId(0);
                    int i10 = zVar.f48055w;
                    if (pointerId == i10) {
                        int findPointerIndex = motionEvent.findPointerIndex(i10);
                        float x10 = motionEvent.getX(findPointerIndex);
                        float y3 = motionEvent.getY(findPointerIndex);
                        zVar.d = x10;
                        zVar.f48050e = y3;
                        zVar.f48053r = 0.0f;
                        zVar.f48052n = 0.0f;
                        if (wVar.k()) {
                            zVar.p(T, 2);
                        }
                    }
                }
            }
        }
    }
}
