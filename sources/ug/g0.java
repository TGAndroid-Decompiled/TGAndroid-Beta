package ug;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.f9;
import org.telegram.ui.Components.u9;
import w7.z5;
public final class g0 extends FrameLayout implements b6 {
    public static final int f48121f = 0;
    public final u9 f48122a;
    public final f0 f48123b;
    public final Paint f48124c;
    public boolean d;
    public final f9 e;

    public g0(Context context, float f7) {
        super(context);
        Paint paint = new Paint(1);
        this.f48124c = paint;
        this.d = true;
        this.e = new f9((g6) null);
        u9 u9Var = new u9(getContext());
        this.f48122a = u9Var;
        u9Var.setRoundRadius(AndroidUtilities.dp(f7));
        ?? view = new View(context);
        TextPaint textPaint = new TextPaint(1);
        view.f48119a = textPaint;
        textPaint.setTextAlign(Paint.Align.CENTER);
        int i10 = k6.f21126a7;
        textPaint.setColor(k6.x0(null, i10, false));
        textPaint.setTextSize(AndroidUtilities.dp(11.5f));
        textPaint.setTypeface(AndroidUtilities.bold());
        this.f48123b = view;
        view.setAlpha(0.0f);
        addView(u9Var, z5.d(-1, -1.0f, 0, 5.0f, 5.0f, 5.0f, 5.0f));
        addView((View) view, z5.d(26, 26.0f, 85, 0.0f, 0.0f, 1.0f, 3.0f));
        paint.setColor(k6.x0(null, i10, false));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.d) {
            canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(2.0f), this.f48124c);
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void updateColors() {
        try {
            this.f48124c.setColor(k6.x0(null, k6.f21126a7, false));
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
