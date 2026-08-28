package qh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
public final class s0 extends View implements org.telegram.ui.ActionBar.w5 {
    public final b6 f46680a;
    public final Paint f46681b;
    public a f46682c;

    public s0(Context context, b6 b6Var) {
        super(context);
        this.f46681b = new Paint();
        this.f46680a = b6Var;
        d();
    }

    @Override
    public final void d() {
        this.f46681b.setColor(f6.v0(f6.Fk, this.f46680a));
    }

    public int[] getColorKeys() {
        return null;
    }

    public a getRow() {
        return this.f46682c;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.drawRect(0.0f, AndroidUtilities.dp(6.0f), getMeasuredWidth(), AndroidUtilities.dp(6.0f) + 1, this.f46681b);
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i9), AndroidUtilities.dp(6.0f) + 1);
    }
}
