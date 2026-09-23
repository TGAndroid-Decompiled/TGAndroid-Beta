package org.telegram.ui;

import android.os.SystemClock;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.TranslateController;
public final class sg implements Runnable {
    public final int f37295a;
    public final xn f37296b;

    public sg(xn xnVar, int i10) {
        this.f37295a = i10;
        this.f37296b = xnVar;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        ci.e4 e4Var;
        int i10 = this.f37295a;
        boolean z12 = true;
        xn xnVar = this.f37296b;
        switch (i10) {
            case 0:
                AndroidUtilities.removeFromParent(xnVar.J0);
                return;
            case 1:
                ArrayList arrayList = xnVar.f39563u6;
                xnVar.Gb = System.currentTimeMillis();
                if (xnVar.f39596x0 != null && xnVar.A0 != null) {
                    int i11 = Integer.MAX_VALUE;
                    int i12 = Integer.MIN_VALUE;
                    for (int i13 = 0; i13 < xnVar.f39596x0.getChildCount(); i13++) {
                        View childAt = xnVar.f39596x0.getChildAt(i13);
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
                            MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) xnVar.f39602x6.f(messageObject.getGroupId());
                            if (groupedMessages != null) {
                                if (!arrayList2.contains(Long.valueOf(groupedMessages.groupId))) {
                                    for (int i16 = 0; i16 < groupedMessages.messages.size(); i16++) {
                                        MessageObject messageObject2 = groupedMessages.messages.get(i16);
                                        if (messageObject2 != null) {
                                            int id4 = messageObject2.getId();
                                            TranslateController translateController = xnVar.getMessagesController().getTranslateController();
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
                                TranslateController translateController2 = xnVar.getMessagesController().getTranslateController();
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
                if (xnVar.L4 > 0 && xnVar.J4 != null) {
                    xnVar.getMessagesController().getTranslateController().checkTranslation((MessageObject) xnVar.J4.get(Integer.valueOf(xnVar.L4)), true);
                }
                xnVar.Uc();
                return;
            case 2:
                jk jkVar = xnVar.Y;
                if (jkVar != null && xnVar.Bc != null) {
                    if (jkVar.u0()) {
                        xnVar.Y.n0(false);
                        AndroidUtilities.showKeyboard(xnVar.Bc.f41704a);
                        xnVar.Bc.f41705b.f41701a.a(false, true);
                        return;
                    }
                    xnVar.Y.W0(false, false, false);
                    xnVar.Y.t1();
                    xnVar.Bc.f41705b.f41701a.a(true, true);
                    return;
                }
                return;
            case 3:
                xnVar.ta();
                return;
            case 4:
                xnVar.g8(false, true, 0.0f);
                return;
            case 5:
                xnVar.S9();
                return;
            case 6:
                xnVar.c9();
                xnVar.yc(0, true);
                return;
            case 7:
                xnVar.g8(false, true, 0.0f);
                return;
            case 8:
                xnVar.q9(2);
                return;
            case 9:
                xnVar.g8(false, true, 0.0f);
                return;
            case 10:
                xn.X(xnVar);
                return;
            case 11:
                xnVar.g8(false, true, 0.0f);
                return;
            case 12:
                xnVar.g8(false, true, 0.0f);
                return;
            case 13:
                org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(xnVar.getParentActivity(), 3, xnVar.f39370ea);
                xnVar.f39491ob = b2Var;
                b2Var.setOnShowListener(new nf(xnVar, 1));
                xnVar.f39491ob.setOnCancelListener(xnVar.f39466ma);
                xnVar.f39491ob.q(500L);
                return;
            case 14:
                xnVar.N6();
                return;
            case 15:
                xnVar.f39308a = (xnVar.f39308a + 1) % 3;
                return;
            case 16:
                xnVar.f39321b = !xnVar.f39321b;
                return;
            case 17:
                xnVar.A7(true);
                org.telegram.messenger.z0.o(R.string.TranscriptionReportSent, org.telegram.ui.Components.xc.a0(xnVar), R.raw.chats_infotip, 36);
                return;
            case 18:
                xnVar.A0.M.clear();
                km kmVar = xnVar.A0;
                kmVar.L = false;
                kmVar.O(true);
                xnVar.Pb(false);
                return;
            case 19:
                xnVar.o9();
                xnVar.r9();
                xnVar.r7();
                xnVar.t7();
                return;
            case 20:
                xnVar.f39407hc = 0;
                xnVar.f39420ic = false;
                xnVar.f39596x0.f1();
                return;
            case 21:
                xnVar.q9(5);
                return;
            case 22:
                xnVar.yc(0, (xnVar.P5 == 0 || SystemClock.elapsedRealtime() < xnVar.P5 + 150) ? false : false);
                return;
            case 23:
                nk nkVar = xnVar.R2;
                if ((nkVar == null || nkVar.getVisibility() != 0) && (e4Var = xnVar.f39584w1) != null) {
                    e4Var.u();
                    return;
                }
                return;
            case 24:
                xnVar.k7();
                return;
            case 25:
                xnVar.q9(5);
                return;
            case 26:
                xnVar.a7(false);
                return;
            case 27:
                FrameLayout.LayoutParams e = w7.x5.e(-1, -2, 87);
                e.bottomMargin = xnVar.Y.getMeasuredHeight();
                xnVar.X0.addView(xnVar.f39610y1, e);
                xnVar.f39610y1.setTranslationY(-AndroidUtilities.navigationBarHeight);
                xnVar.f39610y1.m(0.0f, xnVar.Y.getEmojiButton().getX() + AndroidUtilities.dp(22.0f));
                xnVar.f39610y1.u();
                return;
            case 28:
                int i17 = xn.Gc;
                xnVar.Z6();
                return;
            default:
                int i18 = xn.Gc;
                xnVar.Z6();
                return;
        }
    }
}
