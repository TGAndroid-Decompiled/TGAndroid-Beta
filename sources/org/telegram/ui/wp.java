package org.telegram.ui;

import android.app.Activity;
import android.content.SharedPreferences;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wp implements org.telegram.messenger.y10 {
    public final int f53428a = 1;
    public final int f53429b;
    public final long f53430c;
    public final Object d;
    public final Object f53431e;
    public final Object f53432f;
    public final Object f53433g;
    public final Serializable h;

    public wp(int i7, long j3, Activity activity, ArrayList arrayList, HashMap hashMap, org.telegram.messenger.y10 y10Var, org.telegram.ui.ActionBar.h6 h6Var) {
        this.f53429b = i7;
        this.d = arrayList;
        this.f53430c = j3;
        this.f53431e = activity;
        this.f53432f = h6Var;
        this.f53433g = y10Var;
        this.h = hashMap;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f53428a;
        boolean z10 = false;
        Serializable serializable = this.h;
        Object obj2 = this.f53433g;
        Object obj3 = this.f53432f;
        Object obj4 = this.f53431e;
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
                long j10 = this.f53430c;
                zp zpVar = new zp(rqVar, j10, j3, tL_chatAdminRights, tL_chatBannedRights2, tL_chatBannedRights, str, intValue, zArr, j10);
                zpVar.Y0 = new aq(rqVar, intValue, j10, this.f53429b, z10, zArr);
                rqVar.presentFragment(zpVar);
                return;
            case 1:
                ArrayList arrayList = (ArrayList) obj5;
                Activity activity = (Activity) obj4;
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) obj3;
                org.telegram.messenger.y10 y10Var = (org.telegram.messenger.y10) obj2;
                HashMap hashMap = (HashMap) serializable;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                int i10 = this.f53429b;
                if (booleanValue) {
                    SharedPreferences.Editor edit = org.telegram.messenger.np.u1(i10).h7.edit();
                    int size = arrayList.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj6 = arrayList.get(i11);
                        i11++;
                        Long l10 = (Long) obj6;
                        long longValue = l10.longValue();
                        long P1 = org.telegram.messenger.np.u1(i10).P1(longValue);
                        if (P1 <= 0 && longValue > 0) {
                            P1 = org.telegram.messenger.n5.k(org.telegram.messenger.np.u1(i10).P2(longValue));
                        }
                        edit.putLong(p5.c.j(longValue, "ask_paid_message_", "_price"), P1);
                        di.y8.y(i10, false).O.put(l10, Long.valueOf(System.currentTimeMillis()));
                    }
                    edit.apply();
                }
                org.telegram.messenger.ob obVar = new org.telegram.messenger.ob(i10, this.f53430c, activity, arrayList, hashMap, y10Var, h6Var);
                if (!di.y8.y(i10, false).f10051e) {
                    di.y8 y10 = di.y8.y(i10, false);
                    y10.f10051e = false;
                    y10.q(obVar, false, true);
                    y10.f10051e = true;
                    return;
                }
                obVar.run();
                return;
            default:
                Boolean bool = (Boolean) obj;
                String str2 = LaunchActivity.C1;
                TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                int i12 = this.f53429b;
                tL_messages_toggleBotInAttachMenu.bot = org.telegram.messenger.np.u1(i12).q1(this.f53430c);
                tL_messages_toggleBotInAttachMenu.enabled = true;
                tL_messages_toggleBotInAttachMenu.write_allowed = true;
                ConnectionsManager.getInstance(i12).sendRequest(tL_messages_toggleBotInAttachMenu, new org.telegram.messenger.hx((LaunchActivity) obj5, i12, (cx) obj4, (org.telegram.ui.ActionBar.g2) obj3, (TLRPC.User) obj2, (String) serializable), 66);
                return;
        }
    }

    public wp(rq rqVar, long j3, int i7, TLObject tLObject, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10) {
        this.d = rqVar;
        this.f53430c = j3;
        this.f53429b = i7;
        this.f53431e = tLObject;
        this.f53432f = tL_chatAdminRights;
        this.f53433g = tL_chatBannedRights;
        this.h = str;
    }

    public wp(LaunchActivity launchActivity, int i7, long j3, cx cxVar, org.telegram.ui.ActionBar.g2 g2Var, TLRPC.User user, String str) {
        this.d = launchActivity;
        this.f53429b = i7;
        this.f53430c = j3;
        this.f53431e = cxVar;
        this.f53432f = g2Var;
        this.f53433g = user;
        this.h = str;
    }
}
