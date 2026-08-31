package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.SpannableString;
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
import org.telegram.messenger.Utilities;
public final class r31 extends org.telegram.ui.Components.sa {
    public final LinearLayout U;
    public org.telegram.ui.Components.x51 V;

    public r31(Context context, boolean z4, org.telegram.ui.ActionBar.g6 g6Var, Utilities.Callback callback) {
        super(context, null, false, false, false, 1, g6Var);
        org.telegram.ui.ActionBar.g6 g6Var2;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        fixNavigationBar();
        this.v = 0.2f;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        int i17 = org.telegram.ui.ActionBar.k6.Oh;
        paint.setColor(org.telegram.ui.ActionBar.k6.v0(i17, g6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        this.U = linearLayout;
        linearLayout.setPadding(AndroidUtilities.dp(6.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(6.0f) + this.backgroundPaddingLeft, 0);
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(getContext());
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.large_ads_info);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setBackground(org.telegram.ui.ActionBar.k6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.k6.v0(i17, g6Var)));
        frameLayout.addView(imageView, k7.c6.d(80, 80.0f, 1, 0.0f, 20.0f, 0.0f, 0.0f));
        if (callback != null) {
            ImageView imageView2 = new ImageView(context);
            imageView2.setImageDrawable(context.getDrawable(R.drawable.ic_ab_other));
            imageView2.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
            imageView2.setScaleType(scaleType);
            imageView2.setColorFilter(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21911r5, false));
            imageView2.setBackground(org.telegram.ui.ActionBar.k6.f0(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21750i6, false), 1, -1));
            g6Var2 = g6Var;
            imageView2.setOnClickListener(new lh.u3(this, callback, g6Var, imageView2, 13));
            frameLayout.addView(imageView2, k7.c6.d(24, 24.0f, 53, 12.0f, 14.0f, 14.0f, 12.0f));
        } else {
            g6Var2 = g6Var;
        }
        linearLayout.addView(frameLayout, k7.c6.k(0.0f, 0.0f, 0.0f, 0.0f, -1, 100));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.AboutRevenueSharingAds));
        textView.setTypeface(AndroidUtilities.bold());
        int i18 = org.telegram.ui.ActionBar.k6.G6;
        b.l(i18, g6Var2, textView, 1, 20.0f);
        textView.setGravity(1);
        TextView i19 = yh.i(linearLayout, textView, k7.c6.t(-2, -2, 1, 22, 14, 22, 0), context);
        i19.setText(LocaleController.getString(R.string.RevenueSharingAdsAlertSubtitle));
        i19.setTextColor(org.telegram.ui.ActionBar.k6.v0(i18, g6Var2));
        i19.setTextSize(1, 14.0f);
        i19.setGravity(1);
        linearLayout.addView(i19, k7.c6.t(-2, -2, 1, 22, 8, 22, 0));
        int i20 = R.drawable.menu_privacy;
        if (z4) {
            i10 = R.string.RevenueSharingAdsInfo1TitleBot;
        } else {
            i10 = R.string.RevenueSharingAdsInfo1Title;
        }
        String string = LocaleController.getString(i10);
        if (z4) {
            i11 = R.string.RevenueSharingAdsInfo1SubtitleBot;
        } else {
            i11 = R.string.RevenueSharingAdsInfo1Subtitle;
        }
        linearLayout.addView(new eh.d(this, context, i20, string, LocaleController.getString(i11)), k7.c6.p(-1, -2, 0.0f, 0, 0, 20, 0, 0));
        int i21 = R.drawable.menu_feature_split;
        if (z4) {
            i12 = R.string.RevenueSharingAdsInfo2TitleBot;
        } else {
            i12 = R.string.RevenueSharingAdsInfo2Title;
        }
        String string2 = LocaleController.getString(i12);
        if (z4) {
            i13 = R.string.RevenueSharingAdsInfo2SubtitleBot;
        } else {
            i13 = R.string.RevenueSharingAdsInfo2Subtitle;
        }
        linearLayout.addView(new eh.d(this, context, i21, string2, LocaleController.getString(i13)), k7.c6.p(-1, -2, 0.0f, 0, 0, 16, 0, 0));
        if (z4) {
            i14 = R.string.RevenueSharingAdsInfo3SubtitleBot;
        } else {
            i14 = R.string.RevenueSharingAdsInfo3Subtitle;
        }
        String formatString = LocaleController.formatString(i14, Integer.valueOf(MessagesController.getInstance(UserConfig.selectedAccount).channelRestrictSponsoredLevelMin));
        int i22 = org.telegram.ui.ActionBar.k6.f21720gc;
        linearLayout.addView(new eh.d(this, context, R.drawable.menu_feature_noads, LocaleController.getString(R.string.RevenueSharingAdsInfo3Title), AndroidUtilities.replaceSingleTag(formatString, i22, 0, new Runnable(this) {
            public final r31 f40337b;

            {
                this.f40337b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        r31 r31Var = this.f40337b;
                        r31Var.getClass();
                        org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                        if (U != null) {
                            U.presentFragment(new PremiumPreviewFragment(0, PremiumPreviewFragment.l0(3)));
                            r31Var.dismiss();
                            return;
                        }
                        return;
                    default:
                        r31 r31Var2 = this.f40337b;
                        r31Var2.dismiss();
                        af.g.s(r31Var2.getContext(), LocaleController.getString(R.string.PromoteUrl));
                        return;
                }
            }
        })), k7.c6.p(-1, -2, 0.0f, 0, 0, 16, 0, 0));
        View view = new View(getContext());
        view.setBackgroundColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21660d7, g6Var2));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 1);
        layoutParams.setMargins(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(20.0f));
        linearLayout.addView(view, layoutParams);
        TextView textView2 = new TextView(context);
        if (z4) {
            i15 = R.string.RevenueSharingAdsInfo4TitleBot;
        } else {
            i15 = R.string.RevenueSharingAdsInfo4Title;
        }
        textView2.setText(LocaleController.getString(i15));
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextColor(org.telegram.ui.ActionBar.k6.v0(i18, g6Var2));
        textView2.setTextSize(1, 20.0f);
        textView2.setTextAlignment(4);
        textView2.setGravity(17);
        linearLayout.addView(textView2, k7.c6.t(-2, -2, 1, 22, 0, 22, 0));
        if (z4) {
            i16 = R.string.RevenueSharingAdsInfo4Subtitle2Bot;
        } else {
            i16 = R.string.RevenueSharingAdsInfo4Subtitle2;
        }
        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(i16));
        SpannableStringBuilder replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.RevenueSharingAdsInfo4SubtitleLearnMore), i22, 0, new Runnable(this) {
            public final r31 f40337b;

            {
                this.f40337b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        r31 r31Var = this.f40337b;
                        r31Var.getClass();
                        org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                        if (U != null) {
                            U.presentFragment(new PremiumPreviewFragment(0, PremiumPreviewFragment.l0(3)));
                            r31Var.dismiss();
                            return;
                        }
                        return;
                    default:
                        r31 r31Var2 = this.f40337b;
                        r31Var2.dismiss();
                        af.g.s(r31Var2.getContext(), LocaleController.getString(R.string.PromoteUrl));
                        return;
                }
            }
        });
        SpannableString spannableString = new SpannableString(">");
        org.telegram.ui.Components.oq oqVar = new org.telegram.ui.Components.oq(R.drawable.attach_arrow_right, 0);
        oqVar.setOverrideColor(org.telegram.ui.ActionBar.k6.w0(null, i22, false));
        oqVar.setScale(0.7f, 0.7f);
        oqVar.setWidth(AndroidUtilities.dp(12.0f));
        oqVar.setTranslateY(1.0f);
        spannableString.setSpan(oqVar, 0, spannableString.length(), 33);
        SpannableStringBuilder replaceCharSequence = AndroidUtilities.replaceCharSequence(">", AndroidUtilities.replaceCharSequence("%1$s", replaceTags, replaceSingleTag), spannableString);
        org.telegram.ui.Components.g90 g90Var = new org.telegram.ui.Components.g90(context, null);
        g90Var.setText(replaceCharSequence);
        g90Var.setTextColor(org.telegram.ui.ActionBar.k6.v0(i18, g6Var2));
        g90Var.setTextSize(1, 14.0f);
        g90Var.setGravity(1);
        g90Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        linearLayout.addView(g90Var, k7.c6.t(-2, -2, 1, 26, 8, 26, 0));
        TextView textView3 = new TextView(context);
        textView3.setLines(1);
        textView3.setSingleLine(true);
        textView3.setGravity(17);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        textView3.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Sh, g6Var2));
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setTextSize(1, 14.0f);
        textView3.setText(LocaleController.getString(R.string.RevenueSharingAdsAlertButton));
        textView3.setBackground(org.telegram.ui.ActionBar.a6.e(new float[]{6.0f}, org.telegram.ui.ActionBar.k6.v0(i17, g6Var2)));
        textView3.setOnClickListener(new k31(this, 1));
        linearLayout.addView(textView3, k7.c6.t(-1, 48, 0, 14, 22, 14, 14));
        this.V.N(false);
    }

    public static r31 T(Context context, org.telegram.ui.ActionBar.p2 p2Var, boolean z4, org.telegram.ui.ActionBar.g6 g6Var, lh.a1 a1Var) {
        r31 r31Var = new r31(context, z4, g6Var, a1Var);
        if (p2Var != null) {
            if (p2Var.getParentActivity() != null) {
                p2Var.showDialog(r31Var);
            }
            return r31Var;
        }
        r31Var.show();
        return r31Var;
    }

    public static void U(Context context, org.telegram.ui.ActionBar.g6 g6Var, xn xnVar) {
        T(context, xnVar, false, g6Var, null);
    }

    @Override
    public final org.telegram.ui.Components.sl0 v(org.telegram.ui.Components.tl0 tl0Var) {
        org.telegram.ui.Components.x51 x51Var = new org.telegram.ui.Components.x51(tl0Var, getContext(), this.currentAccount, 0, true, new d5(this, 20), this.resourcesProvider);
        this.V = x51Var;
        return x51Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.AboutRevenueSharingAds);
    }
}
