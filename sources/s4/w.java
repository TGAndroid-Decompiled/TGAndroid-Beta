package s4;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
public final class w extends GestureDetector.SimpleOnGestureListener {
    public boolean f46046a = true;
    public final y f46047b;

    public w(y yVar) {
        this.f46047b = yVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
        b1 T;
        if (this.f46046a) {
            y yVar = this.f46047b;
            View k10 = yVar.k(motionEvent);
            v vVar = yVar.f46066x;
            if (k10 != null && (T = yVar.H.T(k10)) != null) {
                RecyclerView recyclerView = yVar.H;
                int e = vVar.e(recyclerView, T);
                WeakHashMap weakHashMap = r0.i0.f44818a;
                if ((vVar.b(e, recyclerView.getLayoutDirection()) & 16711680) != 0) {
                    int pointerId = motionEvent.getPointerId(0);
                    int i10 = yVar.f46065w;
                    if (pointerId == i10) {
                        int findPointerIndex = motionEvent.findPointerIndex(i10);
                        float x10 = motionEvent.getX(findPointerIndex);
                        float y3 = motionEvent.getY(findPointerIndex);
                        yVar.d = x10;
                        yVar.e = y3;
                        yVar.f46063r = 0.0f;
                        yVar.f46062n = 0.0f;
                        if (vVar.k()) {
                            yVar.p(T, 2);
                        }
                    }
                }
            }
        }
    }
}
