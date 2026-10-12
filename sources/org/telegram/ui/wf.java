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
public final class wf implements Runnable {
    public final int f41583a;
    public final fo f41584b;

    public wf(fo foVar, int i10) {
        this.f41583a = i10;
        this.f41584b = foVar;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.e1 e1Var;
        sk skVar;
        View sendButton;
        View sendButton2;
        int i10 = this.f41583a;
        fo foVar = this.f41584b;
        switch (i10) {
            case 0:
                foVar.D7(true);
                return;
            case 1:
                foVar.D7(true);
                return;
            case 2:
                foVar.D7(false);
                sg.y0 y0Var = new sg.y0((org.telegram.ui.ActionBar.m2) foVar, 24, true);
                y0Var.setDimBehind(false);
                y0Var.setOnHideListener(new we(foVar, 2));
                y0Var.show();
                return;
            case 3:
                fo.U(foVar);
                return;
            case 4:
                fo.f0(foVar);
                return;
            case 5:
                if (foVar.getUserConfig().isPremium()) {
                    foVar.Mb = null;
                    foVar.Uc(true);
                    org.telegram.ui.Components.zc.a0(foVar).c(LocaleController.getString(R.string.AdHidden)).j();
                    foVar.getMessagesController().disableAds(true);
                    return;
                }
                foVar.showDialog(new sg.y0((org.telegram.ui.ActionBar.m2) foVar, 3, true));
                return;
            case 6:
                sk skVar2 = foVar.Y;
                if (skVar2 != null) {
                    skVar2.o0(true);
                    return;
                }
                return;
            case 7:
                foVar.f36077qa = null;
                foVar.f36065pa = -1;
                View view = foVar.fragmentView;
                if (view != null) {
                    view.requestLayout();
                    return;
                }
                return;
            case 8:
                ArrayList arrayList = foVar.f36127u6;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    MessageObject messageObject = (MessageObject) arrayList.get(i11);
                    if (messageObject.messageOwner.mentioned && !messageObject.isContentUnread()) {
                        messageObject.setContentIsRead();
                    }
                }
                foVar.f36013l6 = 0;
                foVar.getMessagesController().markMentionsAsRead(foVar.T5, foVar.d());
                foVar.f36025m6 = true;
                foVar.Ob(false);
                org.telegram.ui.ActionBar.m1 m1Var = foVar.Q8;
                if (m1Var != null) {
                    m1Var.dismiss();
                    return;
                }
                return;
            case 9:
                ArrayList arrayList2 = foVar.f36127u6;
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    ((MessageObject) arrayList2.get(i12)).markReactionsAsRead();
                }
                foVar.l1 = 0;
                foVar.Fc(true);
                foVar.getMessagesController().markReactionsAsRead(foVar.T5, foVar.d());
                org.telegram.ui.ActionBar.m1 m1Var2 = foVar.Q8;
                if (m1Var2 != null) {
                    m1Var2.dismiss();
                    return;
                }
                return;
            case 10:
                ArrayList arrayList3 = foVar.f36127u6;
                for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                    ((MessageObject) arrayList3.get(i13)).markPollVotesAsRead();
                }
                foVar.f36020m1 = 0;
                foVar.Ec(true);
                foVar.getMessagesController().markPollVotesAsRead(foVar.T5, foVar.d());
                org.telegram.ui.ActionBar.m1 m1Var3 = foVar.Q8;
                if (m1Var3 != null) {
                    m1Var3.dismiss();
                    return;
                }
                return;
            case 11:
                foVar.Y.F0();
                return;
            case 12:
                fo.g0(foVar);
                return;
            case 13:
                foVar.j8(false, true, 0.0f);
                return;
            case 14:
                org.telegram.ui.Components.zc.a0(foVar).M(LocaleController.getString(R.string.BoostingRemoveRestrictionsSuccessTitle), LocaleController.getString(R.string.BoostingRemoveRestrictionsSuccessSubTitle), R.raw.chats_infotip).j();
                return;
            case 15:
                foVar.j8(false, true, 0.0f);
                return;
            case 16:
                foVar.G5 = null;
                foVar.m8();
                return;
            case 17:
                foVar.G5 = null;
                foVar.m8();
                return;
            case 18:
                foVar.finishFragment();
                return;
            case 19:
                foVar.j8(false, true, 0.0f);
                return;
            case 20:
                foVar.C4 = null;
                foVar.t9();
                foVar.w9();
                return;
            case 21:
                foVar.V6();
                return;
            case 22:
                org.telegram.ui.ActionBar.e1[] e1VarArr = foVar.S8;
                if (e1VarArr != null && e1VarArr.length > 0 && (e1Var = e1VarArr[0]) != null) {
                    e1Var.requestFocus();
                    foVar.S8[0].performAccessibilityAction(64, null);
                    foVar.S8[0].sendAccessibilityEvent(8);
                    return;
                }
                return;
            case 23:
                org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(foVar.getParentActivity(), 3, foVar.f35932ea);
                foVar.f36066pb = a2Var;
                a2Var.setOnShowListener(new uf(foVar, 1));
                foVar.f36066pb.setOnCancelListener(foVar.f36029ma);
                foVar.f36066pb.q(500L);
                return;
            case 24:
                vk vkVar = foVar.f36116t8;
                if (vkVar != null && vkVar.getParent() != null) {
                    foVar.f36160x0.f1();
                    foVar.f36141v8.setDrawingReady(false);
                    foVar.f36116t8.setTag(null);
                    foVar.X0.removeView(foVar.f36116t8);
                    return;
                }
                return;
            case 25:
                foVar.f36055o9 = false;
                foVar.j9(true);
                return;
            case 26:
                foVar.f36074q7 = null;
                org.telegram.ui.Components.u60 u60Var = foVar.f35887b3;
                if (u60Var != null) {
                    org.telegram.ui.Components.r60 cameraContainer = u60Var.getCameraContainer();
                    AnimatorSet animatorSet = new AnimatorSet();
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(cameraContainer, View.SCALE_X, 0.5f);
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(cameraContainer, View.SCALE_Y, 0.5f);
                    Property property = View.ALPHA;
                    animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(cameraContainer, property, 0.0f), ObjectAnimator.ofFloat(foVar.f35887b3.getButtonsLayout(), property, 0.0f), ObjectAnimator.ofInt(foVar.f35887b3.getPaint(), org.telegram.ui.Components.v6.f29900b, 0), ObjectAnimator.ofFloat(foVar.f35887b3.getMuteImageView(), property, 0.0f));
                    animatorSet.addListener(new bj(foVar, 0));
                    animatorSet.start();
                    return;
                }
                return;
            case 27:
                if (foVar.getParentActivity() != null && foVar.fragmentView != null && (skVar = foVar.Y) != null && (sendButton = skVar.getSendButton()) != null && foVar.Y.getEditField() != null && foVar.Y.getEditField().getText().length() >= 5) {
                    SharedConfig.increaseScheduledOrNoSoundHintShowed();
                    if (foVar.f35949g2 == null) {
                        nj njVar = new nj(4, 0, foVar.getParentActivity(), foVar.f35932ea, false);
                        foVar.f35949g2 = njVar;
                        njVar.a();
                        foVar.f35949g2.setAlpha(0.0f);
                        foVar.f35949g2.setVisibility(4);
                        foVar.f35949g2.setText(LocaleController.getString(R.string.ScheduledOrNoSoundHint));
                        foVar.X0.addView(foVar.f35949g2, w7.a6.a(-2.0f, 10.0f, 0.0f, 10.0f, 0.0f, -2, 51));
                    }
                    foVar.f35949g2.f(sendButton, true);
                    foVar.f35962h2 = true;
                    return;
                }
                return;
            case 28:
                foVar.A0.M.clear();
                rm rmVar = foVar.A0;
                rmVar.L = false;
                rmVar.O(true);
                foVar.Tb(false);
                return;
            default:
                if (foVar.getParentActivity() != null && foVar.fragmentView != null && foVar.Y != null && foVar.Fa == null && foVar.getMessagesController().getSendPaidMessagesStars(foVar.a()) <= 0 && (sendButton2 = foVar.Y.getSendButton()) != null && foVar.Y.getEditField() != null && foVar.Y.getEditField().getText().length() != 0) {
                    SharedConfig.increaseScheduledHintShowed();
                    if (foVar.f35973i2 == null) {
                        org.telegram.ui.Components.v40 v40Var = new org.telegram.ui.Components.v40(4, foVar.getParentActivity(), foVar.f35932ea, false);
                        foVar.f35973i2 = v40Var;
                        v40Var.a();
                        foVar.f35973i2.setAlpha(0.0f);
                        foVar.f35973i2.setVisibility(4);
                        foVar.f35973i2.setText(LocaleController.getString(R.string.ScheduledHint));
                        foVar.X0.addView(foVar.f35973i2, w7.a6.a(-2.0f, 10.0f, 0.0f, 10.0f, 0.0f, -2, 51));
                    }
                    foVar.f35973i2.f(sendButton2, true);
                    foVar.f35985j2 = true;
                    return;
                }
                return;
        }
    }
}
