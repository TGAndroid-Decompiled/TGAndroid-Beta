package yh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.l90;
public final class r extends LinearLayout {
    public final ImageView f47934a;
    public final l90 f47935b;
    public final l90 f47936c;

    public r(Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
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
        this.f47934a = imageView;
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i11, false), PorterDuff.Mode.SRC_IN));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, w7.y5.t(24, 24, 51, 0, 6, 16, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        l90 l90Var = new l90(context, null);
        this.f47935b = l90Var;
        l90Var.setTypeface(AndroidUtilities.bold());
        l90Var.setTextSize(1, 14.0f);
        l90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, e6Var));
        int i12 = org.telegram.ui.ActionBar.j6.gc;
        l90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i12, e6Var));
        linearLayout.addView(l90Var, w7.y5.t(-1, -2, 7, 0, 0, 0, 3));
        l90 l90Var2 = new l90(context, null);
        this.f47936c = l90Var2;
        l90Var2.setTextSize(1, 14.0f);
        l90Var2.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19464z6, e6Var));
        l90Var2.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i12, e6Var));
        linearLayout.addView(l90Var2, w7.y5.q(-1, -2, 7));
        addView(linearLayout, w7.y5.p(-1, -2, 1.0f, 55, 0, 0, 0, 0));
    }

    public final void a(CharSequence charSequence, CharSequence charSequence2, int i10) {
        this.f47934a.setImageResource(i10);
        this.f47935b.setText(charSequence);
        this.f47936c.setText(charSequence2);
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f47936c.setText(charSequence);
    }

    public void setTitle(CharSequence charSequence) {
        this.f47935b.setText(charSequence);
    }
}
