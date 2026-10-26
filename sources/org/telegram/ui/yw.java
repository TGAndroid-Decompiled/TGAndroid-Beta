package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class yw implements w60 {
    public final org.telegram.ui.ActionBar.e2 f46120a;
    public final cy f46121b;

    public yw(cy cyVar, org.telegram.ui.ActionBar.e2 e2Var) {
        this.f46121b = cyVar;
        this.f46120a = e2Var;
    }

    @Override
    public final void a(x60 x60Var, final long j10) {
        final org.telegram.ui.ActionBar.r2[] r2VarArr = {x60Var, null};
        Utilities.Callback callback = new Utilities.Callback(this) {
            public final yw f45564b;

            {
                this.f45564b = this;
            }

            @Override
            public final void run(Object obj) {
                Runnable runnable = (Runnable) obj;
                switch (r5) {
                    case 0:
                        cy cyVar = this.f45564b.f46121b;
                        Boolean bool = cyVar.G.has_username;
                        if (bool != null && bool.booleanValue()) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 1);
                            bundle.putLong("chat_id", j10);
                            bundle.putBoolean("forcePublic", cyVar.G.has_username.booleanValue());
                            nd ndVar = new nd(bundle);
                            ndVar.f41868u0 = new e5(runnable, 12);
                            cyVar.presentFragment(ndVar);
                            r2VarArr[1] = ndVar;
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        yw ywVar = this.f45564b;
                        cy cyVar2 = ywVar.f46121b;
                        cyVar2.Y4(cyVar2.getMessagesController().getChat(Long.valueOf(j10)), runnable, new org.telegram.ui.Components.c71(25, ywVar, r2VarArr));
                        return;
                }
            }
        };
        Utilities.Callback callback2 = new Utilities.Callback(this) {
            public final yw f45564b;

            {
                this.f45564b = this;
            }

            @Override
            public final void run(Object obj) {
                Runnable runnable = (Runnable) obj;
                switch (r5) {
                    case 0:
                        cy cyVar = this.f45564b.f46121b;
                        Boolean bool = cyVar.G.has_username;
                        if (bool != null && bool.booleanValue()) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 1);
                            bundle.putLong("chat_id", j10);
                            bundle.putBoolean("forcePublic", cyVar.G.has_username.booleanValue());
                            nd ndVar = new nd(bundle);
                            ndVar.f41868u0 = new e5(runnable, 12);
                            cyVar.presentFragment(ndVar);
                            r2VarArr[1] = ndVar;
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        yw ywVar = this.f45564b;
                        cy cyVar2 = ywVar.f46121b;
                        cyVar2.Y4(cyVar2.getMessagesController().getChat(Long.valueOf(j10)), runnable, new org.telegram.ui.Components.c71(25, ywVar, r2VarArr));
                        return;
                }
            }
        };
        org.telegram.ui.ActionBar.e2 e2Var = this.f46120a;
        Utilities.doCallbacks(callback, callback2, new bi.c2(this, e2Var, j10, 2), new Utilities.Callback(this) {
            public final yw f45889b;

            {
                this.f45889b = this;
            }

            @Override
            public final void run(Object obj) {
                boolean z10;
                switch (r4) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        cy cyVar = this.f45889b.f46121b;
                        if (cyVar.G.bot_admin_rights != null) {
                            TLRPC.User user = cyVar.getMessagesController().getUser(Long.valueOf(cyVar.H));
                            MessagesController messagesController = cyVar.getMessagesController();
                            TLRPC.RequestPeerType requestPeerType = cyVar.G;
                            TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                            Boolean bool = requestPeerType.bot_participant;
                            if (bool != null && bool.booleanValue()) {
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                            boolean z11 = z10;
                            messagesController.setUserAdminRole(j10, user, tL_chatAdminRights, null, false, cyVar, z11, true, null, runnable, new ff(8, runnable));
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        Runnable runnable2 = (Runnable) obj;
                        cy cyVar2 = this.f45889b.f46121b;
                        if (cyVar2.G.user_admin_rights != null) {
                            MessagesController messagesController2 = cyVar2.getMessagesController();
                            long j11 = j10;
                            cyVar2.getMessagesController().setUserAdminRole(j11, cyVar2.getAccountInstance().getUserConfig().getCurrentUser(), gq.t0(messagesController2.getChat(Long.valueOf(j11)).admin_rights, cyVar2.G.user_admin_rights), null, false, cyVar2, false, true, null, runnable2, new ff(7, runnable2));
                            return;
                        }
                        runnable2.run();
                        return;
                }
            }
        }, new Utilities.Callback(this) {
            public final yw f45889b;

            {
                this.f45889b = this;
            }

            @Override
            public final void run(Object obj) {
                boolean z10;
                switch (r4) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        cy cyVar = this.f45889b.f46121b;
                        if (cyVar.G.bot_admin_rights != null) {
                            TLRPC.User user = cyVar.getMessagesController().getUser(Long.valueOf(cyVar.H));
                            MessagesController messagesController = cyVar.getMessagesController();
                            TLRPC.RequestPeerType requestPeerType = cyVar.G;
                            TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                            Boolean bool = requestPeerType.bot_participant;
                            if (bool != null && bool.booleanValue()) {
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                            boolean z11 = z10;
                            messagesController.setUserAdminRole(j10, user, tL_chatAdminRights, null, false, cyVar, z11, true, null, runnable, new ff(8, runnable));
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        Runnable runnable2 = (Runnable) obj;
                        cy cyVar2 = this.f45889b.f46121b;
                        if (cyVar2.G.user_admin_rights != null) {
                            MessagesController messagesController2 = cyVar2.getMessagesController();
                            long j11 = j10;
                            cyVar2.getMessagesController().setUserAdminRole(j11, cyVar2.getAccountInstance().getUserConfig().getCurrentUser(), gq.t0(messagesController2.getChat(Long.valueOf(j11)).admin_rights, cyVar2.G.user_admin_rights), null, false, cyVar2, false, true, null, runnable2, new ff(7, runnable2));
                            return;
                        }
                        runnable2.run();
                        return;
                }
            }
        }, new bi.t2(this, e2Var, j10, r2VarArr, 5));
    }
}
