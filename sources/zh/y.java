package zh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.h6;
public final class y extends y0 {
    public final RectF f60608w0;
    public final RectF f60609x0;
    public final Path f60610y0;
    public final b0 f60611z0;

    public y(b0 b0Var, Context context, int i7, h6 h6Var) {
        super(i7, context, h6Var);
        this.f60611z0 = b0Var;
        this.f60608w0 = new RectF();
        this.f60609x0 = new RectF();
        this.f60610y0 = new Path();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        b0 b0Var = this.f60611z0;
        w wVar = b0Var.V1;
        boolean drawChild = super.drawChild(canvas, view, j3);
        FrameLayout frameLayout = this.d;
        if (view == frameLayout) {
            FrameLayout frameLayout2 = wVar.f3764b;
            v vVar = b0Var.T1;
            RectF rectF = this.f60608w0;
            if (jh.k.c(frameLayout2, vVar, rectF)) {
                RectF rectF2 = this.f60609x0;
                if (!jh.k.c(frameLayout, this, rectF2)) {
                    return true;
                }
                float centerX = rectF2.centerX() - org.telegram.messenger.g0.L(40.0f);
                float centerY = rectF2.centerY() - org.telegram.messenger.g0.L(40.0f);
                if (!rectF.isEmpty()) {
                    canvas.save();
                    canvas.clipPath(this.f60610y0);
                    canvas.scale(0.6f, 0.6f, rectF2.centerX(), rectF2.centerY());
                    canvas.translate(rectF2.centerX() - (wVar.getWidth() / 2.0f), rectF2.centerY() - (wVar.getHeight() / 2.0f));
                    wVar.b(canvas, wVar.getWidth() / 2.0f, org.telegram.messenger.g0.L(104.0f), wVar.getWidth(), wVar.getHeight());
                    wVar.c(canvas, wVar.getWidth() / 2.0f, org.telegram.messenger.g0.L(104.0f), wVar.getWidth(), wVar.getHeight());
                    canvas.restore();
                    canvas.save();
                    canvas.translate(centerX, centerY);
                    canvas.scale(org.telegram.messenger.g0.L(80.0f) / rectF.width(), org.telegram.messenger.g0.L(80.0f) / rectF.height());
                    wVar.f3764b.draw(canvas);
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
        Path path = this.f60610y0;
        path.rewind();
        RectF rectF = this.f60608w0;
        rectF.set(0.0f, 0.0f, i7, i10);
        rectF.inset(org.telegram.messenger.g0.L(3.33f), org.telegram.messenger.g0.L(4.0f));
        path.addRoundRect(rectF, org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(11.0f), Path.Direction.CW);
    }
}
