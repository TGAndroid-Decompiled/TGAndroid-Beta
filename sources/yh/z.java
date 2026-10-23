package yh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
public final class z extends g1 {
    public final RectF f51080w0;
    public final RectF f51081x0;
    public final Path f51082y0;
    public final c0 f51083z0;

    public z(c0 c0Var, Context context, int i10, g6 g6Var) {
        super(context, i10, g6Var);
        this.f51083z0 = c0Var;
        this.f51080w0 = new RectF();
        this.f51081x0 = new RectF();
        this.f51082y0 = new Path();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        c0 c0Var = this.f51083z0;
        x xVar = c0Var.f50629a0;
        boolean drawChild = super.drawChild(canvas, view, j10);
        FrameLayout frameLayout = this.d;
        if (view == frameLayout) {
            FrameLayout frameLayout2 = xVar.f1266b;
            w wVar = c0Var.Y;
            RectF rectF = this.f51080w0;
            if (ih.k.c(frameLayout2, wVar, rectF)) {
                RectF rectF2 = this.f51081x0;
                if (!ih.k.c(frameLayout, this, rectF2)) {
                    return true;
                }
                float centerX = rectF2.centerX() - AndroidUtilities.dp(40.0f);
                float centerY = rectF2.centerY() - AndroidUtilities.dp(40.0f);
                if (!rectF.isEmpty()) {
                    canvas.save();
                    canvas.clipPath(this.f51082y0);
                    canvas.scale(0.6f, 0.6f, rectF2.centerX(), rectF2.centerY());
                    canvas.translate(rectF2.centerX() - (xVar.getWidth() / 2.0f), rectF2.centerY() - (xVar.getHeight() / 2.0f));
                    xVar.b(canvas, xVar.getWidth() / 2.0f, AndroidUtilities.dp(104.0f), xVar.getWidth(), xVar.getHeight());
                    xVar.c(canvas, xVar.getWidth() / 2.0f, AndroidUtilities.dp(104.0f), xVar.getWidth(), xVar.getHeight());
                    canvas.restore();
                    canvas.save();
                    canvas.translate(centerX, centerY);
                    canvas.scale(AndroidUtilities.dp(80.0f) / rectF.width(), AndroidUtilities.dp(80.0f) / rectF.height());
                    xVar.f1266b.draw(canvas);
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
        Path path = this.f51082y0;
        path.rewind();
        RectF rectF = this.f51080w0;
        rectF.set(0.0f, 0.0f, i10, i11);
        rectF.inset(AndroidUtilities.dp(3.33f), AndroidUtilities.dp(4.0f));
        path.addRoundRect(rectF, AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), Path.Direction.CW);
    }
}
