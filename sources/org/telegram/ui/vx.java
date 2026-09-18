package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class vx implements m70 {
    public final org.telegram.ui.ActionBar.c2 f38525a;
    public final wy f38526b;

    public vx(wy wyVar, org.telegram.ui.ActionBar.c2 c2Var) {
        this.f38526b = wyVar;
        this.f38525a = c2Var;
    }

    @Override
    public final void a(n70 n70Var, final long j3) {
        final org.telegram.ui.ActionBar.o2[] o2VarArr = {n70Var, null};
        Utilities.Callback callback = new Utilities.Callback(this) {
            public final vx f37886b;

            {
                this.f37886b = this;
            }

            @Override
            public final void run(Object obj) {
                Runnable runnable = (Runnable) obj;
                switch (r5) {
                    case 0:
                        wy wyVar = this.f37886b.f38526b;
                        Boolean bool = wyVar.G.has_username;
                        if (bool != null && bool.booleanValue()) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 1);
                            bundle.putLong("chat_id", j3);
                            bundle.putBoolean("forcePublic", wyVar.G.has_username.booleanValue());
                            nd ndVar = new nd(bundle);
                            ndVar.f36067t0 = new b5(runnable, 12);
                            wyVar.presentFragment(ndVar);
                            o2VarArr[1] = ndVar;
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        vx vxVar = this.f37886b;
                        wy wyVar2 = vxVar.f38526b;
                        wyVar2.Q4(wyVar2.getMessagesController().getChat(Long.valueOf(j3)), runnable, new mw(5, vxVar, o2VarArr));
                        return;
                }
            }
        };
        Utilities.Callback callback2 = new Utilities.Callback(this) {
            public final vx f37886b;

            {
                this.f37886b = this;
            }

            @Override
            public final void run(Object obj) {
                Runnable runnable = (Runnable) obj;
                switch (r5) {
                    case 0:
                        wy wyVar = this.f37886b.f38526b;
                        Boolean bool = wyVar.G.has_username;
                        if (bool != null && bool.booleanValue()) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 1);
                            bundle.putLong("chat_id", j3);
                            bundle.putBoolean("forcePublic", wyVar.G.has_username.booleanValue());
                            nd ndVar = new nd(bundle);
                            ndVar.f36067t0 = new b5(runnable, 12);
                            wyVar.presentFragment(ndVar);
                            o2VarArr[1] = ndVar;
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        vx vxVar = this.f37886b;
                        wy wyVar2 = vxVar.f38526b;
                        wyVar2.Q4(wyVar2.getMessagesController().getChat(Long.valueOf(j3)), runnable, new mw(5, vxVar, o2VarArr));
                        return;
                }
            }
        };
        org.telegram.ui.ActionBar.c2 c2Var = this.f38525a;
        Utilities.doCallbacks(callback, callback2, new mu(this, c2Var, j3, 1), new Utilities.Callback(this) {
            public final vx f38240b;

            {
                this.f38240b = this;
            }

            @Override
            public final void run(Object obj) {
                boolean z10;
                switch (r4) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        wy wyVar = this.f38240b.f38526b;
                        if (wyVar.G.bot_admin_rights != null) {
                            TLRPC.User user = wyVar.getMessagesController().getUser(Long.valueOf(wyVar.H));
                            MessagesController messagesController = wyVar.getMessagesController();
                            TLRPC.RequestPeerType requestPeerType = wyVar.G;
                            TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                            Boolean bool = requestPeerType.bot_participant;
                            if (bool != null && bool.booleanValue()) {
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                            messagesController.setUserAdminRole(j3, user, tL_chatAdminRights, null, false, wyVar, z10, true, null, runnable, new nf(6, runnable));
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        Runnable runnable2 = (Runnable) obj;
                        wy wyVar2 = this.f38240b.f38526b;
                        if (wyVar2.G.user_admin_rights != null) {
                            MessagesController messagesController2 = wyVar2.getMessagesController();
                            long j10 = j3;
                            wyVar2.getMessagesController().setUserAdminRole(j10, wyVar2.getAccountInstance().getUserConfig().getCurrentUser(), pq.s0(messagesController2.getChat(Long.valueOf(j10)).admin_rights, wyVar2.G.user_admin_rights), null, false, wyVar2, false, true, null, runnable2, new nf(7, runnable2));
                            return;
                        }
                        runnable2.run();
                        return;
                }
            }
        }, new Utilities.Callback(this) {
            public final vx f38240b;

            {
                this.f38240b = this;
            }

            @Override
            public final void run(Object obj) {
                boolean z10;
                switch (r4) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        wy wyVar = this.f38240b.f38526b;
                        if (wyVar.G.bot_admin_rights != null) {
                            TLRPC.User user = wyVar.getMessagesController().getUser(Long.valueOf(wyVar.H));
                            MessagesController messagesController = wyVar.getMessagesController();
                            TLRPC.RequestPeerType requestPeerType = wyVar.G;
                            TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                            Boolean bool = requestPeerType.bot_participant;
                            if (bool != null && bool.booleanValue()) {
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                            messagesController.setUserAdminRole(j3, user, tL_chatAdminRights, null, false, wyVar, z10, true, null, runnable, new nf(6, runnable));
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        Runnable runnable2 = (Runnable) obj;
                        wy wyVar2 = this.f38240b.f38526b;
                        if (wyVar2.G.user_admin_rights != null) {
                            MessagesController messagesController2 = wyVar2.getMessagesController();
                            long j10 = j3;
                            wyVar2.getMessagesController().setUserAdminRole(j10, wyVar2.getAccountInstance().getUserConfig().getCurrentUser(), pq.s0(messagesController2.getChat(Long.valueOf(j10)).admin_rights, wyVar2.G.user_admin_rights), null, false, wyVar2, false, true, null, runnable2, new nf(7, runnable2));
                            return;
                        }
                        runnable2.run();
                        return;
                }
            }
        }, new org.telegram.messenger.f2(this, c2Var, j3, o2VarArr, 3));
    }
}
