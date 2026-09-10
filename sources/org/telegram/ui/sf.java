package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
public final class sf implements Runnable {
    public final int f36667a;
    public final eo f36668b;

    public sf(eo eoVar, int i10) {
        this.f36667a = i10;
        this.f36668b = eoVar;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.g1 g1Var;
        ok okVar;
        View sendButton;
        View sendButton2;
        switch (this.f36667a) {
            case 0:
                this.f36668b.A7(true);
                return;
            case 1:
                this.f36668b.A7(true);
                return;
            case 2:
                eo eoVar = this.f36668b;
                eoVar.A7(false);
                qg.a1 a1Var = new qg.a1((org.telegram.ui.ActionBar.p2) eoVar, 24, true);
                a1Var.setDimBehind(false);
                a1Var.setOnHideListener(new kg(eoVar, 1));
                a1Var.show();
                return;
            case 3:
                eo.P0(this.f36668b);
                return;
            case 4:
                eo.m0(this.f36668b);
                return;
            case 5:
                eo eoVar2 = this.f36668b;
                if (eoVar2.getUserConfig().isPremium()) {
                    eoVar2.Mb = null;
                    eoVar2.Qc(true);
                    org.telegram.ui.Components.wc.a0(eoVar2).c(LocaleController.getString(R.string.AdHidden)).j();
                    eoVar2.getMessagesController().disableAds(true);
                    return;
                }
                eoVar2.showDialog(new qg.a1((org.telegram.ui.ActionBar.p2) eoVar2, 3, true));
                return;
            case 6:
                ok okVar2 = this.f36668b.Y;
                if (okVar2 != null) {
                    okVar2.q0(true);
                    return;
                }
                return;
            case 7:
                AndroidUtilities.removeFromParent(this.f36668b.K0);
                return;
            case 8:
                this.f36668b.Y.H0();
                return;
            case 9:
                eo eoVar3 = this.f36668b;
                eoVar3.f32460qa = null;
                eoVar3.f32448pa = -1;
                View view = eoVar3.fragmentView;
                if (view != null) {
                    view.requestLayout();
                    return;
                }
                return;
            case 10:
                eo eoVar4 = this.f36668b;
                ArrayList arrayList = eoVar4.f32509u6;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    MessageObject messageObject = (MessageObject) arrayList.get(i10);
                    if (messageObject.messageOwner.mentioned && !messageObject.isContentUnread()) {
                        messageObject.setContentIsRead();
                    }
                }
                eoVar4.f32396l6 = 0;
                eoVar4.getMessagesController().markMentionsAsRead(eoVar4.T5, eoVar4.d());
                eoVar4.f32408m6 = true;
                eoVar4.Kb(false);
                org.telegram.ui.ActionBar.p1 p1Var = eoVar4.Q8;
                if (p1Var != null) {
                    p1Var.dismiss();
                    return;
                }
                return;
            case 11:
                eo eoVar5 = this.f36668b;
                ArrayList arrayList2 = eoVar5.f32509u6;
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    ((MessageObject) arrayList2.get(i11)).markReactionsAsRead();
                }
                eoVar5.l1 = 0;
                eoVar5.Bc(true);
                eoVar5.getMessagesController().markReactionsAsRead(eoVar5.T5, eoVar5.d());
                org.telegram.ui.ActionBar.p1 p1Var2 = eoVar5.Q8;
                if (p1Var2 != null) {
                    p1Var2.dismiss();
                    return;
                }
                return;
            case 12:
                eo eoVar6 = this.f36668b;
                ArrayList arrayList3 = eoVar6.f32509u6;
                for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                    ((MessageObject) arrayList3.get(i12)).markPollVotesAsRead();
                }
                eoVar6.f32403m1 = 0;
                eoVar6.Ac(true);
                eoVar6.getMessagesController().markPollVotesAsRead(eoVar6.T5, eoVar6.d());
                org.telegram.ui.ActionBar.p1 p1Var3 = eoVar6.Q8;
                if (p1Var3 != null) {
                    p1Var3.dismiss();
                    return;
                }
                return;
            case 13:
                eo.n1(this.f36668b);
                return;
            case 14:
                org.telegram.ui.Components.wc.a0(this.f36668b).M(LocaleController.getString(R.string.BoostingRemoveRestrictionsSuccessTitle), LocaleController.getString(R.string.BoostingRemoveRestrictionsSuccessSubTitle), R.raw.chats_infotip).j();
                return;
            case 15:
                this.f36668b.hc(false);
                return;
            case 16:
                eo eoVar7 = this.f36668b;
                eoVar7.G5 = null;
                eoVar7.j8();
                return;
            case 17:
                eo eoVar8 = this.f36668b;
                eoVar8.G5 = null;
                eoVar8.j8();
                return;
            case 18:
                this.f36668b.S6();
                return;
            case 19:
                this.f36668b.finishFragment();
                return;
            case 20:
                this.f36668b.g8(false, true, 0.0f);
                return;
            case 21:
                AndroidUtilities.removeFromParent(this.f36668b.L0);
                return;
            case 22:
                eo eoVar9 = this.f36668b;
                eoVar9.C4 = null;
                eoVar9.o9();
                eoVar9.r9();
                return;
            case 23:
                eo eoVar10 = this.f36668b;
                sk skVar = eoVar10.f32499t8;
                if (skVar != null && skVar.getParent() != null) {
                    eoVar10.f32542x0.e1();
                    eoVar10.f32524v8.setDrawingReady(false);
                    eoVar10.f32499t8.setTag(null);
                    eoVar10.X0.removeView(eoVar10.f32499t8);
                    return;
                }
                return;
            case 24:
                eo eoVar11 = this.f36668b;
                eoVar11.o9 = false;
                eoVar11.e9(true);
                return;
            case 25:
                eo eoVar12 = this.f36668b;
                org.telegram.ui.ActionBar.g1[] g1VarArr = eoVar12.S8;
                if (g1VarArr != null && g1VarArr.length > 0 && (g1Var = g1VarArr[0]) != null) {
                    g1Var.requestFocus();
                    eoVar12.S8[0].performAccessibilityAction(64, null);
                    eoVar12.S8[0].sendAccessibilityEvent(8);
                    return;
                }
                return;
            case 26:
                eo eoVar13 = this.f36668b;
                if (eoVar13.getParentActivity() != null && eoVar13.fragmentView != null && (okVar = eoVar13.Y) != null && (sendButton = okVar.getSendButton()) != null && eoVar13.Y.getEditField() != null && eoVar13.Y.getEditField().getText().length() >= 5) {
                    SharedConfig.increaseScheduledOrNoSoundHintShowed();
                    if (eoVar13.f32333g2 == null) {
                        kj kjVar = new kj(4, 0, eoVar13.getParentActivity(), eoVar13.f32316ea, false);
                        eoVar13.f32333g2 = kjVar;
                        kjVar.a();
                        eoVar13.f32333g2.setAlpha(0.0f);
                        eoVar13.f32333g2.setVisibility(4);
                        eoVar13.f32333g2.setText(LocaleController.getString(R.string.ScheduledOrNoSoundHint));
                        eoVar13.X0.addView(eoVar13.f32333g2, w7.a6.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                    }
                    eoVar13.f32333g2.f(sendButton, true);
                    eoVar13.f32344h2 = true;
                    return;
                }
                return;
            case 27:
                eo eoVar14 = this.f36668b;
                if (eoVar14.getParentActivity() != null && eoVar14.fragmentView != null && eoVar14.Y != null && eoVar14.Ea == null && eoVar14.getMessagesController().getSendPaidMessagesStars(eoVar14.a()) <= 0 && (sendButton2 = eoVar14.Y.getSendButton()) != null && eoVar14.Y.getEditField() != null && eoVar14.Y.getEditField().getText().length() != 0) {
                    SharedConfig.increaseScheduledHintShowed();
                    if (eoVar14.f32356i2 == null) {
                        org.telegram.ui.Components.s40 s40Var = new org.telegram.ui.Components.s40(4, eoVar14.getParentActivity(), eoVar14.f32316ea, false);
                        eoVar14.f32356i2 = s40Var;
                        s40Var.a();
                        eoVar14.f32356i2.setAlpha(0.0f);
                        eoVar14.f32356i2.setVisibility(4);
                        eoVar14.f32356i2.setText(LocaleController.getString(R.string.ScheduledHint));
                        eoVar14.X0.addView(eoVar14.f32356i2, w7.a6.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                    }
                    eoVar14.f32356i2.f(sendButton2, true);
                    eoVar14.f32369j2 = true;
                    return;
                }
                return;
            case 28:
                this.f36668b.g8(false, true, 0.0f);
                return;
            default:
                eo eoVar15 = this.f36668b;
                eoVar15.A0.M.clear();
                pm pmVar = eoVar15.A0;
                pmVar.L = false;
                pmVar.O(true);
                eoVar15.Pb(false);
                return;
        }
    }
}
