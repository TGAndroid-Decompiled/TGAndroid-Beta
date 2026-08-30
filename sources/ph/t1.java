package ph;

import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.rc;
public abstract class t1 {
    public int f42323a;
    public float f42324b;
    public float f42325c;
    public float d = 0.0f;
    public int e = 0;
    public final RectF f42326f = new RectF();
    public final rc f42327g;
    public final org.telegram.ui.Components.z5 h;

    public t1(w1 w1Var) {
        this.f42327g = new rc(w1Var);
        this.h = new org.telegram.ui.Components.z5(w1Var, 350L, nr.h);
    }

    public abstract void a(Canvas canvas, float f10, float f11);

    public void b(boolean z4) {
    }
}
