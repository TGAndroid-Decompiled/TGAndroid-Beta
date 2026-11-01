package ph;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.p6;
public final class a0 extends c1 {
    public final RectF f44977w0;
    public final RectF f44978x0;
    public final Path f44979y0;
    public final d0 f44980z0;

    public a0(d0 d0Var, Context context, int i10, p6 p6Var) {
        super(i10, context, p6Var);
        this.f44980z0 = d0Var;
        this.f44977w0 = new RectF();
        this.f44978x0 = new RectF();
        this.f44979y0 = new Path();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        d0 d0Var = this.f44980z0;
        y yVar = d0Var.S1;
        boolean drawChild = super.drawChild(canvas, view, j10);
        FrameLayout frameLayout = this.d;
        if (view == frameLayout) {
            FrameLayout frameLayout2 = yVar.f47730b;
            x xVar = d0Var.Q1;
            RectF rectF = this.f44977w0;
            if (zg.h.c(frameLayout2, xVar, rectF)) {
                RectF rectF2 = this.f44978x0;
                if (!zg.h.c(frameLayout, this, rectF2)) {
                    return true;
                }
                float centerX = rectF2.centerX() - org.telegram.messenger.i0.L(40.0f);
                float centerY = rectF2.centerY() - org.telegram.messenger.i0.L(40.0f);
                if (!rectF.isEmpty()) {
                    canvas.save();
                    canvas.clipPath(this.f44979y0);
                    canvas.scale(0.6f, 0.6f, rectF2.centerX(), rectF2.centerY());
                    canvas.translate(rectF2.centerX() - (yVar.getWidth() / 2.0f), rectF2.centerY() - (yVar.getHeight() / 2.0f));
                    yVar.b(canvas, yVar.getWidth() / 2.0f, org.telegram.messenger.i0.L(104.0f), yVar.getWidth(), yVar.getHeight());
                    yVar.c(canvas, yVar.getWidth() / 2.0f, org.telegram.messenger.i0.L(104.0f), yVar.getWidth(), yVar.getHeight());
                    canvas.restore();
                    canvas.save();
                    canvas.translate(centerX, centerY);
                    canvas.scale(org.telegram.messenger.i0.L(80.0f) / rectF.width(), org.telegram.messenger.i0.L(80.0f) / rectF.height());
                    yVar.f47730b.draw(canvas);
                    canvas.restore();
                }
            } else {
                return true;
            }
        }
        return drawChild;
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        Path path = this.f44979y0;
        path.rewind();
        RectF rectF = this.f44977w0;
        rectF.set(0.0f, 0.0f, i10, i11);
        rectF.inset(org.telegram.messenger.i0.L(3.33f), org.telegram.messenger.i0.L(4.0f));
        path.addRoundRect(rectF, org.telegram.messenger.i0.L(11.0f), org.telegram.messenger.i0.L(11.0f), Path.Direction.CW);
    }
}
