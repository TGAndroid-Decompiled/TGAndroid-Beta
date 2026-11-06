package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class xv implements c50 {
    public final org.telegram.ui.ActionBar.u1 f51991a;
    public final ww f51992b;

    public xv(ww wwVar, org.telegram.ui.ActionBar.u1 u1Var) {
        this.f51992b = wwVar;
        this.f51991a = u1Var;
    }

    @Override
    public final void e(d50 d50Var, final long j3) {
        final org.telegram.ui.ActionBar.f2[] f2VarArr = {d50Var, null};
        org.telegram.messenger.c20 c20Var = new org.telegram.messenger.c20(this) {
            public final xv f50835b;

            {
                this.f50835b = this;
            }

            @Override
            public final void a(Object obj) {
                Runnable runnable = (Runnable) obj;
                switch (r5) {
                    case 0:
                        ww wwVar = this.f50835b.f51992b;
                        Boolean bool = wwVar.G.has_username;
                        if (bool != null && bool.booleanValue()) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 1);
                            bundle.putLong("chat_id", j3);
                            bundle.putBoolean("forcePublic", wwVar.G.has_username.booleanValue());
                            bd bdVar = new bd(bundle);
                            bdVar.f44278u0 = new a5(runnable, 12);
                            wwVar.presentFragment(bdVar);
                            f2VarArr[1] = bdVar;
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        xv xvVar = this.f50835b;
                        ww wwVar2 = xvVar.f51992b;
                        wwVar2.c5(wwVar2.getMessagesController().M0(Long.valueOf(j3)), runnable, new org.telegram.ui.Components.k51(16, xvVar, f2VarArr));
                        return;
                }
            }
        };
        org.telegram.messenger.c20 c20Var2 = new org.telegram.messenger.c20(this) {
            public final xv f50835b;

            {
                this.f50835b = this;
            }

            @Override
            public final void a(Object obj) {
                Runnable runnable = (Runnable) obj;
                switch (r5) {
                    case 0:
                        ww wwVar = this.f50835b.f51992b;
                        Boolean bool = wwVar.G.has_username;
                        if (bool != null && bool.booleanValue()) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 1);
                            bundle.putLong("chat_id", j3);
                            bundle.putBoolean("forcePublic", wwVar.G.has_username.booleanValue());
                            bd bdVar = new bd(bundle);
                            bdVar.f44278u0 = new a5(runnable, 12);
                            wwVar.presentFragment(bdVar);
                            f2VarArr[1] = bdVar;
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        xv xvVar = this.f50835b;
                        ww wwVar2 = xvVar.f51992b;
                        wwVar2.c5(wwVar2.getMessagesController().M0(Long.valueOf(j3)), runnable, new org.telegram.ui.Components.k51(16, xvVar, f2VarArr));
                        return;
                }
            }
        };
        org.telegram.ui.ActionBar.u1 u1Var = this.f51991a;
        Utilities.u(0, c20Var, c20Var2, new bi.b2(this, u1Var, j3, 2), new org.telegram.messenger.c20(this) {
            public final xv f51516b;

            {
                this.f51516b = this;
            }

            @Override
            public final void a(Object obj) {
                boolean z9;
                switch (r4) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        ww wwVar = this.f51516b.f51992b;
                        if (wwVar.G.bot_admin_rights != null) {
                            TLRPC.User a22 = wwVar.getMessagesController().a2(Long.valueOf(wwVar.H));
                            org.telegram.messenger.qp messagesController = wwVar.getMessagesController();
                            TLRPC.RequestPeerType requestPeerType = wwVar.G;
                            TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                            Boolean bool = requestPeerType.bot_participant;
                            if (bool != null && bool.booleanValue()) {
                                z9 = false;
                            } else {
                                z9 = true;
                            }
                            boolean z10 = z9;
                            messagesController.P4(j3, a22, tL_chatAdminRights, null, false, wwVar, z10, true, null, runnable, new ve(8, runnable));
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        Runnable runnable2 = (Runnable) obj;
                        ww wwVar2 = this.f51516b.f51992b;
                        if (wwVar2.G.user_admin_rights != null) {
                            org.telegram.messenger.qp messagesController2 = wwVar2.getMessagesController();
                            long j10 = j3;
                            wwVar2.getMessagesController().P4(j10, org.telegram.messenger.p10.i(wwVar2.getAccountInstance().f21723a).f(), kp.x0(messagesController2.M0(Long.valueOf(j10)).admin_rights, wwVar2.G.user_admin_rights), null, false, wwVar2, false, true, null, runnable2, new ve(7, runnable2));
                            return;
                        }
                        runnable2.run();
                        return;
                }
            }
        }, new org.telegram.messenger.c20(this) {
            public final xv f51516b;

            {
                this.f51516b = this;
            }

            @Override
            public final void a(Object obj) {
                boolean z9;
                switch (r4) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        ww wwVar = this.f51516b.f51992b;
                        if (wwVar.G.bot_admin_rights != null) {
                            TLRPC.User a22 = wwVar.getMessagesController().a2(Long.valueOf(wwVar.H));
                            org.telegram.messenger.qp messagesController = wwVar.getMessagesController();
                            TLRPC.RequestPeerType requestPeerType = wwVar.G;
                            TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                            Boolean bool = requestPeerType.bot_participant;
                            if (bool != null && bool.booleanValue()) {
                                z9 = false;
                            } else {
                                z9 = true;
                            }
                            boolean z10 = z9;
                            messagesController.P4(j3, a22, tL_chatAdminRights, null, false, wwVar, z10, true, null, runnable, new ve(8, runnable));
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        Runnable runnable2 = (Runnable) obj;
                        ww wwVar2 = this.f51516b.f51992b;
                        if (wwVar2.G.user_admin_rights != null) {
                            org.telegram.messenger.qp messagesController2 = wwVar2.getMessagesController();
                            long j10 = j3;
                            wwVar2.getMessagesController().P4(j10, org.telegram.messenger.p10.i(wwVar2.getAccountInstance().f21723a).f(), kp.x0(messagesController2.M0(Long.valueOf(j10)).admin_rights, wwVar2.G.user_admin_rights), null, false, wwVar2, false, true, null, runnable2, new ve(7, runnable2));
                            return;
                        }
                        runnable2.run();
                        return;
                }
            }
        }, new bi.r2(this, u1Var, j3, f2VarArr, 5));
    }
}
