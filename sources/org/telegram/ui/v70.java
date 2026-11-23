package org.telegram.ui;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.tgnet.TLRPC;
public final class v70 implements Runnable {
    public final LaunchActivity f52746a;
    public final org.telegram.ui.ActionBar.g2 f52747b;
    public final int f52748c;
    public final TLRPC.User d;
    public final TLRPC.TL_messages_botApp f52749e;
    public final AtomicBoolean f52750f;
    public final String h;
    public final boolean f52751n;
    public final boolean f52752r;
    public final boolean f52753s;
    public final boolean f52754w;

    public v70(LaunchActivity launchActivity, org.telegram.ui.ActionBar.g2 g2Var, int i7, TLRPC.User user, TLRPC.TL_messages_botApp tL_messages_botApp, AtomicBoolean atomicBoolean, String str, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f52746a = launchActivity;
        this.f52747b = g2Var;
        this.f52748c = i7;
        this.d = user;
        this.f52749e = tL_messages_botApp;
        this.f52750f = atomicBoolean;
        this.h = str;
        this.f52751n = z10;
        this.f52752r = z11;
        this.f52753s = z12;
        this.f52754w = z13;
    }

    @Override
    public final void run() {
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        String a02;
        String str = LaunchActivity.C1;
        org.telegram.ui.ActionBar.g2 g2Var = this.f52747b;
        if (g2Var != null && LaunchActivity.E1) {
            LaunchActivity launchActivity = this.f52746a;
            if (!launchActivity.isFinishing() && !launchActivity.isDestroyed()) {
                TLRPC.User user = this.d;
                long j3 = user.f28583id;
                TLRPC.TL_messages_botApp tL_messages_botApp = this.f52749e;
                TLRPC.BotApp botApp = tL_messages_botApp.app;
                boolean z10 = this.f52750f.get();
                int i7 = this.f52748c;
                String str2 = this.h;
                boolean z11 = this.f52751n;
                boolean z12 = this.f52752r;
                ki.e4 b10 = ki.e4.b(i7, j3, j3, null, null, 3, 0, 0L, botApp, z10, str2, user, 0, z11, z12);
                if (launchActivity.N() == null || launchActivity.N().k(b10) == null) {
                    org.telegram.messenger.c6.p(launchActivity.P, user.f28583id);
                    ki.s2 s2Var = new ki.s2(launchActivity, g2Var.getResourceProvider());
                    ki.k2 k2Var = s2Var.E;
                    if (k2Var != null) {
                        k2Var.setWasOpenedByLinkIntent(this.f52753s);
                    }
                    s2Var.B(!z11);
                    if (z12) {
                        s2Var.C(true, false, s2Var.f18942g0);
                    }
                    s2Var.C0 = false;
                    s2Var.m0 = launchActivity;
                    s2Var.x(g2Var, b10);
                    s2Var.show();
                    if (tL_messages_botApp.inactive || this.f52754w) {
                        TLRPC.User c22 = org.telegram.messenger.np.u1(s2Var.I).c2(Long.valueOf(s2Var.J));
                        ArrayList<TLRPC.TL_attachMenuBot> arrayList = org.telegram.messenger.si.d0(s2Var.I).f26813b.bots;
                        int size = arrayList.size();
                        int i10 = 0;
                        while (true) {
                            if (i10 < size) {
                                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList.get(i10);
                                i10++;
                                tL_attachMenuBot = tL_attachMenuBot2;
                                if (tL_attachMenuBot.bot_id == s2Var.J) {
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
                                a02 = org.telegram.messenger.hd.a0(null, null, 2131753135, c22.first_name);
                            } else if (z13) {
                                a02 = org.telegram.messenger.hd.a0(null, null, 2131753134, c22.first_name);
                            } else {
                                a02 = org.telegram.messenger.hd.a0(null, null, 2131753136, c22.first_name);
                            }
                            org.telegram.messenger.g0.h3(new ji.i(11, s2Var, a02), 200L);
                        }
                    }
                }
            }
        }
    }
}
