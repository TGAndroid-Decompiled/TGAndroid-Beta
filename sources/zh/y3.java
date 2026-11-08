package zh;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
public final class y3 extends FrameLayout {
    public final float f60618a;

    public y3(Context context, float f10) {
        super(context);
        this.f60618a = f10;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(0.0f, 0.0f, getWidth() * this.f60618a, getHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }
}
