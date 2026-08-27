package org.telegram.ui;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
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

public abstract class s10 {
    public static void a(Activity activity, int i10, String str, TLObject tLObject, TL_fragment.TL_collectibleInfo tL_collectibleInfo, org.telegram.ui.ActionBar.c6 c6Var) {
        String str2;
        String userName;
        String currency;
        String currency2;
        String string;
        String strB;
        String str3;
        String str4;
        org.telegram.ui.ActionBar.c6 c6Var2;
        org.telegram.ui.ActionBar.e3 e3Var;
        xs xsVar;
        int i11;
        org.telegram.ui.ActionBar.e3 e3Var2 = new org.telegram.ui.ActionBar.e3(activity, c6Var, false, false);
        e3Var2.fixNavigationBar(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23124h5, c6Var));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        FrameLayout frameLayout = new FrameLayout(activity);
        frameLayout.setBackground(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, c6Var)));
        linearLayout.addView(frameLayout, h7.z5.t(80, 80, 1, 0, 16, 0, 16));
        org.telegram.ui.Components.ri0 ri0Var = new org.telegram.ui.Components.ri0(activity);
        ri0Var.setScaleType(ImageView.ScaleType.CENTER);
        int i12 = i10 == 0 ? 70 : 78;
        ri0Var.f(i10 == 0 ? R.raw.fragment_username : R.raw.fragment, i12, i12, null);
        ri0Var.d();
        ri0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        if (i10 == 0) {
            ri0Var.setScaleX(0.86f);
            ri0Var.setScaleY(0.86f);
        } else {
            ri0Var.setTranslationY(AndroidUtilities.dp(2.0f));
        }
        frameLayout.addView(ri0Var, h7.z5.q(-1, -1, 17));
        if (!(tLObject instanceof TLRPC.User)) {
            if (tLObject instanceof TLRPC.Chat) {
                userName = ((TLRPC.Chat) tLObject).title;
            } else {
                str2 = "";
            }
            currency = BillingController.getInstance().formatCurrency(tL_collectibleInfo.amount, tL_collectibleInfo.currency);
            currency2 = BillingController.getInstance().formatCurrency(tL_collectibleInfo.crypto_amount, tL_collectibleInfo.crypto_currency);
            if (i10 == 0) {
                String string2 = LocaleController.formatString(R.string.FragmentUsernameTitle, s3.c.e("@", str));
                string = LocaleController.formatString(R.string.FragmentUsernameMessage, LocaleController.formatShortDateTime(tL_collectibleInfo.purchase_date), currency2, TextUtils.isEmpty(currency) ? "" : a9.p.m("(", currency, ")"));
                strB = a9.p.n(MessagesController.getInstance(UserConfig.selectedAccount).linkPrefix, "/", str, new StringBuilder());
                str3 = string2;
            } else {
                if (i10 == 1) {
                    return;
                }
                String string3 = LocaleController.formatString(R.string.FragmentPhoneTitle, oe.b.c().b("+" + str));
                string = LocaleController.formatString(R.string.FragmentPhoneMessage, LocaleController.formatShortDateTime(tL_collectibleInfo.purchase_date), currency2, TextUtils.isEmpty(currency) ? "" : a9.p.m("(", currency, ")"));
                strB = oe.b.c().b("+" + str);
                str3 = string3;
            }
            String str5 = string;
            str4 = strB;
            if (str4 != null) {
                c6Var2 = c6Var;
                org.telegram.ui.ActionBar.e3 e3Var3 = e3Var2;
                xsVar = new xs(str4, i10, e3Var3, c6Var2, 1);
                e3Var = e3Var3;
            } else {
                c6Var2 = c6Var;
                e3Var = e3Var2;
                xsVar = null;
            }
            SpannableStringBuilder spannableStringBuilderReplaceSingleTag = AndroidUtilities.replaceSingleTag(str3, xsVar);
            SpannableString spannableString = new SpannableString("TON");
            org.telegram.ui.Components.cq cqVar = new org.telegram.ui.Components.cq(R.drawable.mini_gram_16, 0);
            cqVar.setWidth(AndroidUtilities.dp(13.0f));
            spannableString.setSpan(cqVar, 0, spannableString.length(), 33);
            SpannableStringBuilder spannableStringBuilderReplaceCharSequence = AndroidUtilities.replaceCharSequence("TON", AndroidUtilities.replaceTags(str5), spannableString);
            org.telegram.ui.Components.p80 p80Var = new org.telegram.ui.Components.p80(activity, null);
            p80Var.setTypeface(AndroidUtilities.bold());
            p80Var.setGravity(17);
            int i13 = org.telegram.ui.ActionBar.g6.f23161j5;
            p80Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(i13, c6Var2));
            p80Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23251o6, c6Var2));
            p80Var.setTextSize(1, 16.0f);
            p80Var.setText(spannableStringBuilderReplaceSingleTag);
            linearLayout.addView(p80Var, h7.z5.t(-1, -2, 1, 42, 0, 42, 0));
            FrameLayout frameLayout2 = new FrameLayout(activity);
            frameLayout2.setBackground(org.telegram.ui.ActionBar.g6.c0(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.ci, c6Var2)));
            org.telegram.ui.Components.n9 n9Var = new org.telegram.ui.Components.n9(activity);
            n9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
            org.telegram.ui.Components.y8 y8Var = new org.telegram.ui.Components.y8((org.telegram.ui.ActionBar.c6) null);
            y8Var.p(tLObject);
            n9Var.e(tLObject, y8Var);
            frameLayout2.addView(n9Var, h7.z5.e(28, 28, 51));
            TextView textView = new TextView(activity);
            textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(i13, c6Var2));
            textView.setTextSize(1, 13.0f);
            textView.setSingleLine();
            textView.setText(Emoji.replaceEmoji(str2, textView.getPaint().getFontMetricsInt(), false));
            frameLayout2.addView(textView, h7.z5.d(-2, -2.0f, 19, 37.0f, 0.0f, 10.0f, 0.0f));
            linearLayout.addView(frameLayout2, h7.z5.t(-2, 28, 1, 42, 10, 42, 18));
            TextView textView2 = new TextView(activity);
            textView2.setGravity(17);
            org.telegram.messenger.rl.l(i13, c6Var2, textView2, 1, 14.0f);
            textView2.setText(spannableStringBuilderReplaceCharSequence);
            linearLayout.addView(textView2, h7.z5.t(-1, -2, 1, 32, 0, 32, 19));
            lh.d dVar = new lh.d(activity, c6Var2, true);
            dVar.setRoundRadius(24);
            dVar.g(LocaleController.getString(R.string.FragmentUsernameOpen), false, true);
            dVar.setOnClickListener(new org.telegram.ui.Components.xh0(activity, tL_collectibleInfo));
            linearLayout.addView(dVar, h7.z5.k(6.0f, 0.0f, 6.0f, 0.0f, -1, 48));
            if (xsVar != null) {
                lh.d dVar2 = new lh.d(activity, c6Var2, true);
                dVar2.setRoundRadius(24);
                dVar2.d();
                if (i10 == 0) {
                    i11 = R.string.FragmentUsernameCopy;
                } else {
                    i11 = R.string.FragmentPhoneCopy;
                }
                dVar2.g(LocaleController.getString(i11), false, true);
                dVar2.setOnClickListener(new org.telegram.ui.Components.xh0(26, xsVar, e3Var));
                linearLayout.addView(dVar2, h7.z5.k(6.0f, 6.0f, 6.0f, 0.0f, -1, 48));
            }
            e3Var.setCustomView(linearLayout);
            e3Var.show();
        }
        userName = UserObject.getUserName((TLRPC.User) tLObject);
        str2 = userName;
        currency = BillingController.getInstance().formatCurrency(tL_collectibleInfo.amount, tL_collectibleInfo.currency);
        currency2 = BillingController.getInstance().formatCurrency(tL_collectibleInfo.crypto_amount, tL_collectibleInfo.crypto_currency);
        if (i10 == 0) {
            String string4 = LocaleController.formatString(R.string.FragmentUsernameTitle, s3.c.e("@", str));
            string = LocaleController.formatString(R.string.FragmentUsernameMessage, LocaleController.formatShortDateTime(tL_collectibleInfo.purchase_date), currency2, TextUtils.isEmpty(currency) ? "" : a9.p.m("(", currency, ")"));
            strB = a9.p.n(MessagesController.getInstance(UserConfig.selectedAccount).linkPrefix, "/", str, new StringBuilder());
            str3 = string4;
        } else {
            if (i10 == 1) {
                return;
            }
            String string5 = LocaleController.formatString(R.string.FragmentPhoneTitle, oe.b.c().b("+" + str));
            string = LocaleController.formatString(R.string.FragmentPhoneMessage, LocaleController.formatShortDateTime(tL_collectibleInfo.purchase_date), currency2, TextUtils.isEmpty(currency) ? "" : a9.p.m("(", currency, ")"));
            strB = oe.b.c().b("+" + str);
            str3 = string5;
        }
        String str6 = string;
        str4 = strB;
        if (str4 != null) {
            c6Var2 = c6Var;
            org.telegram.ui.ActionBar.e3 e3Var4 = e3Var2;
            xsVar = new xs(str4, i10, e3Var4, c6Var2, 1);
            e3Var = e3Var4;
        } else {
            c6Var2 = c6Var;
            e3Var = e3Var2;
            xsVar = null;
        }
        SpannableStringBuilder spannableStringBuilderReplaceSingleTag2 = AndroidUtilities.replaceSingleTag(str3, xsVar);
        SpannableString spannableString2 = new SpannableString("TON");
        org.telegram.ui.Components.cq cqVar2 = new org.telegram.ui.Components.cq(R.drawable.mini_gram_16, 0);
        cqVar2.setWidth(AndroidUtilities.dp(13.0f));
        spannableString2.setSpan(cqVar2, 0, spannableString2.length(), 33);
        SpannableStringBuilder spannableStringBuilderReplaceCharSequence2 = AndroidUtilities.replaceCharSequence("TON", AndroidUtilities.replaceTags(str6), spannableString2);
        org.telegram.ui.Components.p80 p80Var2 = new org.telegram.ui.Components.p80(activity, null);
        p80Var2.setTypeface(AndroidUtilities.bold());
        p80Var2.setGravity(17);
        int i14 = org.telegram.ui.ActionBar.g6.f23161j5;
        p80Var2.setTextColor(org.telegram.ui.ActionBar.g6.v0(i14, c6Var2));
        p80Var2.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23251o6, c6Var2));
        p80Var2.setTextSize(1, 16.0f);
        p80Var2.setText(spannableStringBuilderReplaceSingleTag2);
        linearLayout.addView(p80Var2, h7.z5.t(-1, -2, 1, 42, 0, 42, 0));
        FrameLayout frameLayout3 = new FrameLayout(activity);
        frameLayout3.setBackground(org.telegram.ui.ActionBar.g6.c0(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.ci, c6Var2)));
        org.telegram.ui.Components.n9 n9Var2 = new org.telegram.ui.Components.n9(activity);
        n9Var2.setRoundRadius(AndroidUtilities.dp(28.0f));
        org.telegram.ui.Components.y8 y8Var2 = new org.telegram.ui.Components.y8((org.telegram.ui.ActionBar.c6) null);
        y8Var2.p(tLObject);
        n9Var2.e(tLObject, y8Var2);
        frameLayout3.addView(n9Var2, h7.z5.e(28, 28, 51));
        TextView textView3 = new TextView(activity);
        textView3.setTextColor(org.telegram.ui.ActionBar.g6.v0(i14, c6Var2));
        textView3.setTextSize(1, 13.0f);
        textView3.setSingleLine();
        textView3.setText(Emoji.replaceEmoji(str2, textView3.getPaint().getFontMetricsInt(), false));
        frameLayout3.addView(textView3, h7.z5.d(-2, -2.0f, 19, 37.0f, 0.0f, 10.0f, 0.0f));
        linearLayout.addView(frameLayout3, h7.z5.t(-2, 28, 1, 42, 10, 42, 18));
        TextView textView4 = new TextView(activity);
        textView4.setGravity(17);
        org.telegram.messenger.rl.l(i14, c6Var2, textView4, 1, 14.0f);
        textView4.setText(spannableStringBuilderReplaceCharSequence2);
        linearLayout.addView(textView4, h7.z5.t(-1, -2, 1, 32, 0, 32, 19));
        lh.d dVar3 = new lh.d(activity, c6Var2, true);
        dVar3.setRoundRadius(24);
        dVar3.g(LocaleController.getString(R.string.FragmentUsernameOpen), false, true);
        dVar3.setOnClickListener(new org.telegram.ui.Components.xh0(activity, tL_collectibleInfo));
        linearLayout.addView(dVar3, h7.z5.k(6.0f, 0.0f, 6.0f, 0.0f, -1, 48));
        if (xsVar != null) {
            lh.d dVar4 = new lh.d(activity, c6Var2, true);
            dVar4.setRoundRadius(24);
            dVar4.d();
            if (i10 == 0) {
                i11 = R.string.FragmentUsernameCopy;
            } else {
                i11 = R.string.FragmentPhoneCopy;
            }
            dVar4.g(LocaleController.getString(i11), false, true);
            dVar4.setOnClickListener(new org.telegram.ui.Components.xh0(26, xsVar, e3Var));
            linearLayout.addView(dVar4, h7.z5.k(6.0f, 6.0f, 6.0f, 0.0f, -1, 48));
        }
        e3Var.setCustomView(linearLayout);
        e3Var.show();
    }
}
