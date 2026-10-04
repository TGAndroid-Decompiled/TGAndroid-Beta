package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class rx implements j70 {
    public final org.telegram.ui.ActionBar.b2 f40302a;
    public final uy f40303b;

    public rx(uy uyVar, org.telegram.ui.ActionBar.b2 b2Var) {
        this.f40303b = uyVar;
        this.f40302a = b2Var;
    }

    @Override
    public final void a(k70 k70Var, final long j3) {
        final org.telegram.ui.ActionBar.n2[] n2VarArr = {k70Var, null};
        Utilities.Callback callback = new Utilities.Callback(this) {
            public final rx f39556b;

            {
                this.f39556b = this;
            }

            @Override
            public final void run(Object obj) {
                Runnable runnable = (Runnable) obj;
                switch (r5) {
                    case 0:
                        uy uyVar = this.f39556b.f40303b;
                        Boolean bool = uyVar.G.has_username;
                        if (bool != null && bool.booleanValue()) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 1);
                            bundle.putLong("chat_id", j3);
                            bundle.putBoolean("forcePublic", uyVar.G.has_username.booleanValue());
                            nd ndVar = new nd(bundle);
                            ndVar.f38935t0 = new c5(runnable, 12);
                            uyVar.presentFragment(ndVar);
                            n2VarArr[1] = ndVar;
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        rx rxVar = this.f39556b;
                        uy uyVar2 = rxVar.f40303b;
                        uyVar2.Z4(uyVar2.getMessagesController().getChat(Long.valueOf(j3)), runnable, new cu(6, rxVar, n2VarArr));
                        return;
                }
            }
        };
        Utilities.Callback callback2 = new Utilities.Callback(this) {
            public final rx f39556b;

            {
                this.f39556b = this;
            }

            @Override
            public final void run(Object obj) {
                Runnable runnable = (Runnable) obj;
                switch (r5) {
                    case 0:
                        uy uyVar = this.f39556b.f40303b;
                        Boolean bool = uyVar.G.has_username;
                        if (bool != null && bool.booleanValue()) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 1);
                            bundle.putLong("chat_id", j3);
                            bundle.putBoolean("forcePublic", uyVar.G.has_username.booleanValue());
                            nd ndVar = new nd(bundle);
                            ndVar.f38935t0 = new c5(runnable, 12);
                            uyVar.presentFragment(ndVar);
                            n2VarArr[1] = ndVar;
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        rx rxVar = this.f39556b;
                        uy uyVar2 = rxVar.f40303b;
                        uyVar2.Z4(uyVar2.getMessagesController().getChat(Long.valueOf(j3)), runnable, new cu(6, rxVar, n2VarArr));
                        return;
                }
            }
        };
        org.telegram.ui.ActionBar.b2 b2Var = this.f40302a;
        Utilities.doCallbacks(callback, callback2, new ku(this, b2Var, j3, 1), new Utilities.Callback(this) {
            public final rx f39840b;

            {
                this.f39840b = this;
            }

            @Override
            public final void run(Object obj) {
                boolean z10;
                switch (r4) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        uy uyVar = this.f39840b.f40303b;
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
                            messagesController.setUserAdminRole(j3, user, tL_chatAdminRights, null, false, uyVar, z10, true, null, runnable, new nf(8, runnable));
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        Runnable runnable2 = (Runnable) obj;
                        uy uyVar2 = this.f39840b.f40303b;
                        if (uyVar2.G.user_admin_rights != null) {
                            MessagesController messagesController2 = uyVar2.getMessagesController();
                            long j10 = j3;
                            uyVar2.getMessagesController().setUserAdminRole(j10, uyVar2.getAccountInstance().getUserConfig().getCurrentUser(), mq.s0(messagesController2.getChat(Long.valueOf(j10)).admin_rights, uyVar2.G.user_admin_rights), null, false, uyVar2, false, true, null, runnable2, new nf(7, runnable2));
                            return;
                        }
                        runnable2.run();
                        return;
                }
            }
        }, new Utilities.Callback(this) {
            public final rx f39840b;

            {
                this.f39840b = this;
            }

            @Override
            public final void run(Object obj) {
                boolean z10;
                switch (r4) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        uy uyVar = this.f39840b.f40303b;
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
                            messagesController.setUserAdminRole(j3, user, tL_chatAdminRights, null, false, uyVar, z10, true, null, runnable, new nf(8, runnable));
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        Runnable runnable2 = (Runnable) obj;
                        uy uyVar2 = this.f39840b.f40303b;
                        if (uyVar2.G.user_admin_rights != null) {
                            MessagesController messagesController2 = uyVar2.getMessagesController();
                            long j10 = j3;
                            uyVar2.getMessagesController().setUserAdminRole(j10, uyVar2.getAccountInstance().getUserConfig().getCurrentUser(), mq.s0(messagesController2.getChat(Long.valueOf(j10)).admin_rights, uyVar2.G.user_admin_rights), null, false, uyVar2, false, true, null, runnable2, new nf(7, runnable2));
                            return;
                        }
                        runnable2.run();
                        return;
                }
            }
        }, new ai.l(this, b2Var, j3, n2VarArr, 7));
    }
}
