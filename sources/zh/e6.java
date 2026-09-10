package zh;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import java.util.ArrayList;
public final class e6 extends FrameLayout {
    public a3 f48384a;
    public long f48385b;
    public ArrayList f48386c;
    public boolean d;
    public final k7 e;

    public e6(k7 k7Var, Context context) {
        super(context);
        this.e = k7Var;
    }

    public final void a(boolean z10) {
        if (this.d != z10) {
            this.d = z10;
            invalidate();
            this.f48384a.setIsVisible(z10);
            this.e.A();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (!this.d) {
            return;
        }
        super.dispatchDraw(canvas);
    }
}
