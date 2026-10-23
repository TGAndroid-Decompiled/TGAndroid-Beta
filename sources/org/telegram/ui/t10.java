package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_fragment;
public abstract class t10 {
    public static void a(Activity activity, int i10, String str, TLObject tLObject, TL_fragment.TL_collectibleInfo tL_collectibleInfo, org.telegram.ui.ActionBar.g6 g6Var) {
        int i11;
        int i12;
        String str2;
        String formatString;
        String p5;
        String formatString2;
        String b10;
        org.telegram.ui.Components.fz0 fz0Var;
        int i13;
        org.telegram.ui.ActionBar.h3 h3Var = new org.telegram.ui.ActionBar.h3(1, (Context) activity, g6Var, false);
        h3Var.fixNavigationBarKey(org.telegram.ui.ActionBar.k6.f21254h5);
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        FrameLayout frameLayout = new FrameLayout(activity);
        int dp = AndroidUtilities.dp(80.0f);
        int i14 = org.telegram.ui.ActionBar.k6.Oh;
        ShapeDrawable K = org.telegram.ui.ActionBar.k6.K(dp, org.telegram.ui.ActionBar.k6.w0(i14, g6Var));
        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i14);
        frameLayout.setBackground(K);
        org.telegram.ui.ActionBar.r6.k(frameLayout, K, O, null, g6Var);
        linearLayout.addView(frameLayout, w7.z5.t(80, 80, 1, 0, 16, 0, 16));
        ?? imageView = new ImageView(activity);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        if (i10 == 0) {
            i11 = 70;
        } else {
            i11 = 78;
        }
        if (i10 == 0) {
            i12 = R.raw.fragment_username;
        } else {
            i12 = R.raw.fragment;
        }
        imageView.f(i12, i11, i11, null);
        imageView.d();
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        if (i10 == 0) {
            imageView.setScaleX(0.86f);
            imageView.setScaleY(0.86f);
        } else {
            imageView.setTranslationY(AndroidUtilities.dp(2.0f));
        }
        frameLayout.addView((View) imageView, w7.z5.q(-1, -1, 17));
        String str3 = "";
        if (tLObject instanceof TLRPC.User) {
            str2 = UserObject.getUserName((TLRPC.User) tLObject);
        } else if (!(tLObject instanceof TLRPC.Chat)) {
            str2 = "";
        } else {
            str2 = ((TLRPC.Chat) tLObject).title;
        }
        String formatCurrency = BillingController.getInstance().formatCurrency(tL_collectibleInfo.amount, tL_collectibleInfo.currency);
        String formatCurrency2 = BillingController.getInstance().formatCurrency(tL_collectibleInfo.crypto_amount, tL_collectibleInfo.crypto_currency);
        if (i10 == 0) {
            String formatString3 = LocaleController.formatString(R.string.FragmentUsernameTitle, si.o0.h("@", str));
            int i15 = R.string.FragmentUsernameMessage;
            String formatShortDateTime = LocaleController.formatShortDateTime(tL_collectibleInfo.purchase_date);
            if (!TextUtils.isEmpty(formatCurrency)) {
                str3 = a1.g.p("(", formatCurrency, ")");
            }
            formatString2 = LocaleController.formatString(i15, formatShortDateTime, formatCurrency2, str3);
            b10 = a1.g.q(MessagesController.getInstance(UserConfig.selectedAccount).linkPrefix, "/", str, new StringBuilder());
            formatString = formatString3;
        } else if (i10 == 1) {
            int i16 = R.string.FragmentPhoneTitle;
            jf.b c10 = jf.b.c();
            formatString = LocaleController.formatString(i16, c10.b("+" + str));
            int i17 = R.string.FragmentPhoneMessage;
            String formatShortDateTime2 = LocaleController.formatShortDateTime((long) tL_collectibleInfo.purchase_date);
            if (TextUtils.isEmpty(formatCurrency)) {
                p5 = "";
            } else {
                p5 = a1.g.p("(", formatCurrency, ")");
            }
            formatString2 = LocaleController.formatString(i17, formatShortDateTime2, formatCurrency2, p5);
            jf.b c11 = jf.b.c();
            b10 = c11.b("+" + str);
        } else {
            return;
        }
        if (b10 != null) {
            fz0Var = new org.telegram.ui.Components.fz0(b10, i10, h3Var, g6Var);
        } else {
            fz0Var = null;
        }
        SpannableStringBuilder replaceSingleTag = AndroidUtilities.replaceSingleTag(formatString, fz0Var);
        SpannableString spannableString = new SpannableString("TON");
        org.telegram.ui.Components.xq xqVar = new org.telegram.ui.Components.xq(R.drawable.mini_gram_16, 0);
        xqVar.recolorDrawable = false;
        xqVar.setWidth(AndroidUtilities.dp(13.0f));
        spannableString.setSpan(xqVar, 0, spannableString.length(), 33);
        SpannableStringBuilder replaceCharSequence = AndroidUtilities.replaceCharSequence("TON", AndroidUtilities.replaceTags(formatString2), spannableString);
        org.telegram.ui.Components.y90 y90Var = new org.telegram.ui.Components.y90(activity, null);
        y90Var.setTypeface(AndroidUtilities.bold());
        y90Var.setGravity(17);
        int i18 = org.telegram.ui.ActionBar.k6.f21289j5;
        org.telegram.ui.ActionBar.r6.W(y90Var, i18, g6Var);
        org.telegram.ui.ActionBar.r6.I(y90Var, org.telegram.ui.ActionBar.k6.f21386o6, g6Var);
        y90Var.setTextSize(1, 16.0f);
        y90Var.setText(replaceSingleTag);
        linearLayout.addView(y90Var, w7.z5.t(-1, -2, 1, 42, 0, 42, 0));
        FrameLayout frameLayout2 = new FrameLayout(activity);
        int dp2 = AndroidUtilities.dp(28.0f);
        int dp3 = AndroidUtilities.dp(28.0f);
        int i19 = org.telegram.ui.ActionBar.k6.f21176ci;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(dp2, dp3, org.telegram.ui.ActionBar.k6.w0(i19, g6Var));
        org.telegram.ui.ActionBar.n6 O2 = org.telegram.ui.ActionBar.r6.O(i19);
        frameLayout2.setBackground(d02);
        org.telegram.ui.ActionBar.r6.k(frameLayout2, d02, O2, null, g6Var);
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(activity);
        w9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
        org.telegram.ui.Components.h9 h9Var = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.g6) null);
        h9Var.p(tLObject);
        w9Var.e(tLObject, h9Var);
        frameLayout2.addView(w9Var, w7.z5.e(28, 28, 51));
        TextView textView = new TextView(activity);
        org.telegram.ui.ActionBar.r6.W(textView, i18, g6Var);
        textView.setTextSize(1, 13.0f);
        textView.setSingleLine();
        textView.setText(Emoji.replaceEmoji(str2, textView.getPaint().getFontMetricsInt(), false));
        frameLayout2.addView(textView, w7.z5.d(-2, -2.0f, 19, 37.0f, 0.0f, 10.0f, 0.0f));
        linearLayout.addView(frameLayout2, w7.z5.t(-2, 28, 1, 42, 10, 42, 18));
        TextView textView2 = new TextView(activity);
        textView2.setGravity(17);
        org.telegram.ui.ActionBar.r6.W(textView2, i18, g6Var);
        textView2.setTextSize(1, 14.0f);
        textView2.setText(replaceCharSequence);
        linearLayout.addView(textView2, w7.z5.t(-1, -2, 1, 32, 0, 32, 19));
        ei.d dVar = new ei.d(activity, g6Var, true);
        dVar.setRoundRadius(24);
        dVar.i(LocaleController.getString(R.string.FragmentUsernameOpen), false, true);
        dVar.setOnClickListener(new org.telegram.ui.Components.d51(18, activity, tL_collectibleInfo));
        linearLayout.addView(dVar, w7.z5.k(6.0f, 0.0f, 6.0f, 0.0f, -1, 48));
        if (fz0Var != null) {
            ei.d dVar2 = new ei.d(activity, g6Var, true);
            dVar2.setRoundRadius(24);
            dVar2.e();
            if (i10 == 0) {
                i13 = R.string.FragmentUsernameCopy;
            } else {
                i13 = R.string.FragmentPhoneCopy;
            }
            dVar2.i(LocaleController.getString(i13), false, true);
            dVar2.setOnClickListener(new org.telegram.ui.Components.d51(19, fz0Var, h3Var));
            linearLayout.addView(dVar2, w7.z5.k(6.0f, 6.0f, 6.0f, 0.0f, -1, 48));
        }
        h3Var.setCustomView(linearLayout);
        h3Var.show();
    }
}
