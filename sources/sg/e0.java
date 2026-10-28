package sg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.pt0;
public final class e0 extends View {
    public final pt0 f48228a;

    public e0(pt0 pt0Var, Context context) {
        super(context);
        this.f48228a = pt0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        c0 c0Var = this.f48228a.L0;
        if (c0Var != null) {
            c0Var.d(canvas);
        }
    }
}
