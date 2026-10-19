package org.telegram.ui;

import android.os.Bundle;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class yb0 implements Runnable {
    public final int f43430a;
    public final long f43431b;
    public final Object f43432c;
    public final Object d;

    public yb0(Object obj, long j10, Object obj2, int i10) {
        this.f43430a = i10;
        this.f43432c = obj;
        this.f43431b = j10;
        this.d = obj2;
    }

    @Override
    public final void run() {
        switch (this.f43430a) {
            case 0:
                nc0 nc0Var = (nc0) this.f43432c;
                TLObject tLObject = (TLObject) this.d;
                long j10 = this.f43431b;
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
                    nc0Var.getLocationController().markLiveLoactionsAsRead(nc0Var.f39503e0);
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
                qv0 qv0Var = (qv0) this.f43432c;
                long j11 = this.f43431b;
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
                qi.e eVar = (qi.e) this.f43432c;
                qi.d dVar = (qi.d) this.d;
                long j12 = this.f43431b;
                if (((qi.d) eVar.f44751b) == dVar) {
                    qi.b bVar = (qi.b) eVar.d;
                    if (bVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(bVar);
                        eVar.d = null;
                    }
                    synchronized (qi.i.f44758y) {
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
                    eVar.f44751b = null;
                    dVar.f44749c.run(j12);
                    eVar.D();
                    return;
                }
                return;
            case 3:
                ri.p pVar = (ri.p) this.f43432c;
                long j13 = this.f43431b;
                File file = (File) this.d;
                if (pVar.f45834m == ri.n.f45820f) {
                    pVar.f45837p = j13;
                    pVar.f45839r = 0L;
                    pVar.f45840s = ri.p.q(j13);
                    pVar.d();
                    pVar.t(file);
                    return;
                }
                return;
            case 4:
                long j14 = this.f43431b;
                Exception exc = (Exception) this.d;
                ri.p pVar2 = (ri.p) ((cc.e) this.f43432c).f5095c;
                if (j14 == pVar2.f45836o) {
                    pVar2.f45835n = null;
                    pVar2.g(exc);
                    return;
                }
                return;
            default:
                yh.o1 o1Var = (yh.o1) this.f43432c;
                Utilities.Callback callback = (Utilities.Callback) this.d;
                long j15 = this.f43431b;
                o1Var.getClass();
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    o1Var.dismiss();
                    if (callback != null) {
                        callback.run(Boolean.FALSE);
                    }
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("user_id", j15);
                    bundle2.putBoolean("open_gifts", true);
                    U.presentFragment(new ProfileActivity(bundle2, null));
                    return;
                }
                return;
        }
    }

    public yb0(Object obj, Object obj2, long j10, int i10) {
        this.f43430a = i10;
        this.f43432c = obj;
        this.d = obj2;
        this.f43431b = j10;
    }
}
