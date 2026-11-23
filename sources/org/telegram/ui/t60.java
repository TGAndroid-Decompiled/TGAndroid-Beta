package org.telegram.ui;

import android.widget.ImageView;
import java.util.Arrays;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_wallet;
public final class t60 implements org.telegram.messenger.w10 {
    public final int f52265a;
    public final Object f52266b;
    public final Object f52267c;
    public final Object d;
    public final Object f52268e;
    public final Object f52269f;
    public final Object f52270g;

    public t60(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i7) {
        this.f52265a = i7;
        this.f52266b = obj;
        this.f52267c = obj2;
        this.f52268e = obj3;
        this.f52270g = obj4;
        this.f52269f = obj5;
        this.d = obj6;
    }

    @Override
    public final void a(Object obj) {
        wv wvVar;
        int i7 = this.f52265a;
        boolean z10 = true;
        boolean z11 = false;
        Object obj2 = this.d;
        Object obj3 = this.f52269f;
        Object obj4 = this.f52270g;
        Object obj5 = this.f52268e;
        Object obj6 = this.f52267c;
        Object obj7 = this.f52266b;
        switch (i7) {
            case 0:
                LaunchActivity launchActivity = (LaunchActivity) obj7;
                vf.b bVar = (vf.b) obj6;
                Long l10 = (Long) obj5;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj4;
                org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) obj3;
                Runnable runnable = (Runnable) obj2;
                org.telegram.messenger.g3 g3Var = (org.telegram.messenger.g3) obj;
                String str = LaunchActivity.C1;
                if (bVar != null) {
                    bVar.b();
                }
                org.telegram.ui.ActionBar.g2 Q = LaunchActivity.Q();
                if (Q instanceof le0) {
                    Q = ((le0) Q).c0();
                }
                org.telegram.ui.ActionBar.g2 g2Var = Q;
                if (g2Var != null) {
                    org.telegram.ui.ActionBar.i6 resourceProvider = g2Var.getResourceProvider();
                    if (g2Var.getLastStoryViewer() != null && g2Var.getLastStoryViewer().K0) {
                        resourceProvider = g2Var.getLastStoryViewer().E;
                    }
                    ug.k0 k0Var = new ug.k0(19, launchActivity.P, launchActivity, g2Var, resourceProvider);
                    k0Var.B1(g3Var);
                    if (!(g2Var instanceof bn) ? !(!(g2Var instanceof bx) || (wvVar = ((bx) g2Var).H3) == null || wvVar.getCurrentFragmetDialogId() != l10.longValue()) : ((bn) g2Var).a() == l10.longValue()) {
                        z11 = true;
                    }
                    k0Var.A1(tL_premium_boostsStatus, z11);
                    k0Var.C1(l10.longValue());
                    k0Var.f58850c2 = r1Var;
                    g2Var.showDialog(k0Var);
                    if (runnable != null) {
                        try {
                            runnable.run();
                            return;
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 1:
                LaunchActivity launchActivity2 = (LaunchActivity) obj7;
                vf.b bVar2 = (vf.b) obj6;
                Runnable runnable2 = (Runnable) obj2;
                org.telegram.messenger.h3 h3Var = (org.telegram.messenger.h3) obj4;
                Long l11 = (Long) obj5;
                org.telegram.ui.Cells.r1 r1Var2 = (org.telegram.ui.Cells.r1) obj3;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = (TL_stories.TL_premium_boostsStatus) obj;
                String str2 = LaunchActivity.C1;
                if (tL_premium_boostsStatus2 == null) {
                    if (bVar2 != null) {
                        bVar2.b();
                    }
                    if (runnable2 != null) {
                        runnable2.run();
                        return;
                    }
                    return;
                }
                h3Var.b(l11.longValue(), tL_premium_boostsStatus2, new t60(launchActivity2, bVar2, l11, tL_premium_boostsStatus2, r1Var2, runnable2, 0));
                return;
            case 2:
                TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr = (TL_wallet.inputTonConnectOauthSession[]) obj5;
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) obj4;
                org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) obj3;
                bg.m0 m0Var = (bg.m0) obj2;
                TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession = (TL_wallet.inputTonConnectOauthSession) obj;
                ((org.telegram.ui.ActionBar.w2[]) obj7)[0] = null;
                ei0.f47562a = null;
                if (((boolean[]) obj6)[0]) {
                    Arrays.fill(inputtonconnectoauthsession.challenge_answer, (byte) 0);
                    return;
                }
                inputtonconnectoauthsessionArr[0] = inputtonconnectoauthsession;
                if (!tL_urlAuthResultRequest.request_write_access && !tL_urlAuthResultRequest.request_phone_number) {
                    m0Var.run();
                    return;
                }
                ei0.f47562a = w2Var;
                w2Var.show();
                return;
            case 3:
                hi.e eVar = (hi.e) obj6;
                org.telegram.ui.Wallet.e3 e3Var = (org.telegram.ui.Wallet.e3) obj5;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) obj4;
                org.telegram.ui.Wallet.p pVar = (org.telegram.ui.Wallet.p) obj3;
                org.telegram.ui.Wallet.i2 i2Var = (org.telegram.ui.Wallet.i2) obj2;
                String str3 = (String) obj;
                ((hi.e) obj7).setLoading(false);
                eVar.setLoading(false);
                if (str3 == null) {
                    e3Var.dismiss();
                    return;
                }
                org.telegram.ui.Components.kc.d0(str3, e3Var.F, i6Var);
                pVar.run();
                if (i2Var.f44472n || i2Var.f44473o) {
                    z10 = false;
                }
                eVar.setEnabled(z10);
                return;
            default:
                org.telegram.ui.Wallet.f3 f3Var = (org.telegram.ui.Wallet.f3) obj4;
                org.telegram.ui.ActionBar.i6 i6Var2 = (org.telegram.ui.ActionBar.i6) obj3;
                jg.w0 w0Var = (jg.w0) obj2;
                String str4 = (String) obj;
                ((hi.e) obj7).setLoading(false);
                ((hi.e) obj6).setEnabled(true);
                ((ImageView) obj5).setEnabled(true);
                if (str4 == null) {
                    f3Var.dismiss();
                    return;
                }
                org.telegram.ui.Components.kc.d0(str4, f3Var.F, i6Var2);
                w0Var.run();
                return;
        }
    }

    public t60(LaunchActivity launchActivity, vf.b bVar, Runnable runnable, org.telegram.messenger.h3 h3Var, Long l10, org.telegram.ui.Cells.r1 r1Var) {
        this.f52265a = 1;
        this.f52266b = launchActivity;
        this.f52267c = bVar;
        this.d = runnable;
        this.f52270g = h3Var;
        this.f52268e = l10;
        this.f52269f = r1Var;
    }
}
