package ph;

import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.rc;
public abstract class t1 {
    public int f42388a;
    public float f42389b;
    public float f42390c;
    public float d = 0.0f;
    public int e = 0;
    public final RectF f42391f = new RectF();
    public final rc f42392g;
    public final org.telegram.ui.Components.z5 h;

    public t1(w1 w1Var) {
        this.f42392g = new rc(w1Var);
        this.h = new org.telegram.ui.Components.z5(w1Var, 350L, mr.h);
    }

    public abstract void a(Canvas canvas, float f10, float f11);

    public void b(boolean z4) {
    }
}
