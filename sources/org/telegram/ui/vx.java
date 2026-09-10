package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class vx implements j70 {
    public final org.telegram.ui.ActionBar.d2 f37643a;
    public final wy f37644b;

    public vx(wy wyVar, org.telegram.ui.ActionBar.d2 d2Var) {
        this.f37644b = wyVar;
        this.f37643a = d2Var;
    }

    @Override
    public final void a(k70 k70Var, final long j3) {
        final org.telegram.ui.ActionBar.p2[] p2VarArr = {k70Var, null};
        Utilities.Callback callback = new Utilities.Callback(this) {
            public final vx f37052b;

            {
                this.f37052b = this;
            }

            @Override
            public final void run(Object obj) {
                Runnable runnable = (Runnable) obj;
                switch (r5) {
                    case 0:
                        wy wyVar = this.f37052b.f37644b;
                        Boolean bool = wyVar.G.has_username;
                        if (bool != null && bool.booleanValue()) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 1);
                            bundle.putLong("chat_id", j3);
                            bundle.putBoolean("forcePublic", wyVar.G.has_username.booleanValue());
                            nd ndVar = new nd(bundle);
                            ndVar.f35243t0 = new b5(runnable, 12);
                            wyVar.presentFragment(ndVar);
                            p2VarArr[1] = ndVar;
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        vx vxVar = this.f37052b;
                        wy wyVar2 = vxVar.f37644b;
                        wyVar2.Q4(wyVar2.getMessagesController().getChat(Long.valueOf(j3)), runnable, new uv(8, vxVar, p2VarArr));
                        return;
                }
            }
        };
        Utilities.Callback callback2 = new Utilities.Callback(this) {
            public final vx f37052b;

            {
                this.f37052b = this;
            }

            @Override
            public final void run(Object obj) {
                Runnable runnable = (Runnable) obj;
                switch (r5) {
                    case 0:
                        wy wyVar = this.f37052b.f37644b;
                        Boolean bool = wyVar.G.has_username;
                        if (bool != null && bool.booleanValue()) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 1);
                            bundle.putLong("chat_id", j3);
                            bundle.putBoolean("forcePublic", wyVar.G.has_username.booleanValue());
                            nd ndVar = new nd(bundle);
                            ndVar.f35243t0 = new b5(runnable, 12);
                            wyVar.presentFragment(ndVar);
                            p2VarArr[1] = ndVar;
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        vx vxVar = this.f37052b;
                        wy wyVar2 = vxVar.f37644b;
                        wyVar2.Q4(wyVar2.getMessagesController().getChat(Long.valueOf(j3)), runnable, new uv(8, vxVar, p2VarArr));
                        return;
                }
            }
        };
        org.telegram.ui.ActionBar.d2 d2Var = this.f37643a;
        Utilities.doCallbacks(callback, callback2, new lu(this, d2Var, j3, 1), new Utilities.Callback(this) {
            public final vx f37354b;

            {
                this.f37354b = this;
            }

            @Override
            public final void run(Object obj) {
                boolean z10;
                switch (r4) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        wy wyVar = this.f37354b.f37644b;
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
                        wy wyVar2 = this.f37354b.f37644b;
                        if (wyVar2.G.user_admin_rights != null) {
                            MessagesController messagesController2 = wyVar2.getMessagesController();
                            long j10 = j3;
                            wyVar2.getMessagesController().setUserAdminRole(j10, wyVar2.getAccountInstance().getUserConfig().getCurrentUser(), rq.s0(messagesController2.getChat(Long.valueOf(j10)).admin_rights, wyVar2.G.user_admin_rights), null, false, wyVar2, false, true, null, runnable2, new nf(7, runnable2));
                            return;
                        }
                        runnable2.run();
                        return;
                }
            }
        }, new Utilities.Callback(this) {
            public final vx f37354b;

            {
                this.f37354b = this;
            }

            @Override
            public final void run(Object obj) {
                boolean z10;
                switch (r4) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        wy wyVar = this.f37354b.f37644b;
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
                        wy wyVar2 = this.f37354b.f37644b;
                        if (wyVar2.G.user_admin_rights != null) {
                            MessagesController messagesController2 = wyVar2.getMessagesController();
                            long j10 = j3;
                            wyVar2.getMessagesController().setUserAdminRole(j10, wyVar2.getAccountInstance().getUserConfig().getCurrentUser(), rq.s0(messagesController2.getChat(Long.valueOf(j10)).admin_rights, wyVar2.G.user_admin_rights), null, false, wyVar2, false, true, null, runnable2, new nf(7, runnable2));
                            return;
                        }
                        runnable2.run();
                        return;
                }
            }
        }, new org.telegram.messenger.j2(this, d2Var, j3, p2VarArr, 3));
    }
}
