package ph;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
public final class e4 extends FrameLayout {
    public final float f45030a;

    public e4(Context context, float f7) {
        super(context);
        this.f45030a = f7;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(0.0f, 0.0f, getWidth() * this.f45030a, getHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }
}
