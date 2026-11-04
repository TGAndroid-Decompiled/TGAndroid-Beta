package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class uv implements x40 {
    public final org.telegram.ui.ActionBar.s1 f50194a;
    public final uw f50195b;

    public uv(uw uwVar, org.telegram.ui.ActionBar.s1 s1Var) {
        this.f50195b = uwVar;
        this.f50194a = s1Var;
    }

    @Override
    public final void d(y40 y40Var, final long j10) {
        final org.telegram.ui.ActionBar.d2[] d2VarArr = {y40Var, null};
        org.telegram.messenger.u10 u10Var = new org.telegram.messenger.u10(this) {
            public final uv f49625b;

            {
                this.f49625b = this;
            }

            @Override
            public final void a(Object obj) {
                Runnable runnable = (Runnable) obj;
                switch (r5) {
                    case 0:
                        uw uwVar = this.f49625b.f50195b;
                        Boolean bool = uwVar.H.has_username;
                        if (bool != null && bool.booleanValue()) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 1);
                            bundle.putLong("chat_id", j10);
                            bundle.putBoolean("forcePublic", uwVar.H.has_username.booleanValue());
                            ad adVar = new ad(bundle);
                            adVar.f43753v0 = new c5(runnable, 12);
                            uwVar.presentFragment(adVar);
                            d2VarArr[1] = adVar;
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        uv uvVar = this.f49625b;
                        uw uwVar2 = uvVar.f50195b;
                        uwVar2.c5(uwVar2.getMessagesController().M0(Long.valueOf(j10)), runnable, new org.telegram.ui.Components.p11(21, uvVar, d2VarArr));
                        return;
                }
            }
        };
        org.telegram.messenger.u10 u10Var2 = new org.telegram.messenger.u10(this) {
            public final uv f49625b;

            {
                this.f49625b = this;
            }

            @Override
            public final void a(Object obj) {
                Runnable runnable = (Runnable) obj;
                switch (r5) {
                    case 0:
                        uw uwVar = this.f49625b.f50195b;
                        Boolean bool = uwVar.H.has_username;
                        if (bool != null && bool.booleanValue()) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 1);
                            bundle.putLong("chat_id", j10);
                            bundle.putBoolean("forcePublic", uwVar.H.has_username.booleanValue());
                            ad adVar = new ad(bundle);
                            adVar.f43753v0 = new c5(runnable, 12);
                            uwVar.presentFragment(adVar);
                            d2VarArr[1] = adVar;
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        uv uvVar = this.f49625b;
                        uw uwVar2 = uvVar.f50195b;
                        uwVar2.c5(uwVar2.getMessagesController().M0(Long.valueOf(j10)), runnable, new org.telegram.ui.Components.p11(21, uvVar, d2VarArr));
                        return;
                }
            }
        };
        org.telegram.ui.ActionBar.s1 s1Var = this.f50194a;
        Utilities.u(0, u10Var, u10Var2, new ci.u1(this, s1Var, j10, 2), new org.telegram.messenger.u10(this) {
            public final uv f49893b;

            {
                this.f49893b = this;
            }

            @Override
            public final void a(Object obj) {
                boolean z10;
                switch (r4) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        uw uwVar = this.f49893b.f50195b;
                        if (uwVar.H.bot_admin_rights != null) {
                            TLRPC.User a22 = uwVar.getMessagesController().a2(Long.valueOf(uwVar.I));
                            org.telegram.messenger.hp messagesController = uwVar.getMessagesController();
                            TLRPC.RequestPeerType requestPeerType = uwVar.H;
                            TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                            Boolean bool = requestPeerType.bot_participant;
                            if (bool != null && bool.booleanValue()) {
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                            boolean z11 = z10;
                            messagesController.P4(j10, a22, tL_chatAdminRights, null, false, uwVar, z11, true, null, runnable, new se(8, runnable));
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        Runnable runnable2 = (Runnable) obj;
                        uw uwVar2 = this.f49893b.f50195b;
                        if (uwVar2.H.user_admin_rights != null) {
                            org.telegram.messenger.hp messagesController2 = uwVar2.getMessagesController();
                            long j11 = j10;
                            uwVar2.getMessagesController().P4(j11, org.telegram.messenger.h10.i(uwVar2.getAccountInstance().f21919a).f(), ip.x0(messagesController2.M0(Long.valueOf(j11)).admin_rights, uwVar2.H.user_admin_rights), null, false, uwVar2, false, true, null, runnable2, new se(7, runnable2));
                            return;
                        }
                        runnable2.run();
                        return;
                }
            }
        }, new org.telegram.messenger.u10(this) {
            public final uv f49893b;

            {
                this.f49893b = this;
            }

            @Override
            public final void a(Object obj) {
                boolean z10;
                switch (r4) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        uw uwVar = this.f49893b.f50195b;
                        if (uwVar.H.bot_admin_rights != null) {
                            TLRPC.User a22 = uwVar.getMessagesController().a2(Long.valueOf(uwVar.I));
                            org.telegram.messenger.hp messagesController = uwVar.getMessagesController();
                            TLRPC.RequestPeerType requestPeerType = uwVar.H;
                            TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                            Boolean bool = requestPeerType.bot_participant;
                            if (bool != null && bool.booleanValue()) {
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                            boolean z11 = z10;
                            messagesController.P4(j10, a22, tL_chatAdminRights, null, false, uwVar, z11, true, null, runnable, new se(8, runnable));
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        Runnable runnable2 = (Runnable) obj;
                        uw uwVar2 = this.f49893b.f50195b;
                        if (uwVar2.H.user_admin_rights != null) {
                            org.telegram.messenger.hp messagesController2 = uwVar2.getMessagesController();
                            long j11 = j10;
                            uwVar2.getMessagesController().P4(j11, org.telegram.messenger.h10.i(uwVar2.getAccountInstance().f21919a).f(), ip.x0(messagesController2.M0(Long.valueOf(j11)).admin_rights, uwVar2.H.user_admin_rights), null, false, uwVar2, false, true, null, runnable2, new se(7, runnable2));
                            return;
                        }
                        runnable2.run();
                        return;
                }
            }
        }, new ai.m1(this, s1Var, j10, d2VarArr, 6));
    }
}
