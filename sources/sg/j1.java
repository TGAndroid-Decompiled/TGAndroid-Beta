package sg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class j1 extends View {
    public int f48265a;
    public float f48266b;
    public final k1 f48267c;

    public j1(k1 k1Var, Context context) {
        super(context);
        this.f48267c = k1Var;
        setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        setLayoutParams(new s4.q0(-2, 0));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        k1 k1Var = this.f48267c;
        k1Var.f48279f3.setColor(this.f48265a);
        float min = Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom()) / 2.0f;
        if (this.f48266b != 0.0f) {
            min -= (k1Var.f48280g3.getStrokeWidth() + AndroidUtilities.dp(3.0f)) * this.f48266b;
        }
        float width = ((getWidth() / 2.0f) + getPaddingLeft()) - getPaddingRight();
        float height = ((getHeight() / 2.0f) + getPaddingTop()) - getPaddingBottom();
        k1.D1(width, height, min, this.f48265a, canvas);
        if (this.f48266b != 0.0f) {
            float min2 = (Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom()) / 2.0f) - AndroidUtilities.dp(2.0f);
            k1Var.f48280g3.setColor(this.f48265a);
            k1Var.f48280g3.setAlpha(255);
            canvas.drawCircle(width, height, min2, k1Var.f48280g3);
        }
    }
}
