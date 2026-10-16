package yh;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
public final class c0 extends FrameLayout {
    public final float f48803a;

    public c0(Context context, float f7) {
        super(context);
        this.f48803a = f7;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(0.0f, 0.0f, getWidth() * this.f48803a, getHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }
}
