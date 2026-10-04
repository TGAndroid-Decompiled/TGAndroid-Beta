package yh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class s6 extends LinearLayout {
    public final Path f51984a;
    public final Matrix f51985b;
    public final RadialGradient f51986c;
    public final Paint d;
    public final org.telegram.ui.Components.o5 f51987e;

    public s6(Context context, Matrix matrix, RadialGradient radialGradient, Paint paint, org.telegram.ui.Components.o5 o5Var) {
        super(context);
        this.f51985b = matrix;
        this.f51986c = radialGradient;
        this.d = paint;
        this.f51987e = o5Var;
        this.f51984a = new Path();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float dp = AndroidUtilities.dp(10.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, AndroidUtilities.dp(2.0f) + 1, getWidth(), getHeight() + dp);
        Path path = this.f51984a;
        path.rewind();
        path.addRoundRect(rectF, dp, dp, Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        Matrix matrix = this.f51985b;
        matrix.reset();
        matrix.postTranslate(getWidth() / 2.0f, AndroidUtilities.dp(100.0f));
        this.f51986c.setLocalMatrix(matrix);
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.d);
        canvas.save();
        canvas.translate(getWidth() / 2.0f, AndroidUtilities.dp(100.0f));
        j0.a(canvas, 0, this.f51987e, getWidth(), AndroidUtilities.dp(180.0f), 1.0f, 1.0f);
        canvas.restore();
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f51987e.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f51987e.b();
    }
}
