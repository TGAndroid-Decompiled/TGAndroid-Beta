package yh;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
public final class v4 extends FrameLayout {
    public final float f50609a;

    public v4(Context context, float f7) {
        super(context);
        this.f50609a = f7;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(0.0f, 0.0f, getWidth() * this.f50609a, getHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }
}
