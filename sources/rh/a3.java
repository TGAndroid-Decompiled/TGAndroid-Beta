package rh;

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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.z8;
import org.telegram.ui.z00;
public final class a3 extends h51 {
    public static final int f43463a = 0;

    static {
        h51.setup(new h51());
    }

    @Override
    public final void bindView(View view, i51 i51Var, boolean z4, w51 w51Var, g61 g61Var) {
        int i10;
        int i11;
        int i12;
        float f10;
        Object obj = i51Var.G;
        int i13 = 0;
        if (obj instanceof TL_payments.connectedBotStarRef) {
            b3 b3Var = (b3) view;
            TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj;
            boolean z10 = i51Var.f25571r;
            View view2 = b3Var.e;
            ImageView imageView = b3Var.f43475f;
            TLRPC.User user = MessagesController.getInstance(b3Var.f43472a).getUser(Long.valueOf(connectedbotstarref.bot_id));
            z8 z8Var = new z8((f6) null);
            z8Var.r(user);
            b3Var.f43474c.e(user, z8Var);
            TextView textView = b3Var.h;
            textView.setText(Emoji.replaceEmoji(UserObject.getUserName(user), textView.getPaint().getFontMetricsInt(), false));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (connectedbotstarref.commission_permille > 0) {
                spannableStringBuilder.append((CharSequence) " d");
                z00 z00Var = new z00();
                z00Var.f40623f = j6.w0(null, j6.uj, false);
                z00Var.f40624n = k.G0(connectedbotstarref.commission_permille);
                if (z00Var.f40622c != null) {
                    z00Var.f40622c = null;
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
            b3Var.f43476n.setText(spannableStringBuilder);
            ImageView imageView2 = b3Var.f43477r;
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            imageView2.setVisibility(i10);
            b3Var.d.setVisibility(0);
            imageView.setVisibility(0);
            view2.setVisibility(0);
            int dp = AndroidUtilities.dp(9.665f);
            if (connectedbotstarref.revoked) {
                i11 = j6.wj;
            } else {
                i11 = j6.uj;
            }
            view2.setBackground(j6.K(dp, j6.v0(i11, b3Var.f43473b)));
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
            b3Var.f43478s = z4;
            b3Var.setWillNotDraw(!z4);
        } else if (obj instanceof TL_payments.starRefProgram) {
            b3 b3Var2 = (b3) view;
            TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) obj;
            boolean z11 = i51Var.f25571r;
            TLRPC.User user2 = MessagesController.getInstance(b3Var2.f43472a).getUser(Long.valueOf(starrefprogram.bot_id));
            z8 z8Var2 = new z8((f6) null);
            z8Var2.r(user2);
            b3Var2.f43474c.e(user2, z8Var2);
            b3Var2.h.setText(UserObject.getUserName(user2));
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            if (starrefprogram.commission_permille > 0) {
                spannableStringBuilder2.append((CharSequence) " d");
                z00 z00Var2 = new z00();
                z00Var2.f40623f = j6.w0(null, j6.uj, false);
                z00Var2.f40624n = k.G0(starrefprogram.commission_permille);
                if (z00Var2.f40622c != null) {
                    z00Var2.f40622c = null;
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
            b3Var2.f43476n.setText(spannableStringBuilder2);
            ImageView imageView3 = b3Var2.f43477r;
            if (!z11) {
                i13 = 8;
            }
            imageView3.setVisibility(i13);
            b3Var2.d.setVisibility(8);
            b3Var2.f43475f.setVisibility(8);
            b3Var2.e.setVisibility(8);
            b3Var2.f43478s = z4;
            b3Var2.setWillNotDraw(!z4);
        }
    }

    @Override
    public final View createView(Context context, sl0 sl0Var, int i10, int i11, f6 f6Var) {
        return new b3(context, i10, f6Var);
    }
}
