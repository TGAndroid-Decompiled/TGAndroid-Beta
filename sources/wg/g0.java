package wg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
import c8.ja;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.z5;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.t8;
public final class g0 extends FrameLayout implements z5 {
    public static final int f59182f = 0;
    public final i9 f59183a;
    public final f0 f59184b;
    public final Paint f59185c;
    public boolean d;
    public final t8 f59186e;

    public g0(Context context, float f10) {
        super(context);
        Paint paint = new Paint(1);
        this.f59185c = paint;
        this.d = true;
        this.f59186e = new t8((e6) null);
        i9 i9Var = new i9(getContext());
        this.f59183a = i9Var;
        i9Var.setRoundRadius(org.telegram.messenger.g0.L(f10));
        ?? view = new View(context);
        TextPaint textPaint = new TextPaint(1);
        view.f59180a = textPaint;
        textPaint.setTextAlign(Paint.Align.CENTER);
        int i7 = j6.f28792a7;
        textPaint.setColor(j6.x0(null, i7, false));
        textPaint.setTextSize(org.telegram.messenger.g0.L(11.5f));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        this.f59184b = view;
        view.setAlpha(0.0f);
        addView(i9Var, ja.d(-1, -1.0f, 0, 5.0f, 5.0f, 5.0f, 5.0f));
        addView((View) view, ja.d(26, 26.0f, 85, 0.0f, 0.0f, 1.0f, 3.0f));
        paint.setColor(j6.x0(null, i7, false));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.d) {
            canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, (getMeasuredHeight() / 2.0f) - org.telegram.messenger.g0.L(2.0f), this.f59185c);
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void updateColors() {
        try {
            this.f59185c.setColor(j6.x0(null, j6.f28792a7, false));
            invalidate();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
