package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class zv implements b50 {
    public final org.telegram.ui.ActionBar.t1 f54030a;
    public final yw f54031b;

    public zv(yw ywVar, org.telegram.ui.ActionBar.t1 t1Var) {
        this.f54031b = ywVar;
        this.f54030a = t1Var;
    }

    @Override
    public final void c(c50 c50Var, final long j3) {
        final org.telegram.ui.ActionBar.e2[] e2VarArr = {c50Var, null};
        org.telegram.messenger.z10 z10Var = new org.telegram.messenger.z10(this) {
            public final zv f53331b;

            {
                this.f53331b = this;
            }

            @Override
            public final void a(Object obj) {
                Runnable runnable = (Runnable) obj;
                switch (r5) {
                    case 0:
                        yw ywVar = this.f53331b.f54031b;
                        Boolean bool = ywVar.H.has_username;
                        if (bool != null && bool.booleanValue()) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 1);
                            bundle.putLong("chat_id", j3);
                            bundle.putBoolean("forcePublic", ywVar.H.has_username.booleanValue());
                            ad adVar = new ad(bundle);
                            adVar.f45023v0 = new a5(runnable, 12);
                            ywVar.presentFragment(adVar);
                            e2VarArr[1] = adVar;
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        zv zvVar = this.f53331b;
                        yw ywVar2 = zvVar.f54031b;
                        ywVar2.c5(ywVar2.getMessagesController().M0(Long.valueOf(j3)), runnable, new org.telegram.ui.Components.voip.u(12, zvVar, e2VarArr));
                        return;
                }
            }
        };
        org.telegram.messenger.z10 z10Var2 = new org.telegram.messenger.z10(this) {
            public final zv f53331b;

            {
                this.f53331b = this;
            }

            @Override
            public final void a(Object obj) {
                Runnable runnable = (Runnable) obj;
                switch (r5) {
                    case 0:
                        yw ywVar = this.f53331b.f54031b;
                        Boolean bool = ywVar.H.has_username;
                        if (bool != null && bool.booleanValue()) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 1);
                            bundle.putLong("chat_id", j3);
                            bundle.putBoolean("forcePublic", ywVar.H.has_username.booleanValue());
                            ad adVar = new ad(bundle);
                            adVar.f45023v0 = new a5(runnable, 12);
                            ywVar.presentFragment(adVar);
                            e2VarArr[1] = adVar;
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        zv zvVar = this.f53331b;
                        yw ywVar2 = zvVar.f54031b;
                        ywVar2.c5(ywVar2.getMessagesController().M0(Long.valueOf(j3)), runnable, new org.telegram.ui.Components.voip.u(12, zvVar, e2VarArr));
                        return;
                }
            }
        };
        org.telegram.ui.ActionBar.t1 t1Var = this.f54030a;
        Utilities.u(0, z10Var, z10Var2, new di.o1(this, t1Var, j3, 2), new org.telegram.messenger.z10(this) {
            public final zv f53601b;

            {
                this.f53601b = this;
            }

            @Override
            public final void a(Object obj) {
                boolean z10;
                switch (r4) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        yw ywVar = this.f53601b.f54031b;
                        if (ywVar.H.bot_admin_rights != null) {
                            TLRPC.User a22 = ywVar.getMessagesController().a2(Long.valueOf(ywVar.I));
                            org.telegram.messenger.np messagesController = ywVar.getMessagesController();
                            TLRPC.RequestPeerType requestPeerType = ywVar.H;
                            TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                            Boolean bool = requestPeerType.bot_participant;
                            if (bool != null && bool.booleanValue()) {
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                            boolean z11 = z10;
                            messagesController.Q4(j3, a22, tL_chatAdminRights, null, false, ywVar, z11, true, null, runnable, new te(8, runnable));
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        Runnable runnable2 = (Runnable) obj;
                        yw ywVar2 = this.f53601b.f54031b;
                        if (ywVar2.H.user_admin_rights != null) {
                            org.telegram.messenger.np messagesController2 = ywVar2.getMessagesController();
                            long j10 = j3;
                            ywVar2.getMessagesController().Q4(j10, org.telegram.messenger.m10.i(ywVar2.getAccountInstance().f22782a).f(), mp.x0(messagesController2.M0(Long.valueOf(j10)).admin_rights, ywVar2.H.user_admin_rights), null, false, ywVar2, false, true, null, runnable2, new te(7, runnable2));
                            return;
                        }
                        runnable2.run();
                        return;
                }
            }
        }, new org.telegram.messenger.z10(this) {
            public final zv f53601b;

            {
                this.f53601b = this;
            }

            @Override
            public final void a(Object obj) {
                boolean z10;
                switch (r4) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        yw ywVar = this.f53601b.f54031b;
                        if (ywVar.H.bot_admin_rights != null) {
                            TLRPC.User a22 = ywVar.getMessagesController().a2(Long.valueOf(ywVar.I));
                            org.telegram.messenger.np messagesController = ywVar.getMessagesController();
                            TLRPC.RequestPeerType requestPeerType = ywVar.H;
                            TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                            Boolean bool = requestPeerType.bot_participant;
                            if (bool != null && bool.booleanValue()) {
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                            boolean z11 = z10;
                            messagesController.Q4(j3, a22, tL_chatAdminRights, null, false, ywVar, z11, true, null, runnable, new te(8, runnable));
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        Runnable runnable2 = (Runnable) obj;
                        yw ywVar2 = this.f53601b.f54031b;
                        if (ywVar2.H.user_admin_rights != null) {
                            org.telegram.messenger.np messagesController2 = ywVar2.getMessagesController();
                            long j10 = j3;
                            ywVar2.getMessagesController().Q4(j10, org.telegram.messenger.m10.i(ywVar2.getAccountInstance().f22782a).f(), mp.x0(messagesController2.M0(Long.valueOf(j10)).admin_rights, ywVar2.H.user_admin_rights), null, false, ywVar2, false, true, null, runnable2, new te(7, runnable2));
                            return;
                        }
                        runnable2.run();
                        return;
                }
            }
        }, new bi.i1(this, t1Var, j3, e2VarArr, 6));
    }
}
