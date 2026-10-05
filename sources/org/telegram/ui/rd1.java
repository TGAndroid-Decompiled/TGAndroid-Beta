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
public final class rd1 implements Runnable {
    public final int f40074a;
    public final Object f40075b;
    public final Object f40076c;
    public final Object d;

    public rd1(Object obj, Object obj2, Object obj3, int i10) {
        this.f40074a = i10;
        this.f40075b = obj;
        this.d = obj2;
        this.f40076c = obj3;
    }

    @Override
    public final void run() {
        TLRPC.Message message;
        int i10;
        int i11 = this.f40074a;
        on onVar = null;
        onVar = null;
        onVar = null;
        boolean z10 = false;
        Object obj = this.f40076c;
        Object obj2 = this.d;
        Object obj3 = this.f40075b;
        switch (i11) {
            case 0:
                ud1 ud1Var = (ud1) obj3;
                String str = (String) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                ud1Var.f41217y = 0;
                String str2 = ud1Var.E;
                if (str2 != null && str2.equals(str)) {
                    if (tL_error != null && ("THEME_SLUG_INVALID".equals(tL_error.text) || "THEME_SLUG_OCCUPIED".equals(tL_error.text))) {
                        ud1Var.Z(org.telegram.ui.ActionBar.i6.f21049p7, LocaleController.getString(R.string.SetUrlInUse));
                        return;
                    } else {
                        ud1Var.Z(org.telegram.ui.ActionBar.i6.f21180w6, LocaleController.formatString("SetUrlAvailable", R.string.SetUrlAvailable, str));
                        return;
                    }
                }
                return;
            case 1:
                ud1.U((ud1) obj3, (TLRPC.TL_error) obj, (TL_account.updateTheme) obj2);
                return;
            case 2:
                ee1 ee1Var = (ee1) obj3;
                yn ynVar = (yn) obj2;
                MessageObject messageObject = ee1Var.G;
                int i12 = ((TLRPC.TodoItem) obj).f20192id;
                if (messageObject != null && (message = messageObject.messageOwner) != null && (message.media instanceof TLRPC.TL_messageMediaToDo)) {
                    messageObject.getDialogId();
                    ?? obj4 = new Object();
                    obj4.f39251a = messageObject;
                    obj4.f39252b = -1;
                    obj4.f39253c = -1;
                    obj4.f39256g = true;
                    obj4.d = i12;
                    obj4.e();
                    onVar = obj4;
                }
                ynVar.Bb(messageObject, onVar);
                ee1Var.c(false);
                return;
            case 3:
                le1 le1Var = (le1) obj3;
                ArrayList arrayList = le1Var.h;
                arrayList.clear();
                ArrayList arrayList2 = le1Var.f38301f;
                arrayList2.clear();
                arrayList.addAll((ArrayList) obj2);
                arrayList2.addAll(((TLRPC.TL_messages_inactiveChats) obj).chats);
                le1Var.d.l();
                if (le1Var.f38297a.getMeasuredHeight() > 0) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    le1Var.f38307y = ofFloat;
                    ofFloat.addUpdateListener(new b21(le1Var, 14));
                    le1Var.f38307y.setDuration(100L);
                    le1Var.f38307y.start();
                } else {
                    le1Var.E = 1.0f;
                }
                AndroidUtilities.cancelRunOnUIThread(le1Var.I);
                if (le1Var.F.getVisibility() == 0) {
                    le1Var.F.animate().alpha(0.0f).setListener(new he1(le1Var, 2)).start();
                    return;
                }
                return;
            case 4:
                wf1 wf1Var = (wf1) obj3;
                wf1Var.f42503s.deleteTopics(wf1Var.f42467a, (ArrayList) obj2);
                ((Runnable) obj).run();
                return;
            case 5:
                sf1 sf1Var = (sf1) obj3;
                String str3 = (String) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList3 = sf1Var.f40474f0;
                if (str3.equals(sf1Var.f40472d0)) {
                    int i13 = sf1Var.m0;
                    sf1Var.f40485r0 = false;
                    sf1Var.f40481n0 = false;
                    if (tLObject instanceof TLRPC.messages_Messages) {
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                        for (int i14 = 0; i14 < messages_messages.messages.size(); i14++) {
                            i10 = ((org.telegram.ui.ActionBar.n2) sf1Var.f40489v0).currentAccount;
                            MessageObject messageObject2 = new MessageObject(i10, messages_messages.messages.get(i14), false, false);
                            messageObject2.setQuery(str3);
                            arrayList3.add(messageObject2);
                        }
                        sf1Var.N();
                        if (arrayList3.size() < messages_messages.count && !messages_messages.messages.isEmpty()) {
                            z10 = true;
                        }
                        sf1Var.f40482o0 = z10;
                    } else {
                        sf1Var.f40482o0 = false;
                    }
                    if (sf1Var.m0 == 0) {
                        sf1Var.f40483p0.e(sf1Var.f40481n0, true);
                    }
                    sf1Var.f40484q0.b(i13);
                    return;
                }
                return;
            default:
                nh1 nh1Var = (nh1) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                ArrayList arrayList5 = (ArrayList) obj;
                gg.c2 c2Var = nh1Var.f38980f;
                if (nh1Var.f38981n) {
                    nh1Var.h = null;
                    nh1Var.d = arrayList4;
                    nh1Var.f38979e = arrayList5;
                    c2Var.f(arrayList4, null);
                    if (nh1Var.f38981n && !c2Var.e()) {
                        nh1Var.v.f34606f.e(false, true);
                    }
                    nh1Var.l();
                    return;
                }
                return;
        }
    }

    public rd1(ud1 ud1Var, TLRPC.TL_error tL_error, TL_account.updateTheme updatetheme) {
        this.f40074a = 1;
        this.f40075b = ud1Var;
        this.f40076c = tL_error;
        this.d = updatetheme;
    }
}
