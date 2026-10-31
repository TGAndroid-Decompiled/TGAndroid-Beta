package rh;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.b30;
import org.telegram.messenger.cd;
import org.telegram.messenger.h20;
import org.telegram.messenger.ic;
import org.telegram.messenger.vp;
import org.telegram.messenger.z20;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.z41;
import org.telegram.ui.o60;
public final class z7 extends z41 {
    public static final int f47826b = 0;

    static {
        z41.h(new z41());
    }

    @Override
    public final void b(View view, a51 a51Var, boolean z10, p51 p51Var, u51 u51Var) {
        String p5;
        boolean z11;
        float f7;
        int i10;
        org.telegram.ui.ActionBar.u5 u5Var;
        a8 a8Var = (a8) view;
        TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) a51Var.G;
        org.telegram.ui.ActionBar.u5 u5Var2 = a8Var.d;
        g9 g9Var = a8Var.f46642c;
        org.telegram.ui.ActionBar.p6 p6Var = a8Var.f46641b;
        TextView textView = a8Var.h;
        TextView textView2 = a8Var.f46643f;
        TextView textView3 = a8Var.e;
        int i11 = a8Var.f46640a;
        TextView textView4 = a8Var.f46644n;
        long o10 = org.telegram.messenger.o5.o(starsSubscription.peer);
        a8Var.f46645r = !TextUtils.isEmpty(starsSubscription.title);
        if (o10 < 0) {
            TLRPC.Chat L0 = vp.r1(i11).L0(Long.valueOf(-o10));
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
            TLRPC.User Z1 = vp.r1(i11).Z1(Long.valueOf(o10));
            org.telegram.ui.Components.r8 r8Var2 = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
            r8Var2.r(Z1);
            g9Var.e(Z1, r8Var2);
            p5 = h20.p(Z1);
            z11 = !h20.t(Z1);
        }
        long currentTime = ConnectionsManager.getInstance(i11).getCurrentTime();
        boolean z12 = z11;
        u5Var2.l(org.telegram.messenger.k6.m(p5, u5Var2.getPaint().getFontMetricsInt(), false, null, 0), false);
        if (!TextUtils.isEmpty(starsSubscription.title)) {
            textView3.setVisibility(0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (starsSubscription.photo != null) {
                o60 o60Var = new o60(14.0f, i11, textView3);
                o60Var.a(4.0f);
                o60Var.f40153f = false;
                SpannableString spannableString = new SpannableString("x");
                u5Var = u5Var2;
                spannableString.setSpan(o60Var, 0, 1, 33);
                o60Var.f40151b.q0(ic.p(b30.c(starsSubscription.photo)), "14_14", null, null, 0, 0);
                spannableStringBuilder.append((CharSequence) spannableString).append((CharSequence) " ");
            } else {
                u5Var = u5Var2;
            }
            spannableStringBuilder.append(org.telegram.messenger.k6.m(starsSubscription.title, u5Var.getPaint().getFontMetricsInt(), false, null, 0));
            textView3.setText(spannableStringBuilder);
        } else {
            textView3.setVisibility(8);
        }
        if (a8Var.f46645r) {
            f7 = 13.0f;
        } else {
            f7 = 14.0f;
        }
        textView2.setTextSize(1, f7);
        int i12 = 2131745008;
        if (!starsSubscription.canceled && !starsSubscription.bot_canceled) {
            long j10 = starsSubscription.until_date;
            if (j10 < currentTime) {
                textView2.setText(cd.a0(null, null, 2131745008, cd.u(j10, false)));
                textView.setVisibility(8);
                z20.p(textView4, org.telegram.ui.ActionBar.t6.kk, p6Var, null, 2131744990);
            } else {
                textView2.setText(cd.a0(null, null, 2131744995, cd.u(j10, false)));
                textView.setVisibility(0);
                textView.setText(h8.Z0(false, "⭐️ " + Long.toString(starsSubscription.pricing.amount), 0.8f, null));
                org.telegram.ui.ActionBar.a7.V(textView4, org.telegram.ui.ActionBar.t6.f21330z6, p6Var);
                int i13 = starsSubscription.pricing.period;
                if (i13 == 2592000) {
                    textView4.setText(cd.L0(2131745074, null));
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
            textView2.setText(cd.a0(null, null, i12, cd.u(j11, false)));
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
            textView4.setText(cd.L0(i10, null));
        }
        a8Var.f46646s = z10;
        a8Var.setWillNotDraw(!z10);
    }

    @Override
    public final View d(Context context, tk0 tk0Var, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        return new a8(i10, context, p6Var);
    }

    @Override
    public final boolean e(a51 a51Var, a51 a51Var2) {
        if (a51Var2 != null) {
            Object obj = a51Var.G;
            if (obj instanceof TL_stars.StarsSubscription) {
                Object obj2 = a51Var2.G;
                if (obj2 instanceof TL_stars.StarsSubscription) {
                    return TextUtils.equals(((TL_stars.StarsSubscription) obj).f20022id, ((TL_stars.StarsSubscription) obj2).f20022id);
                }
                return false;
            }
            return false;
        }
        return false;
    }
}
