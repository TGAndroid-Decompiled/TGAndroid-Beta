package org.telegram.ui;

import android.app.Activity;
import android.content.SharedPreferences;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class tp implements org.telegram.messenger.c20 {
    public final int f50116a = 1;
    public final int f50117b;
    public final long f50118c;
    public final Object d;
    public final Object f50119e;
    public final Object f50120f;
    public final Object f50121g;
    public final Serializable h;

    public tp(int i7, long j3, Activity activity, ArrayList arrayList, HashMap hashMap, org.telegram.messenger.c20 c20Var, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f50117b = i7;
        this.d = arrayList;
        this.f50118c = j3;
        this.f50119e = activity;
        this.f50120f = f6Var;
        this.f50121g = c20Var;
        this.h = hashMap;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f50116a;
        boolean z9 = false;
        Serializable serializable = this.h;
        Object obj2 = this.f50121g;
        Object obj3 = this.f50120f;
        Object obj4 = this.f50119e;
        Object obj5 = this.d;
        switch (i7) {
            case 0:
                oq oqVar = (oq) obj5;
                TLObject tLObject = (TLObject) obj4;
                TLRPC.TL_chatAdminRights tL_chatAdminRights = (TLRPC.TL_chatAdminRights) obj3;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = (TLRPC.TL_chatBannedRights) obj2;
                String str = (String) serializable;
                int intValue = ((Integer) obj).intValue();
                boolean[] zArr = new boolean[1];
                if ((tLObject instanceof TLRPC.TL_channelParticipantAdmin) || (tLObject instanceof TLRPC.TL_chatParticipantAdmin)) {
                    z9 = true;
                }
                long j3 = oqVar.M;
                TLRPC.TL_chatBannedRights tL_chatBannedRights2 = oqVar.D;
                long j10 = this.f50118c;
                wp wpVar = new wp(oqVar, j10, j3, tL_chatAdminRights, tL_chatBannedRights2, tL_chatBannedRights, str, intValue, zArr, j10);
                wpVar.X0 = new xp(oqVar, intValue, j10, this.f50117b, z9, zArr);
                oqVar.presentFragment(wpVar);
                return;
            case 1:
                ArrayList arrayList = (ArrayList) obj5;
                Activity activity = (Activity) obj4;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) obj3;
                org.telegram.messenger.c20 c20Var = (org.telegram.messenger.c20) obj2;
                HashMap hashMap = (HashMap) serializable;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                int i10 = this.f50117b;
                if (booleanValue) {
                    SharedPreferences.Editor edit = org.telegram.messenger.qp.s1(i10).f24759e7.edit();
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
                org.telegram.messenger.pb pbVar = new org.telegram.messenger.pb(i10, this.f50118c, activity, arrayList, hashMap, c20Var, f6Var);
                if (!bi.ea.y(i10, false).f3810e) {
                    bi.ea y10 = bi.ea.y(i10, false);
                    y10.f3810e = false;
                    y10.q(pbVar, false, true);
                    y10.f3810e = true;
                    return;
                }
                pbVar.run();
                return;
            default:
                Boolean bool = (Boolean) obj;
                String str2 = LaunchActivity.B1;
                TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                int i12 = this.f50117b;
                tL_messages_toggleBotInAttachMenu.bot = org.telegram.messenger.qp.s1(i12).o1(this.f50118c);
                tL_messages_toggleBotInAttachMenu.enabled = true;
                tL_messages_toggleBotInAttachMenu.write_allowed = true;
                ConnectionsManager.getInstance(i12).sendRequest(tL_messages_toggleBotInAttachMenu, new org.telegram.messenger.ox((LaunchActivity) obj5, i12, (ww) obj4, (org.telegram.ui.ActionBar.f2) obj3, (TLRPC.User) obj2, (String) serializable), 66);
                return;
        }
    }

    public tp(oq oqVar, long j3, int i7, TLObject tLObject, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z9) {
        this.d = oqVar;
        this.f50118c = j3;
        this.f50117b = i7;
        this.f50119e = tLObject;
        this.f50120f = tL_chatAdminRights;
        this.f50121g = tL_chatBannedRights;
        this.h = str;
    }

    public tp(LaunchActivity launchActivity, int i7, long j3, ww wwVar, org.telegram.ui.ActionBar.f2 f2Var, TLRPC.User user, String str) {
        this.d = launchActivity;
        this.f50117b = i7;
        this.f50118c = j3;
        this.f50119e = wwVar;
        this.f50120f = f2Var;
        this.f50121g = user;
        this.h = str;
    }
}
