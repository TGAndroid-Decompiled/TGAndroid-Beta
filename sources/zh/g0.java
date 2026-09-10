package zh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import xh.l8;
public final class g0 extends LinearLayout {
    public l8 f48423a;
    public final Path f48424b;
    public final Paint f48425c;
    public long d;
    public final org.telegram.ui.Components.d6 e;
    public final j0 f48426f;

    public g0(j0 j0Var, Context context) {
        super(context);
        this.f48426f = j0Var;
        this.f48424b = new Path();
        this.f48425c = new Paint(1);
        this.d = 0L;
        this.e = new org.telegram.ui.Components.d6(this, 0L, 1000L, new LinearInterpolator());
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        Path path = this.f48424b;
        path.rewind();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        path.addRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        j0 j0Var = this.f48426f;
        l0 l0Var = j0Var.f48529f;
        if (l0Var != null) {
            int b10 = o.b(l0Var.f48631a, l0Var.b(), 3);
            l0 l0Var2 = j0Var.f48529f;
            int b11 = o.b(l0Var2.f48631a, l0Var2.b(), 5);
            canvas.drawColor(b10);
            long j3 = this.d;
            l0 l0Var3 = j0Var.f48529f;
            long j10 = l0Var3.f48632b;
            org.telegram.ui.Components.d6 d6Var = this.e;
            if (j3 != j10) {
                d6Var.d(l0Var3.a(), true);
            }
            float d = d6Var.d(j0Var.f48529f.a(), false);
            this.d = j0Var.f48529f.f48632b;
            Paint paint = this.f48425c;
            paint.setColor(b11);
            paint.setAlpha(127);
            canvas2 = canvas;
            canvas2.drawRect(getWidth() * d, 0.0f, getWidth(), getHeight(), paint);
        } else {
            canvas2 = canvas;
        }
        if (this.f48423a == null) {
            this.f48423a = new l8(1, 250);
        }
        this.f48423a.f(0, 0, getWidth(), getHeight());
        l8 l8Var = this.f48423a;
        l8Var.h = 30.0f;
        l8Var.d();
        this.f48423a.b(canvas2, -1, 0.85f);
        invalidate();
        canvas2.restore();
        super.dispatchDraw(canvas2);
    }
}
