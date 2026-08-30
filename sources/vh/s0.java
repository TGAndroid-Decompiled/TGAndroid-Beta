package vh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.a6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
public final class s0 extends View implements a6 {
    public final f6 f46161a;
    public final Paint f46162b;
    public a f46163c;

    public s0(Context context, f6 f6Var) {
        super(context);
        this.f46162b = new Paint();
        this.f46161a = f6Var;
        e();
    }

    @Override
    public final void e() {
        this.f46162b.setColor(j6.v0(j6.Fk, this.f46161a));
    }

    public int[] getColorKeys() {
        return null;
    }

    public a getRow() {
        return this.f46163c;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.drawRect(0.0f, AndroidUtilities.dp(6.0f), getMeasuredWidth(), AndroidUtilities.dp(6.0f) + 1, this.f46162b);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(6.0f) + 1);
    }
}
