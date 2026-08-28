package qh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import g7.e6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
public final class j0 extends LinearLayout implements org.telegram.ui.ActionBar.w5 {
    public final b6 f46455a;
    public final ImageView f46456b;
    public final TextView f46457c;
    public final TextView d;

    public j0(Context context, k0 k0Var, b6 b6Var) {
        super(context);
        this.f46455a = b6Var;
        setOrientation(0);
        ImageView imageView = new ImageView(context);
        this.f46456b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, e6.t(42, 42, 19, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.f46457c = textView;
        textView.setTextSize(1, 16.0f);
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 16.0f);
        textView2.setGravity(5);
        addView(textView, e6.t(-2, -2, 19, 8, 0, 0, 0));
        addView(new Space(context), e6.o(0, -2, 1.0f, 119));
        addView(textView2, e6.t(-2, -2, 21, 8, 0, 0, 0));
        imageView.setImageResource(k0Var.f46472a);
        textView.setText(k0Var.f46473b);
        textView2.setText((CharSequence) k0Var.f46474c.get(0));
        d();
    }

    @Override
    public final void d() {
        int i9 = f6.G6;
        b6 b6Var = this.f46455a;
        this.f46456b.setColorFilter(new PorterDuffColorFilter(f6.v0(i9, b6Var), PorterDuff.Mode.SRC_IN));
        this.f46457c.setTextColor(f6.v0(i9, b6Var));
        this.d.setTextColor(f6.l1(0.75f, f6.v0(i9, b6Var)));
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
    }
}
