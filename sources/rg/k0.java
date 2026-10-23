package rg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.nk;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.q6;
import w7.z5;
public final class k0 extends FrameLayout {
    public final int f45424a = 2;
    public final Object f45425b;
    public final KeyEvent.Callback f45426c;

    public k0(sg.y0 y0Var, Context context, sg.a1 a1Var) {
        super(context);
        this.f45426c = y0Var;
        this.f45425b = a1Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f45424a) {
            case 1:
                ((sg.a1) this.f45425b).d(0, 0.0f, 0, getMeasuredWidth(), 0.0f, getMeasuredHeight());
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, AndroidUtilities.dp(2.0f), getMeasuredWidth(), AndroidUtilities.dp(18.0f) + getMeasuredHeight());
                canvas.save();
                canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
                sg.a1 a1Var = (sg.a1) this.f45425b;
                a1Var.f46195f.setAlpha(((sg.y0) this.f45426c).K);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(24.0f) - 1, AndroidUtilities.dp(24.0f) - 1, a1Var.f46195f);
                canvas.restore();
                super.dispatchDraw(canvas);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z10;
        float f7;
        switch (this.f45424a) {
            case 0:
                Path path = (Path) this.f45425b;
                l0 l0Var = (l0) this.f45426c;
                if (l0Var.h != null && (((z10 = l0Var.f45451f) && view == l0Var.d) || (!z10 && view == l0Var.f45450c))) {
                    if (z10) {
                        f7 = l0Var.e;
                    } else {
                        f7 = 1.0f - l0Var.e;
                    }
                    canvas.save();
                    path.rewind();
                    path.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, (f7 * getMeasuredWidth()) / 2.0f, Path.Direction.CW);
                    canvas.clipPath(path);
                    boolean drawChild = super.drawChild(canvas, view, j10);
                    canvas.restore();
                    return drawChild;
                }
                return super.drawChild(canvas, view, j10);
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f45424a) {
            case 1:
                super.onMeasure(i10, nk.C(2.0f, ((sg.y0) this.f45426c).f46518s, 1073741824));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    public k0(Context context, d6 d6Var) {
        super(context);
        LinearLayout e = nk.e(context, 1);
        q6 q6Var = new q6(context, false, false, false);
        this.f45425b = q6Var;
        int i10 = h6.G6;
        q6Var.setTextColor(h6.w0(i10, d6Var));
        q6Var.setTextSize(AndroidUtilities.dp(17.0f));
        q6Var.setTypeface(AndroidUtilities.bold());
        e.addView(q6Var, z5.q(-2, 23, 1));
        TextView textView = new TextView(context);
        this.f45426c = textView;
        textView.setTextSize(1, 11.0f);
        textView.setTextColor(h6.w0(i10, d6Var));
        textView.setSingleLine();
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        e.addView(textView, z5.q(-2, -2, 1));
        addView(e, z5.e(-2, -2, 17));
    }

    public k0(l0 l0Var, Context context) {
        super(context);
        this.f45426c = l0Var;
        this.f45425b = new Path();
    }
}
