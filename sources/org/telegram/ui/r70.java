package org.telegram.ui;

import android.widget.ImageView;
import java.util.Arrays;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_wallet;
public final class r70 implements org.telegram.messenger.q20 {
    public final int f41154a;
    public final Object f41155b;
    public final Object f41156c;
    public final Object d;
    public final Object e;
    public final Object f41157f;
    public final Object f41158g;

    public r70(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f41154a = i10;
        this.f41155b = obj;
        this.f41156c = obj2;
        this.e = obj3;
        this.f41158g = obj4;
        this.f41157f = obj5;
        this.d = obj6;
    }

    @Override
    public final void a(Object obj) {
        xw xwVar;
        int i10 = this.f41154a;
        boolean z10 = true;
        boolean z11 = false;
        Object obj2 = this.d;
        Object obj3 = this.f41157f;
        Object obj4 = this.f41158g;
        Object obj5 = this.e;
        Object obj6 = this.f41156c;
        Object obj7 = this.f41155b;
        switch (i10) {
            case 0:
                LaunchActivity launchActivity = (LaunchActivity) obj7;
                gf.e eVar = (gf.e) obj6;
                Long l4 = (Long) obj5;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj4;
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) obj3;
                Runnable runnable = (Runnable) obj2;
                org.telegram.messenger.h3 h3Var = (org.telegram.messenger.h3) obj;
                Pattern pattern = LaunchActivity.D1;
                if (eVar != null) {
                    eVar.b();
                }
                org.telegram.ui.ActionBar.k2 Q = LaunchActivity.Q();
                if (Q instanceof pf0) {
                    Q = ((pf0) Q).b0();
                }
                org.telegram.ui.ActionBar.k2 k2Var = Q;
                if (k2Var != null) {
                    org.telegram.ui.ActionBar.p6 resourceProvider = k2Var.getResourceProvider();
                    if (k2Var.getLastStoryViewer() != null && k2Var.getLastStoryViewer().K0) {
                        resourceProvider = k2Var.getLastStoryViewer().D;
                    }
                    kg.q0 q0Var = new kg.q0(19, launchActivity.O, launchActivity, k2Var, resourceProvider);
                    q0Var.A1(h3Var);
                    if (!(k2Var instanceof un) ? !(!(k2Var instanceof ay) || (xwVar = ((ay) k2Var).F3) == null || xwVar.getCurrentFragmetDialogId() != l4.longValue()) : ((un) k2Var).a() == l4.longValue()) {
                        z11 = true;
                    }
                    q0Var.z1(tL_premium_boostsStatus, z11);
                    q0Var.B1(l4.longValue());
                    q0Var.Y1 = q1Var;
                    k2Var.showDialog(q0Var);
                    if (runnable != null) {
                        try {
                            runnable.run();
                            return;
                        } catch (Exception e) {
                            org.telegram.messenger.f8.g(e, true);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 1:
                LaunchActivity launchActivity2 = (LaunchActivity) obj7;
                gf.e eVar2 = (gf.e) obj6;
                Runnable runnable2 = (Runnable) obj2;
                org.telegram.messenger.i3 i3Var = (org.telegram.messenger.i3) obj4;
                Long l10 = (Long) obj5;
                org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) obj3;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = (TL_stories.TL_premium_boostsStatus) obj;
                Pattern pattern2 = LaunchActivity.D1;
                if (tL_premium_boostsStatus2 == null) {
                    if (eVar2 != null) {
                        eVar2.b();
                    }
                    if (runnable2 != null) {
                        runnable2.run();
                        return;
                    }
                    return;
                }
                i3Var.b(l10.longValue(), tL_premium_boostsStatus2, new r70(launchActivity2, eVar2, l10, tL_premium_boostsStatus2, q1Var2, runnable2, 0));
                return;
            case 2:
                TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr = (TL_wallet.inputTonConnectOauthSession[]) obj5;
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) obj4;
                org.telegram.ui.ActionBar.z2 z2Var = (org.telegram.ui.ActionBar.z2) obj3;
                m4.a1 a1Var = (m4.a1) obj2;
                TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession = (TL_wallet.inputTonConnectOauthSession) obj;
                ((org.telegram.ui.ActionBar.z2[]) obj7)[0] = null;
                jj0.f38536a = null;
                if (((boolean[]) obj6)[0]) {
                    Arrays.fill(inputtonconnectoauthsession.challenge_answer, (byte) 0);
                    return;
                }
                inputtonconnectoauthsessionArr[0] = inputtonconnectoauthsession;
                if (!tL_urlAuthResultRequest.request_write_access && !tL_urlAuthResultRequest.request_phone_number) {
                    a1Var.run();
                    return;
                }
                jj0.f38536a = z2Var;
                z2Var.show();
                return;
            case 3:
                vh.d dVar = (vh.d) obj6;
                org.telegram.ui.Wallet.y2 y2Var = (org.telegram.ui.Wallet.y2) obj5;
                org.telegram.ui.ActionBar.p6 p6Var = (org.telegram.ui.ActionBar.p6) obj4;
                org.telegram.ui.Wallet.g gVar = (org.telegram.ui.Wallet.g) obj3;
                org.telegram.ui.Wallet.a2 a2Var = (org.telegram.ui.Wallet.a2) obj2;
                String str = (String) obj;
                ((vh.d) obj7).setLoading(false);
                dVar.setLoading(false);
                if (str == null) {
                    y2Var.dismiss();
                    return;
                }
                org.telegram.ui.Components.cc.c0(str, y2Var.E, p6Var);
                gVar.run();
                if (a2Var.f34172n || a2Var.f34173o) {
                    z10 = false;
                }
                dVar.setEnabled(z10);
                return;
            default:
                org.telegram.ui.Wallet.z2 z2Var2 = (org.telegram.ui.Wallet.z2) obj4;
                org.telegram.ui.ActionBar.p6 p6Var2 = (org.telegram.ui.ActionBar.p6) obj3;
                org.telegram.messenger.camera.i iVar = (org.telegram.messenger.camera.i) obj2;
                String str2 = (String) obj;
                ((vh.d) obj7).setLoading(false);
                ((vh.d) obj6).setEnabled(true);
                ((ImageView) obj5).setEnabled(true);
                if (str2 == null) {
                    z2Var2.dismiss();
                    return;
                }
                org.telegram.ui.Components.cc.c0(str2, z2Var2.E, p6Var2);
                iVar.run();
                return;
        }
    }

    public r70(LaunchActivity launchActivity, gf.e eVar, Runnable runnable, org.telegram.messenger.i3 i3Var, Long l4, org.telegram.ui.Cells.q1 q1Var) {
        this.f41154a = 1;
        this.f41155b = launchActivity;
        this.f41156c = eVar;
        this.d = runnable;
        this.f41158g = i3Var;
        this.e = l4;
        this.f41157f = q1Var;
    }
}
