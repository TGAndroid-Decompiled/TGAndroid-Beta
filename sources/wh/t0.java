package wh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
public final class t0 extends View implements b6 {
    public final g6 f50041a;
    public final Paint f50042b;
    public a f50043c;

    public t0(Context context, g6 g6Var) {
        super(context);
        this.f50042b = new Paint();
        this.f50041a = g6Var;
        e();
    }

    @Override
    public final void e() {
        this.f50042b.setColor(k6.v0(k6.Fk, this.f50041a));
    }

    public int[] getColorKeys() {
        return null;
    }

    public a getRow() {
        return this.f50043c;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.drawRect(0.0f, AndroidUtilities.dp(6.0f), getMeasuredWidth(), AndroidUtilities.dp(6.0f) + 1, this.f50042b);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(6.0f) + 1);
    }
}
