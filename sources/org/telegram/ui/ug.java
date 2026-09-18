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
    public final int f37988a;
    public final zn f37989b;

    public ug(zn znVar, int i10) {
        this.f37988a = i10;
        this.f37989b = znVar;
    }

    @Override
    public final void run() {
        View sendButton;
        boolean z10;
        boolean z11;
        ci.f4 f4Var;
        int i10 = this.f37988a;
        boolean z12 = true;
        zn znVar = this.f37989b;
        switch (i10) {
            case 0:
                if (znVar.getParentActivity() != null && znVar.fragmentView != null && znVar.Y != null && znVar.Ea == null && znVar.getMessagesController().getSendPaidMessagesStars(znVar.a()) <= 0 && (sendButton = znVar.Y.getSendButton()) != null && znVar.Y.getEditField() != null && znVar.Y.getEditField().getText().length() != 0) {
                    SharedConfig.increaseScheduledHintShowed();
                    if (znVar.f40302i2 == null) {
                        org.telegram.ui.Components.i40 i40Var = new org.telegram.ui.Components.i40(4, znVar.getParentActivity(), znVar.f40261ea, false);
                        znVar.f40302i2 = i40Var;
                        i40Var.a();
                        znVar.f40302i2.setAlpha(0.0f);
                        znVar.f40302i2.setVisibility(4);
                        znVar.f40302i2.setText(LocaleController.getString(R.string.ScheduledHint));
                        znVar.X0.addView(znVar.f40302i2, w7.y5.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                    }
                    znVar.f40302i2.f(sendButton, true);
                    znVar.f40315j2 = true;
                    return;
                }
                return;
            case 1:
                lk lkVar = znVar.Y;
                if (lkVar != null && znVar.Bc != null) {
                    if (lkVar.t0()) {
                        znVar.Y.m0(false);
                        AndroidUtilities.showKeyboard(znVar.Bc.f42006a);
                        znVar.Bc.f42007b.f42003a.a(false, true);
                        return;
                    }
                    znVar.Y.U0(false, false, false);
                    znVar.Y.r1();
                    znVar.Bc.f42007b.f42003a.a(true, true);
                    return;
                }
                return;
            case 2:
                ArrayList arrayList = znVar.f40455u6;
                znVar.Gb = System.currentTimeMillis();
                if (znVar.f40488x0 != null && znVar.A0 != null) {
                    int i11 = Integer.MAX_VALUE;
                    int i12 = Integer.MIN_VALUE;
                    for (int i13 = 0; i13 < znVar.f40488x0.getChildCount(); i13++) {
                        View childAt = znVar.f40488x0.getChildAt(i13);
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
                            MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) znVar.f40494x6.f(messageObject.getGroupId());
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
                znVar.Uc();
                return;
            case 3:
                znVar.ta();
                return;
            case 4:
                znVar.S9();
                return;
            case 5:
                znVar.c9();
                znVar.yc(0, true);
                return;
            case 6:
                znVar.g8(false, true, 0.0f);
                return;
            case 7:
                znVar.g8(false, true, 0.0f);
                return;
            case 8:
                znVar.q9(2);
                return;
            case 9:
                znVar.g8(false, true, 0.0f);
                return;
            case 10:
                zn.l0(znVar);
                return;
            case 11:
                znVar.g8(false, true, 0.0f);
                return;
            case 12:
                znVar.g8(false, true, 0.0f);
                return;
            case 13:
                org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(znVar.getParentActivity(), 3, znVar.f40261ea);
                znVar.f40383ob = b2Var;
                b2Var.setOnShowListener(new pf(znVar, 1));
                znVar.f40383ob.setOnCancelListener(znVar.f40358ma);
                znVar.f40383ob.q(500L);
                return;
            case 14:
                znVar.N6();
                return;
            case 15:
                znVar.f40199a = (znVar.f40199a + 1) % 3;
                return;
            case 16:
                znVar.f40212b = !znVar.f40212b;
                return;
            case 17:
                znVar.A7(true);
                org.telegram.messenger.q.q(R.string.TranscriptionReportSent, org.telegram.ui.Components.xc.a0(znVar), R.raw.chats_infotip, 36);
                return;
            case 18:
                znVar.A0.M.clear();
                lm lmVar = znVar.A0;
                lmVar.L = false;
                lmVar.O(true);
                znVar.Pb(false);
                return;
            case 19:
                znVar.o9();
                znVar.r9();
                znVar.r7();
                znVar.t7();
                return;
            case 20:
                znVar.f40299hc = 0;
                znVar.f40312ic = false;
                znVar.f40488x0.g1();
                return;
            case 21:
                znVar.q9(5);
                return;
            case 22:
                znVar.yc(0, (znVar.P5 == 0 || SystemClock.elapsedRealtime() < znVar.P5 + 150) ? false : false);
                return;
            case 23:
                pk pkVar = znVar.R2;
                if ((pkVar == null || pkVar.getVisibility() != 0) && (f4Var = znVar.f40476w1) != null) {
                    f4Var.u();
                    return;
                }
                return;
            case 24:
                znVar.k7();
                return;
            case 25:
                znVar.q9(5);
                return;
            case 26:
                znVar.a7(false);
                return;
            case 27:
                FrameLayout.LayoutParams e = w7.y5.e(-1, -2, 87);
                e.bottomMargin = znVar.Y.getMeasuredHeight();
                znVar.X0.addView(znVar.f40502y1, e);
                znVar.f40502y1.setTranslationY(-AndroidUtilities.navigationBarHeight);
                znVar.f40502y1.m(0.0f, znVar.Y.getEmojiButton().getX() + AndroidUtilities.dp(22.0f));
                znVar.f40502y1.u();
                return;
            case 28:
                int i17 = zn.Gc;
                znVar.Z6();
                return;
            default:
                int i18 = zn.Gc;
                znVar.Z6();
                return;
        }
    }
}
