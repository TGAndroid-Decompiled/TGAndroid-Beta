package org.telegram.ui;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.tgnet.TLRPC;
public final class s70 implements Runnable {
    public final LaunchActivity f51135a;
    public final org.telegram.ui.ActionBar.e2 f51136b;
    public final int f51137c;
    public final TLRPC.User d;
    public final TLRPC.TL_messages_botApp f51138e;
    public final AtomicBoolean f51139f;
    public final String h;
    public final boolean f51140n;
    public final boolean f51141r;
    public final boolean f51142s;
    public final boolean f51143w;

    public s70(LaunchActivity launchActivity, org.telegram.ui.ActionBar.e2 e2Var, int i7, TLRPC.User user, TLRPC.TL_messages_botApp tL_messages_botApp, AtomicBoolean atomicBoolean, String str, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f51135a = launchActivity;
        this.f51136b = e2Var;
        this.f51137c = i7;
        this.d = user;
        this.f51138e = tL_messages_botApp;
        this.f51139f = atomicBoolean;
        this.h = str;
        this.f51140n = z10;
        this.f51141r = z11;
        this.f51142s = z12;
        this.f51143w = z13;
    }

    @Override
    public final void run() {
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        String a02;
        String str = LaunchActivity.C1;
        org.telegram.ui.ActionBar.e2 e2Var = this.f51136b;
        if (e2Var != null && LaunchActivity.E1) {
            LaunchActivity launchActivity = this.f51135a;
            if (!launchActivity.isFinishing() && !launchActivity.isDestroyed()) {
                TLRPC.User user = this.d;
                long j3 = user.f28200id;
                TLRPC.TL_messages_botApp tL_messages_botApp = this.f51138e;
                TLRPC.BotApp botApp = tL_messages_botApp.app;
                boolean z10 = this.f51139f.get();
                int i7 = this.f51137c;
                String str2 = this.h;
                boolean z11 = this.f51140n;
                boolean z12 = this.f51141r;
                ki.k4 b10 = ki.k4.b(i7, j3, j3, null, null, 3, 0, 0L, botApp, z10, str2, user, 0, z11, z12);
                if (launchActivity.N() == null || launchActivity.N().k(b10) == null) {
                    org.telegram.messenger.b6.p(launchActivity.P, user.f28200id);
                    ki.x2 x2Var = new ki.x2(launchActivity, e2Var.getResourceProvider());
                    ki.p2 p2Var = x2Var.E;
                    if (p2Var != null) {
                        p2Var.setWasOpenedByLinkIntent(this.f51142s);
                    }
                    x2Var.B(!z11);
                    if (z12) {
                        x2Var.C(true, false, x2Var.f18663g0);
                    }
                    x2Var.C0 = false;
                    x2Var.m0 = launchActivity;
                    x2Var.x(e2Var, b10);
                    x2Var.show();
                    if (tL_messages_botApp.inactive || this.f51143w) {
                        TLRPC.User a22 = org.telegram.messenger.np.s1(x2Var.I).a2(Long.valueOf(x2Var.J));
                        ArrayList<TLRPC.TL_attachMenuBot> arrayList = org.telegram.messenger.si.b0(x2Var.I).f26461b.bots;
                        int size = arrayList.size();
                        int i10 = 0;
                        while (true) {
                            if (i10 < size) {
                                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList.get(i10);
                                i10++;
                                tL_attachMenuBot = tL_attachMenuBot2;
                                if (tL_attachMenuBot.bot_id == x2Var.J) {
                                    break;
                                }
                            } else {
                                tL_attachMenuBot = null;
                                break;
                            }
                        }
                        if (tL_attachMenuBot != null) {
                            boolean z13 = tL_attachMenuBot.show_in_side_menu;
                            if (z13 && tL_attachMenuBot.show_in_attach_menu) {
                                a02 = org.telegram.messenger.hd.a0(null, null, 2131753138, a22.first_name);
                            } else if (z13) {
                                a02 = org.telegram.messenger.hd.a0(null, null, 2131753137, a22.first_name);
                            } else {
                                a02 = org.telegram.messenger.hd.a0(null, null, 2131753139, a22.first_name);
                            }
                            org.telegram.messenger.g0.i3(new kg.t1(6, x2Var, a02), 200L);
                        }
                    }
                }
            }
        }
    }
}
