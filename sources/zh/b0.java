package zh;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
public final class b0 extends FrameLayout {
    public final float f52964a;

    public b0(Context context, float f7) {
        super(context);
        this.f52964a = f7;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(0.0f, 0.0f, getWidth() * this.f52964a, getHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }
}
