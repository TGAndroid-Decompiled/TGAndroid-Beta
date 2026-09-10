package sg;

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
import org.telegram.ui.Components.w9;
import w7.a6;
public final class j0 extends FrameLayout {
    public static final int f41937f = 0;
    public final w9 f41938a;
    public final i0 f41939b;
    public final Paint f41940c;
    public boolean d;
    public final g9 e;

    public j0(Context context, float f7) {
        super(context);
        Paint paint = new Paint(1);
        this.f41940c = paint;
        this.d = true;
        this.e = new g9((f6) null);
        w9 w9Var = new w9(getContext());
        this.f41938a = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(f7));
        ?? view = new View(context);
        TextPaint textPaint = new TextPaint(1);
        view.f41933a = textPaint;
        textPaint.setTextAlign(Paint.Align.CENTER);
        int i10 = j6.f17872a7;
        textPaint.setColor(j6.w0(null, i10, false));
        textPaint.setTextSize(AndroidUtilities.dp(11.5f));
        textPaint.setTypeface(AndroidUtilities.bold());
        this.f41939b = view;
        view.setAlpha(0.0f);
        addView(w9Var, a6.d(-1, -1.0f, 0, 5.0f, 5.0f, 5.0f, 5.0f));
        addView((View) view, a6.d(26, 26.0f, 85, 0.0f, 0.0f, 1.0f, 3.0f));
        paint.setColor(j6.w0(null, i10, false));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.d) {
            canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(2.0f), this.f41940c);
        }
        super.dispatchDraw(canvas);
    }
}
