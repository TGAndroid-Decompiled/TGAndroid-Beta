package ug;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
public final class w0 extends View {
    public int f56287a;
    public float f56288b;
    public final x0 f56289c;

    public w0(x0 x0Var, Context context) {
        super(context);
        this.f56289c = x0Var;
        setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        setLayoutParams(new u4.p0(-2, 0));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        x0 x0Var = this.f56289c;
        x0Var.f56298f3.setColor(this.f56287a);
        float min = Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom()) / 2.0f;
        if (this.f56288b != 0.0f) {
            min -= (x0Var.f56299g3.getStrokeWidth() + org.telegram.messenger.g0.L(3.0f)) * this.f56288b;
        }
        float width = ((getWidth() / 2.0f) + getPaddingLeft()) - getPaddingRight();
        float height = ((getHeight() / 2.0f) + getPaddingTop()) - getPaddingBottom();
        x0.A1(width, height, min, this.f56287a, canvas);
        if (this.f56288b != 0.0f) {
            float min2 = (Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom()) / 2.0f) - org.telegram.messenger.g0.L(2.0f);
            x0Var.f56299g3.setColor(this.f56287a);
            x0Var.f56299g3.setAlpha(255);
            canvas.drawCircle(width, height, min2, x0Var.f56299g3);
        }
    }
}
