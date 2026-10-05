package yh;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.WebFile;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.w70;
public final class q7 extends g61 {
    public static final int f51882a = 0;

    static {
        g61.setup(new g61());
    }

    @Override
    public final void bindView(View view, h61 h61Var, boolean z10, w61 w61Var, e71 e71Var) {
        String userName;
        boolean z11;
        boolean z12;
        float f7;
        int i10;
        int i11;
        org.telegram.ui.ActionBar.i5 i5Var;
        r7 r7Var = (r7) view;
        TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) h61Var.G;
        org.telegram.ui.ActionBar.i5 i5Var2 = r7Var.d;
        w9 w9Var = r7Var.f51932c;
        org.telegram.ui.ActionBar.d6 d6Var = r7Var.f51931b;
        TextView textView = r7Var.h;
        TextView textView2 = r7Var.f51934f;
        TextView textView3 = r7Var.f51933e;
        int i12 = r7Var.f51930a;
        TextView textView4 = r7Var.f51935n;
        long peerDialogId = DialogObject.getPeerDialogId(starsSubscription.peer);
        r7Var.f51936r = !TextUtils.isEmpty(starsSubscription.title);
        if (peerDialogId < 0) {
            TLRPC.Chat chat = MessagesController.getInstance(i12).getChat(Long.valueOf(-peerDialogId));
            h9 h9Var = new h9((org.telegram.ui.ActionBar.d6) null);
            h9Var.q(chat);
            w9Var.e(chat, h9Var);
            if (chat != null) {
                userName = chat.title;
            } else {
                userName = null;
            }
            z11 = false;
        } else {
            TLRPC.User user = MessagesController.getInstance(i12).getUser(Long.valueOf(peerDialogId));
            h9 h9Var2 = new h9((org.telegram.ui.ActionBar.d6) null);
            h9Var2.r(user);
            w9Var.e(user, h9Var2);
            userName = UserObject.getUserName(user);
            z11 = !UserObject.isBot(user);
        }
        long currentTime = ConnectionsManager.getInstance(i12).getCurrentTime();
        i5Var2.l(Emoji.replaceEmoji(userName, i5Var2.getPaint().getFontMetricsInt(), false), false);
        if (!TextUtils.isEmpty(starsSubscription.title)) {
            textView3.setVisibility(0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (starsSubscription.photo != null) {
                w70 w70Var = new w70(textView3, 14.0f, i12);
                w70Var.a(4.0f);
                w70Var.f41965f = false;
                SpannableString spannableString = new SpannableString("x");
                i5Var = i5Var2;
                z12 = z11;
                spannableString.setSpan(w70Var, 0, 1, 33);
                w70Var.f41962b.setImage(ImageLocation.getForWebFile(WebFile.createWithWebDocument(starsSubscription.photo)), "14_14", null, null, 0, 0);
                spannableStringBuilder.append((CharSequence) spannableString).append((CharSequence) " ");
            } else {
                i5Var = i5Var2;
                z12 = z11;
            }
            spannableStringBuilder.append(Emoji.replaceEmoji(starsSubscription.title, i5Var.getPaint().getFontMetricsInt(), false));
            textView3.setText(spannableStringBuilder);
        } else {
            z12 = z11;
            textView3.setVisibility(8);
        }
        if (r7Var.f51936r) {
            f7 = 13.0f;
        } else {
            f7 = 14.0f;
        }
        textView2.setTextSize(1, f7);
        if (!starsSubscription.canceled && !starsSubscription.bot_canceled) {
            long j3 = starsSubscription.until_date;
            if (j3 < currentTime) {
                textView2.setText(LocaleController.formatString(R.string.StarsSubscriptionExpired, LocaleController.formatDateChat(j3)));
                textView.setVisibility(8);
                textView4.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.wj, d6Var));
                textView4.setText(LocaleController.getString(R.string.StarsSubscriptionStatusExpired));
            } else {
                textView2.setText(LocaleController.formatString(R.string.StarsSubscriptionRenews, LocaleController.formatDateChat(j3)));
                textView.setVisibility(0);
                textView.setText(z7.d1(false, "⭐️ " + Long.toString(starsSubscription.pricing.amount), 0.8f, null));
                textView4.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f21233z6, d6Var));
                int i13 = starsSubscription.pricing.period;
                if (i13 == 2592000) {
                    textView4.setText(LocaleController.getString(R.string.StarsParticipantSubscriptionPerMonth));
                } else if (i13 == 60) {
                    textView4.setText("per minute");
                } else if (i13 == 300) {
                    textView4.setText("per 5 minutes");
                }
            }
        } else {
            long j10 = starsSubscription.until_date;
            if (j10 < currentTime) {
                i10 = R.string.StarsSubscriptionExpired;
            } else {
                i10 = R.string.StarsSubscriptionExpires;
            }
            textView2.setText(LocaleController.formatString(i10, LocaleController.formatDateChat(j10)));
            textView.setVisibility(8);
            textView4.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.wj, d6Var));
            if (starsSubscription.bot_canceled) {
                if (z12) {
                    i11 = R.string.StarsSubscriptionStatusBizCancelled;
                } else {
                    i11 = R.string.StarsSubscriptionStatusBotCancelled;
                }
            } else {
                i11 = R.string.StarsSubscriptionStatusCancelled;
            }
            textView4.setText(LocaleController.getString(i11));
        }
        r7Var.f51937s = z10;
        r7Var.setWillNotDraw(!z10);
    }

    @Override
    public final View createView(Context context, zl0 zl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        r7 r7Var = (r7) getCached();
        if (r7Var != null) {
            return r7Var;
        }
        return new r7(context, i10, d6Var);
    }

    @Override
    public final boolean equals(h61 h61Var, h61 h61Var2) {
        if (h61Var2 != null) {
            Object obj = h61Var.G;
            if (obj instanceof TL_stars.StarsSubscription) {
                Object obj2 = h61Var2.G;
                if (obj2 instanceof TL_stars.StarsSubscription) {
                    return TextUtils.equals(((TL_stars.StarsSubscription) obj).f20275id, ((TL_stars.StarsSubscription) obj2).f20275id);
                }
                return false;
            }
            return false;
        }
        return false;
    }
}
