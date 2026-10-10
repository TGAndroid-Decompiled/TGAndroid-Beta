package org.telegram.ui;

import android.animation.ValueAnimator;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class zd1 implements Runnable {
    public final int f44600a;
    public final Object f44601b;
    public final Object f44602c;
    public final Object d;

    public zd1(Object obj, Object obj2, Object obj3, int i10) {
        this.f44600a = i10;
        this.f44601b = obj;
        this.d = obj2;
        this.f44602c = obj3;
    }

    @Override
    public final void run() {
        TLRPC.Message message;
        int i10;
        int i11 = this.f44600a;
        pn pnVar = null;
        pnVar = null;
        pnVar = null;
        boolean z10 = false;
        Object obj = this.f44602c;
        Object obj2 = this.d;
        Object obj3 = this.f44601b;
        switch (i11) {
            case 0:
                ce1 ce1Var = (ce1) obj3;
                String str = (String) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                ce1Var.f36688y = 0;
                String str2 = ce1Var.E;
                if (str2 != null && str2.equals(str)) {
                    if (tL_error != null && ("THEME_SLUG_INVALID".equals(tL_error.text) || "THEME_SLUG_OCCUPIED".equals(tL_error.text))) {
                        ce1Var.a0(org.telegram.ui.ActionBar.i6.f21022p7, LocaleController.getString(R.string.SetUrlInUse));
                        return;
                    } else {
                        ce1Var.a0(org.telegram.ui.ActionBar.i6.f21150w6, LocaleController.formatString("SetUrlAvailable", R.string.SetUrlAvailable, str));
                        return;
                    }
                }
                return;
            case 1:
                ce1.W((ce1) obj3, (TLRPC.TL_error) obj, (TL_account.updateTheme) obj2);
                return;
            case 2:
                me1 me1Var = (me1) obj3;
                zn znVar = (zn) obj2;
                MessageObject messageObject = me1Var.G;
                int i12 = ((TLRPC.TodoItem) obj).f20187id;
                if (messageObject != null && (message = messageObject.messageOwner) != null && (message.media instanceof TLRPC.TL_messageMediaToDo)) {
                    messageObject.getDialogId();
                    ?? obj4 = new Object();
                    obj4.f40889a = messageObject;
                    obj4.f40890b = -1;
                    obj4.f40891c = -1;
                    obj4.f40894g = true;
                    obj4.d = i12;
                    obj4.e();
                    pnVar = obj4;
                }
                znVar.Gb(messageObject, pnVar);
                me1Var.c(false);
                return;
            case 3:
                ue1 ue1Var = (ue1) obj3;
                ArrayList arrayList = ue1Var.h;
                arrayList.clear();
                ArrayList arrayList2 = ue1Var.f42460f;
                arrayList2.clear();
                arrayList.addAll((ArrayList) obj2);
                arrayList2.addAll(((TLRPC.TL_messages_inactiveChats) obj).chats);
                ue1Var.d.l();
                if (ue1Var.f42456a.getMeasuredHeight() > 0) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ue1Var.f42466y = ofFloat;
                    ofFloat.addUpdateListener(new y11(ue1Var, 15));
                    ue1Var.f42466y.setDuration(100L);
                    ue1Var.f42466y.start();
                } else {
                    ue1Var.E = 1.0f;
                }
                AndroidUtilities.cancelRunOnUIThread(ue1Var.I);
                if (ue1Var.F.getVisibility() == 0) {
                    ue1Var.F.animate().alpha(0.0f).setListener(new qe1(ue1Var, 2)).start();
                    return;
                }
                return;
            case 4:
                fg1 fg1Var = (fg1) obj3;
                fg1Var.f37638s.deleteTopics(fg1Var.f37602a, (ArrayList) obj2);
                ((Runnable) obj).run();
                return;
            case 5:
                bg1 bg1Var = (bg1) obj3;
                String str3 = (String) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList3 = bg1Var.f36360d0;
                if (str3.equals(bg1Var.f36358b0)) {
                    int i13 = bg1Var.f36367k0;
                    bg1Var.f36371p0 = false;
                    bg1Var.f36368l0 = false;
                    if (tLObject instanceof TLRPC.messages_Messages) {
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                        for (int i14 = 0; i14 < messages_messages.messages.size(); i14++) {
                            i10 = ((org.telegram.ui.ActionBar.n2) bg1Var.f36375t0).currentAccount;
                            MessageObject messageObject2 = new MessageObject(i10, messages_messages.messages.get(i14), false, false);
                            messageObject2.setQuery(str3);
                            arrayList3.add(messageObject2);
                        }
                        bg1Var.L();
                        if (arrayList3.size() < messages_messages.count && !messages_messages.messages.isEmpty()) {
                            z10 = true;
                        }
                        bg1Var.m0 = z10;
                    } else {
                        bg1Var.m0 = false;
                    }
                    if (bg1Var.f36367k0 == 0) {
                        bg1Var.f36369n0.e(bg1Var.f36368l0, true);
                    }
                    bg1Var.f36370o0.b(i13);
                    return;
                }
                return;
            default:
                yh1 yh1Var = (yh1) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                ArrayList arrayList5 = (ArrayList) obj;
                gg.b2 b2Var = yh1Var.f44394f;
                if (yh1Var.f44395n) {
                    yh1Var.h = null;
                    yh1Var.d = arrayList4;
                    yh1Var.f44393e = arrayList5;
                    b2Var.f(arrayList4, null);
                    if (yh1Var.f44395n && !b2Var.e()) {
                        yh1Var.v.f34634f.e(false, true);
                    }
                    yh1Var.l();
                    return;
                }
                return;
        }
    }

    public zd1(ce1 ce1Var, TLRPC.TL_error tL_error, TL_account.updateTheme updatetheme) {
        this.f44600a = 1;
        this.f44601b = ce1Var;
        this.f44602c = tL_error;
        this.d = updatetheme;
    }
}
