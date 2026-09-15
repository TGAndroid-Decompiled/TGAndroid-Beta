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
    public final int f39589a;
    public final Object f39590b;
    public final Object f39591c;
    public final Object d;

    public xd1(Object obj, Object obj2, Object obj3, int i10) {
        this.f39589a = i10;
        this.f39590b = obj;
        this.d = obj2;
        this.f39591c = obj3;
    }

    @Override
    public final void run() {
        TLRPC.Message message;
        int i10;
        int i11 = this.f39589a;
        rn rnVar = null;
        rnVar = null;
        rnVar = null;
        boolean z10 = false;
        Object obj = this.f39591c;
        Object obj2 = this.d;
        Object obj3 = this.f39590b;
        switch (i11) {
            case 0:
                ae1 ae1Var = (ae1) obj3;
                String str = (String) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                ae1Var.f31802y = 0;
                String str2 = ae1Var.E;
                if (str2 != null && str2.equals(str)) {
                    if (tL_error != null && ("THEME_SLUG_INVALID".equals(tL_error.text) || "THEME_SLUG_OCCUPIED".equals(tL_error.text))) {
                        ae1Var.a0(org.telegram.ui.ActionBar.i6.f19056p7, LocaleController.getString(R.string.SetUrlInUse));
                        return;
                    } else {
                        ae1Var.a0(org.telegram.ui.ActionBar.i6.f19184w6, LocaleController.formatString("SetUrlAvailable", R.string.SetUrlAvailable, str));
                        return;
                    }
                }
                return;
            case 1:
                ae1.W((ae1) obj3, (TLRPC.TL_error) obj, (TL_account.updateTheme) obj2);
                return;
            case 2:
                ke1 ke1Var = (ke1) obj3;
                bo boVar = (bo) obj2;
                MessageObject messageObject = ke1Var.G;
                int i12 = ((TLRPC.TodoItem) obj).f18257id;
                if (messageObject != null && (message = messageObject.messageOwner) != null && (message.media instanceof TLRPC.TL_messageMediaToDo)) {
                    messageObject.getDialogId();
                    ?? obj4 = new Object();
                    obj4.f37153a = messageObject;
                    obj4.f37154b = -1;
                    obj4.f37155c = -1;
                    obj4.f37157g = true;
                    obj4.d = i12;
                    obj4.e();
                    rnVar = obj4;
                }
                boVar.Cb(messageObject, rnVar);
                ke1Var.c(false);
                return;
            case 3:
                se1 se1Var = (se1) obj3;
                ArrayList arrayList = se1Var.h;
                arrayList.clear();
                ArrayList arrayList2 = se1Var.f37371f;
                arrayList2.clear();
                arrayList.addAll((ArrayList) obj2);
                arrayList2.addAll(((TLRPC.TL_messages_inactiveChats) obj).chats);
                se1Var.d.l();
                if (se1Var.f37368a.getMeasuredHeight() > 0) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    se1Var.f37377y = ofFloat;
                    ofFloat.addUpdateListener(new z11(se1Var, 15));
                    se1Var.f37377y.setDuration(100L);
                    se1Var.f37377y.start();
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
                dg1Var.f33047s.deleteTopics(dg1Var.f33012a, (ArrayList) obj2);
                ((Runnable) obj).run();
                return;
            case 5:
                zf1 zf1Var = (zf1) obj3;
                String str3 = (String) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList3 = zf1Var.f40192d0;
                if (str3.equals(zf1Var.f40190b0)) {
                    int i13 = zf1Var.f40199k0;
                    zf1Var.f40203p0 = false;
                    zf1Var.f40200l0 = false;
                    if (tLObject instanceof TLRPC.messages_Messages) {
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                        for (int i14 = 0; i14 < messages_messages.messages.size(); i14++) {
                            i10 = ((org.telegram.ui.ActionBar.n2) zf1Var.f40207t0).currentAccount;
                            MessageObject messageObject2 = new MessageObject(i10, messages_messages.messages.get(i14), false, false);
                            messageObject2.setQuery(str3);
                            arrayList3.add(messageObject2);
                        }
                        zf1Var.L();
                        if (arrayList3.size() < messages_messages.count && !messages_messages.messages.isEmpty()) {
                            z10 = true;
                        }
                        zf1Var.m0 = z10;
                    } else {
                        zf1Var.m0 = false;
                    }
                    if (zf1Var.f40199k0 == 0) {
                        zf1Var.f40201n0.e(zf1Var.f40200l0, true);
                    }
                    zf1Var.f40202o0.b(i13);
                    return;
                }
                return;
            default:
                wh1 wh1Var = (wh1) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                ArrayList arrayList5 = (ArrayList) obj;
                gg.c2 c2Var = wh1Var.f39229f;
                if (wh1Var.f39230n) {
                    wh1Var.h = null;
                    wh1Var.d = arrayList4;
                    wh1Var.e = arrayList5;
                    c2Var.f(arrayList4, null);
                    if (wh1Var.f39230n && !c2Var.e()) {
                        wh1Var.v.f31611f.e(false, true);
                    }
                    wh1Var.l();
                    return;
                }
                return;
        }
    }

    public xd1(ae1 ae1Var, TLRPC.TL_error tL_error, TL_account.updateTheme updatetheme) {
        this.f39589a = 1;
        this.f39590b = ae1Var;
        this.f39591c = tL_error;
        this.d = updatetheme;
    }
}
