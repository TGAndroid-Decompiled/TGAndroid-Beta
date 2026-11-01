package zh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.dd;
import org.telegram.messenger.e20;
import org.telegram.messenger.i0;
import org.telegram.messenger.o5;
import org.telegram.messenger.w3;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.r8;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.Components.v51;
import s4.o0;
public final class g extends a51 {
    public static final int f55795b = 0;

    static {
        a51.h(new a51());
    }

    @Override
    public final void b(View view, b51 b51Var, boolean z10, q51 q51Var, v51 v51Var) {
        int i10;
        String o02;
        h hVar = (h) view;
        f fVar = (f) b51Var.G;
        TLRPC.User user = fVar.f55793b;
        long j10 = fVar.f55792a;
        boolean z11 = fVar.f55794c;
        boolean z12 = !b51Var.f24641j;
        g9 g9Var = hVar.f55798c;
        TextView textView = hVar.f55800n;
        TextView textView2 = hVar.d;
        hVar.E = (e) b51Var.H;
        hVar.F = j10;
        hVar.G = user.f19943id;
        int i11 = hVar.f55797b;
        TLRPC.Chat L0 = wp.r1(i11).L0(Long.valueOf(-j10));
        TLRPC.User Z1 = wp.r1(i11).Z1(Long.valueOf(j10));
        hVar.f55799f.setText(o5.l(e20.f15506s0, j10));
        TextView textView3 = hVar.h;
        if (Z1 != null) {
            i10 = 2131751898;
        } else if (w3.V(L0)) {
            i10 = 2131751897;
        } else {
            i10 = 2131751896;
        }
        textView3.setText(i0.P2(dd.a0(null, null, i10, o5.u(user)), t6.Wl, null, new r5.a(19), false));
        if (Z1 != null) {
            textView2.setVisibility(8);
        } else if (L0 != null && L0.participants_count > 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("* ");
            spannableStringBuilder.setSpan(hVar.f55802s, 0, 1, 33);
            long j11 = L0.participants_count;
            if (j11 < 1000000) {
                o02 = dd.E(j11, ',');
            } else {
                o02 = i0.o0((int) j11, 1000000);
            }
            spannableStringBuilder.append((CharSequence) o02);
            textView2.setText(spannableStringBuilder);
            textView2.setVisibility(0);
        } else {
            textView2.setVisibility(8);
        }
        if (z11) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
        hVar.f55805y = z12;
        if (Z1 != null) {
            g9Var.e(Z1, new r8(0, Z1));
        } else {
            g9Var.e(L0, new r8(L0));
        }
        hVar.e.e(user, new r8(0, user));
    }

    @Override
    public final View d(Context context, uk0 uk0Var, int i10, p6 p6Var) {
        h hVar = new h(i10, context, p6Var);
        hVar.setLayoutParams(new o0(-1, -2));
        hVar.setClickable(false);
        return hVar;
    }

    @Override
    public final boolean e(b51 b51Var, b51 b51Var2) {
        f fVar = (f) b51Var.G;
        f fVar2 = (f) b51Var2.G;
        if (fVar.f55792a == fVar2.f55792a && o5.d(fVar.f55793b) == o5.d(fVar2.f55793b)) {
            return true;
        }
        return false;
    }
}
