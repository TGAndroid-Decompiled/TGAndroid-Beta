package sh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.a6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.p9;
public final class f extends FrameLayout implements a6 {
    public final p9 f44332a;
    public final f6 f44333b;
    public final TextView f44334c;
    public final TextView d;

    public f(Context context, f6 f6Var) {
        super(context);
        this.f44333b = f6Var;
        p9 p9Var = new p9(context);
        this.f44332a = p9Var;
        p9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
        addView(p9Var, b6.d(72, 72.0f, 49, 0.0f, 36.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f44334c = textView;
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 20.0f);
        textView.setGravity(17);
        addView(textView, b6.d(-1, -2.0f, 49, 24.0f, 123.0f, 24.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(17);
        textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(textView2, b6.d(-1, -2.0f, 49, 32.0f, 157.0f, 32.0f, 0.0f));
        e();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Drawable drawable = j6.S0;
        p9 p9Var = this.f44332a;
        lf.r.a(canvas, drawable, (p9Var.getWidth() / 2.0f) + p9Var.getLeft(), (p9Var.getHeight() / 2.0f) + p9Var.getTop(), p9Var.getHeight());
    }

    @Override
    public final void e() {
        int i10 = j6.G6;
        f6 f6Var = this.f44333b;
        this.f44334c.setTextColor(j6.v0(i10, f6Var));
        this.d.setTextColor(j6.v0(j6.f20298z6, f6Var));
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
        this.f44334c.setText(charSequence);
    }
}
