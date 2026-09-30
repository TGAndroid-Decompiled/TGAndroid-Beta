package qg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class i1 extends View {
    public int f41761a;
    public float f41762b;
    public final j1 f41763c;

    public i1(j1 j1Var, Context context) {
        super(context);
        this.f41763c = j1Var;
        setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        setLayoutParams(new s4.p0(-2, 0));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        j1 j1Var = this.f41763c;
        j1Var.f41802e3.setColor(this.f41761a);
        float min = Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom()) / 2.0f;
        if (this.f41762b != 0.0f) {
            min -= (j1Var.f41803f3.getStrokeWidth() + AndroidUtilities.dp(3.0f)) * this.f41762b;
        }
        float width = ((getWidth() / 2.0f) + getPaddingLeft()) - getPaddingRight();
        float height = ((getHeight() / 2.0f) + getPaddingTop()) - getPaddingBottom();
        j1.z1(width, height, min, this.f41761a, canvas);
        if (this.f41762b != 0.0f) {
            float min2 = (Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom()) / 2.0f) - AndroidUtilities.dp(2.0f);
            j1Var.f41803f3.setColor(this.f41761a);
            j1Var.f41803f3.setAlpha(255);
            canvas.drawCircle(width, height, min2, j1Var.f41803f3);
        }
    }
}
