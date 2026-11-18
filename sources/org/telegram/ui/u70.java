package org.telegram.ui;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.tgnet.TLRPC;
public final class u70 implements Runnable {
    public final LaunchActivity f52459a;
    public final org.telegram.ui.ActionBar.h2 f52460b;
    public final int f52461c;
    public final TLRPC.User d;
    public final TLRPC.TL_messages_botApp f52462e;
    public final AtomicBoolean f52463f;
    public final String h;
    public final boolean f52464n;
    public final boolean f52465r;
    public final boolean f52466s;
    public final boolean f52467w;

    public u70(LaunchActivity launchActivity, org.telegram.ui.ActionBar.h2 h2Var, int i7, TLRPC.User user, TLRPC.TL_messages_botApp tL_messages_botApp, AtomicBoolean atomicBoolean, String str, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f52459a = launchActivity;
        this.f52460b = h2Var;
        this.f52461c = i7;
        this.d = user;
        this.f52462e = tL_messages_botApp;
        this.f52463f = atomicBoolean;
        this.h = str;
        this.f52464n = z10;
        this.f52465r = z11;
        this.f52466s = z12;
        this.f52467w = z13;
    }

    @Override
    public final void run() {
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        String a02;
        String str = LaunchActivity.C1;
        org.telegram.ui.ActionBar.h2 h2Var = this.f52460b;
        if (h2Var != null && LaunchActivity.E1) {
            LaunchActivity launchActivity = this.f52459a;
            if (!launchActivity.isFinishing() && !launchActivity.isDestroyed()) {
                TLRPC.User user = this.d;
                long j3 = user.f28554id;
                TLRPC.TL_messages_botApp tL_messages_botApp = this.f52462e;
                TLRPC.BotApp botApp = tL_messages_botApp.app;
                boolean z10 = this.f52463f.get();
                int i7 = this.f52461c;
                String str2 = this.h;
                boolean z11 = this.f52464n;
                boolean z12 = this.f52465r;
                ki.f4 b10 = ki.f4.b(i7, j3, j3, null, null, 3, 0, 0L, botApp, z10, str2, user, 0, z11, z12);
                if (launchActivity.N() == null || launchActivity.N().k(b10) == null) {
                    org.telegram.messenger.c6.p(launchActivity.P, user.f28554id);
                    ki.t2 t2Var = new ki.t2(launchActivity, h2Var.getResourceProvider());
                    ki.l2 l2Var = t2Var.E;
                    if (l2Var != null) {
                        l2Var.setWasOpenedByLinkIntent(this.f52466s);
                    }
                    t2Var.B(!z11);
                    if (z12) {
                        t2Var.C(true, false, t2Var.f18932g0);
                    }
                    t2Var.C0 = false;
                    t2Var.m0 = launchActivity;
                    t2Var.x(h2Var, b10);
                    t2Var.show();
                    if (tL_messages_botApp.inactive || this.f52467w) {
                        TLRPC.User c22 = org.telegram.messenger.mp.u1(t2Var.I).c2(Long.valueOf(t2Var.J));
                        ArrayList<TLRPC.TL_attachMenuBot> arrayList = org.telegram.messenger.ri.d0(t2Var.I).f26601b.bots;
                        int size = arrayList.size();
                        int i10 = 0;
                        while (true) {
                            if (i10 < size) {
                                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList.get(i10);
                                i10++;
                                tL_attachMenuBot = tL_attachMenuBot2;
                                if (tL_attachMenuBot.bot_id == t2Var.J) {
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
                                a02 = org.telegram.messenger.gd.a0(null, null, 2131753136, c22.first_name);
                            } else if (z13) {
                                a02 = org.telegram.messenger.gd.a0(null, null, 2131753135, c22.first_name);
                            } else {
                                a02 = org.telegram.messenger.gd.a0(null, null, 2131753137, c22.first_name);
                            }
                            org.telegram.messenger.g0.h3(new kg.h0(9, t2Var, a02), 200L);
                        }
                    }
                }
            }
        }
    }
}
