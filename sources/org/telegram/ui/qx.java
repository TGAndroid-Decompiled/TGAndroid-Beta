package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class qx implements h70 {
    public final org.telegram.ui.ActionBar.b2 f36625a;
    public final ry f36626b;

    public qx(ry ryVar, org.telegram.ui.ActionBar.b2 b2Var) {
        this.f36626b = ryVar;
        this.f36625a = b2Var;
    }

    @Override
    public final void a(i70 i70Var, final long j3) {
        final org.telegram.ui.ActionBar.n2[] n2VarArr = {i70Var, null};
        Utilities.Callback callback = new Utilities.Callback(this) {
            public final qx f35967b;

            {
                this.f35967b = this;
            }

            @Override
            public final void run(Object obj) {
                Runnable runnable = (Runnable) obj;
                switch (r5) {
                    case 0:
                        ry ryVar = this.f35967b.f36626b;
                        Boolean bool = ryVar.G.has_username;
                        if (bool != null && bool.booleanValue()) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 1);
                            bundle.putLong("chat_id", j3);
                            bundle.putBoolean("forcePublic", ryVar.G.has_username.booleanValue());
                            ld ldVar = new ld(bundle);
                            ldVar.f34940t0 = new c5(runnable, 12);
                            ryVar.presentFragment(ldVar);
                            n2VarArr[1] = ldVar;
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        qx qxVar = this.f35967b;
                        ry ryVar2 = qxVar.f36626b;
                        ryVar2.Q4(ryVar2.getMessagesController().getChat(Long.valueOf(j3)), runnable, new hw(5, qxVar, n2VarArr));
                        return;
                }
            }
        };
        Utilities.Callback callback2 = new Utilities.Callback(this) {
            public final qx f35967b;

            {
                this.f35967b = this;
            }

            @Override
            public final void run(Object obj) {
                Runnable runnable = (Runnable) obj;
                switch (r5) {
                    case 0:
                        ry ryVar = this.f35967b.f36626b;
                        Boolean bool = ryVar.G.has_username;
                        if (bool != null && bool.booleanValue()) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 1);
                            bundle.putLong("chat_id", j3);
                            bundle.putBoolean("forcePublic", ryVar.G.has_username.booleanValue());
                            ld ldVar = new ld(bundle);
                            ldVar.f34940t0 = new c5(runnable, 12);
                            ryVar.presentFragment(ldVar);
                            n2VarArr[1] = ldVar;
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        qx qxVar = this.f35967b;
                        ry ryVar2 = qxVar.f36626b;
                        ryVar2.Q4(ryVar2.getMessagesController().getChat(Long.valueOf(j3)), runnable, new hw(5, qxVar, n2VarArr));
                        return;
                }
            }
        };
        org.telegram.ui.ActionBar.b2 b2Var = this.f36625a;
        Utilities.doCallbacks(callback, callback2, new hu(this, b2Var, j3, 1), new Utilities.Callback(this) {
            public final qx f36217b;

            {
                this.f36217b = this;
            }

            @Override
            public final void run(Object obj) {
                boolean z10;
                switch (r4) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        ry ryVar = this.f36217b.f36626b;
                        if (ryVar.G.bot_admin_rights != null) {
                            TLRPC.User user = ryVar.getMessagesController().getUser(Long.valueOf(ryVar.H));
                            MessagesController messagesController = ryVar.getMessagesController();
                            TLRPC.RequestPeerType requestPeerType = ryVar.G;
                            TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                            Boolean bool = requestPeerType.bot_participant;
                            if (bool != null && bool.booleanValue()) {
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                            messagesController.setUserAdminRole(j3, user, tL_chatAdminRights, null, false, ryVar, z10, true, null, runnable, new lf(6, runnable));
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        Runnable runnable2 = (Runnable) obj;
                        ry ryVar2 = this.f36217b.f36626b;
                        if (ryVar2.G.user_admin_rights != null) {
                            MessagesController messagesController2 = ryVar2.getMessagesController();
                            long j10 = j3;
                            ryVar2.getMessagesController().setUserAdminRole(j10, ryVar2.getAccountInstance().getUserConfig().getCurrentUser(), lq.s0(messagesController2.getChat(Long.valueOf(j10)).admin_rights, ryVar2.G.user_admin_rights), null, false, ryVar2, false, true, null, runnable2, new lf(7, runnable2));
                            return;
                        }
                        runnable2.run();
                        return;
                }
            }
        }, new Utilities.Callback(this) {
            public final qx f36217b;

            {
                this.f36217b = this;
            }

            @Override
            public final void run(Object obj) {
                boolean z10;
                switch (r4) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        ry ryVar = this.f36217b.f36626b;
                        if (ryVar.G.bot_admin_rights != null) {
                            TLRPC.User user = ryVar.getMessagesController().getUser(Long.valueOf(ryVar.H));
                            MessagesController messagesController = ryVar.getMessagesController();
                            TLRPC.RequestPeerType requestPeerType = ryVar.G;
                            TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                            Boolean bool = requestPeerType.bot_participant;
                            if (bool != null && bool.booleanValue()) {
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                            messagesController.setUserAdminRole(j3, user, tL_chatAdminRights, null, false, ryVar, z10, true, null, runnable, new lf(6, runnable));
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        Runnable runnable2 = (Runnable) obj;
                        ry ryVar2 = this.f36217b.f36626b;
                        if (ryVar2.G.user_admin_rights != null) {
                            MessagesController messagesController2 = ryVar2.getMessagesController();
                            long j10 = j3;
                            ryVar2.getMessagesController().setUserAdminRole(j10, ryVar2.getAccountInstance().getUserConfig().getCurrentUser(), lq.s0(messagesController2.getChat(Long.valueOf(j10)).admin_rights, ryVar2.G.user_admin_rights), null, false, ryVar2, false, true, null, runnable2, new lf(7, runnable2));
                            return;
                        }
                        runnable2.run();
                        return;
                }
            }
        }, new ai.l(this, b2Var, j3, n2VarArr, 7));
    }
}
