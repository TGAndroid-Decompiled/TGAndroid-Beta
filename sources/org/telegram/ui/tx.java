package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class tx implements k70 {
    public final org.telegram.ui.ActionBar.b2 f37750a;
    public final uy f37751b;

    public tx(uy uyVar, org.telegram.ui.ActionBar.b2 b2Var) {
        this.f37751b = uyVar;
        this.f37750a = b2Var;
    }

    @Override
    public final void a(l70 l70Var, final long j3) {
        final org.telegram.ui.ActionBar.n2[] n2VarArr = {l70Var, null};
        Utilities.Callback callback = new Utilities.Callback(this) {
            public final tx f37220b;

            {
                this.f37220b = this;
            }

            @Override
            public final void run(Object obj) {
                Runnable runnable = (Runnable) obj;
                switch (r5) {
                    case 0:
                        uy uyVar = this.f37220b.f37751b;
                        Boolean bool = uyVar.G.has_username;
                        if (bool != null && bool.booleanValue()) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 1);
                            bundle.putLong("chat_id", j3);
                            bundle.putBoolean("forcePublic", uyVar.G.has_username.booleanValue());
                            ld ldVar = new ld(bundle);
                            ldVar.f35432t0 = new b5(runnable, 12);
                            uyVar.presentFragment(ldVar);
                            n2VarArr[1] = ldVar;
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        tx txVar = this.f37220b;
                        uy uyVar2 = txVar.f37751b;
                        uyVar2.Q4(uyVar2.getMessagesController().getChat(Long.valueOf(j3)), runnable, new kw(5, txVar, n2VarArr));
                        return;
                }
            }
        };
        Utilities.Callback callback2 = new Utilities.Callback(this) {
            public final tx f37220b;

            {
                this.f37220b = this;
            }

            @Override
            public final void run(Object obj) {
                Runnable runnable = (Runnable) obj;
                switch (r5) {
                    case 0:
                        uy uyVar = this.f37220b.f37751b;
                        Boolean bool = uyVar.G.has_username;
                        if (bool != null && bool.booleanValue()) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 1);
                            bundle.putLong("chat_id", j3);
                            bundle.putBoolean("forcePublic", uyVar.G.has_username.booleanValue());
                            ld ldVar = new ld(bundle);
                            ldVar.f35432t0 = new b5(runnable, 12);
                            uyVar.presentFragment(ldVar);
                            n2VarArr[1] = ldVar;
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        tx txVar = this.f37220b;
                        uy uyVar2 = txVar.f37751b;
                        uyVar2.Q4(uyVar2.getMessagesController().getChat(Long.valueOf(j3)), runnable, new kw(5, txVar, n2VarArr));
                        return;
                }
            }
        };
        org.telegram.ui.ActionBar.b2 b2Var = this.f37750a;
        Utilities.doCallbacks(callback, callback2, new ku(this, b2Var, j3, 1), new Utilities.Callback(this) {
            public final tx f37500b;

            {
                this.f37500b = this;
            }

            @Override
            public final void run(Object obj) {
                boolean z10;
                switch (r4) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        uy uyVar = this.f37500b.f37751b;
                        if (uyVar.G.bot_admin_rights != null) {
                            TLRPC.User user = uyVar.getMessagesController().getUser(Long.valueOf(uyVar.H));
                            MessagesController messagesController = uyVar.getMessagesController();
                            TLRPC.RequestPeerType requestPeerType = uyVar.G;
                            TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                            Boolean bool = requestPeerType.bot_participant;
                            if (bool != null && bool.booleanValue()) {
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                            messagesController.setUserAdminRole(j3, user, tL_chatAdminRights, null, false, uyVar, z10, true, null, runnable, new lf(6, runnable));
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        Runnable runnable2 = (Runnable) obj;
                        uy uyVar2 = this.f37500b.f37751b;
                        if (uyVar2.G.user_admin_rights != null) {
                            MessagesController messagesController2 = uyVar2.getMessagesController();
                            long j10 = j3;
                            uyVar2.getMessagesController().setUserAdminRole(j10, uyVar2.getAccountInstance().getUserConfig().getCurrentUser(), pq.s0(messagesController2.getChat(Long.valueOf(j10)).admin_rights, uyVar2.G.user_admin_rights), null, false, uyVar2, false, true, null, runnable2, new lf(7, runnable2));
                            return;
                        }
                        runnable2.run();
                        return;
                }
            }
        }, new Utilities.Callback(this) {
            public final tx f37500b;

            {
                this.f37500b = this;
            }

            @Override
            public final void run(Object obj) {
                boolean z10;
                switch (r4) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        uy uyVar = this.f37500b.f37751b;
                        if (uyVar.G.bot_admin_rights != null) {
                            TLRPC.User user = uyVar.getMessagesController().getUser(Long.valueOf(uyVar.H));
                            MessagesController messagesController = uyVar.getMessagesController();
                            TLRPC.RequestPeerType requestPeerType = uyVar.G;
                            TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                            Boolean bool = requestPeerType.bot_participant;
                            if (bool != null && bool.booleanValue()) {
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                            messagesController.setUserAdminRole(j3, user, tL_chatAdminRights, null, false, uyVar, z10, true, null, runnable, new lf(6, runnable));
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        Runnable runnable2 = (Runnable) obj;
                        uy uyVar2 = this.f37500b.f37751b;
                        if (uyVar2.G.user_admin_rights != null) {
                            MessagesController messagesController2 = uyVar2.getMessagesController();
                            long j10 = j3;
                            uyVar2.getMessagesController().setUserAdminRole(j10, uyVar2.getAccountInstance().getUserConfig().getCurrentUser(), pq.s0(messagesController2.getChat(Long.valueOf(j10)).admin_rights, uyVar2.G.user_admin_rights), null, false, uyVar2, false, true, null, runnable2, new lf(7, runnable2));
                            return;
                        }
                        runnable2.run();
                        return;
                }
            }
        }, new org.telegram.messenger.f2(this, b2Var, j3, n2VarArr, 3));
    }
}
