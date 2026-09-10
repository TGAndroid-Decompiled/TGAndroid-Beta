package xh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.m90;
public final class s extends LinearLayout {
    public final ImageView f45997a;
    public final m90 f45998b;
    public final m90 f45999c;

    public s(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
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
        this.f45997a = imageView;
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i11, false), PorterDuff.Mode.SRC_IN));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, w7.a6.t(24, 24, 51, 0, 6, 16, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        m90 m90Var = new m90(context, null);
        this.f45998b = m90Var;
        m90Var.setTypeface(AndroidUtilities.bold());
        m90Var.setTextSize(1, 14.0f);
        m90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        int i12 = org.telegram.ui.ActionBar.j6.gc;
        m90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i12, f6Var));
        linearLayout.addView(m90Var, w7.a6.t(-1, -2, 7, 0, 0, 0, 3));
        m90 m90Var2 = new m90(context, null);
        this.f45999c = m90Var2;
        m90Var2.setTextSize(1, 14.0f);
        m90Var2.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18325z6, f6Var));
        m90Var2.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i12, f6Var));
        linearLayout.addView(m90Var2, w7.a6.q(-1, -2, 7));
        addView(linearLayout, w7.a6.p(-1, -2, 1.0f, 55, 0, 0, 0, 0));
    }

    public final void a(CharSequence charSequence, CharSequence charSequence2, int i10) {
        this.f45997a.setImageResource(i10);
        this.f45998b.setText(charSequence);
        this.f45999c.setText(charSequence2);
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f45999c.setText(charSequence);
    }

    public void setTitle(CharSequence charSequence) {
        this.f45998b.setText(charSequence);
    }
}
