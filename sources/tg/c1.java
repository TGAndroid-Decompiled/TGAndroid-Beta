package tg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
public final class c1 extends View {
    public int f57861a;
    public float f57862b;
    public final d1 f57863c;

    public c1(d1 d1Var, Context context) {
        super(context);
        this.f57863c = d1Var;
        setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        setLayoutParams(new v4.q0(-2, 0));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        d1 d1Var = this.f57863c;
        d1Var.f57870f3.setColor(this.f57861a);
        float min = Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom()) / 2.0f;
        if (this.f57862b != 0.0f) {
            min -= (d1Var.f57871g3.getStrokeWidth() + org.telegram.messenger.g0.L(3.0f)) * this.f57862b;
        }
        float width = ((getWidth() / 2.0f) + getPaddingLeft()) - getPaddingRight();
        float height = ((getHeight() / 2.0f) + getPaddingTop()) - getPaddingBottom();
        d1.A1(width, height, min, this.f57861a, canvas);
        if (this.f57862b != 0.0f) {
            float min2 = (Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom()) / 2.0f) - org.telegram.messenger.g0.L(2.0f);
            d1Var.f57871g3.setColor(this.f57861a);
            d1Var.f57871g3.setAlpha(255);
            canvas.drawCircle(width, height, min2, d1Var.f57871g3);
        }
    }
}
