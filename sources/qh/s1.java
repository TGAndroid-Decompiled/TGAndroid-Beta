package qh;

import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.rc;
public abstract class s1 {
    public int f46088a;
    public float f46089b;
    public float f46090c;
    public float d = 0.0f;
    public int f46091e = 0;
    public final RectF f46092f = new RectF();
    public final rc f46093g;
    public final org.telegram.ui.Components.z5 h;

    public s1(v1 v1Var) {
        this.f46093g = new rc(v1Var);
        this.h = new org.telegram.ui.Components.z5(v1Var, 350L, pr.h);
    }

    public abstract void a(Canvas canvas, float f10, float f11);

    public void b(boolean z4) {
    }
}
