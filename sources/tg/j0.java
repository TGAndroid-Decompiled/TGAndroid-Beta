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
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.w9;
import w7.x5;
public final class j0 extends FrameLayout {
    public static final int f43105f = 0;
    public final w9 f43106a;
    public final i0 f43107b;
    public final Paint f43108c;
    public boolean d;
    public final h9 e;

    public j0(Context context, float f7) {
        super(context);
        Paint paint = new Paint(1);
        this.f43108c = paint;
        this.d = true;
        this.e = new h9((d6) null);
        w9 w9Var = new w9(getContext());
        this.f43106a = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(f7));
        ?? view = new View(context);
        TextPaint textPaint = new TextPaint(1);
        view.f43103a = textPaint;
        textPaint.setTextAlign(Paint.Align.CENTER);
        int i10 = h6.f18733a7;
        textPaint.setColor(h6.w0(null, i10, false));
        textPaint.setTextSize(AndroidUtilities.dp(11.5f));
        textPaint.setTypeface(AndroidUtilities.bold());
        this.f43107b = view;
        view.setAlpha(0.0f);
        addView(w9Var, x5.d(-1, -1.0f, 0, 5.0f, 5.0f, 5.0f, 5.0f));
        addView((View) view, x5.d(26, 26.0f, 85, 0.0f, 0.0f, 1.0f, 3.0f));
        paint.setColor(h6.w0(null, i10, false));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.d) {
            canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(2.0f), this.f43108c);
        }
        super.dispatchDraw(canvas);
    }
}
