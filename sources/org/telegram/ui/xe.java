package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class xe implements Runnable {
    public final int f51981a;
    public final wm f51982b;

    public xe(wm wmVar, int i3) {
        this.f51981a = i3;
        this.f51982b = wmVar;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.y0 y0Var;
        int i3 = this.f51981a;
        wm wmVar = this.f51982b;
        switch (i3) {
            case 0:
                org.telegram.messenger.g0.d0(wmVar.A0, new ei.e(10));
                fl flVar = wmVar.D0;
                if (flVar != null) {
                    flVar.O(false);
                    return;
                }
                return;
            case 1:
                wmVar.O7(true);
                return;
            case 2:
                wmVar.O7(true);
                return;
            case 3:
                wmVar.Yc();
                return;
            case 4:
                wmVar.O7(false);
                vg.v0 v0Var = new vg.v0((org.telegram.ui.ActionBar.d2) wmVar, 24, true);
                v0Var.f28611p0 = false;
                v0Var.I0 = new ce(wmVar, 2);
                v0Var.show();
                return;
            case 5:
                wm.x0(wmVar);
                return;
            case 6:
                if (wmVar.getUserConfig().q()) {
                    wmVar.f51418nc = null;
                    wmVar.vd(true);
                    org.telegram.ui.Components.fc.a0(wmVar).c(org.telegram.messenger.bd.M0(2131754488, null)).j();
                    wmVar.getMessagesController().o0(true);
                    return;
                }
                wmVar.showDialog(new vg.v0((org.telegram.ui.ActionBar.d2) wmVar, 3, true));
                return;
            case 7:
                mj mjVar = wmVar.f51237a0;
                if (mjVar != null) {
                    mjVar.n0(true);
                    return;
                }
                return;
            case 8:
                wm.Z(wmVar);
                return;
            case 9:
                wmVar.Ka = null;
                wmVar.Ja = -1;
                View view = wmVar.fragmentView;
                if (view != null) {
                    view.requestLayout();
                    return;
                }
                return;
            case 10:
                wmVar.Lc(false);
                return;
            case 11:
                ArrayList arrayList = wmVar.L6;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    TLRPC.Message message = ((org.telegram.messenger.zi) arrayList.get(i10)).f26868k;
                    if (message.mentioned && !message.media_unread) {
                        message.media_unread = false;
                    }
                }
                wmVar.C6 = 0;
                wmVar.getMessagesController().o3(wmVar.f51376k6, wmVar.b());
                wmVar.D6 = true;
                wmVar.nc(false);
                org.telegram.ui.ActionBar.f1 f1Var = wmVar.f51316f9;
                if (f1Var != null) {
                    f1Var.dismiss();
                    return;
                }
                return;
            case 12:
                ArrayList arrayList2 = wmVar.L6;
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    ((org.telegram.messenger.zi) arrayList2.get(i11)).i5();
                }
                wmVar.A1 = 0;
                wmVar.fd(true);
                wmVar.getMessagesController().t3(wmVar.f51376k6, wmVar.b());
                org.telegram.ui.ActionBar.f1 f1Var2 = wmVar.f51316f9;
                if (f1Var2 != null) {
                    f1Var2.dismiss();
                    return;
                }
                return;
            case 13:
                ArrayList arrayList3 = wmVar.L6;
                for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                    TLRPC.Message message2 = ((org.telegram.messenger.zi) arrayList3.get(i12)).f26868k;
                    if (message2 != null) {
                        TLRPC.MessageMedia messageMedia = message2.media;
                        if (messageMedia instanceof TLRPC.TL_messageMediaPoll) {
                            ((TLRPC.TL_messageMediaPoll) messageMedia).results.has_unread_votes = false;
                        }
                    }
                }
                wmVar.B1 = 0;
                wmVar.ed(true);
                wmVar.getMessagesController().s3(wmVar.f51376k6, wmVar.b());
                org.telegram.ui.ActionBar.f1 f1Var3 = wmVar.f51316f9;
                if (f1Var3 != null) {
                    f1Var3.dismiss();
                    return;
                }
                return;
            case 14:
                wm.z1(wmVar);
                return;
            case 15:
                wmVar.f51237a0.G0();
                return;
            case 16:
                wmVar.Ec(true);
                wmVar.ud(true);
                org.telegram.ui.Components.fc.z(wmVar, 4, 0, wmVar.f51557ya).j();
                return;
            case 17:
                org.telegram.ui.Components.fc.a0(wmVar).I(2131623981, org.telegram.messenger.bd.M0(2131753290, null), org.telegram.messenger.bd.M0(2131753291, null)).j();
                return;
            case 18:
                wmVar.finishFragment();
                return;
            case 19:
                wmVar.v8(false, true, 0.0f);
                return;
            case 20:
                org.telegram.messenger.g0.E2(wmVar.Y0);
                return;
            case 21:
                wmVar.P4 = null;
                wmVar.K9();
                wmVar.M9();
                return;
            case 22:
                wmVar.v8(false, true, 0.0f);
                return;
            case 23:
                wmVar.Ib = null;
                return;
            case 24:
                wmVar.g7();
                return;
            case 25:
                wmVar.I9 = false;
                wmVar.B9(true);
                return;
            case 26:
                wmVar.H7 = null;
                org.telegram.ui.Components.p40 p40Var = wmVar.f51448q3;
                if (p40Var != null) {
                    org.telegram.ui.Components.m40 cameraContainer = p40Var.getCameraContainer();
                    AnimatorSet animatorSet = new AnimatorSet();
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(cameraContainer, View.SCALE_X, 0.5f);
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(cameraContainer, View.SCALE_Y, 0.5f);
                    Property property = View.ALPHA;
                    animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(cameraContainer, property, 0.0f), ObjectAnimator.ofFloat(wmVar.f51448q3.getButtonsLayout(), property, 0.0f), ObjectAnimator.ofInt(wmVar.f51448q3.getPaint(), org.telegram.ui.Components.k6.f35323b, 0), ObjectAnimator.ofFloat(wmVar.f51448q3.getMuteImageView(), property, 0.0f));
                    animatorSet.addListener(new ai(wmVar, 0));
                    animatorSet.start();
                    return;
                }
                return;
            case 27:
                org.telegram.ui.ActionBar.y0[] y0VarArr = wmVar.f51342h9;
                if (y0VarArr != null && y0VarArr.length > 0 && (y0Var = y0VarArr[0]) != null) {
                    y0Var.requestFocus();
                    wmVar.f51342h9[0].performAccessibilityAction(64, null);
                    wmVar.f51342h9[0].sendAccessibilityEvent(8);
                    return;
                }
                return;
            case 28:
                pj pjVar = wmVar.I8;
                if (pjVar != null && pjVar.getParent() != null) {
                    wmVar.A0.g1();
                    wmVar.K8.setDrawingReady(false);
                    wmVar.I8.setTag(null);
                    wmVar.m1.removeView(wmVar.I8);
                    return;
                }
                return;
            default:
                wmVar.v8(false, true, 0.0f);
                return;
        }
    }
}
