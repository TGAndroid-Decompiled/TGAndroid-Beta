package org.telegram.ui;

import android.graphics.RectF;
import org.telegram.messenger.voip.VoIPService;
public final class qu0 implements Runnable {
    public final int f51540a;
    public final Object f51541b;

    public qu0(Object obj, int i7) {
        this.f51540a = i7;
        this.f51541b = obj;
    }

    @Override
    public final void run() {
        int i7 = this.f51540a;
        int i10 = 0;
        Object obj = this.f51541b;
        switch (i7) {
            case 0:
                ru0 ru0Var = (ru0) obj;
                ru0Var.G.getNotificationCenter().j(ru0Var.F);
                return;
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) ((ai.h0) obj).f1215c;
                if (profileActivity.f43773t5 != 1.0f) {
                    zu0 zu0Var = profileActivity.f43733o0;
                    while (zu0Var.E0.k(i10) != zu0Var.getRealCount() - 1) {
                        i10++;
                    }
                    zu0Var.x(i10, true);
                    return;
                }
                return;
            case 2:
                ProfileActivity profileActivity2 = ((qv0) obj).f51546b;
                RectF rectF = ProfileActivity.Z6;
                profileActivity2.getMessagesController().p5(profileActivity2.f43666e1, 0, true, new hi.ea(profileActivity2, true, 2));
                return;
            case 3:
                uv0 uv0Var = (uv0) obj;
                uv0Var.Z0(uv0Var.getTabProgress());
                return;
            case 4:
                ((mw0) obj).c();
                return;
            case 5:
                ((bx0) obj).a();
                return;
            case 6:
                yw0 yw0Var = (yw0) obj;
                yw0Var.f54441f.add(yw0Var.f54439c);
                yw0Var.a();
                return;
            case 7:
                Runnable[] runnableArr = (Runnable[]) obj;
                runnableArr[0].run();
                runnableArr[0] = null;
                return;
            case 8:
                ((fi.d6) obj).e();
                return;
            case 9:
                org.telegram.ui.Components.kc kcVar = (org.telegram.ui.Components.kc) obj;
                if (LaunchActivity.T() != null) {
                    if (kcVar == null) {
                        kcVar = org.telegram.ui.Components.kc.b0(LaunchActivity.T());
                    }
                    if (kcVar != null) {
                        org.telegram.ui.Components.fc I = kcVar.I(2131624092, org.telegram.messenger.gd.N0(2131746026, null), org.telegram.messenger.gd.N0(2131745989, null));
                        I.f35091j = 5000;
                        I.j();
                        return;
                    }
                    return;
                }
                return;
            case 10:
                ((xy0) obj).invalidate();
                return;
            case 11:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj;
                saveToGallerySettingsActivity.f43838w.clear();
                saveToGallerySettingsActivity.getUserConfig().A(saveToGallerySettingsActivity.f43830a, saveToGallerySettingsActivity.f43838w);
                saveToGallerySettingsActivity.e0();
                return;
            case 12:
                org.telegram.ui.Components.x20 x20Var = (org.telegram.ui.Components.x20) obj;
                x20Var.dismiss();
                vf.c.t(x20Var.getContext(), org.telegram.messenger.gd.N0(2131746422, null));
                return;
            case 13:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) ((org.telegram.ui.Components.f10) obj).f34944c;
                Runnable runnable = secretMediaViewer.f43870n0;
                if (runnable != null) {
                    runnable.run();
                    secretMediaViewer.f43870n0 = null;
                    return;
                }
                return;
            case 14:
                sz0 sz0Var = ((rz0) obj).f51926a;
                sz0Var.R = true;
                sz0Var.O.invalidate();
                return;
            case 15:
                ((org.telegram.messenger.ks) obj).o();
                return;
            case 16:
                org.telegram.messenger.g0.T3(((i01) obj).f48679c, true, true);
                return;
            case 17:
                org.telegram.ui.Components.b51 b51Var = ((a21) obj).f45571e2;
                if (b51Var != null) {
                    b51Var.O(true);
                    return;
                }
                return;
            case 18:
                ((t11) obj).a();
                return;
            case 19:
                kg.f.a(((SessionsActivity) obj).currentAccount).b();
                return;
            case 20:
                b51 b51Var2 = (b51) obj;
                b51Var2.f45942n0.a(b51Var2.f45939k0.f39707f0, b51Var2.f45940l0.isAttachedToWindow());
                return;
            case 21:
                ((z81) obj).J.f53253r.f();
                return;
            case 22:
                ((h91) obj).f48513b.G0();
                return;
            case 23:
                ((VoIPFeedbackActivity) obj).finish();
                return;
            case 24:
                ((wb1) obj).f53289a.y();
                return;
            case 25:
                ((xb1) obj).f53909a.y();
                return;
            case 26:
                fc1 fc1Var = ((vb1) obj).f52941b;
                fc1Var.L0.e();
                org.telegram.ui.Components.voip.i2.d().getClass();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().swapSinks();
                }
                fc1Var.Z.setCornerRadius(-1.0f);
                fc1Var.f47761d0.d.release();
                fc1Var.f47764e0.d.release();
                fc1Var.f47759c0.release();
                fc1Var.c();
                fc1Var.f47790u0.d();
                org.telegram.ui.Components.voip.i2.T = false;
                fc1Var.E0 = false;
                fc1.f47751m1 = null;
                org.telegram.ui.Components.voip.j2.d();
                return;
            case 27:
                dc1 dc1Var = (dc1) obj;
                dc1Var.getClass();
                if (VoIPService.getSharedState() != null) {
                    VoIPService.getSharedState().acceptIncomingCall();
                    if (dc1Var.f47041a.f47781n0 && VoIPService.getSharedInstance() != null) {
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
