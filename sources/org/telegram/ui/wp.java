package org.telegram.ui;

import android.app.Activity;
import android.content.SharedPreferences;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wp implements org.telegram.messenger.x10 {
    public final int f53437a = 1;
    public final int f53438b;
    public final long f53439c;
    public final Object d;
    public final Object f53440e;
    public final Object f53441f;
    public final Object f53442g;
    public final Serializable h;

    public wp(int i7, long j3, Activity activity, ArrayList arrayList, HashMap hashMap, org.telegram.messenger.x10 x10Var, org.telegram.ui.ActionBar.i6 i6Var) {
        this.f53438b = i7;
        this.d = arrayList;
        this.f53439c = j3;
        this.f53440e = activity;
        this.f53441f = i6Var;
        this.f53442g = x10Var;
        this.h = hashMap;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f53437a;
        boolean z10 = false;
        Serializable serializable = this.h;
        Object obj2 = this.f53442g;
        Object obj3 = this.f53441f;
        Object obj4 = this.f53440e;
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
                long j10 = this.f53439c;
                zp zpVar = new zp(rqVar, j10, j3, tL_chatAdminRights, tL_chatBannedRights2, tL_chatBannedRights, str, intValue, zArr, j10);
                zpVar.Y0 = new aq(rqVar, intValue, j10, this.f53438b, z10, zArr);
                rqVar.presentFragment(zpVar);
                return;
            case 1:
                ArrayList arrayList = (ArrayList) obj5;
                Activity activity = (Activity) obj4;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) obj3;
                org.telegram.messenger.x10 x10Var = (org.telegram.messenger.x10) obj2;
                HashMap hashMap = (HashMap) serializable;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                int i10 = this.f53438b;
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
                        di.x8.y(i10, false).O.put(l10, Long.valueOf(System.currentTimeMillis()));
                    }
                    edit.apply();
                }
                org.telegram.messenger.nb nbVar = new org.telegram.messenger.nb(i10, this.f53439c, activity, arrayList, hashMap, x10Var, i6Var);
                if (!di.x8.y(i10, false).f10018e) {
                    di.x8 y10 = di.x8.y(i10, false);
                    y10.f10018e = false;
                    y10.q(nbVar, false, true);
                    y10.f10018e = true;
                    return;
                }
                nbVar.run();
                return;
            default:
                Boolean bool = (Boolean) obj;
                String str2 = LaunchActivity.C1;
                TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                int i12 = this.f53438b;
                tL_messages_toggleBotInAttachMenu.bot = org.telegram.messenger.mp.u1(i12).q1(this.f53439c);
                tL_messages_toggleBotInAttachMenu.enabled = true;
                tL_messages_toggleBotInAttachMenu.write_allowed = true;
                ConnectionsManager.getInstance(i12).sendRequest(tL_messages_toggleBotInAttachMenu, new org.telegram.messenger.gx((LaunchActivity) obj5, i12, (cx) obj4, (org.telegram.ui.ActionBar.h2) obj3, (TLRPC.User) obj2, (String) serializable), 66);
                return;
        }
    }

    public wp(rq rqVar, long j3, int i7, TLObject tLObject, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10) {
        this.d = rqVar;
        this.f53439c = j3;
        this.f53438b = i7;
        this.f53440e = tLObject;
        this.f53441f = tL_chatAdminRights;
        this.f53442g = tL_chatBannedRights;
        this.h = str;
    }

    public wp(LaunchActivity launchActivity, int i7, long j3, cx cxVar, org.telegram.ui.ActionBar.h2 h2Var, TLRPC.User user, String str) {
        this.d = launchActivity;
        this.f53438b = i7;
        this.f53439c = j3;
        this.f53440e = cxVar;
        this.f53441f = h2Var;
        this.f53442g = user;
        this.h = str;
    }
}
