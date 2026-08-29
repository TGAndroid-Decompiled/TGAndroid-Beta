package ph;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import i7.f6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.th;
public final class i extends FrameLayout {
    public final ImageView f45831a;
    public final TextView f45832b;
    public final TextView f45833c;

    public i(Context context, c6 c6Var, boolean z10) {
        super(context);
        float f9;
        float f10;
        ImageView imageView = new ImageView(context);
        this.f45831a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i10 = g6.G6;
        imageView.setColorFilter(new PorterDuffColorFilter(g6.v0(i10, c6Var), PorterDuff.Mode.SRC_IN));
        addView(imageView, f6.d(24, 24.0f, 51, 20.0f, 11.46f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        if (z10) {
            f9 = 2.0f;
        } else {
            f9 = 9.8f;
        }
        if (z10) {
            f10 = 4.0f;
        } else {
            f10 = 9.8f;
        }
        addView(linearLayout, f6.d(-1, -2.0f, 23, 64.0f, f9, 24.0f, f10));
        TextView textView = new TextView(context);
        this.f45832b = textView;
        textView.setTextColor(g6.v0(i10, c6Var));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 14.0f);
        TextView i11 = th.i(linearLayout, textView, f6.t(-1, -2, 55, 0, 0, 0, 1), context);
        this.f45833c = i11;
        org.telegram.ui.b.m(g6.f23450z6, c6Var, i11, 1, 14.0f);
        linearLayout.addView(i11, f6.t(-1, -2, 55, 0, 0, 0, 0));
    }

    public final void a(CharSequence charSequence, CharSequence charSequence2, int i10) {
        this.f45831a.setImageResource(i10);
        this.f45832b.setText(charSequence);
        this.f45833c.setText(charSequence2);
    }

    public void setText(CharSequence charSequence) {
        this.f45833c.setText(charSequence);
    }
}
