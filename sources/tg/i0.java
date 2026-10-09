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
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.y9;
import w7.x5;
public final class i0 extends FrameLayout {
    public static final int f48329f = 0;
    public final y9 f48330a;
    public final h0 f48331b;
    public final Paint f48332c;
    public boolean d;
    public final j9 f48333e;

    public i0(Context context, float f7) {
        super(context);
        Paint paint = new Paint(1);
        this.f48332c = paint;
        this.d = true;
        this.f48333e = new j9((e6) null);
        y9 y9Var = new y9(getContext());
        this.f48330a = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(f7));
        ?? view = new View(context);
        TextPaint textPaint = new TextPaint(1);
        view.f48327a = textPaint;
        textPaint.setTextAlign(Paint.Align.CENTER);
        int i10 = i6.f20741a7;
        textPaint.setColor(i6.x0(null, i10, false));
        textPaint.setTextSize(AndroidUtilities.dp(11.5f));
        textPaint.setTypeface(AndroidUtilities.bold());
        this.f48331b = view;
        view.setAlpha(0.0f);
        addView(y9Var, x5.a(-1.0f, 5.0f, 5.0f, 5.0f, 5.0f, -1, 0));
        addView((View) view, x5.a(26.0f, 0.0f, 0.0f, 1.0f, 3.0f, 26, 85));
        paint.setColor(i6.x0(null, i10, false));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.d) {
            canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(2.0f), this.f48332c);
        }
        super.dispatchDraw(canvas);
    }
}
