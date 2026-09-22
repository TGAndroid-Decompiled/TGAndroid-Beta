package tg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.v9;
import w7.y5;
public final class i0 extends FrameLayout {
    public static final int f43449f = 0;
    public final v9 f43450a;
    public final h0 f43451b;
    public final Paint f43452c;
    public boolean d;
    public final g9 e;

    public i0(Context context, float f7) {
        super(context);
        Paint paint = new Paint(1);
        this.f43452c = paint;
        this.d = true;
        this.e = new g9((f6) null);
        v9 v9Var = new v9(getContext());
        this.f43450a = v9Var;
        v9Var.setRoundRadius(AndroidUtilities.dp(f7));
        ?? view = new View(context);
        TextPaint textPaint = new TextPaint(1);
        view.f43447a = textPaint;
        textPaint.setTextAlign(Paint.Align.CENTER);
        int i10 = j6.f19053a7;
        textPaint.setColor(j6.w0(null, i10, false));
        textPaint.setTextSize(AndroidUtilities.dp(11.5f));
        textPaint.setTypeface(AndroidUtilities.bold());
        this.f43451b = view;
        view.setAlpha(0.0f);
        addView(v9Var, y5.d(-1, -1.0f, 0, 5.0f, 5.0f, 5.0f, 5.0f));
        addView((View) view, y5.d(26, 26.0f, 85, 0.0f, 0.0f, 1.0f, 3.0f));
        paint.setColor(j6.w0(null, i10, false));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.d) {
            canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(2.0f), this.f43452c);
        }
        super.dispatchDraw(canvas);
    }
}
