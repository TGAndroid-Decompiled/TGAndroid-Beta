package qh;

import android.graphics.Canvas;
import org.telegram.ui.LaunchActivity;
public final class v9 extends w9 {
    public final oh.o f46223g;
    public final float h;

    public v9(oh.o oVar, float f10) {
        this.f46223g = oVar;
        this.h = f10;
    }

    @Override
    public final void a(Canvas canvas, float f10) {
        float pow = (float) Math.pow(f10, 16.0d);
        oh.o oVar = this.f46223g;
        float f11 = this.h;
        oVar.c(canvas, f11, f11, pow);
    }

    @Override
    public final void e() {
        oh.o oVar = this.f46223g;
        oVar.post(new oh.n(oVar, 1));
    }

    @Override
    public final void f(boolean z4) {
        oh.o oVar = this.f46223g;
        oVar.f17526w = true;
        oVar.invalidate();
        if (z4) {
            int[] iArr = new int[2];
            oVar.getLocationInWindow(iArr);
            LaunchActivity.b0((oVar.getWidth() / 2.0f) + iArr[0], (oVar.getHeight() / 2.0f) + iArr[1], 1.0f);
        }
    }
}
