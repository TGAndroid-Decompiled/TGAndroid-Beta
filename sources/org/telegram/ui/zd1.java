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
    public final int f40221a;
    public final Object f40222b;
    public final Object f40223c;
    public final Object d;

    public zd1(Object obj, Object obj2, Object obj3, int i10) {
        this.f40221a = i10;
        this.f40222b = obj;
        this.d = obj2;
        this.f40223c = obj3;
    }

    @Override
    public final void run() {
        TLRPC.Message message;
        int i10;
        int i11 = this.f40221a;
        rn rnVar = null;
        rnVar = null;
        rnVar = null;
        boolean z10 = false;
        Object obj = this.f40223c;
        Object obj2 = this.d;
        Object obj3 = this.f40222b;
        switch (i11) {
            case 0:
                ce1 ce1Var = (ce1) obj3;
                String str = (String) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                ce1Var.f32773y = 0;
                String str2 = ce1Var.E;
                if (str2 != null && str2.equals(str)) {
                    if (tL_error != null && ("THEME_SLUG_INVALID".equals(tL_error.text) || "THEME_SLUG_OCCUPIED".equals(tL_error.text))) {
                        ce1Var.a0(org.telegram.ui.ActionBar.j6.f19082p7, LocaleController.getString(R.string.SetUrlInUse));
                        return;
                    } else {
                        ce1Var.a0(org.telegram.ui.ActionBar.j6.f19210w6, LocaleController.formatString("SetUrlAvailable", R.string.SetUrlAvailable, str));
                        return;
                    }
                }
                return;
            case 1:
                ce1.W((ce1) obj3, (TLRPC.TL_error) obj, (TL_account.updateTheme) obj2);
                return;
            case 2:
                me1 me1Var = (me1) obj3;
                bo boVar = (bo) obj2;
                MessageObject messageObject = me1Var.G;
                int i12 = ((TLRPC.TodoItem) obj).f18266id;
                if (messageObject != null && (message = messageObject.messageOwner) != null && (message.media instanceof TLRPC.TL_messageMediaToDo)) {
                    messageObject.getDialogId();
                    ?? obj4 = new Object();
                    obj4.f37271a = messageObject;
                    obj4.f37272b = -1;
                    obj4.f37273c = -1;
                    obj4.f37275g = true;
                    obj4.d = i12;
                    obj4.e();
                    rnVar = obj4;
                }
                boVar.Cb(messageObject, rnVar);
                me1Var.c(false);
                return;
            case 3:
                ue1 ue1Var = (ue1) obj3;
                ArrayList arrayList = ue1Var.h;
                arrayList.clear();
                ArrayList arrayList2 = ue1Var.f38055f;
                arrayList2.clear();
                arrayList.addAll((ArrayList) obj2);
                arrayList2.addAll(((TLRPC.TL_messages_inactiveChats) obj).chats);
                ue1Var.d.l();
                if (ue1Var.f38052a.getMeasuredHeight() > 0) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ue1Var.f38061y = ofFloat;
                    ofFloat.addUpdateListener(new k21(ue1Var, 14));
                    ue1Var.f38061y.setDuration(100L);
                    ue1Var.f38061y.start();
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
                fg1Var.f33671s.deleteTopics(fg1Var.f33636a, (ArrayList) obj2);
                ((Runnable) obj).run();
                return;
            case 5:
                bg1 bg1Var = (bg1) obj3;
                String str3 = (String) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList3 = bg1Var.f32161e0;
                if (str3.equals(bg1Var.f32159c0)) {
                    int i13 = bg1Var.f32168l0;
                    bg1Var.f32172q0 = false;
                    bg1Var.m0 = false;
                    if (tLObject instanceof TLRPC.messages_Messages) {
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                        for (int i14 = 0; i14 < messages_messages.messages.size(); i14++) {
                            i10 = ((org.telegram.ui.ActionBar.o2) bg1Var.f32176u0).currentAccount;
                            MessageObject messageObject2 = new MessageObject(i10, messages_messages.messages.get(i14), false, false);
                            messageObject2.setQuery(str3);
                            arrayList3.add(messageObject2);
                        }
                        bg1Var.M();
                        if (arrayList3.size() < messages_messages.count && !messages_messages.messages.isEmpty()) {
                            z10 = true;
                        }
                        bg1Var.f32169n0 = z10;
                    } else {
                        bg1Var.f32169n0 = false;
                    }
                    if (bg1Var.f32168l0 == 0) {
                        bg1Var.f32170o0.e(bg1Var.m0, true);
                    }
                    bg1Var.f32171p0.b(i13);
                    return;
                }
                return;
            default:
                wh1 wh1Var = (wh1) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                ArrayList arrayList5 = (ArrayList) obj;
                gg.c2 c2Var = wh1Var.f39037f;
                if (wh1Var.f39038n) {
                    wh1Var.h = null;
                    wh1Var.d = arrayList4;
                    wh1Var.e = arrayList5;
                    c2Var.f(arrayList4, null);
                    if (wh1Var.f39038n && !c2Var.e()) {
                        wh1Var.v.f31624f.e(false, true);
                    }
                    wh1Var.l();
                    return;
                }
                return;
        }
    }

    public zd1(ce1 ce1Var, TLRPC.TL_error tL_error, TL_account.updateTheme updatetheme) {
        this.f40221a = 1;
        this.f40222b = ce1Var;
        this.f40223c = tL_error;
        this.d = updatetheme;
    }
}
