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
    public final int f37113a;
    public final xn f37114b;

    public rf(xn xnVar, int i10) {
        this.f37113a = i10;
        this.f37114b = xnVar;
    }

    @Override
    public final void run() {
        lk lkVar;
        View sendButton;
        org.telegram.ui.ActionBar.g1 g1Var;
        int i10 = this.f37113a;
        xn xnVar = this.f37114b;
        switch (i10) {
            case 0:
                xnVar.A7(true);
                return;
            case 1:
                xnVar.A7(true);
                return;
            case 2:
                xnVar.A7(false);
                rg.x0 x0Var = new rg.x0((org.telegram.ui.ActionBar.o2) xnVar, 24, true);
                x0Var.setDimBehind(false);
                x0Var.setOnHideListener(new jg(xnVar, 1));
                x0Var.show();
                return;
            case 3:
                xn.L0(xnVar);
                return;
            case 4:
                xn.T0(xnVar);
                return;
            case 5:
                if (xnVar.getUserConfig().isPremium()) {
                    xnVar.Lb = null;
                    xnVar.Qc(true);
                    org.telegram.ui.Components.xc.a0(xnVar).c(LocaleController.getString(R.string.AdHidden)).j();
                    xnVar.getMessagesController().disableAds(true);
                    return;
                }
                xnVar.showDialog(new rg.x0((org.telegram.ui.ActionBar.o2) xnVar, 3, true));
                return;
            case 6:
                lk lkVar2 = xnVar.Y;
                if (lkVar2 != null) {
                    lkVar2.q0(true);
                    return;
                }
                return;
            case 7:
                xnVar.Y.H0();
                return;
            case 8:
                xnVar.f39895qa = null;
                xnVar.f39883pa = -1;
                View view = xnVar.fragmentView;
                if (view != null) {
                    view.requestLayout();
                    return;
                }
                return;
            case 9:
                ArrayList arrayList = xnVar.f39944u6;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    MessageObject messageObject = (MessageObject) arrayList.get(i11);
                    if (messageObject.messageOwner.mentioned && !messageObject.isContentUnread()) {
                        messageObject.setContentIsRead();
                    }
                }
                xnVar.f39831l6 = 0;
                xnVar.getMessagesController().markMentionsAsRead(xnVar.T5, xnVar.d());
                xnVar.f39843m6 = true;
                xnVar.Kb(false);
                org.telegram.ui.ActionBar.o1 o1Var = xnVar.Q8;
                if (o1Var != null) {
                    o1Var.dismiss();
                    return;
                }
                return;
            case 10:
                ArrayList arrayList2 = xnVar.f39944u6;
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    ((MessageObject) arrayList2.get(i12)).markReactionsAsRead();
                }
                xnVar.l1 = 0;
                xnVar.Bc(true);
                xnVar.getMessagesController().markReactionsAsRead(xnVar.T5, xnVar.d());
                org.telegram.ui.ActionBar.o1 o1Var2 = xnVar.Q8;
                if (o1Var2 != null) {
                    o1Var2.dismiss();
                    return;
                }
                return;
            case 11:
                ArrayList arrayList3 = xnVar.f39944u6;
                for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                    ((MessageObject) arrayList3.get(i13)).markPollVotesAsRead();
                }
                xnVar.f39838m1 = 0;
                xnVar.Ac(true);
                xnVar.getMessagesController().markPollVotesAsRead(xnVar.T5, xnVar.d());
                org.telegram.ui.ActionBar.o1 o1Var3 = xnVar.Q8;
                if (o1Var3 != null) {
                    o1Var3.dismiss();
                    return;
                }
                return;
            case 12:
                xn.q0(xnVar);
                return;
            case 13:
                org.telegram.ui.Components.xc.a0(xnVar).M(LocaleController.getString(R.string.BoostingRemoveRestrictionsSuccessTitle), LocaleController.getString(R.string.BoostingRemoveRestrictionsSuccessSubTitle), R.raw.chats_infotip).j();
                return;
            case 14:
                xnVar.g8(false, true, 0.0f);
                return;
            case 15:
                xnVar.hc(false);
                return;
            case 16:
                AndroidUtilities.removeFromParent(xnVar.L0);
                return;
            case 17:
                xnVar.C4 = null;
                xnVar.o9();
                xnVar.r9();
                return;
            case 18:
                xnVar.S6();
                return;
            case 19:
                xnVar.finishFragment();
                return;
            case 20:
                xnVar.o9 = false;
                xnVar.e9(true);
                return;
            case 21:
                pk pkVar = xnVar.f39934t8;
                if (pkVar != null && pkVar.getParent() != null) {
                    xnVar.f39977x0.g1();
                    xnVar.f39959v8.setDrawingReady(false);
                    xnVar.f39934t8.setTag(null);
                    xnVar.X0.removeView(xnVar.f39934t8);
                    return;
                }
                return;
            case 22:
                xnVar.f39892q7 = null;
                org.telegram.ui.Components.j60 j60Var = xnVar.f39705b3;
                if (j60Var != null) {
                    org.telegram.ui.Components.g60 cameraContainer = j60Var.getCameraContainer();
                    AnimatorSet animatorSet = new AnimatorSet();
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(cameraContainer, View.SCALE_X, 0.5f);
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(cameraContainer, View.SCALE_Y, 0.5f);
                    Property property = View.ALPHA;
                    animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(cameraContainer, property, 0.0f), ObjectAnimator.ofFloat(xnVar.f39705b3.getButtonsLayout(), property, 0.0f), ObjectAnimator.ofInt(xnVar.f39705b3.getPaint(), org.telegram.ui.Components.s6.f28173b, 0), ObjectAnimator.ofFloat(xnVar.f39705b3.getMuteImageView(), property, 0.0f));
                    animatorSet.addListener(new wi(xnVar, 0));
                    animatorSet.start();
                    return;
                }
                return;
            case 23:
                xnVar.G5 = null;
                xnVar.j8();
                return;
            case 24:
                xnVar.G5 = null;
                xnVar.j8();
                return;
            case 25:
                if (xnVar.getParentActivity() != null && xnVar.fragmentView != null && (lkVar = xnVar.Y) != null && (sendButton = lkVar.getSendButton()) != null && xnVar.Y.getEditField() != null && xnVar.Y.getEditField().getText().length() >= 5) {
                    SharedConfig.increaseScheduledOrNoSoundHintShowed();
                    if (xnVar.f39767g2 == null) {
                        hj hjVar = new hj(4, 0, xnVar.getParentActivity(), xnVar.f39750ea, false);
                        xnVar.f39767g2 = hjVar;
                        hjVar.a();
                        xnVar.f39767g2.setAlpha(0.0f);
                        xnVar.f39767g2.setVisibility(4);
                        xnVar.f39767g2.setText(LocaleController.getString(R.string.ScheduledOrNoSoundHint));
                        xnVar.X0.addView(xnVar.f39767g2, w7.y5.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                    }
                    xnVar.f39767g2.f(sendButton, true);
                    xnVar.f39779h2 = true;
                    return;
                }
                return;
            case 26:
                org.telegram.ui.ActionBar.g1[] g1VarArr = xnVar.S8;
                if (g1VarArr != null && g1VarArr.length > 0 && (g1Var = g1VarArr[0]) != null) {
                    g1Var.requestFocus();
                    xnVar.S8[0].performAccessibilityAction(64, null);
                    xnVar.S8[0].sendAccessibilityEvent(8);
                    return;
                }
                return;
            case 27:
                xnVar.g8(false, true, 0.0f);
                return;
            case 28:
                xnVar.A0.M.clear();
                km kmVar = xnVar.A0;
                kmVar.L = false;
                kmVar.O(true);
                xnVar.Pb(false);
                return;
            default:
                AndroidUtilities.removeFromParent(xnVar.J0);
                return;
        }
    }
}
