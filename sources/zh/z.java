package zh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.f6;
public final class z extends z0 {
    public final RectF f60499w0;
    public final RectF f60500x0;
    public final Path f60501y0;
    public final c0 f60502z0;

    public z(c0 c0Var, Context context, int i7, f6 f6Var) {
        super(i7, context, f6Var);
        this.f60502z0 = c0Var;
        this.f60499w0 = new RectF();
        this.f60500x0 = new RectF();
        this.f60501y0 = new Path();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        c0 c0Var = this.f60502z0;
        x xVar = c0Var.S1;
        boolean drawChild = super.drawChild(canvas, view, j3);
        FrameLayout frameLayout = this.d;
        if (view == frameLayout) {
            FrameLayout frameLayout2 = xVar.f3767b;
            w wVar = c0Var.Q1;
            RectF rectF = this.f60499w0;
            if (jh.k.c(frameLayout2, wVar, rectF)) {
                RectF rectF2 = this.f60500x0;
                if (!jh.k.c(frameLayout, this, rectF2)) {
                    return true;
                }
                float centerX = rectF2.centerX() - org.telegram.messenger.g0.L(40.0f);
                float centerY = rectF2.centerY() - org.telegram.messenger.g0.L(40.0f);
                if (!rectF.isEmpty()) {
                    canvas.save();
                    canvas.clipPath(this.f60501y0);
                    canvas.scale(0.6f, 0.6f, rectF2.centerX(), rectF2.centerY());
                    canvas.translate(rectF2.centerX() - (xVar.getWidth() / 2.0f), rectF2.centerY() - (xVar.getHeight() / 2.0f));
                    xVar.b(canvas, xVar.getWidth() / 2.0f, org.telegram.messenger.g0.L(104.0f), xVar.getWidth(), xVar.getHeight());
                    xVar.c(canvas, xVar.getWidth() / 2.0f, org.telegram.messenger.g0.L(104.0f), xVar.getWidth(), xVar.getHeight());
                    canvas.restore();
                    canvas.save();
                    canvas.translate(centerX, centerY);
                    canvas.scale(org.telegram.messenger.g0.L(80.0f) / rectF.width(), org.telegram.messenger.g0.L(80.0f) / rectF.height());
                    xVar.f3767b.draw(canvas);
                    canvas.restore();
                }
            } else {
                return true;
            }
        }
        return drawChild;
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        Path path = this.f60501y0;
        path.rewind();
        RectF rectF = this.f60499w0;
        rectF.set(0.0f, 0.0f, i7, i10);
        rectF.inset(org.telegram.messenger.g0.L(3.33f), org.telegram.messenger.g0.L(4.0f));
        path.addRoundRect(rectF, org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(11.0f), Path.Direction.CW);
    }
}
