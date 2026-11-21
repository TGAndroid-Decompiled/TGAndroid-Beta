package org.telegram.ui;

import android.animation.ValueAnimator;
import android.util.Base64;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class v21 implements Runnable {
    public final int f52711a;
    public final Object f52712b;
    public final Object f52713c;
    public final Object d;

    public v21(Object obj, Object obj2, Object obj3, int i7) {
        this.f52711a = i7;
        this.d = obj;
        this.f52712b = obj2;
        this.f52713c = obj3;
    }

    @Override
    public final void run() {
        TLRPC.Message message;
        int i7;
        int i10 = this.f52711a;
        rm rmVar = null;
        rmVar = null;
        rmVar = null;
        boolean z10 = false;
        Object obj = this.f52713c;
        Object obj2 = this.f52712b;
        Object obj3 = this.d;
        switch (i10) {
            case 0:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) obj;
                SessionsActivity sessionsActivity = ((w21) obj3).f52948k0;
                if (tL_error == null) {
                    sessionsActivity.d.remove(tL_authorization);
                    sessionsActivity.f43817e.remove(tL_authorization);
                    sessionsActivity.r0();
                    a31 a31Var = sessionsActivity.f43814a;
                    if (a31Var != null) {
                        a31Var.f();
                    }
                    sessionsActivity.p0(true);
                    return;
                }
                return;
            case 1:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                TLRPC.TL_authorization tL_authorization2 = (TLRPC.TL_authorization) obj;
                SessionsActivity sessionsActivity2 = ((x21) obj3).f53585a;
                if (tL_error2 == null) {
                    sessionsActivity2.d.remove(tL_authorization2);
                    sessionsActivity2.f43817e.remove(tL_authorization2);
                    sessionsActivity2.r0();
                    a31 a31Var2 = sessionsActivity2.f43814a;
                    if (a31Var2 != null) {
                        a31Var2.f();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                z21 z21Var = (z21) obj3;
                k9 k9Var = (k9) obj;
                try {
                    byte[] decode = Base64.decode(((String) obj2).substring(17).replaceAll("\\/", "_").replaceAll("\\+", "-"), 8);
                    TLRPC.TL_auth_acceptLoginToken tL_auth_acceptLoginToken = new TLRPC.TL_auth_acceptLoginToken();
                    tL_auth_acceptLoginToken.token = decode;
                    z21Var.f54382c.getConnectionsManager().sendRequest(tL_auth_acceptLoginToken, new e00(29, z21Var, k9Var));
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.e("Failed to pass qr code auth", e10);
                    org.telegram.messenger.g0.g3(new y21(z21Var, 1));
                    k9Var.run();
                    return;
                }
            case 3:
                a81 a81Var = (a81) obj3;
                String str = (String) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                a81Var.f45541y = 0;
                String str2 = a81Var.E;
                if (str2 != null && str2.equals(str)) {
                    if (tL_error3 != null && ("THEME_SLUG_INVALID".equals(tL_error3.text) || "THEME_SLUG_OCCUPIED".equals(tL_error3.text))) {
                        a81Var.f0(org.telegram.ui.ActionBar.m6.f29599p7, org.telegram.messenger.gd.N0(2131745310, null));
                        return;
                    } else {
                        a81Var.f0(org.telegram.ui.ActionBar.m6.f29732w6, org.telegram.messenger.gd.a0("SetUrlAvailable", null, 2131745312, str));
                        return;
                    }
                }
                return;
            case 4:
                a81.b0((a81) obj3, (TLRPC.TL_error) obj2, (TL_account.updateTheme) obj);
                return;
            case 5:
                i81 i81Var = (i81) obj3;
                bn bnVar = (bn) obj2;
                org.telegram.messenger.fj fjVar = i81Var.H;
                int i11 = ((TLRPC.TodoItem) obj).f28578id;
                if (fjVar != null && (message = fjVar.f23993k) != null && (message.media instanceof TLRPC.TL_messageMediaToDo)) {
                    org.telegram.messenger.fj.B0(message);
                    ?? obj4 = new Object();
                    obj4.f51615a = fjVar;
                    obj4.f51616b = -1;
                    obj4.f51617c = -1;
                    obj4.f51620g = true;
                    obj4.d = i11;
                    obj4.f();
                    rmVar = obj4;
                }
                bnVar.jc(fjVar, rmVar);
                i81Var.c(false);
                return;
            case 6:
                p81 p81Var = (p81) obj3;
                ArrayList arrayList = p81Var.h;
                arrayList.clear();
                ArrayList arrayList2 = p81Var.f50809f;
                arrayList2.clear();
                arrayList.addAll((ArrayList) obj2);
                arrayList2.addAll(((TLRPC.TL_messages_inactiveChats) obj).chats);
                p81Var.d.f();
                if (p81Var.f50805a.getMeasuredHeight() > 0) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    p81Var.E = ofFloat;
                    ofFloat.addUpdateListener(new iz0(p81Var, 11));
                    p81Var.E.setDuration(100L);
                    p81Var.E.start();
                } else {
                    p81Var.F = 1.0f;
                }
                org.telegram.messenger.g0.r(p81Var.J);
                if (p81Var.G.getVisibility() == 0) {
                    p81Var.G.animate().alpha(0.0f).setListener(new l81(p81Var, 2)).start();
                    return;
                }
                return;
            case 7:
                y91 y91Var = (y91) obj3;
                y91Var.f54135s.d((ArrayList) obj2, y91Var.f54095a);
                ((Runnable) obj).run();
                return;
            case 8:
                u91 u91Var = (u91) obj3;
                String str3 = (String) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList3 = u91Var.f52488g0;
                if (str3.equals(u91Var.f52486e0)) {
                    int i12 = u91Var.f52494n0;
                    u91Var.f52499s0 = false;
                    u91Var.f52495o0 = false;
                    if (tLObject instanceof TLRPC.messages_Messages) {
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                        for (int i13 = 0; i13 < messages_messages.messages.size(); i13++) {
                            i7 = ((org.telegram.ui.ActionBar.g2) u91Var.f52503w0).currentAccount;
                            org.telegram.messenger.fj fjVar2 = new org.telegram.messenger.fj(i7, messages_messages.messages.get(i13), false, false);
                            fjVar2.K5(str3, true);
                            arrayList3.add(fjVar2);
                        }
                        u91Var.J();
                        if (arrayList3.size() < messages_messages.count && !messages_messages.messages.isEmpty()) {
                            z10 = true;
                        }
                        u91Var.f52496p0 = z10;
                    } else {
                        u91Var.f52496p0 = false;
                    }
                    if (u91Var.f52494n0 == 0) {
                        u91Var.f52497q0.e(u91Var.f52495o0, true);
                    }
                    u91Var.f52498r0.b(i12);
                    return;
                }
                return;
            default:
                mb1 mb1Var = (mb1) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                ArrayList arrayList5 = (ArrayList) obj;
                jg.z1 z1Var = mb1Var.f49840f;
                if (mb1Var.f49841n) {
                    mb1Var.h = null;
                    mb1Var.d = arrayList4;
                    mb1Var.f49839e = arrayList5;
                    z1Var.f(arrayList4, null);
                    if (mb1Var.f49841n && !z1Var.e()) {
                        mb1Var.f49844w.f43939f.e(false, true);
                    }
                    mb1Var.f();
                    return;
                }
                return;
        }
    }

    public v21(a81 a81Var, String str, TLRPC.TL_error tL_error) {
        this.f52711a = 3;
        this.d = a81Var;
        this.f52713c = str;
        this.f52712b = tL_error;
    }
}
