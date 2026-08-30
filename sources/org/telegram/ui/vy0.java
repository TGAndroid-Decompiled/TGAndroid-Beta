package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
public final class vy0 implements Runnable {
    public final int f39282a;
    public final Object f39283b;

    public vy0(Object obj, int i10) {
        this.f39282a = i10;
        this.f39283b = obj;
    }

    @Override
    public final void run() {
        int i10 = this.f39282a;
        int i11 = 0;
        Object obj = this.f39283b;
        switch (i10) {
            case 0:
                ProfileActivity profileActivity = (ProfileActivity) ((ah.d) obj).f198c;
                if (profileActivity.f32104k5 != 1.0f) {
                    xy0 xy0Var = profileActivity.f32099k0;
                    while (xy0Var.A0.k(i11) != xy0Var.getRealCount() - 1) {
                        i11++;
                    }
                    xy0Var.x(i11, true);
                    return;
                }
                return;
            case 1:
                ProfileActivity profileActivity2 = ((oz0) obj).f37135b;
                profileActivity2.getMessagesController().toggleChatNoForwards(profileActivity2.f32037b1, 0, true, new ky0(true, profileActivity2, 0));
                return;
            case 2:
                sz0 sz0Var = (sz0) obj;
                sz0Var.M0(sz0Var.getTabProgress());
                return;
            case 3:
                ((j01) obj).c();
                return;
            case 4:
                ((y01) obj).a();
                return;
            case 5:
                v01 v01Var = (v01) obj;
                v01Var.f39037f.add(v01Var.f39036c);
                v01Var.a();
                return;
            case 6:
                Runnable[] runnableArr = (Runnable[]) obj;
                runnableArr[0].run();
                runnableArr[0] = null;
                return;
            case 7:
                ((nh.h6) obj).e();
                return;
            case 8:
                w11 w11Var = (w11) obj;
                AndroidUtilities.hideKeyboard(w11Var.d.findFocus());
                while (i11 < w11Var.f39308y.length) {
                    int i12 = w11Var.f39306w;
                    if ((i12 != 0 || i11 == 4) && (i12 != 1 || i11 == 2 || i11 == 3)) {
                        w11Var.f39299a[i11].setText((CharSequence) null);
                    }
                    i11++;
                }
                return;
            case 9:
                org.telegram.ui.Components.qc qcVar = (org.telegram.ui.Components.qc) obj;
                if (LaunchActivity.U() != null) {
                    if (qcVar == null) {
                        qcVar = org.telegram.ui.Components.qc.a0(LaunchActivity.U());
                    }
                    if (qcVar != null) {
                        org.telegram.ui.Components.ic M = qcVar.M(LocaleController.getString(R.string.ReportChatSent), LocaleController.getString(R.string.Reported2), R.raw.msg_antispam);
                        M.f25672j = 5000;
                        M.j();
                        return;
                    }
                    return;
                }
                return;
            case 10:
                ((t31) obj).invalidate();
                return;
            case 11:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj;
                saveToGallerySettingsActivity.v.clear();
                saveToGallerySettingsActivity.getUserConfig().updateSaveGalleryExceptions(saveToGallerySettingsActivity.f32216a, saveToGallerySettingsActivity.v);
                saveToGallerySettingsActivity.Z();
                return;
            case 12:
                z31 z31Var = (z31) obj;
                z31Var.dismiss();
                af.g.s(z31Var.getContext(), LocaleController.getString(R.string.PromoteUrl));
                return;
            case 13:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) ((org.telegram.ui.Components.ex0) obj).f24697c;
                Runnable runnable = secretMediaViewer.f32250l0;
                if (runnable != null) {
                    runnable.run();
                    secretMediaViewer.f32250l0 = null;
                    return;
                }
                return;
            case 14:
                p41 p41Var = ((o41) obj).f36790a;
                p41Var.N = true;
                p41Var.K.invalidate();
                return;
            case 15:
                ((NotificationCenter) obj).runDelayedNotifications();
                return;
            case 16:
                AndroidUtilities.updateViewShow(((e61) obj).f33904c, true);
                return;
            case 17:
                org.telegram.ui.Components.w51 w51Var = ((b71) obj).f32834f0;
                if (w51Var != null) {
                    w51Var.N(true);
                    return;
                }
                return;
            case 18:
                ((u61) obj).a();
                return;
            case 19:
                uf.f.a(((SessionsActivity) obj).currentAccount).b();
                return;
            case 20:
                ((le1) obj).J.f35699r.l();
                return;
            case 21:
                ((ue1) obj).f38924b.C0();
                return;
            case 22:
                ((VoIPFeedbackActivity) obj).finish();
                return;
            case 23:
                ((ph1) obj).f37343a.H();
                return;
            case 24:
                ((qh1) obj).f37760a.H();
                return;
            case 25:
                ai1 ai1Var = ((oh1) obj).f36917b;
                ai1Var.I0.unlock();
                org.telegram.ui.Components.voip.m2.k().getClass();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().swapSinks();
                }
                ai1Var.V.setCornerRadius(-1.0f);
                ai1Var.Z.d.release();
                ai1Var.f32599a0.d.release();
                ai1Var.Y.release();
                ai1Var.l();
                ai1Var.f32630r0.d();
                org.telegram.ui.Components.voip.m2.Q = false;
                ai1Var.B0 = false;
                ai1.f32597k1 = null;
                return;
            case 26:
                yh1 yh1Var = (yh1) obj;
                yh1Var.getClass();
                if (VoIPService.getSharedState() != null) {
                    VoIPService.getSharedState().acceptIncomingCall();
                    if (yh1Var.f40528a.f32622k0 && VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().requestVideoCall(false);
                        return;
                    }
                    return;
                }
                return;
            case 27:
                ((VoIPPermissionActivity) obj).finish();
                return;
            default:
                int[][] iArr = WallpapersListActivity.f32397h0;
                ((WallpapersListActivity) obj).B0(false);
                return;
        }
    }
}
