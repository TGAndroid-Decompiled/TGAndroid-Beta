package sg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.tl;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.o6;
import w7.z5;
public final class t0 extends FrameLayout {
    public final int f46864a = 1;
    public final Object f46865b;
    public final KeyEvent.Callback f46866c;

    public t0(y0 y0Var, Context context, a1 a1Var) {
        super(context);
        this.f46866c = y0Var;
        this.f46865b = a1Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f46864a) {
            case 0:
                ((a1) this.f46865b).d(0, 0.0f, 0, getMeasuredWidth(), 0.0f, getMeasuredHeight());
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, AndroidUtilities.dp(2.0f), getMeasuredWidth(), AndroidUtilities.dp(18.0f) + getMeasuredHeight());
                canvas.save();
                canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
                a1 a1Var = (a1) this.f46865b;
                a1Var.f46618f.setAlpha(((y0) this.f46866c).K);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(24.0f) - 1, AndroidUtilities.dp(24.0f) - 1, a1Var.f46618f);
                canvas.restore();
                super.dispatchDraw(canvas);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f46864a) {
            case 0:
                super.onMeasure(i10, tl.C(2.0f, ((y0) this.f46866c).f46951s, 1073741824));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    public t0(Context context, g6 g6Var) {
        super(context);
        LinearLayout e = tl.e(context, 1);
        o6 o6Var = new o6(context, false, false, false);
        this.f46865b = o6Var;
        int i10 = k6.G6;
        r6.a0(o6Var, i10, g6Var);
        o6Var.setTextSize(AndroidUtilities.dp(17.0f));
        o6Var.setTypeface(AndroidUtilities.bold());
        e.addView(o6Var, z5.q(-2, 23, 1));
        TextView textView = new TextView(context);
        this.f46866c = textView;
        textView.setTextSize(1, 11.0f);
        r6.W(textView, i10, g6Var);
        textView.setSingleLine();
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        e.addView(textView, z5.q(-2, -2, 1));
        addView(e, z5.e(-2, -2, 17));
    }
}
