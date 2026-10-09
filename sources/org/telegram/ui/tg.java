package org.telegram.ui;

import android.os.SystemClock;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.TranslateController;
public final class tg implements Runnable {
    public final int f42001a;
    public final zn f42002b;

    public tg(zn znVar, int i10) {
        this.f42001a = i10;
        this.f42002b = znVar;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        ci.d4 d4Var;
        int i10 = this.f42001a;
        boolean z12 = true;
        zn znVar = this.f42002b;
        switch (i10) {
            case 0:
                ok okVar = znVar.Y;
                if (okVar != null && znVar.Cc != null) {
                    if (okVar.r0()) {
                        znVar.Y.k0(false);
                        AndroidUtilities.showKeyboard(znVar.Cc.f46661a);
                        znVar.Cc.f46662b.f46658a.a(false, true);
                        return;
                    }
                    znVar.Y.T0(false, false, false);
                    znVar.Y.q1();
                    znVar.Cc.f46662b.f46658a.a(true, true);
                    return;
                }
                return;
            case 1:
                ArrayList arrayList = znVar.f44954u6;
                znVar.Hb = System.currentTimeMillis();
                if (znVar.f44988x0 != null && znVar.A0 != null) {
                    int i11 = Integer.MAX_VALUE;
                    int i12 = Integer.MIN_VALUE;
                    for (int i13 = 0; i13 < znVar.f44988x0.getChildCount(); i13++) {
                        View childAt = znVar.f44988x0.getChildAt(i13);
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
                            MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) znVar.f44994x6.f(messageObject.getGroupId());
                            if (groupedMessages != null) {
                                if (!arrayList2.contains(Long.valueOf(groupedMessages.groupId))) {
                                    for (int i16 = 0; i16 < groupedMessages.messages.size(); i16++) {
                                        MessageObject messageObject2 = groupedMessages.messages.get(i16);
                                        if (messageObject2 != null) {
                                            int id4 = messageObject2.getId();
                                            TranslateController translateController = znVar.getMessagesController().getTranslateController();
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
                                TranslateController translateController2 = znVar.getMessagesController().getTranslateController();
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
                if (znVar.L4 > 0 && znVar.J4 != null) {
                    znVar.getMessagesController().getTranslateController().checkTranslation((MessageObject) znVar.J4.get(Integer.valueOf(znVar.L4)), true);
                }
                znVar.Yc();
                return;
            case 2:
                znVar.xa();
                return;
            case 3:
                AndroidUtilities.removeFromParent(znVar.J0);
                return;
            case 4:
                znVar.h9();
                znVar.Cc(0, true);
                return;
            case 5:
                znVar.j8(false, true, 0.0f);
                return;
            case 6:
                znVar.X9();
                return;
            case 7:
                znVar.lc(false);
                return;
            case 8:
                znVar.v9(2);
                return;
            case 9:
                znVar.j8(false, true, 0.0f);
                return;
            case 10:
                zn.x0(znVar);
                return;
            case 11:
                znVar.j8(false, true, 0.0f);
                return;
            case 12:
                AndroidUtilities.removeFromParent(znVar.L0);
                return;
            case 13:
                znVar.j8(false, true, 0.0f);
                return;
            case 14:
                znVar.Q6();
                return;
            case 15:
                znVar.f44698a = (znVar.f44698a + 1) % 3;
                return;
            case 16:
                znVar.f44711b = !znVar.f44711b;
                return;
            case 17:
                znVar.D7(true);
                org.telegram.messenger.q.q(R.string.TranscriptionReportSent, org.telegram.ui.Components.ad.a0(znVar), R.raw.chats_infotip, 36);
                return;
            case 18:
                znVar.A0.M.clear();
                mm mmVar = znVar.A0;
                mmVar.L = false;
                mmVar.O(true);
                znVar.Tb(false);
                return;
            case 19:
                znVar.t9();
                znVar.w9();
                znVar.u7();
                znVar.w7();
                return;
            case 20:
                znVar.f45010ya = false;
                znVar.yc();
                return;
            case 21:
                znVar.f44811ic = 0;
                znVar.f44823jc = false;
                znVar.f44988x0.f1();
                return;
            case 22:
                znVar.v9(5);
                return;
            case 23:
                znVar.Cc(0, (znVar.P5 == 0 || SystemClock.elapsedRealtime() < znVar.P5 + 150) ? false : false);
                return;
            case 24:
                rk rkVar = znVar.R2;
                if ((rkVar == null || rkVar.getVisibility() != 0) && (d4Var = znVar.f44975w1) != null) {
                    d4Var.u();
                    return;
                }
                return;
            case 25:
                znVar.n7();
                return;
            case 26:
                znVar.v9(5);
                return;
            case 27:
                znVar.d7(false);
                return;
            case 28:
                FrameLayout.LayoutParams e7 = w7.x5.e(-1, -2, 87);
                e7.bottomMargin = znVar.Y.getMeasuredHeight();
                znVar.X0.addView(znVar.f45002y1, e7);
                znVar.f45002y1.setTranslationY(-AndroidUtilities.navigationBarHeight);
                znVar.f45002y1.m(0.0f, znVar.Y.getEmojiButton().getX() + AndroidUtilities.dp(22.0f));
                znVar.f45002y1.u();
                return;
            default:
                int i17 = zn.Hc;
                znVar.c7();
                return;
        }
    }
}
