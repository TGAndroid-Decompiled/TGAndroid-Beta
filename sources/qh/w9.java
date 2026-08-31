package qh;

import android.graphics.Canvas;
import org.telegram.ui.LaunchActivity;
public final class w9 extends x9 {
    public final oh.o f46240g;
    public final float h;

    public w9(oh.o oVar, float f10) {
        this.f46240g = oVar;
        this.h = f10;
    }

    @Override
    public final void a(Canvas canvas, float f10) {
        float pow = (float) Math.pow(f10, 16.0d);
        oh.o oVar = this.f46240g;
        float f11 = this.h;
        oVar.c(canvas, f11, f11, pow);
    }

    @Override
    public final void e() {
        oh.o oVar = this.f46240g;
        oVar.post(new oh.n(oVar, 1));
    }

    @Override
    public final void f(boolean z4) {
        oh.o oVar = this.f46240g;
        oVar.f17524w = true;
        oVar.invalidate();
        if (z4) {
            int[] iArr = new int[2];
            oVar.getLocationInWindow(iArr);
            LaunchActivity.b0((oVar.getWidth() / 2.0f) + iArr[0], (oVar.getHeight() / 2.0f) + iArr[1], 1.0f);
        }
    }
}
