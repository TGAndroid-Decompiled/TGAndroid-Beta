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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.v8;
public final class i0 extends FrameLayout implements c6 {
    public static final int f57754f = 0;
    public final k9 f57755a;
    public final h0 f57756b;
    public final Paint f57757c;
    public boolean d;
    public final v8 f57758e;

    public i0(Context context, float f10) {
        super(context);
        Paint paint = new Paint(1);
        this.f57757c = paint;
        this.d = true;
        this.f57758e = new v8((h6) null);
        k9 k9Var = new k9(getContext());
        this.f57755a = k9Var;
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(f10));
        ?? view = new View(context);
        TextPaint textPaint = new TextPaint(1);
        view.f57750a = textPaint;
        textPaint.setTextAlign(Paint.Align.CENTER);
        int i7 = m6.f27834a7;
        textPaint.setColor(m6.x0(null, i7, false));
        textPaint.setTextSize(org.telegram.messenger.g0.L(11.5f));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        this.f57756b = view;
        view.setAlpha(0.0f);
        addView(k9Var, ha.d(-1, -1.0f, 0, 5.0f, 5.0f, 5.0f, 5.0f));
        addView((View) view, ha.d(26, 26.0f, 85, 0.0f, 0.0f, 1.0f, 3.0f));
        paint.setColor(m6.x0(null, i7, false));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.d) {
            canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, (getMeasuredHeight() / 2.0f) - org.telegram.messenger.g0.L(2.0f), this.f57757c);
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void updateColors() {
        try {
            this.f57757c.setColor(m6.x0(null, m6.f27834a7, false));
            invalidate();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
