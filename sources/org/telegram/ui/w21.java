package org.telegram.ui;

import android.animation.ValueAnimator;
import android.util.Base64;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class w21 implements Runnable {
    public final int f50880a;
    public final Object f50881b;
    public final Object f50882c;
    public final Object d;

    public w21(Object obj, Object obj2, Object obj3, int i7) {
        this.f50880a = i7;
        this.d = obj;
        this.f50881b = obj2;
        this.f50882c = obj3;
    }

    @Override
    public final void run() {
        TLRPC.Message message;
        int i7;
        int i10 = this.f50880a;
        sm smVar = null;
        smVar = null;
        smVar = null;
        boolean z9 = false;
        Object obj = this.f50882c;
        Object obj2 = this.f50881b;
        Object obj3 = this.d;
        switch (i10) {
            case 0:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) obj;
                SessionsActivity sessionsActivity = ((x21) obj3).f51500j0;
                if (tL_error == null) {
                    sessionsActivity.d.remove(tL_authorization);
                    sessionsActivity.f41956e.remove(tL_authorization);
                    sessionsActivity.r0();
                    b31 b31Var = sessionsActivity.f41953a;
                    if (b31Var != null) {
                        b31Var.f();
                    }
                    sessionsActivity.p0(true);
                    return;
                }
                return;
            case 1:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                TLRPC.TL_authorization tL_authorization2 = (TLRPC.TL_authorization) obj;
                SessionsActivity sessionsActivity2 = ((y21) obj3).f51873a;
                if (tL_error2 == null) {
                    sessionsActivity2.d.remove(tL_authorization2);
                    sessionsActivity2.f41956e.remove(tL_authorization2);
                    sessionsActivity2.r0();
                    b31 b31Var2 = sessionsActivity2.f41953a;
                    if (b31Var2 != null) {
                        b31Var2.f();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                a31 a31Var = (a31) obj3;
                j9 j9Var = (j9) obj;
                try {
                    byte[] decode = Base64.decode(((String) obj2).substring(17).replaceAll("\\/", "_").replaceAll("\\+", "-"), 8);
                    TLRPC.TL_auth_acceptLoginToken tL_auth_acceptLoginToken = new TLRPC.TL_auth_acceptLoginToken();
                    tL_auth_acceptLoginToken.token = decode;
                    a31Var.f43550c.getConnectionsManager().sendRequest(tL_auth_acceptLoginToken, new k50(27, a31Var, j9Var));
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.e("Failed to pass qr code auth", e10);
                    org.telegram.messenger.g0.h3(new z21(a31Var, 1));
                    j9Var.run();
                    return;
                }
            case 3:
                a81 a81Var = (a81) obj3;
                String str = (String) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                a81Var.f43612y = 0;
                String str2 = a81Var.D;
                if (str2 != null && str2.equals(str)) {
                    if (tL_error3 != null && ("THEME_SLUG_INVALID".equals(tL_error3.text) || "THEME_SLUG_OCCUPIED".equals(tL_error3.text))) {
                        a81Var.f0(org.telegram.ui.ActionBar.m6.f28111p7, org.telegram.messenger.id.M0(2131745506, null));
                        return;
                    } else {
                        a81Var.f0(org.telegram.ui.ActionBar.m6.f28244w6, org.telegram.messenger.id.a0("SetUrlAvailable", null, 2131745508, str));
                        return;
                    }
                }
                return;
            case 4:
                a81.b0((a81) obj3, (TLRPC.TL_error) obj2, (TL_account.updateTheme) obj);
                return;
            case 5:
                i81 i81Var = (i81) obj3;
                cn cnVar = (cn) obj2;
                org.telegram.messenger.ij ijVar = i81Var.G;
                int i11 = ((TLRPC.TodoItem) obj).f27107id;
                if (ijVar != null && (message = ijVar.f23266k) != null && (message.media instanceof TLRPC.TL_messageMediaToDo)) {
                    org.telegram.messenger.ij.B0(message);
                    ?? obj4 = new Object();
                    obj4.f49879a = ijVar;
                    obj4.f49880b = -1;
                    obj4.f49881c = -1;
                    obj4.f49884g = true;
                    obj4.d = i11;
                    obj4.f();
                    smVar = obj4;
                }
                cnVar.ic(ijVar, smVar);
                i81Var.c(false);
                return;
            case 6:
                p81 p81Var = (p81) obj3;
                ArrayList arrayList = p81Var.h;
                arrayList.clear();
                ArrayList arrayList2 = p81Var.f48718f;
                arrayList2.clear();
                arrayList.addAll((ArrayList) obj2);
                arrayList2.addAll(((TLRPC.TL_messages_inactiveChats) obj).chats);
                p81Var.d.f();
                if (p81Var.f48714a.getMeasuredHeight() > 0) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    p81Var.D = ofFloat;
                    ofFloat.addUpdateListener(new kz0(p81Var, 11));
                    p81Var.D.setDuration(100L);
                    p81Var.D.start();
                } else {
                    p81Var.E = 1.0f;
                }
                org.telegram.messenger.g0.r(p81Var.I);
                if (p81Var.F.getVisibility() == 0) {
                    p81Var.F.animate().alpha(0.0f).setListener(new l81(p81Var, 2)).start();
                    return;
                }
                return;
            case 7:
                z91 z91Var = (z91) obj3;
                z91Var.f52381s.d((ArrayList) obj2, z91Var.f52343a);
                ((Runnable) obj).run();
                return;
            case 8:
                v91 v91Var = (v91) obj3;
                String str3 = (String) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList3 = v91Var.f50667f0;
                if (str3.equals(v91Var.f50665d0)) {
                    int i12 = v91Var.m0;
                    v91Var.f50678r0 = false;
                    v91Var.f50674n0 = false;
                    if (tLObject instanceof TLRPC.messages_Messages) {
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                        for (int i13 = 0; i13 < messages_messages.messages.size(); i13++) {
                            i7 = ((org.telegram.ui.ActionBar.f2) v91Var.f50682v0).currentAccount;
                            org.telegram.messenger.ij ijVar2 = new org.telegram.messenger.ij(i7, messages_messages.messages.get(i13), false, false);
                            ijVar2.K5(str3, true);
                            arrayList3.add(ijVar2);
                        }
                        v91Var.N();
                        if (arrayList3.size() < messages_messages.count && !messages_messages.messages.isEmpty()) {
                            z9 = true;
                        }
                        v91Var.f50675o0 = z9;
                    } else {
                        v91Var.f50675o0 = false;
                    }
                    if (v91Var.m0 == 0) {
                        v91Var.f50676p0.e(v91Var.f50674n0, true);
                    }
                    v91Var.f50677q0.b(i12);
                    return;
                }
                return;
            default:
                nb1 nb1Var = (nb1) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                ArrayList arrayList5 = (ArrayList) obj;
                jg.z1 z1Var = nb1Var.f48178f;
                if (nb1Var.f48179n) {
                    nb1Var.h = null;
                    nb1Var.d = arrayList4;
                    nb1Var.f48177e = arrayList5;
                    z1Var.f(arrayList4, null);
                    if (nb1Var.f48179n && !z1Var.e()) {
                        nb1Var.f48182w.f42076f.e(false, true);
                    }
                    nb1Var.f();
                    return;
                }
                return;
        }
    }

    public w21(a81 a81Var, String str, TLRPC.TL_error tL_error) {
        this.f50880a = 3;
        this.d = a81Var;
        this.f50882c = str;
        this.f50881b = tL_error;
    }
}
