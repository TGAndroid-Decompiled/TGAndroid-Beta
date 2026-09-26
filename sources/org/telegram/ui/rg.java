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
public final class rg implements Runnable {
    public final int f37327a;
    public final wn f37328b;

    public rg(wn wnVar, int i10) {
        this.f37327a = i10;
        this.f37328b = wnVar;
    }

    @Override
    public final void run() {
        View sendButton;
        boolean z10;
        boolean z11;
        ci.e4 e4Var;
        int i10 = this.f37327a;
        boolean z12 = true;
        wn wnVar = this.f37328b;
        switch (i10) {
            case 0:
                if (wnVar.getParentActivity() != null && wnVar.fragmentView != null && wnVar.Y != null && wnVar.Ea == null && wnVar.getMessagesController().getSendPaidMessagesStars(wnVar.a()) <= 0 && (sendButton = wnVar.Y.getSendButton()) != null && wnVar.Y.getEditField() != null && wnVar.Y.getEditField().getText().length() != 0) {
                    SharedConfig.increaseScheduledHintShowed();
                    if (wnVar.f39508i2 == null) {
                        org.telegram.ui.Components.k40 k40Var = new org.telegram.ui.Components.k40(4, wnVar.getParentActivity(), wnVar.f39468ea, false);
                        wnVar.f39508i2 = k40Var;
                        k40Var.a();
                        wnVar.f39508i2.setAlpha(0.0f);
                        wnVar.f39508i2.setVisibility(4);
                        wnVar.f39508i2.setText(LocaleController.getString(R.string.ScheduledHint));
                        wnVar.X0.addView(wnVar.f39508i2, w7.y5.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                    }
                    wnVar.f39508i2.f(sendButton, true);
                    wnVar.f39521j2 = true;
                    return;
                }
                return;
            case 1:
                jk jkVar = wnVar.Y;
                if (jkVar != null && wnVar.Bc != null) {
                    if (jkVar.t0()) {
                        wnVar.Y.m0(false);
                        AndroidUtilities.showKeyboard(wnVar.Bc.f42036a);
                        wnVar.Bc.f42037b.f42033a.a(false, true);
                        return;
                    }
                    wnVar.Y.V0(false, false, false);
                    wnVar.Y.s1();
                    wnVar.Bc.f42037b.f42033a.a(true, true);
                    return;
                }
                return;
            case 2:
                ArrayList arrayList = wnVar.f39661u6;
                wnVar.Gb = System.currentTimeMillis();
                if (wnVar.f39694x0 != null && wnVar.A0 != null) {
                    int i11 = Integer.MAX_VALUE;
                    int i12 = Integer.MIN_VALUE;
                    for (int i13 = 0; i13 < wnVar.f39694x0.getChildCount(); i13++) {
                        View childAt = wnVar.f39694x0.getChildAt(i13);
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
                            MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) wnVar.f39700x6.f(messageObject.getGroupId());
                            if (groupedMessages != null) {
                                if (!arrayList2.contains(Long.valueOf(groupedMessages.groupId))) {
                                    for (int i16 = 0; i16 < groupedMessages.messages.size(); i16++) {
                                        MessageObject messageObject2 = groupedMessages.messages.get(i16);
                                        if (messageObject2 != null) {
                                            int id4 = messageObject2.getId();
                                            TranslateController translateController = wnVar.getMessagesController().getTranslateController();
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
                                TranslateController translateController2 = wnVar.getMessagesController().getTranslateController();
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
                if (wnVar.L4 > 0 && wnVar.J4 != null) {
                    wnVar.getMessagesController().getTranslateController().checkTranslation((MessageObject) wnVar.J4.get(Integer.valueOf(wnVar.L4)), true);
                }
                wnVar.Uc();
                return;
            case 3:
                wnVar.ta();
                return;
            case 4:
                wnVar.S9();
                return;
            case 5:
                wnVar.c9();
                wnVar.yc(0, true);
                return;
            case 6:
                wnVar.g8(false, true, 0.0f);
                return;
            case 7:
                wnVar.g8(false, true, 0.0f);
                return;
            case 8:
                wnVar.q9(2);
                return;
            case 9:
                wnVar.g8(false, true, 0.0f);
                return;
            case 10:
                wn.k0(wnVar);
                return;
            case 11:
                wnVar.g8(false, true, 0.0f);
                return;
            case 12:
                wnVar.g8(false, true, 0.0f);
                return;
            case 13:
                org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(wnVar.getParentActivity(), 3, wnVar.f39468ea);
                wnVar.f39589ob = a2Var;
                a2Var.setOnShowListener(new mf(wnVar, 1));
                wnVar.f39589ob.setOnCancelListener(wnVar.f39564ma);
                wnVar.f39589ob.q(500L);
                return;
            case 14:
                wnVar.N6();
                return;
            case 15:
                wnVar.f39406a = (wnVar.f39406a + 1) % 3;
                return;
            case 16:
                wnVar.f39419b = !wnVar.f39419b;
                return;
            case 17:
                wnVar.A7(true);
                org.telegram.messenger.f0.p(R.string.TranscriptionReportSent, org.telegram.ui.Components.xc.a0(wnVar), R.raw.chats_infotip, 36);
                return;
            case 18:
                wnVar.A0.M.clear();
                jm jmVar = wnVar.A0;
                jmVar.L = false;
                jmVar.O(true);
                wnVar.Pb(false);
                return;
            case 19:
                wnVar.o9();
                wnVar.r9();
                wnVar.r7();
                wnVar.t7();
                return;
            case 20:
                wnVar.f39505hc = 0;
                wnVar.f39518ic = false;
                wnVar.f39694x0.f1();
                return;
            case 21:
                wnVar.q9(5);
                return;
            case 22:
                wnVar.yc(0, (wnVar.P5 == 0 || SystemClock.elapsedRealtime() < wnVar.P5 + 150) ? false : false);
                return;
            case 23:
                nk nkVar = wnVar.R2;
                if ((nkVar == null || nkVar.getVisibility() != 0) && (e4Var = wnVar.f39682w1) != null) {
                    e4Var.u();
                    return;
                }
                return;
            case 24:
                wnVar.k7();
                return;
            case 25:
                wnVar.q9(5);
                return;
            case 26:
                wnVar.a7(false);
                return;
            case 27:
                FrameLayout.LayoutParams e = w7.y5.e(-1, -2, 87);
                e.bottomMargin = wnVar.Y.getMeasuredHeight();
                wnVar.X0.addView(wnVar.f39708y1, e);
                wnVar.f39708y1.setTranslationY(-AndroidUtilities.navigationBarHeight);
                wnVar.f39708y1.m(0.0f, wnVar.Y.getEmojiButton().getX() + AndroidUtilities.dp(22.0f));
                wnVar.f39708y1.u();
                return;
            case 28:
                int i17 = wn.Gc;
                wnVar.Z6();
                return;
            default:
                int i18 = wn.Gc;
                wnVar.Z6();
                return;
        }
    }
}
