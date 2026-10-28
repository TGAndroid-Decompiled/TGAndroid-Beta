package org.telegram.ui;

import android.animation.ValueAnimator;
import android.util.Base64;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class t31 implements Runnable {
    public final int f43481a;
    public final Object f43482b;
    public final Object f43483c;
    public final Object d;

    public t31(Object obj, Object obj2, Object obj3, int i10) {
        this.f43481a = i10;
        this.f43482b = obj;
        this.f43483c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        TLRPC.Message message;
        TLRPC.Message message2;
        int i10;
        int i11 = this.f43481a;
        mn mnVar = null;
        mnVar = null;
        mnVar = null;
        boolean z10 = false;
        Object obj = this.d;
        Object obj2 = this.f43483c;
        Object obj3 = this.f43482b;
        switch (i11) {
            case 0:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) obj3;
                Runnable runnable = (Runnable) obj2;
                MessageObject messageObject = (MessageObject) obj;
                secretMediaViewer.m0 = 0;
                secretMediaViewer.K0 = null;
                if (runnable != null) {
                    runnable.run();
                }
                bh.p pVar = secretMediaViewer.e;
                if (pVar != null) {
                    pVar.setLayerType(0, null);
                    secretMediaViewer.e.invalidate();
                    y31 y31Var = secretMediaViewer.f36203n;
                    long j10 = messageObject.messageOwner.destroyTimeMillis;
                    y31Var.e = false;
                    y31Var.f45841f = j10;
                    y31Var.h = message.ttl;
                    y31Var.f45842n.start();
                    y31Var.invalidate();
                    if (secretMediaViewer.f36194h1) {
                        secretMediaViewer.e(true, true);
                        return;
                    } else if (secretMediaViewer.f36211q1 && MessagesController.getGlobalMainSettings().getInt("viewoncehint", 0) < 3) {
                        secretMediaViewer.l();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 1:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) obj;
                SessionsActivity sessionsActivity = ((k71) obj3).f40676j0;
                if (tL_error == null) {
                    sessionsActivity.d.remove(tL_authorization);
                    sessionsActivity.e.remove(tL_authorization);
                    sessionsActivity.n0();
                    p71 p71Var = sessionsActivity.f36235a;
                    if (p71Var != null) {
                        p71Var.l();
                    }
                    sessionsActivity.l0(true);
                    return;
                }
                return;
            case 2:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                TLRPC.TL_authorization tL_authorization2 = (TLRPC.TL_authorization) obj;
                SessionsActivity sessionsActivity2 = ((l71) obj3).f40990a;
                if (tL_error2 == null) {
                    sessionsActivity2.d.remove(tL_authorization2);
                    sessionsActivity2.e.remove(tL_authorization2);
                    sessionsActivity2.n0();
                    p71 p71Var2 = sessionsActivity2.f36235a;
                    if (p71Var2 != null) {
                        p71Var2.l();
                        return;
                    }
                    return;
                }
                return;
            case 3:
                o71 o71Var = (o71) obj3;
                p9 p9Var = (p9) obj;
                try {
                    byte[] decode = Base64.decode(((String) obj2).substring(17).replaceAll("\\/", "_").replaceAll("\\+", "-"), 8);
                    TLRPC.TL_auth_acceptLoginToken tL_auth_acceptLoginToken = new TLRPC.TL_auth_acceptLoginToken();
                    tL_auth_acceptLoginToken.token = decode;
                    o71Var.f42009c.getConnectionsManager().sendRequest(tL_auth_acceptLoginToken, new n71(0, o71Var, p9Var));
                    return;
                } catch (Exception e) {
                    FileLog.e("Failed to pass qr code auth", e);
                    AndroidUtilities.runOnUIThread(new m71(o71Var, 1));
                    p9Var.run();
                    return;
                }
            case 4:
                ad1 ad1Var = (ad1) obj3;
                String str = (String) obj2;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj;
                ad1Var.f37746x = 0;
                String str2 = ad1Var.f37747y;
                if (str2 != null && str2.equals(str)) {
                    if (tL_error3 != null && ("THEME_SLUG_INVALID".equals(tL_error3.text) || "THEME_SLUG_OCCUPIED".equals(tL_error3.text))) {
                        ad1Var.b0(org.telegram.ui.ActionBar.y6.f23582p7, LocaleController.getString(R.string.SetUrlInUse));
                        return;
                    } else {
                        ad1Var.b0(org.telegram.ui.ActionBar.y6.f23712w6, LocaleController.formatString("SetUrlAvailable", R.string.SetUrlAvailable, str));
                        return;
                    }
                }
                return;
            case 5:
                ad1.X((ad1) obj3, (TLRPC.TL_error) obj2, (TL_account.updateTheme) obj);
                return;
            case 6:
                kd1 kd1Var = (kd1) obj3;
                wn wnVar = (wn) obj2;
                MessageObject messageObject2 = kd1Var.G;
                int i12 = ((TLRPC.TodoItem) obj).f22175id;
                if (messageObject2 != null && (message2 = messageObject2.messageOwner) != null && (message2.media instanceof TLRPC.TL_messageMediaToDo)) {
                    messageObject2.getDialogId();
                    ?? obj4 = new Object();
                    obj4.f41477a = messageObject2;
                    obj4.f41478b = -1;
                    obj4.f41479c = -1;
                    obj4.f41481g = true;
                    obj4.d = i12;
                    obj4.f();
                    mnVar = obj4;
                }
                wnVar.Sb(messageObject2, mnVar);
                kd1Var.c(false);
                return;
            case 7:
                rd1 rd1Var = (rd1) obj3;
                ArrayList arrayList = rd1Var.h;
                arrayList.clear();
                ArrayList arrayList2 = rd1Var.f42967f;
                arrayList2.clear();
                arrayList.addAll((ArrayList) obj2);
                arrayList2.addAll(((TLRPC.TL_messages_inactiveChats) obj).chats);
                rd1Var.d.l();
                if (rd1Var.f42964a.getMeasuredHeight() > 0) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    rd1Var.f42973y = ofFloat;
                    ofFloat.addUpdateListener(new x11(rd1Var, 12));
                    rd1Var.f42973y.setDuration(100L);
                    rd1Var.f42973y.start();
                } else {
                    rd1Var.E = 1.0f;
                }
                AndroidUtilities.cancelRunOnUIThread(rd1Var.I);
                if (rd1Var.F.getVisibility() == 0) {
                    rd1Var.F.animate().alpha(0.0f).setListener(new nd1(rd1Var, 2)).start();
                    return;
                }
                return;
            case 8:
                cf1 cf1Var = (cf1) obj3;
                cf1Var.f38326s.deleteTopics(cf1Var.f38288a, (ArrayList) obj);
                ((Runnable) obj2).run();
                return;
            case 9:
                ye1 ye1Var = (ye1) obj3;
                String str3 = (String) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList3 = ye1Var.f45988f0;
                if (str3.equals(ye1Var.f45986d0)) {
                    int i13 = ye1Var.m0;
                    ye1Var.f45999r0 = false;
                    ye1Var.f45995n0 = false;
                    if (tLObject instanceof TLRPC.messages_Messages) {
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                        for (int i14 = 0; i14 < messages_messages.messages.size(); i14++) {
                            i10 = ((org.telegram.ui.ActionBar.r2) ye1Var.f46003v0).currentAccount;
                            MessageObject messageObject3 = new MessageObject(i10, messages_messages.messages.get(i14), false, false);
                            messageObject3.setQuery(str3);
                            arrayList3.add(messageObject3);
                        }
                        ye1Var.N();
                        if (arrayList3.size() < messages_messages.count && !messages_messages.messages.isEmpty()) {
                            z10 = true;
                        }
                        ye1Var.f45996o0 = z10;
                    } else {
                        ye1Var.f45996o0 = false;
                    }
                    if (ye1Var.m0 == 0) {
                        ye1Var.f45997p0.e(ye1Var.f45995n0, true);
                    }
                    ye1Var.f45998q0.b(i13);
                    return;
                }
                return;
            default:
                sg1 sg1Var = (sg1) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                ArrayList arrayList5 = (ArrayList) obj;
                ig.a2 a2Var = sg1Var.f43322f;
                if (sg1Var.f43323n) {
                    sg1Var.h = null;
                    sg1Var.d = arrayList4;
                    sg1Var.e = arrayList5;
                    a2Var.f(arrayList4, null);
                    if (sg1Var.f43323n && !a2Var.e()) {
                        sg1Var.v.f36349f.e(false, true);
                    }
                    sg1Var.l();
                    return;
                }
                return;
        }
    }

    public t31(cf1 cf1Var, ArrayList arrayList, Runnable runnable) {
        this.f43481a = 8;
        this.f43482b = cf1Var;
        this.d = arrayList;
        this.f43483c = runnable;
    }
}
