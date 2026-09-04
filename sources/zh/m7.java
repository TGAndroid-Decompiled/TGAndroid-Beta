package zh;

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
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.x9;
import org.telegram.ui.x70;
public final class m7 extends g51 {
    public static final int f52277a = 0;

    static {
        g51.setup(new g51());
    }

    @Override
    public final void bindView(View view, h51 h51Var, boolean z10, v51 v51Var, d61 d61Var) {
        String userName;
        boolean z11;
        boolean z12;
        float f7;
        int i10;
        int i11;
        org.telegram.ui.ActionBar.j5 j5Var;
        n7 n7Var = (n7) view;
        TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) h51Var.G;
        org.telegram.ui.ActionBar.j5 j5Var2 = n7Var.d;
        x9 x9Var = n7Var.f52330c;
        org.telegram.ui.ActionBar.f6 f6Var = n7Var.f52329b;
        TextView textView = n7Var.h;
        TextView textView2 = n7Var.f52332f;
        TextView textView3 = n7Var.f52331e;
        int i12 = n7Var.f52328a;
        TextView textView4 = n7Var.f52333n;
        long peerDialogId = DialogObject.getPeerDialogId(starsSubscription.peer);
        n7Var.f52334r = !TextUtils.isEmpty(starsSubscription.title);
        if (peerDialogId < 0) {
            TLRPC.Chat chat = MessagesController.getInstance(i12).getChat(Long.valueOf(-peerDialogId));
            i9 i9Var = new i9((org.telegram.ui.ActionBar.f6) null);
            i9Var.q(chat);
            x9Var.e(chat, i9Var);
            if (chat != null) {
                userName = chat.title;
            } else {
                userName = null;
            }
            z11 = false;
        } else {
            TLRPC.User user = MessagesController.getInstance(i12).getUser(Long.valueOf(peerDialogId));
            i9 i9Var2 = new i9((org.telegram.ui.ActionBar.f6) null);
            i9Var2.r(user);
            x9Var.e(user, i9Var2);
            userName = UserObject.getUserName(user);
            z11 = !UserObject.isBot(user);
        }
        long currentTime = ConnectionsManager.getInstance(i12).getCurrentTime();
        j5Var2.l(Emoji.replaceEmoji(userName, j5Var2.getPaint().getFontMetricsInt(), false), false);
        if (!TextUtils.isEmpty(starsSubscription.title)) {
            textView3.setVisibility(0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (starsSubscription.photo != null) {
                x70 x70Var = new x70(textView3, 14.0f, i12);
                x70Var.a(4.0f);
                x70Var.f42610f = false;
                SpannableString spannableString = new SpannableString("x");
                j5Var = j5Var2;
                z12 = z11;
                spannableString.setSpan(x70Var, 0, 1, 33);
                x70Var.f42607b.setImage(ImageLocation.getForWebFile(WebFile.createWithWebDocument(starsSubscription.photo)), "14_14", null, null, 0, 0);
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
        if (n7Var.f52334r) {
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
                textView.setText(v7.X0(false, "⭐️ " + Long.toString(starsSubscription.pricing.amount), 0.8f, null));
                textView4.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f21061z6, f6Var));
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
        n7Var.f52335s = z10;
        n7Var.setWillNotDraw(!z10);
    }

    @Override
    public final View createView(Context context, ll0 ll0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        n7 n7Var = (n7) getCached();
        if (n7Var != null) {
            return n7Var;
        }
        return new n7(context, i10, f6Var);
    }

    @Override
    public final boolean equals(h51 h51Var, h51 h51Var2) {
        if (h51Var2 != null) {
            Object obj = h51Var.G;
            if (obj instanceof TL_stars.StarsSubscription) {
                Object obj2 = h51Var2.G;
                if (obj2 instanceof TL_stars.StarsSubscription) {
                    return TextUtils.equals(((TL_stars.StarsSubscription) obj).f20098id, ((TL_stars.StarsSubscription) obj2).f20098id);
                }
                return false;
            }
            return false;
        }
        return false;
    }
}
