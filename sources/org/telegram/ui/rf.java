package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
public final class rf implements Runnable {
    public final int f41406a;
    public final zn f41407b;

    public rf(zn znVar, int i10) {
        this.f41406a = i10;
        this.f41407b = znVar;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.f1 f1Var;
        ok okVar;
        View sendButton;
        View sendButton2;
        int i10 = this.f41406a;
        zn znVar = this.f41407b;
        switch (i10) {
            case 0:
                znVar.D7(true);
                return;
            case 1:
                znVar.D7(true);
                return;
            case 2:
                znVar.D7(false);
                rg.y0 y0Var = new rg.y0((org.telegram.ui.ActionBar.n2) znVar, 24, true);
                y0Var.setDimBehind(false);
                y0Var.setOnHideListener(new qe(znVar, 2));
                y0Var.show();
                return;
            case 3:
                zn.U(znVar);
                return;
            case 4:
                zn.f0(znVar);
                return;
            case 5:
                if (znVar.getUserConfig().isPremium()) {
                    znVar.Mb = null;
                    znVar.Uc(true);
                    org.telegram.ui.Components.ad.a0(znVar).c(LocaleController.getString(R.string.AdHidden)).j();
                    znVar.getMessagesController().disableAds(true);
                    return;
                }
                znVar.showDialog(new rg.y0((org.telegram.ui.ActionBar.n2) znVar, 3, true));
                return;
            case 6:
                ok okVar2 = znVar.Y;
                if (okVar2 != null) {
                    okVar2.o0(true);
                    return;
                }
                return;
            case 7:
                znVar.f44907qa = null;
                znVar.f44895pa = -1;
                View view = znVar.fragmentView;
                if (view != null) {
                    view.requestLayout();
                    return;
                }
                return;
            case 8:
                ArrayList arrayList = znVar.f44956u6;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    MessageObject messageObject = (MessageObject) arrayList.get(i11);
                    if (messageObject.messageOwner.mentioned && !messageObject.isContentUnread()) {
                        messageObject.setContentIsRead();
                    }
                }
                znVar.f44843l6 = 0;
                znVar.getMessagesController().markMentionsAsRead(znVar.T5, znVar.d());
                znVar.f44855m6 = true;
                znVar.Ob(false);
                org.telegram.ui.ActionBar.n1 n1Var = znVar.Q8;
                if (n1Var != null) {
                    n1Var.dismiss();
                    return;
                }
                return;
            case 9:
                ArrayList arrayList2 = znVar.f44956u6;
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    ((MessageObject) arrayList2.get(i12)).markReactionsAsRead();
                }
                znVar.l1 = 0;
                znVar.Fc(true);
                znVar.getMessagesController().markReactionsAsRead(znVar.T5, znVar.d());
                org.telegram.ui.ActionBar.n1 n1Var2 = znVar.Q8;
                if (n1Var2 != null) {
                    n1Var2.dismiss();
                    return;
                }
                return;
            case 10:
                ArrayList arrayList3 = znVar.f44956u6;
                for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                    ((MessageObject) arrayList3.get(i13)).markPollVotesAsRead();
                }
                znVar.f44850m1 = 0;
                znVar.Ec(true);
                znVar.getMessagesController().markPollVotesAsRead(znVar.T5, znVar.d());
                org.telegram.ui.ActionBar.n1 n1Var3 = znVar.Q8;
                if (n1Var3 != null) {
                    n1Var3.dismiss();
                    return;
                }
                return;
            case 11:
                znVar.Y.F0();
                return;
            case 12:
                zn.g0(znVar);
                return;
            case 13:
                znVar.j8(false, true, 0.0f);
                return;
            case 14:
                org.telegram.ui.Components.ad.a0(znVar).M(LocaleController.getString(R.string.BoostingRemoveRestrictionsSuccessTitle), LocaleController.getString(R.string.BoostingRemoveRestrictionsSuccessSubTitle), R.raw.chats_infotip).j();
                return;
            case 15:
                znVar.j8(false, true, 0.0f);
                return;
            case 16:
                znVar.G5 = null;
                znVar.m8();
                return;
            case 17:
                znVar.G5 = null;
                znVar.m8();
                return;
            case 18:
                znVar.finishFragment();
                return;
            case 19:
                znVar.j8(false, true, 0.0f);
                return;
            case 20:
                znVar.C4 = null;
                znVar.t9();
                znVar.w9();
                return;
            case 21:
                znVar.V6();
                return;
            case 22:
                org.telegram.ui.ActionBar.f1[] f1VarArr = znVar.S8;
                if (f1VarArr != null && f1VarArr.length > 0 && (f1Var = f1VarArr[0]) != null) {
                    f1Var.requestFocus();
                    znVar.S8[0].performAccessibilityAction(64, null);
                    znVar.S8[0].sendAccessibilityEvent(8);
                    return;
                }
                return;
            case 23:
                org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(znVar.getParentActivity(), 3, znVar.f44763ea);
                znVar.f44896pb = b2Var;
                b2Var.setOnShowListener(new pf(znVar, 1));
                znVar.f44896pb.setOnCancelListener(znVar.f44859ma);
                znVar.f44896pb.q(500L);
                return;
            case 24:
                rk rkVar = znVar.f44946t8;
                if (rkVar != null && rkVar.getParent() != null) {
                    znVar.f44990x0.f1();
                    znVar.f44971v8.setDrawingReady(false);
                    znVar.f44946t8.setTag(null);
                    znVar.X0.removeView(znVar.f44946t8);
                    return;
                }
                return;
            case 25:
                znVar.o9 = false;
                znVar.j9(true);
                return;
            case 26:
                znVar.f44904q7 = null;
                org.telegram.ui.Components.y60 y60Var = znVar.f44717b3;
                if (y60Var != null) {
                    org.telegram.ui.Components.v60 cameraContainer = y60Var.getCameraContainer();
                    AnimatorSet animatorSet = new AnimatorSet();
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(cameraContainer, View.SCALE_X, 0.5f);
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(cameraContainer, View.SCALE_Y, 0.5f);
                    Property property = View.ALPHA;
                    animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(cameraContainer, property, 0.0f), ObjectAnimator.ofFloat(znVar.f44717b3.getButtonsLayout(), property, 0.0f), ObjectAnimator.ofInt(znVar.f44717b3.getPaint(), org.telegram.ui.Components.u6.f31379b, 0), ObjectAnimator.ofFloat(znVar.f44717b3.getMuteImageView(), property, 0.0f));
                    animatorSet.addListener(new xi(znVar, 0));
                    animatorSet.start();
                    return;
                }
                return;
            case 27:
                if (znVar.getParentActivity() != null && znVar.fragmentView != null && (okVar = znVar.Y) != null && (sendButton = okVar.getSendButton()) != null && znVar.Y.getEditField() != null && znVar.Y.getEditField().getText().length() >= 5) {
                    SharedConfig.increaseScheduledOrNoSoundHintShowed();
                    if (znVar.f44780g2 == null) {
                        jj jjVar = new jj(4, 0, znVar.getParentActivity(), znVar.f44763ea, false);
                        znVar.f44780g2 = jjVar;
                        jjVar.a();
                        znVar.f44780g2.setAlpha(0.0f);
                        znVar.f44780g2.setVisibility(4);
                        znVar.f44780g2.setText(LocaleController.getString(R.string.ScheduledOrNoSoundHint));
                        znVar.X0.addView(znVar.f44780g2, w7.x5.a(-2.0f, 10.0f, 0.0f, 10.0f, 0.0f, -2, 51));
                    }
                    znVar.f44780g2.f(sendButton, true);
                    znVar.f44791h2 = true;
                    return;
                }
                return;
            case 28:
                znVar.A0.M.clear();
                mm mmVar = znVar.A0;
                mmVar.L = false;
                mmVar.O(true);
                znVar.Tb(false);
                return;
            default:
                if (znVar.getParentActivity() != null && znVar.fragmentView != null && znVar.Y != null && znVar.Fa == null && znVar.getMessagesController().getSendPaidMessagesStars(znVar.a()) <= 0 && (sendButton2 = znVar.Y.getSendButton()) != null && znVar.Y.getEditField() != null && znVar.Y.getEditField().getText().length() != 0) {
                    SharedConfig.increaseScheduledHintShowed();
                    if (znVar.f44803i2 == null) {
                        org.telegram.ui.Components.z40 z40Var = new org.telegram.ui.Components.z40(4, znVar.getParentActivity(), znVar.f44763ea, false);
                        znVar.f44803i2 = z40Var;
                        z40Var.a();
                        znVar.f44803i2.setAlpha(0.0f);
                        znVar.f44803i2.setVisibility(4);
                        znVar.f44803i2.setText(LocaleController.getString(R.string.ScheduledHint));
                        znVar.X0.addView(znVar.f44803i2, w7.x5.a(-2.0f, 10.0f, 0.0f, 10.0f, 0.0f, -2, 51));
                    }
                    znVar.f44803i2.f(sendButton2, true);
                    znVar.f44816j2 = true;
                    return;
                }
                return;
        }
    }
}
