package ph;

import android.graphics.Canvas;
import org.telegram.ui.LaunchActivity;
public final class x9 extends y9 {
    public final nh.p f42567g;
    public final float h;

    public x9(nh.p pVar, float f10) {
        this.f42567g = pVar;
        this.h = f10;
    }

    @Override
    public final void a(Canvas canvas, float f10) {
        float pow = (float) Math.pow(f10, 16.0d);
        nh.p pVar = this.f42567g;
        float f11 = this.h;
        pVar.c(canvas, f11, f11, pow);
    }

    @Override
    public final void e() {
        nh.p pVar = this.f42567g;
        pVar.post(new nh.o(pVar, 1));
    }

    @Override
    public final void f(boolean z4) {
        nh.p pVar = this.f42567g;
        pVar.f15733w = true;
        pVar.invalidate();
        if (z4) {
            int[] iArr = new int[2];
            pVar.getLocationInWindow(iArr);
            LaunchActivity.b0((pVar.getWidth() / 2.0f) + iArr[0], (pVar.getHeight() / 2.0f) + iArr[1], 1.0f);
        }
    }
}
