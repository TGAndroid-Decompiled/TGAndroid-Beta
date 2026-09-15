package tg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.f9;
import org.telegram.ui.Components.u9;
import w7.x5;
public final class j0 extends FrameLayout {
    public static final int f43154f = 0;
    public final u9 f43155a;
    public final i0 f43156b;
    public final Paint f43157c;
    public boolean d;
    public final f9 e;

    public j0(Context context, float f7) {
        super(context);
        Paint paint = new Paint(1);
        this.f43157c = paint;
        this.d = true;
        this.e = new f9((e6) null);
        u9 u9Var = new u9(getContext());
        this.f43155a = u9Var;
        u9Var.setRoundRadius(AndroidUtilities.dp(f7));
        ?? view = new View(context);
        TextPaint textPaint = new TextPaint(1);
        view.f43152a = textPaint;
        textPaint.setTextAlign(Paint.Align.CENTER);
        int i10 = i6.f18780a7;
        textPaint.setColor(i6.w0(null, i10, false));
        textPaint.setTextSize(AndroidUtilities.dp(11.5f));
        textPaint.setTypeface(AndroidUtilities.bold());
        this.f43156b = view;
        view.setAlpha(0.0f);
        addView(u9Var, x5.d(-1, -1.0f, 0, 5.0f, 5.0f, 5.0f, 5.0f));
        addView((View) view, x5.d(26, 26.0f, 85, 0.0f, 0.0f, 1.0f, 3.0f));
        paint.setColor(i6.w0(null, i10, false));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.d) {
            canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(2.0f), this.f43157c);
        }
        super.dispatchDraw(canvas);
    }
}
