package xg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
import b8.mf;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.z5;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.u8;
public final class i0 extends FrameLayout implements z5 {
    public static final int f58711f = 0;
    public final k9 f58712a;
    public final h0 f58713b;
    public final Paint f58714c;
    public boolean d;
    public final u8 f58715e;

    public i0(Context context, float f10) {
        super(context);
        Paint paint = new Paint(1);
        this.f58714c = paint;
        this.d = true;
        this.f58715e = new u8((e6) null);
        k9 k9Var = new k9(getContext());
        this.f58712a = k9Var;
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(f10));
        ?? view = new View(context);
        TextPaint textPaint = new TextPaint(1);
        view.f58709a = textPaint;
        textPaint.setTextAlign(Paint.Align.CENTER);
        int i3 = k6.f27824a7;
        textPaint.setColor(k6.x0(null, i3, false));
        textPaint.setTextSize(org.telegram.messenger.g0.L(11.5f));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        this.f58713b = view;
        view.setAlpha(0.0f);
        addView(k9Var, mf.d(-1, -1.0f, 0, 5.0f, 5.0f, 5.0f, 5.0f));
        addView((View) view, mf.d(26, 26.0f, 85, 0.0f, 0.0f, 1.0f, 3.0f));
        paint.setColor(k6.x0(null, i3, false));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.d) {
            canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, (getMeasuredHeight() / 2.0f) - org.telegram.messenger.g0.L(2.0f), this.f58714c);
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void updateColors() {
        try {
            this.f58714c.setColor(k6.x0(null, k6.f27824a7, false));
            invalidate();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
