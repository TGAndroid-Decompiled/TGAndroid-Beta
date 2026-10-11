package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class rx implements i70 {
    public final org.telegram.ui.ActionBar.a2 f41523a;
    public final sy f41524b;

    public rx(sy syVar, org.telegram.ui.ActionBar.a2 a2Var) {
        this.f41524b = syVar;
        this.f41523a = a2Var;
    }

    @Override
    public final void a(j70 j70Var, final long j3) {
        final org.telegram.ui.ActionBar.m2[] m2VarArr = {j70Var, null};
        Utilities.Callback callback = new Utilities.Callback(this) {
            public final rx f40993b;

            {
                this.f40993b = this;
            }

            @Override
            public final void run(Object obj) {
                Runnable runnable = (Runnable) obj;
                switch (r5) {
                    case 0:
                        sy syVar = this.f40993b.f41524b;
                        Boolean bool = syVar.G.has_username;
                        if (bool != null && bool.booleanValue()) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 1);
                            bundle.putLong("chat_id", j3);
                            bundle.putBoolean("forcePublic", syVar.G.has_username.booleanValue());
                            ld ldVar = new ld(bundle);
                            ldVar.f39618t0 = new a5(runnable, 12);
                            syVar.presentFragment(ldVar);
                            m2VarArr[1] = ldVar;
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        rx rxVar = this.f40993b;
                        sy syVar2 = rxVar.f41524b;
                        syVar2.N4(syVar2.getMessagesController().getChat(Long.valueOf(j3)), runnable, new org.telegram.ui.Components.voip.i(15, rxVar, m2VarArr));
                        return;
                }
            }
        };
        Utilities.Callback callback2 = new Utilities.Callback(this) {
            public final rx f40993b;

            {
                this.f40993b = this;
            }

            @Override
            public final void run(Object obj) {
                Runnable runnable = (Runnable) obj;
                switch (r5) {
                    case 0:
                        sy syVar = this.f40993b.f41524b;
                        Boolean bool = syVar.G.has_username;
                        if (bool != null && bool.booleanValue()) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 1);
                            bundle.putLong("chat_id", j3);
                            bundle.putBoolean("forcePublic", syVar.G.has_username.booleanValue());
                            ld ldVar = new ld(bundle);
                            ldVar.f39618t0 = new a5(runnable, 12);
                            syVar.presentFragment(ldVar);
                            m2VarArr[1] = ldVar;
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        rx rxVar = this.f40993b;
                        sy syVar2 = rxVar.f41524b;
                        syVar2.N4(syVar2.getMessagesController().getChat(Long.valueOf(j3)), runnable, new org.telegram.ui.Components.voip.i(15, rxVar, m2VarArr));
                        return;
                }
            }
        };
        org.telegram.ui.ActionBar.a2 a2Var = this.f41523a;
        Utilities.doCallbacks(callback, callback2, new iu(this, a2Var, j3, 1), new Utilities.Callback(this) {
            public final rx f41274b;

            {
                this.f41274b = this;
            }

            @Override
            public final void run(Object obj) {
                boolean z10;
                switch (r4) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        sy syVar = this.f41274b.f41524b;
                        if (syVar.G.bot_admin_rights != null) {
                            TLRPC.User user = syVar.getMessagesController().getUser(Long.valueOf(syVar.H));
                            MessagesController messagesController = syVar.getMessagesController();
                            TLRPC.RequestPeerType requestPeerType = syVar.G;
                            TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                            Boolean bool = requestPeerType.bot_participant;
                            if (bool != null && bool.booleanValue()) {
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                            boolean z11 = z10;
                            messagesController.setUserAdminRole(j3, user, tL_chatAdminRights, null, false, syVar, z11, true, null, runnable, new nf(6, runnable));
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        Runnable runnable2 = (Runnable) obj;
                        sy syVar2 = this.f41274b.f41524b;
                        if (syVar2.G.user_admin_rights != null) {
                            MessagesController messagesController2 = syVar2.getMessagesController();
                            long j10 = j3;
                            syVar2.getMessagesController().setUserAdminRole(j10, syVar2.getAccountInstance().getUserConfig().getCurrentUser(), nq.s0(messagesController2.getChat(Long.valueOf(j10)).admin_rights, syVar2.G.user_admin_rights), null, false, syVar2, false, true, null, runnable2, new nf(7, runnable2));
                            return;
                        }
                        runnable2.run();
                        return;
                }
            }
        }, new Utilities.Callback(this) {
            public final rx f41274b;

            {
                this.f41274b = this;
            }

            @Override
            public final void run(Object obj) {
                boolean z10;
                switch (r4) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        sy syVar = this.f41274b.f41524b;
                        if (syVar.G.bot_admin_rights != null) {
                            TLRPC.User user = syVar.getMessagesController().getUser(Long.valueOf(syVar.H));
                            MessagesController messagesController = syVar.getMessagesController();
                            TLRPC.RequestPeerType requestPeerType = syVar.G;
                            TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                            Boolean bool = requestPeerType.bot_participant;
                            if (bool != null && bool.booleanValue()) {
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                            boolean z11 = z10;
                            messagesController.setUserAdminRole(j3, user, tL_chatAdminRights, null, false, syVar, z11, true, null, runnable, new nf(6, runnable));
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        Runnable runnable2 = (Runnable) obj;
                        sy syVar2 = this.f41274b.f41524b;
                        if (syVar2.G.user_admin_rights != null) {
                            MessagesController messagesController2 = syVar2.getMessagesController();
                            long j10 = j3;
                            syVar2.getMessagesController().setUserAdminRole(j10, syVar2.getAccountInstance().getUserConfig().getCurrentUser(), nq.s0(messagesController2.getChat(Long.valueOf(j10)).admin_rights, syVar2.G.user_admin_rights), null, false, syVar2, false, true, null, runnable2, new nf(7, runnable2));
                            return;
                        }
                        runnable2.run();
                        return;
                }
            }
        }, new ai.l(this, a2Var, j3, m2VarArr, 7));
    }
}
