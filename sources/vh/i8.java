package vh;

import android.graphics.Canvas;
import org.telegram.ui.LaunchActivity;
public final class i8 extends j8 {
    public final th.l f51286g;
    public final float h;

    public i8(th.l lVar, float f7) {
        this.f51286g = lVar;
        this.h = f7;
    }

    @Override
    public final void a(Canvas canvas, float f7) {
        float pow = (float) Math.pow(f7, 16.0d);
        th.l lVar = this.f51286g;
        float f10 = this.h;
        lVar.c(canvas, f10, f10, pow);
    }

    @Override
    public final void e() {
        th.l lVar = this.f51286g;
        lVar.post(new th.k(lVar, 1));
    }

    @Override
    public final void f(boolean z10) {
        th.l lVar = this.f51286g;
        lVar.f49159x = true;
        lVar.invalidate();
        if (z10) {
            int[] iArr = new int[2];
            lVar.getLocationInWindow(iArr);
            LaunchActivity.b0((lVar.getWidth() / 2.0f) + iArr[0], (lVar.getHeight() / 2.0f) + iArr[1], 1.0f);
        }
    }
}
