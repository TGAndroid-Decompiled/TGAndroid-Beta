package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
public final class z31 extends org.telegram.ui.Components.sa {
    public final LinearLayout U;
    public org.telegram.ui.Components.w51 V;

    public z31(Context context, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.Components.i80 i80Var) {
        super(context, null, false, false, false, 1, f6Var);
        int i10;
        fixNavigationBar();
        this.v = 0.2f;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        int i11 = org.telegram.ui.ActionBar.j6.Oh;
        paint.setColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        this.U = linearLayout;
        linearLayout.setPadding(AndroidUtilities.dp(6.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(6.0f) + this.backgroundPaddingLeft, 0);
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.large_ads_info);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setBackground(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.j6.v0(i11, f6Var)));
        frameLayout.addView(imageView, k7.b6.d(80, 80.0f, 1, 0.0f, 20.0f, 0.0f, 0.0f));
        linearLayout.addView(frameLayout, k7.b6.k(0.0f, 0.0f, 0.0f, 0.0f, -1, 100));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.SearchAdsAboutTitle));
        textView.setTypeface(AndroidUtilities.bold());
        int i12 = org.telegram.ui.ActionBar.j6.G6;
        b.l(i12, f6Var, textView, 1, 20.0f);
        textView.setGravity(1);
        TextView j10 = yh.j(linearLayout, textView, k7.b6.t(-2, -2, 1, 22, 14, 22, 0), context);
        j10.setText(LocaleController.getString(R.string.SearchAdsAboutSubtitle));
        j10.setTextColor(org.telegram.ui.ActionBar.j6.v0(i12, f6Var));
        j10.setTextSize(1, 14.0f);
        j10.setGravity(1);
        linearLayout.addView(j10, k7.b6.t(-2, -2, 1, 22, 8, 22, 0));
        linearLayout.addView(new dh.d(this, context, R.drawable.menu_privacy, LocaleController.getString(R.string.SearchAdsAbout1Title), LocaleController.getString(R.string.SearchAdsAbout1Subtitle)), k7.b6.p(-1, -2, 0.0f, 0, 0, 20, 0, 0));
        boolean isPremium = UserConfig.getInstance(this.currentAccount).isPremium();
        int i13 = R.drawable.menu_feature_noads;
        String string = LocaleController.getString(R.string.SearchAdsAbout2Title);
        if (isPremium) {
            i10 = R.string.SearchAdsAbout2SubtitlePremium;
        } else {
            i10 = R.string.SearchAdsAbout2Subtitle;
        }
        linearLayout.addView(new dh.d(this, context, i13, string, AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(i10), new vq0(this, isPremium, i80Var, 3)), true)), k7.b6.p(-1, -2, 0.0f, 0, 0, 16, 0, 0));
        View view = new View(getContext());
        view.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19907d7, f6Var));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 1);
        layoutParams.setMargins(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(20.0f));
        linearLayout.addView(view, layoutParams);
        TextView textView2 = new TextView(context);
        textView2.setText(LocaleController.getString(R.string.SearchAdsAboutLaunchTitle));
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.v0(i12, f6Var));
        textView2.setTextSize(1, 20.0f);
        textView2.setTextAlignment(4);
        textView2.setGravity(17);
        linearLayout.addView(textView2, k7.b6.t(-2, -2, 1, 22, 0, 22, 0));
        SpannableStringBuilder replaceCharSequence = AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceTags(LocaleController.getString(R.string.SearchAdsAboutLaunchSubtitle)), AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.SearchAdsAboutLaunchLearnMore), new vy0(this, 12)), true));
        org.telegram.ui.Components.e90 e90Var = new org.telegram.ui.Components.e90(context, null);
        e90Var.setText(replaceCharSequence);
        e90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i12, f6Var));
        e90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19966gc, f6Var));
        e90Var.setTextSize(1, 14.0f);
        e90Var.setGravity(1);
        e90Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        linearLayout.addView(e90Var, k7.b6.t(-2, -2, 1, 26, 8, 26, 0));
        TextView textView3 = new TextView(context);
        textView3.setLines(1);
        textView3.setSingleLine(true);
        textView3.setGravity(17);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        textView3.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Sh, f6Var));
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setTextSize(1, 14.0f);
        textView3.setText(LocaleController.getString(R.string.SearchAdsAboutUnderstood));
        textView3.setBackground(org.telegram.ui.ActionBar.z5.e(new float[]{24.0f}, org.telegram.ui.ActionBar.j6.v0(i11, f6Var)));
        textView3.setOnClickListener(new i31(this, 3));
        linearLayout.addView(textView3, k7.b6.t(-1, 48, 0, 14, 22, 14, 14));
        this.V.N(false);
    }

    public static void P(z31 z31Var, boolean z4, org.telegram.ui.Components.i80 i80Var) {
        if (z4) {
            MessagesController.getInstance(z31Var.currentAccount).disableAds(true);
            i80Var.run();
        } else {
            org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
            if (U == null) {
                return;
            }
            U.presentFragment(new PremiumPreviewFragment(0, PremiumPreviewFragment.l0(3)));
        }
        z31Var.dismiss();
    }

    @Override
    public final org.telegram.ui.Components.rl0 v(org.telegram.ui.Components.sl0 sl0Var) {
        org.telegram.ui.Components.w51 w51Var = new org.telegram.ui.Components.w51(sl0Var, getContext(), this.currentAccount, 0, true, new d5(this, 21), this.resourcesProvider);
        this.V = w51Var;
        return w51Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.AboutRevenueSharingAds);
    }
}
