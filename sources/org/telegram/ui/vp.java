package org.telegram.ui;

import android.app.Activity;
import android.content.SharedPreferences;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class vp implements org.telegram.messenger.c20 {
    public final int f50769a = 1;
    public final int f50770b;
    public final long f50771c;
    public final Object d;
    public final Object f50772e;
    public final Object f50773f;
    public final Object f50774g;
    public final Serializable h;

    public vp(int i7, long j3, Activity activity, ArrayList arrayList, HashMap hashMap, org.telegram.messenger.c20 c20Var, org.telegram.ui.ActionBar.h6 h6Var) {
        this.f50770b = i7;
        this.d = arrayList;
        this.f50771c = j3;
        this.f50772e = activity;
        this.f50773f = h6Var;
        this.f50774g = c20Var;
        this.h = hashMap;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f50769a;
        boolean z9 = false;
        Serializable serializable = this.h;
        Object obj2 = this.f50774g;
        Object obj3 = this.f50773f;
        Object obj4 = this.f50772e;
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
                    z9 = true;
                }
                long j3 = rqVar.M;
                TLRPC.TL_chatBannedRights tL_chatBannedRights2 = rqVar.D;
                long j10 = this.f50771c;
                yp ypVar = new yp(rqVar, j10, j3, tL_chatAdminRights, tL_chatBannedRights2, tL_chatBannedRights, str, intValue, zArr, j10);
                ypVar.X0 = new zp(rqVar, intValue, j10, this.f50770b, z9, zArr);
                rqVar.presentFragment(ypVar);
                return;
            case 1:
                ArrayList arrayList = (ArrayList) obj5;
                Activity activity = (Activity) obj4;
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) obj3;
                org.telegram.messenger.c20 c20Var = (org.telegram.messenger.c20) obj2;
                HashMap hashMap = (HashMap) serializable;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                int i10 = this.f50770b;
                if (booleanValue) {
                    SharedPreferences.Editor edit = org.telegram.messenger.qp.s1(i10).f24778e7.edit();
                    int size = arrayList.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj6 = arrayList.get(i11);
                        i11++;
                        Long l10 = (Long) obj6;
                        long longValue = l10.longValue();
                        long N1 = org.telegram.messenger.qp.s1(i10).N1(longValue);
                        if (N1 <= 0 && longValue > 0) {
                            N1 = org.telegram.messenger.m5.k(org.telegram.messenger.qp.s1(i10).J2(longValue));
                        }
                        edit.putLong(rf.b.h(longValue, "ask_paid_message_", "_price"), N1);
                        bi.ea.y(i10, false).O.put(l10, Long.valueOf(System.currentTimeMillis()));
                    }
                    edit.apply();
                }
                org.telegram.messenger.pb pbVar = new org.telegram.messenger.pb(i10, this.f50771c, activity, arrayList, hashMap, c20Var, h6Var);
                if (!bi.ea.y(i10, false).f3807e) {
                    bi.ea y10 = bi.ea.y(i10, false);
                    y10.f3807e = false;
                    y10.q(pbVar, false, true);
                    y10.f3807e = true;
                    return;
                }
                pbVar.run();
                return;
            default:
                Boolean bool = (Boolean) obj;
                String str2 = LaunchActivity.B1;
                TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                int i12 = this.f50770b;
                tL_messages_toggleBotInAttachMenu.bot = org.telegram.messenger.qp.s1(i12).o1(this.f50771c);
                tL_messages_toggleBotInAttachMenu.enabled = true;
                tL_messages_toggleBotInAttachMenu.write_allowed = true;
                ConnectionsManager.getInstance(i12).sendRequest(tL_messages_toggleBotInAttachMenu, new org.telegram.messenger.nx((LaunchActivity) obj5, i12, (zw) obj4, (org.telegram.ui.ActionBar.f2) obj3, (TLRPC.User) obj2, (String) serializable), 66);
                return;
        }
    }

    public vp(rq rqVar, long j3, int i7, TLObject tLObject, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z9) {
        this.d = rqVar;
        this.f50771c = j3;
        this.f50770b = i7;
        this.f50772e = tLObject;
        this.f50773f = tL_chatAdminRights;
        this.f50774g = tL_chatBannedRights;
        this.h = str;
    }

    public vp(LaunchActivity launchActivity, int i7, long j3, zw zwVar, org.telegram.ui.ActionBar.f2 f2Var, TLRPC.User user, String str) {
        this.d = launchActivity;
        this.f50770b = i7;
        this.f50771c = j3;
        this.f50772e = zwVar;
        this.f50773f = f2Var;
        this.f50774g = user;
        this.h = str;
    }
}
