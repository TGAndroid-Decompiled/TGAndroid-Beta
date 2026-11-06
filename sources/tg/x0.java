package tg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
public final class x0 extends View {
    public int f55871a;
    public float f55872b;
    public final y0 f55873c;

    public x0(y0 y0Var, Context context) {
        super(context);
        this.f55873c = y0Var;
        setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        setLayoutParams(new v4.o0(-2, 0));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        y0 y0Var = this.f55873c;
        y0Var.f55890e3.setColor(this.f55871a);
        float min = Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom()) / 2.0f;
        if (this.f55872b != 0.0f) {
            min -= (y0Var.f55891f3.getStrokeWidth() + org.telegram.messenger.g0.L(3.0f)) * this.f55872b;
        }
        float width = ((getWidth() / 2.0f) + getPaddingLeft()) - getPaddingRight();
        float height = ((getHeight() / 2.0f) + getPaddingTop()) - getPaddingBottom();
        y0.A1(width, height, min, this.f55871a, canvas);
        if (this.f55872b != 0.0f) {
            float min2 = (Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom()) / 2.0f) - org.telegram.messenger.g0.L(2.0f);
            y0Var.f55891f3.setColor(this.f55871a);
            y0Var.f55891f3.setAlpha(255);
            canvas.drawCircle(width, height, min2, y0Var.f55891f3);
        }
    }
}
