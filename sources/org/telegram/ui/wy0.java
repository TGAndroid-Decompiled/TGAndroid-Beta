package org.telegram.ui;

import android.animation.ValueAnimator;
import android.util.Base64;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class wy0 implements Runnable {
    public final int f51632a;
    public final Object f51633b;
    public final Object f51634c;
    public final Object d;

    public wy0(Object obj, Object obj2, Object obj3, int i3) {
        this.f51632a = i3;
        this.f51633b = obj;
        this.f51634c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        TLRPC.Message message;
        TLRPC.Message message2;
        int i3;
        int i10 = this.f51632a;
        mm mmVar = null;
        mmVar = null;
        mmVar = null;
        boolean z10 = false;
        Object obj = this.d;
        Object obj2 = this.f51634c;
        Object obj3 = this.f51633b;
        switch (i10) {
            case 0:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) obj3;
                Runnable runnable = (Runnable) obj2;
                org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) obj;
                secretMediaViewer.f41951l0 = 0;
                secretMediaViewer.J0 = null;
                if (runnable != null) {
                    runnable.run();
                }
                ai.c0 c0Var = secretMediaViewer.f41936e;
                if (c0Var != null) {
                    c0Var.setLayerType(0, null);
                    secretMediaViewer.f41936e.invalidate();
                    bz0 bz0Var = secretMediaViewer.f41953n;
                    long j10 = ziVar.f26868k.destroyTimeMillis;
                    bz0Var.f44171e = false;
                    bz0Var.f44172f = j10;
                    bz0Var.h = message.ttl;
                    bz0Var.f44173n.start();
                    bz0Var.invalidate();
                    if (secretMediaViewer.f41943g1) {
                        secretMediaViewer.e(true, true);
                        return;
                    } else if (secretMediaViewer.f41959p1 && org.telegram.messenger.hp.e1().getInt("viewoncehint", 0) < 3) {
                        secretMediaViewer.m();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 1:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) obj;
                SessionsActivity sessionsActivity = ((j21) obj3).f46489k0;
                if (tL_error == null) {
                    sessionsActivity.d.remove(tL_authorization);
                    sessionsActivity.f41987e.remove(tL_authorization);
                    sessionsActivity.r0();
                    o21 o21Var = sessionsActivity.f41984a;
                    if (o21Var != null) {
                        o21Var.f();
                    }
                    sessionsActivity.p0(true);
                    return;
                }
                return;
            case 2:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                TLRPC.TL_authorization tL_authorization2 = (TLRPC.TL_authorization) obj;
                SessionsActivity sessionsActivity2 = ((k21) obj3).f46745a;
                if (tL_error2 == null) {
                    sessionsActivity2.d.remove(tL_authorization2);
                    sessionsActivity2.f41987e.remove(tL_authorization2);
                    sessionsActivity2.r0();
                    o21 o21Var2 = sessionsActivity2.f41984a;
                    if (o21Var2 != null) {
                        o21Var2.f();
                        return;
                    }
                    return;
                }
                return;
            case 3:
                n21 n21Var = (n21) obj3;
                i9 i9Var = (i9) obj;
                try {
                    byte[] decode = Base64.decode(((String) obj2).substring(17).replaceAll("\\/", "_").replaceAll("\\+", "-"), 8);
                    TLRPC.TL_auth_acceptLoginToken tL_auth_acceptLoginToken = new TLRPC.TL_auth_acceptLoginToken();
                    tL_auth_acceptLoginToken.token = decode;
                    n21Var.f47857c.getConnectionsManager().sendRequest(tL_auth_acceptLoginToken, new m21(0, n21Var, i9Var));
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.e("Failed to pass qr code auth", e10);
                    org.telegram.messenger.g0.h3(new l21(n21Var, 1));
                    i9Var.run();
                    return;
                }
            case 4:
                o71 o71Var = (o71) obj3;
                String str = (String) obj2;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj;
                o71Var.f48229y = 0;
                String str2 = o71Var.E;
                if (str2 != null && str2.equals(str)) {
                    if (tL_error3 != null && ("THEME_SLUG_INVALID".equals(tL_error3.text) || "THEME_SLUG_OCCUPIED".equals(tL_error3.text))) {
                        o71Var.f0(org.telegram.ui.ActionBar.k6.f28102p7, org.telegram.messenger.bd.M0(2131745516, null));
                        return;
                    } else {
                        o71Var.f0(org.telegram.ui.ActionBar.k6.f28234w6, org.telegram.messenger.bd.a0("SetUrlAvailable", null, 2131745518, str));
                        return;
                    }
                }
                return;
            case 5:
                o71.b0((o71) obj3, (TLRPC.TL_error) obj2, (TL_account.updateTheme) obj);
                return;
            case 6:
                w71 w71Var = (w71) obj3;
                wm wmVar = (wm) obj2;
                org.telegram.messenger.zi ziVar2 = w71Var.H;
                int i11 = ((TLRPC.TodoItem) obj).f27148id;
                if (ziVar2 != null && (message2 = ziVar2.f26868k) != null && (message2.media instanceof TLRPC.TL_messageMediaToDo)) {
                    org.telegram.messenger.zi.B0(message2);
                    ?? obj4 = new Object();
                    obj4.f47700a = ziVar2;
                    obj4.f47701b = -1;
                    obj4.f47702c = -1;
                    obj4.f47705g = true;
                    obj4.d = i11;
                    obj4.f();
                    mmVar = obj4;
                }
                wmVar.fc(ziVar2, mmVar);
                w71Var.c(false);
                return;
            case 7:
                d81 d81Var = (d81) obj3;
                ArrayList arrayList = d81Var.h;
                arrayList.clear();
                ArrayList arrayList2 = d81Var.f44597f;
                arrayList2.clear();
                arrayList.addAll((ArrayList) obj2);
                arrayList2.addAll(((TLRPC.TL_messages_inactiveChats) obj).chats);
                d81Var.d.f();
                if (d81Var.f44593a.getMeasuredHeight() > 0) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    d81Var.E = ofFloat;
                    ofFloat.addUpdateListener(new xy0(d81Var, 11));
                    d81Var.E.setDuration(100L);
                    d81Var.E.start();
                } else {
                    d81Var.F = 1.0f;
                }
                org.telegram.messenger.g0.r(d81Var.J);
                if (d81Var.G.getVisibility() == 0) {
                    d81Var.G.animate().alpha(0.0f).setListener(new z71(d81Var, 2)).start();
                    return;
                }
                return;
            case 8:
                m91 m91Var = (m91) obj3;
                m91Var.f47614s.d((ArrayList) obj, m91Var.f47575a);
                ((Runnable) obj2).run();
                return;
            case 9:
                i91 i91Var = (i91) obj3;
                String str3 = (String) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList3 = i91Var.f46207g0;
                if (str3.equals(i91Var.f46205e0)) {
                    int i12 = i91Var.f46213n0;
                    i91Var.f46218s0 = false;
                    i91Var.f46214o0 = false;
                    if (tLObject instanceof TLRPC.messages_Messages) {
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                        for (int i13 = 0; i13 < messages_messages.messages.size(); i13++) {
                            i3 = ((org.telegram.ui.ActionBar.d2) i91Var.f46222w0).currentAccount;
                            org.telegram.messenger.zi ziVar3 = new org.telegram.messenger.zi(i3, messages_messages.messages.get(i13), false, false);
                            ziVar3.L5(str3, true);
                            arrayList3.add(ziVar3);
                        }
                        i91Var.N();
                        if (arrayList3.size() < messages_messages.count && !messages_messages.messages.isEmpty()) {
                            z10 = true;
                        }
                        i91Var.f46215p0 = z10;
                    } else {
                        i91Var.f46215p0 = false;
                    }
                    if (i91Var.f46213n0 == 0) {
                        i91Var.f46216q0.e(i91Var.f46214o0, true);
                    }
                    i91Var.f46217r0.b(i12);
                    return;
                }
                return;
            default:
                cb1 cb1Var = (cb1) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                ArrayList arrayList5 = (ArrayList) obj;
                kg.v1 v1Var = cb1Var.f44289f;
                if (cb1Var.f44290n) {
                    cb1Var.h = null;
                    cb1Var.d = arrayList4;
                    cb1Var.f44288e = arrayList5;
                    v1Var.f(arrayList4, null);
                    if (cb1Var.f44290n && !v1Var.e()) {
                        cb1Var.f44293w.f42109f.e(false, true);
                    }
                    cb1Var.f();
                    return;
                }
                return;
        }
    }

    public wy0(m91 m91Var, ArrayList arrayList, Runnable runnable) {
        this.f51632a = 8;
        this.f51633b = m91Var;
        this.d = arrayList;
        this.f51634c = runnable;
    }
}
