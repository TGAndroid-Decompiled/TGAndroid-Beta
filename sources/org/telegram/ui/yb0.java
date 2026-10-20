package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class yb0 implements Runnable {
    public final int f43440a;
    public final long f43441b;
    public final Object f43442c;
    public final Object d;

    public yb0(Object obj, long j10, Object obj2, int i10) {
        this.f43440a = i10;
        this.f43442c = obj;
        this.f43441b = j10;
        this.d = obj2;
    }

    @Override
    public final void run() {
        switch (this.f43440a) {
            case 0:
                nc0 nc0Var = (nc0) this.f43442c;
                TLObject tLObject = (TLObject) this.d;
                long j10 = this.f43441b;
                if (nc0Var.I != null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    int i10 = 0;
                    while (i10 < messages_messages.messages.size()) {
                        if (!(messages_messages.messages.get(i10).media instanceof TLRPC.TL_messageMediaGeoLive)) {
                            messages_messages.messages.remove(i10);
                            i10--;
                        }
                        i10++;
                    }
                    nc0Var.getMessagesStorage().putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
                    nc0Var.getMessagesController().putUsers(messages_messages.users, false);
                    nc0Var.getMessagesController().putChats(messages_messages.chats, false);
                    nc0Var.getLocationController().locationsCache.k(messages_messages.messages, j10);
                    nc0Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveLocationsCacheChanged, Long.valueOf(j10));
                    nc0Var.h0(messages_messages.messages);
                    nc0Var.getLocationController().markLiveLoactionsAsRead(nc0Var.f39505e0);
                    if (nc0Var.J0 == null) {
                        vb0 vb0Var = new vb0(nc0Var, 4);
                        nc0Var.J0 = vb0Var;
                        AndroidUtilities.runOnUIThread(vb0Var, 5000L);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                qv0 qv0Var = (qv0) this.f43442c;
                long j11 = this.f43441b;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.d;
                qv0Var.getClass();
                Bundle bundle = new Bundle();
                if (j11 > 0) {
                    bundle.putLong("user_id", j11);
                } else {
                    bundle.putLong("chat_id", -j11);
                }
                n2Var.presentFragment(new ProfileActivity(bundle, null));
                qv0Var.c(false);
                return;
            case 2:
                qi.e eVar = (qi.e) this.f43442c;
                qi.d dVar = (qi.d) this.d;
                long j12 = this.f43441b;
                if (((qi.d) eVar.f44761b) == dVar) {
                    qi.b bVar = (qi.b) eVar.d;
                    if (bVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(bVar);
                        eVar.d = null;
                    }
                    synchronized (qi.i.f44768y) {
                        try {
                            qi.i iVar = qi.i.A;
                            if (iVar != null) {
                                iVar.o();
                                qi.i.A = null;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    eVar.f44761b = null;
                    dVar.f44759c.run(j12);
                    eVar.D();
                    return;
                }
                return;
            case 3:
                long j13 = this.f43441b;
                Exception exc = (Exception) this.d;
                ri.o oVar = (ri.o) ((cc.e) this.f43442c).f5093c;
                if (j13 == oVar.f45844p) {
                    oVar.f45843o = null;
                    ri.m mVar = oVar.f45842n;
                    if (mVar != ri.m.f45830s && mVar != ri.m.f45829r) {
                        oVar.g(exc);
                        return;
                    }
                    oVar.h.a("capture error after session end", exc);
                    oVar.c();
                    oVar.s();
                    return;
                }
                return;
            default:
                yh.o1 o1Var = (yh.o1) this.f43442c;
                Utilities.Callback callback = (Utilities.Callback) this.d;
                long j14 = this.f43441b;
                o1Var.getClass();
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    o1Var.dismiss();
                    if (callback != null) {
                        callback.run(Boolean.FALSE);
                    }
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("user_id", j14);
                    bundle2.putBoolean("open_gifts", true);
                    U.presentFragment(new ProfileActivity(bundle2, null));
                    return;
                }
                return;
        }
    }

    public yb0(Object obj, Object obj2, long j10, int i10) {
        this.f43440a = i10;
        this.f43442c = obj;
        this.d = obj2;
        this.f43441b = j10;
    }
}
