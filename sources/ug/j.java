package ug;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Date;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.w1;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.iu;
import org.telegram.ui.Components.yc;
import org.telegram.ui.LaunchActivity;
import rg.p2;
public abstract class j {
    public static void a(b2 b2Var, boolean z10) {
        wh.p pVar = b2Var.f20235f;
        if (pVar != null) {
            pVar.setTextSize(1, 20);
        }
        iu iuVar = b2Var.f20243n;
        if (iuVar != null) {
            iuVar.setTextSize(1, 14);
        }
        iu iuVar2 = b2Var.f20243n;
        if (iuVar2 != null) {
            iuVar2.setLineSpacing(AndroidUtilities.dp(2.5f), 1.0f);
        }
        if (!z10) {
            ((ViewGroup.MarginLayoutParams) b2Var.f20252t0.getLayoutParams()).topMargin = AndroidUtilities.dp(-14.0f);
        }
    }

    public static String b(MessageObject messageObject) {
        if (messageObject == null) {
            return "";
        }
        String forwardedName = messageObject.getForwardedName();
        if (forwardedName == null) {
            TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-MessageObject.getPeerId(messageObject.messageOwner.peer_id)));
            if (chat == null) {
                return "";
            }
            return chat.title;
        }
        return forwardedName;
    }

    public static void c(TLRPC.TL_error tL_error, FrameLayout frameLayout, f6 f6Var, Runnable runnable) {
        String str;
        if (tL_error != null && (str = tL_error.text) != null) {
            if (str.contains("PREMIUM_SUB_ACTIVE_UNTIL_")) {
                String format = LocaleController.getInstance().getFormatterBoostExpired().format(new Date(Long.parseLong(tL_error.text.replace("PREMIUM_SUB_ACTIVE_UNTIL_", "")) * 1000));
                SpannableStringBuilder replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString("GiftPremiumActivateErrorText", R.string.GiftPremiumActivateErrorText), j6.Gi, 0, runnable);
                yc ycVar = new yc(frameLayout, f6Var);
                int i10 = R.raw.chats_infotip;
                String string = LocaleController.getString(R.string.GiftPremiumActivateErrorTitle);
                ycVar.M(string, AndroidUtilities.replaceCharSequence("%1$s", replaceSingleTag, AndroidUtilities.replaceTags("**" + format + "**")), i10).j();
                try {
                    frameLayout.performHapticFeedback(3, 2);
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            j(frameLayout.getContext(), tL_error);
        }
    }

    public static void d(boolean z10, String str, TLRPC.TL_payments_giveawayInfo tL_payments_giveawayInfo, TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway, Context context, f6 f6Var) {
        boolean z11;
        boolean z12;
        String str2;
        String str3;
        char c10;
        String str4;
        int i10;
        String str5;
        int i11 = tL_messageMediaGiveaway.quantity;
        String formatPluralString = LocaleController.formatPluralString("BoldMonths", tL_messageMediaGiveaway.months, new Object[0]);
        String format = LocaleController.getInstance().getFormatterGiveawayMonthDay().format(new Date(tL_messageMediaGiveaway.until_date * 1000));
        String format2 = LocaleController.getInstance().getFormatterDay().format(new Date(tL_payments_giveawayInfo.start_date * 1000));
        String format3 = LocaleController.getInstance().getFormatterGiveawayMonthDayYear().format(new Date(tL_payments_giveawayInfo.start_date * 1000));
        if (tL_messageMediaGiveaway.channels.size() > 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if ((tL_messageMediaGiveaway.flags & 32) != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
        String string = LocaleController.getString("BoostingGiveAwayAbout", R.string.BoostingGiveAwayAbout);
        b2 b2Var = alertDialog$Builder.f20198a;
        b2Var.R = string;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (z12) {
            if (z10) {
                str5 = "BoostingStarsGiveawayHowItWorksText";
            } else {
                str5 = "BoostingStarsGiveawayHowItWorksTextGroup";
            }
            str2 = format;
            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma(str5, (int) tL_messageMediaGiveaway.stars, str)));
            c10 = 0;
        } else {
            str2 = format;
            if (z10) {
                str3 = "BoostingGiveawayHowItWorksText";
            } else {
                str3 = "BoostingGiveawayHowItWorksTextGroup";
            }
            c10 = 0;
            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString(str3, i11, str, Integer.valueOf(i11), formatPluralString)));
        }
        spannableStringBuilder.append((CharSequence) "\n\n");
        String str6 = tL_messageMediaGiveaway.prize_description;
        if (str6 != null && !str6.isEmpty()) {
            String str7 = tL_messageMediaGiveaway.prize_description;
            Object[] objArr = new Object[2];
            objArr[c10] = str;
            objArr[1] = str7;
            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGiveawayHowItWorksIncludeText", i11, objArr)));
            spannableStringBuilder.append((CharSequence) "\n\n");
        }
        if (tL_messageMediaGiveaway.only_new_subscribers) {
            if (z11) {
                Object[] objArr2 = new Object[2];
                objArr2[c10] = format2;
                objArr2[1] = format3;
                String formatPluralString2 = LocaleController.formatPluralString("BoostingGiveawayHowItWorksSubTextDateSeveral2", tL_messageMediaGiveaway.channels.size() - 1, objArr2);
                Integer valueOf = Integer.valueOf(i11);
                Object[] objArr3 = new Object[4];
                objArr3[c10] = str2;
                objArr3[1] = valueOf;
                objArr3[2] = str;
                objArr3[3] = formatPluralString2;
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGiveawayHowItWorksSubTextDateSeveral1", i11, objArr3)));
            } else {
                Integer valueOf2 = Integer.valueOf(i11);
                Object[] objArr4 = new Object[5];
                objArr4[c10] = str2;
                objArr4[1] = valueOf2;
                objArr4[2] = str;
                objArr4[3] = format2;
                objArr4[4] = format3;
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGiveawayHowItWorksSubTextDate", i11, objArr4)));
            }
        } else if (z11) {
            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGiveawayHowItWorksSubTextSeveral1", i11, str2, Integer.valueOf(i11), str, LocaleController.formatPluralString("BoostingGiveawayHowItWorksSubTextSeveral2", tL_messageMediaGiveaway.channels.size() - 1, new Object[0]))));
        } else {
            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGiveawayHowItWorksSubText", i11, str2, Integer.valueOf(i11), str)));
        }
        spannableStringBuilder.append((CharSequence) "\n\n");
        if (tL_payments_giveawayInfo.participating) {
            if (z11) {
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGiveawayParticipantMultiPlural", tL_messageMediaGiveaway.channels.size() - 1, str)));
            } else {
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString("BoostingGiveawayParticipant", R.string.BoostingGiveawayParticipant, str)));
            }
        } else {
            String str8 = tL_payments_giveawayInfo.disallowed_country;
            if (str8 != null && !str8.isEmpty()) {
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString("BoostingGiveawayNotEligibleCountry", R.string.BoostingGiveawayNotEligibleCountry)));
            } else if (tL_payments_giveawayInfo.admin_disallowed_chat_id != 0) {
                TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(tL_payments_giveawayInfo.admin_disallowed_chat_id));
                if (chat != null) {
                    str4 = chat.title;
                } else {
                    str4 = "";
                }
                if (z10) {
                    i10 = R.string.BoostingGiveawayNotEligibleAdmin;
                } else {
                    i10 = R.string.BoostingGiveawayNotEligibleAdminGroup;
                }
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(i10, str4)));
            } else if (tL_payments_giveawayInfo.joined_too_early_date != 0) {
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString("BoostingGiveawayNotEligible", R.string.BoostingGiveawayNotEligible, LocaleController.getInstance().getFormatterGiveawayMonthDayYear().format(new Date(tL_payments_giveawayInfo.joined_too_early_date * 1000)))));
            } else if (z11) {
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGiveawayTakePartMultiPlural", tL_messageMediaGiveaway.channels.size() - 1, str, str2)));
            } else {
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString("BoostingGiveawayTakePart", R.string.BoostingGiveawayTakePart, str, str2)));
            }
        }
        b2Var.T = spannableStringBuilder;
        alertDialog$Builder.k(LocaleController.getString("OK", R.string.OK), new t0.a(5));
        a(alertDialog$Builder.o(), false);
    }

    public static void e(boolean z10, String str, TLRPC.TL_payments_giveawayInfoResults tL_payments_giveawayInfoResults, TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway, Context context, f6 f6Var) {
        boolean z11;
        boolean z12;
        String str2;
        String str3;
        char c10;
        String string;
        String str4;
        if (tL_messageMediaGiveaway.until_date == 0) {
            tL_messageMediaGiveaway.until_date = tL_payments_giveawayInfoResults.finish_date;
        }
        int i10 = tL_messageMediaGiveaway.quantity;
        String formatPluralString = LocaleController.formatPluralString("BoldMonths", tL_messageMediaGiveaway.months, new Object[0]);
        String format = LocaleController.getInstance().getFormatterGiveawayMonthDay().format(new Date(tL_messageMediaGiveaway.until_date * 1000));
        String format2 = LocaleController.getInstance().getFormatterDay().format(new Date(tL_payments_giveawayInfoResults.start_date * 1000));
        String format3 = LocaleController.getInstance().getFormatterGiveawayMonthDayYear().format(new Date(tL_payments_giveawayInfoResults.start_date * 1000));
        if (tL_messageMediaGiveaway.channels.size() > 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if ((tL_messageMediaGiveaway.flags & 32) != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
        String string2 = LocaleController.getString("BoostingGiveawayEnd", R.string.BoostingGiveawayEnd);
        b2 b2Var = alertDialog$Builder.f20198a;
        b2Var.R = string2;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (z12) {
            if (z10) {
                str4 = "BoostingStarsGiveawayHowItWorksTextEnd";
            } else {
                str4 = "BoostingStarsGiveawayHowItWorksTextEndGroup";
            }
            str2 = format;
            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma(str4, (int) tL_messageMediaGiveaway.stars, str)));
            c10 = 1;
        } else {
            str2 = format;
            if (z10) {
                str3 = "BoostingGiveawayHowItWorksTextEnd";
            } else {
                str3 = "BoostingGiveawayHowItWorksTextEndGroup";
            }
            c10 = 1;
            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString(str3, i10, str, Integer.valueOf(i10), formatPluralString)));
        }
        spannableStringBuilder.append((CharSequence) "\n\n");
        String str5 = tL_messageMediaGiveaway.prize_description;
        if (str5 != null && !str5.isEmpty()) {
            String str6 = tL_messageMediaGiveaway.prize_description;
            Object[] objArr = new Object[2];
            objArr[0] = str;
            objArr[c10] = str6;
            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGiveawayHowItWorksIncludeText", i10, objArr)));
            spannableStringBuilder.append((CharSequence) "\n\n");
        }
        if (tL_messageMediaGiveaway.only_new_subscribers) {
            if (z11) {
                Object[] objArr2 = new Object[2];
                objArr2[0] = format2;
                objArr2[c10] = format3;
                String formatPluralString2 = LocaleController.formatPluralString("BoostingGiveawayHowItWorksSubTextDateSeveral2", tL_messageMediaGiveaway.channels.size() - 1, objArr2);
                Integer valueOf = Integer.valueOf(i10);
                Object[] objArr3 = new Object[4];
                objArr3[0] = str2;
                objArr3[c10] = valueOf;
                objArr3[2] = str;
                objArr3[3] = formatPluralString2;
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGiveawayHowItWorksSubTextDateSeveralEnd1", i10, objArr3)));
            } else {
                Integer valueOf2 = Integer.valueOf(i10);
                Object[] objArr4 = new Object[5];
                objArr4[0] = str2;
                objArr4[c10] = valueOf2;
                objArr4[2] = str;
                objArr4[3] = format2;
                objArr4[4] = format3;
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGiveawayHowItWorksSubTextDateEnd", i10, objArr4)));
            }
        } else if (z11) {
            String formatPluralString3 = LocaleController.formatPluralString("BoostingGiveawayHowItWorksSubTextSeveral2", tL_messageMediaGiveaway.channels.size() - 1, new Object[0]);
            Integer valueOf3 = Integer.valueOf(i10);
            Object[] objArr5 = new Object[4];
            objArr5[0] = str2;
            objArr5[c10] = valueOf3;
            objArr5[2] = str;
            objArr5[3] = formatPluralString3;
            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGiveawayHowItWorksSubTextSeveralEnd1", i10, objArr5)));
        } else {
            Integer valueOf4 = Integer.valueOf(i10);
            Object[] objArr6 = new Object[3];
            objArr6[0] = str2;
            objArr6[c10] = valueOf4;
            objArr6[2] = str;
            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGiveawayHowItWorksSubTextEnd", i10, objArr6)));
        }
        spannableStringBuilder.append((CharSequence) " ");
        int i11 = tL_payments_giveawayInfoResults.activated_count;
        if (i11 > 0) {
            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGiveawayUsedLinksPlural", i11, new Object[0])));
        }
        if (tL_payments_giveawayInfoResults.refunded) {
            String string3 = LocaleController.getString("BoostingGiveawayCanceledByPayment", R.string.BoostingGiveawayCanceledByPayment);
            TextView g10 = w1.g(context, 1, 14.0f);
            g10.setTypeface(AndroidUtilities.bold());
            g10.setGravity(17);
            g10.setText(string3);
            int i12 = j6.f20880p7;
            g10.setTextColor(j6.v0(i12, f6Var));
            g10.setBackground(j6.c0(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), j6.l1(0.1f, j6.v0(i12, f6Var))));
            g10.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
            b2Var.f20230c = g10;
            b2Var.T = spannableStringBuilder;
            alertDialog$Builder.k(LocaleController.getString("Close", R.string.Close), new t0.a(5));
            a(alertDialog$Builder.o(), true);
            return;
        }
        b2Var.T = spannableStringBuilder;
        if (tL_payments_giveawayInfoResults.winner) {
            string = LocaleController.getString(R.string.BoostingGiveawayYouWon);
            if ((tL_payments_giveawayInfoResults.flags & 16) == 0) {
                alertDialog$Builder.k(LocaleController.getString("BoostingGiveawayViewPrize", R.string.BoostingGiveawayViewPrize), new p2(tL_payments_giveawayInfoResults, 6));
            }
            alertDialog$Builder.h(LocaleController.getString("Close", R.string.Close), new t0.a(5));
        } else {
            string = LocaleController.getString("BoostingGiveawayYouNotWon", R.string.BoostingGiveawayYouNotWon);
            alertDialog$Builder.k(LocaleController.getString("Close", R.string.Close), new t0.a(5));
        }
        iu iuVar = new iu(context);
        NotificationCenter.listenEmojiLoading(iuVar);
        iuVar.setTextColor(j6.v0(j6.f20770j5, f6Var));
        iuVar.setTextSize(1, 14.0f);
        iuVar.setGravity(17);
        iuVar.setText(string);
        iuVar.setBackground(j6.c0(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), j6.v0(j6.f21053yh, f6Var)));
        iuVar.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(9.0f));
        b2Var.d = iuVar;
        a(alertDialog$Builder.o(), false);
    }

    public static void f(n2 n2Var, TLRPC.Chat chat, boolean z10) {
        if (n2Var == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new c(yc.a0(n2Var), z10, chat, n2Var.getResourceProvider()), 300L);
    }

    public static void g(int i10) {
        String str;
        n2 R = LaunchActivity.R();
        if (R == null) {
            return;
        }
        if (i10 < 60) {
            str = LocaleController.formatPluralString("Seconds", i10, new Object[0]);
        } else if (i10 < 3600) {
            str = LocaleController.formatPluralString("Minutes", i10 / 60, new Object[0]);
        } else {
            int i11 = (i10 / 60) / 60;
            if (i11 > 2) {
                str = LocaleController.formatPluralString("Hours", i11, new Object[0]);
            } else {
                str = LocaleController.formatPluralString("Hours", i11, new Object[0]) + " " + LocaleController.formatPluralString("Minutes", i10 % 60, new Object[0]);
            }
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(R.getContext(), 0, R.getResourceProvider());
        String string = LocaleController.getString(R.string.CantBoostTooOften);
        b2 b2Var = alertDialog$Builder.f20198a;
        b2Var.R = string;
        b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("CantBoostTooOftenDescription", R.string.CantBoostTooOftenDescription, str));
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new t0.a(9));
        alertDialog$Builder.o();
    }

    public static void h(long j3) {
        SpannableStringBuilder replaceTags;
        if (j3 == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId) {
            replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.BoostingGiftLinkForwardedToSavedMsg));
        } else if (DialogObject.isChatDialog(j3)) {
            replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("BoostingGiftLinkForwardedTo", R.string.BoostingGiftLinkForwardedTo, MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-j3)).title));
        } else {
            replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("BoostingGiftLinkForwardedTo", R.string.BoostingGiftLinkForwardedTo, UserObject.getFirstName(MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(j3)))));
        }
        AndroidUtilities.runOnUIThread(new sg.p0(replaceTags, 6), 450L);
    }

    public static void i(long j3, sg.k0 k0Var) {
        TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-j3));
        n2 R = LaunchActivity.R();
        if (R == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(R.getContext(), 0, R.getResourceProvider());
        String string = LocaleController.getString(R.string.BoostingMoreBoostsNeeded);
        b2 b2Var = alertDialog$Builder.f20198a;
        b2Var.R = string;
        b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGetMoreBoostByGiftingCount", (int) MessagesController.getInstance(UserConfig.selectedAccount).boostsPerSentGift, chat.title));
        alertDialog$Builder.h(LocaleController.getString("GiftPremium", R.string.GiftPremium), new sg.y(k0Var, 3));
        alertDialog$Builder.k(LocaleController.getString("Close", R.string.Close), new t0.a(5));
        alertDialog$Builder.o();
    }

    public static void j(Context context, TLRPC.TL_error tL_error) {
        String str;
        if (tL_error != null && (str = tL_error.text) != null && !TextUtils.isEmpty(str)) {
            Toast.makeText(context, tL_error.text, 1).show();
        }
    }
}
