package rg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class j1 extends View {
    public int f45252a;
    public float f45253b;
    public final k1 f45254c;

    public j1(k1 k1Var, Context context) {
        super(context);
        this.f45254c = k1Var;
        setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        setLayoutParams(new s4.p0(-2, 0));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        k1 k1Var = this.f45254c;
        k1Var.X2.setColor(this.f45252a);
        float min = Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom()) / 2.0f;
        if (this.f45253b != 0.0f) {
            min -= (k1Var.Y2.getStrokeWidth() + AndroidUtilities.dp(3.0f)) * this.f45253b;
        }
        float width = ((getWidth() / 2.0f) + getPaddingLeft()) - getPaddingRight();
        float height = ((getHeight() / 2.0f) + getPaddingTop()) - getPaddingBottom();
        k1.w1(width, height, min, this.f45252a, canvas);
        if (this.f45253b != 0.0f) {
            float min2 = (Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom()) / 2.0f) - AndroidUtilities.dp(2.0f);
            k1Var.Y2.setColor(this.f45252a);
            k1Var.Y2.setAlpha(255);
            canvas.drawCircle(width, height, min2, k1Var.Y2);
        }
    }
}
