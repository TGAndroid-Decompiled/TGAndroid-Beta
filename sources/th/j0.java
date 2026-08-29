package th;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import i7.f6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
public final class j0 extends LinearLayout implements org.telegram.ui.ActionBar.x5 {
    public final c6 f48514a;
    public final ImageView f48515b;
    public final TextView f48516c;
    public final TextView d;

    public j0(Context context, k0 k0Var, c6 c6Var) {
        super(context);
        this.f48514a = c6Var;
        setOrientation(0);
        ImageView imageView = new ImageView(context);
        this.f48515b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, f6.t(42, 42, 19, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.f48516c = textView;
        textView.setTextSize(1, 16.0f);
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 16.0f);
        textView2.setGravity(5);
        addView(textView, f6.t(-2, -2, 19, 8, 0, 0, 0));
        addView(new Space(context), f6.o(0, -2, 1.0f, 119));
        addView(textView2, f6.t(-2, -2, 21, 8, 0, 0, 0));
        imageView.setImageResource(k0Var.f48529a);
        textView.setText(k0Var.f48530b);
        textView2.setText((CharSequence) k0Var.f48531c.get(0));
        e();
    }

    @Override
    public final void e() {
        int i10 = g6.G6;
        c6 c6Var = this.f48514a;
        this.f48515b.setColorFilter(new PorterDuffColorFilter(g6.v0(i10, c6Var), PorterDuff.Mode.SRC_IN));
        this.f48516c.setTextColor(g6.v0(i10, c6Var));
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
