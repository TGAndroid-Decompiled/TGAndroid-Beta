package zh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.i0;
import org.telegram.messenger.o5;
import org.telegram.messenger.vp;
import org.telegram.messenger.w3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.r8;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.z41;
import s4.o0;
public final class g extends z41 {
    public static final int f55777b = 0;

    static {
        z41.h(new z41());
    }

    @Override
    public final void b(View view, a51 a51Var, boolean z10, p51 p51Var, u51 u51Var) {
        int i10;
        String o02;
        h hVar = (h) view;
        f fVar = (f) a51Var.G;
        TLRPC.User user = fVar.f55775b;
        long j10 = fVar.f55774a;
        boolean z11 = fVar.f55776c;
        boolean z12 = !a51Var.f24290j;
        g9 g9Var = hVar.f55780c;
        TextView textView = hVar.f55782n;
        TextView textView2 = hVar.d;
        hVar.E = (e) a51Var.H;
        hVar.F = j10;
        hVar.G = user.f19942id;
        int i11 = hVar.f55779b;
        TLRPC.Chat L0 = vp.r1(i11).L0(Long.valueOf(-j10));
        TLRPC.User Z1 = vp.r1(i11).Z1(Long.valueOf(j10));
        hVar.f55781f.setText(o5.l(d20.f15147s0, j10));
        TextView textView3 = hVar.h;
        if (Z1 != null) {
            i10 = 2131751898;
        } else if (w3.V(L0)) {
            i10 = 2131751897;
        } else {
            i10 = 2131751896;
        }
        textView3.setText(i0.P2(cd.a0(null, null, i10, o5.u(user)), t6.Wl, null, new r5.a(19), false));
        if (Z1 != null) {
            textView2.setVisibility(8);
        } else if (L0 != null && L0.participants_count > 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("* ");
            spannableStringBuilder.setSpan(hVar.f55784s, 0, 1, 33);
            long j11 = L0.participants_count;
            if (j11 < 1000000) {
                o02 = cd.E(j11, ',');
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
        hVar.f55787y = z12;
        if (Z1 != null) {
            g9Var.e(Z1, new r8(0, Z1));
        } else {
            g9Var.e(L0, new r8(L0));
        }
        hVar.e.e(user, new r8(0, user));
    }

    @Override
    public final View d(Context context, tk0 tk0Var, int i10, p6 p6Var) {
        h hVar = new h(i10, context, p6Var);
        hVar.setLayoutParams(new o0(-1, -2));
        hVar.setClickable(false);
        return hVar;
    }

    @Override
    public final boolean e(a51 a51Var, a51 a51Var2) {
        f fVar = (f) a51Var.G;
        f fVar2 = (f) a51Var2.G;
        if (fVar.f55774a == fVar2.f55774a && o5.d(fVar.f55775b) == o5.d(fVar2.f55775b)) {
            return true;
        }
        return false;
    }
}
