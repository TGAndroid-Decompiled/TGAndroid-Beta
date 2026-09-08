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
public final class yd1 implements Runnable {
    public final int f43112a;
    public final Object f43113b;
    public final Object f43114c;
    public final Object d;

    public yd1(Object obj, Object obj2, Object obj3, int i10) {
        this.f43112a = i10;
        this.f43113b = obj;
        this.d = obj2;
        this.f43114c = obj3;
    }

    @Override
    public final void run() {
        TLRPC.Message message;
        int i10;
        int i11 = this.f43112a;
        sn snVar = null;
        snVar = null;
        snVar = null;
        boolean z10 = false;
        Object obj = this.f43114c;
        Object obj2 = this.d;
        Object obj3 = this.f43113b;
        switch (i11) {
            case 0:
                be1 be1Var = (be1) obj3;
                String str = (String) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                be1Var.f34810y = 0;
                String str2 = be1Var.E;
                if (str2 != null && str2.equals(str)) {
                    if (tL_error != null && ("THEME_SLUG_INVALID".equals(tL_error.text) || "THEME_SLUG_OCCUPIED".equals(tL_error.text))) {
                        be1Var.a0(org.telegram.ui.ActionBar.j6.f20907p7, LocaleController.getString(R.string.SetUrlInUse));
                        return;
                    } else {
                        be1Var.a0(org.telegram.ui.ActionBar.j6.f21035w6, LocaleController.formatString("SetUrlAvailable", R.string.SetUrlAvailable, str));
                        return;
                    }
                }
                return;
            case 1:
                be1.W((be1) obj3, (TLRPC.TL_error) obj, (TL_account.updateTheme) obj2);
                return;
            case 2:
                le1 le1Var = (le1) obj3;
                co coVar = (co) obj2;
                MessageObject messageObject = le1Var.G;
                int i12 = ((TLRPC.TodoItem) obj).f20041id;
                if (messageObject != null && (message = messageObject.messageOwner) != null && (message.media instanceof TLRPC.TL_messageMediaToDo)) {
                    messageObject.getDialogId();
                    ?? obj4 = new Object();
                    obj4.f40504a = messageObject;
                    obj4.f40505b = -1;
                    obj4.f40506c = -1;
                    obj4.f40509g = true;
                    obj4.d = i12;
                    obj4.e();
                    snVar = obj4;
                }
                coVar.Cb(messageObject, snVar);
                le1Var.c(false);
                return;
            case 3:
                te1 te1Var = (te1) obj3;
                ArrayList arrayList = te1Var.h;
                arrayList.clear();
                ArrayList arrayList2 = te1Var.f40759f;
                arrayList2.clear();
                arrayList.addAll((ArrayList) obj2);
                arrayList2.addAll(((TLRPC.TL_messages_inactiveChats) obj).chats);
                te1Var.d.l();
                if (te1Var.f40755a.getMeasuredHeight() > 0) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    te1Var.f40765y = ofFloat;
                    ofFloat.addUpdateListener(new b21(te1Var, 15));
                    te1Var.f40765y.setDuration(100L);
                    te1Var.f40765y.start();
                } else {
                    te1Var.E = 1.0f;
                }
                AndroidUtilities.cancelRunOnUIThread(te1Var.I);
                if (te1Var.F.getVisibility() == 0) {
                    te1Var.F.animate().alpha(0.0f).setListener(new pe1(te1Var, 2)).start();
                    return;
                }
                return;
            case 4:
                eg1 eg1Var = (eg1) obj3;
                eg1Var.f36088s.deleteTopics(eg1Var.f36052a, (ArrayList) obj2);
                ((Runnable) obj).run();
                return;
            case 5:
                ag1 ag1Var = (ag1) obj3;
                String str3 = (String) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList3 = ag1Var.f34457d0;
                if (str3.equals(ag1Var.f34455b0)) {
                    int i13 = ag1Var.f34464k0;
                    ag1Var.f34468p0 = false;
                    ag1Var.f34465l0 = false;
                    if (tLObject instanceof TLRPC.messages_Messages) {
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                        for (int i14 = 0; i14 < messages_messages.messages.size(); i14++) {
                            i10 = ((org.telegram.ui.ActionBar.n2) ag1Var.f34472t0).currentAccount;
                            MessageObject messageObject2 = new MessageObject(i10, messages_messages.messages.get(i14), false, false);
                            messageObject2.setQuery(str3);
                            arrayList3.add(messageObject2);
                        }
                        ag1Var.L();
                        if (arrayList3.size() < messages_messages.count && !messages_messages.messages.isEmpty()) {
                            z10 = true;
                        }
                        ag1Var.m0 = z10;
                    } else {
                        ag1Var.m0 = false;
                    }
                    if (ag1Var.f34464k0 == 0) {
                        ag1Var.f34466n0.e(ag1Var.f34465l0, true);
                    }
                    ag1Var.f34467o0.b(i13);
                    return;
                }
                return;
            default:
                xh1 xh1Var = (xh1) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                ArrayList arrayList5 = (ArrayList) obj;
                hg.b2 b2Var = xh1Var.f42759f;
                if (xh1Var.f42760n) {
                    xh1Var.h = null;
                    xh1Var.d = arrayList4;
                    xh1Var.f42758e = arrayList5;
                    b2Var.f(arrayList4, null);
                    if (xh1Var.f42760n && !b2Var.e()) {
                        xh1Var.v.f34268f.e(false, true);
                    }
                    xh1Var.l();
                    return;
                }
                return;
        }
    }

    public yd1(be1 be1Var, TLRPC.TL_error tL_error, TL_account.updateTheme updatetheme) {
        this.f43112a = 1;
        this.f43113b = be1Var;
        this.f43114c = tL_error;
        this.d = updatetheme;
    }
}
