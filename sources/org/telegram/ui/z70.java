package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class z70 implements Runnable {
    public final int f52576a;
    public final long f52577b;
    public final Object f52578c;
    public final Object d;

    public z70(Object obj, long j10, Object obj2, int i3) {
        this.f52576a = i3;
        this.f52578c = obj;
        this.f52577b = j10;
        this.d = obj2;
    }

    @Override
    public final void run() {
        switch (this.f52576a) {
            case 0:
                LaunchActivity launchActivity = (LaunchActivity) this.f52578c;
                long j10 = this.f52577b;
                String str = LaunchActivity.E1;
                org.telegram.messenger.g0.h3(new pp(launchActivity, org.telegram.messenger.qr.a0(launchActivity.P).j0(j10), (p70) this.d, 19));
                return;
            case 1:
                la0 la0Var = (la0) this.f52578c;
                TLObject tLObject = (TLObject) this.d;
                long j11 = this.f52577b;
                if (la0Var.F != null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    int i3 = 0;
                    while (i3 < messages_messages.messages.size()) {
                        if (!(messages_messages.messages.get(i3).media instanceof TLRPC.TL_messageMediaGeoLive)) {
                            messages_messages.messages.remove(i3);
                            i3--;
                        }
                        i3++;
                    }
                    la0Var.getMessagesStorage().m1(messages_messages.users, messages_messages.chats, true, true);
                    la0Var.getMessagesController().Y3(messages_messages.users, false);
                    la0Var.getMessagesController().S3(messages_messages.chats, false);
                    la0Var.getLocationController().f23976c.k(messages_messages.messages, j11);
                    la0Var.getNotificationCenter().k(282, Long.valueOf(j11));
                    la0Var.p0(messages_messages.messages);
                    la0Var.getLocationController().j(la0Var.m0);
                    if (la0Var.L0 == null) {
                        u90 u90Var = new u90(la0Var, 0);
                        la0Var.L0 = u90Var;
                        org.telegram.messenger.g0.i3(u90Var, 5000L);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                pr0 pr0Var = (pr0) this.f52578c;
                long j12 = this.f52577b;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.d;
                pr0Var.getClass();
                Bundle bundle = new Bundle();
                if (j12 > 0) {
                    bundle.putLong("user_id", j12);
                } else {
                    bundle.putLong("chat_id", -j12);
                }
                d2Var.presentFragment(new ProfileActivity(bundle, null));
                pr0Var.c(false);
                return;
            case 3:
                ui.f fVar = (ui.f) this.f52578c;
                ui.e eVar = (ui.e) this.d;
                long j13 = this.f52577b;
                if (((ui.e) fVar.f56391c) == eVar) {
                    ui.c cVar = (ui.c) fVar.f56392e;
                    if (cVar != null) {
                        org.telegram.messenger.g0.r(cVar);
                        fVar.f56392e = null;
                    }
                    synchronized (ui.j.f56399y) {
                        try {
                            ui.j jVar = ui.j.A;
                            if (jVar != null) {
                                jVar.q();
                                ui.j.A = null;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    fVar.f56391c = null;
                    eVar.f56387c.run(j13);
                    fVar.I();
                    return;
                }
                return;
            default:
                long j14 = this.f52577b;
                Exception exc = (Exception) this.d;
                vi.j jVar2 = (vi.j) ((vi.f) this.f52578c).f56973c;
                if (j14 == jVar2.f56993o) {
                    jVar2.f56992n = null;
                    int i10 = jVar2.G;
                    if (i10 != 10 && i10 != 9) {
                        jVar2.g(exc);
                        return;
                    }
                    jVar2.h.a("capture error after session end", exc);
                    jVar2.c();
                    jVar2.t();
                    return;
                }
                return;
        }
    }

    public z70(Object obj, Object obj2, long j10, int i3) {
        this.f52576a = i3;
        this.f52578c = obj;
        this.d = obj2;
        this.f52577b = j10;
    }
}
