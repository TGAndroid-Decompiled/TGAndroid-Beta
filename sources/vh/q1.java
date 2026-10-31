package vh;

import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.ui.Components.dc;
import org.telegram.ui.Components.gr;
public abstract class q1 {
    public int f51781a;
    public float f51782b;
    public float f51783c;
    public float d = 0.0f;
    public int e = 0;
    public final RectF f51784f = new RectF();
    public final dc f51785g;
    public final org.telegram.ui.Components.t5 h;

    public q1(org.telegram.ui.ActionBar.f5 f5Var) {
        this.f51785g = new dc(f5Var);
        this.h = new org.telegram.ui.Components.t5(f5Var, 350L, gr.h);
    }

    public abstract void a(Canvas canvas, float f7, float f10);

    public void b(boolean z10) {
    }
}
