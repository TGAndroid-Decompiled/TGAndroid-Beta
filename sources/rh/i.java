package rh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ai;
public final class i extends FrameLayout {
    public final ImageView f43615a;
    public final TextView f43616b;
    public final TextView f43617c;

    public i(Context context, f6 f6Var, boolean z4) {
        super(context);
        float f10;
        float f11;
        ImageView imageView = new ImageView(context);
        this.f43615a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i10 = j6.G6;
        imageView.setColorFilter(new PorterDuffColorFilter(j6.v0(i10, f6Var), PorterDuff.Mode.SRC_IN));
        addView(imageView, b6.d(24, 24.0f, 51, 20.0f, 11.46f, 0.0f, 0.0f));
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
        addView(linearLayout, b6.d(-1, -2.0f, 23, 64.0f, f10, 24.0f, f11));
        TextView textView = new TextView(context);
        this.f43616b = textView;
        textView.setTextColor(j6.v0(i10, f6Var));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 14.0f);
        TextView i11 = ai.i(linearLayout, textView, b6.t(-1, -2, 55, 0, 0, 0, 1), context);
        this.f43617c = i11;
        org.telegram.ui.b.l(j6.f20273z6, f6Var, i11, 1, 14.0f);
        linearLayout.addView(i11, b6.t(-1, -2, 55, 0, 0, 0, 0));
    }

    public final void a(CharSequence charSequence, CharSequence charSequence2, int i10) {
        this.f43615a.setImageResource(i10);
        this.f43616b.setText(charSequence);
        this.f43617c.setText(charSequence2);
    }

    public void setText(CharSequence charSequence) {
        this.f43617c.setText(charSequence);
    }
}
