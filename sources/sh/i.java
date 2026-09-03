package sh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.yh;
public final class i extends FrameLayout {
    public final ImageView f47492a;
    public final TextView f47493b;
    public final TextView f47494c;

    public i(Context context, g6 g6Var, boolean z4) {
        super(context);
        float f10;
        float f11;
        ImageView imageView = new ImageView(context);
        this.f47492a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i10 = k6.G6;
        imageView.setColorFilter(new PorterDuffColorFilter(k6.v0(i10, g6Var), PorterDuff.Mode.SRC_IN));
        addView(imageView, c6.d(24, 24.0f, 51, 20.0f, 11.46f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        if (z4) {
            f10 = 2.0f;
        } else {
            f10 = 9.8f;
        }
        if (z4) {
            f11 = 4.0f;
        } else {
            f11 = 9.8f;
        }
        addView(linearLayout, c6.d(-1, -2.0f, 23, 64.0f, f10, 24.0f, f11));
        TextView textView = new TextView(context);
        this.f47493b = textView;
        textView.setTextColor(k6.v0(i10, g6Var));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 14.0f);
        TextView i11 = yh.i(linearLayout, textView, c6.t(-1, -2, 55, 0, 0, 0, 1), context);
        this.f47494c = i11;
        org.telegram.ui.b.l(k6.f22055z6, g6Var, i11, 1, 14.0f);
        linearLayout.addView(i11, c6.t(-1, -2, 55, 0, 0, 0, 0));
    }

    public final void a(CharSequence charSequence, CharSequence charSequence2, int i10) {
        this.f47492a.setImageResource(i10);
        this.f47493b.setText(charSequence);
        this.f47494c.setText(charSequence2);
    }

    public void setText(CharSequence charSequence) {
        this.f47494c.setText(charSequence);
    }
}
