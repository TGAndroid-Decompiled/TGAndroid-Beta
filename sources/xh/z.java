package xh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
public final class z extends j1 {
    public final RectF m0;
    public final RectF f46498n0;
    public final Path f46499o0;
    public final c0 f46500p0;

    public z(c0 c0Var, Context context, int i10, d6 d6Var) {
        super(context, i10, d6Var);
        this.f46500p0 = c0Var;
        this.m0 = new RectF();
        this.f46498n0 = new RectF();
        this.f46499o0 = new Path();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        c0 c0Var = this.f46500p0;
        x xVar = c0Var.f46096a0;
        boolean drawChild = super.drawChild(canvas, view, j3);
        FrameLayout frameLayout = this.d;
        if (view == frameLayout) {
            FrameLayout frameLayout2 = xVar.f48083b;
            w wVar = c0Var.Y;
            RectF rectF = this.m0;
            if (hh.k.c(frameLayout2, wVar, rectF)) {
                RectF rectF2 = this.f46498n0;
                if (!hh.k.c(frameLayout, this, rectF2)) {
                    return true;
                }
                float centerX = rectF2.centerX() - AndroidUtilities.dp(40.0f);
                float centerY = rectF2.centerY() - AndroidUtilities.dp(40.0f);
                if (!rectF.isEmpty()) {
                    canvas.save();
                    canvas.clipPath(this.f46499o0);
                    canvas.scale(0.6f, 0.6f, rectF2.centerX(), rectF2.centerY());
                    canvas.translate(rectF2.centerX() - (xVar.getWidth() / 2.0f), rectF2.centerY() - (xVar.getHeight() / 2.0f));
                    xVar.b(canvas, xVar.getWidth() / 2.0f, AndroidUtilities.dp(104.0f), xVar.getWidth(), xVar.getHeight());
                    xVar.c(canvas, xVar.getWidth() / 2.0f, AndroidUtilities.dp(104.0f), xVar.getWidth(), xVar.getHeight());
                    canvas.restore();
                    canvas.save();
                    canvas.translate(centerX, centerY);
                    canvas.scale(AndroidUtilities.dp(80.0f) / rectF.width(), AndroidUtilities.dp(80.0f) / rectF.height());
                    xVar.f48083b.draw(canvas);
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
        Path path = this.f46499o0;
        path.rewind();
        RectF rectF = this.m0;
        rectF.set(0.0f, 0.0f, i10, i11);
        rectF.inset(AndroidUtilities.dp(3.33f), AndroidUtilities.dp(4.0f));
        path.addRoundRect(rectF, AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), Path.Direction.CW);
    }
}
