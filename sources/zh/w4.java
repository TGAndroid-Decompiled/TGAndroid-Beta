package zh;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
public final class w4 extends FrameLayout {
    public final float f53377a;

    public w4(Context context, float f7) {
        super(context);
        this.f53377a = f7;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(0.0f, 0.0f, getWidth() * this.f53377a, getHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }
}
