package rh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;

public final class s0 extends View implements org.telegram.ui.ActionBar.x5 {

    public final c6 f47426a;

    public final Paint f47427b;

    public a f47428c;

    public s0(Context context, c6 c6Var) {
        super(context);
        this.f47427b = new Paint();
        this.f47426a = c6Var;
        d();
    }

    @Override
    public final void d() {
        this.f47427b.setColor(g6.v0(g6.Fk, this.f47426a));
    }

    public int[] getColorKeys() {
        return null;
    }

    public a getRow() {
        return this.f47428c;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.drawRect(0.0f, AndroidUtilities.dp(6.0f), getMeasuredWidth(), AndroidUtilities.dp(6.0f) + 1, this.f47427b);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(6.0f) + 1);
    }
}
