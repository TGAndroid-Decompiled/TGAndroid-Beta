package rg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class j1 extends View {
    public int f44074a;
    public float f44075b;
    public final k1 f44076c;

    public j1(k1 k1Var, Context context) {
        super(context);
        this.f44076c = k1Var;
        setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        setLayoutParams(new s4.o0(-2, 0));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        k1 k1Var = this.f44076c;
        k1Var.V2.setColor(this.f44074a);
        float min = Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom()) / 2.0f;
        if (this.f44075b != 0.0f) {
            min -= (k1Var.W2.getStrokeWidth() + AndroidUtilities.dp(3.0f)) * this.f44075b;
        }
        float width = ((getWidth() / 2.0f) + getPaddingLeft()) - getPaddingRight();
        float height = ((getHeight() / 2.0f) + getPaddingTop()) - getPaddingBottom();
        k1.y1(width, height, min, this.f44074a, canvas);
        if (this.f44075b != 0.0f) {
            float min2 = (Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom()) / 2.0f) - AndroidUtilities.dp(2.0f);
            k1Var.W2.setColor(this.f44074a);
            k1Var.W2.setAlpha(255);
            canvas.drawCircle(width, height, min2, k1Var.W2);
        }
    }
}
