package xh;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.cd;
import org.telegram.messenger.h20;
import org.telegram.messenger.m5;
import org.telegram.messenger.ui;
import org.telegram.messenger.vp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.fc0;
import org.telegram.ui.Components.o5;
import org.telegram.ui.Components.wb;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ay;
import org.telegram.ui.mk;
import org.telegram.ui.sm0;
import org.telegram.ui.un;
import rh.e6;
public final class h2 implements org.telegram.ui.web.d0 {
    public boolean f53781a;
    public final Context f53782b;
    public final p6 f53783c;
    public final m2 d;

    public h2(m2 m2Var, Context context, p6 p6Var) {
        this.d = m2Var;
        this.f53782b = context;
        this.f53783c = p6Var;
    }

    @Override
    public final s0 A() {
        m2 m2Var = this.d;
        if (m2Var.C0 == null) {
            s0 s0Var = new s0(this.f53782b);
            m2Var.C0 = s0Var;
            s0Var.f54023k = m2Var.D.getWebView();
        }
        return m2Var.C0;
    }

    @Override
    public final void a() {
        m2 m2Var = this.d;
        TLRPC.User Z1 = vp.r1(m2Var.H).Z1(Long.valueOf(m2Var.I));
        m4.c cVar = new m4.c((char) 0, 15);
        cVar.f12705b = new f2(this, 0);
        wb V = new cc(m2Var.f53894q0, m2Var.F).V(Arrays.asList(Z1), org.telegram.messenger.i0.W2(cd.a0(null, null, 2131753087, h20.p(Z1))), null, cVar);
        V.f32135j = 5000;
        V.k(true);
    }

    @Override
    public final void b() {
        this.d.o(true);
    }

    @Override
    public final void c() {
        m2 m2Var = this.d;
        if (m2Var.E0 != null) {
            org.telegram.ui.ActionBar.i3 O = LaunchActivity.I1.O();
            if (O != null) {
                O.e(m2Var.E0);
            }
            m2Var.E0 = null;
        }
    }

    @Override
    public final void d(TLRPC.Document document) {
        m2 m2Var = this.d;
        new cc(m2Var.f53894q0, m2Var.F).q(document, cd.L0(2131753075, null)).k(true);
    }

    @Override
    public final void e(String str) {
        m2 m2Var = this.d;
        if (!m2Var.q() && m2Var.K == 0 && !this.f53781a) {
            this.f53781a = true;
            TLRPC.TL_messages_sendWebViewData tL_messages_sendWebViewData = new TLRPC.TL_messages_sendWebViewData();
            tL_messages_sendWebViewData.bot = vp.r1(m2Var.H).n1(m2Var.I);
            tL_messages_sendWebViewData.random_id = Utilities.f14519b.nextLong();
            tL_messages_sendWebViewData.button_text = m2Var.N;
            tL_messages_sendWebViewData.data = str;
            ConnectionsManager.getInstance(m2Var.H).sendRequest(tL_messages_sendWebViewData, new g2(this, 0));
        }
    }

    @Override
    public final void f(ArrayList arrayList) {
        String G;
        int size = arrayList.size();
        m2 m2Var = this.d;
        if (size == 1) {
            G = cd.a0(null, null, 2131752973, vp.r1(m2Var.H).A1(((Long) arrayList.get(0)).longValue(), false));
        } else {
            G = cd.G(arrayList.size(), "BotSharedToMany", new Object[0]);
        }
        new cc(m2Var.f53894q0, m2Var.F).Q(2131624027, 36, org.telegram.messenger.i0.W2(G)).k(true);
    }

    @Override
    public final String g(boolean z10, boolean z11) {
        m2 m2Var = this.d;
        boolean z12 = m2Var.f53881e0;
        if (z12 == z10) {
            if (!z12) {
                return null;
            }
            return "ALREADY_FULLSCREEN";
        }
        m2Var.C(z10, true, z11);
        return null;
    }

