package ph;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.e9;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v41;
import org.telegram.ui.Components.w41;
import org.telegram.ui.n00;
public final class z2 extends v41 {
    public static final int f46193a = 0;

    static {
        v41.setup(new v41());
    }

    @Override
    public final void bindView(View view, w41 w41Var, boolean z10, k51 k51Var, u51 u51Var) {
        int i10;
        int i11;
        int i12;
        float f9;
        Object obj = w41Var.G;
        int i13 = 0;
        if (obj instanceof TL_payments.connectedBotStarRef) {
            a3 a3Var = (a3) view;
            TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj;
            boolean z11 = w41Var.f34306r;
            View view2 = a3Var.f45733e;
            ImageView imageView = a3Var.f45734f;
            TLRPC.User user = MessagesController.getInstance(a3Var.f45730a).getUser(Long.valueOf(connectedbotstarref.bot_id));
            e9 e9Var = new e9((c6) null);
            e9Var.r(user);
            a3Var.f45732c.e(user, e9Var);
            TextView textView = a3Var.h;
            textView.setText(Emoji.replaceEmoji(UserObject.getUserName(user), textView.getPaint().getFontMetricsInt(), false));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (connectedbotstarref.commission_permille > 0) {
                spannableStringBuilder.append((CharSequence) " d");
                n00 n00Var = new n00();
                n00Var.f40665f = g6.w0(null, g6.uj, false);
                n00Var.f40666n = j.G0(connectedbotstarref.commission_permille);
                if (n00Var.f40663c != null) {
                    n00Var.f40663c = null;
                    n00Var.a();
                }
                spannableStringBuilder.setSpan(n00Var, 1, 2, 33);
            }
            int i14 = connectedbotstarref.duration_months;
            if (i14 == 0) {
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.Lifetime));
            } else if (i14 >= 12 && i14 % 12 == 0) {
                spannableStringBuilder.append((CharSequence) LocaleController.formatPluralString("Years", i14 / 12, new Object[0]));
            } else {
                spannableStringBuilder.append((CharSequence) LocaleController.formatPluralString("Months", i14, new Object[0]));
            }
            a3Var.f45735n.setText(spannableStringBuilder);
            ImageView imageView2 = a3Var.f45736r;
            if (z11) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            imageView2.setVisibility(i10);
            a3Var.d.setVisibility(0);
            imageView.setVisibility(0);
            view2.setVisibility(0);
            int dp = AndroidUtilities.dp(9.665f);
            if (connectedbotstarref.revoked) {
                i11 = g6.wj;
            } else {
                i11 = g6.uj;
            }
            view2.setBackground(g6.K(dp, g6.v0(i11, a3Var.f45731b)));
            if (connectedbotstarref.revoked) {
                i12 = R.drawable.msg_link_2;
            } else {
                i12 = R.drawable.msg_limit_links;
            }
            imageView.setImageResource(i12);
            float f10 = 0.6f;
            if (connectedbotstarref.revoked) {
                f9 = 0.8f;
            } else {
                f9 = 0.6f;
            }
            imageView.setScaleX(f9);
            if (connectedbotstarref.revoked) {
                f10 = 0.8f;
            }
            imageView.setScaleY(f10);
            a3Var.f45737s = z10;
            a3Var.setWillNotDraw(!z10);
        } else if (obj instanceof TL_payments.starRefProgram) {
            a3 a3Var2 = (a3) view;
            TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) obj;
            boolean z12 = w41Var.f34306r;
            TLRPC.User user2 = MessagesController.getInstance(a3Var2.f45730a).getUser(Long.valueOf(starrefprogram.bot_id));
            e9 e9Var2 = new e9((c6) null);
            e9Var2.r(user2);
            a3Var2.f45732c.e(user2, e9Var2);
            a3Var2.h.setText(UserObject.getUserName(user2));
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            if (starrefprogram.commission_permille > 0) {
                spannableStringBuilder2.append((CharSequence) " d");
                n00 n00Var2 = new n00();
                n00Var2.f40665f = g6.w0(null, g6.uj, false);
                n00Var2.f40666n = j.G0(starrefprogram.commission_permille);
                if (n00Var2.f40663c != null) {
                    n00Var2.f40663c = null;
                    n00Var2.a();
                }
                spannableStringBuilder2.setSpan(n00Var2, 1, 2, 33);
            }
            int i15 = starrefprogram.duration_months;
            if (i15 == 0) {
                spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.Lifetime));
            } else if (i15 >= 12 && i15 % 12 == 0) {
                spannableStringBuilder2.append((CharSequence) LocaleController.formatPluralString("Years", i15 / 12, new Object[0]));
            } else {
                spannableStringBuilder2.append((CharSequence) LocaleController.formatPluralString("Months", i15, new Object[0]));
            }
            a3Var2.f45735n.setText(spannableStringBuilder2);
            ImageView imageView3 = a3Var2.f45736r;
            if (!z12) {
                i13 = 8;
            }
            imageView3.setVisibility(i13);
            a3Var2.d.setVisibility(8);
            a3Var2.f45734f.setVisibility(8);
            a3Var2.f45733e.setVisibility(8);
            a3Var2.f45737s = z10;
            a3Var2.setWillNotDraw(!z10);
        }
    }

    @Override
    public final View createView(Context context, jl0 jl0Var, int i10, int i11, c6 c6Var) {
        return new a3(context, i10, c6Var);
    }
}
