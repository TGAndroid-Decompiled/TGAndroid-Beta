package yh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ia0;
public final class r extends LinearLayout {
    public final ImageView f53324a;
    public final ia0 f53325b;
    public final ia0 f53326c;

    public r(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        float f7;
        float f10;
        setOrientation(0);
        if (i10 == 1) {
            f7 = 11.0f;
        } else {
            f7 = 32.0f;
        }
        int dp = AndroidUtilities.dp(f7);
        int dp2 = AndroidUtilities.dp(i10 == 1 ? 11.0f : 32.0f);
        if (i10 == 1) {
            f10 = 8.0f;
        } else {
            f10 = 12.0f;
        }
        setPadding(dp, 0, dp2, AndroidUtilities.dp(f10));
        ImageView imageView = new ImageView(context);
        this.f53324a = imageView;
        int i11 = org.telegram.ui.ActionBar.h6.G6;
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, i11, false), PorterDuff.Mode.SRC_IN));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, w7.w5.t(24, 24, 51, 0, 6, 16, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        ia0 ia0Var = new ia0(context, null);
        this.f53325b = ia0Var;
        ia0Var.setTypeface(AndroidUtilities.bold());
        ia0Var.setTextSize(1, 14.0f);
        ia0Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(i11, c6Var));
        int i12 = org.telegram.ui.ActionBar.h6.gc;
        ia0Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(i12, c6Var));
        linearLayout.addView(ia0Var, w7.w5.t(-1, -2, 7, 0, 0, 0, 3));
        ia0 ia0Var2 = new ia0(context, null);
        this.f53326c = ia0Var2;
        ia0Var2.setTextSize(1, 14.0f);
        ia0Var2.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20964z6, c6Var));
        ia0Var2.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(i12, c6Var));
        linearLayout.addView(ia0Var2, w7.w5.q(-1, -2, 7));
        addView(linearLayout, w7.w5.p(-1, -2, 1.0f, 55, 0, 0, 0, 0));
    }

    public final void a(CharSequence charSequence, CharSequence charSequence2, int i10) {
        this.f53324a.setImageResource(i10);
        this.f53325b.setText(charSequence);
        this.f53326c.setText(charSequence2);
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f53326c.setText(charSequence);
    }

    public void setTitle(CharSequence charSequence) {
        this.f53325b.setText(charSequence);
    }
}
