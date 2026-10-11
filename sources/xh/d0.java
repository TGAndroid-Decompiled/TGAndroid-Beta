package xh;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
public final class d0 extends FrameLayout {
    public final float f51321a;

    public d0(Context context, float f7) {
        super(context);
        this.f51321a = f7;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(0.0f, 0.0f, getWidth() * this.f51321a, getHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }
}
