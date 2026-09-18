package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
public final class rf implements Runnable {
    public final int f37049a;
    public final zn f37050b;

    public rf(zn znVar, int i10) {
        this.f37049a = i10;
        this.f37050b = znVar;
    }

    @Override
    public final void run() {
        lk lkVar;
        View sendButton;
        org.telegram.ui.ActionBar.f1 f1Var;
        int i10 = this.f37049a;
        zn znVar = this.f37050b;
        switch (i10) {
            case 0:
                znVar.A7(true);
                return;
            case 1:
                znVar.A7(true);
                return;
            case 2:
                znVar.A7(false);
                rg.x0 x0Var = new rg.x0((org.telegram.ui.ActionBar.n2) znVar, 24, true);
                x0Var.setDimBehind(false);
                x0Var.setOnHideListener(new jg(znVar, 1));
                x0Var.show();
                return;
            case 3:
                zn.M0(znVar);
                return;
            case 4:
                zn.U0(znVar);
                return;
            case 5:
                if (znVar.getUserConfig().isPremium()) {
                    znVar.Lb = null;
                    znVar.Qc(true);
                    org.telegram.ui.Components.xc.a0(znVar).c(LocaleController.getString(R.string.AdHidden)).j();
                    znVar.getMessagesController().disableAds(true);
                    return;
                }
                znVar.showDialog(new rg.x0((org.telegram.ui.ActionBar.n2) znVar, 3, true));
                return;
            case 6:
                lk lkVar2 = znVar.Y;
                if (lkVar2 != null) {
                    lkVar2.q0(true);
                    return;
                }
                return;
            case 7:
                znVar.Y.H0();
                return;
            case 8:
                znVar.f40406qa = null;
                znVar.f40394pa = -1;
                View view = znVar.fragmentView;
                if (view != null) {
                    view.requestLayout();
                    return;
                }
                return;
            case 9:
                ArrayList arrayList = znVar.f40455u6;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    MessageObject messageObject = (MessageObject) arrayList.get(i11);
                    if (messageObject.messageOwner.mentioned && !messageObject.isContentUnread()) {
                        messageObject.setContentIsRead();
                    }
                }
                znVar.f40342l6 = 0;
                znVar.getMessagesController().markMentionsAsRead(znVar.T5, znVar.d());
                znVar.f40354m6 = true;
                znVar.Kb(false);
                org.telegram.ui.ActionBar.n1 n1Var = znVar.Q8;
                if (n1Var != null) {
                    n1Var.dismiss();
                    return;
                }
                return;
            case 10:
                ArrayList arrayList2 = znVar.f40455u6;
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    ((MessageObject) arrayList2.get(i12)).markReactionsAsRead();
                }
                znVar.l1 = 0;
                znVar.Bc(true);
                znVar.getMessagesController().markReactionsAsRead(znVar.T5, znVar.d());
                org.telegram.ui.ActionBar.n1 n1Var2 = znVar.Q8;
                if (n1Var2 != null) {
                    n1Var2.dismiss();
                    return;
                }
                return;
            case 11:
                ArrayList arrayList3 = znVar.f40455u6;
                for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                    ((MessageObject) arrayList3.get(i13)).markPollVotesAsRead();
                }
                znVar.f40349m1 = 0;
                znVar.Ac(true);
                znVar.getMessagesController().markPollVotesAsRead(znVar.T5, znVar.d());
                org.telegram.ui.ActionBar.n1 n1Var3 = znVar.Q8;
                if (n1Var3 != null) {
                    n1Var3.dismiss();
                    return;
                }
                return;
            case 12:
                zn.r0(znVar);
                return;
            case 13:
                org.telegram.ui.Components.xc.a0(znVar).M(LocaleController.getString(R.string.BoostingRemoveRestrictionsSuccessTitle), LocaleController.getString(R.string.BoostingRemoveRestrictionsSuccessSubTitle), R.raw.chats_infotip).j();
                return;
            case 14:
                znVar.g8(false, true, 0.0f);
                return;
            case 15:
                znVar.hc(false);
                return;
            case 16:
                AndroidUtilities.removeFromParent(znVar.L0);
                return;
            case 17:
                znVar.C4 = null;
                znVar.o9();
                znVar.r9();
                return;
            case 18:
                znVar.S6();
                return;
            case 19:
                znVar.finishFragment();
                return;
            case 20:
                znVar.o9 = false;
                znVar.e9(true);
                return;
            case 21:
                pk pkVar = znVar.f40445t8;
                if (pkVar != null && pkVar.getParent() != null) {
                    znVar.f40488x0.g1();
                    znVar.f40470v8.setDrawingReady(false);
                    znVar.f40445t8.setTag(null);
                    znVar.X0.removeView(znVar.f40445t8);
                    return;
                }
                return;
            case 22:
                znVar.f40403q7 = null;
                org.telegram.ui.Components.f60 f60Var = znVar.f40216b3;
                if (f60Var != null) {
                    org.telegram.ui.Components.d60 cameraContainer = f60Var.getCameraContainer();
                    AnimatorSet animatorSet = new AnimatorSet();
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(cameraContainer, View.SCALE_X, 0.5f);
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(cameraContainer, View.SCALE_Y, 0.5f);
                    Property property = View.ALPHA;
                    animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(cameraContainer, property, 0.0f), ObjectAnimator.ofFloat(znVar.f40216b3.getButtonsLayout(), property, 0.0f), ObjectAnimator.ofInt(znVar.f40216b3.getPaint(), org.telegram.ui.Components.s6.f28064b, 0), ObjectAnimator.ofFloat(znVar.f40216b3.getMuteImageView(), property, 0.0f));
                    animatorSet.addListener(new wi(znVar, 0));
                    animatorSet.start();
                    return;
                }
                return;
            case 23:
                znVar.G5 = null;
                znVar.j8();
                return;
            case 24:
                znVar.G5 = null;
                znVar.j8();
                return;
            case 25:
                if (znVar.getParentActivity() != null && znVar.fragmentView != null && (lkVar = znVar.Y) != null && (sendButton = lkVar.getSendButton()) != null && znVar.Y.getEditField() != null && znVar.Y.getEditField().getText().length() >= 5) {
                    SharedConfig.increaseScheduledOrNoSoundHintShowed();
                    if (znVar.f40278g2 == null) {
                        hj hjVar = new hj(4, 0, znVar.getParentActivity(), znVar.f40261ea, false);
                        znVar.f40278g2 = hjVar;
                        hjVar.a();
                        znVar.f40278g2.setAlpha(0.0f);
                        znVar.f40278g2.setVisibility(4);
                        znVar.f40278g2.setText(LocaleController.getString(R.string.ScheduledOrNoSoundHint));
                        znVar.X0.addView(znVar.f40278g2, w7.y5.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                    }
                    znVar.f40278g2.f(sendButton, true);
                    znVar.f40290h2 = true;
                    return;
                }
                return;
            case 26:
                org.telegram.ui.ActionBar.f1[] f1VarArr = znVar.S8;
                if (f1VarArr != null && f1VarArr.length > 0 && (f1Var = f1VarArr[0]) != null) {
                    f1Var.requestFocus();
                    znVar.S8[0].performAccessibilityAction(64, null);
                    znVar.S8[0].sendAccessibilityEvent(8);
                    return;
                }
                return;
            case 27:
                znVar.g8(false, true, 0.0f);
                return;
            case 28:
                znVar.A0.M.clear();
                lm lmVar = znVar.A0;
                lmVar.L = false;
                lmVar.O(true);
                znVar.Pb(false);
                return;
            default:
                AndroidUtilities.removeFromParent(znVar.J0);
                return;
        }
    }
}
