package org.telegram.ui;

import android.graphics.RectF;
import org.telegram.messenger.voip.VoIPService;
public final class uu0 implements Runnable {
    public final int f50570a;
    public final Object f50571b;

    public uu0(Object obj, int i7) {
        this.f50570a = i7;
        this.f50571b = obj;
    }

    @Override
    public final void run() {
        int i7 = this.f50570a;
        int i10 = 0;
        Object obj = this.f50571b;
        switch (i7) {
            case 0:
                vu0 vu0Var = (vu0) obj;
                vu0Var.G.getNotificationCenter().j(vu0Var.F);
                return;
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) ((bi.x5) obj).f5030c;
                if (profileActivity.f41799p5 != 1.0f) {
                    dv0 dv0Var = profileActivity.f41782n0;
                    while (dv0Var.D0.k(i10) != dv0Var.getRealCount() - 1) {
                        i10++;
                    }
                    dv0Var.x(i10, true);
                    return;
                }
                return;
            case 2:
                ProfileActivity profileActivity2 = ((uv0) obj).f50573b;
                RectF rectF = ProfileActivity.V6;
                profileActivity2.getMessagesController().d5(profileActivity2.f41714d1, 0, true, new fi.l9(2, profileActivity2, true));
                return;
            case 3:
                yv0 yv0Var = (yv0) obj;
                yv0Var.Z0(yv0Var.getTabProgress());
                return;
            case 4:
                ((pw0) obj).c();
                return;
            case 5:
                ((fx0) obj).a();
                return;
            case 6:
                cx0 cx0Var = (cx0) obj;
                cx0Var.f44828f.add(cx0Var.f44826c);
                cx0Var.a();
                return;
            case 7:
                Runnable[] runnableArr = (Runnable[]) obj;
                runnableArr[0].run();
                runnableArr[0] = null;
                return;
            case 8:
                ((di.n6) obj).e();
                return;
            case 9:
                org.telegram.ui.Components.gc gcVar = (org.telegram.ui.Components.gc) obj;
                if (LaunchActivity.T() != null) {
                    if (gcVar == null) {
                        gcVar = org.telegram.ui.Components.gc.a0(LaunchActivity.T());
                    }
                    if (gcVar != null) {
                        org.telegram.ui.Components.bc I = gcVar.I(2131624091, org.telegram.messenger.id.M0(2131746222, null), org.telegram.messenger.id.M0(2131746185, null));
                        I.f32203j = 5000;
                        I.j();
                        return;
                    }
                    return;
                }
                return;
            case 10:
                ((az0) obj).invalidate();
                return;
            case 11:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj;
                saveToGallerySettingsActivity.f41893w.clear();
                saveToGallerySettingsActivity.getUserConfig().A(saveToGallerySettingsActivity.f41885a, saveToGallerySettingsActivity.f41893w);
                saveToGallerySettingsActivity.e0();
                return;
            case 12:
                org.telegram.ui.Components.m20 m20Var = (org.telegram.ui.Components.m20) obj;
                m20Var.dismiss();
                vf.c.t(m20Var.getContext(), org.telegram.messenger.id.M0(2131746618, null));
                return;
            case 13:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) ((org.telegram.ui.Components.v50) obj).f38863c;
                Runnable runnable = secretMediaViewer.m0;
                if (runnable != null) {
                    runnable.run();
                    secretMediaViewer.m0 = null;
                    return;
                }
                return;
            case 14:
                vz0 vz0Var = ((uz0) obj).f50597a;
                vz0Var.Q = true;
                vz0Var.N.invalidate();
                return;
            case 15:
                ((org.telegram.messenger.qs) obj).o();
                return;
            case 16:
                org.telegram.messenger.g0.V3(((l01) obj).f47475c, true, true);
                return;
            case 17:
                org.telegram.ui.Components.m41 m41Var = ((d21) obj).d2;
                if (m41Var != null) {
                    m41Var.O(true);
                    return;
                }
                return;
            case 18:
                ((w11) obj).a();
                return;
            case 19:
                kg.f.a(((SessionsActivity) obj).currentAccount).b();
                return;
            case 20:
                e51 e51Var = (e51) obj;
                e51Var.m0.a(e51Var.f45152j0.f34746e0, e51Var.f45153k0.isAttachedToWindow());
                return;
            case 21:
                ((c91) obj).J.f52379r.f();
                return;
            case 22:
                ((k91) obj).f47236b.G0();
                return;
            case 23:
                ((VoIPFeedbackActivity) obj).finish();
                return;
            case 24:
                ((ac1) obj).f43645a.y();
                return;
            case 25:
                ((bc1) obj).f44007a.y();
                return;
            case 26:
                jc1 jc1Var = ((zb1) obj).f52403b;
                jc1Var.K0.e();
                org.telegram.ui.Components.voip.e2.d().getClass();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().swapSinks();
                }
                jc1Var.Y.setCornerRadius(-1.0f);
                jc1Var.f46914c0.d.release();
                jc1Var.f46916d0.d.release();
                jc1Var.f46911b0.release();
                jc1Var.c();
                jc1Var.f46944t0.d();
                org.telegram.ui.Components.voip.e2.S = false;
                jc1Var.D0 = false;
                jc1.l1 = null;
                org.telegram.ui.Components.voip.f2.d();
                return;
            case 27:
                hc1 hc1Var = (hc1) obj;
                hc1Var.getClass();
                if (VoIPService.getSharedState() != null) {
                    VoIPService.getSharedState().acceptIncomingCall();
                    if (hc1Var.f46318a.m0 && VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().requestVideoCall(false);
                        return;
                    }
                    return;
                }
                return;
            case 28:
                ((VoIPPermissionActivity) obj).finish();
                return;
            default:
                ((WallpapersListActivity) obj).G0(false);
                return;
        }
    }
}
