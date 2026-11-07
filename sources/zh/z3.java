package zh;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
public final class z3 extends FrameLayout {
    public final float f60542a;

    public z3(Context context, float f10) {
        super(context);
        this.f60542a = f10;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(0.0f, 0.0f, getWidth() * this.f60542a, getHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }
}
