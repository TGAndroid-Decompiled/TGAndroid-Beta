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
public final class xd1 implements Runnable {
    public final int f39437a;
    public final Object f39438b;
    public final Object f39439c;
    public final Object d;

    public xd1(Object obj, Object obj2, Object obj3, int i10) {
        this.f39437a = i10;
        this.f39438b = obj;
        this.d = obj2;
        this.f39439c = obj3;
    }

    @Override
    public final void run() {
        TLRPC.Message message;
        int i10;
        int i11 = this.f39437a;
        pn pnVar = null;
        pnVar = null;
        pnVar = null;
        boolean z10 = false;
        Object obj = this.f39439c;
        Object obj2 = this.d;
        Object obj3 = this.f39438b;
        switch (i11) {
            case 0:
                ae1 ae1Var = (ae1) obj3;
                String str = (String) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                ae1Var.f32019y = 0;
                String str2 = ae1Var.E;
                if (str2 != null && str2.equals(str)) {
                    if (tL_error != null && ("THEME_SLUG_INVALID".equals(tL_error.text) || "THEME_SLUG_OCCUPIED".equals(tL_error.text))) {
                        ae1Var.a0(org.telegram.ui.ActionBar.j6.f19283p7, LocaleController.getString(R.string.SetUrlInUse));
                        return;
                    } else {
                        ae1Var.a0(org.telegram.ui.ActionBar.j6.f19411w6, LocaleController.formatString("SetUrlAvailable", R.string.SetUrlAvailable, str));
                        return;
                    }
                }
                return;
            case 1:
                ae1.W((ae1) obj3, (TLRPC.TL_error) obj, (TL_account.updateTheme) obj2);
                return;
            case 2:
                ke1 ke1Var = (ke1) obj3;
                zn znVar = (zn) obj2;
                MessageObject messageObject = ke1Var.G;
                int i12 = ((TLRPC.TodoItem) obj).f18441id;
                if (messageObject != null && (message = messageObject.messageOwner) != null && (message.media instanceof TLRPC.TL_messageMediaToDo)) {
                    messageObject.getDialogId();
                    ?? obj4 = new Object();
                    obj4.f36512a = messageObject;
                    obj4.f36513b = -1;
                    obj4.f36514c = -1;
                    obj4.f36516g = true;
                    obj4.d = i12;
                    obj4.e();
                    pnVar = obj4;
                }
                znVar.Cb(messageObject, pnVar);
                ke1Var.c(false);
                return;
            case 3:
                se1 se1Var = (se1) obj3;
                ArrayList arrayList = se1Var.h;
                arrayList.clear();
                ArrayList arrayList2 = se1Var.f37268f;
                arrayList2.clear();
                arrayList.addAll((ArrayList) obj2);
                arrayList2.addAll(((TLRPC.TL_messages_inactiveChats) obj).chats);
                se1Var.d.l();
                if (se1Var.f37265a.getMeasuredHeight() > 0) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    se1Var.f37274y = ofFloat;
                    ofFloat.addUpdateListener(new i21(se1Var, 14));
                    se1Var.f37274y.setDuration(100L);
                    se1Var.f37274y.start();
                } else {
                    se1Var.E = 1.0f;
                }
                AndroidUtilities.cancelRunOnUIThread(se1Var.I);
                if (se1Var.F.getVisibility() == 0) {
                    se1Var.F.animate().alpha(0.0f).setListener(new oe1(se1Var, 2)).start();
                    return;
                }
                return;
            case 4:
                dg1 dg1Var = (dg1) obj3;
                dg1Var.f33005s.deleteTopics(dg1Var.f32970a, (ArrayList) obj2);
                ((Runnable) obj).run();
                return;
            case 5:
                zf1 zf1Var = (zf1) obj3;
                String str3 = (String) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList3 = zf1Var.f40118e0;
                if (str3.equals(zf1Var.f40116c0)) {
                    int i13 = zf1Var.f40125l0;
                    zf1Var.f40129q0 = false;
                    zf1Var.m0 = false;
                    if (tLObject instanceof TLRPC.messages_Messages) {
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                        for (int i14 = 0; i14 < messages_messages.messages.size(); i14++) {
                            i10 = ((org.telegram.ui.ActionBar.n2) zf1Var.f40133u0).currentAccount;
                            MessageObject messageObject2 = new MessageObject(i10, messages_messages.messages.get(i14), false, false);
                            messageObject2.setQuery(str3);
                            arrayList3.add(messageObject2);
                        }
                        zf1Var.M();
                        if (arrayList3.size() < messages_messages.count && !messages_messages.messages.isEmpty()) {
                            z10 = true;
                        }
                        zf1Var.f40126n0 = z10;
                    } else {
                        zf1Var.f40126n0 = false;
                    }
                    if (zf1Var.f40125l0 == 0) {
                        zf1Var.f40127o0.e(zf1Var.m0, true);
                    }
                    zf1Var.f40128p0.b(i13);
                    return;
                }
                return;
            default:
                uh1 uh1Var = (uh1) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                ArrayList arrayList5 = (ArrayList) obj;
                gg.c2 c2Var = uh1Var.f38006f;
                if (uh1Var.f38007n) {
                    uh1Var.h = null;
                    uh1Var.d = arrayList4;
                    uh1Var.e = arrayList5;
                    c2Var.f(arrayList4, null);
                    if (uh1Var.f38007n && !c2Var.e()) {
                        uh1Var.v.f31855f.e(false, true);
                    }
                    uh1Var.l();
                    return;
                }
                return;
        }
    }

    public xd1(ae1 ae1Var, TLRPC.TL_error tL_error, TL_account.updateTheme updatetheme) {
        this.f39437a = 1;
        this.f39438b = ae1Var;
        this.f39439c = tL_error;
        this.d = updatetheme;
    }
}
