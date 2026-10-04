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
public final class yf implements Runnable {
    public final int f43164a;
    public final yn f43165b;

    public yf(yn ynVar, int i10) {
        this.f43164a = i10;
        this.f43165b = ynVar;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.f1 f1Var;
        jk jkVar;
        View sendButton;
        View sendButton2;
        int i10 = this.f43164a;
        yn ynVar = this.f43165b;
        switch (i10) {
            case 0:
                ynVar.A7(false);
                rg.y0 y0Var = new rg.y0((org.telegram.ui.ActionBar.n2) ynVar, 24, true);
                y0Var.setDimBehind(false);
                y0Var.setOnHideListener(new ig(ynVar, 1));
                y0Var.show();
                return;
            case 1:
                yn.M0(ynVar);
                return;
            case 2:
                yn.o0(ynVar);
                return;
            case 3:
                if (ynVar.getUserConfig().isPremium()) {
                    ynVar.Jb = null;
                    ynVar.Pc(true);
                    org.telegram.ui.Components.yc.a0(ynVar).c(LocaleController.getString(R.string.AdHidden)).j();
                    ynVar.getMessagesController().disableAds(true);
                    return;
                }
                ynVar.showDialog(new rg.y0((org.telegram.ui.ActionBar.n2) ynVar, 3, true));
                return;
            case 4:
                jk jkVar2 = ynVar.W;
                if (jkVar2 != null) {
                    jkVar2.q0(true);
                    return;
                }
                return;
            case 5:
                AndroidUtilities.removeFromParent(ynVar.I0);
                return;
            case 6:
                ynVar.f43453oa = null;
                ynVar.f43443na = -1;
                View view = ynVar.fragmentView;
                if (view != null) {
                    view.requestLayout();
                    return;
                }
                return;
            case 7:
                ArrayList arrayList = ynVar.f43501s6;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    MessageObject messageObject = (MessageObject) arrayList.get(i11);
                    if (messageObject.messageOwner.mentioned && !messageObject.isContentUnread()) {
                        messageObject.setContentIsRead();
                    }
                }
                ynVar.f43389j6 = 0;
                ynVar.getMessagesController().markMentionsAsRead(ynVar.R5, ynVar.d());
                ynVar.f43402k6 = true;
                ynVar.Jb(false);
                org.telegram.ui.ActionBar.n1 n1Var = ynVar.O8;
                if (n1Var != null) {
                    n1Var.dismiss();
                    return;
                }
                return;
            case 8:
                ArrayList arrayList2 = ynVar.f43501s6;
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    ((MessageObject) arrayList2.get(i12)).markReactionsAsRead();
                }
                ynVar.f43385j1 = 0;
                ynVar.Ac(true);
                ynVar.getMessagesController().markReactionsAsRead(ynVar.R5, ynVar.d());
                org.telegram.ui.ActionBar.n1 n1Var2 = ynVar.O8;
                if (n1Var2 != null) {
                    n1Var2.dismiss();
                    return;
                }
                return;
            case 9:
                ynVar.W.H0();
                return;
            case 10:
                ArrayList arrayList3 = ynVar.f43501s6;
                for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                    ((MessageObject) arrayList3.get(i13)).markPollVotesAsRead();
                }
                ynVar.f43397k1 = 0;
                ynVar.zc(true);
                ynVar.getMessagesController().markPollVotesAsRead(ynVar.R5, ynVar.d());
                org.telegram.ui.ActionBar.n1 n1Var3 = ynVar.O8;
                if (n1Var3 != null) {
                    n1Var3.dismiss();
                    return;
                }
                return;
            case 11:
                yn.m1(ynVar);
                return;
            case 12:
                org.telegram.ui.Components.yc.a0(ynVar).M(LocaleController.getString(R.string.BoostingRemoveRestrictionsSuccessTitle), LocaleController.getString(R.string.BoostingRemoveRestrictionsSuccessSubTitle), R.raw.chats_infotip).j();
                return;
            case 13:
                org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(ynVar.getParentActivity(), 3, ynVar.f43307ca);
                ynVar.f43430mb = b2Var;
                b2Var.setOnShowListener(new of(ynVar, 1));
                ynVar.f43430mb.setOnCancelListener(ynVar.f43406ka);
                ynVar.f43430mb.q(500L);
                return;
            case 14:
                ynVar.gc(false);
                return;
            case 15:
                ynVar.E5 = null;
                ynVar.j8();
                return;
            case 16:
                ynVar.E5 = null;
                ynVar.j8();
                return;
            case 17:
                ynVar.g8(false, true, 0.0f);
                return;
            case 18:
                ynVar.S6();
                return;
            case 19:
                ynVar.finishFragment();
                return;
            case 20:
                ynVar.A4 = null;
                ynVar.o9();
                ynVar.q9();
                return;
            case 21:
                nk nkVar = ynVar.f43489r8;
                if (nkVar != null && nkVar.getParent() != null) {
                    ynVar.f43533v0.h1();
                    ynVar.f43516t8.setDrawingReady(false);
                    ynVar.f43489r8.setTag(null);
                    ynVar.V0.removeView(ynVar.f43489r8);
                    return;
                }
                return;
            case 22:
                ynVar.f43428m9 = false;
                ynVar.f9(true);
                return;
            case 23:
                org.telegram.ui.ActionBar.f1[] f1VarArr = ynVar.Q8;
                if (f1VarArr != null && f1VarArr.length > 0 && (f1Var = f1VarArr[0]) != null) {
                    f1Var.requestFocus();
                    ynVar.Q8[0].performAccessibilityAction(64, null);
                    ynVar.Q8[0].sendAccessibilityEvent(8);
                    return;
                }
                return;
            case 24:
                ynVar.f43451o7 = null;
                org.telegram.ui.Components.k60 k60Var = ynVar.Z2;
                if (k60Var != null) {
                    org.telegram.ui.Components.h60 cameraContainer = k60Var.getCameraContainer();
                    AnimatorSet animatorSet = new AnimatorSet();
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(cameraContainer, View.SCALE_X, 0.5f);
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(cameraContainer, View.SCALE_Y, 0.5f);
                    Property property = View.ALPHA;
                    animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(cameraContainer, property, 0.0f), ObjectAnimator.ofFloat(ynVar.Z2.getButtonsLayout(), property, 0.0f), ObjectAnimator.ofInt(ynVar.Z2.getPaint(), org.telegram.ui.Components.s6.f30637b, 0), ObjectAnimator.ofFloat(ynVar.Z2.getMuteImageView(), property, 0.0f));
                    animatorSet.addListener(new vi(ynVar, 0));
                    animatorSet.start();
                    return;
                }
                return;
            case 25:
                if (ynVar.getParentActivity() != null && ynVar.fragmentView != null && (jkVar = ynVar.W) != null && (sendButton = jkVar.getSendButton()) != null && ynVar.W.getEditField() != null && ynVar.W.getEditField().getText().length() >= 5) {
                    SharedConfig.increaseScheduledOrNoSoundHintShowed();
                    if (ynVar.f43325e2 == null) {
                        gj gjVar = new gj(4, 0, ynVar.getParentActivity(), ynVar.f43307ca, false);
                        ynVar.f43325e2 = gjVar;
                        gjVar.a();
                        ynVar.f43325e2.setAlpha(0.0f);
                        ynVar.f43325e2.setVisibility(4);
                        ynVar.f43325e2.setText(LocaleController.getString(R.string.ScheduledOrNoSoundHint));
                        ynVar.V0.addView(ynVar.f43325e2, w7.z5.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                    }
                    ynVar.f43325e2.f(sendButton, true);
                    ynVar.f43337f2 = true;
                    return;
                }
                return;
            case 26:
                ynVar.g8(false, true, 0.0f);
                return;
            case 27:
                ynVar.f43572y0.M.clear();
                jm jmVar = ynVar.f43572y0;
                jmVar.L = false;
                jmVar.O(true);
                ynVar.Ob(false);
                return;
            case 28:
                if (ynVar.getParentActivity() != null && ynVar.fragmentView != null && ynVar.W != null && ynVar.Ca == null && ynVar.getMessagesController().getSendPaidMessagesStars(ynVar.a()) <= 0 && (sendButton2 = ynVar.W.getSendButton()) != null && ynVar.W.getEditField() != null && ynVar.W.getEditField().getText().length() != 0) {
                    SharedConfig.increaseScheduledHintShowed();
                    if (ynVar.f43349g2 == null) {
                        org.telegram.ui.Components.m40 m40Var = new org.telegram.ui.Components.m40(4, ynVar.getParentActivity(), ynVar.f43307ca, false);
                        ynVar.f43349g2 = m40Var;
                        m40Var.a();
                        ynVar.f43349g2.setAlpha(0.0f);
                        ynVar.f43349g2.setVisibility(4);
                        ynVar.f43349g2.setText(LocaleController.getString(R.string.ScheduledHint));
                        ynVar.V0.addView(ynVar.f43349g2, w7.z5.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                    }
                    ynVar.f43349g2.f(sendButton2, true);
                    ynVar.f43361h2 = true;
                    return;
                }
                return;
            default:
                AndroidUtilities.removeFromParent(ynVar.H0);
                return;
        }
    }
}
