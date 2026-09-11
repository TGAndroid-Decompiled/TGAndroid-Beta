package ug;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.x9;
import w7.x5;
public final class j0 extends FrameLayout {
    public static final int f47133f = 0;
    public final x9 f47134a;
    public final i0 f47135b;
    public final Paint f47136c;
    public boolean d;
    public final i9 f47137e;

    public j0(Context context, float f7) {
        super(context);
        Paint paint = new Paint(1);
        this.f47136c = paint;
        this.d = true;
        this.f47137e = new i9((f6) null);
        x9 x9Var = new x9(getContext());
        this.f47134a = x9Var;
        x9Var.setRoundRadius(AndroidUtilities.dp(f7));
        ?? view = new View(context);
        TextPaint textPaint = new TextPaint(1);
        view.f47131a = textPaint;
        textPaint.setTextAlign(Paint.Align.CENTER);
        int i10 = j6.f20607a7;
        textPaint.setColor(j6.w0(null, i10, false));
        textPaint.setTextSize(AndroidUtilities.dp(11.5f));
        textPaint.setTypeface(AndroidUtilities.bold());
        this.f47135b = view;
        view.setAlpha(0.0f);
        addView(x9Var, x5.d(-1, -1.0f, 0, 5.0f, 5.0f, 5.0f, 5.0f));
        addView((View) view, x5.d(26, 26.0f, 85, 0.0f, 0.0f, 1.0f, 3.0f));
        paint.setColor(j6.w0(null, i10, false));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.d) {
            canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(2.0f), this.f47136c);
        }
        super.dispatchDraw(canvas);
    }
}