    @Override
    public final boolean h() {
        m2 m2Var = this.d;
        if (!m2Var.q()) {
            if (ui.b0(m2Var.H).j(m2Var.I) || vp.r1(m2Var.H).X6.contains(Long.valueOf(m2Var.I))) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void i(boolean z10) {
        int i10;
        m2 m2Var = this.d;
        ImageView backButton = m2Var.X.getBackButton();
        m2Var.f53905x0 = z10;
        if (z10) {
            i10 = 2131231241;
        } else {
            i10 = 2131231270;
        }
        org.telegram.messenger.i0.Q3(backButton, i10);
        org.telegram.messenger.l2 l2Var = m2Var.f53891n0;
        if (l2Var != null) {
            l2Var.K = z10;
            l2Var.invalidate();
        }
    }

    @Override
    public final void j() {
        z();
    }

    @Override
    public final void k(boolean z10) {
        this.d.f53898s0 = z10;
    }

    @Override
    public final void l(boolean z10, boolean z11, String str, long j10, int i10, int i11, boolean z12, boolean z13, String str2) {
        m2 m2Var = this.d;
        i2 i2Var = m2Var.m0;
        ?? obj = new Object();
        obj.f53978a = z10;
        obj.f53979b = z11;
        obj.f53980c = z12;
        obj.d = z13;
        obj.e = str;
        obj.f53981f = j10;
        obj.f53982g = i10;
        obj.h = i11;
        obj.f53983i = str2;
        int totalHeight = i2Var.getTotalHeight();
        i2Var.e.d = obj;
        r.b(i2Var.f53996f[1].f53955l, obj, true);
        i2Var.invalidate();
        if (totalHeight != i2Var.getTotalHeight() && i2Var.f53998r != null) {
            if (totalHeight < i2Var.getTotalHeight()) {
                org.telegram.messenger.i0.h3(i2Var.f53998r, 200L);
            } else {
                i2Var.f53998r.run();
            }
        }
        if (m2Var.f53881e0) {
            m2Var.I();
            m2Var.L();
        }
    }

    @Override
    public final void m(int i10) {
        this.d.A(i10, true);
    }

    @Override
    public final void n(TLRPC.InputInvoice inputInvoice, String str, TLObject tLObject) {
        m2 m2Var = this.d;
        d2 d2Var = m2Var.f53904x;
        l2 l2Var = m2Var.f53882f;
        org.telegram.ui.ActionBar.k2 lastFragment = ((LaunchActivity) m2Var.f53889l0).M().getLastFragment();
        sm0 sm0Var = null;
        if (tLObject instanceof TLRPC.TL_payments_paymentFormStars) {
            org.telegram.messenger.i0.v1(l2Var);
            org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, m2Var.getContext(), null);
            x1Var.r(150L);
            e6.y(m2Var.H, false).X(null, inputInvoice, (TLRPC.TL_payments_paymentFormStars) tLObject, new org.telegram.ui.ActionBar.n1(x1Var, 3), new rh.e3(14, this, str));
            return;
        }
        if (tLObject instanceof TLRPC.PaymentForm) {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            vp.r1(m2Var.H).V3(paymentForm.users, false);
            sm0Var = new sm0(paymentForm, null, str, lastFragment);
        } else if (tLObject instanceof TLRPC.PaymentReceipt) {
            sm0Var = new sm0((TLRPC.PaymentReceipt) tLObject);
        }
        if (sm0Var != null) {
            d2Var.e(d2Var.getTopActionBarOffsetY() + (-d2Var.getOffsetY()));
            org.telegram.messenger.i0.v1(l2Var);
            fc0 fc0Var = new fc0(this.f53782b);
            fc0Var.show();
            sm0Var.Z0 = new q5.a(this, fc0Var, str, 13);
            sm0Var.Y0 = this.f53783c;
            fc0Var.c(sm0Var);
        }
    }

    @Override
    public final void p(boolean z10) {
        this.d.t(z10);
    }

    @Override
    public final void q(boolean z10, boolean z11, String str, long j10, int i10, int i11, boolean z12, boolean z13) {
        m2 m2Var = this.d;
        i2 i2Var = m2Var.m0;
        ?? obj = new Object();
        obj.f53978a = z10;
        obj.f53979b = z11;
        obj.f53980c = z12;
        obj.d = z13;
        obj.e = str;
        obj.f53981f = j10;
        obj.f53982g = i10;
        obj.h = i11;
        obj.f53983i = null;
        int totalHeight = i2Var.getTotalHeight();
        i2Var.e.f282c = obj;
        p[] pVarArr = i2Var.f53996f;
        pVarArr[0].f53955l.a();
        if (obj.f53981f != 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "* ");
            spannableStringBuilder.append((CharSequence) obj.e);
            spannableStringBuilder.setSpan(new o5(obj.f53981f, 1.4f, pVarArr[0].f53955l.f25693a.getFontMetricsInt()), 0, 1, 33);
            pVarArr[0].f53955l.t(spannableStringBuilder, true, true);
        } else {
            pVarArr[0].f53955l.t(obj.e, true, true);
        }
        i2Var.invalidate();
        if (totalHeight != i2Var.getTotalHeight() && i2Var.f53998r != null) {
            if (totalHeight < i2Var.getTotalHeight()) {
                org.telegram.messenger.i0.h3(i2Var.f53998r, 200L);
            } else {
                i2Var.f53998r.run();
            }
        }
        if (m2Var.f53881e0) {
            m2Var.I();
            m2Var.L();
        }
    }

