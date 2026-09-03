package vh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
public final class t0 extends View implements org.telegram.ui.ActionBar.a6 {
    public final f6 f46258a;
    public final Paint f46259b;
    public a f46260c;

    public t0(Context context, f6 f6Var) {
        super(context);
        this.f46259b = new Paint();
        this.f46258a = f6Var;
        e();
    }

    @Override
    public final void e() {
        this.f46259b.setColor(j6.v0(j6.Fk, this.f46258a));
    }

    public int[] getColorKeys() {
        return null;
    }

    public a getRow() {
        return this.f46260c;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.drawRect(0.0f, AndroidUtilities.dp(6.0f), getMeasuredWidth(), AndroidUtilities.dp(6.0f) + 1, this.f46259b);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(6.0f) + 1);
    }
}
