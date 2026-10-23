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
public final class t21 extends org.telegram.ui.Components.bb {
    public final LinearLayout X;
    public org.telegram.ui.Components.u61 Y;

    public t21(Context context, boolean z10, org.telegram.ui.ActionBar.d6 d6Var, Utilities.Callback callback) {
        super(context, null, false, false, d6Var);
        org.telegram.ui.ActionBar.d6 d6Var2;
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
        int i17 = org.telegram.ui.ActionBar.h6.Oh;
        paint.setColor(org.telegram.ui.ActionBar.h6.w0(i17, d6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        this.X = linearLayout;
        linearLayout.setPadding(AndroidUtilities.dp(6.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(6.0f) + this.backgroundPaddingLeft, 0);
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(getContext());
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.large_ads_info);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setBackground(org.telegram.ui.ActionBar.h6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.h6.w0(i17, d6Var)));
        frameLayout.addView(imageView, w7.z5.d(80, 80.0f, 1, 0.0f, 20.0f, 0.0f, 0.0f));
        if (callback != null) {
            ImageView imageView2 = new ImageView(context);
            imageView2.setImageDrawable(context.getDrawable(R.drawable.ic_ab_other));
            imageView2.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
            imageView2.setScaleType(scaleType);
            imageView2.setColorFilter(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21250r5, false));
            imageView2.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21083i6, false), 1, -1));
            d6Var2 = d6Var;
            imageView2.setOnClickListener(new ci.c4(this, callback, d6Var, imageView2, 15));
            frameLayout.addView(imageView2, w7.z5.d(24, 24.0f, 53, 12.0f, 14.0f, 14.0f, 12.0f));
        } else {
            d6Var2 = d6Var;
        }
        linearLayout.addView(frameLayout, w7.z5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, 100));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.AboutRevenueSharingAds));
        textView.setTypeface(AndroidUtilities.bold());
        int i18 = org.telegram.ui.ActionBar.h6.G6;
        org.telegram.messenger.nk.o(i18, d6Var2, textView, 1, 20.0f);
        textView.setGravity(1);
        TextView i19 = com.google.android.gms.internal.play_billing.k3.i(linearLayout, textView, w7.z5.t(-2, -2, 1, 22, 14, 22, 0), context);
        i19.setText(LocaleController.getString(R.string.RevenueSharingAdsAlertSubtitle));
        i19.setTextColor(org.telegram.ui.ActionBar.h6.w0(i18, d6Var2));
        i19.setTextSize(1, 14.0f);
        i19.setGravity(1);
        linearLayout.addView(i19, w7.z5.t(-2, -2, 1, 22, 8, 22, 0));
        int i20 = R.drawable.menu_privacy;
        if (z10) {
            i10 = R.string.RevenueSharingAdsInfo1TitleBot;
        } else {
            i10 = R.string.RevenueSharingAdsInfo1Title;
        }
        String string = LocaleController.getString(i10);
        if (z10) {
            i11 = R.string.RevenueSharingAdsInfo1SubtitleBot;
        } else {
            i11 = R.string.RevenueSharingAdsInfo1Subtitle;
        }
        linearLayout.addView(new ci.i4(this, context, i20, string, LocaleController.getString(i11)), w7.z5.p(-1, -2, 0.0f, 0, 0, 20, 0, 0));
        int i21 = R.drawable.menu_feature_split;
        if (z10) {
            i12 = R.string.RevenueSharingAdsInfo2TitleBot;
        } else {
            i12 = R.string.RevenueSharingAdsInfo2Title;
        }
        String string2 = LocaleController.getString(i12);
        if (z10) {
            i13 = R.string.RevenueSharingAdsInfo2SubtitleBot;
        } else {
            i13 = R.string.RevenueSharingAdsInfo2Subtitle;
        }
        linearLayout.addView(new ci.i4(this, context, i21, string2, LocaleController.getString(i13)), w7.z5.p(-1, -2, 0.0f, 0, 0, 16, 0, 0));
        if (z10) {
            i14 = R.string.RevenueSharingAdsInfo3SubtitleBot;
        } else {
            i14 = R.string.RevenueSharingAdsInfo3Subtitle;
        }
        String formatString = LocaleController.formatString(i14, Integer.valueOf(MessagesController.getInstance(UserConfig.selectedAccount).channelRestrictSponsoredLevelMin));
        int i22 = org.telegram.ui.ActionBar.h6.f21053gc;
        linearLayout.addView(new ci.i4(this, context, R.drawable.menu_feature_noads, LocaleController.getString(R.string.RevenueSharingAdsInfo3Title), AndroidUtilities.replaceSingleTag(formatString, i22, 0, new Runnable(this) {
            public final t21 f41339b;

            {
                this.f41339b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        t21 t21Var = this.f41339b;
                        t21Var.getClass();
                        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                        if (U != null) {
                            U.presentFragment(new PremiumPreviewFragment(0, PremiumPreviewFragment.l0(3)));
                            t21Var.dismiss();
                            return;
                        }
                        return;
                    default:
                        t21 t21Var2 = this.f41339b;
                        t21Var2.dismiss();
                        pf.d.r(t21Var2.getContext(), LocaleController.getString(R.string.PromoteUrl));
                        return;
                }
            }
        })), w7.z5.p(-1, -2, 0.0f, 0, 0, 16, 0, 0));
        View view = new View(getContext());
        view.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20995d7, d6Var2));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 1);
        layoutParams.setMargins(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(20.0f));
        linearLayout.addView(view, layoutParams);
        TextView textView2 = new TextView(context);
        if (z10) {
            i15 = R.string.RevenueSharingAdsInfo4TitleBot;
        } else {
            i15 = R.string.RevenueSharingAdsInfo4Title;
        }
        textView2.setText(LocaleController.getString(i15));
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextColor(org.telegram.ui.ActionBar.h6.w0(i18, d6Var2));
        textView2.setTextSize(1, 20.0f);
        textView2.setTextAlignment(4);
        textView2.setGravity(17);
        linearLayout.addView(textView2, w7.z5.t(-2, -2, 1, 22, 0, 22, 0));
        if (z10) {
            i16 = R.string.RevenueSharingAdsInfo4Subtitle2Bot;
        } else {
            i16 = R.string.RevenueSharingAdsInfo4Subtitle2;
        }
        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(i16));
        SpannableStringBuilder replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.RevenueSharingAdsInfo4SubtitleLearnMore), i22, 0, new Runnable(this) {
            public final t21 f41339b;

            {
                this.f41339b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        t21 t21Var = this.f41339b;
                        t21Var.getClass();
                        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                        if (U != null) {
                            U.presentFragment(new PremiumPreviewFragment(0, PremiumPreviewFragment.l0(3)));
                            t21Var.dismiss();
                            return;
                        }
                        return;
                    default:
                        t21 t21Var2 = this.f41339b;
                        t21Var2.dismiss();
                        pf.d.r(t21Var2.getContext(), LocaleController.getString(R.string.PromoteUrl));
                        return;
                }
            }
        });
        SpannableString spannableString = new SpannableString(">");
        org.telegram.ui.Components.yq yqVar = new org.telegram.ui.Components.yq(R.drawable.attach_arrow_right, 0);
        yqVar.setOverrideColor(org.telegram.ui.ActionBar.h6.x0(null, i22, false));
        yqVar.setScale(0.7f, 0.7f);
        yqVar.setWidth(AndroidUtilities.dp(12.0f));
        yqVar.setTranslateY(1.0f);
        spannableString.setSpan(yqVar, 0, spannableString.length(), 33);
        SpannableStringBuilder replaceCharSequence = AndroidUtilities.replaceCharSequence(">", AndroidUtilities.replaceCharSequence("%1$s", replaceTags, replaceSingleTag), spannableString);
        org.telegram.ui.Components.x90 x90Var = new org.telegram.ui.Components.x90(context, null);
        x90Var.setText(replaceCharSequence);
        x90Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(i18, d6Var2));
        x90Var.setTextSize(1, 14.0f);
        x90Var.setGravity(1);
        x90Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        linearLayout.addView(x90Var, w7.z5.t(-2, -2, 1, 26, 8, 26, 0));
        TextView textView3 = new TextView(context);
        textView3.setLines(1);
        textView3.setSingleLine(true);
        textView3.setGravity(17);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        textView3.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Sh, d6Var2));
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setTextSize(1, 14.0f);
        textView3.setText(LocaleController.getString(R.string.RevenueSharingAdsAlertButton));
        textView3.setBackground(org.telegram.ui.ActionBar.x5.e(new float[]{6.0f}, org.telegram.ui.ActionBar.h6.w0(i17, d6Var2)));
        textView3.setOnClickListener(new s50(this, 29));
        linearLayout.addView(textView3, w7.z5.t(-1, 48, 0, 14, 22, 14, 14));
        this.Y.N(false);
    }

    public static t21 U(Context context, org.telegram.ui.ActionBar.n2 n2Var, boolean z10, org.telegram.ui.ActionBar.d6 d6Var, org.telegram.ui.ActionBar.j3 j3Var) {
        t21 t21Var = new t21(context, z10, d6Var, j3Var);
        if (n2Var != null) {
            if (n2Var.getParentActivity() != null) {
                n2Var.showDialog(t21Var);
            }
            return t21Var;
        }
        t21Var.show();
        return t21Var;
    }

    public static void V(Context context, org.telegram.ui.ActionBar.d6 d6Var, qn qnVar) {
        U(context, qnVar, false, d6Var, null);
    }

    @Override
    public final CharSequence A() {
        return LocaleController.getString(R.string.AboutRevenueSharingAds);
    }

    @Override
    public final org.telegram.ui.Components.im0 x(org.telegram.ui.Components.jm0 jm0Var) {
        org.telegram.ui.Components.u61 u61Var = new org.telegram.ui.Components.u61(jm0Var, getContext(), this.currentAccount, 0, true, new g5(this, 20), this.resourcesProvider);
        this.Y = u61Var;
        return u61Var;
    }
}