    @Override
    public final void r(int i10) {
        this.d.D(i10, true);
    }

    @Override
    public final void s() {
        d2 d2Var = this.d.f53904x;
        if (d2Var.f53788c) {
            return;
        }
        d2Var.e(d2Var.getTopActionBarOffsetY() + (-d2Var.getOffsetY()));
    }

    @Override
    public final void t(boolean z10) {
        this.d.f53879c0 = z10;
    }

    @Override
    public final void u(int i10, int i11, boolean z10) {
        m2 m2Var = this.d;
        m2Var.f53901v0 = i10;
        m2Var.y(i11, z10, true);
    }

    @Override
    public final void v(TLRPC.User user, String str, ArrayList arrayList) {
        boolean isEmpty = arrayList.isEmpty();
        m2 m2Var = this.d;
        if (isEmpty) {
            Activity activity = m2Var.f53889l0;
            if (activity instanceof LaunchActivity) {
                org.telegram.ui.ActionBar.k2 lastFragment = ((LaunchActivity) activity).M().getLastFragment();
                if (lastFragment instanceof un) {
                    mk mkVar = ((un) lastFragment).Z;
                    mkVar.setFieldText("@" + h20.n(user) + " " + str);
                    m2Var.o(false);
                    return;
                }
                return;
            }
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("dialogsType", 14);
        bundle.putBoolean("onlySelect", true);
        bundle.putBoolean("allowGroups", arrayList.contains("groups"));
        bundle.putBoolean("allowMegagroups", arrayList.contains("groups"));
        bundle.putBoolean("allowLegacyGroups", arrayList.contains("groups"));
        bundle.putBoolean("allowUsers", arrayList.contains("users"));
        bundle.putBoolean("allowChannels", arrayList.contains("channels"));
        bundle.putBoolean("allowBots", arrayList.contains("bots"));
        ay ayVar = new ay(bundle);
        org.telegram.messenger.i0.v1(m2Var.f53882f);
        fc0 fc0Var = new fc0(this.f53782b);
        ayVar.C2 = new a1.d(this, user, str, fc0Var, 22);
        fc0Var.show();
        fc0Var.c(ayVar);
    }

    @Override
    public final void w(boolean z10) {
        m2 m2Var = this.d;
        p6 p6Var = m2Var.F;
        FrameLayout frameLayout = m2Var.f53894q0;
        TLRPC.User Z1 = vp.r1(m2Var.H).Z1(Long.valueOf(m2Var.I));
        if (z10) {
            m4.c cVar = new m4.c((char) 0, 15);
            cd.L0(2131743910, null);
            cVar.f12705b = new f2(this, 1);
            wb V = new cc(frameLayout, p6Var).V(Arrays.asList(Z1), org.telegram.messenger.i0.W2(cd.a0(null, null, 2131753054, h20.p(Z1))), null, cVar);
            V.f32135j = 5000;
            V.k(true);
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        m5.p(null, null, 2131753056, new Object[]{h20.p(Z1)}, spannableStringBuilder);
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.i0.G2(org.telegram.messenger.i0.k2(cd.L0(2131753055, null), new f2(this, 2)), true));
        wb P = new cc(frameLayout, p6Var).P(2131624011, spannableStringBuilder);
        P.f32135j = 5000;
        P.k(true);
    }

    @Override
    public final void x(int i10) {
        r(i10);
    }

    @Override
    public final void y(boolean z10) {
        d2 d2Var = this.d.f53904x;
        if (d2Var != null) {
            d2Var.setAllowSwipes(z10);
        }
    }

    @Override
    public final void z() {
        this.d.o(false);
    }

    @Override
    public final void o(int i10, boolean z10) {
    }
}
