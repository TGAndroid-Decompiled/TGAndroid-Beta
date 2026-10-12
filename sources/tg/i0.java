package tg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.y9;
import w7.w5;
public final class i0 extends FrameLayout {
    public static final int f48570f = 0;
    public final y9 f48571a;
    public final h0 f48572b;
    public final Paint f48573c;
    public boolean d;
    public final j9 f48574e;

    public i0(Context context, float f7) {
        super(context);
        Paint paint = new Paint(1);
        this.f48573c = paint;
        this.d = true;
        this.f48574e = new j9((c6) null);
        y9 y9Var = new y9(getContext());
        this.f48571a = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(f7));
        ?? view = new View(context);
        TextPaint textPaint = new TextPaint(1);
        view.f48568a = textPaint;
        textPaint.setTextAlign(Paint.Align.CENTER);
        int i10 = h6.f20504a7;
        textPaint.setColor(h6.x0(null, i10, false));
        textPaint.setTextSize(AndroidUtilities.dp(11.5f));
        textPaint.setTypeface(AndroidUtilities.bold());
        this.f48572b = view;
        view.setAlpha(0.0f);
        addView(y9Var, w5.a(-1.0f, 5.0f, 5.0f, 5.0f, 5.0f, -1, 0));
        addView((View) view, w5.a(26.0f, 0.0f, 0.0f, 1.0f, 3.0f, 26, 85));
        paint.setColor(h6.x0(null, i10, false));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.d) {
            canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(2.0f), this.f48573c);
        }
        super.dispatchDraw(canvas);
    }
}
