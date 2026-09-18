package qg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class h1 extends View {
    public int f41627a;
    public float f41628b;
    public final i1 f41629c;

    public h1(i1 i1Var, Context context) {
        super(context);
        this.f41629c = i1Var;
        setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        setLayoutParams(new s4.p0(-2, 0));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        i1 i1Var = this.f41629c;
        i1Var.X2.setColor(this.f41627a);
        float min = Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom()) / 2.0f;
        if (this.f41628b != 0.0f) {
            min -= (i1Var.Y2.getStrokeWidth() + AndroidUtilities.dp(3.0f)) * this.f41628b;
        }
        float width = ((getWidth() / 2.0f) + getPaddingLeft()) - getPaddingRight();
        float height = ((getHeight() / 2.0f) + getPaddingTop()) - getPaddingBottom();
        i1.y1(width, height, min, this.f41627a, canvas);
        if (this.f41628b != 0.0f) {
            float min2 = (Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom()) / 2.0f) - AndroidUtilities.dp(2.0f);
            i1Var.Y2.setColor(this.f41627a);
            i1Var.Y2.setAlpha(255);
            canvas.drawCircle(width, height, min2, i1Var.Y2);
        }
    }
}
