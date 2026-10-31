package rh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.widget.LinearLayout;
public final class f7 extends LinearLayout {
    public final Path f46909a;
    public final Matrix f46910b;
    public final RadialGradient f46911c;
    public final Paint d;
    public final org.telegram.ui.Components.d5 e;

    public f7(Context context, Matrix matrix, RadialGradient radialGradient, Paint paint, org.telegram.ui.Components.d5 d5Var) {
        super(context);
        this.f46910b = matrix;
        this.f46911c = radialGradient;
        this.d = paint;
        this.e = d5Var;
        this.f46909a = new Path();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float L = org.telegram.messenger.i0.L(10.0f);
        RectF rectF = org.telegram.messenger.i0.P;
        rectF.set(0.0f, org.telegram.messenger.i0.L(2.0f) + 1, getWidth(), getHeight() + L);
        Path path = this.f46909a;
        path.rewind();
        path.addRoundRect(rectF, L, L, Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        Matrix matrix = this.f46910b;
        matrix.reset();
        matrix.postTranslate(getWidth() / 2.0f, org.telegram.messenger.i0.L(100.0f));
        this.f46911c.setLocalMatrix(matrix);
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.d);
        canvas.save();
        canvas.translate(getWidth() / 2.0f, org.telegram.messenger.i0.L(100.0f));
        j0.a(canvas, 0, this.e, getWidth(), org.telegram.messenger.i0.L(180.0f), 1.0f, 1.0f);
        canvas.restore();
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.e.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.e.b();
    }
}
