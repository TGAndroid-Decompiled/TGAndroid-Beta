package tg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
public final class y0 extends View {
    public int f58226a;
    public float f58227b;
    public final z0 f58228c;

    public y0(z0 z0Var, Context context) {
        super(context);
        this.f58228c = z0Var;
        setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        setLayoutParams(new v4.q0(-2, 0));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        z0 z0Var = this.f58228c;
        z0Var.f58237f3.setColor(this.f58226a);
        float min = Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom()) / 2.0f;
        if (this.f58227b != 0.0f) {
            min -= (z0Var.f58238g3.getStrokeWidth() + org.telegram.messenger.g0.L(3.0f)) * this.f58227b;
        }
        float width = ((getWidth() / 2.0f) + getPaddingLeft()) - getPaddingRight();
        float height = ((getHeight() / 2.0f) + getPaddingTop()) - getPaddingBottom();
        z0.A1(width, height, min, this.f58226a, canvas);
        if (this.f58227b != 0.0f) {
            float min2 = (Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom()) / 2.0f) - org.telegram.messenger.g0.L(2.0f);
            z0Var.f58238g3.setColor(this.f58226a);
            z0Var.f58238g3.setAlpha(255);
            canvas.drawCircle(width, height, min2, z0Var.f58238g3);
        }
    }
}
