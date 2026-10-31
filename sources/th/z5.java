package th;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import java.util.ArrayList;
public final class z5 extends FrameLayout {
    public z2 f49786a;
    public long f49787b;
    public ArrayList f49788c;
    public boolean d;
    public final q e;

    public z5(q qVar, Context context) {
        super(context);
        this.e = qVar;
    }

    public final void a(boolean z10) {
        if (this.d != z10) {
            this.d = z10;
            invalidate();
            this.f49786a.setIsVisible(z10);
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
