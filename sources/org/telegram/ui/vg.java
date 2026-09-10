package org.telegram.ui;

import android.os.SystemClock;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.TranslateController;
public final class vg implements Runnable {
    public final int f37552a;
    public final eo f37553b;

    public vg(eo eoVar, int i10) {
        this.f37552a = i10;
        this.f37553b = eoVar;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        bi.x4 x4Var;
        int i10 = this.f37552a;
        boolean z12 = true;
        eo eoVar = this.f37553b;
        switch (i10) {
            case 0:
                AndroidUtilities.removeFromParent(eoVar.J0);
                return;
            case 1:
                ArrayList arrayList = eoVar.f32509u6;
                eoVar.Hb = System.currentTimeMillis();
                if (eoVar.f32542x0 != null && eoVar.A0 != null) {
                    int i11 = Integer.MAX_VALUE;
                    int i12 = Integer.MIN_VALUE;
                    for (int i13 = 0; i13 < eoVar.f32542x0.getChildCount(); i13++) {
                        View childAt = eoVar.f32542x0.getChildAt(i13);
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
                            MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) eoVar.f32548x6.f(messageObject.getGroupId());
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
                eoVar.Uc();
                return;
            case 2:
                ok okVar = eoVar.Y;
                if (okVar != null && eoVar.Cc != null) {
                    if (okVar.t0()) {
                        eoVar.Y.m0(false);
                        AndroidUtilities.showKeyboard(eoVar.Cc.f40395a);
                        eoVar.Cc.f40396b.f40392a.a(false, true);
                        return;
                    }
                    eoVar.Y.V0(false, false, false);
                    eoVar.Y.s1();
                    eoVar.Cc.f40396b.f40392a.a(true, true);
                    return;
                }
                return;
            case 3:
                eoVar.ta();
                return;
            case 4:
                eoVar.g8(false, true, 0.0f);
                return;
            case 5:
                eoVar.S9();
                return;
            case 6:
                eoVar.c9();
                eoVar.yc(0, true);
                return;
            case 7:
                eoVar.g8(false, true, 0.0f);
                return;
            case 8:
                eoVar.q9(2);
                return;
            case 9:
                eoVar.g8(false, true, 0.0f);
                return;
            case 10:
                eo.X(eoVar);
                return;
            case 11:
                eoVar.g8(false, true, 0.0f);
                return;
            case 12:
                eoVar.g8(false, true, 0.0f);
                return;
            case 13:
                org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(eoVar.getParentActivity(), 3, eoVar.f32316ea);
                eoVar.f32449pb = d2Var;
                d2Var.setOnShowListener(new qf(eoVar, 1));
                eoVar.f32449pb.setOnCancelListener(eoVar.f32412ma);
                eoVar.f32449pb.q(500L);
                return;
            case 14:
                eoVar.N6();
                return;
            case 15:
                eoVar.f32254a = (eoVar.f32254a + 1) % 3;
                return;
            case 16:
                eoVar.f32267b = !eoVar.f32267b;
                return;
            case 17:
                eoVar.A7(true);
                org.telegram.messenger.a2.o(R.string.TranscriptionReportSent, org.telegram.ui.Components.wc.a0(eoVar), R.raw.chats_infotip, 36);
                return;
            case 18:
                eoVar.A0.M.clear();
                pm pmVar = eoVar.A0;
                pmVar.L = false;
                pmVar.O(true);
                eoVar.Pb(false);
                return;
            case 19:
                eoVar.o9();
                eoVar.r9();
                eoVar.r7();
                eoVar.t7();
                return;
            case 20:
                eoVar.f32366ic = 0;
                eoVar.f32378jc = false;
                eoVar.f32542x0.e1();
                return;
            case 21:
                eoVar.q9(5);
                return;
            case 22:
                eoVar.yc(0, (eoVar.P5 == 0 || SystemClock.elapsedRealtime() < eoVar.P5 + 150) ? false : false);
                return;
            case 23:
                sk skVar = eoVar.R2;
                if ((skVar == null || skVar.getVisibility() != 0) && (x4Var = eoVar.f32530w1) != null) {
                    x4Var.u();
                    return;
                }
                return;
            case 24:
                eoVar.k7();
                return;
            case 25:
                eoVar.q9(5);
                return;
            case 26:
                eoVar.a7(false);
                return;
            case 27:
                FrameLayout.LayoutParams e = w7.a6.e(-1, -2, 87);
                e.bottomMargin = eoVar.Y.getMeasuredHeight();
                eoVar.X0.addView(eoVar.f32556y1, e);
                eoVar.f32556y1.setTranslationY(-AndroidUtilities.navigationBarHeight);
                eoVar.f32556y1.m(0.0f, eoVar.Y.getEmojiButton().getX() + AndroidUtilities.dp(22.0f));
                eoVar.f32556y1.u();
                return;
            case 28:
                int i17 = eo.Hc;
                eoVar.Z6();
                return;
            default:
                int i18 = eo.Hc;
                eoVar.Z6();
                return;
        }
    }
}
