package zh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.i0;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
public final class a extends View {
    public final Paint f55763a;
    public final Paint f55764b;
    public final Paint f55765c;
    public final RectF d;
    public final p6 e;

    public a(Context context, p6 p6Var) {
        super(context);
        this.e = p6Var;
        Paint paint = new Paint(1);
        this.f55763a = paint;
        Paint paint2 = new Paint(1);
        this.f55764b = paint2;
        Paint paint3 = new Paint(1);
        this.f55765c = paint3;
        this.d = new RectF();
        paint2.setColor(-1);
        paint.setColor(t6.w0(t6.f20929d6, p6Var));
        paint3.setColor(t6.w0(t6.kk, p6Var));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int i10 = t6.f20929d6;
        p6 p6Var = this.e;
        int w02 = t6.w0(i10, p6Var);
        Paint paint = this.f55763a;
        paint.setColor(w02);
        int w03 = t6.w0(t6.kk, p6Var);
        Paint paint2 = this.f55765c;
        paint2.setColor(w03);
        RectF rectF = this.d;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        canvas.drawRoundRect(rectF, rectF.width() / 2.0f, rectF.height() / 2.0f, paint);
        rectF.inset(i0.L(1.33f), i0.L(1.33f));
        canvas.drawRoundRect(rectF, rectF.width() / 2.0f, rectF.height() / 2.0f, paint2);
        rectF.inset(i0.N(4.67f), i0.N(9.066f));
        canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, this.f55764b);
    }
}
