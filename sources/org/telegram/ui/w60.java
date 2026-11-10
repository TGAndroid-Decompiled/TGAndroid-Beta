package org.telegram.ui;

import android.widget.ImageView;
import java.util.Arrays;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_wallet;
public final class w60 implements org.telegram.messenger.c20 {
    public final int f50924a;
    public final Object f50925b;
    public final Object f50926c;
    public final Object d;
    public final Object f50927e;
    public final Object f50928f;
    public final Object f50929g;

    public w60(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i7) {
        this.f50924a = i7;
        this.f50925b = obj;
        this.f50926c = obj2;
        this.f50927e = obj3;
        this.f50929g = obj4;
        this.f50928f = obj5;
        this.d = obj6;
    }

    @Override
    public final void a(Object obj) {
        vv vvVar;
        int i7 = this.f50924a;
        boolean z9 = true;
        boolean z10 = false;
        Object obj2 = this.d;
        Object obj3 = this.f50928f;
        Object obj4 = this.f50929g;
        Object obj5 = this.f50927e;
        Object obj6 = this.f50926c;
        Object obj7 = this.f50925b;
        switch (i7) {
            case 0:
                LaunchActivity launchActivity = (LaunchActivity) obj7;
                vf.b bVar = (vf.b) obj6;
                Long l10 = (Long) obj5;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj4;
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) obj3;
                Runnable runnable = (Runnable) obj2;
                org.telegram.messenger.e3 e3Var = (org.telegram.messenger.e3) obj;
                String str = LaunchActivity.B1;
                if (bVar != null) {
                    bVar.b();
                }
                org.telegram.ui.ActionBar.f2 Q = LaunchActivity.Q();
                if (Q instanceof me0) {
                    Q = ((me0) Q).c0();
                }
                org.telegram.ui.ActionBar.f2 f2Var = Q;
                if (f2Var != null) {
                    org.telegram.ui.ActionBar.h6 resourceProvider = f2Var.getResourceProvider();
                    if (f2Var.getLastStoryViewer() != null && f2Var.getLastStoryViewer().J0) {
                        resourceProvider = f2Var.getLastStoryViewer().D;
                    }
                    ug.i0 i0Var = new ug.i0(19, launchActivity.O, launchActivity, f2Var, resourceProvider);
                    i0Var.A1(e3Var);
                    if (!(f2Var instanceof cn) ? !(!(f2Var instanceof zw) || (vvVar = ((zw) f2Var).G3) == null || vvVar.getCurrentFragmetDialogId() != l10.longValue()) : ((cn) f2Var).a() == l10.longValue()) {
                        z10 = true;
                    }
                    i0Var.z1(tL_premium_boostsStatus, z10);
                    i0Var.B1(l10.longValue());
                    i0Var.f56616b2 = q1Var;
                    f2Var.showDialog(i0Var);
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
                String str2 = LaunchActivity.B1;
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
                f3Var.b(l11.longValue(), tL_premium_boostsStatus2, new w60(launchActivity2, bVar2, l11, tL_premium_boostsStatus2, q1Var2, runnable2, 0));
                return;
            case 2:
                TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr = (TL_wallet.inputTonConnectOauthSession[]) obj5;
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) obj4;
                org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) obj3;
                bg.l0 l0Var = (bg.l0) obj2;
                TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession = (TL_wallet.inputTonConnectOauthSession) obj;
                ((org.telegram.ui.ActionBar.w2[]) obj7)[0] = null;
                ei0.f45313a = null;
                if (((boolean[]) obj6)[0]) {
                    Arrays.fill(inputtonconnectoauthsession.challenge_answer, (byte) 0);
                    return;
                }
                inputtonconnectoauthsessionArr[0] = inputtonconnectoauthsession;
                if (!tL_urlAuthResultRequest.request_write_access && !tL_urlAuthResultRequest.request_phone_number) {
                    l0Var.run();
                    return;
                }
                ei0.f45313a = w2Var;
                w2Var.show();
                return;
            case 3:
                fi.d dVar = (fi.d) obj6;
                org.telegram.ui.Wallet.x2 x2Var = (org.telegram.ui.Wallet.x2) obj5;
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) obj4;
                org.telegram.ui.Wallet.g gVar = (org.telegram.ui.Wallet.g) obj3;
                org.telegram.ui.Wallet.z1 z1Var = (org.telegram.ui.Wallet.z1) obj2;
                String str3 = (String) obj;
                ((fi.d) obj7).setLoading(false);
                dVar.setLoading(false);
                if (str3 == null) {
                    x2Var.dismiss();
                    return;
                }
                org.telegram.ui.Components.gc.c0(str3, x2Var.E, h6Var);
                gVar.run();
                if (z1Var.f43423n || z1Var.f43424o) {
                    z9 = false;
                }
                dVar.setEnabled(z9);
                return;
            default:
                org.telegram.ui.Wallet.y2 y2Var = (org.telegram.ui.Wallet.y2) obj4;
                org.telegram.ui.ActionBar.h6 h6Var2 = (org.telegram.ui.ActionBar.h6) obj3;
                jg.w0 w0Var = (jg.w0) obj2;
                String str4 = (String) obj;
                ((fi.d) obj7).setLoading(false);
                ((fi.d) obj6).setEnabled(true);
                ((ImageView) obj5).setEnabled(true);
                if (str4 == null) {
                    y2Var.dismiss();
                    return;
                }
                org.telegram.ui.Components.gc.c0(str4, y2Var.E, h6Var2);
                w0Var.run();
                return;
        }
    }

    public w60(LaunchActivity launchActivity, vf.b bVar, Runnable runnable, org.telegram.messenger.f3 f3Var, Long l10, org.telegram.ui.Cells.q1 q1Var) {
        this.f50924a = 1;
        this.f50925b = launchActivity;
        this.f50926c = bVar;
        this.d = runnable;
        this.f50929g = f3Var;
        this.f50927e = l10;
        this.f50928f = q1Var;
    }
}
