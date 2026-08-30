package vh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.a6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
public final class j0 extends LinearLayout implements a6 {
    public final f6 f45950a;
    public final ImageView f45951b;
    public final TextView f45952c;
    public final TextView d;

    public j0(Context context, k0 k0Var, f6 f6Var) {
        super(context);
        this.f45950a = f6Var;
        setOrientation(0);
        ImageView imageView = new ImageView(context);
        this.f45951b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, b6.t(42, 42, 19, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.f45952c = textView;
        textView.setTextSize(1, 16.0f);
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 16.0f);
        textView2.setGravity(5);
        addView(textView, b6.t(-2, -2, 19, 8, 0, 0, 0));
        addView(new Space(context), b6.o(0, -2, 1.0f, 119));
        addView(textView2, b6.t(-2, -2, 21, 8, 0, 0, 0));
        imageView.setImageResource(k0Var.f45962a);
        textView.setText(k0Var.f45963b);
        textView2.setText((CharSequence) k0Var.f45964c.get(0));
        e();
    }

    @Override
    public final void e() {
        int i10 = j6.G6;
        f6 f6Var = this.f45950a;
        this.f45951b.setColorFilter(new PorterDuffColorFilter(j6.v0(i10, f6Var), PorterDuff.Mode.SRC_IN));
        this.f45952c.setTextColor(j6.v0(i10, f6Var));
        this.d.setTextColor(j6.l1(0.75f, j6.v0(i10, f6Var)));
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
    }
}
