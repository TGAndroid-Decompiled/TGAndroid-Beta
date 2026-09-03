package th;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.p9;
public final class f extends FrameLayout implements b6 {
    public final p9 f48147a;
    public final g6 f48148b;
    public final TextView f48149c;
    public final TextView d;

    public f(Context context, g6 g6Var) {
        super(context);
        this.f48148b = g6Var;
        p9 p9Var = new p9(context);
        this.f48147a = p9Var;
        p9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
        addView(p9Var, c6.d(72, 72.0f, 49, 0.0f, 36.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f48149c = textView;
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 20.0f);
        textView.setGravity(17);
        addView(textView, c6.d(-1, -2.0f, 49, 24.0f, 123.0f, 24.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(17);
        textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(textView2, c6.d(-1, -2.0f, 49, 32.0f, 157.0f, 32.0f, 0.0f));
        e();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Drawable drawable = k6.S0;
        p9 p9Var = this.f48147a;
        lf.r.a(canvas, drawable, (p9Var.getWidth() / 2.0f) + p9Var.getLeft(), (p9Var.getHeight() / 2.0f) + p9Var.getTop(), p9Var.getHeight());
    }

    @Override
    public final void e() {
        int i10 = k6.G6;
        g6 g6Var = this.f48148b;
        this.f48149c.setTextColor(k6.v0(i10, g6Var));
        this.d.setTextColor(k6.v0(k6.f22055z6, g6Var));
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
        this.f48149c.setText(charSequence);
    }
}
