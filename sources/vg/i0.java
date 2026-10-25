package vg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.y9;
public final class i0 extends FrameLayout implements p6 {
    public static final int f50179f = 0;
    public final y9 f50180a;
    public final h0 f50181b;
    public final Paint f50182c;
    public boolean d;
    public final j9 e;

    public i0(Context context, float f7) {
        super(context);
        Paint paint = new Paint(1);
        this.f50182c = paint;
        this.d = true;
        this.e = new j9((u6) null);
        y9 y9Var = new y9(getContext());
        this.f50180a = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(f7));
        ?? view = new View(context);
        TextPaint textPaint = new TextPaint(1);
        view.f50177a = textPaint;
        textPaint.setTextAlign(Paint.Align.CENTER);
        int i10 = y6.f23297a7;
        textPaint.setColor(y6.x0(null, i10, false));
        textPaint.setTextSize(AndroidUtilities.dp(11.5f));
        textPaint.setTypeface(AndroidUtilities.bold());
        this.f50181b = view;
        view.setAlpha(0.0f);
        addView(y9Var, gb1.h(-1, -1.0f, 0, 5.0f, 5.0f, 5.0f, 5.0f));
        addView((View) view, gb1.h(26, 26.0f, 85, 0.0f, 0.0f, 1.0f, 3.0f));
        paint.setColor(y6.x0(null, i10, false));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.d) {
            canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(2.0f), this.f50182c);
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void updateColors() {
        try {
            this.f50182c.setColor(y6.x0(null, y6.f23297a7, false));
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
