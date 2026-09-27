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
    public final int f37104a;
    public final Object f37105b;
    public final Object f37106c;
    public final Object d;

    public rd1(Object obj, Object obj2, Object obj3, int i10) {
        this.f37104a = i10;
        this.f37105b = obj;
        this.d = obj2;
        this.f37106c = obj3;
    }

    @Override
    public final void run() {
        TLRPC.Message message;
        int i10;
        int i11 = this.f37104a;
        nn nnVar = null;
        nnVar = null;
        nnVar = null;
        boolean z10 = false;
        Object obj = this.f37106c;
        Object obj2 = this.d;
        Object obj3 = this.f37105b;
        switch (i11) {
            case 0:
                ud1 ud1Var = (ud1) obj3;
                String str = (String) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                ud1Var.f38222y = 0;
                String str2 = ud1Var.E;
                if (str2 != null && str2.equals(str)) {
                    if (tL_error != null && ("THEME_SLUG_INVALID".equals(tL_error.text) || "THEME_SLUG_OCCUPIED".equals(tL_error.text))) {
                        ud1Var.a0(org.telegram.ui.ActionBar.i6.f19278p7, LocaleController.getString(R.string.SetUrlInUse));
                        return;
                    } else {
                        ud1Var.a0(org.telegram.ui.ActionBar.i6.f19408w6, LocaleController.formatString("SetUrlAvailable", R.string.SetUrlAvailable, str));
                        return;
                    }
                }
                return;
            case 1:
                ud1.W((ud1) obj3, (TLRPC.TL_error) obj, (TL_account.updateTheme) obj2);
                return;
            case 2:
                ee1 ee1Var = (ee1) obj3;
                xn xnVar = (xn) obj2;
                MessageObject messageObject = ee1Var.G;
                int i12 = ((TLRPC.TodoItem) obj).f18474id;
                if (messageObject != null && (message = messageObject.messageOwner) != null && (message.media instanceof TLRPC.TL_messageMediaToDo)) {
                    messageObject.getDialogId();
                    ?? obj4 = new Object();
                    obj4.f36051a = messageObject;
                    obj4.f36052b = -1;
                    obj4.f36053c = -1;
                    obj4.f36055g = true;
                    obj4.d = i12;
                    obj4.e();
                    nnVar = obj4;
                }
                xnVar.Cb(messageObject, nnVar);
                ee1Var.c(false);
                return;
            case 3:
                le1 le1Var = (le1) obj3;
                ArrayList arrayList = le1Var.h;
                arrayList.clear();
                ArrayList arrayList2 = le1Var.f35331f;
                arrayList2.clear();
                arrayList.addAll((ArrayList) obj2);
                arrayList2.addAll(((TLRPC.TL_messages_inactiveChats) obj).chats);
                le1Var.d.l();
                if (le1Var.f35328a.getMeasuredHeight() > 0) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    le1Var.f35337y = ofFloat;
                    ofFloat.addUpdateListener(new b21(le1Var, 14));
                    le1Var.f35337y.setDuration(100L);
                    le1Var.f35337y.start();
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
                wf1Var.f39322s.deleteTopics(wf1Var.f39287a, (ArrayList) obj2);
                ((Runnable) obj).run();
                return;
            case 5:
                sf1 sf1Var = (sf1) obj3;
                String str3 = (String) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList3 = sf1Var.f37429e0;
                if (str3.equals(sf1Var.f37427c0)) {
                    int i13 = sf1Var.f37436l0;
                    sf1Var.f37440q0 = false;
                    sf1Var.m0 = false;
                    if (tLObject instanceof TLRPC.messages_Messages) {
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                        for (int i14 = 0; i14 < messages_messages.messages.size(); i14++) {
                            i10 = ((org.telegram.ui.ActionBar.o2) sf1Var.f37444u0).currentAccount;
                            MessageObject messageObject2 = new MessageObject(i10, messages_messages.messages.get(i14), false, false);
                            messageObject2.setQuery(str3);
                            arrayList3.add(messageObject2);
                        }
                        sf1Var.M();
                        if (arrayList3.size() < messages_messages.count && !messages_messages.messages.isEmpty()) {
                            z10 = true;
                        }
                        sf1Var.f37437n0 = z10;
                    } else {
                        sf1Var.f37437n0 = false;
                    }
                    if (sf1Var.f37436l0 == 0) {
                        sf1Var.f37438o0.e(sf1Var.m0, true);
                    }
                    sf1Var.f37439p0.b(i13);
                    return;
                }
                return;
            default:
                nh1 nh1Var = (nh1) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                ArrayList arrayList5 = (ArrayList) obj;
                gg.c2 c2Var = nh1Var.f35997f;
                if (nh1Var.f35998n) {
                    nh1Var.h = null;
                    nh1Var.d = arrayList4;
                    nh1Var.e = arrayList5;
                    c2Var.f(arrayList4, null);
                    if (nh1Var.f35998n && !c2Var.e()) {
                        nh1Var.v.f31899f.e(false, true);
                    }
                    nh1Var.l();
                    return;
                }
                return;
        }
    }

    public rd1(ud1 ud1Var, TLRPC.TL_error tL_error, TL_account.updateTheme updatetheme) {
        this.f37104a = 1;
        this.f37105b = ud1Var;
        this.f37106c = tL_error;
        this.d = updatetheme;
    }
}
