package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class sx implements i70 {
    public final org.telegram.ui.ActionBar.b2 f41783a;
    public final ty f41784b;

    public sx(ty tyVar, org.telegram.ui.ActionBar.b2 b2Var) {
        this.f41784b = tyVar;
        this.f41783a = b2Var;
    }

    @Override
    public final void a(j70 j70Var, final long j3) {
        final org.telegram.ui.ActionBar.n2[] n2VarArr = {j70Var, null};
        Utilities.Callback callback = new Utilities.Callback(this) {
            public final sx f41219b;

            {
                this.f41219b = this;
            }

            @Override
            public final void run(Object obj) {
                Runnable runnable = (Runnable) obj;
                switch (r5) {
                    case 0:
                        ty tyVar = this.f41219b.f41784b;
                        Boolean bool = tyVar.G.has_username;
                        if (bool != null && bool.booleanValue()) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 1);
                            bundle.putLong("chat_id", j3);
                            bundle.putBoolean("forcePublic", tyVar.G.has_username.booleanValue());
                            md mdVar = new md(bundle);
                            mdVar.f39864t0 = new b5(runnable, 12);
                            tyVar.presentFragment(mdVar);
                            n2VarArr[1] = mdVar;
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        sx sxVar = this.f41219b;
                        ty tyVar2 = sxVar.f41784b;
                        tyVar2.N4(tyVar2.getMessagesController().getChat(Long.valueOf(j3)), runnable, new org.telegram.ui.Components.ea1(16, sxVar, n2VarArr));
                        return;
                }
            }
        };
        Utilities.Callback callback2 = new Utilities.Callback(this) {
            public final sx f41219b;

            {
                this.f41219b = this;
            }

            @Override
            public final void run(Object obj) {
                Runnable runnable = (Runnable) obj;
                switch (r5) {
                    case 0:
                        ty tyVar = this.f41219b.f41784b;
                        Boolean bool = tyVar.G.has_username;
                        if (bool != null && bool.booleanValue()) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 1);
                            bundle.putLong("chat_id", j3);
                            bundle.putBoolean("forcePublic", tyVar.G.has_username.booleanValue());
                            md mdVar = new md(bundle);
                            mdVar.f39864t0 = new b5(runnable, 12);
                            tyVar.presentFragment(mdVar);
                            n2VarArr[1] = mdVar;
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        sx sxVar = this.f41219b;
                        ty tyVar2 = sxVar.f41784b;
                        tyVar2.N4(tyVar2.getMessagesController().getChat(Long.valueOf(j3)), runnable, new org.telegram.ui.Components.ea1(16, sxVar, n2VarArr));
                        return;
                }
            }
        };
        org.telegram.ui.ActionBar.b2 b2Var = this.f41783a;
        Utilities.doCallbacks(callback, callback2, new ju(this, b2Var, j3, 1), new Utilities.Callback(this) {
            public final sx f41533b;

            {
                this.f41533b = this;
            }

            @Override
            public final void run(Object obj) {
                boolean z10;
                switch (r4) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        ty tyVar = this.f41533b.f41784b;
                        if (tyVar.G.bot_admin_rights != null) {
                            TLRPC.User user = tyVar.getMessagesController().getUser(Long.valueOf(tyVar.H));
                            MessagesController messagesController = tyVar.getMessagesController();
                            TLRPC.RequestPeerType requestPeerType = tyVar.G;
                            TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                            Boolean bool = requestPeerType.bot_participant;
                            if (bool != null && bool.booleanValue()) {
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                            boolean z11 = z10;
                            messagesController.setUserAdminRole(j3, user, tL_chatAdminRights, null, false, tyVar, z11, true, null, runnable, new of(6, runnable));
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        Runnable runnable2 = (Runnable) obj;
                        ty tyVar2 = this.f41533b.f41784b;
                        if (tyVar2.G.user_admin_rights != null) {
                            MessagesController messagesController2 = tyVar2.getMessagesController();
                            long j10 = j3;
                            tyVar2.getMessagesController().setUserAdminRole(j10, tyVar2.getAccountInstance().getUserConfig().getCurrentUser(), nq.s0(messagesController2.getChat(Long.valueOf(j10)).admin_rights, tyVar2.G.user_admin_rights), null, false, tyVar2, false, true, null, runnable2, new of(7, runnable2));
                            return;
                        }
                        runnable2.run();
                        return;
                }
            }
        }, new Utilities.Callback(this) {
            public final sx f41533b;

            {
                this.f41533b = this;
            }

            @Override
            public final void run(Object obj) {
                boolean z10;
                switch (r4) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        ty tyVar = this.f41533b.f41784b;
                        if (tyVar.G.bot_admin_rights != null) {
                            TLRPC.User user = tyVar.getMessagesController().getUser(Long.valueOf(tyVar.H));
                            MessagesController messagesController = tyVar.getMessagesController();
                            TLRPC.RequestPeerType requestPeerType = tyVar.G;
                            TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                            Boolean bool = requestPeerType.bot_participant;
                            if (bool != null && bool.booleanValue()) {
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                            boolean z11 = z10;
                            messagesController.setUserAdminRole(j3, user, tL_chatAdminRights, null, false, tyVar, z11, true, null, runnable, new of(6, runnable));
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        Runnable runnable2 = (Runnable) obj;
                        ty tyVar2 = this.f41533b.f41784b;
                        if (tyVar2.G.user_admin_rights != null) {
                            MessagesController messagesController2 = tyVar2.getMessagesController();
                            long j10 = j3;
                            tyVar2.getMessagesController().setUserAdminRole(j10, tyVar2.getAccountInstance().getUserConfig().getCurrentUser(), nq.s0(messagesController2.getChat(Long.valueOf(j10)).admin_rights, tyVar2.G.user_admin_rights), null, false, tyVar2, false, true, null, runnable2, new of(7, runnable2));
                            return;
                        }
                        runnable2.run();
                        return;
                }
            }
        }, new ai.l(this, b2Var, j3, n2VarArr, 7));
    }
}
