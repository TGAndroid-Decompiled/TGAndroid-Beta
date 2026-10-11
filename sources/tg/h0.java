package tg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.y9;
import w7.x5;
public final class h0 extends FrameLayout {
    public static final int f48398f = 0;
    public final y9 f48399a;
    public final g0 f48400b;
    public final Paint f48401c;
    public boolean d;
    public final j9 f48402e;

    public h0(Context context, float f7) {
        super(context);
        Paint paint = new Paint(1);
        this.f48401c = paint;
        this.d = true;
        this.f48402e = new j9((d6) null);
        y9 y9Var = new y9(getContext());
        this.f48399a = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(f7));
        ?? view = new View(context);
        TextPaint textPaint = new TextPaint(1);
        view.f48396a = textPaint;
        textPaint.setTextAlign(Paint.Align.CENTER);
        int i10 = h6.f20730a7;
        textPaint.setColor(h6.x0(null, i10, false));
        textPaint.setTextSize(AndroidUtilities.dp(11.5f));
        textPaint.setTypeface(AndroidUtilities.bold());
        this.f48400b = view;
        view.setAlpha(0.0f);
        addView(y9Var, x5.a(-1.0f, 5.0f, 5.0f, 5.0f, 5.0f, -1, 0));
        addView((View) view, x5.a(26.0f, 0.0f, 0.0f, 1.0f, 3.0f, 26, 85));
        paint.setColor(h6.x0(null, i10, false));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.d) {
            canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(2.0f), this.f48401c);
        }
        super.dispatchDraw(canvas);
    }
}
