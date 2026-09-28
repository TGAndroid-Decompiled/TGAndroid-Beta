package yh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.p90;
public final class r extends LinearLayout {
    public final ImageView f47935a;
    public final p90 f47936b;
    public final p90 f47937c;

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
        this.f47935a = imageView;
        int i11 = org.telegram.ui.ActionBar.h6.G6;
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(null, i11, false), PorterDuff.Mode.SRC_IN));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, w7.y5.t(24, 24, 51, 0, 6, 16, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        p90 p90Var = new p90(context, null);
        this.f47936b = p90Var;
        p90Var.setTypeface(AndroidUtilities.bold());
        p90Var.setTextSize(1, 14.0f);
        p90Var.setTextColor(org.telegram.ui.ActionBar.h6.v0(i11, d6Var));
        int i12 = org.telegram.ui.ActionBar.h6.gc;
        p90Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.v0(i12, d6Var));
        linearLayout.addView(p90Var, w7.y5.t(-1, -2, 7, 0, 0, 0, 3));
        p90 p90Var2 = new p90(context, null);
        this.f47937c = p90Var2;
        p90Var2.setTextSize(1, 14.0f);
        p90Var2.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19462z6, d6Var));
        p90Var2.setLinkTextColor(org.telegram.ui.ActionBar.h6.v0(i12, d6Var));
        linearLayout.addView(p90Var2, w7.y5.q(-1, -2, 7));
        addView(linearLayout, w7.y5.p(-1, -2, 1.0f, 55, 0, 0, 0, 0));
    }

    public final void a(CharSequence charSequence, CharSequence charSequence2, int i10) {
        this.f47935a.setImageResource(i10);
        this.f47936b.setText(charSequence);
        this.f47937c.setText(charSequence2);
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f47937c.setText(charSequence);
    }

    public void setTitle(CharSequence charSequence) {
        this.f47936b.setText(charSequence);
    }
}
