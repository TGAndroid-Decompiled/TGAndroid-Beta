package org.telegram.ui;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.tgnet.TLRPC;
public final class w70 implements Runnable {
    public final LaunchActivity f50893a;
    public final org.telegram.ui.ActionBar.f2 f50894b;
    public final int f50895c;
    public final TLRPC.User d;
    public final TLRPC.TL_messages_botApp f50896e;
    public final AtomicBoolean f50897f;
    public final String h;
    public final boolean f50898n;
    public final boolean f50899r;
    public final boolean f50900s;
    public final boolean f50901w;

    public w70(LaunchActivity launchActivity, org.telegram.ui.ActionBar.f2 f2Var, int i7, TLRPC.User user, TLRPC.TL_messages_botApp tL_messages_botApp, AtomicBoolean atomicBoolean, String str, boolean z9, boolean z10, boolean z11, boolean z12) {
        this.f50893a = launchActivity;
        this.f50894b = f2Var;
        this.f50895c = i7;
        this.d = user;
        this.f50896e = tL_messages_botApp;
        this.f50897f = atomicBoolean;
        this.h = str;
        this.f50898n = z9;
        this.f50899r = z10;
        this.f50900s = z11;
        this.f50901w = z12;
    }

    @Override
    public final void run() {
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        String a02;
        String str = LaunchActivity.B1;
        org.telegram.ui.ActionBar.f2 f2Var = this.f50894b;
        if (f2Var != null && LaunchActivity.D1) {
            LaunchActivity launchActivity = this.f50893a;
            if (!launchActivity.isFinishing() && !launchActivity.isDestroyed()) {
                TLRPC.User user = this.d;
                long j3 = user.f27105id;
                TLRPC.TL_messages_botApp tL_messages_botApp = this.f50896e;
                TLRPC.BotApp botApp = tL_messages_botApp.app;
                boolean z9 = this.f50897f.get();
                int i7 = this.f50895c;
                String str2 = this.h;
                boolean z10 = this.f50898n;
                boolean z11 = this.f50899r;
                hi.q4 b10 = hi.q4.b(i7, j3, j3, null, null, 3, 0, 0L, botApp, z9, str2, user, 0, z10, z11);
                if (launchActivity.O() == null || launchActivity.O().k(b10) == null) {
                    org.telegram.messenger.b6.n(launchActivity.O, user.f27105id);
                    hi.a3 a3Var = new hi.a3(launchActivity, f2Var.getResourceProvider());
                    hi.s2 s2Var = a3Var.D;
                    if (s2Var != null) {
                        s2Var.setWasOpenedByLinkIntent(this.f50900s);
                    }
                    a3Var.B(!z10);
                    if (z11) {
                        a3Var.C(true, false, a3Var.f14520f0);
                    }
                    a3Var.B0 = false;
                    a3Var.f14526l0 = launchActivity;
                    a3Var.x(f2Var, b10);
                    a3Var.show();
                    if (tL_messages_botApp.inactive || this.f50901w) {
                        TLRPC.User a22 = org.telegram.messenger.qp.s1(a3Var.H).a2(Long.valueOf(a3Var.I));
                        ArrayList<TLRPC.TL_attachMenuBot> arrayList = org.telegram.messenger.ui.b0(a3Var.H).f25802b.bots;
                        int size = arrayList.size();
                        int i10 = 0;
                        while (true) {
                            if (i10 < size) {
                                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList.get(i10);
                                i10++;
                                tL_attachMenuBot = tL_attachMenuBot2;
                                if (tL_attachMenuBot.bot_id == a3Var.I) {
                                    break;
                                }
                            } else {
                                tL_attachMenuBot = null;
                                break;
                            }
                        }
                        if (tL_attachMenuBot != null) {
                            boolean z12 = tL_attachMenuBot.show_in_side_menu;
                            if (z12 && tL_attachMenuBot.show_in_attach_menu) {
                                a02 = org.telegram.messenger.id.a0(null, null, 2131753138, a22.first_name);
                            } else if (z12) {
                                a02 = org.telegram.messenger.id.a0(null, null, 2131753137, a22.first_name);
                            } else {
                                a02 = org.telegram.messenger.id.a0(null, null, 2131753139, a22.first_name);
                            }
                            org.telegram.messenger.g0.i3(new ha.b(4, a3Var, a02), 200L);
                        }
                    }
                }
            }
        }
    }
}
