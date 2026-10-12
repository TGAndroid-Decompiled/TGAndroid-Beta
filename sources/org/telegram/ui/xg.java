package org.telegram.ui;

import android.os.SystemClock;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.TranslateController;
public final class xg implements Runnable {
    public final int f41855a;
    public final fo f41856b;

    public xg(fo foVar, int i10) {
        this.f41855a = i10;
        this.f41856b = foVar;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        di.d4 d4Var;
        int i10 = this.f41855a;
        boolean z12 = true;
        fo foVar = this.f41856b;
        switch (i10) {
            case 0:
                sk skVar = foVar.Y;
                if (skVar != null && foVar.Cc != null) {
                    if (skVar.r0()) {
                        foVar.Y.k0(false);
                        AndroidUtilities.showKeyboard(foVar.Cc.f44652a);
                        foVar.Cc.f44653b.f44649a.a(false, true);
                        return;
                    }
                    foVar.Y.T0(false, false, false);
                    foVar.Y.q1();
                    foVar.Cc.f44653b.f44649a.a(true, true);
                    return;
                }
                return;
            case 1:
                ArrayList arrayList = foVar.f36127u6;
                foVar.Hb = System.currentTimeMillis();
                if (foVar.f36160x0 != null && foVar.A0 != null) {
                    int i11 = Integer.MAX_VALUE;
                    int i12 = Integer.MIN_VALUE;
                    for (int i13 = 0; i13 < foVar.f36160x0.getChildCount(); i13++) {
                        View childAt = foVar.f36160x0.getChildAt(i13);
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
                            MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) foVar.f36166x6.f(messageObject.getGroupId());
                            if (groupedMessages != null) {
                                if (!arrayList2.contains(Long.valueOf(groupedMessages.groupId))) {
                                    for (int i16 = 0; i16 < groupedMessages.messages.size(); i16++) {
                                        MessageObject messageObject2 = groupedMessages.messages.get(i16);
                                        if (messageObject2 != null) {
                                            int id4 = messageObject2.getId();
                                            TranslateController translateController = foVar.getMessagesController().getTranslateController();
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
                                TranslateController translateController2 = foVar.getMessagesController().getTranslateController();
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
                if (foVar.L4 > 0 && foVar.J4 != null) {
                    foVar.getMessagesController().getTranslateController().checkTranslation((MessageObject) foVar.J4.get(Integer.valueOf(foVar.L4)), true);
                }
                foVar.Yc();
                return;
            case 2:
                foVar.xa();
                return;
            case 3:
                AndroidUtilities.removeFromParent(foVar.J0);
                return;
            case 4:
                foVar.h9();
                foVar.Cc(0, true);
                return;
            case 5:
                foVar.j8(false, true, 0.0f);
                return;
            case 6:
                foVar.X9();
                return;
            case 7:
                foVar.lc(false);
                return;
            case 8:
                foVar.v9(2);
                return;
            case 9:
                foVar.j8(false, true, 0.0f);
                return;
            case 10:
                fo.x0(foVar);
                return;
            case 11:
                foVar.j8(false, true, 0.0f);
                return;
            case 12:
                AndroidUtilities.removeFromParent(foVar.L0);
                return;
            case 13:
                foVar.j8(false, true, 0.0f);
                return;
            case 14:
                foVar.Q6();
                return;
            case 15:
                foVar.f35870a = (foVar.f35870a + 1) % 3;
                return;
            case 16:
                foVar.f35883b = !foVar.f35883b;
                return;
            case 17:
                foVar.D7(true);
                org.telegram.messenger.q.r(R.string.TranscriptionReportSent, org.telegram.ui.Components.zc.a0(foVar), R.raw.chats_infotip, 36);
                return;
            case 18:
                foVar.A0.M.clear();
                rm rmVar = foVar.A0;
                rmVar.L = false;
                rmVar.O(true);
                foVar.Tb(false);
                return;
            case 19:
                foVar.t9();
                foVar.w9();
                foVar.u7();
                foVar.w7();
                return;
            case 20:
                foVar.f36183ya = false;
                foVar.yc();
                return;
            case 21:
                foVar.f35982ic = 0;
                foVar.f35995jc = false;
                foVar.f36160x0.f1();
                return;
            case 22:
                foVar.v9(5);
                return;
            case 23:
                foVar.Cc(0, (foVar.P5 == 0 || SystemClock.elapsedRealtime() < foVar.P5 + 150) ? false : false);
                return;
            case 24:
                vk vkVar = foVar.R2;
                if ((vkVar == null || vkVar.getVisibility() != 0) && (d4Var = foVar.f36148w1) != null) {
                    d4Var.u();
                    return;
                }
                return;
            case 25:
                foVar.n7();
                return;
            case 26:
                foVar.v9(5);
                return;
            case 27:
                foVar.d7(false);
                return;
            case 28:
                FrameLayout.LayoutParams e = w7.a6.e(-1, -2, 87);
                e.bottomMargin = foVar.Y.getMeasuredHeight();
                foVar.X0.addView(foVar.f36175y1, e);
                foVar.f36175y1.setTranslationY(-AndroidUtilities.navigationBarHeight);
                foVar.f36175y1.m(0.0f, foVar.Y.getEmojiButton().getX() + AndroidUtilities.dp(22.0f));
                foVar.f36175y1.u();
                return;
            default:
                int i17 = fo.Hc;
                foVar.c7();
                return;
        }
    }
}
