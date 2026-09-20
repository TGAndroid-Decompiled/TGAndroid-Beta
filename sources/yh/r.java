package yh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.k90;
public final class r extends LinearLayout {
    public final ImageView f47977a;
    public final k90 f47978b;
    public final k90 f47979c;

    public r(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
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
        this.f47977a = imageView;
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i11, false), PorterDuff.Mode.SRC_IN));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, w7.y5.t(24, 24, 51, 0, 6, 16, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        k90 k90Var = new k90(context, null);
        this.f47978b = k90Var;
        k90Var.setTypeface(AndroidUtilities.bold());
        k90Var.setTextSize(1, 14.0f);
        k90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        int i12 = org.telegram.ui.ActionBar.j6.gc;
        k90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i12, f6Var));
        linearLayout.addView(k90Var, w7.y5.t(-1, -2, 7, 0, 0, 0, 3));
        k90 k90Var2 = new k90(context, null);
        this.f47979c = k90Var2;
        k90Var2.setTextSize(1, 14.0f);
        k90Var2.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19496z6, f6Var));
        k90Var2.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i12, f6Var));
        linearLayout.addView(k90Var2, w7.y5.q(-1, -2, 7));
        addView(linearLayout, w7.y5.p(-1, -2, 1.0f, 55, 0, 0, 0, 0));
    }

    public final void a(CharSequence charSequence, CharSequence charSequence2, int i10) {
        this.f47977a.setImageResource(i10);
        this.f47978b.setText(charSequence);
        this.f47979c.setText(charSequence2);
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f47979c.setText(charSequence);
    }

    public void setTitle(CharSequence charSequence) {
        this.f47978b.setText(charSequence);
    }
}
