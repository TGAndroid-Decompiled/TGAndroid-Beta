package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
public final class sf implements Runnable {
    public final int f37486a;
    public final bo f37487b;

    public sf(bo boVar, int i10) {
        this.f37486a = i10;
        this.f37487b = boVar;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.g1 g1Var;
        nk nkVar;
        View sendButton;
        View sendButton2;
        switch (this.f37486a) {
            case 0:
                this.f37487b.A7(true);
                return;
            case 1:
                this.f37487b.A7(true);
                return;
            case 2:
                bo boVar = this.f37487b;
                boVar.A7(false);
                rg.x0 x0Var = new rg.x0((org.telegram.ui.ActionBar.o2) boVar, 24, true);
                x0Var.setDimBehind(false);
                x0Var.setOnHideListener(new lg(boVar, 1));
                x0Var.show();
                return;
            case 3:
                bo.P0(this.f37487b);
                return;
            case 4:
                bo.m0(this.f37487b);
                return;
            case 5:
                bo boVar2 = this.f37487b;
                if (boVar2.getUserConfig().isPremium()) {
                    boVar2.Lb = null;
                    boVar2.Qc(true);
                    org.telegram.ui.Components.vc.a0(boVar2).c(LocaleController.getString(R.string.AdHidden)).j();
                    boVar2.getMessagesController().disableAds(true);
                    return;
                }
                boVar2.showDialog(new rg.x0((org.telegram.ui.ActionBar.o2) boVar2, 3, true));
                return;
            case 6:
                nk nkVar2 = this.f37487b.Y;
                if (nkVar2 != null) {
                    nkVar2.r0(true);
                    return;
                }
                return;
            case 7:
                AndroidUtilities.removeFromParent(this.f37487b.K0);
                return;
            case 8:
                this.f37487b.Y.I0();
                return;
            case 9:
                bo boVar3 = this.f37487b;
                boVar3.f32424qa = null;
                boVar3.f32412pa = -1;
                View view = boVar3.fragmentView;
                if (view != null) {
                    view.requestLayout();
                    return;
                }
                return;
            case 10:
                bo boVar4 = this.f37487b;
                ArrayList arrayList = boVar4.f32473u6;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    MessageObject messageObject = (MessageObject) arrayList.get(i10);
                    if (messageObject.messageOwner.mentioned && !messageObject.isContentUnread()) {
                        messageObject.setContentIsRead();
                    }
                }
                boVar4.f32360l6 = 0;
                boVar4.getMessagesController().markMentionsAsRead(boVar4.T5, boVar4.d());
                boVar4.f32372m6 = true;
                boVar4.Kb(false);
                org.telegram.ui.ActionBar.o1 o1Var = boVar4.Q8;
                if (o1Var != null) {
                    o1Var.dismiss();
                    return;
                }
                return;
            case 11:
                bo boVar5 = this.f37487b;
                ArrayList arrayList2 = boVar5.f32473u6;
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    ((MessageObject) arrayList2.get(i11)).markReactionsAsRead();
                }
                boVar5.l1 = 0;
                boVar5.Bc(true);
                boVar5.getMessagesController().markReactionsAsRead(boVar5.T5, boVar5.d());
                org.telegram.ui.ActionBar.o1 o1Var2 = boVar5.Q8;
                if (o1Var2 != null) {
                    o1Var2.dismiss();
                    return;
                }
                return;
            case 12:
                bo boVar6 = this.f37487b;
                ArrayList arrayList3 = boVar6.f32473u6;
                for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                    ((MessageObject) arrayList3.get(i12)).markPollVotesAsRead();
                }
                boVar6.f32367m1 = 0;
                boVar6.Ac(true);
                boVar6.getMessagesController().markPollVotesAsRead(boVar6.T5, boVar6.d());
                org.telegram.ui.ActionBar.o1 o1Var3 = boVar6.Q8;
                if (o1Var3 != null) {
                    o1Var3.dismiss();
                    return;
                }
                return;
            case 13:
                bo.n1(this.f37487b);
                return;
            case 14:
                org.telegram.ui.Components.vc.a0(this.f37487b).M(LocaleController.getString(R.string.BoostingRemoveRestrictionsSuccessTitle), LocaleController.getString(R.string.BoostingRemoveRestrictionsSuccessSubTitle), R.raw.chats_infotip).j();
                return;
            case 15:
                this.f37487b.hc(false);
                return;
            case 16:
                bo boVar7 = this.f37487b;
                boVar7.G5 = null;
                boVar7.j8();
                return;
            case 17:
                bo boVar8 = this.f37487b;
                boVar8.G5 = null;
                boVar8.j8();
                return;
            case 18:
                this.f37487b.S6();
                return;
            case 19:
                this.f37487b.finishFragment();
                return;
            case 20:
                this.f37487b.g8(false, true, 0.0f);
                return;
            case 21:
                AndroidUtilities.removeFromParent(this.f37487b.L0);
                return;
            case 22:
                bo boVar9 = this.f37487b;
                boVar9.C4 = null;
                boVar9.o9();
                boVar9.r9();
                return;
            case 23:
                bo boVar10 = this.f37487b;
                rk rkVar = boVar10.f32463t8;
                if (rkVar != null && rkVar.getParent() != null) {
                    boVar10.f32506x0.g1();
                    boVar10.f32488v8.setDrawingReady(false);
                    boVar10.f32463t8.setTag(null);
                    boVar10.X0.removeView(boVar10.f32463t8);
                    return;
                }
                return;
            case 24:
                bo boVar11 = this.f37487b;
                boVar11.o9 = false;
                boVar11.e9(true);
                return;
            case 25:
                bo boVar12 = this.f37487b;
                org.telegram.ui.ActionBar.g1[] g1VarArr = boVar12.S8;
                if (g1VarArr != null && g1VarArr.length > 0 && (g1Var = g1VarArr[0]) != null) {
                    g1Var.requestFocus();
                    boVar12.S8[0].performAccessibilityAction(64, null);
                    boVar12.S8[0].sendAccessibilityEvent(8);
                    return;
                }
                return;
            case 26:
                bo boVar13 = this.f37487b;
                if (boVar13.getParentActivity() != null && boVar13.fragmentView != null && (nkVar = boVar13.Y) != null && (sendButton = nkVar.getSendButton()) != null && boVar13.Y.getEditField() != null && boVar13.Y.getEditField().getText().length() >= 5) {
                    SharedConfig.increaseScheduledOrNoSoundHintShowed();
                    if (boVar13.f32296g2 == null) {
                        jj jjVar = new jj(4, 0, boVar13.getParentActivity(), boVar13.f32279ea, false);
                        boVar13.f32296g2 = jjVar;
                        jjVar.a();
                        boVar13.f32296g2.setAlpha(0.0f);
                        boVar13.f32296g2.setVisibility(4);
                        boVar13.f32296g2.setText(LocaleController.getString(R.string.ScheduledOrNoSoundHint));
                        boVar13.X0.addView(boVar13.f32296g2, w7.x5.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                    }
                    boVar13.f32296g2.f(sendButton, true);
                    boVar13.f32308h2 = true;
                    return;
                }
                return;
            case 27:
                bo boVar14 = this.f37487b;
                if (boVar14.getParentActivity() != null && boVar14.fragmentView != null && boVar14.Y != null && boVar14.Ea == null && boVar14.getMessagesController().getSendPaidMessagesStars(boVar14.a()) <= 0 && (sendButton2 = boVar14.Y.getSendButton()) != null && boVar14.Y.getEditField() != null && boVar14.Y.getEditField().getText().length() != 0) {
                    SharedConfig.increaseScheduledHintShowed();
                    if (boVar14.f32320i2 == null) {
                        org.telegram.ui.Components.i40 i40Var = new org.telegram.ui.Components.i40(4, boVar14.getParentActivity(), boVar14.f32279ea, false);
                        boVar14.f32320i2 = i40Var;
                        i40Var.a();
                        boVar14.f32320i2.setAlpha(0.0f);
                        boVar14.f32320i2.setVisibility(4);
                        boVar14.f32320i2.setText(LocaleController.getString(R.string.ScheduledHint));
                        boVar14.X0.addView(boVar14.f32320i2, w7.x5.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                    }
                    boVar14.f32320i2.f(sendButton2, true);
                    boVar14.f32333j2 = true;
                    return;
                }
                return;
            case 28:
                this.f37487b.g8(false, true, 0.0f);
                return;
            default:
                bo boVar15 = this.f37487b;
                boVar15.A0.M.clear();
                nm nmVar = boVar15.A0;
                nmVar.L = false;
                nmVar.O(true);
                boVar15.Pb(false);
                return;
        }
    }
}
