package th;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.text.Layout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Locale;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.vp;
import org.telegram.messenger.z20;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.sb;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.tw;
import org.telegram.ui.ya;
public final class h4 extends org.telegram.ui.ActionBar.z2 {
    public static final int f49020n1 = 0;
    public final kg.x0 f49021i1;
    public boolean f49022j1;
    public final int f49023k1;
    public tw l1;
    public final sg.v f49024m1;

    public h4(Context context, float f7, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        super(1, context, p6Var, false);
        this.f49024m1 = new sg.v(this, 11);
        this.f49023k1 = i10;
        g4 g4Var = new g4(this, getContext(), f7);
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        int L = org.telegram.messenger.i0.L(80.0f);
        int i11 = org.telegram.ui.ActionBar.t6.Ci;
        ShapeDrawable L2 = org.telegram.ui.ActionBar.t6.L(L, org.telegram.ui.ActionBar.t6.x0(null, i11, false));
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i11);
        imageView.setBackground(L2);
        org.telegram.ui.ActionBar.a7.k(imageView, L2, N, null, null);
        imageView.setImageResource(2131231617);
        g4Var.addView(imageView, w7.b6.d(80, 80.0f, 1, 0.0f, 18.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        g4Var.addView(linearLayout, w7.b6.d(-1, -2.0f, 0, 0.0f, 116.0f, 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        sc.e.t(textView, 1, 20.0f);
        z20.p(textView, org.telegram.ui.ActionBar.t6.G6, p6Var, null, 2131744896);
        linearLayout.addView(textView, w7.b6.r(-2, -2, 1));
        org.telegram.ui.ActionBar.u5 u5Var = new org.telegram.ui.ActionBar.u5(getContext());
        u5Var.setTextSize(14);
        u5Var.setAlignment(Layout.Alignment.ALIGN_CENTER);
        u5Var.setMaxLines(100);
        org.telegram.ui.ActionBar.a7.Y(u5Var, org.telegram.ui.ActionBar.t6.f21311y6, p6Var);
        if (d20.i(this.f21583a).q()) {
            u5Var.l(cd.L0(2131744901, null), false);
        } else {
            u5Var.l(cd.L0(2131744897, null), false);
        }
        linearLayout.addView(u5Var, w7.b6.t(-2, -2, 1, 36, 10, 36, 0));
        jg.a3 a3Var = new jg.a3(this, getContext());
        ((ImageView) a3Var.f9890b).setImageResource(2131232379);
        ((TextView) a3Var.f9891c).setText(cd.L0(2131749320, null));
        ((TextView) a3Var.d).setText(cd.L0(2131749319, null));
        linearLayout.addView(a3Var, w7.b6.t(-1, -2, 0, 0, 20, 0, 0));
        jg.a3 a3Var2 = new jg.a3(this, getContext());
        ((ImageView) a3Var2.f9890b).setImageResource(2131232378);
        ((TextView) a3Var2.f9891c).setText(cd.L0(2131749327, null));
        ((TextView) a3Var2.d).setText(cd.L0(2131749326, null));
        linearLayout.addView(a3Var2, w7.b6.t(-1, -2, 0, 0, 10, 0, 0));
        kg.x0 x0Var = new kg.x0(org.telegram.messenger.i0.L(8.0f), context, p6Var, true);
        this.f49021i1 = x0Var;
        x0Var.J = false;
        x0Var.h.getDrawable().D = false;
        x0Var.setIcon(2131624312);
        w7.e6.a(x0Var);
        TLRPC.User f10 = d20.i(this.f21583a).f();
        if (!f10.premium) {
            x0Var.setIcon(2131624312);
            x0Var.b(cd.L0(2131743876, null), new rh.s(this, 13), false);
        } else {
            J0(false);
        }
        linearLayout.addView(x0Var, w7.b6.t(-1, 48, 80, 14, 24, 14, 16));
        this.N = g4Var;
        x0Var.setOnClickListener(new ya(this, f10, i10, p6Var, 7));
    }

    public static void I0() {
        cc X;
        org.telegram.ui.ActionBar.k2 Q = LaunchActivity.Q();
        if (Q.getLastStoryViewer() != null) {
            X = new cc(Q.getLastStoryViewer().f49330s, Q.getLastStoryViewer().D);
        } else {
            X = cc.X();
        }
        if (X != null) {
            String L0 = cd.L0(2131744899, null);
            String L02 = cd.L0(2131744898, null);
            sb sbVar = new sb(X.W(), X.f25043c);
            sbVar.f30208a.setImageResource(2131232392);
            sbVar.f30209b.setText(L0);
            TextView textView = sbVar.f30210c;
            textView.setText(L02);
            textView.setSingleLine(false);
            textView.setMaxLines(5);
            X.b(sbVar, 5000).j();
        }
    }

    public final void J0(boolean z10) {
        TL_stories.TL_storiesStealthMode tL_storiesStealthMode = vp.r1(this.f21583a).O1().B;
        kg.x0 x0Var = this.f49021i1;
        if (tL_storiesStealthMode != null && ConnectionsManager.getInstance(this.f21583a).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
            this.f49022j1 = true;
            x0Var.c(cd.L0(2131744900, null), true, z10);
            org.telegram.ui.ActionBar.a7.Z(x0Var.h, org.telegram.ui.ActionBar.t6.Gi, null);
            return;
        }
        if (tL_storiesStealthMode != null) {
            int currentTime = ConnectionsManager.getInstance(this.f21583a).getCurrentTime();
            int i10 = tL_storiesStealthMode.cooldown_until_date;
            if (currentTime <= i10) {
                long currentTime2 = i10 - ConnectionsManager.getInstance(this.f21583a).getCurrentTime();
                int i11 = (int) (currentTime2 % 60);
                long j10 = currentTime2 / 60;
                StringBuilder sb2 = new StringBuilder();
                Locale locale = Locale.ENGLISH;
                sb2.append(String.format(locale, "%02d", Integer.valueOf((int) (j10 / 60))));
                sb2.append(String.format(locale, ":%02d", Integer.valueOf((int) (j10 % 60))));
                sb2.append(String.format(locale, ":%02d", Integer.valueOf(i11)));
                x0Var.c(cd.a0("AvailableIn", null, 2131753760, sb2.toString()), true, z10);
                kg.w0 w0Var = x0Var.h;
                org.telegram.ui.ActionBar.w6 h = org.telegram.ui.ActionBar.a7.h(org.telegram.ui.ActionBar.t6.Gi, 125);
                org.telegram.ui.ActionBar.a7.n(w0Var, h.f21452a, -1, 1, h.d, null);
                sg.v vVar = this.f49024m1;
                org.telegram.messenger.i0.r(vVar);
                org.telegram.messenger.i0.h3(vVar, 1000L);
                return;
            }
        }
        int i12 = this.f49023k1;
        if (i12 == 0) {
            x0Var.c(cd.L0(2131751147, null), true, z10);
        } else if (i12 == 1) {
            x0Var.c(cd.L0(2131751146, null), true, z10);
        }
        org.telegram.ui.ActionBar.a7.Z(x0Var.h, org.telegram.ui.ActionBar.t6.Gi, null);
    }
}
