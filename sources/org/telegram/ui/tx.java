package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class tx implements k70 {
    public final org.telegram.ui.ActionBar.b2 f40878a;
    public final uy f40879b;

    public tx(uy uyVar, org.telegram.ui.ActionBar.b2 b2Var) {
        this.f40879b = uyVar;
        this.f40878a = b2Var;
    }

    @Override
    public final void a(l70 l70Var, final long j3) {
        final org.telegram.ui.ActionBar.n2[] n2VarArr = {l70Var, null};
        Utilities.Callback callback = new Utilities.Callback(this) {
            public final tx f40280b;

            {
                this.f40280b = this;
            }

            @Override
            public final void run(Object obj) {
                Runnable runnable = (Runnable) obj;
                switch (r5) {
                    case 0:
                        uy uyVar = this.f40280b.f40879b;
                        Boolean bool = uyVar.G.has_username;
                        if (bool != null && bool.booleanValue()) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 1);
                            bundle.putLong("chat_id", j3);
                            bundle.putBoolean("forcePublic", uyVar.G.has_username.booleanValue());
                            md mdVar = new md(bundle);
                            mdVar.f38686t0 = new b5(runnable, 12);
                            uyVar.presentFragment(mdVar);
                            n2VarArr[1] = mdVar;
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        tx txVar = this.f40280b;
                        uy uyVar2 = txVar.f40879b;
                        uyVar2.Q4(uyVar2.getMessagesController().getChat(Long.valueOf(j3)), runnable, new yt(11, txVar, n2VarArr));
                        return;
                }
            }
        };
        Utilities.Callback callback2 = new Utilities.Callback(this) {
            public final tx f40280b;

            {
                this.f40280b = this;
            }

            @Override
            public final void run(Object obj) {
                Runnable runnable = (Runnable) obj;
                switch (r5) {
                    case 0:
                        uy uyVar = this.f40280b.f40879b;
                        Boolean bool = uyVar.G.has_username;
                        if (bool != null && bool.booleanValue()) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 1);
                            bundle.putLong("chat_id", j3);
                            bundle.putBoolean("forcePublic", uyVar.G.has_username.booleanValue());
                            md mdVar = new md(bundle);
                            mdVar.f38686t0 = new b5(runnable, 12);
                            uyVar.presentFragment(mdVar);
                            n2VarArr[1] = mdVar;
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        tx txVar = this.f40280b;
                        uy uyVar2 = txVar.f40879b;
                        uyVar2.Q4(uyVar2.getMessagesController().getChat(Long.valueOf(j3)), runnable, new yt(11, txVar, n2VarArr));
                        return;
                }
            }
        };
        org.telegram.ui.ActionBar.b2 b2Var = this.f40878a;
        Utilities.doCallbacks(callback, callback2, new lu(this, b2Var, j3, 1), new Utilities.Callback(this) {
            public final tx f40589b;

            {
                this.f40589b = this;
            }

            @Override
            public final void run(Object obj) {
                boolean z10;
                switch (r4) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        uy uyVar = this.f40589b.f40879b;
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
                        uy uyVar2 = this.f40589b.f40879b;
                        if (uyVar2.G.user_admin_rights != null) {
                            MessagesController messagesController2 = uyVar2.getMessagesController();
                            long j10 = j3;
                            uyVar2.getMessagesController().setUserAdminRole(j10, uyVar2.getAccountInstance().getUserConfig().getCurrentUser(), qq.s0(messagesController2.getChat(Long.valueOf(j10)).admin_rights, uyVar2.G.user_admin_rights), null, false, uyVar2, false, true, null, runnable2, new lf(7, runnable2));
                            return;
                        }
                        runnable2.run();
                        return;
                }
            }
        }, new Utilities.Callback(this) {
            public final tx f40589b;

            {
                this.f40589b = this;
            }

            @Override
            public final void run(Object obj) {
                boolean z10;
                switch (r4) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        uy uyVar = this.f40589b.f40879b;
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
                        uy uyVar2 = this.f40589b.f40879b;
                        if (uyVar2.G.user_admin_rights != null) {
                            MessagesController messagesController2 = uyVar2.getMessagesController();
                            long j10 = j3;
                            uyVar2.getMessagesController().setUserAdminRole(j10, uyVar2.getAccountInstance().getUserConfig().getCurrentUser(), qq.s0(messagesController2.getChat(Long.valueOf(j10)).admin_rights, uyVar2.G.user_admin_rights), null, false, uyVar2, false, true, null, runnable2, new lf(7, runnable2));
                            return;
                        }
                        runnable2.run();
                        return;
                }
            }
        }, new org.telegram.messenger.f2(this, b2Var, j3, n2VarArr, 3));
    }
}
