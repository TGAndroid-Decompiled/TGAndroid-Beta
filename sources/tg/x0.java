package tg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
public final class x0 extends View {
    public int f55988a;
    public float f55989b;
    public final y0 f55990c;

    public x0(y0 y0Var, Context context) {
        super(context);
        this.f55990c = y0Var;
        setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        setLayoutParams(new v4.o0(-2, 0));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        y0 y0Var = this.f55990c;
        y0Var.f56007e3.setColor(this.f55988a);
        float min = Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom()) / 2.0f;
        if (this.f55989b != 0.0f) {
            min -= (y0Var.f56008f3.getStrokeWidth() + org.telegram.messenger.g0.L(3.0f)) * this.f55989b;
        }
        float width = ((getWidth() / 2.0f) + getPaddingLeft()) - getPaddingRight();
        float height = ((getHeight() / 2.0f) + getPaddingTop()) - getPaddingBottom();
        y0.A1(width, height, min, this.f55988a, canvas);
        if (this.f55989b != 0.0f) {
            float min2 = (Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom()) / 2.0f) - org.telegram.messenger.g0.L(2.0f);
            y0Var.f56008f3.setColor(this.f55988a);
            y0Var.f56008f3.setAlpha(255);
            canvas.drawCircle(width, height, min2, y0Var.f56008f3);
        }
    }
}
