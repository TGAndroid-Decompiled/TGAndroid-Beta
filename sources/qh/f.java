package qh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import i7.f6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.x5;
import org.telegram.ui.Components.t9;
public final class f extends FrameLayout implements x5 {
    public final t9 f46692a;
    public final c6 f46693b;
    public final TextView f46694c;
    public final TextView d;

    public f(Context context, c6 c6Var) {
        super(context);
        this.f46693b = c6Var;
        t9 t9Var = new t9(context);
        this.f46692a = t9Var;
        t9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
        addView(t9Var, f6.d(72, 72.0f, 49, 0.0f, 36.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f46694c = textView;
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 20.0f);
        textView.setGravity(17);
        addView(textView, f6.d(-1, -2.0f, 49, 24.0f, 123.0f, 24.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(17);
        textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(textView2, f6.d(-1, -2.0f, 49, 32.0f, 157.0f, 32.0f, 0.0f));
        e();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Drawable drawable = g6.S0;
        t9 t9Var = this.f46692a;
        jf.r.a(canvas, drawable, (t9Var.getWidth() / 2.0f) + t9Var.getLeft(), (t9Var.getHeight() / 2.0f) + t9Var.getTop(), t9Var.getHeight());
    }

    @Override
    public final void e() {
        int i10 = g6.G6;
        c6 c6Var = this.f46693b;
        this.f46694c.setTextColor(g6.v0(i10, c6Var));
        this.d.setTextColor(g6.v0(g6.f23450z6, c6Var));
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(218.0f), 1073741824));
    }

    public void setSubtitle(CharSequence charSequence) {
        this.d.setText(charSequence);
    }

    public void setTitle(CharSequence charSequence) {
        this.f46694c.setText(charSequence);
    }
}
