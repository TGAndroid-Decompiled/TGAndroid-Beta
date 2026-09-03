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
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.z8;
import org.telegram.ui.a10;
public final class z2 extends h51 {
    public static final int f43947a = 0;

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
            a3 a3Var = (a3) view;
            TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj;
            boolean z10 = i51Var.f25591r;
            View view2 = a3Var.e;
            ImageView imageView = a3Var.f43526f;
            TLRPC.User user = MessagesController.getInstance(a3Var.f43523a).getUser(Long.valueOf(connectedbotstarref.bot_id));
            z8 z8Var = new z8((f6) null);
            z8Var.r(user);
            a3Var.f43525c.e(user, z8Var);
            TextView textView = a3Var.h;
            textView.setText(Emoji.replaceEmoji(UserObject.getUserName(user), textView.getPaint().getFontMetricsInt(), false));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (connectedbotstarref.commission_permille > 0) {
                spannableStringBuilder.append((CharSequence) " d");
                a10 a10Var = new a10();
                a10Var.f32416f = j6.w0(null, j6.uj, false);
                a10Var.f32417n = j.G0(connectedbotstarref.commission_permille);
                if (a10Var.f32415c != null) {
                    a10Var.f32415c = null;
                    a10Var.a();
                }
                spannableStringBuilder.setSpan(a10Var, 1, 2, 33);
            }
            int i14 = connectedbotstarref.duration_months;
            if (i14 == 0) {
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.Lifetime));
            } else if (i14 >= 12 && i14 % 12 == 0) {
                spannableStringBuilder.append((CharSequence) LocaleController.formatPluralString("Years", i14 / 12, new Object[0]));
            } else {
                spannableStringBuilder.append((CharSequence) LocaleController.formatPluralString("Months", i14, new Object[0]));
            }
            a3Var.f43527n.setText(spannableStringBuilder);
            ImageView imageView2 = a3Var.f43528r;
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
                i11 = j6.wj;
            } else {
                i11 = j6.uj;
            }
            view2.setBackground(j6.K(dp, j6.v0(i11, a3Var.f43524b)));
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
            a3Var.f43529s = z4;
            a3Var.setWillNotDraw(!z4);
        } else if (obj instanceof TL_payments.starRefProgram) {
            a3 a3Var2 = (a3) view;
            TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) obj;
            boolean z11 = i51Var.f25591r;
            TLRPC.User user2 = MessagesController.getInstance(a3Var2.f43523a).getUser(Long.valueOf(starrefprogram.bot_id));
            z8 z8Var2 = new z8((f6) null);
            z8Var2.r(user2);
            a3Var2.f43525c.e(user2, z8Var2);
            a3Var2.h.setText(UserObject.getUserName(user2));
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            if (starrefprogram.commission_permille > 0) {
                spannableStringBuilder2.append((CharSequence) " d");
                a10 a10Var2 = new a10();
                a10Var2.f32416f = j6.w0(null, j6.uj, false);
                a10Var2.f32417n = j.G0(starrefprogram.commission_permille);
                if (a10Var2.f32415c != null) {
                    a10Var2.f32415c = null;
                    a10Var2.a();
                }
                spannableStringBuilder2.setSpan(a10Var2, 1, 2, 33);
            }
            int i15 = starrefprogram.duration_months;
            if (i15 == 0) {
                spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.Lifetime));
            } else if (i15 >= 12 && i15 % 12 == 0) {
                spannableStringBuilder2.append((CharSequence) LocaleController.formatPluralString("Years", i15 / 12, new Object[0]));
            } else {
                spannableStringBuilder2.append((CharSequence) LocaleController.formatPluralString("Months", i15, new Object[0]));
            }
            a3Var2.f43527n.setText(spannableStringBuilder2);
            ImageView imageView3 = a3Var2.f43528r;
            if (!z11) {
                i13 = 8;
            }
            imageView3.setVisibility(i13);
            a3Var2.d.setVisibility(8);
            a3Var2.f43526f.setVisibility(8);
            a3Var2.e.setVisibility(8);
            a3Var2.f43529s = z4;
            a3Var2.setWillNotDraw(!z4);
        }
    }

    @Override
    public final View createView(Context context, rl0 rl0Var, int i10, int i11, f6 f6Var) {
        return new a3(context, i10, f6Var);
    }
}
