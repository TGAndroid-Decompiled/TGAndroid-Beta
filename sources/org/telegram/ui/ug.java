package org.telegram.ui;

import android.os.SystemClock;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.TranslateController;
public final class ug implements Runnable {
    public final int f38249a;
    public final xn f38250b;

    public ug(xn xnVar, int i10) {
        this.f38249a = i10;
        this.f38250b = xnVar;
    }

    @Override
    public final void run() {
        View sendButton;
        boolean z10;
        boolean z11;
        ci.e4 e4Var;
        int i10 = this.f38249a;
        boolean z12 = true;
        xn xnVar = this.f38250b;
        switch (i10) {
            case 0:
                if (xnVar.getParentActivity() != null && xnVar.fragmentView != null && xnVar.Y != null && xnVar.Ea == null && xnVar.getMessagesController().getSendPaidMessagesStars(xnVar.a()) <= 0 && (sendButton = xnVar.Y.getSendButton()) != null && xnVar.Y.getEditField() != null && xnVar.Y.getEditField().getText().length() != 0) {
                    SharedConfig.increaseScheduledHintShowed();
                    if (xnVar.f39791i2 == null) {
                        org.telegram.ui.Components.l40 l40Var = new org.telegram.ui.Components.l40(4, xnVar.getParentActivity(), xnVar.f39750ea, false);
                        xnVar.f39791i2 = l40Var;
                        l40Var.a();
                        xnVar.f39791i2.setAlpha(0.0f);
                        xnVar.f39791i2.setVisibility(4);
                        xnVar.f39791i2.setText(LocaleController.getString(R.string.ScheduledHint));
                        xnVar.X0.addView(xnVar.f39791i2, w7.y5.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                    }
                    xnVar.f39791i2.f(sendButton, true);
                    xnVar.f39804j2 = true;
                    return;
                }
                return;
            case 1:
                lk lkVar = xnVar.Y;
                if (lkVar != null && xnVar.Bc != null) {
                    if (lkVar.t0()) {
                        xnVar.Y.m0(false);
                        AndroidUtilities.showKeyboard(xnVar.Bc.f42067a);
                        xnVar.Bc.f42068b.f42064a.a(false, true);
                        return;
                    }
                    xnVar.Y.U0(false, false, false);
                    xnVar.Y.r1();
                    xnVar.Bc.f42068b.f42064a.a(true, true);
                    return;
                }
                return;
            case 2:
                ArrayList arrayList = xnVar.f39944u6;
                xnVar.Gb = System.currentTimeMillis();
                if (xnVar.f39977x0 != null && xnVar.A0 != null) {
                    int i11 = Integer.MAX_VALUE;
                    int i12 = Integer.MIN_VALUE;
                    for (int i13 = 0; i13 < xnVar.f39977x0.getChildCount(); i13++) {
                        View childAt = xnVar.f39977x0.getChildAt(i13);
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
                            MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) xnVar.f39983x6.f(messageObject.getGroupId());
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
            case 3:
                xnVar.ta();
                return;
            case 4:
                xnVar.S9();
                return;
            case 5:
                xnVar.c9();
                xnVar.yc(0, true);
                return;
            case 6:
                xnVar.g8(false, true, 0.0f);
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
                xn.k0(xnVar);
                return;
            case 11:
                xnVar.g8(false, true, 0.0f);
                return;
            case 12:
                xnVar.g8(false, true, 0.0f);
                return;
            case 13:
                org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(xnVar.getParentActivity(), 3, xnVar.f39750ea);
                xnVar.f39872ob = c2Var;
                c2Var.setOnShowListener(new pf(xnVar, 1));
                xnVar.f39872ob.setOnCancelListener(xnVar.f39847ma);
                xnVar.f39872ob.q(500L);
                return;
            case 14:
                xnVar.N6();
                return;
            case 15:
                xnVar.f39688a = (xnVar.f39688a + 1) % 3;
                return;
            case 16:
                xnVar.f39701b = !xnVar.f39701b;
                return;
            case 17:
                xnVar.A7(true);
                org.telegram.messenger.l0.o(R.string.TranscriptionReportSent, org.telegram.ui.Components.xc.a0(xnVar), R.raw.chats_infotip, 36);
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
                xnVar.f39788hc = 0;
                xnVar.f39801ic = false;
                xnVar.f39977x0.g1();
                return;
            case 21:
                xnVar.q9(5);
                return;
            case 22:
                xnVar.yc(0, (xnVar.P5 == 0 || SystemClock.elapsedRealtime() < xnVar.P5 + 150) ? false : false);
                return;
            case 23:
                pk pkVar = xnVar.R2;
                if ((pkVar == null || pkVar.getVisibility() != 0) && (e4Var = xnVar.f39965w1) != null) {
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
                FrameLayout.LayoutParams e = w7.y5.e(-1, -2, 87);
                e.bottomMargin = xnVar.Y.getMeasuredHeight();
                xnVar.X0.addView(xnVar.f39991y1, e);
                xnVar.f39991y1.setTranslationY(-AndroidUtilities.navigationBarHeight);
                xnVar.f39991y1.m(0.0f, xnVar.Y.getEmojiButton().getX() + AndroidUtilities.dp(22.0f));
                xnVar.f39991y1.u();
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
