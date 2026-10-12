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
public final class vf implements Runnable {
    public final int f42774a;
    public final eo f42775b;

    public vf(eo eoVar, int i10) {
        this.f42774a = i10;
        this.f42775b = eoVar;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.e1 e1Var;
        sk skVar;
        View sendButton;
        View sendButton2;
        int i10 = this.f42774a;
        eo eoVar = this.f42775b;
        switch (i10) {
            case 0:
                eoVar.D7(true);
                return;
            case 1:
                eoVar.D7(true);
                return;
            case 2:
                eoVar.D7(false);
                rg.y0 y0Var = new rg.y0((org.telegram.ui.ActionBar.m2) eoVar, 24, true);
                y0Var.setDimBehind(false);
                y0Var.setOnHideListener(new ue(eoVar, 2));
                y0Var.show();
                return;
            case 3:
                eo.U(eoVar);
                return;
            case 4:
                eo.f0(eoVar);
                return;
            case 5:
                if (eoVar.getUserConfig().isPremium()) {
                    eoVar.Mb = null;
                    eoVar.Uc(true);
                    org.telegram.ui.Components.zc.a0(eoVar).c(LocaleController.getString(R.string.AdHidden)).j();
                    eoVar.getMessagesController().disableAds(true);
                    return;
                }
                eoVar.showDialog(new rg.y0((org.telegram.ui.ActionBar.m2) eoVar, 3, true));
                return;
            case 6:
                sk skVar2 = eoVar.Y;
                if (skVar2 != null) {
                    skVar2.r0(true);
                    return;
                }
                return;
            case 7:
                eoVar.f37395qa = null;
                eoVar.f37383pa = -1;
                View view = eoVar.fragmentView;
                if (view != null) {
                    view.requestLayout();
                    return;
                }
                return;
            case 8:
                ArrayList arrayList = eoVar.f37444u6;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    MessageObject messageObject = (MessageObject) arrayList.get(i11);
                    if (messageObject.messageOwner.mentioned && !messageObject.isContentUnread()) {
                        messageObject.setContentIsRead();
                    }
                }
                eoVar.f37331l6 = 0;
                eoVar.getMessagesController().markMentionsAsRead(eoVar.T5, eoVar.d());
                eoVar.f37343m6 = true;
                eoVar.Ob(false);
                org.telegram.ui.ActionBar.m1 m1Var = eoVar.Q8;
                if (m1Var != null) {
                    m1Var.dismiss();
                    return;
                }
                return;
            case 9:
                ArrayList arrayList2 = eoVar.f37444u6;
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    ((MessageObject) arrayList2.get(i12)).markReactionsAsRead();
                }
                eoVar.l1 = 0;
                eoVar.Fc(true);
                eoVar.getMessagesController().markReactionsAsRead(eoVar.T5, eoVar.d());
                org.telegram.ui.ActionBar.m1 m1Var2 = eoVar.Q8;
                if (m1Var2 != null) {
                    m1Var2.dismiss();
                    return;
                }
                return;
            case 10:
                ArrayList arrayList3 = eoVar.f37444u6;
                for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                    ((MessageObject) arrayList3.get(i13)).markPollVotesAsRead();
                }
                eoVar.f37338m1 = 0;
                eoVar.Ec(true);
                eoVar.getMessagesController().markPollVotesAsRead(eoVar.T5, eoVar.d());
                org.telegram.ui.ActionBar.m1 m1Var3 = eoVar.Q8;
                if (m1Var3 != null) {
                    m1Var3.dismiss();
                    return;
                }
                return;
            case 11:
                eoVar.Y.J0();
                return;
            case 12:
                eo.g0(eoVar);
                return;
            case 13:
                eoVar.j8(false, true, 0.0f);
                return;
            case 14:
                org.telegram.ui.Components.zc.a0(eoVar).M(LocaleController.getString(R.string.BoostingRemoveRestrictionsSuccessTitle), LocaleController.getString(R.string.BoostingRemoveRestrictionsSuccessSubTitle), R.raw.chats_infotip).j();
                return;
            case 15:
                eoVar.j8(false, true, 0.0f);
                return;
            case 16:
                eoVar.G5 = null;
                eoVar.m8();
                return;
            case 17:
                eoVar.G5 = null;
                eoVar.m8();
                return;
            case 18:
                eoVar.finishFragment();
                return;
            case 19:
                eoVar.j8(false, true, 0.0f);
                return;
            case 20:
                eoVar.C4 = null;
                eoVar.t9();
                eoVar.w9();
                return;
            case 21:
                eoVar.V6();
                return;
            case 22:
                org.telegram.ui.ActionBar.e1[] e1VarArr = eoVar.S8;
                if (e1VarArr != null && e1VarArr.length > 0 && (e1Var = e1VarArr[0]) != null) {
                    e1Var.requestFocus();
                    eoVar.S8[0].performAccessibilityAction(64, null);
                    eoVar.S8[0].sendAccessibilityEvent(8);
                    return;
                }
                return;
            case 23:
                org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(eoVar.getParentActivity(), 3, eoVar.f37251ea);
                eoVar.f37384pb = a2Var;
                a2Var.setOnShowListener(new tf(eoVar, 1));
                eoVar.f37384pb.setOnCancelListener(eoVar.f37347ma);
                eoVar.f37384pb.q(500L);
                return;
            case 24:
                vk vkVar = eoVar.f37434t8;
                if (vkVar != null && vkVar.getParent() != null) {
                    eoVar.f37478x0.f1();
                    eoVar.f37459v8.setDrawingReady(false);
                    eoVar.f37434t8.setTag(null);
                    eoVar.X0.removeView(eoVar.f37434t8);
                    return;
                }
                return;
            case 25:
                eoVar.o9 = false;
                eoVar.j9(true);
                return;
            case 26:
                eoVar.f37392q7 = null;
                org.telegram.ui.Components.b70 b70Var = eoVar.f37205b3;
                if (b70Var != null) {
                    org.telegram.ui.Components.y60 cameraContainer = b70Var.getCameraContainer();
                    AnimatorSet animatorSet = new AnimatorSet();
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(cameraContainer, View.SCALE_X, 0.5f);
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(cameraContainer, View.SCALE_Y, 0.5f);
                    Property property = View.ALPHA;
                    animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(cameraContainer, property, 0.0f), ObjectAnimator.ofFloat(eoVar.f37205b3.getButtonsLayout(), property, 0.0f), ObjectAnimator.ofInt(eoVar.f37205b3.getPaint(), org.telegram.ui.Components.u6.f31060b, 0), ObjectAnimator.ofFloat(eoVar.f37205b3.getMuteImageView(), property, 0.0f));
                    animatorSet.addListener(new bj(eoVar, 0));
                    animatorSet.start();
                    return;
                }
                return;
            case 27:
                if (eoVar.getParentActivity() != null && eoVar.fragmentView != null && (skVar = eoVar.Y) != null && (sendButton = skVar.getSendButton()) != null && eoVar.Y.getEditField() != null && eoVar.Y.getEditField().getText().length() >= 5) {
                    SharedConfig.increaseScheduledOrNoSoundHintShowed();
                    if (eoVar.f37268g2 == null) {
                        nj njVar = new nj(4, 0, eoVar.getParentActivity(), eoVar.f37251ea, false);
                        eoVar.f37268g2 = njVar;
                        njVar.a();
                        eoVar.f37268g2.setAlpha(0.0f);
                        eoVar.f37268g2.setVisibility(4);
                        eoVar.f37268g2.setText(LocaleController.getString(R.string.ScheduledOrNoSoundHint));
                        eoVar.X0.addView(eoVar.f37268g2, w7.w5.a(-2.0f, 10.0f, 0.0f, 10.0f, 0.0f, -2, 51));
                    }
                    eoVar.f37268g2.f(sendButton, true);
                    eoVar.f37279h2 = true;
                    return;
                }
                return;
            case 28:
                eoVar.A0.M.clear();
                qm qmVar = eoVar.A0;
                qmVar.L = false;
                qmVar.O(true);
                eoVar.Tb(false);
                return;
            default:
                if (eoVar.getParentActivity() != null && eoVar.fragmentView != null && eoVar.Y != null && eoVar.Fa == null && eoVar.getMessagesController().getSendPaidMessagesStars(eoVar.a()) <= 0 && (sendButton2 = eoVar.Y.getSendButton()) != null && eoVar.Y.getEditField() != null && eoVar.Y.getEditField().getText().length() != 0) {
                    SharedConfig.increaseScheduledHintShowed();
                    if (eoVar.f37291i2 == null) {
                        org.telegram.ui.Components.c50 c50Var = new org.telegram.ui.Components.c50(4, eoVar.getParentActivity(), eoVar.f37251ea, false);
                        eoVar.f37291i2 = c50Var;
                        c50Var.a();
                        eoVar.f37291i2.setAlpha(0.0f);
                        eoVar.f37291i2.setVisibility(4);
                        eoVar.f37291i2.setText(LocaleController.getString(R.string.ScheduledHint));
                        eoVar.X0.addView(eoVar.f37291i2, w7.w5.a(-2.0f, 10.0f, 0.0f, 10.0f, 0.0f, -2, 51));
                    }
                    eoVar.f37291i2.f(sendButton2, true);
                    eoVar.f37304j2 = true;
                    return;
                }
                return;
        }
    }
}
