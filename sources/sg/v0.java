package sg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.wl;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.q6;
import w7.x5;
public final class v0 extends FrameLayout {
    public final int f46297a = 2;
    public Object f46298b;
    public KeyEvent.Callback f46299c;

    public v0(Context context) {
        super(context);
    }

    public void a(int i10, CharSequence charSequence, boolean z10) {
        ImageView imageView = (ImageView) this.f46298b;
        if (z10) {
            AndroidUtilities.updateImageViewImageAnimated(imageView, i10);
        } else {
            imageView.setImageResource(i10);
        }
        ((TextView) this.f46299c).setText(charSequence);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f46297a) {
            case 0:
                ((c1) this.f46298b).d(0, 0.0f, 0, getMeasuredWidth(), 0.0f, getMeasuredHeight());
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, AndroidUtilities.dp(2.0f), getMeasuredWidth(), AndroidUtilities.dp(18.0f) + getMeasuredHeight());
                canvas.save();
                canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
                c1 c1Var = (c1) this.f46298b;
                c1Var.f46035f.setAlpha(((a1) this.f46299c).K);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(24.0f) - 1, AndroidUtilities.dp(24.0f) - 1, c1Var.f46035f);
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
        switch (this.f46297a) {
            case 0:
                super.onMeasure(i10, wl.C(2.0f, ((a1) this.f46299c).f46017s, 1073741824));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    public v0(a1 a1Var, Context context, c1 c1Var) {
        super(context);
        this.f46299c = a1Var;
        this.f46298b = c1Var;
    }

    public v0(Context context, f6 f6Var) {
        super(context);
        LinearLayout f7 = wl.f(context, 1);
        q6 q6Var = new q6(context, false, false, false);
        this.f46298b = q6Var;
        int i10 = j6.G6;
        q6Var.setTextColor(j6.v0(i10, f6Var));
        q6Var.setTextSize(AndroidUtilities.dp(17.0f));
        q6Var.setTypeface(AndroidUtilities.bold());
        f7.addView(q6Var, x5.q(-2, 23, 1));
        TextView textView = new TextView(context);
        this.f46299c = textView;
        textView.setTextSize(1, 11.0f);
        textView.setTextColor(j6.v0(i10, f6Var));
        textView.setSingleLine();
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        f7.addView(textView, x5.q(-2, -2, 1));
        addView(f7, x5.e(-2, -2, 17));
    }
}
