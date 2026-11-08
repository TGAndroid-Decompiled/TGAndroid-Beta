package org.telegram.ui;

import android.animation.ValueAnimator;
import android.util.Base64;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class t21 implements Runnable {
    public final int f49889a;
    public final Object f49890b;
    public final Object f49891c;
    public final Object d;

    public t21(Object obj, Object obj2, Object obj3, int i7) {
        this.f49889a = i7;
        this.d = obj;
        this.f49890b = obj2;
        this.f49891c = obj3;
    }

    @Override
    public final void run() {
        TLRPC.Message message;
        int i7;
        int i10 = this.f49889a;
        qm qmVar = null;
        qmVar = null;
        qmVar = null;
        boolean z9 = false;
        Object obj = this.f49891c;
        Object obj2 = this.f49890b;
        Object obj3 = this.d;
        switch (i10) {
            case 0:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) obj;
                SessionsActivity sessionsActivity = ((u21) obj3).f50199j0;
                if (tL_error == null) {
                    sessionsActivity.d.remove(tL_authorization);
                    sessionsActivity.f41958e.remove(tL_authorization);
                    sessionsActivity.r0();
                    y21 y21Var = sessionsActivity.f41955a;
                    if (y21Var != null) {
                        y21Var.f();
                    }
                    sessionsActivity.p0(true);
                    return;
                }
                return;
            case 1:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                TLRPC.TL_authorization tL_authorization2 = (TLRPC.TL_authorization) obj;
                SessionsActivity sessionsActivity2 = ((v21) obj3).f50490a;
                if (tL_error2 == null) {
                    sessionsActivity2.d.remove(tL_authorization2);
                    sessionsActivity2.f41958e.remove(tL_authorization2);
                    sessionsActivity2.r0();
                    y21 y21Var2 = sessionsActivity2.f41955a;
                    if (y21Var2 != null) {
                        y21Var2.f();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                x21 x21Var = (x21) obj3;
                j9 j9Var = (j9) obj;
                try {
                    byte[] decode = Base64.decode(((String) obj2).substring(17).replaceAll("\\/", "_").replaceAll("\\+", "-"), 8);
                    TLRPC.TL_auth_acceptLoginToken tL_auth_acceptLoginToken = new TLRPC.TL_auth_acceptLoginToken();
                    tL_auth_acceptLoginToken.token = decode;
                    x21Var.f51728c.getConnectionsManager().sendRequest(tL_auth_acceptLoginToken, new h50(27, x21Var, j9Var));
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.e("Failed to pass qr code auth", e10);
                    org.telegram.messenger.g0.h3(new w21(x21Var, 1));
                    j9Var.run();
                    return;
                }
            case 3:
                y71 y71Var = (y71) obj3;
                String str = (String) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                y71Var.f52165y = 0;
                String str2 = y71Var.D;
                if (str2 != null && str2.equals(str)) {
                    if (tL_error3 != null && ("THEME_SLUG_INVALID".equals(tL_error3.text) || "THEME_SLUG_OCCUPIED".equals(tL_error3.text))) {
                        y71Var.f0(org.telegram.ui.ActionBar.k6.f28073p7, org.telegram.messenger.id.M0(2131745509, null));
                        return;
                    } else {
                        y71Var.f0(org.telegram.ui.ActionBar.k6.f28206w6, org.telegram.messenger.id.a0("SetUrlAvailable", null, 2131745511, str));
                        return;
                    }
                }
                return;
            case 4:
                y71.b0((y71) obj3, (TLRPC.TL_error) obj2, (TL_account.updateTheme) obj);
                return;
            case 5:
                g81 g81Var = (g81) obj3;
                an anVar = (an) obj2;
                org.telegram.messenger.ij ijVar = g81Var.G;
                int i11 = ((TLRPC.TodoItem) obj).f27103id;
                if (ijVar != null && (message = ijVar.f23262k) != null && (message.media instanceof TLRPC.TL_messageMediaToDo)) {
                    org.telegram.messenger.ij.B0(message);
                    ?? obj4 = new Object();
                    obj4.f49265a = ijVar;
                    obj4.f49266b = -1;
                    obj4.f49267c = -1;
                    obj4.f49270g = true;
                    obj4.d = i11;
                    obj4.f();
                    qmVar = obj4;
                }
                anVar.fc(ijVar, qmVar);
                g81Var.c(false);
                return;
            case 6:
                n81 n81Var = (n81) obj3;
                ArrayList arrayList = n81Var.h;
                arrayList.clear();
                ArrayList arrayList2 = n81Var.f48000f;
                arrayList2.clear();
                arrayList.addAll((ArrayList) obj2);
                arrayList2.addAll(((TLRPC.TL_messages_inactiveChats) obj).chats);
                n81Var.d.f();
                if (n81Var.f47996a.getMeasuredHeight() > 0) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    n81Var.D = ofFloat;
                    ofFloat.addUpdateListener(new gz0(n81Var, 11));
                    n81Var.D.setDuration(100L);
                    n81Var.D.start();
                } else {
                    n81Var.E = 1.0f;
                }
                org.telegram.messenger.g0.r(n81Var.I);
                if (n81Var.F.getVisibility() == 0) {
                    n81Var.F.animate().alpha(0.0f).setListener(new j81(n81Var, 2)).start();
                    return;
                }
                return;
            case 7:
                w91 w91Var = (w91) obj3;
                w91Var.f51030s.d((ArrayList) obj2, w91Var.f50992a);
                ((Runnable) obj).run();
                return;
            case 8:
                s91 s91Var = (s91) obj3;
                String str3 = (String) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList3 = s91Var.f49687f0;
                if (str3.equals(s91Var.f49685d0)) {
                    int i12 = s91Var.m0;
                    s91Var.f49698r0 = false;
                    s91Var.f49694n0 = false;
                    if (tLObject instanceof TLRPC.messages_Messages) {
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                        for (int i13 = 0; i13 < messages_messages.messages.size(); i13++) {
                            i7 = ((org.telegram.ui.ActionBar.f2) s91Var.f49702v0).currentAccount;
                            org.telegram.messenger.ij ijVar2 = new org.telegram.messenger.ij(i7, messages_messages.messages.get(i13), false, false);
                            ijVar2.L5(str3, true);
                            arrayList3.add(ijVar2);
                        }
                        s91Var.N();
                        if (arrayList3.size() < messages_messages.count && !messages_messages.messages.isEmpty()) {
                            z9 = true;
                        }
                        s91Var.f49695o0 = z9;
                    } else {
                        s91Var.f49695o0 = false;
                    }
                    if (s91Var.m0 == 0) {
                        s91Var.f49696p0.e(s91Var.f49694n0, true);
                    }
                    s91Var.f49697q0.b(i12);
                    return;
                }
                return;
            default:
                kb1 kb1Var = (kb1) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                ArrayList arrayList5 = (ArrayList) obj;
                jg.z1 z1Var = kb1Var.f47161f;
                if (kb1Var.f47162n) {
                    kb1Var.h = null;
                    kb1Var.d = arrayList4;
                    kb1Var.f47160e = arrayList5;
                    z1Var.f(arrayList4, null);
                    if (kb1Var.f47162n && !z1Var.e()) {
                        kb1Var.f47165w.f42078f.e(false, true);
                    }
                    kb1Var.f();
                    return;
                }
                return;
        }
    }

    public t21(y71 y71Var, String str, TLRPC.TL_error tL_error) {
        this.f49889a = 3;
        this.d = y71Var;
        this.f49891c = str;
        this.f49890b = tL_error;
    }
}
