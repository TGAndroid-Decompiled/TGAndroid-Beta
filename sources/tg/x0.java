package tg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
public final class x0 extends View {
    public int f55895a;
    public float f55896b;
    public final y0 f55897c;

    public x0(y0 y0Var, Context context) {
        super(context);
        this.f55897c = y0Var;
        setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        setLayoutParams(new v4.o0(-2, 0));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        y0 y0Var = this.f55897c;
        y0Var.f55914e3.setColor(this.f55895a);
        float min = Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom()) / 2.0f;
        if (this.f55896b != 0.0f) {
            min -= (y0Var.f55915f3.getStrokeWidth() + org.telegram.messenger.g0.L(3.0f)) * this.f55896b;
        }
        float width = ((getWidth() / 2.0f) + getPaddingLeft()) - getPaddingRight();
        float height = ((getHeight() / 2.0f) + getPaddingTop()) - getPaddingBottom();
        y0.A1(width, height, min, this.f55895a, canvas);
        if (this.f55896b != 0.0f) {
            float min2 = (Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom()) / 2.0f) - org.telegram.messenger.g0.L(2.0f);
            y0Var.f55915f3.setColor(this.f55895a);
            y0Var.f55915f3.setAlpha(255);
            canvas.drawCircle(width, height, min2, y0Var.f55915f3);
        }
    }
}
