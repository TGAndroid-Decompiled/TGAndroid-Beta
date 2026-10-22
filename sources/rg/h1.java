package rg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class h1 extends View {
    public int f45366a;
    public float f45367b;
    public final i1 f45368c;

    public h1(i1 i1Var, Context context) {
        super(context);
        this.f45368c = i1Var;
        setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        setLayoutParams(new s4.o0(-2, 0));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        i1 i1Var = this.f45368c;
        i1Var.V2.setColor(this.f45366a);
        float min = Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom()) / 2.0f;
        if (this.f45367b != 0.0f) {
            min -= (i1Var.W2.getStrokeWidth() + AndroidUtilities.dp(3.0f)) * this.f45367b;
        }
        float width = ((getWidth() / 2.0f) + getPaddingLeft()) - getPaddingRight();
        float height = ((getHeight() / 2.0f) + getPaddingTop()) - getPaddingBottom();
        i1.y1(width, height, min, this.f45366a, canvas);
        if (this.f45367b != 0.0f) {
            float min2 = (Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom()) / 2.0f) - AndroidUtilities.dp(2.0f);
            i1Var.W2.setColor(this.f45366a);
            i1Var.W2.setAlpha(255);
            canvas.drawCircle(width, height, min2, i1Var.W2);
        }
    }
}
