package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class ux implements k70 {
    public final org.telegram.ui.ActionBar.a2 f42606a;
    public final vy f42607b;

    public ux(vy vyVar, org.telegram.ui.ActionBar.a2 a2Var) {
        this.f42607b = vyVar;
        this.f42606a = a2Var;
    }

    @Override
    public final void a(l70 l70Var, final long j3) {
        final org.telegram.ui.ActionBar.m2[] m2VarArr = {l70Var, null};
        Utilities.Callback callback = new Utilities.Callback(this) {
            public final ux f42021b;

            {
                this.f42021b = this;
            }

            @Override
            public final void run(Object obj) {
                Runnable runnable = (Runnable) obj;
                switch (r5) {
                    case 0:
                        vy vyVar = this.f42021b.f42607b;
                        Boolean bool = vyVar.G.has_username;
                        if (bool != null && bool.booleanValue()) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 1);
                            bundle.putLong("chat_id", j3);
                            bundle.putBoolean("forcePublic", vyVar.G.has_username.booleanValue());
                            qd qdVar = new qd(bundle);
                            qdVar.f41300t0 = new e5(runnable, 12);
                            vyVar.presentFragment(qdVar);
                            m2VarArr[1] = qdVar;
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        ux uxVar = this.f42021b;
                        vy vyVar2 = uxVar.f42607b;
                        vyVar2.N4(vyVar2.getMessagesController().getChat(Long.valueOf(j3)), runnable, new org.telegram.ui.Components.voip.p(14, uxVar, m2VarArr));
                        return;
                }
            }
        };
        Utilities.Callback callback2 = new Utilities.Callback(this) {
            public final ux f42021b;

            {
                this.f42021b = this;
            }

            @Override
            public final void run(Object obj) {
                Runnable runnable = (Runnable) obj;
                switch (r5) {
                    case 0:
                        vy vyVar = this.f42021b.f42607b;
                        Boolean bool = vyVar.G.has_username;
                        if (bool != null && bool.booleanValue()) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 1);
                            bundle.putLong("chat_id", j3);
                            bundle.putBoolean("forcePublic", vyVar.G.has_username.booleanValue());
                            qd qdVar = new qd(bundle);
                            qdVar.f41300t0 = new e5(runnable, 12);
                            vyVar.presentFragment(qdVar);
                            m2VarArr[1] = qdVar;
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        ux uxVar = this.f42021b;
                        vy vyVar2 = uxVar.f42607b;
                        vyVar2.N4(vyVar2.getMessagesController().getChat(Long.valueOf(j3)), runnable, new org.telegram.ui.Components.voip.p(14, uxVar, m2VarArr));
                        return;
                }
            }
        };
        org.telegram.ui.ActionBar.a2 a2Var = this.f42606a;
        Utilities.doCallbacks(callback, callback2, new mu(this, a2Var, j3, 1), new Utilities.Callback(this) {
            public final ux f42308b;

            {
                this.f42308b = this;
            }

            @Override
            public final void run(Object obj) {
                boolean z10;
                switch (r4) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        vy vyVar = this.f42308b.f42607b;
                        if (vyVar.G.bot_admin_rights != null) {
                            TLRPC.User user = vyVar.getMessagesController().getUser(Long.valueOf(vyVar.H));
                            MessagesController messagesController = vyVar.getMessagesController();
                            TLRPC.RequestPeerType requestPeerType = vyVar.G;
                            TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                            Boolean bool = requestPeerType.bot_participant;
                            if (bool != null && bool.booleanValue()) {
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                            boolean z11 = z10;
                            messagesController.setUserAdminRole(j3, user, tL_chatAdminRights, null, false, vyVar, z11, true, null, runnable, new sf(6, runnable));
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        Runnable runnable2 = (Runnable) obj;
                        vy vyVar2 = this.f42308b.f42607b;
                        if (vyVar2.G.user_admin_rights != null) {
                            MessagesController messagesController2 = vyVar2.getMessagesController();
                            long j10 = j3;
                            vyVar2.getMessagesController().setUserAdminRole(j10, vyVar2.getAccountInstance().getUserConfig().getCurrentUser(), qq.s0(messagesController2.getChat(Long.valueOf(j10)).admin_rights, vyVar2.G.user_admin_rights), null, false, vyVar2, false, true, null, runnable2, new sf(7, runnable2));
                            return;
                        }
                        runnable2.run();
                        return;
                }
            }
        }, new Utilities.Callback(this) {
            public final ux f42308b;

            {
                this.f42308b = this;
            }

            @Override
            public final void run(Object obj) {
                boolean z10;
                switch (r4) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        vy vyVar = this.f42308b.f42607b;
                        if (vyVar.G.bot_admin_rights != null) {
                            TLRPC.User user = vyVar.getMessagesController().getUser(Long.valueOf(vyVar.H));
                            MessagesController messagesController = vyVar.getMessagesController();
                            TLRPC.RequestPeerType requestPeerType = vyVar.G;
                            TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                            Boolean bool = requestPeerType.bot_participant;
                            if (bool != null && bool.booleanValue()) {
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                            boolean z11 = z10;
                            messagesController.setUserAdminRole(j3, user, tL_chatAdminRights, null, false, vyVar, z11, true, null, runnable, new sf(6, runnable));
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        Runnable runnable2 = (Runnable) obj;
                        vy vyVar2 = this.f42308b.f42607b;
                        if (vyVar2.G.user_admin_rights != null) {
                            MessagesController messagesController2 = vyVar2.getMessagesController();
                            long j10 = j3;
                            vyVar2.getMessagesController().setUserAdminRole(j10, vyVar2.getAccountInstance().getUserConfig().getCurrentUser(), qq.s0(messagesController2.getChat(Long.valueOf(j10)).admin_rights, vyVar2.G.user_admin_rights), null, false, vyVar2, false, true, null, runnable2, new sf(7, runnable2));
                            return;
                        }
                        runnable2.run();
                        return;
                }
            }
        }, new ai.l(this, a2Var, j3, m2VarArr, 4));
    }
}
