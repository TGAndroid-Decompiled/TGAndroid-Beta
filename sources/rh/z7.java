package rh;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.a30;
import org.telegram.messenger.c30;
import org.telegram.messenger.dd;
import org.telegram.messenger.i20;
import org.telegram.messenger.jc;
import org.telegram.messenger.wp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.Components.v51;
import org.telegram.ui.n60;
public final class z7 extends a51 {
    public static final int f47837b = 0;

    static {
        a51.h(new a51());
    }

    @Override
    public final void b(View view, b51 b51Var, boolean z10, q51 q51Var, v51 v51Var) {
        String p5;
        boolean z11;
        float f7;
        int i10;
        org.telegram.ui.ActionBar.u5 u5Var;
        a8 a8Var = (a8) view;
        TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) b51Var.G;
        org.telegram.ui.ActionBar.u5 u5Var2 = a8Var.d;
        g9 g9Var = a8Var.f46637c;
        org.telegram.ui.ActionBar.p6 p6Var = a8Var.f46636b;
        TextView textView = a8Var.h;
        TextView textView2 = a8Var.f46638f;
        TextView textView3 = a8Var.e;
        int i11 = a8Var.f46635a;
        TextView textView4 = a8Var.f46639n;
        long o10 = org.telegram.messenger.o5.o(starsSubscription.peer);
        a8Var.f46640r = !TextUtils.isEmpty(starsSubscription.title);
        if (o10 < 0) {
            TLRPC.Chat L0 = wp.r1(i11).L0(Long.valueOf(-o10));
            org.telegram.ui.Components.r8 r8Var = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
            r8Var.q(L0);
            g9Var.e(L0, r8Var);
            if (L0 != null) {
                p5 = L0.title;
            } else {
                p5 = null;
            }
            z11 = false;
        } else {
            TLRPC.User Z1 = wp.r1(i11).Z1(Long.valueOf(o10));
            org.telegram.ui.Components.r8 r8Var2 = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
            r8Var2.r(Z1);
            g9Var.e(Z1, r8Var2);
            p5 = i20.p(Z1);
            z11 = !i20.t(Z1);
        }
        long currentTime = ConnectionsManager.getInstance(i11).getCurrentTime();
        boolean z12 = z11;
        u5Var2.l(org.telegram.messenger.k6.m(p5, u5Var2.getPaint().getFontMetricsInt(), false, null, 0), false);
        if (!TextUtils.isEmpty(starsSubscription.title)) {
            textView3.setVisibility(0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (starsSubscription.photo != null) {
                n60 n60Var = new n60(14.0f, i11, textView3);
                n60Var.a(4.0f);
                n60Var.f39711f = false;
                SpannableString spannableString = new SpannableString("x");
                u5Var = u5Var2;
                spannableString.setSpan(n60Var, 0, 1, 33);
                n60Var.f39709b.q0(jc.p(c30.c(starsSubscription.photo)), "14_14", null, null, 0, 0);
                spannableStringBuilder.append((CharSequence) spannableString).append((CharSequence) " ");
            } else {
                u5Var = u5Var2;
            }
            spannableStringBuilder.append(org.telegram.messenger.k6.m(starsSubscription.title, u5Var.getPaint().getFontMetricsInt(), false, null, 0));
            textView3.setText(spannableStringBuilder);
        } else {
            textView3.setVisibility(8);
        }
        if (a8Var.f46640r) {
            f7 = 13.0f;
        } else {
            f7 = 14.0f;
        }
        textView2.setTextSize(1, f7);
        int i12 = 2131745008;
        if (!starsSubscription.canceled && !starsSubscription.bot_canceled) {
            long j10 = starsSubscription.until_date;
            if (j10 < currentTime) {
                textView2.setText(dd.a0(null, null, 2131745008, dd.u(j10, false)));
                textView.setVisibility(8);
                a30.p(textView4, org.telegram.ui.ActionBar.t6.kk, p6Var, null, 2131744990);
            } else {
                textView2.setText(dd.a0(null, null, 2131744995, dd.u(j10, false)));
                textView.setVisibility(0);
                textView.setText(h8.a1(false, "⭐️ " + Long.toString(starsSubscription.pricing.amount), 0.8f, null));
                org.telegram.ui.ActionBar.a7.V(textView4, org.telegram.ui.ActionBar.t6.f21331z6, p6Var);
                int i13 = starsSubscription.pricing.period;
                if (i13 == 2592000) {
                    textView4.setText(dd.L0(2131745074, null));
                } else if (i13 == 60) {
                    textView4.setText("per minute");
                } else if (i13 == 300) {
                    textView4.setText("per 5 minutes");
                }
            }
        } else {
            long j11 = starsSubscription.until_date;
            if (j11 >= currentTime) {
                i12 = 2131745002;
            }
            textView2.setText(dd.a0(null, null, i12, dd.u(j11, false)));
            textView.setVisibility(8);
            org.telegram.ui.ActionBar.a7.V(textView4, org.telegram.ui.ActionBar.t6.kk, p6Var);
            if (starsSubscription.bot_canceled) {
                if (z12) {
                    i10 = 2131744993;
                } else {
                    i10 = 2131744992;
                }
            } else {
                i10 = 2131744991;
            }
            textView4.setText(dd.L0(i10, null));
        }
        a8Var.f46641s = z10;
        a8Var.setWillNotDraw(!z10);
    }

    @Override
    public final View d(Context context, uk0 uk0Var, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        return new a8(i10, context, p6Var);
    }

    @Override
    public final boolean e(b51 b51Var, b51 b51Var2) {
        if (b51Var2 != null) {
            Object obj = b51Var.G;
            if (obj instanceof TL_stars.StarsSubscription) {
                Object obj2 = b51Var2.G;
                if (obj2 instanceof TL_stars.StarsSubscription) {
                    return TextUtils.equals(((TL_stars.StarsSubscription) obj).f20023id, ((TL_stars.StarsSubscription) obj2).f20023id);
                }
                return false;
            }
            return false;
        }
        return false;
    }
}
