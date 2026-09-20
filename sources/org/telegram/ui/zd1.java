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
    public final int f40184a;
    public final Object f40185b;
    public final Object f40186c;
    public final Object d;

    public zd1(Object obj, Object obj2, Object obj3, int i10) {
        this.f40184a = i10;
        this.f40185b = obj;
        this.d = obj2;
        this.f40186c = obj3;
    }

    @Override
    public final void run() {
        TLRPC.Message message;
        int i10;
        int i11 = this.f40184a;
        pn pnVar = null;
        pnVar = null;
        pnVar = null;
        boolean z10 = false;
        Object obj = this.f40186c;
        Object obj2 = this.d;
        Object obj3 = this.f40185b;
        switch (i11) {
            case 0:
                ce1 ce1Var = (ce1) obj3;
                String str = (String) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                ce1Var.f32730y = 0;
                String str2 = ce1Var.E;
                if (str2 != null && str2.equals(str)) {
                    if (tL_error != null && ("THEME_SLUG_INVALID".equals(tL_error.text) || "THEME_SLUG_OCCUPIED".equals(tL_error.text))) {
                        ce1Var.a0(org.telegram.ui.ActionBar.j6.f19315p7, LocaleController.getString(R.string.SetUrlInUse));
                        return;
                    } else {
                        ce1Var.a0(org.telegram.ui.ActionBar.j6.f19443w6, LocaleController.formatString("SetUrlAvailable", R.string.SetUrlAvailable, str));
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
                int i12 = ((TLRPC.TodoItem) obj).f18473id;
                if (messageObject != null && (message = messageObject.messageOwner) != null && (message.media instanceof TLRPC.TL_messageMediaToDo)) {
                    messageObject.getDialogId();
                    ?? obj4 = new Object();
                    obj4.f36592a = messageObject;
                    obj4.f36593b = -1;
                    obj4.f36594c = -1;
                    obj4.f36596g = true;
                    obj4.d = i12;
                    obj4.e();
                    pnVar = obj4;
                }
                znVar.Cb(messageObject, pnVar);
                me1Var.c(false);
                return;
            case 3:
                ue1 ue1Var = (ue1) obj3;
                ArrayList arrayList = ue1Var.h;
                arrayList.clear();
                ArrayList arrayList2 = ue1Var.f38072f;
                arrayList2.clear();
                arrayList.addAll((ArrayList) obj2);
                arrayList2.addAll(((TLRPC.TL_messages_inactiveChats) obj).chats);
                ue1Var.d.l();
                if (ue1Var.f38069a.getMeasuredHeight() > 0) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ue1Var.f38078y = ofFloat;
                    ofFloat.addUpdateListener(new i21(ue1Var, 14));
                    ue1Var.f38078y.setDuration(100L);
                    ue1Var.f38078y.start();
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
                fg1Var.f33631s.deleteTopics(fg1Var.f33596a, (ArrayList) obj2);
                ((Runnable) obj).run();
                return;
            case 5:
                bg1 bg1Var = (bg1) obj3;
                String str3 = (String) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList3 = bg1Var.f32444e0;
                if (str3.equals(bg1Var.f32442c0)) {
                    int i13 = bg1Var.f32451l0;
                    bg1Var.f32455q0 = false;
                    bg1Var.m0 = false;
                    if (tLObject instanceof TLRPC.messages_Messages) {
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                        for (int i14 = 0; i14 < messages_messages.messages.size(); i14++) {
                            i10 = ((org.telegram.ui.ActionBar.n2) bg1Var.f32459u0).currentAccount;
                            MessageObject messageObject2 = new MessageObject(i10, messages_messages.messages.get(i14), false, false);
                            messageObject2.setQuery(str3);
                            arrayList3.add(messageObject2);
                        }
                        bg1Var.M();
                        if (arrayList3.size() < messages_messages.count && !messages_messages.messages.isEmpty()) {
                            z10 = true;
                        }
                        bg1Var.f32452n0 = z10;
                    } else {
                        bg1Var.f32452n0 = false;
                    }
                    if (bg1Var.f32451l0 == 0) {
                        bg1Var.f32453o0.e(bg1Var.m0, true);
                    }
                    bg1Var.f32454p0.b(i13);
                    return;
                }
                return;
            default:
                wh1 wh1Var = (wh1) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                ArrayList arrayList5 = (ArrayList) obj;
                gg.c2 c2Var = wh1Var.f39154f;
                if (wh1Var.f39155n) {
                    wh1Var.h = null;
                    wh1Var.d = arrayList4;
                    wh1Var.e = arrayList5;
                    c2Var.f(arrayList4, null);
                    if (wh1Var.f39155n && !c2Var.e()) {
                        wh1Var.v.f31895f.e(false, true);
                    }
                    wh1Var.l();
                    return;
                }
                return;
        }
    }

    public zd1(ce1 ce1Var, TLRPC.TL_error tL_error, TL_account.updateTheme updatetheme) {
        this.f40184a = 1;
        this.f40185b = ce1Var;
        this.f40186c = tL_error;
        this.d = updatetheme;
    }
}
