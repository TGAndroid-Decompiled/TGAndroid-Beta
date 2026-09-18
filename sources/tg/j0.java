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
import org.telegram.ui.Components.f9;
import org.telegram.ui.Components.u9;
import w7.x5;
public final class j0 extends FrameLayout {
    public static final int f43181f = 0;
    public final u9 f43182a;
    public final i0 f43183b;
    public final Paint f43184c;
    public boolean d;
    public final f9 e;

    public j0(Context context, float f7) {
        super(context);
        Paint paint = new Paint(1);
        this.f43184c = paint;
        this.d = true;
        this.e = new f9((f6) null);
        u9 u9Var = new u9(getContext());
        this.f43182a = u9Var;
        u9Var.setRoundRadius(AndroidUtilities.dp(f7));
        ?? view = new View(context);
        TextPaint textPaint = new TextPaint(1);
        view.f43179a = textPaint;
        textPaint.setTextAlign(Paint.Align.CENTER);
        int i10 = j6.f18807a7;
        textPaint.setColor(j6.w0(null, i10, false));
        textPaint.setTextSize(AndroidUtilities.dp(11.5f));
        textPaint.setTypeface(AndroidUtilities.bold());
        this.f43183b = view;
        view.setAlpha(0.0f);
        addView(u9Var, x5.d(-1, -1.0f, 0, 5.0f, 5.0f, 5.0f, 5.0f));
        addView((View) view, x5.d(26, 26.0f, 85, 0.0f, 0.0f, 1.0f, 3.0f));
        paint.setColor(j6.w0(null, i10, false));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.d) {
            canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(2.0f), this.f43184c);
        }
        super.dispatchDraw(canvas);
    }
}
