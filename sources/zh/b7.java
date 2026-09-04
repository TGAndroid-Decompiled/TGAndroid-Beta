package zh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class b7 extends LinearLayout {
    public final Path f51720a;
    public final Matrix f51721b;
    public final RadialGradient f51722c;
    public final Paint d;
    public final org.telegram.ui.Components.o5 f51723e;

    public b7(Context context, Matrix matrix, RadialGradient radialGradient, Paint paint, org.telegram.ui.Components.o5 o5Var) {
        super(context);
        this.f51721b = matrix;
        this.f51722c = radialGradient;
        this.d = paint;
        this.f51723e = o5Var;
        this.f51720a = new Path();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float dp = AndroidUtilities.dp(10.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, AndroidUtilities.dp(2.0f) + 1, getWidth(), getHeight() + dp);
        Path path = this.f51720a;
        path.rewind();
        path.addRoundRect(rectF, dp, dp, Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        Matrix matrix = this.f51721b;
        matrix.reset();
        matrix.postTranslate(getWidth() / 2.0f, AndroidUtilities.dp(100.0f));
        this.f51722c.setLocalMatrix(matrix);
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.d);
        canvas.save();
        canvas.translate(getWidth() / 2.0f, AndroidUtilities.dp(100.0f));
        j0.a(canvas, 0, this.f51723e, getWidth(), AndroidUtilities.dp(180.0f), 1.0f, 1.0f);
        canvas.restore();
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f51723e.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f51723e.b();
    }
}
