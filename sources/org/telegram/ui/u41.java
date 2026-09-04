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
public final class u41 extends org.telegram.ui.Components.bb {
    public final LinearLayout X;
    public org.telegram.ui.Components.v51 Y;

    public u41(Context context, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.Components.jn0 jn0Var) {
        super(context, null, false, false, f6Var);
        int i10;
        fixNavigationBar();
        this.v = 0.2f;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        int i11 = org.telegram.ui.ActionBar.j6.Oh;
        paint.setColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        this.X = linearLayout;
        linearLayout.setPadding(AndroidUtilities.dp(6.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(6.0f) + this.backgroundPaddingLeft, 0);
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.large_ads_info);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setBackground(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.j6.v0(i11, f6Var)));
        frameLayout.addView(imageView, w7.x5.d(80, 80.0f, 1, 0.0f, 20.0f, 0.0f, 0.0f));
        linearLayout.addView(frameLayout, w7.x5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, 100));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.SearchAdsAboutTitle));
        textView.setTypeface(AndroidUtilities.bold());
        int i12 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.messenger.wl.n(i12, f6Var, textView, 1, 20.0f);
        textView.setGravity(1);
        TextView h = com.google.android.gms.internal.vision.e2.h(linearLayout, textView, w7.x5.t(-2, -2, 1, 22, 14, 22, 0), context);
        h.setText(LocaleController.getString(R.string.SearchAdsAboutSubtitle));
        h.setTextColor(org.telegram.ui.ActionBar.j6.v0(i12, f6Var));
        h.setTextSize(1, 14.0f);
        h.setGravity(1);
        linearLayout.addView(h, w7.x5.t(-2, -2, 1, 22, 8, 22, 0));
        linearLayout.addView(new bi.g5(this, context, R.drawable.menu_privacy, LocaleController.getString(R.string.SearchAdsAbout1Title), LocaleController.getString(R.string.SearchAdsAbout1Subtitle)), w7.x5.p(-1, -2, 0.0f, 0, 0, 20, 0, 0));
        boolean isPremium = UserConfig.getInstance(this.currentAccount).isPremium();
        int i13 = R.drawable.menu_feature_noads;
        String string = LocaleController.getString(R.string.SearchAdsAbout2Title);
        if (isPremium) {
            i10 = R.string.SearchAdsAbout2SubtitlePremium;
        } else {
            i10 = R.string.SearchAdsAbout2Subtitle;
        }
        linearLayout.addView(new bi.g5(this, context, i13, string, AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(i10), new dm0(this, isPremium, jn0Var, 7)), true)), w7.x5.p(-1, -2, 0.0f, 0, 0, 16, 0, 0));
        View view = new View(getContext());
        view.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20664d7, f6Var));
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
        linearLayout.addView(textView2, w7.x5.t(-2, -2, 1, 22, 0, 22, 0));
        SpannableStringBuilder replaceCharSequence = AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceTags(LocaleController.getString(R.string.SearchAdsAboutLaunchSubtitle)), AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.SearchAdsAboutLaunchLearnMore), new f01(this, 10)), true));
        org.telegram.ui.Components.d90 d90Var = new org.telegram.ui.Components.d90(context, null);
        d90Var.setText(replaceCharSequence);
        d90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i12, f6Var));
        d90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.gc, f6Var));
        d90Var.setTextSize(1, 14.0f);
        d90Var.setGravity(1);
        d90Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        linearLayout.addView(d90Var, w7.x5.t(-2, -2, 1, 26, 8, 26, 0));
        TextView textView3 = new TextView(context);
        textView3.setLines(1);
        textView3.setSingleLine(true);
        textView3.setGravity(17);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        textView3.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Sh, f6Var));
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setTextSize(1, 14.0f);
        textView3.setText(LocaleController.getString(R.string.SearchAdsAboutUnderstood));
        textView3.setBackground(org.telegram.ui.ActionBar.y5.e(new float[]{24.0f}, org.telegram.ui.ActionBar.j6.v0(i11, f6Var)));
        textView3.setOnClickListener(new j41(this, 2));
        linearLayout.addView(textView3, w7.x5.t(-1, 48, 0, 14, 22, 14, 14));
        this.Y.N(false);
    }

    public static void P(u41 u41Var, boolean z10, org.telegram.ui.Components.jn0 jn0Var) {
        if (z10) {
            MessagesController.getInstance(u41Var.currentAccount).disableAds(true);
            jn0Var.run();
        } else {
            org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
            if (U == null) {
                return;
            }
            U.presentFragment(new PremiumPreviewFragment(0, PremiumPreviewFragment.l0(3)));
        }
        u41Var.dismiss();
    }

    @Override
    public final org.telegram.ui.Components.kl0 v(org.telegram.ui.Components.ll0 ll0Var) {
        org.telegram.ui.Components.v51 v51Var = new org.telegram.ui.Components.v51(ll0Var, getContext(), this.currentAccount, 0, true, new b5(this, 21), this.resourcesProvider);
        this.Y = v51Var;
        return v51Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.AboutRevenueSharingAds);
    }
}
