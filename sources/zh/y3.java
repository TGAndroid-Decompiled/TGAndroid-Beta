package zh;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
public final class y3 extends FrameLayout {
    public final float f60617a;

    public y3(Context context, float f10) {
        super(context);
        this.f60617a = f10;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(0.0f, 0.0f, getWidth() * this.f60617a, getHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }
}
