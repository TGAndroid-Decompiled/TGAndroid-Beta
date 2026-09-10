package xh;

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
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.w9;
import org.telegram.ui.w70;
public final class q7 extends u51 {
    public static final int f45938a = 0;

    static {
        u51.setup(new u51());
    }

    @Override
    public final void bindView(View view, v51 v51Var, boolean z10, j61 j61Var, r61 r61Var) {
        String userName;
        boolean z11;
        boolean z12;
        float f7;
        int i10;
        int i11;
        org.telegram.ui.ActionBar.l5 l5Var;
        r7 r7Var = (r7) view;
        TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) v51Var.G;
        org.telegram.ui.ActionBar.l5 l5Var2 = r7Var.d;
        w9 w9Var = r7Var.f45983c;
        org.telegram.ui.ActionBar.f6 f6Var = r7Var.f45982b;
        TextView textView = r7Var.h;
        TextView textView2 = r7Var.f45984f;
        TextView textView3 = r7Var.e;
        int i12 = r7Var.f45981a;
        TextView textView4 = r7Var.f45985n;
        long peerDialogId = DialogObject.getPeerDialogId(starsSubscription.peer);
        r7Var.f45986r = !TextUtils.isEmpty(starsSubscription.title);
        if (peerDialogId < 0) {
            TLRPC.Chat chat = MessagesController.getInstance(i12).getChat(Long.valueOf(-peerDialogId));
            g9 g9Var = new g9((org.telegram.ui.ActionBar.f6) null);
            g9Var.q(chat);
            w9Var.e(chat, g9Var);
            if (chat != null) {
                userName = chat.title;
            } else {
                userName = null;
            }
            z11 = false;
        } else {
            TLRPC.User user = MessagesController.getInstance(i12).getUser(Long.valueOf(peerDialogId));
            g9 g9Var2 = new g9((org.telegram.ui.ActionBar.f6) null);
            g9Var2.r(user);
            w9Var.e(user, g9Var2);
            userName = UserObject.getUserName(user);
            z11 = !UserObject.isBot(user);
        }
        long currentTime = ConnectionsManager.getInstance(i12).getCurrentTime();
        l5Var2.l(Emoji.replaceEmoji(userName, l5Var2.getPaint().getFontMetricsInt(), false), false);
        if (!TextUtils.isEmpty(starsSubscription.title)) {
            textView3.setVisibility(0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (starsSubscription.photo != null) {
                w70 w70Var = new w70(textView3, 14.0f, i12);
                w70Var.a(4.0f);
                w70Var.f37739f = false;
                SpannableString spannableString = new SpannableString("x");
                l5Var = l5Var2;
                z12 = z11;
                spannableString.setSpan(w70Var, 0, 1, 33);
                w70Var.f37737b.setImage(ImageLocation.getForWebFile(WebFile.createWithWebDocument(starsSubscription.photo)), "14_14", null, null, 0, 0);
                spannableStringBuilder.append((CharSequence) spannableString).append((CharSequence) " ");
            } else {
                l5Var = l5Var2;
                z12 = z11;
            }
            spannableStringBuilder.append(Emoji.replaceEmoji(starsSubscription.title, l5Var.getPaint().getFontMetricsInt(), false));
            textView3.setText(spannableStringBuilder);
        } else {
            z12 = z11;
            textView3.setVisibility(8);
        }
        if (r7Var.f45986r) {
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
                textView4.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.wj, f6Var));
                textView4.setText(LocaleController.getString(R.string.StarsSubscriptionStatusExpired));
            } else {
                textView2.setText(LocaleController.formatString(R.string.StarsSubscriptionRenews, LocaleController.formatDateChat(j3)));
                textView.setVisibility(0);
                textView.setText(z7.X0(false, "⭐️ " + Long.toString(starsSubscription.pricing.amount), 0.8f, null));
                textView4.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18325z6, f6Var));
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
            textView4.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.wj, f6Var));
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
        r7Var.f45987s = z10;
        r7Var.setWillNotDraw(!z10);
    }

    @Override
    public final View createView(Context context, vl0 vl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        r7 r7Var = (r7) getCached();
        if (r7Var != null) {
            return r7Var;
        }
        return new r7(context, i10, f6Var);
    }

    @Override
    public final boolean equals(v51 v51Var, v51 v51Var2) {
        if (v51Var2 != null) {
            Object obj = v51Var.G;
            if (obj instanceof TL_stars.StarsSubscription) {
                Object obj2 = v51Var2.G;
                if (obj2 instanceof TL_stars.StarsSubscription) {
                    return TextUtils.equals(((TL_stars.StarsSubscription) obj).f17426id, ((TL_stars.StarsSubscription) obj2).f17426id);
                }
                return false;
            }
            return false;
        }
        return false;
    }
}
