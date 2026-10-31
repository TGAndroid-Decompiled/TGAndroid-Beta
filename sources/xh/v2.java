package xh;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.cd;
import org.telegram.messenger.h20;
import org.telegram.messenger.k6;
import org.telegram.messenger.vp;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.w6;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.r8;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.z41;
import org.telegram.ui.g00;
public final class v2 extends z41 {
    public static final int f54083b = 0;

    static {
        z41.h(new z41());
    }

    @Override
    public final void b(View view, a51 a51Var, boolean z10, p51 p51Var, u51 u51Var) {
        int i10;
        int i11;
        int i12;
        int i13;
        float f7;
        Object obj = a51Var.G;
        int i14 = 0;
        if (obj instanceof TL_payments.connectedBotStarRef) {
            w2 w2Var = (w2) view;
            TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj;
            boolean z11 = a51Var.f24298r;
            p6 p6Var = w2Var.f54097b;
            View view2 = w2Var.e;
            ImageView imageView = w2Var.f54099f;
            TLRPC.User Z1 = vp.r1(w2Var.f54096a).Z1(Long.valueOf(connectedbotstarref.bot_id));
            r8 r8Var = new r8((p6) null);
            r8Var.r(Z1);
            w2Var.f54098c.e(Z1, r8Var);
            TextView textView = w2Var.h;
            textView.setText(k6.m(h20.p(Z1), textView.getPaint().getFontMetricsInt(), false, null, 0));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (connectedbotstarref.commission_permille > 0) {
                spannableStringBuilder.append((CharSequence) " d");
                g00 g00Var = new g00();
                int i15 = t6.ik;
                g00Var.f37377f = t6.w0(i15, null);
                g00Var.f37379r = i15;
                g00Var.f37380s = null;
                g00Var.f37378n = true;
                g00Var.f37381w = i.I0(connectedbotstarref.commission_permille);
                if (g00Var.f37376c != null) {
                    g00Var.f37376c = null;
                    g00Var.a();
                }
                spannableStringBuilder.setSpan(g00Var, 1, 2, 33);
            }
            int i16 = connectedbotstarref.duration_months;
            if (i16 == 0) {
                spannableStringBuilder.append((CharSequence) cd.L0(2131748996, null));
            } else if (i16 >= 12 && i16 % 12 == 0) {
                spannableStringBuilder.append((CharSequence) cd.G(i16 / 12, "Years", new Object[0]));
            } else {
                spannableStringBuilder.append((CharSequence) cd.G(i16, "Months", new Object[0]));
            }
            w2Var.f54100n.setText(spannableStringBuilder);
            ImageView imageView2 = w2Var.f54101r;
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
            w2Var.f54102s = z10;
            w2Var.setWillNotDraw(!z10);
        } else if (obj instanceof TL_payments.starRefProgram) {
            w2 w2Var2 = (w2) view;
            TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) obj;
            boolean z12 = a51Var.f24298r;
            TLRPC.User Z12 = vp.r1(w2Var2.f54096a).Z1(Long.valueOf(starrefprogram.bot_id));
            r8 r8Var2 = new r8((p6) null);
            r8Var2.r(Z12);
            w2Var2.f54098c.e(Z12, r8Var2);
            w2Var2.h.setText(h20.p(Z12));
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            if (starrefprogram.commission_permille > 0) {
                spannableStringBuilder2.append((CharSequence) " d");
                g00 g00Var2 = new g00();
                int i17 = t6.ik;
                g00Var2.f37377f = t6.w0(i17, null);
                g00Var2.f37379r = i17;
                g00Var2.f37380s = null;
                g00Var2.f37378n = true;
                g00Var2.f37381w = i.I0(starrefprogram.commission_permille);
                if (g00Var2.f37376c != null) {
                    g00Var2.f37376c = null;
                    g00Var2.a();
                }
                spannableStringBuilder2.setSpan(g00Var2, 1, 2, 33);
            }
            int i18 = starrefprogram.duration_months;
            if (i18 == 0) {
                spannableStringBuilder2.append((CharSequence) cd.L0(2131748996, null));
            } else if (i18 >= 12 && i18 % 12 == 0) {
                spannableStringBuilder2.append((CharSequence) cd.G(i18 / 12, "Years", new Object[0]));
            } else {
                spannableStringBuilder2.append((CharSequence) cd.G(i18, "Months", new Object[0]));
            }
            w2Var2.f54100n.setText(spannableStringBuilder2);
            ImageView imageView3 = w2Var2.f54101r;
            if (!z12) {
                i14 = 8;
            }
            imageView3.setVisibility(i14);
            w2Var2.d.setVisibility(8);
            w2Var2.f54099f.setVisibility(8);
            w2Var2.e.setVisibility(8);
            w2Var2.f54102s = z10;
            w2Var2.setWillNotDraw(!z10);
        }
    }

    @Override
    public final View d(Context context, tk0 tk0Var, int i10, p6 p6Var) {
        return new w2(i10, context, p6Var);
    }
}
