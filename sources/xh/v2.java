package xh;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.dd;
import org.telegram.messenger.i20;
import org.telegram.messenger.k6;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.w6;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.r8;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.Components.v51;
import org.telegram.ui.f00;
public final class v2 extends a51 {
    public static final int f54104b = 0;

    static {
        a51.h(new a51());
    }

    @Override
    public final void b(View view, b51 b51Var, boolean z10, q51 q51Var, v51 v51Var) {
        int i10;
        int i11;
        int i12;
        int i13;
        float f7;
        Object obj = b51Var.G;
        int i14 = 0;
        if (obj instanceof TL_payments.connectedBotStarRef) {
            w2 w2Var = (w2) view;
            TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj;
            boolean z11 = b51Var.f24649r;
            p6 p6Var = w2Var.f54118b;
            View view2 = w2Var.e;
            ImageView imageView = w2Var.f54120f;
            TLRPC.User Z1 = wp.r1(w2Var.f54117a).Z1(Long.valueOf(connectedbotstarref.bot_id));
            r8 r8Var = new r8((p6) null);
            r8Var.r(Z1);
            w2Var.f54119c.e(Z1, r8Var);
            TextView textView = w2Var.h;
            textView.setText(k6.m(i20.p(Z1), textView.getPaint().getFontMetricsInt(), false, null, 0));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (connectedbotstarref.commission_permille > 0) {
                spannableStringBuilder.append((CharSequence) " d");
                f00 f00Var = new f00();
                int i15 = t6.ik;
                f00Var.f36947f = t6.w0(i15, null);
                f00Var.f36949r = i15;
                f00Var.f36950s = null;
                f00Var.f36948n = true;
                f00Var.f36951w = i.J0(connectedbotstarref.commission_permille);
                if (f00Var.f36946c != null) {
                    f00Var.f36946c = null;
                    f00Var.a();
                }
                spannableStringBuilder.setSpan(f00Var, 1, 2, 33);
            }
            int i16 = connectedbotstarref.duration_months;
            if (i16 == 0) {
                spannableStringBuilder.append((CharSequence) dd.L0(2131748996, null));
            } else if (i16 >= 12 && i16 % 12 == 0) {
                spannableStringBuilder.append((CharSequence) dd.G(i16 / 12, "Years", new Object[0]));
            } else {
                spannableStringBuilder.append((CharSequence) dd.G(i16, "Months", new Object[0]));
            }
            w2Var.f54121n.setText(spannableStringBuilder);
            ImageView imageView2 = w2Var.f54122r;
            if (z11) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            imageView2.setVisibility(i10);
            w2Var.d.setVisibility(0);
            imageView.setVisibility(0);
            view2.setVisibility(0);
            int L = org.telegram.messenger.i0.L(9.665f);
            if (connectedbotstarref.revoked) {
                i11 = t6.kk;
            } else {
                i11 = t6.ik;
            }
            ShapeDrawable L2 = t6.L(L, t6.w0(i11, p6Var));
            if (connectedbotstarref.revoked) {
                i12 = t6.kk;
            } else {
                i12 = t6.ik;
            }
            w6 N = a7.N(i12);
            view2.setBackground(L2);
            a7.k(view2, L2, N, null, p6Var);
            if (connectedbotstarref.revoked) {
                i13 = 2131232205;
            } else {
                i13 = 2131232199;
            }
            imageView.setImageResource(i13);
            float f10 = 0.6f;
            if (connectedbotstarref.revoked) {
                f7 = 0.8f;
            } else {
                f7 = 0.6f;
            }
            imageView.setScaleX(f7);
            if (connectedbotstarref.revoked) {
                f10 = 0.8f;
            }
            imageView.setScaleY(f10);
            w2Var.f54123s = z10;
            w2Var.setWillNotDraw(!z10);
        } else if (obj instanceof TL_payments.starRefProgram) {
            w2 w2Var2 = (w2) view;
            TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) obj;
            boolean z12 = b51Var.f24649r;
            TLRPC.User Z12 = wp.r1(w2Var2.f54117a).Z1(Long.valueOf(starrefprogram.bot_id));
            r8 r8Var2 = new r8((p6) null);
            r8Var2.r(Z12);
            w2Var2.f54119c.e(Z12, r8Var2);
            w2Var2.h.setText(i20.p(Z12));
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            if (starrefprogram.commission_permille > 0) {
                spannableStringBuilder2.append((CharSequence) " d");
                f00 f00Var2 = new f00();
                int i17 = t6.ik;
                f00Var2.f36947f = t6.w0(i17, null);
                f00Var2.f36949r = i17;
                f00Var2.f36950s = null;
                f00Var2.f36948n = true;
                f00Var2.f36951w = i.J0(starrefprogram.commission_permille);
                if (f00Var2.f36946c != null) {
                    f00Var2.f36946c = null;
                    f00Var2.a();
                }
                spannableStringBuilder2.setSpan(f00Var2, 1, 2, 33);
            }
            int i18 = starrefprogram.duration_months;
            if (i18 == 0) {
                spannableStringBuilder2.append((CharSequence) dd.L0(2131748996, null));
            } else if (i18 >= 12 && i18 % 12 == 0) {
                spannableStringBuilder2.append((CharSequence) dd.G(i18 / 12, "Years", new Object[0]));
            } else {
                spannableStringBuilder2.append((CharSequence) dd.G(i18, "Months", new Object[0]));
            }
            w2Var2.f54121n.setText(spannableStringBuilder2);
            ImageView imageView3 = w2Var2.f54122r;
            if (!z12) {
                i14 = 8;
            }
            imageView3.setVisibility(i14);
            w2Var2.d.setVisibility(8);
            w2Var2.f54120f.setVisibility(8);
            w2Var2.e.setVisibility(8);
            w2Var2.f54123s = z10;
            w2Var2.setWillNotDraw(!z10);
        }
    }

    @Override
    public final View d(Context context, uk0 uk0Var, int i10, p6 p6Var) {
        return new w2(i10, context, p6Var);
    }
}
