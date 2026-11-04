package org.telegram.ui;

import android.app.Activity;
import android.content.SharedPreferences;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class rp implements org.telegram.messenger.u10 {
    public final int f49254a = 1;
    public final int f49255b;
    public final long f49256c;
    public final Object d;
    public final Object f49257e;
    public final Object f49258f;
    public final Object f49259g;
    public final Serializable h;

    public rp(int i3, long j10, Activity activity, ArrayList arrayList, HashMap hashMap, org.telegram.messenger.u10 u10Var, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f49255b = i3;
        this.d = arrayList;
        this.f49256c = j10;
        this.f49257e = activity;
        this.f49258f = e6Var;
        this.f49259g = u10Var;
        this.h = hashMap;
    }

    @Override
    public final void a(Object obj) {
        int i3 = this.f49254a;
        boolean z10 = false;
        Serializable serializable = this.h;
        Object obj2 = this.f49259g;
        Object obj3 = this.f49258f;
        Object obj4 = this.f49257e;
        Object obj5 = this.d;
        switch (i3) {
            case 0:
                nq nqVar = (nq) obj5;
                TLObject tLObject = (TLObject) obj4;
                TLRPC.TL_chatAdminRights tL_chatAdminRights = (TLRPC.TL_chatAdminRights) obj3;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = (TLRPC.TL_chatBannedRights) obj2;
                String str = (String) serializable;
                int intValue = ((Integer) obj).intValue();
                boolean[] zArr = new boolean[1];
                if ((tLObject instanceof TLRPC.TL_channelParticipantAdmin) || (tLObject instanceof TLRPC.TL_chatParticipantAdmin)) {
                    z10 = true;
                }
                long j10 = nqVar.N;
                TLRPC.TL_chatBannedRights tL_chatBannedRights2 = nqVar.E;
                long j11 = this.f49256c;
                up upVar = new up(nqVar, j11, j10, tL_chatAdminRights, tL_chatBannedRights2, tL_chatBannedRights, str, intValue, zArr, j11);
                upVar.Y0 = new vp(nqVar, intValue, j11, this.f49255b, z10, zArr);
                nqVar.presentFragment(upVar);
                return;
            case 1:
                ArrayList arrayList = (ArrayList) obj5;
                Activity activity = (Activity) obj4;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj3;
                org.telegram.messenger.u10 u10Var = (org.telegram.messenger.u10) obj2;
                HashMap hashMap = (HashMap) serializable;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                int i10 = this.f49255b;
                if (booleanValue) {
                    SharedPreferences.Editor edit = org.telegram.messenger.hp.s1(i10).f22999e7.edit();
                    int size = arrayList.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj6 = arrayList.get(i11);
                        i11++;
                        Long l10 = (Long) obj6;
                        long longValue = l10.longValue();
                        long N1 = org.telegram.messenger.hp.s1(i10).N1(longValue);
                        if (N1 <= 0 && longValue > 0) {
                            N1 = org.telegram.messenger.m5.k(org.telegram.messenger.hp.s1(i10).J2(longValue));
                        }
                        edit.putLong(t4.c.e(longValue, "ask_paid_message_", "_price"), N1);
                        ci.e9.y(i10, false).O.put(l10, Long.valueOf(System.currentTimeMillis()));
                    }
                    edit.apply();
                }
                org.telegram.messenger.ib ibVar = new org.telegram.messenger.ib(i10, this.f49256c, activity, arrayList, hashMap, u10Var, e6Var);
                if (!ci.e9.y(i10, false).f5032e) {
                    ci.e9 y9 = ci.e9.y(i10, false);
                    y9.f5032e = false;
                    y9.q(ibVar, false, true);
                    y9.f5032e = true;
                    return;
                }
                ibVar.run();
                return;
            default:
                Boolean bool = (Boolean) obj;
                String str2 = LaunchActivity.E1;
                TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                int i12 = this.f49255b;
                tL_messages_toggleBotInAttachMenu.bot = org.telegram.messenger.hp.s1(i12).o1(this.f49256c);
                tL_messages_toggleBotInAttachMenu.enabled = true;
                tL_messages_toggleBotInAttachMenu.write_allowed = true;
                ConnectionsManager.getInstance(i12).sendRequest(tL_messages_toggleBotInAttachMenu, new org.telegram.messenger.gx((LaunchActivity) obj5, i12, (uw) obj4, (org.telegram.ui.ActionBar.d2) obj3, (TLRPC.User) obj2, (String) serializable), 66);
                return;
        }
    }

    public rp(nq nqVar, long j10, int i3, TLObject tLObject, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10) {
        this.d = nqVar;
        this.f49256c = j10;
        this.f49255b = i3;
        this.f49257e = tLObject;
        this.f49258f = tL_chatAdminRights;
        this.f49259g = tL_chatBannedRights;
        this.h = str;
    }

    public rp(LaunchActivity launchActivity, int i3, long j10, uw uwVar, org.telegram.ui.ActionBar.d2 d2Var, TLRPC.User user, String str) {
        this.d = launchActivity;
        this.f49255b = i3;
        this.f49256c = j10;
        this.f49257e = uwVar;
        this.f49258f = d2Var;
        this.f49259g = user;
        this.h = str;
    }
}
