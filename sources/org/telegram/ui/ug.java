package org.telegram.ui;

import android.os.SystemClock;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.TranslateController;
public final class ug implements Runnable {
    public final int f41088a;
    public final co f41089b;

    public ug(co coVar, int i10) {
        this.f41088a = i10;
        this.f41089b = coVar;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        di.f4 f4Var;
        int i10 = this.f41088a;
        boolean z12 = true;
        co coVar = this.f41089b;
        switch (i10) {
            case 0:
                AndroidUtilities.removeFromParent(coVar.J0);
                return;
            case 1:
                ArrayList arrayList = coVar.f35440u6;
                coVar.Hb = System.currentTimeMillis();
                if (coVar.f35473x0 != null && coVar.A0 != null) {
                    int i11 = Integer.MAX_VALUE;
                    int i12 = Integer.MIN_VALUE;
                    for (int i13 = 0; i13 < coVar.f35473x0.getChildCount(); i13++) {
                        View childAt = coVar.f35473x0.getChildAt(i13);
                        if (childAt instanceof org.telegram.ui.Cells.t1) {
                            org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) childAt;
                            if (t1Var.getCurrentMessagesGroup() != null) {
                                for (int i14 = 0; i14 < t1Var.getCurrentMessagesGroup().messages.size(); i14++) {
                                    int id2 = t1Var.getCurrentMessagesGroup().messages.get(i14).getId();
                                    i11 = Math.min(i11, id2);
                                    i12 = Math.max(i12, id2);
                                }
                            } else if (t1Var.getMessageObject() != null) {
                                int id3 = t1Var.getMessageObject().getId();
                                i11 = Math.min(i11, id3);
                                i12 = Math.max(i12, id3);
                            }
                        }
                    }
                    if (i11 <= i12) {
                        ArrayList arrayList2 = new ArrayList();
                        for (int i15 = 0; i15 < arrayList.size(); i15++) {
                            MessageObject messageObject = (MessageObject) arrayList.get(i15);
                            MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) coVar.f35479x6.f(messageObject.getGroupId());
                            if (groupedMessages != null) {
                                if (!arrayList2.contains(Long.valueOf(groupedMessages.groupId))) {
                                    for (int i16 = 0; i16 < groupedMessages.messages.size(); i16++) {
                                        MessageObject messageObject2 = groupedMessages.messages.get(i16);
                                        if (messageObject2 != null) {
                                            int id4 = messageObject2.getId();
                                            TranslateController translateController = coVar.getMessagesController().getTranslateController();
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
                                TranslateController translateController2 = coVar.getMessagesController().getTranslateController();
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
                if (coVar.L4 > 0 && coVar.J4 != null) {
                    coVar.getMessagesController().getTranslateController().checkTranslation((MessageObject) coVar.J4.get(Integer.valueOf(coVar.L4)), true);
                }
                coVar.Uc();
                return;
            case 2:
                mk mkVar = coVar.Y;
                if (mkVar != null && coVar.Cc != null) {
                    if (mkVar.t0()) {
                        coVar.Y.m0(false);
                        AndroidUtilities.showKeyboard(coVar.Cc.f45603a);
                        coVar.Cc.f45604b.f45600a.a(false, true);
                        return;
                    }
                    coVar.Y.V0(false, false, false);
                    coVar.Y.s1();
                    coVar.Cc.f45604b.f45600a.a(true, true);
                    return;
                }
                return;
            case 3:
                coVar.ta();
                return;
            case 4:
                coVar.g8(false, true, 0.0f);
                return;
            case 5:
                coVar.S9();
                return;
            case 6:
                coVar.c9();
                coVar.yc(0, true);
                return;
            case 7:
                coVar.g8(false, true, 0.0f);
                return;
            case 8:
                coVar.q9(2);
                return;
            case 9:
                coVar.g8(false, true, 0.0f);
                return;
            case 10:
                co.X(coVar);
                return;
            case 11:
                coVar.g8(false, true, 0.0f);
                return;
            case 12:
                coVar.g8(false, true, 0.0f);
                return;
            case 13:
                org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(coVar.getParentActivity(), 3, coVar.f35247ea);
                coVar.f35380pb = b2Var;
                b2Var.setOnShowListener(new of(coVar, 1));
                coVar.f35380pb.setOnCancelListener(coVar.f35343ma);
                coVar.f35380pb.q(500L);
                return;
            case 14:
                coVar.N6();
                return;
            case 15:
                coVar.f35184a = (coVar.f35184a + 1) % 3;
                return;
            case 16:
                coVar.f35197b = !coVar.f35197b;
                return;
            case 17:
                coVar.A7(true);
                org.telegram.messenger.w1.o(R.string.TranscriptionReportSent, org.telegram.ui.Components.yc.a0(coVar), R.raw.chats_infotip, 36);
                return;
            case 18:
                coVar.A0.M.clear();
                om omVar = coVar.A0;
                omVar.L = false;
                omVar.O(true);
                coVar.Pb(false);
                return;
            case 19:
                coVar.o9();
                coVar.r9();
                coVar.r7();
                coVar.t7();
                return;
            case 20:
                coVar.f35297ic = 0;
                coVar.f35309jc = false;
                coVar.f35473x0.e1();
                return;
            case 21:
                coVar.q9(5);
                return;
            case 22:
                coVar.yc(0, (coVar.P5 == 0 || SystemClock.elapsedRealtime() < coVar.P5 + 150) ? false : false);
                return;
            case 23:
                qk qkVar = coVar.R2;
                if ((qkVar == null || qkVar.getVisibility() != 0) && (f4Var = coVar.f35461w1) != null) {
                    f4Var.u();
                    return;
                }
                return;
            case 24:
                coVar.k7();
                return;
            case 25:
                coVar.q9(5);
                return;
            case 26:
                coVar.a7(false);
                return;
            case 27:
                FrameLayout.LayoutParams e7 = w7.x5.e(-1, -2, 87);
                e7.bottomMargin = coVar.Y.getMeasuredHeight();
                coVar.X0.addView(coVar.f35487y1, e7);
                coVar.f35487y1.setTranslationY(-AndroidUtilities.navigationBarHeight);
                coVar.f35487y1.m(0.0f, coVar.Y.getEmojiButton().getX() + AndroidUtilities.dp(22.0f));
                coVar.f35487y1.u();
                return;
            case 28:
                int i17 = co.Hc;
                coVar.Z6();
                return;
            default:
                int i18 = co.Hc;
                coVar.Z6();
                return;
        }
    }
}
