package org.telegram.ui;

import android.os.SystemClock;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.TranslateController;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ug implements Runnable {
    public final int f41189a;
    public final yn f41190b;

    public ug(yn ynVar, int i10) {
        this.f41189a = i10;
        this.f41190b = ynVar;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        ci.e4 e4Var;
        int i10 = this.f41189a;
        boolean z12 = true;
        yn ynVar = this.f41190b;
        switch (i10) {
            case 0:
                ArrayList arrayList = ynVar.f43493s6;
                ynVar.Eb = System.currentTimeMillis();
                if (ynVar.f43525v0 != null && ynVar.f43564y0 != null) {
                    int i11 = Integer.MAX_VALUE;
                    int i12 = Integer.MIN_VALUE;
                    for (int i13 = 0; i13 < ynVar.f43525v0.getChildCount(); i13++) {
                        View childAt = ynVar.f43525v0.getChildAt(i13);
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
                            MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) ynVar.f43531v6.f(messageObject.getGroupId());
                            if (groupedMessages != null) {
                                if (!arrayList2.contains(Long.valueOf(groupedMessages.groupId))) {
                                    for (int i16 = 0; i16 < groupedMessages.messages.size(); i16++) {
                                        MessageObject messageObject2 = groupedMessages.messages.get(i16);
                                        if (messageObject2 != null) {
                                            int id4 = messageObject2.getId();
                                            TranslateController translateController = ynVar.getMessagesController().getTranslateController();
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
                                TranslateController translateController2 = ynVar.getMessagesController().getTranslateController();
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
                if (ynVar.J4 > 0 && ynVar.H4 != null) {
                    ynVar.getMessagesController().getTranslateController().checkTranslation((MessageObject) ynVar.H4.get(Integer.valueOf(ynVar.J4)), true);
                }
                ynVar.Tc();
                return;
            case 1:
                jk jkVar = ynVar.W;
                if (jkVar != null && ynVar.f43588zc != null) {
                    if (jkVar.t0()) {
                        ynVar.W.m0(false);
                        AndroidUtilities.showKeyboard(ynVar.f43588zc.f45444a);
                        ynVar.f43588zc.f45445b.f45441a.a(false, true);
                        return;
                    }
                    ynVar.W.U0(false, false, false);
                    ynVar.W.r1();
                    ynVar.f43588zc.f45445b.f45441a.a(true, true);
                    return;
                }
                return;
            case 2:
                ynVar.sa();
                return;
            case 3:
                ynVar.g8(false, true, 0.0f);
                return;
            case 4:
                AndroidUtilities.removeFromParent(ynVar.J0);
                return;
            case 5:
                ynVar.R9();
                return;
            case 6:
                ynVar.d9();
                ynVar.xc(0, true);
                return;
            case 7:
                ynVar.g8(false, true, 0.0f);
                return;
            case 8:
                ynVar.g8(false, true, 0.0f);
                return;
            case 9:
                yn.X(ynVar);
                return;
            case 10:
                ynVar.g8(false, true, 0.0f);
                return;
            case 11:
                ynVar.g8(false, true, 0.0f);
                return;
            case 12:
                ynVar.N6();
                return;
            case 13:
                ynVar.f43261a = (ynVar.f43261a + 1) % 3;
                return;
            case 14:
                ynVar.f43274b = !ynVar.f43274b;
                return;
            case 15:
                ynVar.A7(true);
                org.telegram.messenger.f0.p(R.string.TranscriptionReportSent, org.telegram.ui.Components.yc.a0(ynVar), R.raw.chats_infotip, 36);
                return;
            case 16:
                ynVar.f43564y0.M.clear();
                jm jmVar = ynVar.f43564y0;
                jmVar.L = false;
                jmVar.O(true);
                ynVar.Ob(false);
                return;
            case 17:
                ynVar.f43338fc = 0;
                ynVar.gc = false;
                ynVar.f43525v0.h1();
                return;
            case 18:
                ynVar.o9();
                ynVar.q9();
                ynVar.r7();
                ynVar.t7();
                return;
            case 19:
                ynVar.xc(0, (ynVar.N5 == 0 || SystemClock.elapsedRealtime() < ynVar.N5 + 150) ? false : false);
                return;
            case 20:
                nk nkVar = ynVar.P2;
                if ((nkVar == null || nkVar.getVisibility() != 0) && (e4Var = ynVar.f43513u1) != null) {
                    e4Var.u();
                    return;
                }
                return;
            case 21:
                ynVar.k7();
                return;
            case 22:
                ynVar.a7(false);
                return;
            case 23:
                FrameLayout.LayoutParams e7 = w7.z5.e(-1, -2, 87);
                e7.bottomMargin = ynVar.W.getMeasuredHeight();
                ynVar.V0.addView(ynVar.f43539w1, e7);
                ynVar.f43539w1.setTranslationY(-AndroidUtilities.navigationBarHeight);
                ynVar.f43539w1.m(0.0f, ynVar.W.getEmojiButton().getX() + AndroidUtilities.dp(22.0f));
                ynVar.f43539w1.u();
                return;
            case 24:
                ynVar.J5 = null;
                if (ynVar.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ynVar.getParentActivity(), 0, ynVar.f43299ca);
                    boolean isChannel = ChatObject.isChannel(ynVar.f43314e);
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20367a;
                    if (isChannel && !ynVar.f43314e.megagroup) {
                        b2Var.T = LocaleController.getString(R.string.JoinByPeekChannelText);
                        b2Var.R = LocaleController.getString(R.string.JoinByPeekChannelTitle);
                    } else {
                        b2Var.T = LocaleController.getString(R.string.JoinByPeekGroupText);
                        b2Var.R = LocaleController.getString(R.string.JoinByPeekGroupTitle);
                    }
                    alertDialog$Builder.k(LocaleController.getString(R.string.JoinByPeekJoin), new re(ynVar, 2));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new re(ynVar, 3));
                    ynVar.showDialog(b2Var);
                    return;
                }
                return;
            case 25:
                int i17 = yn.Bc;
                ynVar.Z6();
                return;
            case 26:
                int i18 = yn.Bc;
                ynVar.Z6();
                return;
            case 27:
                yn.i2(ynVar);
                return;
            case 28:
                yn.i2(ynVar);
                return;
            default:
                int i19 = yn.Bc;
                ynVar.La();
                return;
        }
    }
}
