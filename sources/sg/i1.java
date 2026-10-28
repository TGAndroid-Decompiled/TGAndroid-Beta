package sg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class i1 extends View {
    public int f48271a;
    public float f48272b;
    public final j1 f48273c;

    public i1(j1 j1Var, Context context) {
        super(context);
        this.f48273c = j1Var;
        setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        setLayoutParams(new s4.q0(-2, 0));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        j1 j1Var = this.f48273c;
        j1Var.f48308f3.setColor(this.f48271a);
        float min = Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom()) / 2.0f;
        if (this.f48272b != 0.0f) {
            min -= (j1Var.f48309g3.getStrokeWidth() + AndroidUtilities.dp(3.0f)) * this.f48272b;
        }
        float width = ((getWidth() / 2.0f) + getPaddingLeft()) - getPaddingRight();
        float height = ((getHeight() / 2.0f) + getPaddingTop()) - getPaddingBottom();
        j1.D1(width, height, min, this.f48271a, canvas);
        if (this.f48272b != 0.0f) {
            float min2 = (Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom()) / 2.0f) - AndroidUtilities.dp(2.0f);
            j1Var.f48309g3.setColor(this.f48271a);
            j1Var.f48309g3.setAlpha(255);
            canvas.drawCircle(width, height, min2, j1Var.f48309g3);
        }
    }
}
