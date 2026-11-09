package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class zv implements e50 {
    public final org.telegram.ui.ActionBar.u1 f52677a;
    public final yw f52678b;

    public zv(yw ywVar, org.telegram.ui.ActionBar.u1 u1Var) {
        this.f52678b = ywVar;
        this.f52677a = u1Var;
    }

    @Override
    public final void e(f50 f50Var, final long j3) {
        final org.telegram.ui.ActionBar.f2[] f2VarArr = {f50Var, null};
        org.telegram.messenger.c20 c20Var = new org.telegram.messenger.c20(this) {
            public final zv f51768b;

            {
                this.f51768b = this;
            }

            @Override
            public final void a(Object obj) {
                Runnable runnable = (Runnable) obj;
                switch (r5) {
                    case 0:
                        yw ywVar = this.f51768b.f52678b;
                        Boolean bool = ywVar.G.has_username;
                        if (bool != null && bool.booleanValue()) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 1);
                            bundle.putLong("chat_id", j3);
                            bundle.putBoolean("forcePublic", ywVar.G.has_username.booleanValue());
                            bd bdVar = new bd(bundle);
                            bdVar.f44006u0 = new a5(runnable, 12);
                            ywVar.presentFragment(bdVar);
                            f2VarArr[1] = bdVar;
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        zv zvVar = this.f51768b;
                        yw ywVar2 = zvVar.f52678b;
                        ywVar2.c5(ywVar2.getMessagesController().M0(Long.valueOf(j3)), runnable, new org.telegram.ui.Components.m51(16, zvVar, f2VarArr));
                        return;
                }
            }
        };
        org.telegram.messenger.c20 c20Var2 = new org.telegram.messenger.c20(this) {
            public final zv f51768b;

            {
                this.f51768b = this;
            }

            @Override
            public final void a(Object obj) {
                Runnable runnable = (Runnable) obj;
                switch (r5) {
                    case 0:
                        yw ywVar = this.f51768b.f52678b;
                        Boolean bool = ywVar.G.has_username;
                        if (bool != null && bool.booleanValue()) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 1);
                            bundle.putLong("chat_id", j3);
                            bundle.putBoolean("forcePublic", ywVar.G.has_username.booleanValue());
                            bd bdVar = new bd(bundle);
                            bdVar.f44006u0 = new a5(runnable, 12);
                            ywVar.presentFragment(bdVar);
                            f2VarArr[1] = bdVar;
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        zv zvVar = this.f51768b;
                        yw ywVar2 = zvVar.f52678b;
                        ywVar2.c5(ywVar2.getMessagesController().M0(Long.valueOf(j3)), runnable, new org.telegram.ui.Components.m51(16, zvVar, f2VarArr));
                        return;
                }
            }
        };
        org.telegram.ui.ActionBar.u1 u1Var = this.f52677a;
        Utilities.u(0, c20Var, c20Var2, new bi.b2(this, u1Var, j3, 2), new org.telegram.messenger.c20(this) {
            public final zv f52197b;

            {
                this.f52197b = this;
            }

            @Override
            public final void a(Object obj) {
                boolean z9;
                switch (r4) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        yw ywVar = this.f52197b.f52678b;
                        if (ywVar.G.bot_admin_rights != null) {
                            TLRPC.User a22 = ywVar.getMessagesController().a2(Long.valueOf(ywVar.H));
                            org.telegram.messenger.qp messagesController = ywVar.getMessagesController();
                            TLRPC.RequestPeerType requestPeerType = ywVar.G;
                            TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                            Boolean bool = requestPeerType.bot_participant;
                            if (bool != null && bool.booleanValue()) {
                                z9 = false;
                            } else {
                                z9 = true;
                            }
                            boolean z10 = z9;
                            messagesController.P4(j3, a22, tL_chatAdminRights, null, false, ywVar, z10, true, null, runnable, new ve(8, runnable));
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        Runnable runnable2 = (Runnable) obj;
                        yw ywVar2 = this.f52197b.f52678b;
                        if (ywVar2.G.user_admin_rights != null) {
                            org.telegram.messenger.qp messagesController2 = ywVar2.getMessagesController();
                            long j10 = j3;
                            ywVar2.getMessagesController().P4(j10, org.telegram.messenger.p10.i(ywVar2.getAccountInstance().f21765a).f(), mp.x0(messagesController2.M0(Long.valueOf(j10)).admin_rights, ywVar2.G.user_admin_rights), null, false, ywVar2, false, true, null, runnable2, new ve(7, runnable2));
                            return;
                        }
                        runnable2.run();
                        return;
                }
            }
        }, new org.telegram.messenger.c20(this) {
            public final zv f52197b;

            {
                this.f52197b = this;
            }

            @Override
            public final void a(Object obj) {
                boolean z9;
                switch (r4) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        yw ywVar = this.f52197b.f52678b;
                        if (ywVar.G.bot_admin_rights != null) {
                            TLRPC.User a22 = ywVar.getMessagesController().a2(Long.valueOf(ywVar.H));
                            org.telegram.messenger.qp messagesController = ywVar.getMessagesController();
                            TLRPC.RequestPeerType requestPeerType = ywVar.G;
                            TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                            Boolean bool = requestPeerType.bot_participant;
                            if (bool != null && bool.booleanValue()) {
                                z9 = false;
                            } else {
                                z9 = true;
                            }
                            boolean z10 = z9;
                            messagesController.P4(j3, a22, tL_chatAdminRights, null, false, ywVar, z10, true, null, runnable, new ve(8, runnable));
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        Runnable runnable2 = (Runnable) obj;
                        yw ywVar2 = this.f52197b.f52678b;
                        if (ywVar2.G.user_admin_rights != null) {
                            org.telegram.messenger.qp messagesController2 = ywVar2.getMessagesController();
                            long j10 = j3;
                            ywVar2.getMessagesController().P4(j10, org.telegram.messenger.p10.i(ywVar2.getAccountInstance().f21765a).f(), mp.x0(messagesController2.M0(Long.valueOf(j10)).admin_rights, ywVar2.G.user_admin_rights), null, false, ywVar2, false, true, null, runnable2, new ve(7, runnable2));
                            return;
                        }
                        runnable2.run();
                        return;
                }
            }
        }, new bi.r2(this, u1Var, j3, f2VarArr, 5));
    }
}
