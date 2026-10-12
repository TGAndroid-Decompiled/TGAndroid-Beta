package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class xx implements o70 {
    public final org.telegram.ui.ActionBar.a2 f41975a;
    public final yy f41976b;

    public xx(yy yyVar, org.telegram.ui.ActionBar.a2 a2Var) {
        this.f41976b = yyVar;
        this.f41975a = a2Var;
    }

    @Override
    public final void a(p70 p70Var, final long j10) {
        final org.telegram.ui.ActionBar.m2[] m2VarArr = {p70Var, null};
        Utilities.Callback callback = new Utilities.Callback(this) {
            public final xx f41096b;

            {
                this.f41096b = this;
            }

            @Override
            public final void run(Object obj) {
                Runnable runnable = (Runnable) obj;
                switch (r5) {
                    case 0:
                        yy yyVar = this.f41096b.f41976b;
                        Boolean bool = yyVar.G.has_username;
                        if (bool != null && bool.booleanValue()) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 1);
                            bundle.putLong("chat_id", j10);
                            bundle.putBoolean("forcePublic", yyVar.G.has_username.booleanValue());
                            sd sdVar = new sd(bundle);
                            sdVar.f40088t0 = new f5(runnable, 12);
                            yyVar.presentFragment(sdVar);
                            m2VarArr[1] = sdVar;
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        xx xxVar = this.f41096b;
                        yy yyVar2 = xxVar.f41976b;
                        yyVar2.N4(yyVar2.getMessagesController().getChat(Long.valueOf(j10)), runnable, new org.telegram.ui.Components.k31(27, xxVar, m2VarArr));
                        return;
                }
            }
        };
        Utilities.Callback callback2 = new Utilities.Callback(this) {
            public final xx f41096b;

            {
                this.f41096b = this;
            }

            @Override
            public final void run(Object obj) {
                Runnable runnable = (Runnable) obj;
                switch (r5) {
                    case 0:
                        yy yyVar = this.f41096b.f41976b;
                        Boolean bool = yyVar.G.has_username;
                        if (bool != null && bool.booleanValue()) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 1);
                            bundle.putLong("chat_id", j10);
                            bundle.putBoolean("forcePublic", yyVar.G.has_username.booleanValue());
                            sd sdVar = new sd(bundle);
                            sdVar.f40088t0 = new f5(runnable, 12);
                            yyVar.presentFragment(sdVar);
                            m2VarArr[1] = sdVar;
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        xx xxVar = this.f41096b;
                        yy yyVar2 = xxVar.f41976b;
                        yyVar2.N4(yyVar2.getMessagesController().getChat(Long.valueOf(j10)), runnable, new org.telegram.ui.Components.k31(27, xxVar, m2VarArr));
                        return;
                }
            }
        };
        org.telegram.ui.ActionBar.a2 a2Var = this.f41975a;
        Utilities.doCallbacks(callback, callback2, new pu(this, a2Var, j10, 1), new Utilities.Callback(this) {
            public final xx f41688b;

            {
                this.f41688b = this;
            }

            @Override
            public final void run(Object obj) {
                boolean z10;
                switch (r4) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        yy yyVar = this.f41688b.f41976b;
                        if (yyVar.G.bot_admin_rights != null) {
                            TLRPC.User user = yyVar.getMessagesController().getUser(Long.valueOf(yyVar.H));
                            MessagesController messagesController = yyVar.getMessagesController();
                            TLRPC.RequestPeerType requestPeerType = yyVar.G;
                            TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                            Boolean bool = requestPeerType.bot_participant;
                            if (bool != null && bool.booleanValue()) {
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                            boolean z11 = z10;
                            messagesController.setUserAdminRole(j10, user, tL_chatAdminRights, null, false, yyVar, z11, true, null, runnable, new tf(6, runnable));
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        Runnable runnable2 = (Runnable) obj;
                        yy yyVar2 = this.f41688b.f41976b;
                        if (yyVar2.G.user_admin_rights != null) {
                            MessagesController messagesController2 = yyVar2.getMessagesController();
                            long j11 = j10;
                            yyVar2.getMessagesController().setUserAdminRole(j11, yyVar2.getAccountInstance().getUserConfig().getCurrentUser(), tq.s0(messagesController2.getChat(Long.valueOf(j11)).admin_rights, yyVar2.G.user_admin_rights), null, false, yyVar2, false, true, null, runnable2, new tf(7, runnable2));
                            return;
                        }
                        runnable2.run();
                        return;
                }
            }
        }, new Utilities.Callback(this) {
            public final xx f41688b;

            {
                this.f41688b = this;
            }

            @Override
            public final void run(Object obj) {
                boolean z10;
                switch (r4) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        yy yyVar = this.f41688b.f41976b;
                        if (yyVar.G.bot_admin_rights != null) {
                            TLRPC.User user = yyVar.getMessagesController().getUser(Long.valueOf(yyVar.H));
                            MessagesController messagesController = yyVar.getMessagesController();
                            TLRPC.RequestPeerType requestPeerType = yyVar.G;
                            TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                            Boolean bool = requestPeerType.bot_participant;
                            if (bool != null && bool.booleanValue()) {
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                            boolean z11 = z10;
                            messagesController.setUserAdminRole(j10, user, tL_chatAdminRights, null, false, yyVar, z11, true, null, runnable, new tf(6, runnable));
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        Runnable runnable2 = (Runnable) obj;
                        yy yyVar2 = this.f41688b.f41976b;
                        if (yyVar2.G.user_admin_rights != null) {
                            MessagesController messagesController2 = yyVar2.getMessagesController();
                            long j11 = j10;
                            yyVar2.getMessagesController().setUserAdminRole(j11, yyVar2.getAccountInstance().getUserConfig().getCurrentUser(), tq.s0(messagesController2.getChat(Long.valueOf(j11)).admin_rights, yyVar2.G.user_admin_rights), null, false, yyVar2, false, true, null, runnable2, new tf(7, runnable2));
                            return;
                        }
                        runnable2.run();
                        return;
                }
            }
        }, new bi.i(this, a2Var, j10, m2VarArr, 4));
    }
}
