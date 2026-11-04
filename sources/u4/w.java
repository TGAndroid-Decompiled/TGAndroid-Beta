package u4;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
public final class w extends GestureDetector.SimpleOnGestureListener {
    public boolean f55674a = true;
    public final y f55675b;

    public w(y yVar) {
        this.f55675b = yVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
        d1 T;
        if (this.f55674a) {
            y yVar = this.f55675b;
            View m10 = yVar.m(motionEvent);
            v vVar = yVar.f55687y;
            if (m10 != null && (T = yVar.I.T(m10)) != null) {
                RecyclerView recyclerView = yVar.I;
                int e10 = vVar.e(recyclerView, T);
                WeakHashMap weakHashMap = r0.i0.f54015a;
                if ((vVar.b(e10, recyclerView.getLayoutDirection()) & 16711680) != 0) {
                    int pointerId = motionEvent.getPointerId(0);
                    int i3 = yVar.f55686x;
                    if (pointerId == i3) {
                        int findPointerIndex = motionEvent.findPointerIndex(i3);
                        float x10 = motionEvent.getX(findPointerIndex);
                        float y9 = motionEvent.getY(findPointerIndex);
                        yVar.d = x10;
                        yVar.f55680e = y9;
                        yVar.f55683r = 0.0f;
                        yVar.f55682n = 0.0f;
                        if (vVar.k()) {
                            yVar.r(T, 2);
                        }
                    }
                }
            }
        }
    }
}
