package pg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class h1 extends View {
    public int f40013a;
    public float f40014b;
    public final i1 f40015c;

    public h1(i1 i1Var, Context context) {
        super(context);
        this.f40015c = i1Var;
        setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        setLayoutParams(new s4.p0(-2, 0));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        i1 i1Var = this.f40015c;
        i1Var.X2.setColor(this.f40013a);
        float min = Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom()) / 2.0f;
        if (this.f40014b != 0.0f) {
            min -= (i1Var.Y2.getStrokeWidth() + AndroidUtilities.dp(3.0f)) * this.f40014b;
        }
        float width = ((getWidth() / 2.0f) + getPaddingLeft()) - getPaddingRight();
        float height = ((getHeight() / 2.0f) + getPaddingTop()) - getPaddingBottom();
        i1.w1(width, height, min, this.f40013a, canvas);
        if (this.f40014b != 0.0f) {
            float min2 = (Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom()) / 2.0f) - AndroidUtilities.dp(2.0f);
            i1Var.Y2.setColor(this.f40013a);
            i1Var.Y2.setAlpha(255);
            canvas.drawCircle(width, height, min2, i1Var.Y2);
        }
    }
}
