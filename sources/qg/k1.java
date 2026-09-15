package qg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class k1 extends View {
    public int f41428a;
    public float f41429b;
    public final l1 f41430c;

    public k1(l1 l1Var, Context context) {
        super(context);
        this.f41430c = l1Var;
        setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        setLayoutParams(new s4.p0(-2, 0));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        l1 l1Var = this.f41430c;
        l1Var.X2.setColor(this.f41428a);
        float min = Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom()) / 2.0f;
        if (this.f41429b != 0.0f) {
            min -= (l1Var.Y2.getStrokeWidth() + AndroidUtilities.dp(3.0f)) * this.f41429b;
        }
        float width = ((getWidth() / 2.0f) + getPaddingLeft()) - getPaddingRight();
        float height = ((getHeight() / 2.0f) + getPaddingTop()) - getPaddingBottom();
        l1.x1(width, height, min, this.f41428a, canvas);
        if (this.f41429b != 0.0f) {
            float min2 = (Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom()) / 2.0f) - AndroidUtilities.dp(2.0f);
            l1Var.Y2.setColor(this.f41428a);
            l1Var.Y2.setAlpha(255);
            canvas.drawCircle(width, height, min2, l1Var.Y2);
        }
    }
}
