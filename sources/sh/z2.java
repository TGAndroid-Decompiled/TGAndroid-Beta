package sh;

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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.z8;
import org.telegram.ui.z00;
public final class z2 extends i51 {
    public static final int f47818a = 0;

    static {
        i51.setup(new i51());
    }

    @Override
    public final void bindView(View view, j51 j51Var, boolean z4, x51 x51Var, i61 i61Var) {
        int i10;
        int i11;
        int i12;
        float f10;
        Object obj = j51Var.G;
        int i13 = 0;
        if (obj instanceof TL_payments.connectedBotStarRef) {
            a3 a3Var = (a3) view;
            TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj;
            boolean z10 = j51Var.f28020r;
            View view2 = a3Var.f47356e;
            ImageView imageView = a3Var.f47357f;
            TLRPC.User user = MessagesController.getInstance(a3Var.f47353a).getUser(Long.valueOf(connectedbotstarref.bot_id));
            z8 z8Var = new z8((g6) null);
            z8Var.r(user);
            a3Var.f47355c.e(user, z8Var);
            TextView textView = a3Var.h;
            textView.setText(Emoji.replaceEmoji(UserObject.getUserName(user), textView.getPaint().getFontMetricsInt(), false));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (connectedbotstarref.commission_permille > 0) {
                spannableStringBuilder.append((CharSequence) " d");
                z00 z00Var = new z00();
                z00Var.f43756f = k6.w0(null, k6.uj, false);
                z00Var.f43757n = j.G0(connectedbotstarref.commission_permille);
                if (z00Var.f43754c != null) {
                    z00Var.f43754c = null;
                    z00Var.a();
                }
                spannableStringBuilder.setSpan(z00Var, 1, 2, 33);
            }
            int i14 = connectedbotstarref.duration_months;
            if (i14 == 0) {
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.Lifetime));
            } else if (i14 >= 12 && i14 % 12 == 0) {
                spannableStringBuilder.append((CharSequence) LocaleController.formatPluralString("Years", i14 / 12, new Object[0]));
            } else {
                spannableStringBuilder.append((CharSequence) LocaleController.formatPluralString("Months", i14, new Object[0]));
            }
            a3Var.f47358n.setText(spannableStringBuilder);
            ImageView imageView2 = a3Var.f47359r;
            if (z10) {
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
                i11 = k6.wj;
            } else {
                i11 = k6.uj;
            }
            view2.setBackground(k6.K(dp, k6.v0(i11, a3Var.f47354b)));
            if (connectedbotstarref.revoked) {
                i12 = R.drawable.msg_link_2;
            } else {
                i12 = R.drawable.msg_limit_links;
            }
            imageView.setImageResource(i12);
            float f11 = 0.6f;
            if (connectedbotstarref.revoked) {
                f10 = 0.8f;
            } else {
                f10 = 0.6f;
            }
            imageView.setScaleX(f10);
            if (connectedbotstarref.revoked) {
                f11 = 0.8f;
            }
            imageView.setScaleY(f11);
            a3Var.f47360s = z4;
            a3Var.setWillNotDraw(!z4);
        } else if (obj instanceof TL_payments.starRefProgram) {
            a3 a3Var2 = (a3) view;
            TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) obj;
            boolean z11 = j51Var.f28020r;
            TLRPC.User user2 = MessagesController.getInstance(a3Var2.f47353a).getUser(Long.valueOf(starrefprogram.bot_id));
            z8 z8Var2 = new z8((g6) null);
            z8Var2.r(user2);
            a3Var2.f47355c.e(user2, z8Var2);
            a3Var2.h.setText(UserObject.getUserName(user2));
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            if (starrefprogram.commission_permille > 0) {
                spannableStringBuilder2.append((CharSequence) " d");
                z00 z00Var2 = new z00();
                z00Var2.f43756f = k6.w0(null, k6.uj, false);
                z00Var2.f43757n = j.G0(starrefprogram.commission_permille);
                if (z00Var2.f43754c != null) {
                    z00Var2.f43754c = null;
                    z00Var2.a();
                }
                spannableStringBuilder2.setSpan(z00Var2, 1, 2, 33);
            }
            int i15 = starrefprogram.duration_months;
            if (i15 == 0) {
                spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.Lifetime));
            } else if (i15 >= 12 && i15 % 12 == 0) {
                spannableStringBuilder2.append((CharSequence) LocaleController.formatPluralString("Years", i15 / 12, new Object[0]));
            } else {
                spannableStringBuilder2.append((CharSequence) LocaleController.formatPluralString("Months", i15, new Object[0]));
            }
            a3Var2.f47358n.setText(spannableStringBuilder2);
            ImageView imageView3 = a3Var2.f47359r;
            if (!z11) {
                i13 = 8;
            }
            imageView3.setVisibility(i13);
            a3Var2.d.setVisibility(8);
            a3Var2.f47357f.setVisibility(8);
            a3Var2.f47356e.setVisibility(8);
            a3Var2.f47360s = z4;
            a3Var2.setWillNotDraw(!z4);
        }
    }

    @Override
    public final View createView(Context context, tl0 tl0Var, int i10, int i11, g6 g6Var) {
        return new a3(context, i10, g6Var);
    }
}
