package zh;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.GestureDetector;
import android.view.animation.OvershootInterpolator;
import android.widget.Scroller;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
public final class a4 extends g3 {
    public final u7 N;
    public final g4 O;

    public a4(Context context, g4 g4Var, u7 u7Var) {
        super(context);
        this.O = g4Var;
        this.N = u7Var;
        this.f48437w = -1;
        this.E = new ArrayList();
        this.F = new ArrayList();
        this.G = new ArrayList();
        this.I = new GestureDetector(new rg.c(1, this));
        this.d = new Scroller(context, new OvershootInterpolator());
        this.H = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, i0.a.k(-16777216, 160)});
    }

    @Override
    public final void b(int i10) {
        q7 q7Var;
        g4 g4Var = this.O;
        b4 b4Var = g4Var.E;
        if (!g4Var.f48447w) {
            if (b4Var.getCurrentItem() != i10) {
                try {
                    b4Var.x(i10, false);
                } catch (Throwable th2) {
                    FileLog.e(th2);
                    b4Var.getAdapter().g();
                    b4Var.x(i10, false);
                }
            }
            u7 u7Var = this.N;
            if (u7Var.O0 != null && (q7Var = u7Var.f48961t0) != null) {
                if (i10 < 10) {
                    q7Var.b(false);
                } else if (i10 >= this.E.size() - 10) {
                    u7Var.f48961t0.b(true);
                }
            }
        }
    }
}
