package org.telegram.ui;

import android.widget.ImageView;
import java.util.Arrays;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_wallet;
public final class u60 implements org.telegram.messenger.x10 {
    public final int f52444a;
    public final Object f52445b;
    public final Object f52446c;
    public final Object d;
    public final Object f52447e;
    public final Object f52448f;
    public final Object f52449g;

    public u60(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i7) {
        this.f52444a = i7;
        this.f52445b = obj;
        this.f52446c = obj2;
        this.f52447e = obj3;
        this.f52449g = obj4;
        this.f52448f = obj5;
        this.d = obj6;
    }

    @Override
    public final void a(Object obj) {
        xv xvVar;
        int i7 = this.f52444a;
        boolean z10 = true;
        boolean z11 = false;
        Object obj2 = this.d;
        Object obj3 = this.f52448f;
        Object obj4 = this.f52449g;
        Object obj5 = this.f52447e;
        Object obj6 = this.f52446c;
        Object obj7 = this.f52445b;
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
                org.telegram.ui.ActionBar.h2 Q = LaunchActivity.Q();
                if (Q instanceof me0) {
                    Q = ((me0) Q).c0();
                }
                org.telegram.ui.ActionBar.h2 h2Var = Q;
                if (h2Var != null) {
                    org.telegram.ui.ActionBar.i6 resourceProvider = h2Var.getResourceProvider();
                    if (h2Var.getLastStoryViewer() != null && h2Var.getLastStoryViewer().K0) {
                        resourceProvider = h2Var.getLastStoryViewer().E;
                    }
                    ug.l0 l0Var = new ug.l0(19, launchActivity.P, launchActivity, h2Var, resourceProvider);
                    l0Var.B1(g3Var);
                    if (!(h2Var instanceof bn) ? !(!(h2Var instanceof cx) || (xvVar = ((cx) h2Var).H3) == null || xvVar.getCurrentFragmetDialogId() != l10.longValue()) : ((bn) h2Var).a() == l10.longValue()) {
                        z11 = true;
                    }
                    l0Var.A1(tL_premium_boostsStatus, z11);
                    l0Var.C1(l10.longValue());
                    l0Var.f58731c2 = r1Var;
                    h2Var.showDialog(l0Var);
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
                h3Var.b(l11.longValue(), tL_premium_boostsStatus2, new u60(launchActivity2, bVar2, l11, tL_premium_boostsStatus2, r1Var2, runnable2, 0));
                return;
            case 2:
                TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr = (TL_wallet.inputTonConnectOauthSession[]) obj5;
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) obj4;
                org.telegram.ui.ActionBar.x2 x2Var = (org.telegram.ui.ActionBar.x2) obj3;
                bg.m0 m0Var = (bg.m0) obj2;
                TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession = (TL_wallet.inputTonConnectOauthSession) obj;
                ((org.telegram.ui.ActionBar.x2[]) obj7)[0] = null;
                gi0.f48043a = null;
                if (((boolean[]) obj6)[0]) {
                    Arrays.fill(inputtonconnectoauthsession.challenge_answer, (byte) 0);
                    return;
                }
                inputtonconnectoauthsessionArr[0] = inputtonconnectoauthsession;
                if (!tL_urlAuthResultRequest.request_write_access && !tL_urlAuthResultRequest.request_phone_number) {
                    m0Var.run();
                    return;
                }
                gi0.f48043a = x2Var;
                x2Var.show();
                return;
            case 3:
                hi.d dVar = (hi.d) obj6;
                org.telegram.ui.Wallet.d3 d3Var = (org.telegram.ui.Wallet.d3) obj5;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) obj4;
                org.telegram.ui.Wallet.p pVar = (org.telegram.ui.Wallet.p) obj3;
                org.telegram.ui.Wallet.h2 h2Var2 = (org.telegram.ui.Wallet.h2) obj2;
                String str3 = (String) obj;
                ((hi.d) obj7).setLoading(false);
                dVar.setLoading(false);
                if (str3 == null) {
                    d3Var.dismiss();
                    return;
                }
                org.telegram.ui.Components.lc.d0(str3, d3Var.F, i6Var);
                pVar.run();
                if (h2Var2.f44300n || h2Var2.f44301o) {
                    z10 = false;
                }
                dVar.setEnabled(z10);
                return;
            default:
                org.telegram.ui.Wallet.e3 e3Var = (org.telegram.ui.Wallet.e3) obj4;
                org.telegram.ui.ActionBar.i6 i6Var2 = (org.telegram.ui.ActionBar.i6) obj3;
                jg.w0 w0Var = (jg.w0) obj2;
                String str4 = (String) obj;
                ((hi.d) obj7).setLoading(false);
                ((hi.d) obj6).setEnabled(true);
                ((ImageView) obj5).setEnabled(true);
                if (str4 == null) {
                    e3Var.dismiss();
                    return;
                }
                org.telegram.ui.Components.lc.d0(str4, e3Var.F, i6Var2);
                w0Var.run();
                return;
        }
    }

    public u60(LaunchActivity launchActivity, vf.b bVar, Runnable runnable, org.telegram.messenger.h3 h3Var, Long l10, org.telegram.ui.Cells.r1 r1Var) {
        this.f52444a = 1;
        this.f52445b = launchActivity;
        this.f52446c = bVar;
        this.d = runnable;
        this.f52449g = h3Var;
        this.f52447e = l10;
        this.f52448f = r1Var;
    }
}
