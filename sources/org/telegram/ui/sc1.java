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
public final class sc1 implements Runnable {
    public final int f42357a;
    public final Object f42358b;
    public final Object f42359c;
    public final Object d;

    public sc1(Object obj, Object obj2, Object obj3, int i10) {
        this.f42357a = i10;
        this.f42358b = obj;
        this.d = obj2;
        this.f42359c = obj3;
    }

    @Override
    public final void run() {
        TLRPC.Message message;
        int i10;
        int i11 = this.f42357a;
        jn jnVar = null;
        jnVar = null;
        jnVar = null;
        boolean z10 = false;
        Object obj = this.f42359c;
        Object obj2 = this.d;
        Object obj3 = this.f42358b;
        switch (i11) {
            case 0:
                vc1 vc1Var = (vc1) obj3;
                String str = (String) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                vc1Var.f43546y = 0;
                String str2 = vc1Var.A;
                if (str2 != null && str2.equals(str)) {
                    if (tL_error != null && ("THEME_SLUG_INVALID".equals(tL_error.text) || "THEME_SLUG_OCCUPIED".equals(tL_error.text))) {
                        vc1Var.a0(org.telegram.ui.ActionBar.g6.f23279p7, LocaleController.getString(R.string.SetUrlInUse));
                        return;
                    } else {
                        vc1Var.a0(org.telegram.ui.ActionBar.g6.f23401w6, LocaleController.formatString("SetUrlAvailable", R.string.SetUrlAvailable, str));
                        return;
                    }
                }
                return;
            case 1:
                vc1.W((vc1) obj3, (TLRPC.TL_error) obj, (TL_account.updateTheme) obj2);
                return;
            case 2:
                fd1 fd1Var = (fd1) obj3;
                tn tnVar = (tn) obj2;
                MessageObject messageObject = fd1Var.C;
                int i12 = ((TLRPC.TodoItem) obj).f22537id;
                if (messageObject != null && (message = messageObject.messageOwner) != null && (message.media instanceof TLRPC.TL_messageMediaToDo)) {
                    messageObject.getDialogId();
                    ?? obj4 = new Object();
                    obj4.f39590a = messageObject;
                    obj4.f39591b = -1;
                    obj4.f39592c = -1;
                    obj4.f39595g = true;
                    obj4.d = i12;
                    obj4.e();
                    jnVar = obj4;
                }
                tnVar.Cb(messageObject, jnVar);
                fd1Var.c(false);
                return;
            case 3:
                md1 md1Var = (md1) obj3;
                ArrayList arrayList = md1Var.h;
                arrayList.clear();
                ArrayList arrayList2 = md1Var.f40533f;
                arrayList2.clear();
                arrayList.addAll((ArrayList) obj2);
                arrayList2.addAll(((TLRPC.TL_messages_inactiveChats) obj).chats);
                md1Var.d.l();
                if (md1Var.f40529a.getMeasuredHeight() > 0) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    md1Var.f40539y = ofFloat;
                    ofFloat.addUpdateListener(new w01(md1Var, 15));
                    md1Var.f40539y.setDuration(100L);
                    md1Var.f40539y.start();
                } else {
                    md1Var.A = 1.0f;
                }
                AndroidUtilities.cancelRunOnUIThread(md1Var.E);
                if (md1Var.B.getVisibility() == 0) {
                    md1Var.B.animate().alpha(0.0f).setListener(new id1(md1Var, 2)).start();
                    return;
                }
                return;
            case 4:
                ze1 ze1Var = (ze1) obj3;
                ze1Var.f45188s.deleteTopics(ze1Var.f45155a, (ArrayList) obj2);
                ((Runnable) obj).run();
                return;
            case 5:
                ve1 ve1Var = (ve1) obj3;
                String str3 = (String) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList3 = ve1Var.W;
                if (str3.equals(ve1Var.U)) {
                    int i13 = ve1Var.f43566g0;
                    ve1Var.f43571l0 = false;
                    ve1Var.f43567h0 = false;
                    if (tLObject instanceof TLRPC.messages_Messages) {
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                        for (int i14 = 0; i14 < messages_messages.messages.size(); i14++) {
                            i10 = ((org.telegram.ui.ActionBar.o2) ve1Var.f43574p0).currentAccount;
                            MessageObject messageObject2 = new MessageObject(i10, messages_messages.messages.get(i14), false, false);
                            messageObject2.setQuery(str3);
                            arrayList3.add(messageObject2);
                        }
                        ve1Var.L();
                        if (arrayList3.size() < messages_messages.count && !messages_messages.messages.isEmpty()) {
                            z10 = true;
                        }
                        ve1Var.f43568i0 = z10;
                    } else {
                        ve1Var.f43568i0 = false;
                    }
                    if (ve1Var.f43566g0 == 0) {
                        ve1Var.f43569j0.e(ve1Var.f43567h0, true);
                    }
                    ve1Var.f43570k0.b(i13);
                    return;
                }
                return;
            default:
                rg1 rg1Var = (rg1) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                ArrayList arrayList5 = (ArrayList) obj;
                rf.k1 k1Var = rg1Var.f42100f;
                if (rg1Var.f42101n) {
                    rg1Var.h = null;
                    rg1Var.d = arrayList4;
                    rg1Var.f42099e = arrayList5;
                    k1Var.f(arrayList4, null);
                    if (rg1Var.f42101n && !k1Var.e()) {
                        rg1Var.v.f36354f.e(false, true);
                    }
                    rg1Var.l();
                    return;
                }
                return;
        }
    }

    public sc1(vc1 vc1Var, TLRPC.TL_error tL_error, TL_account.updateTheme updatetheme) {
        this.f42357a = 1;
        this.f42358b = vc1Var;
        this.f42359c = tL_error;
        this.d = updatetheme;
    }
}
