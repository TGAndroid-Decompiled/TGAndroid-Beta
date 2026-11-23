package org.telegram.ui;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.tgnet.TLRPC;
public final class u70 implements Runnable {
    public final LaunchActivity f52567a;
    public final org.telegram.ui.ActionBar.g2 f52568b;
    public final int f52569c;
    public final TLRPC.User d;
    public final TLRPC.TL_messages_botApp f52570e;
    public final AtomicBoolean f52571f;
    public final String h;
    public final boolean f52572n;
    public final boolean f52573r;
    public final boolean f52574s;
    public final boolean f52575w;

    public u70(LaunchActivity launchActivity, org.telegram.ui.ActionBar.g2 g2Var, int i7, TLRPC.User user, TLRPC.TL_messages_botApp tL_messages_botApp, AtomicBoolean atomicBoolean, String str, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f52567a = launchActivity;
        this.f52568b = g2Var;
        this.f52569c = i7;
        this.d = user;
        this.f52570e = tL_messages_botApp;
        this.f52571f = atomicBoolean;
        this.h = str;
        this.f52572n = z10;
        this.f52573r = z11;
        this.f52574s = z12;
        this.f52575w = z13;
    }

    @Override
    public final void run() {
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        String a02;
        String str = LaunchActivity.C1;
        org.telegram.ui.ActionBar.g2 g2Var = this.f52568b;
        if (g2Var != null && LaunchActivity.E1) {
            LaunchActivity launchActivity = this.f52567a;
            if (!launchActivity.isFinishing() && !launchActivity.isDestroyed()) {
                TLRPC.User user = this.d;
                long j3 = user.f28641id;
                TLRPC.TL_messages_botApp tL_messages_botApp = this.f52570e;
                TLRPC.BotApp botApp = tL_messages_botApp.app;
                boolean z10 = this.f52571f.get();
                int i7 = this.f52569c;
                String str2 = this.h;
                boolean z11 = this.f52572n;
                boolean z12 = this.f52573r;
                ki.f4 b10 = ki.f4.b(i7, j3, j3, null, null, 3, 0, 0L, botApp, z10, str2, user, 0, z11, z12);
                if (launchActivity.N() == null || launchActivity.N().k(b10) == null) {
                    org.telegram.messenger.c6.p(launchActivity.P, user.f28641id);
                    ki.t2 t2Var = new ki.t2(launchActivity, g2Var.getResourceProvider());
                    ki.k2 k2Var = t2Var.E;
                    if (k2Var != null) {
                        k2Var.setWasOpenedByLinkIntent(this.f52574s);
                    }
                    t2Var.B(!z11);
                    if (z12) {
                        t2Var.C(true, false, t2Var.f19027g0);
                    }
                    t2Var.C0 = false;
                    t2Var.m0 = launchActivity;
                    t2Var.x(g2Var, b10);
                    t2Var.show();
                    if (tL_messages_botApp.inactive || this.f52575w) {
                        TLRPC.User c22 = org.telegram.messenger.mp.u1(t2Var.I).c2(Long.valueOf(t2Var.J));
                        ArrayList<TLRPC.TL_attachMenuBot> arrayList = org.telegram.messenger.ri.d0(t2Var.I).f26700b.bots;
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
                                a02 = org.telegram.messenger.gd.a0(null, null, 2131753135, c22.first_name);
                            } else if (z13) {
                                a02 = org.telegram.messenger.gd.a0(null, null, 2131753134, c22.first_name);
                            } else {
                                a02 = org.telegram.messenger.gd.a0(null, null, 2131753136, c22.first_name);
                            }
                            org.telegram.messenger.g0.h3(new ji.f(13, t2Var, a02), 200L);
                        }
                    }
                }
            }
        }
    }
}
