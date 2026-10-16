package zh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.da0;
public final class s extends LinearLayout {
    public final ImageView f51125a;
    public final da0 f51126b;
    public final da0 f51127c;

    public s(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
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
        this.f51125a = imageView;
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.x0(null, i11, false), PorterDuff.Mode.SRC_IN));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, w7.z5.t(24, 24, 51, 0, 6, 16, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        da0 da0Var = new da0(context, null);
        this.f51126b = da0Var;
        da0Var.setTypeface(AndroidUtilities.bold());
        da0Var.setTextSize(1, 14.0f);
        da0Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(i11, c6Var));
        int i12 = org.telegram.ui.ActionBar.g6.f19660gc;
        da0Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(i12, c6Var));
        linearLayout.addView(da0Var, w7.z5.t(-1, -2, 7, 0, 0, 0, 3));
        da0 da0Var2 = new da0(context, null);
        this.f51127c = da0Var2;
        da0Var2.setTextSize(1, 14.0f);
        da0Var2.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20005z6, c6Var));
        da0Var2.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(i12, c6Var));
        linearLayout.addView(da0Var2, w7.z5.q(-1, -2, 7));
        addView(linearLayout, w7.z5.p(-1, -2, 1.0f, 55, 0, 0, 0, 0));
    }

    public final void a(CharSequence charSequence, CharSequence charSequence2, int i10) {
        this.f51125a.setImageResource(i10);
        this.f51126b.setText(charSequence);
        this.f51127c.setText(charSequence2);
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f51127c.setText(charSequence);
    }

    public void setTitle(CharSequence charSequence) {
        this.f51126b.setText(charSequence);
    }
}
