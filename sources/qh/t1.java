package qh;

import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.rc;
public abstract class t1 {
    public int f46108a;
    public float f46109b;
    public float f46110c;
    public float d = 0.0f;
    public int f46111e = 0;
    public final RectF f46112f = new RectF();
    public final rc f46113g;
    public final org.telegram.ui.Components.z5 h;

    public t1(w1 w1Var) {
        this.f46113g = new rc(w1Var);
        this.h = new org.telegram.ui.Components.z5(w1Var, 350L, pr.h);
    }

    public abstract void a(Canvas canvas, float f10, float f11);

    public void b(boolean z4) {
    }
}
