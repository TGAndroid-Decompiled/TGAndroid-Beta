package yh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.q90;
public final class r extends LinearLayout {
    public final ImageView f48042a;
    public final q90 f48043b;
    public final q90 f48044c;

    public r(Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
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
        this.f48042a = imageView;
        int i11 = org.telegram.ui.ActionBar.h6.G6;
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(null, i11, false), PorterDuff.Mode.SRC_IN));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, w7.y5.t(24, 24, 51, 0, 6, 16, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        q90 q90Var = new q90(context, null);
        this.f48043b = q90Var;
        q90Var.setTypeface(AndroidUtilities.bold());
        q90Var.setTextSize(1, 14.0f);
        q90Var.setTextColor(org.telegram.ui.ActionBar.h6.v0(i11, d6Var));
        int i12 = org.telegram.ui.ActionBar.h6.gc;
        q90Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.v0(i12, d6Var));
        linearLayout.addView(q90Var, w7.y5.t(-1, -2, 7, 0, 0, 0, 3));
        q90 q90Var2 = new q90(context, null);
        this.f48044c = q90Var2;
        q90Var2.setTextSize(1, 14.0f);
        q90Var2.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19478z6, d6Var));
        q90Var2.setLinkTextColor(org.telegram.ui.ActionBar.h6.v0(i12, d6Var));
        linearLayout.addView(q90Var2, w7.y5.q(-1, -2, 7));
        addView(linearLayout, w7.y5.p(-1, -2, 1.0f, 55, 0, 0, 0, 0));
    }

    public final void a(CharSequence charSequence, CharSequence charSequence2, int i10) {
        this.f48042a.setImageResource(i10);
        this.f48043b.setText(charSequence);
        this.f48044c.setText(charSequence2);
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f48044c.setText(charSequence);
    }

    public void setTitle(CharSequence charSequence) {
        this.f48043b.setText(charSequence);
    }
}
