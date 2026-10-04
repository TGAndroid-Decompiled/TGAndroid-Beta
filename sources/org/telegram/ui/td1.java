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
public final class td1 implements Runnable {
    public final int f40795a;
    public final Object f40796b;
    public final Object f40797c;
    public final Object d;

    public td1(Object obj, Object obj2, Object obj3, int i10) {
        this.f40795a = i10;
        this.f40796b = obj;
        this.d = obj2;
        this.f40797c = obj3;
    }

    @Override
    public final void run() {
        TLRPC.Message message;
        int i10;
        int i11 = this.f40795a;
        on onVar = null;
        onVar = null;
        onVar = null;
        boolean z10 = false;
        Object obj = this.f40797c;
        Object obj2 = this.d;
        Object obj3 = this.f40796b;
        switch (i11) {
            case 0:
                wd1 wd1Var = (wd1) obj3;
                String str = (String) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                wd1Var.f42073y = 0;
                String str2 = wd1Var.E;
                if (str2 != null && str2.equals(str)) {
                    if (tL_error != null && ("THEME_SLUG_INVALID".equals(tL_error.text) || "THEME_SLUG_OCCUPIED".equals(tL_error.text))) {
                        wd1Var.Z(org.telegram.ui.ActionBar.i6.f21040p7, LocaleController.getString(R.string.SetUrlInUse));
                        return;
                    } else {
                        wd1Var.Z(org.telegram.ui.ActionBar.i6.f21171w6, LocaleController.formatString("SetUrlAvailable", R.string.SetUrlAvailable, str));
                        return;
                    }
                }
                return;
            case 1:
                wd1.U((wd1) obj3, (TLRPC.TL_error) obj, (TL_account.updateTheme) obj2);
                return;
            case 2:
                ge1 ge1Var = (ge1) obj3;
                yn ynVar = (yn) obj2;
                MessageObject messageObject = ge1Var.G;
                int i12 = ((TLRPC.TodoItem) obj).f20183id;
                if (messageObject != null && (message = messageObject.messageOwner) != null && (message.media instanceof TLRPC.TL_messageMediaToDo)) {
                    messageObject.getDialogId();
                    ?? obj4 = new Object();
                    obj4.f39236a = messageObject;
                    obj4.f39237b = -1;
                    obj4.f39238c = -1;
                    obj4.f39241g = true;
                    obj4.d = i12;
                    obj4.e();
                    onVar = obj4;
                }
                ynVar.Bb(messageObject, onVar);
                ge1Var.c(false);
                return;
            case 3:
                ne1 ne1Var = (ne1) obj3;
                ArrayList arrayList = ne1Var.h;
                arrayList.clear();
                ArrayList arrayList2 = ne1Var.f38960f;
                arrayList2.clear();
                arrayList.addAll((ArrayList) obj2);
                arrayList2.addAll(((TLRPC.TL_messages_inactiveChats) obj).chats);
                ne1Var.d.l();
                if (ne1Var.f38956a.getMeasuredHeight() > 0) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ne1Var.f38966y = ofFloat;
                    ofFloat.addUpdateListener(new b21(ne1Var, 14));
                    ne1Var.f38966y.setDuration(100L);
                    ne1Var.f38966y.start();
                } else {
                    ne1Var.E = 1.0f;
                }
                AndroidUtilities.cancelRunOnUIThread(ne1Var.I);
                if (ne1Var.F.getVisibility() == 0) {
                    ne1Var.F.animate().alpha(0.0f).setListener(new je1(ne1Var, 2)).start();
                    return;
                }
                return;
            case 4:
                yf1 yf1Var = (yf1) obj3;
                yf1Var.f43199s.deleteTopics(yf1Var.f43163a, (ArrayList) obj2);
                ((Runnable) obj).run();
                return;
            case 5:
                uf1 uf1Var = (uf1) obj3;
                String str3 = (String) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList3 = uf1Var.f41174e0;
                if (str3.equals(uf1Var.f41172c0)) {
                    int i13 = uf1Var.f41181l0;
                    uf1Var.f41185q0 = false;
                    uf1Var.m0 = false;
                    if (tLObject instanceof TLRPC.messages_Messages) {
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                        for (int i14 = 0; i14 < messages_messages.messages.size(); i14++) {
                            i10 = ((org.telegram.ui.ActionBar.n2) uf1Var.f41189u0).currentAccount;
                            MessageObject messageObject2 = new MessageObject(i10, messages_messages.messages.get(i14), false, false);
                            messageObject2.setQuery(str3);
                            arrayList3.add(messageObject2);
                        }
                        uf1Var.N();
                        if (arrayList3.size() < messages_messages.count && !messages_messages.messages.isEmpty()) {
                            z10 = true;
                        }
                        uf1Var.f41182n0 = z10;
                    } else {
                        uf1Var.f41182n0 = false;
                    }
                    if (uf1Var.f41181l0 == 0) {
                        uf1Var.f41183o0.e(uf1Var.m0, true);
                    }
                    uf1Var.f41184p0.b(i13);
                    return;
                }
                return;
            default:
                ph1 ph1Var = (ph1) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                ArrayList arrayList5 = (ArrayList) obj;
                gg.c2 c2Var = ph1Var.f39491f;
                if (ph1Var.f39492n) {
                    ph1Var.h = null;
                    ph1Var.d = arrayList4;
                    ph1Var.f39490e = arrayList5;
                    c2Var.f(arrayList4, null);
                    if (ph1Var.f39492n && !c2Var.e()) {
                        ph1Var.v.f34587f.e(false, true);
                    }
                    ph1Var.l();
                    return;
                }
                return;
        }
    }

    public td1(wd1 wd1Var, TLRPC.TL_error tL_error, TL_account.updateTheme updatetheme) {
        this.f40795a = 1;
        this.f40796b = wd1Var;
        this.f40797c = tL_error;
        this.d = updatetheme;
    }
}
