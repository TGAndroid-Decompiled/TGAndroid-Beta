package tg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.vh;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.s6;
public final class t0 extends FrameLayout {
    public final int f49042a = 1;
    public final Object f49043b;
    public final KeyEvent.Callback f49044c;

    public t0(y0 y0Var, Context context, a1 a1Var) {
        super(context);
        this.f49044c = y0Var;
        this.f49043b = a1Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f49042a) {
            case 0:
                ((a1) this.f49043b).d(0, 0.0f, 0, getMeasuredWidth(), 0.0f, getMeasuredHeight());
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, AndroidUtilities.dp(2.0f), getMeasuredWidth(), AndroidUtilities.dp(18.0f) + getMeasuredHeight());
                canvas.save();
                canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
                a1 a1Var = (a1) this.f49043b;
                a1Var.f48794f.setAlpha(((y0) this.f49044c).K);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(24.0f) - 1, AndroidUtilities.dp(24.0f) - 1, a1Var.f48794f);
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
        switch (this.f49042a) {
            case 0:
                super.onMeasure(i10, vh.D(2.0f, ((y0) this.f49044c).f49129s, 1073741824));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    public t0(Context context, u6 u6Var) {
        super(context);
        LinearLayout d = vh.d(context, 1);
        s6 s6Var = new s6(context, false, false, false);
        this.f49043b = s6Var;
        int i10 = y6.G6;
        f7.Z(s6Var, i10, u6Var);
        s6Var.setTextSize(AndroidUtilities.dp(17.0f));
        s6Var.setTypeface(AndroidUtilities.bold());
        d.addView(s6Var, gb1.u(-2, 23, 1));
        TextView textView = new TextView(context);
        this.f49044c = textView;
        textView.setTextSize(1, 11.0f);
        f7.V(textView, i10, u6Var);
        textView.setSingleLine();
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        d.addView(textView, gb1.u(-2, -2, 1));
        addView(d, gb1.i(-2, -2, 17));
    }
}
