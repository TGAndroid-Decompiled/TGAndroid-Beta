package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class qx implements f70 {
    public final org.telegram.ui.ActionBar.d2 f37514a;
    public final qy f37515b;

    public qx(qy qyVar, org.telegram.ui.ActionBar.d2 d2Var) {
        this.f37515b = qyVar;
        this.f37514a = d2Var;
    }

    @Override
    public final void a(g70 g70Var, final long j10) {
        final org.telegram.ui.ActionBar.p2[] p2VarArr = {g70Var, null};
        Utilities.Callback callback = new Utilities.Callback(this) {
            public final qx f36896b;

            {
                this.f36896b = this;
            }

            @Override
            public final void run(Object obj) {
                Runnable runnable = (Runnable) obj;
                switch (r5) {
                    case 0:
                        qy qyVar = this.f36896b.f37515b;
                        Boolean bool = qyVar.D.has_username;
                        if (bool != null && bool.booleanValue()) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 1);
                            bundle.putLong("chat_id", j10);
                            bundle.putBoolean("forcePublic", qyVar.D.has_username.booleanValue());
                            pd pdVar = new pd(bundle);
                            pdVar.f37095q0 = new f5(runnable, 12);
                            qyVar.presentFragment(pdVar);
                            p2VarArr[1] = pdVar;
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        qx qxVar = this.f36896b;
                        qy qyVar2 = qxVar.f37515b;
                        qyVar2.Q4(qyVar2.getMessagesController().getChat(Long.valueOf(j10)), runnable, new org.telegram.ui.Components.k41(22, qxVar, p2VarArr));
                        return;
                }
            }
        };
        Utilities.Callback callback2 = new Utilities.Callback(this) {
            public final qx f36896b;

            {
                this.f36896b = this;
            }

            @Override
            public final void run(Object obj) {
                Runnable runnable = (Runnable) obj;
                switch (r5) {
                    case 0:
                        qy qyVar = this.f36896b.f37515b;
                        Boolean bool = qyVar.D.has_username;
                        if (bool != null && bool.booleanValue()) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 1);
                            bundle.putLong("chat_id", j10);
                            bundle.putBoolean("forcePublic", qyVar.D.has_username.booleanValue());
                            pd pdVar = new pd(bundle);
                            pdVar.f37095q0 = new f5(runnable, 12);
                            qyVar.presentFragment(pdVar);
                            p2VarArr[1] = pdVar;
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        qx qxVar = this.f36896b;
                        qy qyVar2 = qxVar.f37515b;
                        qyVar2.Q4(qyVar2.getMessagesController().getChat(Long.valueOf(j10)), runnable, new org.telegram.ui.Components.k41(22, qxVar, p2VarArr));
                        return;
                }
            }
        };
        org.telegram.ui.ActionBar.d2 d2Var = this.f37514a;
        Utilities.doCallbacks(callback, callback2, new ku(this, d2Var, j10, 1), new Utilities.Callback(this) {
            public final qx f37243b;

            {
                this.f37243b = this;
            }

            @Override
            public final void run(Object obj) {
                boolean z4;
                switch (r4) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        qy qyVar = this.f37243b.f37515b;
                        if (qyVar.D.bot_admin_rights != null) {
                            TLRPC.User user = qyVar.getMessagesController().getUser(Long.valueOf(qyVar.E));
                            MessagesController messagesController = qyVar.getMessagesController();
                            TLRPC.RequestPeerType requestPeerType = qyVar.D;
                            TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                            Boolean bool = requestPeerType.bot_participant;
                            if (bool != null && bool.booleanValue()) {
                                z4 = false;
                            } else {
                                z4 = true;
                            }
                            messagesController.setUserAdminRole(j10, user, tL_chatAdminRights, null, false, qyVar, z4, true, null, runnable, new jf(6, runnable));
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        Runnable runnable2 = (Runnable) obj;
                        qy qyVar2 = this.f37243b.f37515b;
                        if (qyVar2.D.user_admin_rights != null) {
                            MessagesController messagesController2 = qyVar2.getMessagesController();
                            long j11 = j10;
                            qyVar2.getMessagesController().setUserAdminRole(j11, qyVar2.getAccountInstance().getUserConfig().getCurrentUser(), lq.s0(messagesController2.getChat(Long.valueOf(j11)).admin_rights, qyVar2.D.user_admin_rights), null, false, qyVar2, false, true, null, runnable2, new jf(7, runnable2));
                            return;
                        }
                        runnable2.run();
                        return;
                }
            }
        }, new Utilities.Callback(this) {
            public final qx f37243b;

            {
                this.f37243b = this;
            }

            @Override
            public final void run(Object obj) {
                boolean z4;
                switch (r4) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        qy qyVar = this.f37243b.f37515b;
                        if (qyVar.D.bot_admin_rights != null) {
                            TLRPC.User user = qyVar.getMessagesController().getUser(Long.valueOf(qyVar.E));
                            MessagesController messagesController = qyVar.getMessagesController();
                            TLRPC.RequestPeerType requestPeerType = qyVar.D;
                            TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                            Boolean bool = requestPeerType.bot_participant;
                            if (bool != null && bool.booleanValue()) {
                                z4 = false;
                            } else {
                                z4 = true;
                            }
                            messagesController.setUserAdminRole(j10, user, tL_chatAdminRights, null, false, qyVar, z4, true, null, runnable, new jf(6, runnable));
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        Runnable runnable2 = (Runnable) obj;
                        qy qyVar2 = this.f37243b.f37515b;
                        if (qyVar2.D.user_admin_rights != null) {
                            MessagesController messagesController2 = qyVar2.getMessagesController();
                            long j11 = j10;
                            qyVar2.getMessagesController().setUserAdminRole(j11, qyVar2.getAccountInstance().getUserConfig().getCurrentUser(), lq.s0(messagesController2.getChat(Long.valueOf(j11)).admin_rights, qyVar2.D.user_admin_rights), null, false, qyVar2, false, true, null, runnable2, new jf(7, runnable2));
                            return;
                        }
                        runnable2.run();
                        return;
                }
            }
        }, new kh.y0(this, d2Var, j10, p2VarArr, 4));
    }
}
