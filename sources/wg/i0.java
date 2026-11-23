package wg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
import c8.na;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.b9;
import org.telegram.ui.Components.q9;
public final class i0 extends FrameLayout implements b6 {
    public static final int f59779f = 0;
    public final q9 f59780a;
    public final h0 f59781b;
    public final Paint f59782c;
    public boolean d;
    public final b9 f59783e;

    public i0(Context context, float f10) {
        super(context);
        Paint paint = new Paint(1);
        this.f59782c = paint;
        this.d = true;
        this.f59783e = new b9((h6) null);
        q9 q9Var = new q9(getContext());
        this.f59780a = q9Var;
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(f10));
        ?? view = new View(context);
        TextPaint textPaint = new TextPaint(1);
        view.f59775a = textPaint;
        textPaint.setTextAlign(Paint.Align.CENTER);
        int i7 = m6.f29290a7;
        textPaint.setColor(m6.x0(null, i7, false));
        textPaint.setTextSize(org.telegram.messenger.g0.L(11.5f));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        this.f59781b = view;
        view.setAlpha(0.0f);
        addView(q9Var, na.d(-1, -1.0f, 0, 5.0f, 5.0f, 5.0f, 5.0f));
        addView((View) view, na.d(26, 26.0f, 85, 0.0f, 0.0f, 1.0f, 3.0f));
        paint.setColor(m6.x0(null, i7, false));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.d) {
            canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, (getMeasuredHeight() / 2.0f) - org.telegram.messenger.g0.L(2.0f), this.f59782c);
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void updateColors() {
        try {
            this.f59782c.setColor(m6.x0(null, m6.f29290a7, false));
            invalidate();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
