package th;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextPaint;
import android.util.TypedValue;
import android.view.View;
import org.telegram.ui.Components.ci0;
public final class h5 extends View {
    public final String f49039a;
    public final String f49040b;
    public final ci0 f49041c;
    public final Paint d;
    public final TextPaint e;
    public final TextPaint f49042f;
    public final RectF h;
    public float f49043n;
    public final Rect f49044r;

    public h5(Context context, int i10, String str, String str2) {
        super(context);
        this.f49044r = new Rect();
        this.f49039a = str;
        this.f49040b = str2;
        ci0 ci0Var = new ci0(i10, org.telegram.messenger.i0.L(36.0f), org.telegram.messenger.i0.L(36.0f), true, null);
        this.f49041c = ci0Var;
        ci0Var.K(1);
        ci0Var.R(this);
        Paint paint = new Paint(1);
        this.d = paint;
        paint.setColor(383310040);
        TextPaint textPaint = new TextPaint(1);
        this.e = textPaint;
        textPaint.setColor(-1);
        textPaint.setTextSize(TypedValue.applyDimension(1, 16.0f, getResources().getDisplayMetrics()));
        textPaint.setTypeface(org.telegram.messenger.i0.o());
        TextPaint textPaint2 = new TextPaint(1);
        this.f49042f = textPaint2;
        textPaint2.setColor(-1761607681);
        textPaint2.setTextSize(TypedValue.applyDimension(1, 14.0f, getResources().getDisplayMetrics()));
        this.h = new RectF();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int L = org.telegram.messenger.i0.L(40.0f);
        int L2 = (int) ((org.telegram.messenger.i0.L(8.0f) * this.f49043n) + org.telegram.messenger.i0.L(36.0f));
        int i10 = L2 / 2;
        int i11 = L - i10;
        int measuredHeight = (getMeasuredHeight() / 2) - i10;
        ci0 ci0Var = this.f49041c;
        ci0Var.setBounds(i11, measuredHeight, i11 + L2, L2 + measuredHeight);
        ci0Var.draw(canvas);
        if (this.f49043n > 0.0f) {
            float N = (1.0f - this.f49043n) * org.telegram.messenger.i0.N(4.0f);
            float f7 = N * 2.0f;
            float measuredWidth = getMeasuredWidth() - f7;
            float measuredHeight2 = getMeasuredHeight() - f7;
            RectF rectF = this.h;
            rectF.set(N, N, measuredWidth, measuredHeight2);
            int i12 = (int) (this.f49043n * 30.0f);
            Paint paint = this.d;
            paint.setAlpha(i12);
            canvas.drawRoundRect(rectF, org.telegram.messenger.i0.N(12.0f), org.telegram.messenger.i0.N(12.0f), paint);
            canvas.save();
            float f10 = this.f49043n;
            canvas.scale((f10 * 0.05f) + 1.0f, (f10 * 0.05f) + 1.0f, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        }
        canvas.drawText(this.f49039a, org.telegram.messenger.i0.N(80.0f), (getMeasuredHeight() / 2.0f) - org.telegram.messenger.i0.N(4.0f), this.e);
        canvas.drawText(this.f49040b, org.telegram.messenger.i0.N(80.0f), org.telegram.messenger.i0.N(18.0f) + (getMeasuredHeight() / 2.0f), this.f49042f);
        if (this.f49043n > 0.0f) {
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int L = org.telegram.messenger.i0.L(40.0f);
        int L2 = org.telegram.messenger.i0.L(36.0f);
        int i12 = L2 / 2;
        int i13 = L - i12;
        int measuredHeight = (getMeasuredHeight() / 2) - i12;
        this.f49041c.setBounds(i13, measuredHeight, i13 + L2, L2 + measuredHeight);
    }
}
