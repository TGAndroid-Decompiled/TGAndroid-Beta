package org.telegram.ui;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLRPC;
public final class t80 implements Runnable {
    public final LaunchActivity f41576a;
    public final org.telegram.ui.ActionBar.k2 f41577b;
    public final int f41578c;
    public final TLRPC.User d;
    public final TLRPC.TL_messages_botApp e;
    public final AtomicBoolean f41579f;
    public final String h;
    public final boolean f41580n;
    public final boolean f41581r;
    public final boolean f41582s;
    public final boolean f41583w;

    public t80(LaunchActivity launchActivity, org.telegram.ui.ActionBar.k2 k2Var, int i10, TLRPC.User user, TLRPC.TL_messages_botApp tL_messages_botApp, AtomicBoolean atomicBoolean, String str, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f41576a = launchActivity;
        this.f41577b = k2Var;
        this.f41578c = i10;
        this.d = user;
        this.e = tL_messages_botApp;
        this.f41579f = atomicBoolean;
        this.h = str;
        this.f41580n = z10;
        this.f41581r = z11;
        this.f41582s = z12;
        this.f41583w = z13;
    }

    @Override
    public final void run() {
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        String a02;
        Pattern pattern = LaunchActivity.D1;
        org.telegram.ui.ActionBar.k2 k2Var = this.f41577b;
        if (k2Var != null && LaunchActivity.E1) {
            LaunchActivity launchActivity = this.f41576a;
            if (!launchActivity.isFinishing() && !launchActivity.isDestroyed()) {
                TLRPC.User user = this.d;
                long j10 = user.f19943id;
                TLRPC.TL_messages_botApp tL_messages_botApp = this.e;
                TLRPC.BotApp botApp = tL_messages_botApp.app;
                boolean z10 = this.f41579f.get();
                int i10 = this.f41578c;
                String str = this.h;
                boolean z11 = this.f41580n;
                boolean z12 = this.f41581r;
                xh.t3 b10 = xh.t3.b(i10, j10, j10, null, null, 3, 0, 0L, botApp, z10, str, user, 0, z11, z12);
                if (launchActivity.N() == null || launchActivity.N().m(b10) == null) {
                    org.telegram.messenger.ks.o(launchActivity.O, user.f19943id);
                    xh.m2 m2Var = new xh.m2(launchActivity, k2Var.getResourceProvider());
                    xh.e2 e2Var = m2Var.D;
                    if (e2Var != null) {
                        e2Var.setWasOpenedByLinkIntent(this.f41582s);
                    }
                    m2Var.B(!z11);
                    if (z12) {
                        m2Var.C(true, false, m2Var.f53900f0);
                    }
                    m2Var.B0 = false;
                    m2Var.f53906l0 = launchActivity;
                    m2Var.x(k2Var, b10);
                    m2Var.show();
                    if (tL_messages_botApp.inactive || this.f41583w) {
                        TLRPC.User Z1 = org.telegram.messenger.wp.r1(m2Var.H).Z1(Long.valueOf(m2Var.I));
                        ArrayList<TLRPC.TL_attachMenuBot> arrayList = org.telegram.messenger.vi.b0(m2Var.H).f18636b.bots;
                        int size = arrayList.size();
                        int i11 = 0;
                        while (true) {
                            if (i11 < size) {
                                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList.get(i11);
                                i11++;
                                tL_attachMenuBot = tL_attachMenuBot2;
                                if (tL_attachMenuBot.bot_id == m2Var.I) {
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
                                a02 = org.telegram.messenger.dd.a0(null, null, 2131753138, Z1.first_name);
                            } else if (z13) {
                                a02 = org.telegram.messenger.dd.a0(null, null, 2131753137, Z1.first_name);
                            } else {
                                a02 = org.telegram.messenger.dd.a0(null, null, 2131753139, Z1.first_name);
                            }
                            org.telegram.messenger.i0.h3(new vh.r0(26, m2Var, a02), 200L);
                        }
                    }
                }
            }
        }
    }
}
