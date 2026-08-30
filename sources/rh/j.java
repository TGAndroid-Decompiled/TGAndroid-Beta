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
import org.telegram.ui.yh;
public final class j extends FrameLayout {
    public final ImageView f43563a;
    public final TextView f43564b;
    public final TextView f43565c;

    public j(Context context, f6 f6Var, boolean z4) {
        super(context);
        float f10;
        float f11;
        ImageView imageView = new ImageView(context);
        this.f43563a = imageView;
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
        this.f43564b = textView;
        textView.setTextColor(j6.v0(i10, f6Var));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 14.0f);
        TextView j10 = yh.j(linearLayout, textView, b6.t(-1, -2, 55, 0, 0, 0, 1), context);
        this.f43565c = j10;
        org.telegram.ui.b.l(j6.f20298z6, f6Var, j10, 1, 14.0f);
        linearLayout.addView(j10, b6.t(-1, -2, 55, 0, 0, 0, 0));
    }

    public final void a(CharSequence charSequence, CharSequence charSequence2, int i10) {
        this.f43563a.setImageResource(i10);
        this.f43564b.setText(charSequence);
        this.f43565c.setText(charSequence2);
    }

    public void setText(CharSequence charSequence) {
        this.f43565c.setText(charSequence);
    }
}
