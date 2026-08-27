package rh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import h7.z5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;

public final class j0 extends LinearLayout implements org.telegram.ui.ActionBar.x5 {

    public final c6 f47214a;

    public final ImageView f47215b;

    public final TextView f47216c;
    public final TextView d;

    public j0(Context context, k0 k0Var, c6 c6Var) {
        super(context);
        this.f47214a = c6Var;
        setOrientation(0);
        ImageView imageView = new ImageView(context);
        this.f47215b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, z5.t(42, 42, 19, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.f47216c = textView;
        textView.setTextSize(1, 16.0f);
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 16.0f);
        textView2.setGravity(5);
        addView(textView, z5.t(-2, -2, 19, 8, 0, 0, 0));
        addView(new Space(context), z5.o(0, -2, 1.0f, 119));
        addView(textView2, z5.t(-2, -2, 21, 8, 0, 0, 0));
        imageView.setImageResource(k0Var.f47229a);
        textView.setText(k0Var.f47230b);
        textView2.setText((CharSequence) k0Var.f47231c.get(0));
        d();
    }

    @Override
    public final void d() {
        int i10 = g6.G6;
        c6 c6Var = this.f47214a;
        this.f47215b.setColorFilter(new PorterDuffColorFilter(g6.v0(i10, c6Var), PorterDuff.Mode.SRC_IN));
        this.f47216c.setTextColor(g6.v0(i10, c6Var));
        this.d.setTextColor(g6.l1(0.75f, g6.v0(i10, c6Var)));
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
    }
}
