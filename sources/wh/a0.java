package wh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
public final class a0 extends h1 {
    public final RectF m0;
    public final RectF f44017n0;
    public final Path f44018o0;
    public final d0 f44019p0;

    public a0(d0 d0Var, Context context, int i10, f6 f6Var) {
        super(context, i10, f6Var);
        this.f44019p0 = d0Var;
        this.m0 = new RectF();
        this.f44017n0 = new RectF();
        this.f44018o0 = new Path();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        d0 d0Var = this.f44019p0;
        y yVar = d0Var.f44047a0;
        boolean drawChild = super.drawChild(canvas, view, j3);
        FrameLayout frameLayout = this.d;
        if (view == frameLayout) {
            FrameLayout frameLayout2 = yVar.f46099b;
            x xVar = d0Var.Y;
            RectF rectF = this.m0;
            if (gh.k.c(frameLayout2, xVar, rectF)) {
                RectF rectF2 = this.f44017n0;
                if (!gh.k.c(frameLayout, this, rectF2)) {
                    return true;
                }
                float centerX = rectF2.centerX() - AndroidUtilities.dp(40.0f);
                float centerY = rectF2.centerY() - AndroidUtilities.dp(40.0f);
                if (!rectF.isEmpty()) {
                    canvas.save();
                    canvas.clipPath(this.f44018o0);
                    canvas.scale(0.6f, 0.6f, rectF2.centerX(), rectF2.centerY());
                    canvas.translate(rectF2.centerX() - (yVar.getWidth() / 2.0f), rectF2.centerY() - (yVar.getHeight() / 2.0f));
                    yVar.b(canvas, yVar.getWidth() / 2.0f, AndroidUtilities.dp(104.0f), yVar.getWidth(), yVar.getHeight());
                    yVar.c(canvas, yVar.getWidth() / 2.0f, AndroidUtilities.dp(104.0f), yVar.getWidth(), yVar.getHeight());
                    canvas.restore();
                    canvas.save();
                    canvas.translate(centerX, centerY);
                    canvas.scale(AndroidUtilities.dp(80.0f) / rectF.width(), AndroidUtilities.dp(80.0f) / rectF.height());
                    yVar.f46099b.draw(canvas);
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
        Path path = this.f44018o0;
        path.rewind();
        RectF rectF = this.m0;
        rectF.set(0.0f, 0.0f, i10, i11);
        rectF.inset(AndroidUtilities.dp(3.33f), AndroidUtilities.dp(4.0f));
        path.addRoundRect(rectF, AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), Path.Direction.CW);
    }
}
