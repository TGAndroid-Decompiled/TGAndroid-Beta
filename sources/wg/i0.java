package wg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
import c8.ha;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.ui.ActionBar.a6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.l9;
import org.telegram.ui.Components.w8;
public final class i0 extends FrameLayout implements a6 {
    public static final int f57756f = 0;
    public final l9 f57757a;
    public final h0 f57758b;
    public final Paint f57759c;
    public boolean d;
    public final w8 f57760e;

    public i0(Context context, float f10) {
        super(context);
        Paint paint = new Paint(1);
        this.f57759c = paint;
        this.d = true;
        this.f57760e = new w8((f6) null);
        l9 l9Var = new l9(getContext());
        this.f57757a = l9Var;
        l9Var.setRoundRadius(org.telegram.messenger.g0.L(f10));
        ?? view = new View(context);
        TextPaint textPaint = new TextPaint(1);
        view.f57752a = textPaint;
        textPaint.setTextAlign(Paint.Align.CENTER);
        int i7 = k6.f27796a7;
        textPaint.setColor(k6.x0(null, i7, false));
        textPaint.setTextSize(org.telegram.messenger.g0.L(11.5f));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        this.f57758b = view;
        view.setAlpha(0.0f);
        addView(l9Var, ha.d(-1, -1.0f, 0, 5.0f, 5.0f, 5.0f, 5.0f));
        addView((View) view, ha.d(26, 26.0f, 85, 0.0f, 0.0f, 1.0f, 3.0f));
        paint.setColor(k6.x0(null, i7, false));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.d) {
            canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, (getMeasuredHeight() / 2.0f) - org.telegram.messenger.g0.L(2.0f), this.f57759c);
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void updateColors() {
        try {
            this.f57759c.setColor(k6.x0(null, k6.f27796a7, false));
            invalidate();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
