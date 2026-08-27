package zf;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

public final class h1 extends View {

    public int f50422a;

    public float f50423b;

    public final i1 f50424c;

    public h1(i1 i1Var, Context context) {
        super(context);
        this.f50424c = i1Var;
        setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        setLayoutParams(new f2.y0(-2, 0));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        i1 i1Var = this.f50424c;
        i1Var.T2.setColor(this.f50422a);
        float fMin = Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom()) / 2.0f;
        if (this.f50423b != 0.0f) {
            fMin -= (i1Var.U2.getStrokeWidth() + AndroidUtilities.dp(3.0f)) * this.f50423b;
        }
        float width = ((getWidth() / 2.0f) + getPaddingLeft()) - getPaddingRight();
        float height = ((getHeight() / 2.0f) + getPaddingTop()) - getPaddingBottom();
        i1.x1(width, height, fMin, this.f50422a, canvas);
        if (this.f50423b != 0.0f) {
            float fMin2 = (Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom()) / 2.0f) - AndroidUtilities.dp(2.0f);
            i1Var.U2.setColor(this.f50422a);
            i1Var.U2.setAlpha(255);
            canvas.drawCircle(width, height, fMin2, i1Var.U2);
        }
    }
}
