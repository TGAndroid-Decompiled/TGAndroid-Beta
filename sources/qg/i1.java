package qg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class i1 extends View {
    public int f41661a;
    public float f41662b;
    public final j1 f41663c;

    public i1(j1 j1Var, Context context) {
        super(context);
        this.f41663c = j1Var;
        setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        setLayoutParams(new s4.p0(-2, 0));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        j1 j1Var = this.f41663c;
        j1Var.X2.setColor(this.f41661a);
        float min = Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom()) / 2.0f;
        if (this.f41662b != 0.0f) {
            min -= (j1Var.Y2.getStrokeWidth() + AndroidUtilities.dp(3.0f)) * this.f41662b;
        }
        float width = ((getWidth() / 2.0f) + getPaddingLeft()) - getPaddingRight();
        float height = ((getHeight() / 2.0f) + getPaddingTop()) - getPaddingBottom();
        j1.x1(width, height, min, this.f41661a, canvas);
        if (this.f41662b != 0.0f) {
            float min2 = (Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom()) / 2.0f) - AndroidUtilities.dp(2.0f);
            j1Var.Y2.setColor(this.f41661a);
            j1Var.Y2.setAlpha(255);
            canvas.drawCircle(width, height, min2, j1Var.Y2);
        }
    }
}
