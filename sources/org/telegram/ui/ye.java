package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ye implements Runnable {
    public final int f53495a;
    public final an f53496b;

    public ye(an anVar, int i7) {
        this.f53495a = i7;
        this.f53496b = anVar;
    }

    @Override
    public final void run() {
        int i7 = this.f53495a;
        an anVar = this.f53496b;
        switch (i7) {
            case 0:
                org.telegram.messenger.g0.d0(anVar.A0, new fi.e(11));
                jl jlVar = anVar.D0;
                if (jlVar != null) {
                    jlVar.O(true);
                    return;
                }
                return;
            case 1:
                anVar.P7(true);
                return;
            case 2:
                anVar.P7(true);
                return;
            case 3:
                org.telegram.messenger.g0.d0(anVar.A0, new fi.e(10));
                jl jlVar2 = anVar.D0;
                if (jlVar2 != null) {
                    jlVar2.O(false);
                    return;
                }
                return;
            case 4:
                anVar.cd();
                return;
            case 5:
                anVar.P7(false);
                ug.x0 x0Var = new ug.x0((org.telegram.ui.ActionBar.e2) anVar, 24, true);
                x0Var.f29710p0 = false;
                x0Var.I0 = new ge(anVar, 7);
                x0Var.show();
                return;
            case 6:
                an.A0(anVar);
                return;
            case 7:
                if (anVar.getUserConfig().q()) {
                    anVar.f45325pc = null;
                    anVar.zd(true);
                    org.telegram.ui.Components.cc.a0(anVar).c(org.telegram.messenger.hd.M0(2131754488, null)).j();
                    anVar.getMessagesController().o0(true);
                    return;
                }
                anVar.showDialog(new ug.x0((org.telegram.ui.ActionBar.e2) anVar, 3, true));
                return;
            case 8:
                qj qjVar = anVar.f45118a0;
                if (qjVar != null) {
                    qjVar.C0(true);
                    return;
                }
                return;
            case 9:
                an.Z(anVar);
                return;
            case 10:
                anVar.Ma = null;
                anVar.La = -1;
                View view = anVar.fragmentView;
                if (view != null) {
                    view.requestLayout();
                    return;
                }
                return;
            case 11:
                ArrayList arrayList = anVar.L6;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    TLRPC.Message message = ((org.telegram.messenger.gj) arrayList.get(i10)).f23817k;
                    if (message.mentioned && !message.media_unread) {
                        message.media_unread = false;
                    }
                }
                anVar.C6 = 0;
                anVar.getMessagesController().o3(anVar.f45259k6, anVar.b());
                anVar.D6 = true;
                anVar.rc(false);
                org.telegram.ui.ActionBar.g1 g1Var = anVar.f45197f9;
                if (g1Var != null) {
                    g1Var.dismiss();
                    return;
                }
                return;
            case 12:
                ArrayList arrayList2 = anVar.L6;
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    ((org.telegram.messenger.gj) arrayList2.get(i11)).h5();
                }
                anVar.A1 = 0;
                anVar.jd(true);
                anVar.getMessagesController().t3(anVar.f45259k6, anVar.b());
                org.telegram.ui.ActionBar.g1 g1Var2 = anVar.f45197f9;
                if (g1Var2 != null) {
                    g1Var2.dismiss();
                    return;
                }
                return;
            case 13:
                ArrayList arrayList3 = anVar.L6;
                for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                    TLRPC.Message message2 = ((org.telegram.messenger.gj) arrayList3.get(i12)).f23817k;
                    if (message2 != null) {
                        TLRPC.MessageMedia messageMedia = message2.media;
                        if (messageMedia instanceof TLRPC.TL_messageMediaPoll) {
                            ((TLRPC.TL_messageMediaPoll) messageMedia).results.has_unread_votes = false;
                        }
                    }
                }
                anVar.B1 = 0;
                anVar.id(true);
                anVar.getMessagesController().s3(anVar.f45259k6, anVar.b());
                org.telegram.ui.ActionBar.g1 g1Var3 = anVar.f45197f9;
                if (g1Var3 != null) {
                    g1Var3.dismiss();
                    return;
                }
                return;
            case 14:
                an.D1(anVar);
                return;
            case 15:
                anVar.x8(false, true, 0.0f);
                return;
            case 16:
                anVar.Ic(true);
                anVar.yd(true);
                org.telegram.ui.Components.cc.z(anVar, 4, 0, anVar.Aa).j();
                return;
            case 17:
                anVar.f45118a0.W0();
                return;
            case 18:
                org.telegram.messenger.g0.E2(anVar.Y0);
                return;
            case 19:
                org.telegram.ui.Components.cc.a0(anVar).I(2131623982, org.telegram.messenger.hd.M0(2131753290, null), org.telegram.messenger.hd.M0(2131753291, null)).j();
                return;
            case 20:
                anVar.P4 = null;
                anVar.M9();
                anVar.O9();
                return;
            case 21:
                anVar.Pc(false);
                return;
            case 22:
                anVar.Kb = null;
                return;
            case 23:
                anVar.K9 = false;
                anVar.D9(true);
                return;
            case 24:
                anVar.H7 = null;
                org.telegram.ui.Components.w40 w40Var = anVar.f45329q3;
                if (w40Var != null) {
                    org.telegram.ui.Components.t40 cameraContainer = w40Var.getCameraContainer();
                    AnimatorSet animatorSet = new AnimatorSet();
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(cameraContainer, View.SCALE_X, 0.5f);
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(cameraContainer, View.SCALE_Y, 0.5f);
                    Property property = View.ALPHA;
                    animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(cameraContainer, property, 0.0f), ObjectAnimator.ofFloat(anVar.f45329q3.getButtonsLayout(), property, 0.0f), ObjectAnimator.ofInt(anVar.f45329q3.getPaint(), org.telegram.ui.Components.k6.f36298b, 0), ObjectAnimator.ofFloat(anVar.f45329q3.getMuteImageView(), property, 0.0f));
                    animatorSet.addListener(new ei(anVar, 0));
                    animatorSet.start();
                    return;
                }
                return;
            case 25:
                anVar.h7();
                return;
            case 26:
                qj qjVar2 = anVar.f45118a0;
                if (qjVar2 != null && anVar.f45252jd != null) {
                    if (qjVar2.G0()) {
                        anVar.f45118a0.y0(false);
                        org.telegram.messenger.g0.J3(anVar.f45252jd.f56846a);
                        ((te.a) anVar.f45252jd.f56847b.f12459b).a(false, true);
                        return;
                    }
                    anVar.f45118a0.l1(false, false, false);
                    anVar.f45118a0.K1();
                    ((te.a) anVar.f45252jd.f56847b.f12459b).a(true, true);
                    return;
                }
                return;
            case 27:
                tj tjVar = anVar.I8;
                if (tjVar != null && tjVar.getParent() != null) {
                    anVar.A0.g1();
                    anVar.K8.setDrawingReady(false);
                    anVar.I8.setTag(null);
                    anVar.f45278m1.removeView(anVar.I8);
                    return;
                }
                return;
            case 28:
                anVar.Va();
                return;
            default:
                anVar.B9();
                anVar.gd(0, true);
                return;
        }
    }
}
