package yf;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class h1 extends View {
    public int f49828a;
    public float f49829b;
    public final i1 f49830c;

    public h1(i1 i1Var, Context context) {
        super(context);
        this.f49830c = i1Var;
        setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        setLayoutParams(new f2.a1(-2, 0));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        i1 i1Var = this.f49830c;
        i1Var.T2.setColor(this.f49828a);
        float min = Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom()) / 2.0f;
        if (this.f49829b != 0.0f) {
            min -= (i1Var.U2.getStrokeWidth() + AndroidUtilities.dp(3.0f)) * this.f49829b;
        }
        float width = ((getWidth() / 2.0f) + getPaddingLeft()) - getPaddingRight();
        float height = ((getHeight() / 2.0f) + getPaddingTop()) - getPaddingBottom();
        i1.x1(width, height, min, this.f49828a, canvas);
        if (this.f49829b != 0.0f) {
            float min2 = (Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom()) / 2.0f) - AndroidUtilities.dp(2.0f);
            i1Var.U2.setColor(this.f49828a);
            i1Var.U2.setAlpha(255);
            canvas.drawCircle(width, height, min2, i1Var.U2);
        }
    }
}
