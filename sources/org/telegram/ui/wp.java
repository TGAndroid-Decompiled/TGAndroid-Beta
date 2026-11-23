package org.telegram.ui;

import android.app.Activity;
import android.content.SharedPreferences;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wp implements org.telegram.messenger.w10 {
    public final int f53716a = 1;
    public final int f53717b;
    public final long f53718c;
    public final Object d;
    public final Object f53719e;
    public final Object f53720f;
    public final Object f53721g;
    public final Serializable h;

    public wp(int i7, long j3, Activity activity, ArrayList arrayList, HashMap hashMap, org.telegram.messenger.w10 w10Var, org.telegram.ui.ActionBar.i6 i6Var) {
        this.f53717b = i7;
        this.d = arrayList;
        this.f53718c = j3;
        this.f53719e = activity;
        this.f53720f = i6Var;
        this.f53721g = w10Var;
        this.h = hashMap;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f53716a;
        boolean z10 = false;
        Serializable serializable = this.h;
        Object obj2 = this.f53721g;
        Object obj3 = this.f53720f;
        Object obj4 = this.f53719e;
        Object obj5 = this.d;
        switch (i7) {
            case 0:
                rq rqVar = (rq) obj5;
                TLObject tLObject = (TLObject) obj4;
                TLRPC.TL_chatAdminRights tL_chatAdminRights = (TLRPC.TL_chatAdminRights) obj3;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = (TLRPC.TL_chatBannedRights) obj2;
                String str = (String) serializable;
                int intValue = ((Integer) obj).intValue();
                boolean[] zArr = new boolean[1];
                if ((tLObject instanceof TLRPC.TL_channelParticipantAdmin) || (tLObject instanceof TLRPC.TL_chatParticipantAdmin)) {
                    z10 = true;
                }
                long j3 = rqVar.N;
                TLRPC.TL_chatBannedRights tL_chatBannedRights2 = rqVar.E;
                long j10 = this.f53718c;
                zp zpVar = new zp(rqVar, j10, j3, tL_chatAdminRights, tL_chatBannedRights2, tL_chatBannedRights, str, intValue, zArr, j10);
                zpVar.Y0 = new aq(rqVar, intValue, j10, this.f53717b, z10, zArr);
                rqVar.presentFragment(zpVar);
                return;
            case 1:
                ArrayList arrayList = (ArrayList) obj5;
                Activity activity = (Activity) obj4;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) obj3;
                org.telegram.messenger.w10 w10Var = (org.telegram.messenger.w10) obj2;
                HashMap hashMap = (HashMap) serializable;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                int i10 = this.f53717b;
                if (booleanValue) {
                    SharedPreferences.Editor edit = org.telegram.messenger.mp.u1(i10).h7.edit();
                    int size = arrayList.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj6 = arrayList.get(i11);
                        i11++;
                        Long l10 = (Long) obj6;
                        long longValue = l10.longValue();
                        long P1 = org.telegram.messenger.mp.u1(i10).P1(longValue);
                        if (P1 <= 0 && longValue > 0) {
                            P1 = org.telegram.messenger.n5.k(org.telegram.messenger.mp.u1(i10).P2(longValue));
                        }
                        edit.putLong(p5.c.j(longValue, "ask_paid_message_", "_price"), P1);
                        di.y8.y(i10, false).O.put(l10, Long.valueOf(System.currentTimeMillis()));
                    }
                    edit.apply();
                }
                org.telegram.messenger.nb nbVar = new org.telegram.messenger.nb(i10, this.f53718c, activity, arrayList, hashMap, w10Var, i6Var);
                if (!di.y8.y(i10, false).f10049e) {
                    di.y8 y10 = di.y8.y(i10, false);
                    y10.f10049e = false;
                    y10.q(nbVar, false, true);
                    y10.f10049e = true;
                    return;
                }
                nbVar.run();
                return;
            default:
                Boolean bool = (Boolean) obj;
                String str2 = LaunchActivity.C1;
                TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                int i12 = this.f53717b;
                tL_messages_toggleBotInAttachMenu.bot = org.telegram.messenger.mp.u1(i12).q1(this.f53718c);
                tL_messages_toggleBotInAttachMenu.enabled = true;
                tL_messages_toggleBotInAttachMenu.write_allowed = true;
                ConnectionsManager.getInstance(i12).sendRequest(tL_messages_toggleBotInAttachMenu, new org.telegram.messenger.gx((LaunchActivity) obj5, i12, (bx) obj4, (org.telegram.ui.ActionBar.g2) obj3, (TLRPC.User) obj2, (String) serializable), 66);
                return;
        }
    }

    public wp(rq rqVar, long j3, int i7, TLObject tLObject, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10) {
        this.d = rqVar;
        this.f53718c = j3;
        this.f53717b = i7;
        this.f53719e = tLObject;
        this.f53720f = tL_chatAdminRights;
        this.f53721g = tL_chatBannedRights;
        this.h = str;
    }

    public wp(LaunchActivity launchActivity, int i7, long j3, bx bxVar, org.telegram.ui.ActionBar.g2 g2Var, TLRPC.User user, String str) {
        this.d = launchActivity;
        this.f53717b = i7;
        this.f53718c = j3;
        this.f53719e = bxVar;
        this.f53720f = g2Var;
        this.f53721g = user;
        this.h = str;
    }
}
