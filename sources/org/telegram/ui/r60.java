package org.telegram.ui;

import android.widget.ImageView;
import java.util.Arrays;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_wallet;
public final class r60 implements org.telegram.messenger.z10 {
    public final int f50855a;
    public final Object f50856b;
    public final Object f50857c;
    public final Object d;
    public final Object f50858e;
    public final Object f50859f;
    public final Object f50860g;

    public r60(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i7) {
        this.f50855a = i7;
        this.f50856b = obj;
        this.f50857c = obj2;
        this.f50858e = obj3;
        this.f50860g = obj4;
        this.f50859f = obj5;
        this.d = obj6;
    }

    @Override
    public final void a(Object obj) {
        uv uvVar;
        int i7 = this.f50855a;
        boolean z10 = true;
        boolean z11 = false;
        Object obj2 = this.d;
        Object obj3 = this.f50859f;
        Object obj4 = this.f50860g;
        Object obj5 = this.f50858e;
        Object obj6 = this.f50857c;
        Object obj7 = this.f50856b;
        switch (i7) {
            case 0:
                LaunchActivity launchActivity = (LaunchActivity) obj7;
                vf.b bVar = (vf.b) obj6;
                Long l10 = (Long) obj5;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj4;
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) obj3;
                Runnable runnable = (Runnable) obj2;
                org.telegram.messenger.e3 e3Var = (org.telegram.messenger.e3) obj;
                String str = LaunchActivity.C1;
                if (bVar != null) {
                    bVar.b();
                }
                org.telegram.ui.ActionBar.e2 Q = LaunchActivity.Q();
                if (Q instanceof je0) {
                    Q = ((je0) Q).c0();
                }
                org.telegram.ui.ActionBar.e2 e2Var = Q;
                if (e2Var != null) {
                    org.telegram.ui.ActionBar.e6 resourceProvider = e2Var.getResourceProvider();
                    if (e2Var.getLastStoryViewer() != null && e2Var.getLastStoryViewer().K0) {
                        resourceProvider = e2Var.getLastStoryViewer().E;
                    }
                    ug.j0 j0Var = new ug.j0(19, launchActivity.P, launchActivity, e2Var, resourceProvider);
                    j0Var.A1(e3Var);
                    if (!(e2Var instanceof an) ? !(!(e2Var instanceof yw) || (uvVar = ((yw) e2Var).H3) == null || uvVar.getCurrentFragmetDialogId() != l10.longValue()) : ((an) e2Var).a() == l10.longValue()) {
                        z11 = true;
                    }
                    j0Var.z1(tL_premium_boostsStatus, z11);
                    j0Var.B1(l10.longValue());
                    j0Var.f58132c2 = q1Var;
                    e2Var.showDialog(j0Var);
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
                org.telegram.messenger.f3 f3Var = (org.telegram.messenger.f3) obj4;
                Long l11 = (Long) obj5;
                org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) obj3;
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
                f3Var.b(l11.longValue(), tL_premium_boostsStatus2, new r60(launchActivity2, bVar2, l11, tL_premium_boostsStatus2, q1Var2, runnable2, 0));
                return;
            case 2:
                TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr = (TL_wallet.inputTonConnectOauthSession[]) obj5;
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) obj4;
                org.telegram.ui.ActionBar.u2 u2Var = (org.telegram.ui.ActionBar.u2) obj3;
                bg.l0 l0Var = (bg.l0) obj2;
                TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession = (TL_wallet.inputTonConnectOauthSession) obj;
                ((org.telegram.ui.ActionBar.u2[]) obj7)[0] = null;
                di0.f46411a = null;
                if (((boolean[]) obj6)[0]) {
                    Arrays.fill(inputtonconnectoauthsession.challenge_answer, (byte) 0);
                    return;
                }
                inputtonconnectoauthsessionArr[0] = inputtonconnectoauthsession;
                if (!tL_urlAuthResultRequest.request_write_access && !tL_urlAuthResultRequest.request_phone_number) {
                    l0Var.run();
                    return;
                }
                di0.f46411a = u2Var;
                u2Var.show();
                return;
            case 3:
                hi.d dVar = (hi.d) obj6;
                org.telegram.ui.Wallet.w2 w2Var = (org.telegram.ui.Wallet.w2) obj5;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj4;
                org.telegram.ui.Wallet.g gVar = (org.telegram.ui.Wallet.g) obj3;
                org.telegram.ui.Wallet.z1 z1Var = (org.telegram.ui.Wallet.z1) obj2;
                String str3 = (String) obj;
                ((hi.d) obj7).setLoading(false);
                dVar.setLoading(false);
                if (str3 == null) {
                    w2Var.dismiss();
                    return;
                }
                org.telegram.ui.Components.cc.c0(str3, w2Var.F, e6Var);
                gVar.run();
                if (z1Var.f44787n || z1Var.f44788o) {
                    z10 = false;
                }
                dVar.setEnabled(z10);
                return;
            default:
                org.telegram.ui.Wallet.x2 x2Var = (org.telegram.ui.Wallet.x2) obj4;
                org.telegram.ui.ActionBar.e6 e6Var2 = (org.telegram.ui.ActionBar.e6) obj3;
                jg.w0 w0Var = (jg.w0) obj2;
                String str4 = (String) obj;
                ((hi.d) obj7).setLoading(false);
                ((hi.d) obj6).setEnabled(true);
                ((ImageView) obj5).setEnabled(true);
                if (str4 == null) {
                    x2Var.dismiss();
                    return;
                }
                org.telegram.ui.Components.cc.c0(str4, x2Var.F, e6Var2);
                w0Var.run();
                return;
        }
    }

    public r60(LaunchActivity launchActivity, vf.b bVar, Runnable runnable, org.telegram.messenger.f3 f3Var, Long l10, org.telegram.ui.Cells.q1 q1Var) {
        this.f50855a = 1;
        this.f50856b = launchActivity;
        this.f50857c = bVar;
        this.d = runnable;
        this.f50860g = f3Var;
        this.f50858e = l10;
        this.f50859f = q1Var;
    }
}
