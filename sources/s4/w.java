package s4;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
public final class w extends GestureDetector.SimpleOnGestureListener {
    public boolean f43200a = true;
    public final y f43201b;

    public w(y yVar) {
        this.f43201b = yVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
        c1 T;
        if (this.f43200a) {
            y yVar = this.f43201b;
            View k10 = yVar.k(motionEvent);
            v vVar = yVar.f43216x;
            if (k10 != null && (T = yVar.H.T(k10)) != null) {
                RecyclerView recyclerView = yVar.H;
                int e = vVar.e(recyclerView, T);
                WeakHashMap weakHashMap = r0.i0.f42233a;
                if ((vVar.b(e, recyclerView.getLayoutDirection()) & 16711680) != 0) {
                    int pointerId = motionEvent.getPointerId(0);
                    int i10 = yVar.f43215w;
                    if (pointerId == i10) {
                        int findPointerIndex = motionEvent.findPointerIndex(i10);
                        float x10 = motionEvent.getX(findPointerIndex);
                        float y3 = motionEvent.getY(findPointerIndex);
                        yVar.d = x10;
                        yVar.e = y3;
                        yVar.f43213r = 0.0f;
                        yVar.f43212n = 0.0f;
                        if (vVar.k()) {
                            yVar.p(T, 2);
                        }
                    }
                }
            }
        }
    }
}
