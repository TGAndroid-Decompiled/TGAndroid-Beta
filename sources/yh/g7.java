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
import org.telegram.ui.Components.d71;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.l71;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.q61;
import org.telegram.ui.Components.rm0;
import org.telegram.ui.Components.y9;
import org.telegram.ui.w70;
public final class g7 extends p61 {
    public static final int f52635a = 0;

    static {
        p61.setup(new p61());
    }

    @Override
    public final void bindView(View view, q61 q61Var, boolean z10, d71 d71Var, l71 l71Var) {
        String userName;
        boolean z11;
        boolean z12;
        float f7;
        int i10;
        int i11;
        org.telegram.ui.ActionBar.j5 j5Var;
        h7 h7Var = (h7) view;
        TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) q61Var.G;
        org.telegram.ui.ActionBar.j5 j5Var2 = h7Var.d;
        y9 y9Var = h7Var.f52686c;
        org.telegram.ui.ActionBar.e6 e6Var = h7Var.f52685b;
        TextView textView = h7Var.h;
        TextView textView2 = h7Var.f52688f;
        TextView textView3 = h7Var.f52687e;
        int i12 = h7Var.f52684a;
        TextView textView4 = h7Var.f52689n;
        long peerDialogId = DialogObject.getPeerDialogId(starsSubscription.peer);
        h7Var.f52690r = !TextUtils.isEmpty(starsSubscription.title);
        if (peerDialogId < 0) {
            TLRPC.Chat chat = MessagesController.getInstance(i12).getChat(Long.valueOf(-peerDialogId));
            j9 j9Var = new j9((org.telegram.ui.ActionBar.e6) null);
            j9Var.q(chat);
            y9Var.e(chat, j9Var);
            if (chat != null) {
                userName = chat.title;
            } else {
                userName = null;
            }
            z11 = false;
        } else {
            TLRPC.User user = MessagesController.getInstance(i12).getUser(Long.valueOf(peerDialogId));
            j9 j9Var2 = new j9((org.telegram.ui.ActionBar.e6) null);
            j9Var2.r(user);
            y9Var.e(user, j9Var2);
            userName = UserObject.getUserName(user);
            z11 = !UserObject.isBot(user);
        }
        long currentTime = ConnectionsManager.getInstance(i12).getCurrentTime();
        j5Var2.l(Emoji.replaceEmoji(userName, j5Var2.getPaint().getFontMetricsInt(), false), false);
        if (!TextUtils.isEmpty(starsSubscription.title)) {
            textView3.setVisibility(0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (starsSubscription.photo != null) {
                w70 w70Var = new w70(textView3, 14.0f, i12);
                w70Var.a(4.0f);
                w70Var.f43151f = false;
                SpannableString spannableString = new SpannableString("x");
                j5Var = j5Var2;
                z12 = z11;
                spannableString.setSpan(w70Var, 0, 1, 33);
                w70Var.f43148b.setImage(ImageLocation.getForWebFile(WebFile.createWithWebDocument(starsSubscription.photo)), "14_14", null, null, 0, 0);
                spannableStringBuilder.append((CharSequence) spannableString).append((CharSequence) " ");
            } else {
                j5Var = j5Var2;
                z12 = z11;
            }
            spannableStringBuilder.append(Emoji.replaceEmoji(starsSubscription.title, j5Var.getPaint().getFontMetricsInt(), false));
            textView3.setText(spannableStringBuilder);
        } else {
            z12 = z11;
            textView3.setVisibility(8);
        }
        if (h7Var.f52690r) {
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
                textView4.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.wj, e6Var));
                textView4.setText(LocaleController.getString(R.string.StarsSubscriptionStatusExpired));
            } else {
                textView2.setText(LocaleController.formatString(R.string.StarsSubscriptionRenews, LocaleController.formatDateChat(j3)));
                textView.setVisibility(0);
                textView.setText(p7.Y0(false, "⭐️ " + Long.toString(starsSubscription.pricing.amount), 0.8f, null));
                textView4.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21203z6, e6Var));
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
            textView4.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.wj, e6Var));
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
        h7Var.f52691s = z10;
        h7Var.setWillNotDraw(!z10);
    }

    @Override
    public final View createView(Context context, rm0 rm0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        h7 h7Var = (h7) getCached();
        if (h7Var != null) {
            return h7Var;
        }
        return new h7(context, i10, e6Var);
    }

    @Override
    public final boolean equals(q61 q61Var, q61 q61Var2) {
        if (q61Var2 != null) {
            Object obj = q61Var.G;
            if (obj instanceof TL_stars.StarsSubscription) {
                Object obj2 = q61Var2.G;
                if (obj2 instanceof TL_stars.StarsSubscription) {
                    return TextUtils.equals(((TL_stars.StarsSubscription) obj).f20270id, ((TL_stars.StarsSubscription) obj2).f20270id);
                }
                return false;
            }
            return false;
        }
        return false;
    }
}
