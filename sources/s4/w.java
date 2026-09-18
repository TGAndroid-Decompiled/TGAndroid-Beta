package s4;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
public final class w extends GestureDetector.SimpleOnGestureListener {
    public boolean f42834a = true;
    public final y f42835b;

    public w(y yVar) {
        this.f42835b = yVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
        c1 U;
        if (this.f42834a) {
            y yVar = this.f42835b;
            View k10 = yVar.k(motionEvent);
            v vVar = yVar.f42850x;
            if (k10 != null && (U = yVar.H.U(k10)) != null) {
                RecyclerView recyclerView = yVar.H;
                int e = vVar.e(recyclerView, U);
                WeakHashMap weakHashMap = r0.i0.f41870a;
                if ((vVar.b(e, recyclerView.getLayoutDirection()) & 16711680) != 0) {
                    int pointerId = motionEvent.getPointerId(0);
                    int i10 = yVar.f42849w;
                    if (pointerId == i10) {
                        int findPointerIndex = motionEvent.findPointerIndex(i10);
                        float x10 = motionEvent.getX(findPointerIndex);
                        float y3 = motionEvent.getY(findPointerIndex);
                        yVar.d = x10;
                        yVar.e = y3;
                        yVar.f42847r = 0.0f;
                        yVar.f42846n = 0.0f;
                        if (vVar.k()) {
                            yVar.p(U, 2);
                        }
                    }
                }
            }
        }
    }
}
