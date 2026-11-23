package org.telegram.ui;

import android.graphics.RectF;
import org.telegram.messenger.voip.VoIPService;
public final class su0 implements Runnable {
    public final int f52085a;
    public final Object f52086b;

    public su0(Object obj, int i7) {
        this.f52085a = i7;
        this.f52086b = obj;
    }

    @Override
    public final void run() {
        int i7 = this.f52085a;
        int i10 = 0;
        Object obj = this.f52086b;
        switch (i7) {
            case 0:
                tu0 tu0Var = (tu0) obj;
                tu0Var.G.getNotificationCenter().j(tu0Var.F);
                return;
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) ((ai.g0) obj).f1200c;
                if (profileActivity.f43657t5 != 1.0f) {
                    bv0 bv0Var = profileActivity.f43617o0;
                    while (bv0Var.E0.k(i10) != bv0Var.getRealCount() - 1) {
                        i10++;
                    }
                    bv0Var.x(i10, true);
                    return;
                }
                return;
            case 2:
                ProfileActivity profileActivity2 = ((sv0) obj).f52091b;
                RectF rectF = ProfileActivity.Z6;
                profileActivity2.getMessagesController().p5(profileActivity2.f43550e1, 0, true, new hi.k9(profileActivity2, true, 2));
                return;
            case 3:
                wv0 wv0Var = (wv0) obj;
                wv0Var.Z0(wv0Var.getTabProgress());
                return;
            case 4:
                ((ow0) obj).c();
                return;
            case 5:
                ((dx0) obj).a();
                return;
            case 6:
                ax0 ax0Var = (ax0) obj;
                ax0Var.f45671f.add(ax0Var.f45669c);
                ax0Var.a();
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
                org.telegram.ui.Components.lc lcVar = (org.telegram.ui.Components.lc) obj;
                if (LaunchActivity.T() != null) {
                    if (lcVar == null) {
                        lcVar = org.telegram.ui.Components.lc.b0(LaunchActivity.T());
                    }
                    if (lcVar != null) {
                        org.telegram.ui.Components.gc I = lcVar.I(2131624092, org.telegram.messenger.hd.N0(2131746026, null), org.telegram.messenger.hd.N0(2131745989, null));
                        I.f35489j = 5000;
                        I.j();
                        return;
                    }
                    return;
                }
                return;
            case 10:
                ((yy0) obj).invalidate();
                return;
            case 11:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj;
                saveToGallerySettingsActivity.f43722w.clear();
                saveToGallerySettingsActivity.getUserConfig().A(saveToGallerySettingsActivity.f43714a, saveToGallerySettingsActivity.f43722w);
                saveToGallerySettingsActivity.e0();
                return;
            case 12:
                org.telegram.ui.Components.a30 a30Var = (org.telegram.ui.Components.a30) obj;
                a30Var.dismiss();
                vf.c.t(a30Var.getContext(), org.telegram.messenger.hd.N0(2131746422, null));
                return;
            case 13:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) ((org.telegram.ui.Components.h10) obj).f35696c;
                Runnable runnable = secretMediaViewer.f43754n0;
                if (runnable != null) {
                    runnable.run();
                    secretMediaViewer.f43754n0 = null;
                    return;
                }
                return;
            case 14:
                tz0 tz0Var = ((sz0) obj).f52117a;
                tz0Var.R = true;
                tz0Var.O.invalidate();
                return;
            case 15:
                ((org.telegram.messenger.ls) obj).o();
                return;
            case 16:
                org.telegram.messenger.g0.T3(((j01) obj).f48863c, true, true);
                return;
            case 17:
                org.telegram.ui.Components.c51 c51Var = ((b21) obj).f45710e2;
                if (c51Var != null) {
                    c51Var.O(true);
                    return;
                }
                return;
            case 18:
                ((u11) obj).a();
                return;
            case 19:
                kg.f.a(((SessionsActivity) obj).currentAccount).b();
                return;
            case 20:
                c51 c51Var2 = (c51) obj;
                c51Var2.f46433n0.a(c51Var2.f46430k0.f40026f0, c51Var2.f46431l0.isAttachedToWindow());
                return;
            case 21:
                ((b91) obj).J.f54112r.f();
                return;
            case 22:
                ((j91) obj).f48945b.G0();
                return;
            case 23:
                ((VoIPFeedbackActivity) obj).finish();
                return;
            case 24:
                ((yb1) obj).f54136a.y();
                return;
            case 25:
                ((zb1) obj).f54485a.y();
                return;
            case 26:
                hc1 hc1Var = ((xb1) obj).f53745b;
                hc1Var.L0.e();
                org.telegram.ui.Components.voip.h2.d().getClass();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().swapSinks();
                }
                hc1Var.Z.setCornerRadius(-1.0f);
                hc1Var.f48304d0.d.release();
                hc1Var.f48307e0.d.release();
                hc1Var.f48302c0.release();
                hc1Var.c();
                hc1Var.f48333u0.d();
                org.telegram.ui.Components.voip.h2.T = false;
                hc1Var.E0 = false;
                hc1.f48294m1 = null;
                org.telegram.ui.Components.voip.i2.g();
                return;
            case 27:
                fc1 fc1Var = (fc1) obj;
                fc1Var.getClass();
                if (VoIPService.getSharedState() != null) {
                    VoIPService.getSharedState().acceptIncomingCall();
                    if (fc1Var.f47630a.f48324n0 && VoIPService.getSharedInstance() != null) {
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
