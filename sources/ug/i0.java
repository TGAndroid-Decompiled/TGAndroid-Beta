package ug;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.z9;
import w7.a6;
public final class i0 extends FrameLayout {
    public static final int f46320f = 0;
    public final z9 f46321a;
    public final h0 f46322b;
    public final Paint f46323c;
    public boolean d;
    public final k9 e;

    public i0(Context context, float f7) {
        super(context);
        Paint paint = new Paint(1);
        this.f46323c = paint;
        this.d = true;
        this.e = new k9((c6) null);
        z9 z9Var = new z9(getContext());
        this.f46321a = z9Var;
        z9Var.setRoundRadius(AndroidUtilities.dp(f7));
        ?? view = new View(context);
        TextPaint textPaint = new TextPaint(1);
        view.f46318a = textPaint;
        textPaint.setTextAlign(Paint.Align.CENTER);
        int i10 = g6.f19843a7;
        textPaint.setColor(g6.x0(null, i10, false));
        textPaint.setTextSize(AndroidUtilities.dp(11.5f));
        textPaint.setTypeface(AndroidUtilities.bold());
        this.f46322b = view;
        view.setAlpha(0.0f);
        addView(z9Var, a6.a(-1.0f, 5.0f, 5.0f, 5.0f, 5.0f, -1, 0));
        addView((View) view, a6.a(26.0f, 0.0f, 0.0f, 1.0f, 3.0f, 26, 85));
        paint.setColor(g6.x0(null, i10, false));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.d) {
            canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(2.0f), this.f46323c);
        }
        super.dispatchDraw(canvas);
    }
}
