package s4;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
public final class w extends GestureDetector.SimpleOnGestureListener {
    public boolean f45915a = true;
    public final y f45916b;

    public w(y yVar) {
        this.f45916b = yVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
        c1 T;
        if (this.f45915a) {
            y yVar = this.f45916b;
            View k10 = yVar.k(motionEvent);
            v vVar = yVar.f45933x;
            if (k10 != null && (T = yVar.H.T(k10)) != null) {
                RecyclerView recyclerView = yVar.H;
                int e7 = vVar.e(recyclerView, T);
                WeakHashMap weakHashMap = r0.i0.f44726a;
                if ((vVar.b(e7, recyclerView.getLayoutDirection()) & 16711680) != 0) {
                    int pointerId = motionEvent.getPointerId(0);
                    int i10 = yVar.f45932w;
                    if (pointerId == i10) {
                        int findPointerIndex = motionEvent.findPointerIndex(i10);
                        float x10 = motionEvent.getX(findPointerIndex);
                        float y3 = motionEvent.getY(findPointerIndex);
                        yVar.d = x10;
                        yVar.f45927e = y3;
                        yVar.f45930r = 0.0f;
                        yVar.f45929n = 0.0f;
                        if (vVar.k()) {
                            yVar.p(T, 2);
                        }
                    }
                }
            }
        }
    }
}
