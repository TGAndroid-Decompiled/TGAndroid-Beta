package v4;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
public final class x extends GestureDetector.SimpleOnGestureListener {
    public boolean f59294a = true;
    public final z f59295b;

    public x(z zVar) {
        this.f59295b = zVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
        f1 T;
        if (this.f59294a) {
            z zVar = this.f59295b;
            View m10 = zVar.m(motionEvent);
            w wVar = zVar.f59312y;
            if (m10 != null && (T = zVar.I.T(m10)) != null) {
                RecyclerView recyclerView = zVar.I;
                int e10 = wVar.e(recyclerView, T);
                WeakHashMap weakHashMap = r0.i0.f56289a;
                if ((wVar.b(e10, recyclerView.getLayoutDirection()) & 16711680) != 0) {
                    int pointerId = motionEvent.getPointerId(0);
                    int i7 = zVar.f59311x;
                    if (pointerId == i7) {
                        int findPointerIndex = motionEvent.findPointerIndex(i7);
                        float x10 = motionEvent.getX(findPointerIndex);
                        float y10 = motionEvent.getY(findPointerIndex);
                        zVar.d = x10;
                        zVar.f59305e = y10;
                        zVar.f59308r = 0.0f;
                        zVar.f59307n = 0.0f;
                        if (wVar.k()) {
                            zVar.r(T, 2);
                        }
                    }
                }
            }
        }
    }
}
