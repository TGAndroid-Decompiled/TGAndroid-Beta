package rg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.sk;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.s6;
import w7.z5;
public final class m0 extends FrameLayout {
    public final int f44106a = 3;
    public Object f44107b;
    public KeyEvent.Callback f44108c;

    public m0(Context context) {
        super(context);
    }

    public void a(int i10, CharSequence charSequence, boolean z10) {
        ImageView imageView = (ImageView) this.f44107b;
        if (z10) {
            AndroidUtilities.updateImageViewImageAnimated(imageView, i10);
        } else {
            imageView.setImageResource(i10);
        }
        ((TextView) this.f44108c).setText(charSequence);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f44106a) {
            case 1:
                ((sg.a1) this.f44107b).d(0, 0.0f, 0, getMeasuredWidth(), 0.0f, getMeasuredHeight());
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, AndroidUtilities.dp(2.0f), getMeasuredWidth(), AndroidUtilities.dp(18.0f) + getMeasuredHeight());
                canvas.save();
                canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
                sg.a1 a1Var = (sg.a1) this.f44107b;
                a1Var.f45117f.setAlpha(((sg.y0) this.f44108c).K);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(24.0f) - 1, AndroidUtilities.dp(24.0f) - 1, a1Var.f45117f);
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
        switch (this.f44106a) {
            case 0:
                Path path = (Path) this.f44107b;
                n0 n0Var = (n0) this.f44108c;
                if (n0Var.h != null && (((z10 = n0Var.f44133f) && view == n0Var.d) || (!z10 && view == n0Var.f44132c))) {
                    if (z10) {
                        f7 = n0Var.e;
                    } else {
                        f7 = 1.0f - n0Var.e;
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
        switch (this.f44106a) {
            case 1:
                super.onMeasure(i10, sk.C(2.0f, ((sg.y0) this.f44108c).f45440s, 1073741824));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    public m0(sg.y0 y0Var, Context context, sg.a1 a1Var) {
        super(context);
        this.f44108c = y0Var;
        this.f44107b = a1Var;
    }

    public m0(Context context, c6 c6Var) {
        super(context);
        LinearLayout e = sk.e(context, 1);
        s6 s6Var = new s6(context, false, false, false);
        this.f44107b = s6Var;
        int i10 = g6.G6;
        s6Var.setTextColor(g6.w0(i10, c6Var));
        s6Var.setTextSize(AndroidUtilities.dp(17.0f));
        s6Var.setTypeface(AndroidUtilities.bold());
        e.addView(s6Var, z5.q(-2, 23, 1));
        TextView textView = new TextView(context);
        this.f44108c = textView;
        textView.setTextSize(1, 11.0f);
        textView.setTextColor(g6.w0(i10, c6Var));
        textView.setSingleLine();
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        e.addView(textView, z5.q(-2, -2, 1));
        addView(e, z5.e(-2, -2, 17));
    }

    public m0(n0 n0Var, Context context) {
        super(context);
        this.f44108c = n0Var;
        this.f44107b = new Path();
    }
}
