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
import org.telegram.messenger.sl;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.q6;
import w7.z5;
public final class t0 extends FrameLayout {
    public final int f46865a = 1;
    public final Object f46866b;
    public final KeyEvent.Callback f46867c;

    public t0(y0 y0Var, Context context, a1 a1Var) {
        super(context);
        this.f46867c = y0Var;
        this.f46866b = a1Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f46865a) {
            case 0:
                ((a1) this.f46866b).d(0, 0.0f, 0, getMeasuredWidth(), 0.0f, getMeasuredHeight());
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, AndroidUtilities.dp(2.0f), getMeasuredWidth(), AndroidUtilities.dp(18.0f) + getMeasuredHeight());
                canvas.save();
                canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
                a1 a1Var = (a1) this.f46866b;
                a1Var.f46619f.setAlpha(((y0) this.f46867c).K);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(24.0f) - 1, AndroidUtilities.dp(24.0f) - 1, a1Var.f46619f);
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
        switch (this.f46865a) {
            case 0:
                super.onMeasure(i10, sl.C(2.0f, ((y0) this.f46867c).f46952s, 1073741824));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    public t0(Context context, g6 g6Var) {
        super(context);
        LinearLayout e = sl.e(context, 1);
        q6 q6Var = new q6(context, false, false, false);
        this.f46866b = q6Var;
        int i10 = k6.G6;
        r6.a0(q6Var, i10, g6Var);
        q6Var.setTextSize(AndroidUtilities.dp(17.0f));
        q6Var.setTypeface(AndroidUtilities.bold());
        e.addView(q6Var, z5.q(-2, 23, 1));
        TextView textView = new TextView(context);
        this.f46867c = textView;
        textView.setTextSize(1, 11.0f);
        r6.W(textView, i10, g6Var);
        textView.setSingleLine();
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        e.addView(textView, z5.q(-2, -2, 1));
        addView(e, z5.e(-2, -2, 17));
    }
}
