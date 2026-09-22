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
    public final int f37970a;
    public final bo f37971b;

    public ug(bo boVar, int i10) {
        this.f37970a = i10;
        this.f37971b = boVar;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        ci.f4 f4Var;
        int i10 = this.f37970a;
        boolean z12 = true;
        bo boVar = this.f37971b;
        switch (i10) {
            case 0:
                AndroidUtilities.removeFromParent(boVar.J0);
                return;
            case 1:
                ArrayList arrayList = boVar.f32486u6;
                boVar.Gb = System.currentTimeMillis();
                if (boVar.f32519x0 != null && boVar.A0 != null) {
                    int i11 = Integer.MAX_VALUE;
                    int i12 = Integer.MIN_VALUE;
                    for (int i13 = 0; i13 < boVar.f32519x0.getChildCount(); i13++) {
                        View childAt = boVar.f32519x0.getChildAt(i13);
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
                            MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) boVar.f32525x6.f(messageObject.getGroupId());
                            if (groupedMessages != null) {
                                if (!arrayList2.contains(Long.valueOf(groupedMessages.groupId))) {
                                    for (int i16 = 0; i16 < groupedMessages.messages.size(); i16++) {
                                        MessageObject messageObject2 = groupedMessages.messages.get(i16);
                                        if (messageObject2 != null) {
                                            int id4 = messageObject2.getId();
                                            TranslateController translateController = boVar.getMessagesController().getTranslateController();
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
                                TranslateController translateController2 = boVar.getMessagesController().getTranslateController();
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
                if (boVar.L4 > 0 && boVar.J4 != null) {
                    boVar.getMessagesController().getTranslateController().checkTranslation((MessageObject) boVar.J4.get(Integer.valueOf(boVar.L4)), true);
                }
                boVar.Uc();
                return;
            case 2:
                mk mkVar = boVar.Y;
                if (mkVar != null && boVar.Bc != null) {
                    if (mkVar.u0()) {
                        boVar.Y.n0(false);
                        AndroidUtilities.showKeyboard(boVar.Bc.f41748a);
                        boVar.Bc.f41749b.f41745a.a(false, true);
                        return;
                    }
                    boVar.Y.W0(false, false, false);
                    boVar.Y.t1();
                    boVar.Bc.f41749b.f41745a.a(true, true);
                    return;
                }
                return;
            case 3:
                boVar.ta();
                return;
            case 4:
                boVar.g8(false, true, 0.0f);
                return;
            case 5:
                boVar.S9();
                return;
            case 6:
                boVar.c9();
                boVar.yc(0, true);
                return;
            case 7:
                boVar.g8(false, true, 0.0f);
                return;
            case 8:
                boVar.q9(2);
                return;
            case 9:
                boVar.g8(false, true, 0.0f);
                return;
            case 10:
                bo.X(boVar);
                return;
            case 11:
                boVar.g8(false, true, 0.0f);
                return;
            case 12:
                boVar.g8(false, true, 0.0f);
                return;
            case 13:
                org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(boVar.getParentActivity(), 3, boVar.f32293ea);
                boVar.f32414ob = b2Var;
                b2Var.setOnShowListener(new of(boVar, 1));
                boVar.f32414ob.setOnCancelListener(boVar.f32389ma);
                boVar.f32414ob.q(500L);
                return;
            case 14:
                boVar.N6();
                return;
            case 15:
                boVar.f32231a = (boVar.f32231a + 1) % 3;
                return;
            case 16:
                boVar.f32244b = !boVar.f32244b;
                return;
            case 17:
                boVar.A7(true);
                org.telegram.messenger.y0.o(R.string.TranscriptionReportSent, org.telegram.ui.Components.vc.a0(boVar), R.raw.chats_infotip, 36);
                return;
            case 18:
                boVar.A0.M.clear();
                nm nmVar = boVar.A0;
                nmVar.L = false;
                nmVar.O(true);
                boVar.Pb(false);
                return;
            case 19:
                boVar.o9();
                boVar.r9();
                boVar.r7();
                boVar.t7();
                return;
            case 20:
                boVar.f32330hc = 0;
                boVar.f32343ic = false;
                boVar.f32519x0.f1();
                return;
            case 21:
                boVar.q9(5);
                return;
            case 22:
                boVar.yc(0, (boVar.P5 == 0 || SystemClock.elapsedRealtime() < boVar.P5 + 150) ? false : false);
                return;
            case 23:
                qk qkVar = boVar.R2;
                if ((qkVar == null || qkVar.getVisibility() != 0) && (f4Var = boVar.f32507w1) != null) {
                    f4Var.u();
                    return;
                }
                return;
            case 24:
                boVar.k7();
                return;
            case 25:
                boVar.q9(5);
                return;
            case 26:
                boVar.a7(false);
                return;
            case 27:
                FrameLayout.LayoutParams e = w7.x5.e(-1, -2, 87);
                e.bottomMargin = boVar.Y.getMeasuredHeight();
                boVar.X0.addView(boVar.f32533y1, e);
                boVar.f32533y1.setTranslationY(-AndroidUtilities.navigationBarHeight);
                boVar.f32533y1.m(0.0f, boVar.Y.getEmojiButton().getX() + AndroidUtilities.dp(22.0f));
                boVar.f32533y1.u();
                return;
            case 28:
                int i17 = bo.Gc;
                boVar.Z6();
                return;
            default:
                int i18 = bo.Gc;
                boVar.Z6();
                return;
        }
    }
}
