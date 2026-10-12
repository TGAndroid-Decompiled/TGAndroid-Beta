package org.telegram.ui;

import android.os.SystemClock;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.TranslateController;
public final class wg implements Runnable {
    public final int f43515a;
    public final eo f43516b;

    public wg(eo eoVar, int i10) {
        this.f43515a = i10;
        this.f43516b = eoVar;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        ci.d4 d4Var;
        int i10 = this.f43515a;
        boolean z12 = true;
        eo eoVar = this.f43516b;
        switch (i10) {
            case 0:
                sk skVar = eoVar.Y;
                if (skVar != null && eoVar.Cc != null) {
                    if (skVar.u0()) {
                        eoVar.Y.n0(false);
                        AndroidUtilities.showKeyboard(eoVar.Cc.f46608a);
                        eoVar.Cc.f46609b.f46605a.a(false, true);
                        return;
                    }
                    eoVar.Y.X0(false, false, false);
                    eoVar.Y.u1();
                    eoVar.Cc.f46609b.f46605a.a(true, true);
                    return;
                }
                return;
            case 1:
                ArrayList arrayList = eoVar.f37449u6;
                eoVar.Hb = System.currentTimeMillis();
                if (eoVar.f37483x0 != null && eoVar.A0 != null) {
                    int i11 = Integer.MAX_VALUE;
                    int i12 = Integer.MIN_VALUE;
                    for (int i13 = 0; i13 < eoVar.f37483x0.getChildCount(); i13++) {
                        View childAt = eoVar.f37483x0.getChildAt(i13);
                        if (childAt instanceof org.telegram.ui.Cells.u1) {
                            org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) childAt;
                            if (u1Var.getCurrentMessagesGroup() != null) {
                                for (int i14 = 0; i14 < u1Var.getCurrentMessagesGroup().messages.size(); i14++) {
                                    int id2 = u1Var.getCurrentMessagesGroup().messages.get(i14).getId();
                                    i11 = Math.min(i11, id2);
                                    i12 = Math.max(i12, id2);
                                }
                            } else if (u1Var.getMessageObject() != null) {
                                int id3 = u1Var.getMessageObject().getId();
                                i11 = Math.min(i11, id3);
                                i12 = Math.max(i12, id3);
                            }
                        }
                    }
                    if (i11 <= i12) {
                        ArrayList arrayList2 = new ArrayList();
                        for (int i15 = 0; i15 < arrayList.size(); i15++) {
                            MessageObject messageObject = (MessageObject) arrayList.get(i15);
                            MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) eoVar.f37489x6.f(messageObject.getGroupId());
                            if (groupedMessages != null) {
                                if (!arrayList2.contains(Long.valueOf(groupedMessages.groupId))) {
                                    for (int i16 = 0; i16 < groupedMessages.messages.size(); i16++) {
                                        MessageObject messageObject2 = groupedMessages.messages.get(i16);
                                        if (messageObject2 != null) {
                                            int id4 = messageObject2.getId();
                                            TranslateController translateController = eoVar.getMessagesController().getTranslateController();
                                            if (id4 >= i11 - 7 && id4 <= i12 + 7) {
                                                z11 = true;
                                            } else {
                                                z11 = false;
                                            }
                                            translateController.checkTranslation(messageObject2, z11);
                                        }
                                    }
                                    arrayList2.add(Long.valueOf(groupedMessages.groupId));
                                }
                            } else {
                                int id5 = messageObject.getId();
                                TranslateController translateController2 = eoVar.getMessagesController().getTranslateController();
                                if (id5 >= i11 - 7 && id5 <= i12 + 7) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                translateController2.checkTranslation(messageObject, z10);
                            }
                        }
                    }
                }
                if (eoVar.L4 > 0 && eoVar.J4 != null) {
                    eoVar.getMessagesController().getTranslateController().checkTranslation((MessageObject) eoVar.J4.get(Integer.valueOf(eoVar.L4)), true);
                }
                eoVar.Yc();
                return;
            case 2:
                eoVar.xa();
                return;
            case 3:
                AndroidUtilities.removeFromParent(eoVar.J0);
                return;
            case 4:
                eoVar.h9();
                eoVar.Cc(0, true);
                return;
            case 5:
                eoVar.j8(false, true, 0.0f);
                return;
            case 6:
                eoVar.X9();
                return;
            case 7:
                eoVar.lc(false);
                return;
            case 8:
                eoVar.v9(2);
                return;
            case 9:
                eoVar.j8(false, true, 0.0f);
                return;
            case 10:
                eo.x0(eoVar);
                return;
            case 11:
                eoVar.j8(false, true, 0.0f);
                return;
            case 12:
                AndroidUtilities.removeFromParent(eoVar.L0);
                return;
            case 13:
                eoVar.j8(false, true, 0.0f);
                return;
            case 14:
                eoVar.Q6();
                return;
            case 15:
                eoVar.f37193a = (eoVar.f37193a + 1) % 3;
                return;
            case 16:
                eoVar.f37206b = !eoVar.f37206b;
                return;
            case 17:
                eoVar.D7(true);
                org.telegram.messenger.v0.q(R.string.TranscriptionReportSent, org.telegram.ui.Components.zc.a0(eoVar), R.raw.chats_infotip, 36);
                return;
            case 18:
                eoVar.A0.M.clear();
                qm qmVar = eoVar.A0;
                qmVar.L = false;
                qmVar.O(true);
                eoVar.Tb(false);
                return;
            case 19:
                eoVar.t9();
                eoVar.w9();
                eoVar.u7();
                eoVar.w7();
                return;
            case 20:
                eoVar.f37505ya = false;
                eoVar.yc();
                return;
            case 21:
                eoVar.f37306ic = 0;
                eoVar.f37318jc = false;
                eoVar.f37483x0.f1();
                return;
            case 22:
                eoVar.v9(5);
                return;
            case 23:
                eoVar.Cc(0, (eoVar.P5 == 0 || SystemClock.elapsedRealtime() < eoVar.P5 + 150) ? false : false);
                return;
            case 24:
                vk vkVar = eoVar.R2;
                if ((vkVar == null || vkVar.getVisibility() != 0) && (d4Var = eoVar.f37470w1) != null) {
                    d4Var.u();
                    return;
                }
                return;
            case 25:
                eoVar.n7();
                return;
            case 26:
                eoVar.v9(5);
                return;
            case 27:
                eoVar.d7(false);
                return;
            case 28:
                FrameLayout.LayoutParams e7 = w7.w5.e(-1, -2, 87);
                e7.bottomMargin = eoVar.Y.getMeasuredHeight();
                eoVar.X0.addView(eoVar.f37497y1, e7);
                eoVar.f37497y1.setTranslationY(-AndroidUtilities.navigationBarHeight);
                eoVar.f37497y1.m(0.0f, eoVar.Y.getEmojiButton().getX() + AndroidUtilities.dp(22.0f));
                eoVar.f37497y1.u();
                return;
            default:
                int i17 = eo.Hc;
                eoVar.c7();
                return;
        }
    }
}
